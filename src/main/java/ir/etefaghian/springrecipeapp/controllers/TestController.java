package ir.etefaghian.springrecipeapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {

    @RequestMapping(value = "test/index.html", method = RequestMethod.GET)
    public String testController(Model model)
    {
        model.addAttribute(new Student());
        return "test/index";
    }


    @RequestMapping(value = "test/index.html", method = RequestMethod.POST)
    @ResponseBody
    public Student testController1(@ModelAttribute(name = "student") Student student)
    {
        System.out.println(student);

        return student;
    }



}
