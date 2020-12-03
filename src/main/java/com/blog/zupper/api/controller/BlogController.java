package com.blog.zupper.api.controller;

import com.blog.zupper.api.domain.Blog;
import com.blog.zupper.api.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class BlogController {

    @Autowired
    private BlogService service;

    @PostMapping("/blog")
    @ResponseStatus(HttpStatus.CREATED)
    public Blog create(@RequestBody Blog contact) {
        return service.create(contact);
    }

    @GetMapping("/blogs")
    public List<Blog> listAll() {
        return service.listAll();
    }
}