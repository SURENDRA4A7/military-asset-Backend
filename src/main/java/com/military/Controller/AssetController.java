package com.military.Controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.military.Model.ModelAsset;
import com.military.Service.AssetService;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api/assets")
public class AssetController {

    @Autowired
    private AssetService assetService;

    @GetMapping("/api/login")
    public String testLogin() {
        return "Authenticated!";
    }

    @PostMapping
    public ResponseEntity<ModelAsset> addAsset(@RequestBody ModelAsset asset) {
        ModelAsset saved = assetService.save(asset);
        return new ResponseEntity<>(saved, HttpStatus.CREATED);
    }
    

    @GetMapping("/type/{type}")
    public List<ModelAsset> getAssetsByType(@PathVariable String type) {
        return assetService.getAssetsByType(type);
    }
    
    @GetMapping
    public List<ModelAsset> getAllAssets() {
        return assetService.getAllAssets();
    }
   

}
