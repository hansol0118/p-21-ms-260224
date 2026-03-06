package com.back.jsb2.global;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {

    @GetMapping("/jsb")
    @ResponseBody
    public String index() {
        return "안녕하세요 jsb에 오신것을 환영합니다.";
    }

    @GetMapping("/")
    public String root() {
        return "redirect:/question/list";
    }
}