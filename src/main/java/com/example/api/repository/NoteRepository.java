package com.example.api.repository;

import com.example.api.model.Note;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by rajeevkumarsingh on 27/06/17.
 */

@Repository
public interface NoteRepository extends JpaRepository<Note, Long> {

}
