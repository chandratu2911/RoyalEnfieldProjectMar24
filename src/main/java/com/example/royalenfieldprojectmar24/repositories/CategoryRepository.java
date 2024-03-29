package com.example.royalenfieldprojectmar24.repositories;

import com.example.royalenfieldprojectmar24.models.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {

    Category findByTitle(String title);

    Category save(Category category);
}
