package com.project.blogapplication.persistence.repository;


import com.project.blogapplication.persistence.models.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Long> {
}
