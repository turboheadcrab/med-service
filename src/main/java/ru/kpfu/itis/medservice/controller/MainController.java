package ru.kpfu.itis.medservice.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Apraxin Vladimir on 28.4.18.
 */
@Controller
public class MainController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String mainpage() {
        return "index";
    }

    @RequestMapping(value = "/kek", method = RequestMethod.GET)
    public String keklol() {
        return "lol";
    }
}
