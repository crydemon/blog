package com.wq.lrm.web;

import com.wq.lrm.NotFindException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {
    @GetMapping("/")
    public String index() {
       // int i = 9/0;
        String blog = null;
        if(blog == null) {
            throw  new NotFindException("blog not find");
        }
        return "index";
    }
}
