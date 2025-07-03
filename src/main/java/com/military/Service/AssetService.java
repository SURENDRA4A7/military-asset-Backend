package com.military.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.military.Model.ModelAsset;
import com.military.Repository.AssetRepository;

@Service
public class AssetService {

    @Autowired
    private AssetRepository assetRepo;

    public ModelAsset save(ModelAsset asset) {
        return assetRepo.save(asset);
    }

    public List<ModelAsset> getAssetsByType(String type) {
        return assetRepo.findByType(type);
    }
    public List<ModelAsset> getAllAssets() {
        return assetRepo.findAll();
    }

}
