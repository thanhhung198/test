package com.laptrinhjavaweb.controller;

import java.util.List;
import java.io.ObjectInputStream.GetField;
import java.util.ArrayList;

import com.laptrinhjavaweb.dao.exception.BuildingCustomException;
import com.laptrinhjavaweb.model.BuildingDTO;
import com.laptrinhjavaweb.service.ChildrenC;
import com.laptrinhjavaweb.service.ChildrenD;
import com.laptrinhjavaweb.service.IBuildingService;
import com.laptrinhjavaweb.service.Impl.BuildingService;

public class BuildingController {
	//private static BuildingService buildingService = new BuildingService();

	public static void main(String[] args) {
		// System.out.println("h y l");
		// BuildingDTO buildingModel = new BuildingDTO();
		// buildingModel.setName("Anh yeu em");
		// System.out.println(buildingModel.getName());
		/*List<BuildingDTO> buildings = buildingService.findAll();
		for (BuildingDTO item : buildings) {
			System.out.println("Name: " + item.getName() + " - District: " + item.getDistrict()
					+ " - NumberOfBasement: " + item.getNumberOfBasement() + "");
		}*/
		/*ChildrenC childrenC = new ChildrenC();
		childrenC.eye();
		childrenC.hair();
		
		ChildrenD childrenD = new ChildrenD();
		childrenC.eye();
		childrenD.hair();*/
		/*int a =0;
		int b = 1;
		BuildingDTO buildingDTO = null;
		try {
			System.out.println(buildingDTO.getName());
		}catch(NullPointerException e) //NullPointerException e hỗ trợ BuildingDTO bị null
		{
			System.out.println("BuildingDTO bị null");
		}*/
		IBuildingService buildingService = new BuildingService();
		try {
			buildingService.testException();
		}catch(BuildingCustomException e) {
			System.out.println(e.getMessage());
		}
		
	}
}
