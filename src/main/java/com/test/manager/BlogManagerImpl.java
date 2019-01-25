package com.test.manager;

import com.test.dal.BlogDAL;
import com.test.model.Blog;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author : VipinK
 */
@Service
public class BlogManagerImpl implements BlogManager {

    private static final Logger LOG = LoggerFactory.getLogger(BlogManagerImpl.class);

    @Autowired
    private BlogDAL blogDAL;

    @Override
    public List<Blog> getBlogs() {
        List<Blog> blogs = blogDAL.getBlogs();
        return blogs;
    }

    @Override
    public Blog createBlog(Blog blog) {
        return blogDAL.createBlog(blog);
    }

    @Override
    public Blog getBlogById(String blogId) {
        return blogDAL.getBlogById(blogId);
    }

}
