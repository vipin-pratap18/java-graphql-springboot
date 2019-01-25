package com.test.resolver;

import com.coxautodev.graphql.tools.GraphQLSubscriptionResolver;
import com.test.manager.BlogManager;
import com.test.model.Blog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author : VipinK
 */
@Service
public class BlogSubscriptionResolver implements GraphQLSubscriptionResolver {

    @Autowired
    private BlogManager blogManager;

    //Not Implemented
    public Blog newBlog(){
        return new Blog();
    }
}
