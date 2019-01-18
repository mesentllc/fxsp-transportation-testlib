package com.fedex.smartpost.testers.transportation.dao;

import com.fedex.smartpost.testers.transportation.model.PackageModel;

import java.util.List;

public interface PackageDao {
	PackageModel retrieveRandom();

	PackageModel retrieveById(String packageId);

	List<PackageModel> retrieveByContainerId(String containerId);
}
