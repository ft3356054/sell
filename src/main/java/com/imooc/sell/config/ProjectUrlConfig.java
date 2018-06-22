package com.imooc.sell.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Value;

/**
 * Created by 廖师兄
 * 2017-07-30 11:43
 */
@Data
//@ConfigurationProperties(prefix = "projectUrl")
@Component
public class ProjectUrlConfig {

    /**
     * 微信公众平台授权url
     */
    @Value("${projectUrl.wechatMpAuthorize}")
    public String wechatMpAuthorize;

    /**
     * 微信开放平台授权url
     */
    @Value("${projectUrl.wechatOpenAuthorize}")
    public String wechatOpenAuthorize;

    /**
     * 点餐系统
     */
    @Value("${projectUrl.sell}")
    public String sell;
}
