package Practica5;
import java.util.*;

public abstract class TareaPeriodica{

	protected int periodo;
	protected Date ultimaEjecucion;
	protected boolean activa;
	
	public TareaPeriodica(int periodo){
		this.periodo = periodo;
		actualizar();
		activa = true;
	}
	
	public TareaPeriodica() { this(1); }
	
	public void actualizar(){
		ultimaEjecucion = new Date(); // Hora actual
	}
	
	public void activar() { activa = true; }
	public void desactivar() { activa = false; }
	
	public abstract boolean necesitaEjecucion();
		//return false;
		// Metodo blanco intencionalmente
	
	
	public abstract int ejecutarTarea();
		//return 0;
		// Metodo blanco intencionalmente
	
}
