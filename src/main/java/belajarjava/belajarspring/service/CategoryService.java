package belajarjava.belajarspring.service;

import belajarjava.belajarspring.entity.Category;
import belajarjava.belajarspring.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    public Category saveData(Category category){
        return categoryRepository.save(category);
    }

    public Category findById(Long id){
        return categoryRepository.findById(id).get();
    }
    public Iterable<Category> findAll(){
        return categoryRepository.findAll();
    }
    public void deleteId(Long id){
        categoryRepository.deleteById(id);
    }
}
