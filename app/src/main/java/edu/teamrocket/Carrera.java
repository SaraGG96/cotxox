package edu.teamrocket;

public class Carrera {
	
	private String tarjetaCredito;
	private String origen;
	private String destino;
	private double distancia;
	private int tiempoEsperado;
	
	public Carrera(String tarjetaCredito) {
		this.tarjetaCredito = tarjetaCredito;
	}
	
	public void setOrigen(String origen) {
		this.origen = origen;
	}
	
	public void setDestino(String destino) {
		this.destino = destino;
	}
	
	public void setDistancia(double distancia) {
		this.distancia = distancia;
	}
	
	public void setTiempoEsperado(int tiempoEsperado) {
		this.tiempoEsperado = tiempoEsperado;
	}
	
	public String getTarjetaCredito() {
		return tarjetaCredito;
	}
	
	public String getOrigen() {
		return origen;
	}
	
	public String getDestino() {
		return destino;
	}
	
	public double getDistancia() {
		return distancia;
	}
	
	public double getCosteEsperado() {
		double costeBase = 2.5;
		double costePorKm = 1.5;
		double costePorMinuto = 0.25;
		
		double coste = costeBase + (distancia * costePorKm) + (tiempoEsperado * costePorMinuto);
		return coste;
	}
}
