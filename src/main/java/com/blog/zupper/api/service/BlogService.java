package com.blog.zupper.api.service;

import com.blog.zupper.api.domain.Blog;

import java.util.List;

public interface BlogService {

    Blog create(Blog blog);

    List<Blog> listAll();
}