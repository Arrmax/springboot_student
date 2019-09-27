package com.qf.conterller;

import com.qf.entity.Student;
import com.qf.service.IStuservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * 学生查询
 */
@Controller
@RequestMapping("/stu")
public class stuconterller {

    @Autowired
    private IStuservice stuservice;

  @RequestMapping("list")
    public String list(Model model){
      List<Student> stulist = stuservice.list();
      model.addAttribute("stulist",stulist);
        return "show";
    }
}
