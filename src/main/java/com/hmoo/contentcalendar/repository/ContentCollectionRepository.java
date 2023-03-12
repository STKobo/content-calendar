package com.hmoo.contentcalendar.repository;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Repository;

import com.hmoo.contentcalendar.model.Content;
import com.hmoo.contentcalendar.model.Status;
import com.hmoo.contentcalendar.model.Type;

import jakarta.annotation.PostConstruct;

@Repository
public class ContentCollectionRepository {
    
    private final List<Content> content = new ArrayList<>();

    public ContentCollectionRepository(){

    }

    public List<Content> findAll() {
        return content;
    }

    public Optional<Content> findById(Integer id){
        return content.stream().filter(c ->c.id().equals(id)).findFirst();
    }

    @PostConstruct
    private void init() {
        Content c = new Content(1, 
        "My First Blog Post",
        "Testing a full Spring app", 
        Status.IDEA, 
        Type.ARTICLE, 
        LocalDateTime.now(),
        null, 
        null ); 

        content.add(c);
    }
}
