package com.dh.cloud.web;



import com.dh.cloud.models.Comment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class CommentController {
    
    @GetMapping(value = "/comment")
    public List<Comment> comment() {
        List<Comment> comments = new ArrayList<>();
        Comment c1 = new Comment("c1");
        Comment c2 = new Comment("c2");
        comments.add(c1);
        comments.add(c2);
        return comments;
    }
}
