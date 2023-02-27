package com.cg.none_di.controller;

import com.cg.none_di.service.FacebookService;
import com.cg.none_di.service.SmsService;

public class HomeController {

//    private SmsService smsService = null;
    private FacebookService facebookService = null;

    public HomeController() {
        facebookService = new FacebookService();
    }

    public void send() {
        facebookService.sendMessage();
    }
}
