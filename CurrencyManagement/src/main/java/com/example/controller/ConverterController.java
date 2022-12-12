package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.text.DecimalFormat;

@Controller
public class ConverterController {
    @GetMapping("/converter")
    public String viewForm() {
        return "index";
//        return trang jsp
    }

    @PostMapping("/converting")
    public String convert(@RequestParam String usd, String vnd, String rate, Model model) {
        float resultToVND = Float.parseFloat(usd) * Float.parseFloat(rate);
        model.addAttribute("toVND", resultToVND);
        float resultToUSD = Float.parseFloat(vnd) / Float.parseFloat(rate);
        //Dinh dang ket qua ra 2 chu so thap phan
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        float formatToUSD = Float.parseFloat(decimalFormat.format(resultToUSD));

        model.addAttribute("toUSD", formatToUSD);
//        tra lai trang result.jsp voi gia tri bien toVND la result
        return "submit";
    }
}
