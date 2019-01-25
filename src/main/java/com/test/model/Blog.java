package com.test.model;

import java.io.Serializable;
import java.util.Objects;

/**
 * @author : VipinK
 */

public class Blog implements Serializable {

	private static final long serialVersionUID = 4669633906961431644L;
	private String blogId;
	private String blogTitle;
	private String blogMessage;
	private String author;
	private int likes;


	public String getBlogId() {
		return blogId;
	}

	public void setBlogId(String blogId) {
		this.blogId = blogId;
	}

	public String getBlogTitle() {
		return blogTitle;
	}

	public void setBlogTitle(String blogTitle) {
		this.blogTitle = blogTitle;
	}

	public String getBlogMessage() {
		return blogMessage;
	}

	public void setBlogMessage(String blogMessage) {
		this.blogMessage = blogMessage;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getLikes() {
		return likes;
	}

	public void setLikes(int likes) {
		this.likes = likes;
	}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Blog blog = (Blog) o;
        return likes == blog.likes &&
                Objects.equals(blogId, blog.blogId) &&
                Objects.equals(blogTitle, blog.blogTitle) &&
                Objects.equals(blogMessage, blog.blogMessage) &&
                Objects.equals(author, blog.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(blogId, blogTitle, blogMessage, author, likes);
    }
}
