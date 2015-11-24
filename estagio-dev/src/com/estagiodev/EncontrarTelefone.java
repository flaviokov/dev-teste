package com.estagiodev;

public class EncontrarTelefone {

	private String numeroTeleefone;
	
	public EncontrarTelefone() {}

	public EncontrarTelefone(String numeroTeleefone) {
		this.numeroTeleefone = numeroTeleefone;
	}
	
	public String getNumeroTeleefone() {
		return numeroTeleefone;
	}
	
	public String getTelefoneConvertido() {
		String aux = "";
		for (int i = 0; i < this.getNumeroTeleefone().length(); i++) {
			aux += this.getNumeroTeleefone().charAt(i);
		}
		
		StringBuilder sb = new StringBuilder();
		if(aux.contains("-")) {
			String[] result = aux.split("-");
			for (String valor : result) {
				sb.append(valor);
			}
			return iteraCaracteris(sb.toString());
		}else {
			return iteraCaracteris(aux);
		}
	}
	
	private String iteraCaracteris(String valor) {
		String aux = "";
		for (int i = 0; i < valor.length(); i++) {
			Character result = valor.charAt(i);
			aux += Repositorio.getNumeroConvertido(result.toString());
		}
		return aux;
	}
	
}
