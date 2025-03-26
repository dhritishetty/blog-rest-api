package com.dhrithi.blog.rest.api.repository;

import com.dhrithi.blog.rest.api.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Long> {
}
