package com.project.notesservice.mapper;

import com.project.notesservice.dto.Note;
import com.project.notesservice.dto.NoteRequest;
import com.project.notesservice.entity.NoteEntity;
import com.project.notesservice.repository.LikeRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class NoteMapper {
    private final LikeRepository likeRepository;

    public Note mapEntityToNote(NoteEntity entity) {
        return new Note(
                entity.getId(),
                entity.getUserId(),
                entity.getText(),
                entity.getCreatDate(),
                likeRepository.findAllByLikedNoteId(entity.getId()));
    }

    public List<Note> mapAllEntitiesToNote(List<NoteEntity> notes) {
        return notes.stream().map(this::mapEntityToNote).collect(Collectors.toList());
    }

    public NoteEntity requestToEntity(NoteRequest noteRequest) {
        return new NoteEntity(
                null,
                noteRequest.getUserId() == null ? UUID.randomUUID().toString() : noteRequest.getUserId(),
                noteRequest.getText(),
                noteRequest.getCreatDate());
    }

}
