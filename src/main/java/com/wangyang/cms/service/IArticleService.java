package com.wangyang.cms.service;

import com.wangyang.cms.pojo.entity.Article;
import com.wangyang.cms.pojo.params.ArticleParams;
import com.wangyang.cms.pojo.vo.ArticleVO;
import org.springframework.stereotype.Service;

import java.util.Set;


public interface IArticleService {
    ArticleVO createOrUpdateArticle(Article article, Set<Integer> tagsIds, Set<Integer> categoryIds);
    String createOrUpdateArticleAndHtml(Article article, Set<Integer> tagsIds,Set<Integer> categoryIds);
    ArticleVO findArticleById(int id);

    String staticArticleById(int id);
}
