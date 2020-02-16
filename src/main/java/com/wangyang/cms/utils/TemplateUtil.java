package com.wangyang.cms.utils;

import com.wangyang.cms.pojo.entity.Article;
import com.wangyang.cms.pojo.entity.Template;
import com.wangyang.cms.pojo.vo.ArticleVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.Context;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

@Component
public class TemplateUtil {


    private  static TemplateEngine templateEngine;

    @Autowired
    public void setTemplateEngine(TemplateEngine templateEngine) {
        this.templateEngine = templateEngine;
    }

    public static String article2Html(ArticleVO articleVO, Template template){
        Context context = new Context();
        context.setVariable("view",articleVO);
        return thymeleaf2Html(template,context);
    }

    public static String thymeleaf2Html(Template template,Context context){
        String html = templateEngine.process(template.getTemplateName(), context);
        try(FileWriter write = new FileWriter(template.getViewName());) {
            write.write(html);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return html;
//        File file = new File("Nginx所在虚拟机下的目标文件",  ".html");
//        try(PrintWriter writer = new PrintWriter(file,"UTF-8")){ //流在小括号里面会被自动的释放
//            templateEngine.process("1",context,writer);
//        }catch (Exception e){
//        }


    }
}
