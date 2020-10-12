package ru.scadarnull.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.scadarnull.demo.entity.Task;

@Repository
public interface TaskRepo extends JpaRepository<Task, Long> {
}
