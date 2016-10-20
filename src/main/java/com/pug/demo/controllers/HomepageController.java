package com.pug.demo.controllers;

import com.contentful.java.cda.CDAClient;
import com.contentful.java.cda.CDAEntry;
import com.pug.demo.model.Author;
import com.pug.demo.utils.MarkdownUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@Service
public class HomepageController {

//    /** Rest template for making requests to *.contentful.com */
//    private static final RestTemplate REST_TEMPLATE = new RestTemplate();
//
//    /** Blog post/article in the CMS, used for testing */
//    private static final Article ARTICLE = REST_TEMPLATE.getForObject(ContentfulUrls.EXAMPLE_ARTICLE, Article.class);

    @Value("${contentful.spaceid}")
    private String spaceId;

    @Value("${contentful.accesstoken}")
    private String accessToken;

    private final String blogArticleId = "uHOOWJG8Sc02e0wUMCQG2";

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView loadHomePage() {
        final ModelAndView mav = new ModelAndView("homepage");

        final CDAClient client = CDAClient.builder()
                .setSpace(spaceId)
                .setToken(accessToken)
                .build();

        // Get article from Contentful via client
        CDAEntry entry = client.fetch(CDAEntry.class).one(blogArticleId);

        final String articleTitle = entry.getField("articleTitle");
        final String articleContent = entry.getField("articleContent");
        final String articleTag = entry.getField("articleTag");
        final String articleDate = entry.getField("articleDate");
        final Author articleAuthor = entry.getField("articleAuthor");

        // Article content will be in Markdown so should be converted first
        final String convertedContent = MarkdownUtils.convertMarkdownToHtml(articleContent);

        mav.addObject("articleTitle", articleTitle);
        mav.addObject("articleContent", convertedContent);
        mav.addObject("articleTag", articleTag);
        mav.addObject("articleDate", articleDate);
        mav.addObject("articleAuthor", articleAuthor);

        return mav;
    }

}
