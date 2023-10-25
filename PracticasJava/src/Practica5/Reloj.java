package Practica5;
import java.util.*;

public class Reloj extends TareaPeriodica {
	
	public Reloj(){
		super(60);
	}
	
	public String leerHora() {
		Calendar cal = new GregorianCalendar();
		return cal.get(Calendar.HOUR_OF_DAY) + ":" + cal.get(Calendar.MINUTE);
	}
	
	
}