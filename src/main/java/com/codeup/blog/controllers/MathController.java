package com.codeup.blog.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MathController {
    @RequestMapping("/add/{firstNumber}/and/{secondNumber}")
    @ResponseBody

    public int add(@PathVariable int firstNumber, @PathVariable int secondNumber){
        return firstNumber + secondNumber;
    }

    @RequestMapping("/subtract/{firstNumber}/from/{secondNumber}")
    @ResponseBody
    public int subtract(@PathVariable int firstNumber, @PathVariable int secondNumber){
        return (secondNumber - firstNumber);
    }

    @RequestMapping("/multiply/{firstNumber}/and/{secondNumber}")
    @ResponseBody
    public int multiply(@PathVariable int firstNumber, @PathVariable int secondNumber){
        return firstNumber * secondNumber;
    }

    @RequestMapping("/divide/{firstNumber}/by/{secondNumber}")
    @ResponseBody
    public double divide(@PathVariable double firstNumber, @PathVariable double secondNumber){
        return firstNumber / secondNumber;
    }
}
