package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.text.DecimalFormat;

@Controller
public class ConverterController {
    @GetMapping("/converter")
    public String viewForm() {
        return "index";
    }

    @PostMapping("/converting")
    //Thay vì để controller trả về view qua kết quả return String, và trả về model qua tham chiếu Model, sử dụng api ModelAndView để mã dễ đọc
    public ModelAndView convert(@RequestParam String usd,String vnd, String rate){
        ModelAndView mAv = new ModelAndView("submit");
        float resultToVND = Float.parseFloat(usd) * Float.parseFloat(rate);
        mAv.addObject("toVND", resultToVND);
        float resultToUSD = Float.parseFloat(vnd) / Float.parseFloat(rate);

        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        float formatToUSD = Float.parseFloat(decimalFormat.format(resultToUSD));

        mAv.addObject("toUSD", formatToUSD);
        return mAv;
    }
//    public String convert(@RequestParam String usd, String vnd, String rate, Model model) {
//        float resultToVND = Float.parseFloat(usd) * Float.parseFloat(rate);
//        model.addAttribute("toVND", resultToVND);
//        float resultToUSD = Float.parseFloat(vnd) / Float.parseFloat(rate);
//        //Dinh dang ket qua ra 2 chu so thap phan
//        DecimalFormat decimalFormat = new DecimalFormat("#.##");
//        float formatToUSD = Float.parseFloat(decimalFormat.format(resultToUSD));
//
//        model.addAttribute("toUSD", formatToUSD);
////        tra lai trang result.jsp voi gia tri bien toVND la result
//        return "submit";
//    }
}
