package com.jwt.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.jwt.data.UserContext;
import org.springframework.security.core.Authentication;

@RestController
public class SecuredController {

    @RequestMapping({ "/secured" })
    @ResponseBody
    public UserContext securedEndpoint(Authentication authentication) {
        UserContext userContext = (UserContext) authentication.getPrincipal();
        return userContext;
    }
}