package com.test.resolver;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.test.manager.BlogManager;
import com.test.model.Blog;
import org.bson.types.ObjectId;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author VipinK
 *
 */
@Service
public class BlogQueryResolver implements GraphQLQueryResolver {

	private static final Logger LOG = LoggerFactory.getLogger(BlogQueryResolver.class);
	@Autowired
	private BlogManager blogManager;


	public List<Blog> blogs() {
		return blogManager.getBlogs();
	}

    public Blog blog(String blogId) {
        return blogManager.getBlogById(blogId);
    }


}
