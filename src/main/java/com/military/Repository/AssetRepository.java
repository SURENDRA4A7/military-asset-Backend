package com.military.Repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.military.Model.ModelAsset;

import java.util.List;

public interface AssetRepository extends JpaRepository<ModelAsset, Long> {
	List<ModelAsset> findByType(String type);

}
