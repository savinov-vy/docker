package ru.service;

import org.springframework.stereotype.Service;
import ru.entity.SavedEntity;
import ru.repository.StudyRepository;

@Service
public class StudyService {

    private final StudyRepository studyRepository;

    public StudyService(StudyRepository studyRepository) {
        this.studyRepository = studyRepository;
    }

    public SavedEntity save(SavedEntity savedEntity) {
        return studyRepository.save(savedEntity);
    }
}
