package com.lowwall.zeomzeom.service;

import com.lowwall.zeomzeom.entity.Category;
import com.lowwall.zeomzeom.repository.CategoryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class CategoryService {

    private final CategoryRepository categoryRepository;

    @Transactional
    public void saveCategory(Category category) {
        categoryRepository.save(category);
    }

    @Transactional
    public void updateCategory(Long categoryId, Category param) {
        Category findCategory = categoryRepository.findById(categoryId)
                .orElseThrow(() -> new IllegalArgumentException("Invalid categoryId: " + categoryId));
        findCategory.setCategoryName(param.getCategoryName());
    }

    public Optional<Category> findOne(Long categoryId) {
        return categoryRepository.findById(categoryId);
    }
}
