package com.test.dal;

import com.test.model.Blog;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author VipinK
 */
@Repository
public class BlogDALImpl implements BlogDAL {

    private static final Logger LOG = LoggerFactory.getLogger(BlogDALImpl.class);

    @Autowired
    private MongoTemplate mongoTemplate;

    private Map<String, Blog> blogStorage;

    @PostConstruct
    private void initialiseStorage(){
        blogStorage = new HashMap<>();
    }

    @Override
    public List<Blog> getBlogs() {

        List<Blog> blogs = new ArrayList<>();
        for(String id : blogStorage.keySet()){

            blogs.add(blogStorage.get(id));
        }
        return blogs;
    }

    @Override
    public Blog createBlog(Blog blog) {
        blogStorage.put(blog.getBlogId(), blog);
        return blog;
    }

    @Override
    public Blog getBlogById(String blogId) {
        return blogStorage.get(blogId);
    }

}