package belajarjava.belajarspring.repository;

import belajarjava.belajarspring.entity.Category;
import org.springframework.data.repository.CrudRepository;

public interface CategoryRepository extends CrudRepository<Category,Long> {
}
