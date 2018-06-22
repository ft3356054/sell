package com.imooc.sell.config;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.Map;

/**
 * Created by 廖师兄
 * 2017-07-03 01:31
 */
@Data
@Component
//@ConfigurationProperties(prefix = "wechat")
public class WechatAccountConfig {

    /**
     * 公众平台id
     */
    @Value("${wechat.mpAppId}")
    private String mpAppId;

    /**
     * 公众平台密钥
     */
    @Value("${wechat.mpAppSecret}")
    private String mpAppSecret;

    /**
     * 开放平台id
     */
    @Value("${wechat.openAppId}")
    private String openAppId;

    /**
     * 开放平台密钥
     */
    @Value("${wechat.openAppSecret}")
    private String openAppSecret;

    /**
     * 商户号
     */
    @Value("${wechat.mchId}")
    private String mchId;

    /**
     * 商户密钥
     */
    @Value("${wechat.mchKey}")
    private String mchKey;

    /**
     * 商户证书路径
     */
    @Value("${wechat.keyPath}")
    private String keyPath;

    /**
     * 微信支付异步通知地址
     */
    @Value("${wechat.notifyUrl}")
    private String notifyUrl;

    /**
     * 微信模版id
     */
    @Value("${wechat.templateId.orderStatus}")
    private Map<String, String> templateId;
}
