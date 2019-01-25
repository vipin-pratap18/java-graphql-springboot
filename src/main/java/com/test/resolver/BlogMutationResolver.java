package com.test.resolver;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.test.manager.BlogManager;
import com.test.model.Blog;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author : VipinK
 */
@Service
public class BlogMutationResolver implements GraphQLMutationResolver {

    @Autowired
    private BlogManager blogManager;

    public Blog createBlog(String blogTitle, String blogMessage){

        Blog blog = new Blog();
        blog.setBlogId(new ObjectId().toString());
        blog.setBlogTitle(blogTitle);
        blog.setBlogMessage(blogMessage);
        blogManager.createBlog(blog);
        return blog;

    }
}
