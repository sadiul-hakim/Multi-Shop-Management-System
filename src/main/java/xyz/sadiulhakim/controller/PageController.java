package xyz.sadiulhakim.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PageController {
    @GetMapping("/")
    public ModelAndView home(ModelAndView modelAndView) {
        modelAndView.setViewName("index");
        return modelAndView;
    }

    @GetMapping("/shop")
    public ModelAndView shop(ModelAndView modelAndView) {
        modelAndView.setViewName("shop");
        return modelAndView;
    }

    @GetMapping("/user")
    public ModelAndView user(ModelAndView modelAndView) {
        modelAndView.setViewName("user");
        return modelAndView;
    }

    @GetMapping("/role")
    public ModelAndView role(ModelAndView modelAndView) {
        modelAndView.setViewName("role");
        return modelAndView;
    }

    @GetMapping("/salary")
    public ModelAndView salary(ModelAndView modelAndView) {
        modelAndView.setViewName("salary");
        return modelAndView;
    }

    @GetMapping("/model_category")
    public ModelAndView model_category(ModelAndView modelAndView) {
        modelAndView.setViewName("model_category");
        return modelAndView;
    }

    @GetMapping("/product_model")
    public ModelAndView product_model(ModelAndView modelAndView) {
        modelAndView.setViewName("product_model");
        return modelAndView;
    }

    @GetMapping("/trade")
    public ModelAndView trade(ModelAndView modelAndView) {
        modelAndView.setViewName("trade");
        return modelAndView;
    }

    @GetMapping("/cost_type")
    public ModelAndView cost_type(ModelAndView modelAndView) {
        modelAndView.setViewName("cost_type");
        return modelAndView;
    }

    @GetMapping("/cost")
    public ModelAndView cost(ModelAndView modelAndView) {
        modelAndView.setViewName("cost");
        return modelAndView;
    }

    @GetMapping("/mail")
    public ModelAndView mail(ModelAndView modelAndView) {
        modelAndView.setViewName("mail");
        return modelAndView;
    }

    @GetMapping("/loginPage")
    public ModelAndView loginPage(ModelAndView modelAndView) {
        modelAndView.setViewName("loginPage");
        return modelAndView;
    }
}
