package com.enotesapp.service;

import java.util.List;

import com.enotesapp.dto.CategoryDto;
import com.enotesapp.dto.CategoryResponse;
import com.enotesapp.entity.Category;

public interface CategoryService {
	
	public Boolean saveCategory(CategoryDto categoryDto);
	
	public List<CategoryDto> getAllCategory();

	public List<CategoryResponse> getActiveCategory();
	
	
}
