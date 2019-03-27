package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@Controller
public class HelloController {
    @RequestMapping(value="/mo")
    public  String sel(Model model){
        List<Kh> list = new ArrayList<Kh>();
            Kh k = new Kh(1,"a");
          Kh k1 = new Kh(2,"b");
            list.add(k);
            list.add(k1);
            model.addAttribute("list",list);
            model.addAttribute("list1","list2");
        return "hello";
    }
    @RequestMapping(value = "/index")
    public ModelAndView sel1(){
        ModelAndView view = new ModelAndView();

        view.addObject("hello1","h852");
        return  view;
    }
}
