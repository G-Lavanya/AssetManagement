package com.asset.management.repo;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.asset.management.model.CategoriesModel;


public interface CategoryRepo extends JpaRepository<CategoriesModel,Integer>{

	@Override
	List<CategoriesModel> findAll();

	Optional<CategoriesModel> findById(Long id);

	void deleteById(long id);

	//void acceptUserDetails(CategoriesModel pd);
	
	
}
