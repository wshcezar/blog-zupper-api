package com.blog.zupper.api.service.impl;

import com.blog.zupper.api.domain.Blog;
import com.blog.zupper.api.service.BlogService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collectors;

@Service
public class BlogServiceImpl implements BlogService {

    private static final Map<String, Blog> map = new ConcurrentHashMap<>();

    @Override
    public Blog create(Blog blog) {
        map.put(blog.getName(), blog);
        return blog;
    }

    @Override
    public List<Blog> listAll() {
        return map.values().stream().collect(Collectors.toList());
    }
}