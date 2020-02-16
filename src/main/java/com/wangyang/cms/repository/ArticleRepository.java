package com.wangyang.cms.repository;

import com.wangyang.cms.pojo.entity.Article;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArticleRepository extends JpaRepository<Article,Integer> {

}
