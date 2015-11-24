package com.estagiodev.test;

import org.junit.Assert;
import org.junit.Test;

import com.estagiodev.EncontrarTelefone;


public class EncontrarTelefoneTest {
    
	private EncontrarTelefone numero;
	
	@Test
	public void teste1() {
		String caso  = "1-800-ALURA";
		numero = new EncontrarTelefone(caso);
		Assert.assertEquals("180025872", numero.getTelefoneConvertido());
	}
	
	@Test
	public void teste2() {
		String caso  = "1-800-25872";
		numero = new EncontrarTelefone(caso);
		Assert.assertEquals("180025872", numero.getTelefoneConvertido());
	}
	
	@Test
	public void teste3() {
		String caso  = "55CAELUM";
		numero = new EncontrarTelefone(caso);
		Assert.assertEquals("55223586", numero.getTelefoneConvertido());
	}

}
