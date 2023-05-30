package com.auto.crudator.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * Controller
 *
 * @author xmiolo
 */
@Controller
public class WebController {

   /* @Autowired
    public WebController(FeedService feedService) {
        this.feedService = feedService;
    }

    @RequestMapping("/")
    public String list(ModelMap model) {
        model.put("feeds", feedService.getFeeds());
        return "list";
    }

    @RequestMapping("/feed/{id}")
    public String detail(@PathVariable(value = "id") Integer feedId, ModelMap model) {
        model.put("feed", feedService.getFeedById(feedId));
        return "detail";
    }*/
}