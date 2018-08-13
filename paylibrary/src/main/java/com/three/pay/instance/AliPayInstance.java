package com.three.pay.instance;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;
import android.widget.Toast;

import com.alipay.sdk.app.PayTask;
import com.three.pay.aliutils.AuthResult;
import com.three.pay.aliutils.PayResult;
import com.three.pay.bean.PayInfo;
import com.three.pay.listener.PayListener;

import java.util.Map;

/**
 * Created by onetouch on 2017/11/22.
 */

public class AliPayInstance extends PayInstance {
    private PayListener mPayListener;
    private Activity activity;
    private static final int SDK_PAY_FLAG = 1;
    private static final int SDK_AUTH_FLAG = 2;

    public AliPayInstance(Activity activity, PayInfo payInfo,PayListener listener) {
        mPayListener = listener;
    }


    @Override
    public void doPay(final Activity activity, PayListener listener, final PayInfo info) {
        this.activity = activity;
        this.mPayListener = listener;
        Runnable payRunnable = new Runnable() {
            @Override
            public void run() {
                PayTask alipay = new PayTask(activity);
                Map<String, String> result = alipay.payV2(info.getSign(), true);
                Message msg = new Message();
                msg.what = SDK_PAY_FLAG;
                msg.obj = result;
                alipayHandler.sendMessage(msg);
            }
        };
        Thread payThread = new Thread(payRunnable);
        payThread.start();
    }

    @Override
    public void handleResult(int requestCode, int resultCode, Intent data) {

    }

    @Override
    public boolean isInstall(Context context) {
        return false;
    }



    @SuppressLint("HandlerLeak")
    private Handler alipayHandler = new Handler() {
        @SuppressWarnings("unused")
        public void handleMessage(Message msg) {
            switch (msg.what) {
                case SDK_PAY_FLAG: {
                    @SuppressWarnings("unchecked")
                    PayResult payResult = new PayResult((Map<String, String>) msg.obj);
                    /**
                     对于支付结果，请商户依赖服务端的异步通知结果。同步通知结果，仅作为支付结束的通知。
                     */
                    String resultInfo = payResult.getResult();// 同步返回需要验证的信息
                    String resultStatus = payResult.getResultStatus();
                    // 判断resultStatus 为9000则代表支付成功
                    if (TextUtils.equals(resultStatus, "9000")) {
                        // 该笔订单是否真实支付成功，需要依赖服务端的异步通知。
                        //Toast.makeText(activity, "支付成功", Toast.LENGTH_SHORT).show();
                        if (mPayListener!=null){
                            mPayListener.paySuccess();
                        }
                    } else {
                        // 该笔订单真实的支付结果，需要依赖服务端的异步通知。
                        //Toast.makeText(activity, "支付失败", Toast.LENGTH_SHORT).show();
                        if (mPayListener!=null){
                            mPayListener.payFailure(new Exception("支付失败"));
                        }
                    }
                    break;
                }
                case SDK_AUTH_FLAG: {
                    @SuppressWarnings("unchecked")
                    AuthResult authResult = new AuthResult((Map<String, String>) msg.obj, true);
                    String resultStatus = authResult.getResultStatus();
                    // 判断resultStatus 为“9000”且result_code
                    // 为“200”则代表授权成功，具体状态码代表含义可参考授权接口文档
                    if (TextUtils.equals(resultStatus, "9000") && TextUtils.equals(authResult.getResultCode(), "200")) {
                        // 获取alipay_open_id，调支付时作为参数extern_token 的value
                        // 传入，则支付账户为该授权账户
                        Toast.makeText(activity,
                                "授权成功\n" + String.format("authCode:%s", authResult.getAuthCode()), Toast.LENGTH_SHORT)
                                .show();
                    } else {
                        // 其他状态值则为授权失败
                        Toast.makeText(activity,
                                "授权失败" + String.format("authCode:%s", authResult.getAuthCode()), Toast.LENGTH_SHORT).show();
                    }
                    break;
                }
                default:
                    break;
            }
        }
    };

}
