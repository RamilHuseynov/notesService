package com.project.notesservice.controller;

import com.project.notesservice.service.LikeService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/like")
@AllArgsConstructor
public class LikeController {
    private final LikeService likeService;

    @PostMapping("/")
    public void like(@RequestParam(name = "userId")String likingUserId, @RequestParam(name = "noteId")String likedNoteId) {
        likeService.likeNote(likingUserId, likedNoteId);
    }
}
