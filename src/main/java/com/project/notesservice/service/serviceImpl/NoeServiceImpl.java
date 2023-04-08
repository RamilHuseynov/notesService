package com.project.notesservice.service.serviceImpl;

import com.project.notesservice.dto.Note;
import com.project.notesservice.dto.NoteRequest;
import com.project.notesservice.entity.NoteEntity;
import com.project.notesservice.mapper.NoteMapper;
import com.project.notesservice.repository.LikeRepository;
import com.project.notesservice.repository.NoteRepository;
import com.project.notesservice.service.NoteService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class NoeServiceImpl implements NoteService {
    private final NoteMapper mapper;
    private final NoteRepository notesRepository;
    private final LikeRepository likeRepository;

    @Override
    public NoteEntity createNewNote(NoteRequest note) {
        return notesRepository.save(mapper.requestToEntity(note));
    }

    @Override
    public List<Note> findAll() {
        return mapper.mapAllEntitiesToNote(notesRepository.findAllByOrderByDateCreatedDesc());
    }

    @Override
    public List<Note> findAllByUserId(String userId) {
        return mapper.mapAllEntitiesToNote(notesRepository.findAllByUserIdOrderByDateCreatedDesc(userId));
    }

    @Override
    public void deleteById(String id) {
        notesRepository.deleteById(id);
        likeRepository.deleteAllByLikedNoteId(id);
    }

    @Override
    public Note update(NoteEntity entity) {
        return mapper.mapEntityToNote(notesRepository.save(entity));
    }
}
