package com.example.administrator.mylibrary;

/**
 * Created by Administrator on 2018/4/17.
 */

public class AlipayBean {


    /**
     * success : 1
     * msg : 成功
     * data : {"param":"app_id=2018022402264996&biz_content=%7B%22body%22%3A%22%E4%BA%A4%E6%98%93%E6%8F%8F%E8%BF%B0%22%2C%22subject%22%3A%22%E4%B8%80%E9%94%AE%E7%A7%80%E6%B5%8B%E8%AF%95%E8%AE%A2%E5%8D%95%22%2C%22out_trade_no%22%3A%221523948378670%22%2C%22timeout_express%22%3A%221h%22%2C%22total_amount%22%3A%220.01%22%2C%22product_code%22%3A%22QUICK_MSECURITY_PAY%22%2C%22goods_type%22%3A%220%22%7D&charset=utf-8&format=JSON&method=alipay.trade.app.pay&notify_url=http%3A%2F%2Fwww.yijianxiu.com%2F&sign_type=RSA2&timestamp=2018-04-17%2014%3A59%3A38&version=1.0&sign=YzMruVu1%2BnDru9%2B83hOLkn%2Bp%2FOI27cI2lXxBfjEJGQuU0mdCCXvIUy4pMn5c3Lm4es7Iibows2hZSVvgO%2BsvgTMpE1iznyhojRSovq9zDF3ssq4Wzhi2DnTNaU2%2BwfwCN5fFhv39oJpeMEYpjcs16cRSpP6twEFNlUSzywqxMN%2FYGUlodQKwl58Khs5UKAAeW7sWlwpaPEWRxeaoHsYHrOi%2FSkYNN9h5ndC7kEC7iz6WFy0KAcpSlNWHgAapcpfMTIfOr0wHql9Hye2BIP%2Fze8jkxZoaFsf%2Bz7stAw%2Fb8w8NFKFm0jrYu9FRhc9vz4GdYhUDFwzLVF1MTCfgAWpJMA%3D%3D"}
     */

    private int success;
    private String msg;
    private DataBean data;
    public static String appId="2018022402264996&biz_content=%7B%22body%22%3A%22%E4%BA%A4%E6%98%93%E6%8F%8F%E8%BF%B0%22%2C%22subject%22%3A%22%E4%B8%80%E9%94%AE%E7%A7%80%E6%B5%8B%E8%AF%95%E8%AE%A2%E5%8D%95%22%2C%22out_trade_no%22%3A%221523948378670%22%2C%22timeout_express%22%3A%221h%22%2C%22total_amount%22%3A%220.01%22%2C%22product_code%22%3A%22QUICK_MSECURITY_PAY%22%2C%22goods_type%22%3A%220%22%7D&charset=utf-8&format=JSON&method=alipay.trade.app.pay&notify_url=http%3A%2F%2Fwww.yijianxiu.com%2F&sign_type=RSA2&timestamp=2018-04-17%2014%3A59%3A38&version=1.0&sign=YzMruVu1%2BnDru9%2B83hOLkn%2Bp%2FOI27cI2lXxBfjEJGQuU0mdCCXvIUy4pMn5c3Lm4es7Iibows2hZSVvgO%2BsvgTMpE1iznyhojRSovq9zDF3ssq4Wzhi2DnTNaU2%2BwfwCN5fFhv39oJpeMEYpjcs16cRSpP6twEFNlUSzywqxMN%2FYGUlodQKwl58Khs5UKAAeW7sWlwpaPEWRxeaoHsYHrOi%2FSkYNN9h5ndC7kEC7iz6WFy0KAcpSlNWHgAapcpfMTIfOr0wHql9Hye2BIP%2Fze8jkxZoaFsf%2Bz7stAw%2Fb8w8NFKFm0jrYu9FRhc9vz4GdYhUDFwzLVF1MTCfgAWpJMA%3D%3D";

    public int getSuccess() {
        return success;
    }

    public void setSuccess(int success) {
        this.success = success;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public static class DataBean {
        /**
         * param : app_id=2018022402264996&biz_content=%7B%22body%22%3A%22%E4%BA%A4%E6%98%93%E6%8F%8F%E8%BF%B0%22%2C%22subject%22%3A%22%E4%B8%80%E9%94%AE%E7%A7%80%E6%B5%8B%E8%AF%95%E8%AE%A2%E5%8D%95%22%2C%22out_trade_no%22%3A%221523948378670%22%2C%22timeout_express%22%3A%221h%22%2C%22total_amount%22%3A%220.01%22%2C%22product_code%22%3A%22QUICK_MSECURITY_PAY%22%2C%22goods_type%22%3A%220%22%7D&charset=utf-8&format=JSON&method=alipay.trade.app.pay&notify_url=http%3A%2F%2Fwww.yijianxiu.com%2F&sign_type=RSA2&timestamp=2018-04-17%2014%3A59%3A38&version=1.0&sign=YzMruVu1%2BnDru9%2B83hOLkn%2Bp%2FOI27cI2lXxBfjEJGQuU0mdCCXvIUy4pMn5c3Lm4es7Iibows2hZSVvgO%2BsvgTMpE1iznyhojRSovq9zDF3ssq4Wzhi2DnTNaU2%2BwfwCN5fFhv39oJpeMEYpjcs16cRSpP6twEFNlUSzywqxMN%2FYGUlodQKwl58Khs5UKAAeW7sWlwpaPEWRxeaoHsYHrOi%2FSkYNN9h5ndC7kEC7iz6WFy0KAcpSlNWHgAapcpfMTIfOr0wHql9Hye2BIP%2Fze8jkxZoaFsf%2Bz7stAw%2Fb8w8NFKFm0jrYu9FRhc9vz4GdYhUDFwzLVF1MTCfgAWpJMA%3D%3D
         */

        private String param;

        public String getParam() {
            return appId;
        }

        public void setParam(String param) {
            this.param = param;
        }
    }
}
