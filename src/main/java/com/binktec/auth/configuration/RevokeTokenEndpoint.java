package com.binktec.auth.configuration;

import org.springframework.http.HttpStatus;
import org.springframework.security.oauth2.provider.endpoint.FrameworkEndpoint;
import org.springframework.security.oauth2.provider.token.ConsumerTokenServices;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

@RestController
public class RevokeTokenEndpoint {

    @Resource(name = "tokenServices")
    private
    ConsumerTokenServices tokenServices;

    @RequestMapping(method = RequestMethod.DELETE, value = "/oauth/revoke")
    @ResponseStatus(HttpStatus.OK)
    public void revokeToken(HttpServletRequest request) {
        String authorization = request.getHeader("Authorization");
        if (authorization != null && authorization.contains("Bearer")) {
            String tokenId = authorization.substring("Bearer".length() + 1);
            tokenServices.revokeToken(tokenId);
        }
    }
}
