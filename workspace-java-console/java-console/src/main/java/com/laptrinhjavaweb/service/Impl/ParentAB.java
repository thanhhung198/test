package com.laptrinhjavaweb.service.Impl;

import com.laptrinhjavaweb.service.ParentA;
import com.laptrinhjavaweb.service.ParentB;

public class ParentAB implements ParentA,ParentB {
	@Override
	public void eye() {
		System.out.println("Mắt xanh");
	}
	
	@Override
	public void hair() {
		System.out.println("Tóc nâu");
	}

}
