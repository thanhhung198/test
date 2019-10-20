package com.laptrinhjavaweb.dao.exception;

public class BuildingCustomException extends Exception{
	public BuildingCustomException(String message) {
		super(message); //sử dụng lại constractor của thằng cha
	}

}
