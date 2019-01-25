package com.test.manager;

import com.test.model.Blog;

import java.util.List;

/**
* @author : VipinK
*/

public interface BlogManager {

	List<Blog> getBlogs();

	Blog createBlog(Blog blog);

    Blog getBlogById(String blogId);
}