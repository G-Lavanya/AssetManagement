
package com.asset.management.service;

import java.util.Optional;

import org.hibernate.Transaction;
import org.springframework.stereotype.Service;

import com.asset.management.model.AssetModel;
import com.asset.management.repo.AssetRepository;
@Service
public class managementServices {

	// CategoryRepo repo;
	AssetRepository arepo;

	public String StatusUpdate(String name, String status) throws Exception {

		try {
			Optional<AssetModel> optional = arepo.findbyName(name);
			// Transaction transaction = new Transaction();
			AssetModel dp = optional.get();
			if (dp.getStatus() == "recover") {
				arepo.delete(dp);
				return "Asset deleted";
			} else {
				return "cannot be deleted in assigned state";
			}
		} catch (Exception e) {
			throw new Exception(e.getMessage());
		}
	}

}