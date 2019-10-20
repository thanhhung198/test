package com.laptrinhjavaweb.service.Impl;

import java.util.ArrayList;
import java.util.List;

import com.laptrinhjavaweb.dao.exception.BuildingCustomException;
import com.laptrinhjavaweb.model.BuildingDTO;
import com.laptrinhjavaweb.service.IBuildingService;
public class BuildingService implements IBuildingService {
	@Override
	public void testException() throws BuildingCustomException{
		int a = 0;
		int b = 1;
		try {
			System.out.println(b/a);
		}catch(Exception e) {
			throw new BuildingCustomException("Lỗi cú pháp ko thể chưa cho 0");
		}
		
	}
}
