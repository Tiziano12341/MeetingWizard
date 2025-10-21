package de.training;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class MeetingController {
    private final MeetingService meeting;

    public MeetingController(MeetingService meeting){
        this.meeting = meeting;
    }

    @GetMapping("/")
    public ModelAndView index() {
        return new ModelAndView("index");
    }
}
