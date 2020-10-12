package ru.scadarnull.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.scadarnull.demo.entity.Priority;

@Repository
public interface PriorityRepo extends JpaRepository<Priority, Long> {
}
