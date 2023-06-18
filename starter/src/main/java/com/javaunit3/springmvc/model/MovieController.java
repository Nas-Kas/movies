package com.javaunit3.springmvc.model;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

public class MovieController {
    @Autowired
    private SessionFactory sessionFactory;

    @RequestMapping("/addMovieForm")
    public String addMovieForm() {
        return "addMovie";
    }
}
