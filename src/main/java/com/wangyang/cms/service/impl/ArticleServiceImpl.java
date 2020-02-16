package com.wangyang.cms.service.impl;

import com.wangyang.cms.pojo.entity.Article;
import com.wangyang.cms.pojo.entity.ArticleTags;
import com.wangyang.cms.pojo.entity.Tags;
import com.wangyang.cms.pojo.entity.Template;
import com.wangyang.cms.pojo.vo.ArticleVO;
import com.wangyang.cms.repository.ArticleRepository;
import com.wangyang.cms.repository.CategoryRepository;
import com.wangyang.cms.repository.TagsRepository;
import com.wangyang.cms.repository.TemplateRepository;
import com.wangyang.cms.service.IArticleService;
import com.wangyang.cms.utils.TemplateUtil;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Service
public class ArticleServiceImpl implements IArticleService {

    @Autowired
    ArticleRepository articleRepository;
    @Autowired
    TemplateRepository templateRepository;
    @Autowired
    TagsRepository tagsRepository;
    @Autowired
    CategoryRepository categoryRepository;

    @Override
    public ArticleVO createOrUpdateArticle(Article article, Set<Integer> tagsIds,Set<Integer> categoryIds) {

        // crate value object
        ArticleVO articleVO = new ArticleVO();
        BeanUtils.copyProperties(article,articleVO);
        List<ArticleTags> articleTags = new ArrayList<>();
//        tagsRepository.saveAll();
        List<Tags> tags = tagsRepository.findTagsByArticleId(article.getId());
        articleVO.setTags(tags);
//        articleVO.setCategories();
        // save article tags category
        return articleVO;
    }

    @Override
    public String createOrUpdateArticleAndHtml(Article article, Set<Integer> tagsIds,Set<Integer> categoryIds) {
        ArticleVO articleVO = createOrUpdateArticle(article,tagsIds,categoryIds);
        Template template = templateRepository.findById(article.getTemplateId()).get();
        String html = TemplateUtil.article2Html(articleVO, template);
        return html;
    }

    @Override
    public ArticleVO findArticleById(int id) {
        ArticleVO articleVO  =new ArticleVO();
        Article article = articleRepository.findById(id).get();
        BeanUtils.copyProperties(article,articleVO);

//        articleVO.setCategories();
//        articleVO.setTags();
        return null;
    }

    @Override
    public String staticArticleById(int id) {

        return null;
    }

    //find tags by article id
}
