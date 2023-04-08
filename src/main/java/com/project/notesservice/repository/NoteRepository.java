package com.project.notesservice.repository;

import com.project.notesservice.entity.NoteEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface NoteRepository extends MongoRepository<NoteEntity, String> {
    @Override
    <S extends NoteEntity> S save(S entity);

    @Override
    List<NoteEntity> findAll();

    List<NoteEntity> findAllByOrderByDateCreatedDesc();

    List<NoteEntity> findAllByUserIdOrderByDateCreatedDesc(String userId);
}
