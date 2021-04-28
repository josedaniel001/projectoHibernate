package libs.utils.locals;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class GetFecha {
	/**
     * Devuelve el campo date de la {@code  Fecha} en string usando 
     * las librerias de SimpledateFormat para dar el  formato a la fecha.
     * hace el parse de la fecha tipo String y la transforma en Date.
     *
     * @param Necesita como parametro una campo tipo String de Java Text o un Simple String.     
     */
	public Date converStringToDate(String date)throws ParseException{
		SimpleDateFormat formato=new SimpleDateFormat("dd/MM/yy");
 		Date fechaI= new Date(); 		
 		fechaI=formato.parse(date); 		
		return fechaI;
	}
	
	/**
     * Devuelve el string de la {@code  Fecha} usando 
     * las librerias de SimpledateFormat para dar el  formato a la fecha.
     * hace el parse de la fecha tipo Date y la transforma en string.
     *
     * @param Necesita como parametro una campo tipo Date de Java Util.     
     */
	public String converDateToString(Date fecha) {
		SimpleDateFormat formateador = new SimpleDateFormat("dd/MM/yy");
		String dater=formateador.format(fecha);
		return dater;
	}
	/**
     * Devuelve el string de la {@code  Fecha Actual} usando 
     * las librerias de SimpledateFormat para dar el  formato a la fecha.
     * hace el parse de la fecha tipo Date y la transforma en string.
     *
     * @param Necesita como parametro una campo tipo Date de Java Util.     
     */
	public String GetFechaNow() {
		SimpleDateFormat formateador = new SimpleDateFormat("dd/MM/yy");
		Date fecha = new Date();
		String fechaConvert=formateador.format(fecha);		
		return fechaConvert;
	}
	

	/**
     * Devuelve el string de la {@code  Fecha Actual} usando 
     * las librerias de SimpledateFormat para dar el  formato a la fecha.
     * hace el parse de la fecha tipo Date y la transforma en string.
     *
     * @param Necesita como parametro una campo tipo Date de Java Util.     
	 * @throws ParseException 
     */
	public Date GetFechaNowDate() throws ParseException {
		SimpleDateFormat formateador = new SimpleDateFormat("dd/MM/yy");
		Date fecha = new Date();
		String fechaConver=formateador.format(fecha);
		Date fechaConvert=formateador.parse(fechaConver);		
		return fechaConvert;
	}
		
		
}
