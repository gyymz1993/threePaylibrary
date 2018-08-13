package com.example.administrator.mylibrary;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.three.pay.PayPlatform;
import com.three.pay.ThirdPayUtils;
import com.three.pay.bean.PayInfo;
import com.three.pay.listener.PayListener;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button= findViewById(R.id.pay);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PayInfo payInfo = new PayInfo();
                payInfo.setOrderNo(AlipayBean.appId);
                payInfo.setPrepayId(AlipayBean.appId);
                ThirdPayUtils.initialize(MainActivity.this).pay(PayPlatform.WxPay, payInfo, new PayListener() {
                    @Override
                    public void paySuccess() {

                    }

                    @Override
                    public void payFailure(Exception e) {
                    }

                    @Override
                    public void userCancel() {

                    }
                });
            }
        });
    }
}
