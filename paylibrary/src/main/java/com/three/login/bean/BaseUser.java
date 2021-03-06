package com.three.login.bean;

/**
 * Created by onetouch on 2017/11/21.
 */

public class BaseUser {

    /**
     * sex
     * 0. 未知
     * 1. 男
     * 2. 女
     */


    private String unionid;

    private String openId;

    private String nickname;

    private int sex;

    private String headImageUrl;

    private String headImageUrlLarge;

    public String getOpenId() {
        return openId;
    }

    public void setOpenId(String openId) {
        this.openId = openId;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public String getHeadImageUrl() {
        return headImageUrl;
    }

    public void setHeadImageUrl(String headImageUrl) {
        this.headImageUrl = headImageUrl;
    }

    public String getHeadImageUrlLarge() {
        return headImageUrlLarge;
    }

    public void setHeadImageUrlLarge(String headImageUrlLarge) {
        this.headImageUrlLarge = headImageUrlLarge;
    }

    public String getUnionid() {
        return unionid;
    }

    public void setUnionid(String unionid) {
        this.unionid = unionid;
    }

    @Override
    public String toString() {
        return "BaseUser{" + "openId='" + openId + '\'' + ", nickname='" + nickname + '\'' + ", sex=" + sex + ", headImageUrl='" + headImageUrl + '\'' + ", headImageUrlLarge='" + headImageUrlLarge + '\'' + '}';
    }
}
