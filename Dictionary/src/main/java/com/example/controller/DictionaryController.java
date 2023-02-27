package com.example.controller;

import com.example.service.DictionaryManagement;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.Map;

@Controller
public class DictionaryController {

    @GetMapping ("/home")
    public String viewForm(){
        return "index";
    }
    @PostMapping("/home")
    public ModelAndView toTranslate(@RequestParam String english){
        ModelAndView mAv = new ModelAndView("index");
        Map<String,String> dic = new HashMap<>();
        dic.put("table","bàn");
        dic.put("air","không khí");
        dic.put("plane","máy bay");
        dic.put("boat","thuyền");
        String vietnamese = dic.get(english);
        mAv.addObject("vietnamese",vietnamese);
        return mAv;
    }
}
