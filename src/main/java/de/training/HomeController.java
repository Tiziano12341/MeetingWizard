package de.training;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

    private final EmployeeService employee;

    public HomeController(@Qualifier("employeeService") EmployeeService employee){
        this.employee = employee;
    }

    @GetMapping("/")
    public ModelAndView index() {
        return new ModelAndView("index");
    }

    //EMployeeservice wenn 2 eingibst kommt 2 raus
}
