package Practica5;
import java.util.*;
import java.io.IOException;

public class Ejecutor extends TareaPeriodica{
	
	private String comando;
	
	public Ejecutor(String comando, int periodo){
		super(periodo);
		this.comando = comando;
	}
	
	public String leerComando(){ return comando; }
		
}
