package com.project.notesservice.service.serviceImpl;

import com.project.notesservice.entity.LikeEntity;
import com.project.notesservice.repository.LikeRepository;
import com.project.notesservice.service.LikeService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class LikedServiceImpl implements LikeService {
    private final LikeRepository likeRepository;

    @Override
    public void likeNote(String likedUserId, String likedNoteId) {
        LikeEntity like = likeRepository.findByLikedUserIdAndLikedNoteId(likedUserId, likedNoteId);
        if (like == null) {
            likeRepository.save(new LikeEntity(null, likedUserId, likedNoteId));
        } else {
            likeRepository.deleteById(like.getId());
        }
    }
}
