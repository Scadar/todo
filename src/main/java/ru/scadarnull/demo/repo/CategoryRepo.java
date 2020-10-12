package ru.scadarnull.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.scadarnull.demo.entity.Category;

@Repository
public interface CategoryRepo extends JpaRepository<Category, Long> {
}
