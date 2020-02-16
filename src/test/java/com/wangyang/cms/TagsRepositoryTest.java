package com.wangyang.cms;

import com.wangyang.cms.pojo.entity.ArticleTags;
import com.wangyang.cms.pojo.entity.Tags;
import com.wangyang.cms.repository.ArticleTagsRepository;
import com.wangyang.cms.repository.TagsRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class TagsRepositoryTest {

    @Autowired
    TagsRepository tagsRepository;

    @Autowired
    ArticleTagsRepository articleTagsRepository;


    @Test
    public void testFindTagsByArticleId(){
        List<Tags> tags = tagsRepository.findTagsByArticleId(1);
        for (Tags tag:tags){
            System.out.println(tag.getName());
        }
    }

    @Test
    public void test(){
        int a = tagsRepository.test1(3);
        System.out.println(a);
    }

    @Test
    public void test2(){
        System.out.println(tagsRepository.test2(1));
    }

    @Test
    public void test3(){
        System.out.println(tagsRepository.findById(1).getName());
    }
    @Test
    public void test4(){
        System.out.println(tagsRepository.test3(1));
    }
    @Test
    public void  addTags(){
        Tags tags1 =new Tags();
        tags1.setName("java");
        tags1.setSlugName("/java");

        tagsRepository.save(tags1);
        Tags tags2 =new Tags();
        tags2.setName("python");
        tags2.setSlugName("/python");
        tagsRepository.save(tags2);
    }

    @Test
    public void  addArticleTags(){
        ArticleTags articleTags = new ArticleTags();
        articleTags.setArticleId(1);
        articleTags.setTagsId(1);

        ArticleTags articleTags1 = new ArticleTags();
        articleTags1.setArticleId(1);
        articleTags1.setTagsId(2);

        articleTagsRepository.save(articleTags);
        articleTagsRepository.save(articleTags1);
    }
}
