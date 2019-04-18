package org.fresh.gd.unification.controller;


import lombok.extern.slf4j.Slf4j;
import org.fresh.gd.commons.consts.pojo.ResponseData;
import org.fresh.gd.commons.consts.pojo.dto.oauth.AuthSysOrganizationDTO;
import org.fresh.gd.commons.consts.pojo.dto.oauth.AuthSysUserDTO;
import org.fresh.gd.commons.consts.utils.AuthPrincipalUtils;

import org.fresh.gd.unification.fegin.shoping.ShopingFeginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.Authentication;
import org.springframework.security.oauth2.provider.OAuth2Authentication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;
import java.util.Date;

/**
 * @DATA 2019-04-12 10:01
 * @Author 张国伟  WeChat:17630376104
 * @Description 用户
 */
@Slf4j
@RestController
@RequestMapping("/unification")
public class UserController {

    @Autowired
    ShopingFeginService shopingFeginService;

    @RequestMapping("/shop")
    public String shop(){
        return shopingFeginService.shop();
    }


    @RequestMapping("/userinfo")
    public ResponseData<Object> userinfo(Authentication authentication) {
        AuthSysUserDTO authSysUserDTO = AuthPrincipalUtils.parseUserinfo(authentication);
        ResponseData<Object> responseData = new ResponseData<>();
        responseData.setData(authSysUserDTO);
        return responseData;
    }

    @RequestMapping("/pro")
    public ResponseData<Object> pro(Principal authentication) {
        ResponseData<Object> responseData = new ResponseData<>();
        responseData.setData(authentication);
        return responseData;
    }


    @PreAuthorize("hasRole('USER')")
    @RequestMapping("/sq")
    public String sq() {
        return "sq";
    }

    @RequestMapping("/getPrinciple")
    public Object getPrinciple(OAuth2Authentication oAuth2Authentication,
                               Principal principal, Authentication authentication) {
//        log.info(oAuth2Authentication.getUserAuthentication().getAuthorities().toString());
//        log.info(oAuth2Authentication.toString());
//        log.info("--------------------" + authentication.getDetails().toString());
//        log.info("principal.toString()" + principal.toString());
//        log.info("principal.getName()" + principal.getName());
//        log.info("authentication" + authentication.toString());
        return principal.getName();
    }

}
