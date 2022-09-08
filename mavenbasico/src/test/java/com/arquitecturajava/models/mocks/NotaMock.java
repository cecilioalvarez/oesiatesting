package com.arquitecturajava.models.mocks;

import com.arquitecturajava.models.Nota;

public class NotaMock extends Nota{

	public NotaMock() {
		super("", 10);
	}
	public String getCalificacion() {
		return "SobreSaliente";
	}

	
}
