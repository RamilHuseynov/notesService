package com.project.notesservice.repository;

import com.project.notesservice.entity.LikeEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LikeRepository extends MongoRepository<LikeEntity, String> {
    @Override
    void deleteById(String s);

    LikeEntity findByLikedUserIdAndLikedNoteId(String likedUserId, String likedNoteId);

    void deleteAllByLikedNoteId(String likedId);

    List<LikeEntity> findAllByLikedNoteId(String likedNoteId);
}
