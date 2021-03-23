package com.asset.management.repo;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.asset.management.model.AssetModel;

@Repository
public interface AssetRepository extends JpaRepository<AssetModel, String>{

	@Override
	List<AssetModel> findAll();

	@Query("select u from AssetModel u where u.name = ?1")
	Optional<AssetModel> findbyName(String name);

	Optional<AssetModel> findById(Long id);

	
//	@Query("SELECT asset FROM AssetModel asset WHERE asset.Name= :assertName")
//	AssetModel findbyName(String assertName);


}
