package com.geekster.University_Event._Management.repo;

import com.geekster.University_Event._Management.model.Event;
import jakarta.persistence.Id;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository

public interface IEventRepo extends CrudRepository<Event , Integer> {

    List<Event> findByDate(LocalDate localDate);
}
