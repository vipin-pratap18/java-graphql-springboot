package com.test.model;

import java.io.Serializable;

/**
 * @author : VipinK
 */
public class BlogIdObj implements Serializable {
    private String blogId;

    public String getBlogId() {
        return blogId;
    }

    public void setBlogId(String blogId) {
        this.blogId = blogId;
    }
}
