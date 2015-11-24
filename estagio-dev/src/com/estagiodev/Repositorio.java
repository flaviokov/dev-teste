package com.estagiodev;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Repositorio {

	private static Map<Integer,String> tabelaDeConversao;
	
	static{
		tabelaDeConversao = new HashMap<>();
		tabelaDeConversao.put(2, "ABC");
		tabelaDeConversao.put(3, "DEF");
		tabelaDeConversao.put(4, "GHI");
		tabelaDeConversao.put(5, "JKL");
		tabelaDeConversao.put(6, "MNO");
		tabelaDeConversao.put(7, "PQRS");
		tabelaDeConversao.put(8, "TUV");
		tabelaDeConversao.put(9, "WXYZ");
	}
	
	public static String getNumeroConvertido(String valor) {
		Set<Entry<Integer, String>> tabela = tabelaDeConversao.entrySet();
		for (Entry<Integer, String> entry : tabela) {
			 if(entry.getValue().contains(valor)) {
				 return entry.getKey().toString();
			 }
		}
		
		return valor;
	}
}
