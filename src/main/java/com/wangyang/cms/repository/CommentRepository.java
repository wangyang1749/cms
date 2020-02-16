package com.wangyang.cms.repository;

import com.wangyang.cms.pojo.entity.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepository extends JpaRepository<Comment,Integer> {
}
