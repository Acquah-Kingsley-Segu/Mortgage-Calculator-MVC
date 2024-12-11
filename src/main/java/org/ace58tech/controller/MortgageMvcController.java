package org.ace58tech.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/mortgage")
public class MortgageMvcController {
    @GetMapping("")
    public String mortgage() {
        return "mortgage-repayment-calculator.ftl";
    }
}
