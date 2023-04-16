package com.aris.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author : Pallas
 * @project : demo
 * @created on : 16-April-2023
 * @email : talehji@gmail.com
 */

@Controller
public class IndexController {


    @GetMapping("/")
    public String index(){


        return "index";
    }

}
