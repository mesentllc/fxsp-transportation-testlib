package com.fedex.smartpost.testers.transportation.dao;

import com.fedex.smartpost.testers.transportation.model.ContainerModel;

public interface ContainerDao {
	ContainerModel retrieveRandom();

	ContainerModel retrieveById(String containerId);
}
