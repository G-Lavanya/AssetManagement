package com.asset.management.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.asset.management.model.AssetModel;
import com.asset.management.model.CategoriesModel;
import com.asset.management.repo.AssetRepository;
import com.asset.management.service.managementServices;

@RestController
@ComponentScan
public class AssetController {

	@Autowired
	AssetRepository arepo;
	
	@Autowired
	managementServices ms;

	public AssetController(AssetRepository arepo) {
		super();
		this.arepo = arepo;
	}

	@GetMapping("/getasset")
	public List<AssetModel> getAllAssert() {

		return arepo.findAll();
	}

	@GetMapping("/getasset/{name}")
	public Optional<AssetModel> getAssert(@PathVariable(value = "name") String name) {
		return arepo.findbyName(name);
	}

	@PostMapping("/postasset")
	public String postDetails(@RequestBody AssetModel pd) {
		System.out.println(pd.toString());
		arepo.save(pd);
		return pd.getName();
	}

	@PutMapping(value="/getasset/{name}/{status}")
	public String StatusUpdate(@PathVariable String name,@PathVariable String status) throws Exception{
//		try {
//			Optional<AssetModel> optional = arepo.findbyName(name);
//			// Transaction transaction = new Transaction();
//			AssetModel dp = optional.get();
//			if (dp.getStatus() == "recover") {
//				arepo.delete(dp);
//				return "Asset deleted";
//			} else {
//				return "cannot be deleted in assigned state";
//			}
//		} catch (Exception e) {
//			throw new Exception(e.getMessage());
//		}
//	

			return ms.StatusUpdate(name, status);
	}
	 @GetMapping("/getdata/{id}")
	    AssetModel getAssetById(@PathVariable String name) {
	        return arepo.findbyName(name).get();
	    }

}
