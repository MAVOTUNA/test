package hello.ajax.controller;

import hello.ajax.domain.MessageDTO;
import hello.ajax.domain.User;
import lombok.extern.slf4j.Slf4j;
import org.hibernate.validator.constraints.ModCheck;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import javax.swing.*;
import java.util.HashMap;
import java.util.Map;

@Controller
@Slf4j
@RequestMapping("/ajax")
public class ajaxController {

    @GetMapping("/")
    public String test1() {
        return "test1";
    }

//    @GetMapping("/test2")
//    public String test2(Model model) {
//        return "test2/index";
//    }


    @GetMapping("/test1")
    public String test1(HttpSession session , Model model) {
        User user = new User();
        user.setName("신동민");
        user.setAge(10);
        session.setAttribute("test" , user);
        return "template/test";
    }

    @GetMapping("/content1")
    public String content1(Model model) {
        User user = new User();
        user.setName("test1");
        user.setAge(10);
        model.addAttribute("user" ,user);
        return "template/content :: content1";
    }

    @GetMapping("/content2")
    public String content2(Model model) {
        log.info("test2");
        return "template/content :: content2";
    }



    @GetMapping("/template")
    public String helloTemplate(Model model) {

        User user = new User();

        user.setAge(10);
        user.setName("신동민");

        model.addAttribute("user", user);

        return "template/ajax";
    }

    @GetMapping("/hello")
    public String helloAjax(Model model) {
        model.addAttribute("dto", new MessageDTO());
        return "ajax";
    }

    @PostMapping("/hello")
    @ResponseBody
    public Map helloAjaxV2(String result , String result2 , Model model) {
        System.out.println("result = " + result);
        System.out.println("result2 = " + result2);
        Map <String , String > msg = new HashMap<>();
        msg.put("test2" ,"성공");
        msg.put("test1" ,"실패");
        return msg;

//        System.out.println("result2 = " + result2);
//
//        if(result.equals(result2)) {
//            model.addAttribute("msg","확인해주세요,");
//            return "ajax :: #resultDiv";
//        }
//
//        model.addAttribute("msg","사용가능,");
//            return "ajax :: #resultDiv";
//        System.out.println("result = " + result);
    }
}
