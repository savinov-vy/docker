package ru.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.entity.SavedEntity;

@Repository
public interface StudyRepository extends JpaRepository<SavedEntity, Long> {
}
