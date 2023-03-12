package com.hmoo.contentcalendar.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hmoo.contentcalendar.repository.ContentCollectionRepository;

@RestController
@RequestMapping("/api/content")
public class ContentController {
    
    private final ContentCollectionRepository repository;

    public ContentController(ContentCollectionRepository repository){
        this.repository = repository;
    }

}
