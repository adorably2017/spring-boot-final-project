package com.consumer1.webmvc1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;


import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Controller
public class MVCController {

    @Autowired
    RestTemplate rt;
    static final String url="http://localhost:8080/api/v1/employees";

    @GetMapping("/home")
    public ModelAndView processHome()
    {
        ModelAndView mv=new ModelAndView();
        mv.setViewName("home");
        return mv;
    }
    @RequestMapping("/try")
    public ModelAndView processTry()
    {
        ModelAndView mv=new ModelAndView();
        mv.setViewName("try");
        return mv;
    }

    @GetMapping("/showAll")
    public ModelAndView processFetchAll()
    {
        List<Employee> obj=Arrays.asList(rt.getForObject(url, Employee[].class));
        ModelAndView mv=new ModelAndView();
        mv.addObject("employeeList", obj);
        mv.setViewName("show");
        return mv;
    }
    @GetMapping("/showOne")
    public ModelAndView processFetchOne()
    {
        List<Employee> obj=Arrays.asList(rt.getForObject(url, Employee[].class));
        ModelAndView mv=new ModelAndView();
        mv.addObject("employeeList", obj);
        mv.setViewName("employeeDetails");
        return mv;
    }
    @PostMapping("/create")
    public ModelAndView processInsertTrainee(@ModelAttribute Employee e)
    {
        System.out.println("Insert an Employee");
        Employee obj=rt.postForObject(url,e, Employee.class);
        e.setEmployeeId(obj.getEmployeeId());
        ModelAndView mv=new ModelAndView();
        mv.addObject("employee", obj);
        mv.setViewName("success");
        return mv;
    }
    @PutMapping("/update")
    public ModelAndView processUpdate(@ModelAttribute Employee e){
        System.out.println("Update an Employee");
        Integer id = e.getEmployeeId();
        Employee objTemp= null;
        objTemp = rt.getForObject(url + '/' + id.toString(), Employee.class);
        objTemp.setEmployeeId(e.getEmployeeId());
        objTemp.setEmployeeName(e.getEmployeeName());
        objTemp.setEmployeeAge(e.getEmployeeAge());
        objTemp.setEmployeeSalary(e.getEmployeeSalary());
        objTemp.setEmployeeDepartment(e.getEmployeeDepartment());
        rt.put(url, objTemp);
        ModelAndView mv=new ModelAndView();
        mv.addObject("employee", objTemp);
        mv.setViewName("success");
        return mv;
    }
    @DeleteMapping("/delete/")
    public ModelAndView procesDelete(@RequestParam("id") Integer id){
        System.out.println("Delete an Employee");
        rt.delete(url + '/' + id.toString());
        ModelAndView mv=new ModelAndView();
        mv.setViewName("success");
        return mv;
    }

}