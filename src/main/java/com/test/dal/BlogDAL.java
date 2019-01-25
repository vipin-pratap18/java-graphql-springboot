package com.test.dal;

import com.test.model.Blog;

import java.util.List;

/**
 * @author VipinK
 *
 */
public interface BlogDAL {

    List<Blog> getBlogs();

    Blog createBlog(Blog blog);

    Blog getBlogById(String blogId);
}
