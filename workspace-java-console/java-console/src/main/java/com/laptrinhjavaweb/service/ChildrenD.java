package com.laptrinhjavaweb.service;

import com.laptrinhjavaweb.service.Impl.ParentAB;

public class ChildrenD extends ParentAB{
	@Override
	public void eye() {
		System.out.println("Mắt đen");
	}
	
	@Override
	public void hair() {
		System.out.println("Tóc vàng");
	}


}
