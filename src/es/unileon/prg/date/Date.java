package es.unileon.prg.date;


/**
 * Clase con los  ejercicios
 * 	@author Ana Sedano Cañas
 * 	@version inicial
 */
public class Date {

	private int day;
	private int month;
	private int year;

	public Date(int day, int month, int year) throws DateException{
		this.year = year;
		if (month < 1 || month > 12) {
			throw new DateException("Mes " + month + " no valido" +
					" Valores posibles entre 1 y 12.");
		} else {
			this.month = month;
		}

		if(day < 1 || day > dayOfMonth(month)){
			throw new DateException("Dia " + day + " no valido" +
					" Valores posibles entre 1 y 31");
		} else {
			this.day = day;

		}
	}

	@Override
	public String toString() {
		return this.day + "/" + this.month + "/" + this.year;
	}

	/**
	 * @return the day
	 */
	public int getDay() {
		return day;
	}

	/**
	 * @param day the day to set
	 */
	public void setday(int day) {
		this.day = day;
	}

	/**
	 * @return the month
	 */
	public int getMonth() {
		return month;
	}

	/**
	 * @param month the month to set
	 */
	public void setMonth(int month) {
		this.month = month;
	}

	/**
	 * @return the year
	 */
	public int getYear() {
		return year;
	}

	/**
	 * @param year the year to set
	 */
	public void setYear(int year) {
		this.year = year;
	}
	/**
	 * Metodo que te dice cuantos dias tiene el mes
	 * @param month El numero del mes
	 * @param number Numero de dias del mes
	 * 
	 * 
	 */
	public int dayOfMonth(int month){
		int number =0;
		System.out.println("Escriba el numero del mes del que quiere saber los dias: ");
		month=Teclado.readInteger();
		switch(month){
				case 1: //next
				case 3: //next
				case 5: //next
				case 7: //next
				case 8: //next
				case 10: //next
				case 12:
					number=31;
					break;
				case 2: 
					number=28;
					break;
				case 4: //next
				case 6: //next
				case 9: //next
				case 11:
						number=30;
						break;
		}
		System.out.println("El mes tiene " + number + " dias");
		return number;
	}
	/**
	 * Metodo que compara los años y dice si es el mismo
	 */
	public boolean isSameYear(Date anotherDate){
	System.out.println("Escriba la fecha que quiere comparar con la fecha de hoy: ");
	
		if(this.year==anotherDate.getYear()){
			return true;
		}
		else{
			return false;
		}

	}
	/**
	 * Metodo que compara dos fechas y te dice si es el mismo mes
	 */
	public boolean isSameMonth(Date anotherDate){

		if(this.month==anotherDate.getMonth()){
			return true;
		}
		else{
			return false;
		}
	}
	/**
 	* Metodo que compara dos fechas y te dice si es el mismo dia
 	*/
	public boolean isSameDay(Date anotherDate){

		if(this.day==anotherDate.getDay()){
			return true;
		}
		else{
			return false;
		}
	}
	/**
	 * Metodo que compara dos fechas y te dice si es la misma fecha
	 */
	public boolean isSame(Date anotherDate){

		if(this.day==anotherDate.getDay() && this.month==anotherDate.getMonth() && this.year==anotherDate.getYear()){
			return true;
		}
		else{
			return false;
		}
	}
	/**
	 * Metodo que introduciendo el numero de mes, te indica que mes es con letra
	 * @param namemonth Nombre del mes
	 * @param month Numero del mes
	 */
	public String nameOfMonth(){
		System.out.println("Escriba el numero de mes del que quiere saber el nombre: ");
		month=Teclado.readInteger();
			String namemonth="";
			switch(month){
				case 1: 
					namemonth= "enero";
					break;
				case 2: 
					namemonth= "febrero";
					break;
				case 3: 
					namemonth= "marzo";
					break;
				case 4: 
					namemonth= "abril";
					break;
				case 5: 
					namemonth= "mayo";
					break;
				case 6: 
					namemonth= "junio";
					break;
				case 7: 
					namemonth= "julio";
					break;
				case 8: 
					namemonth= "agosto";
					break;
				case 9: 
					namemonth= "septiembre";
					break;
				case 10: 
					namemonth= "octubre";
					break;
				case 11: 
					namemonth= "noviembre";
					break;
				case 12: 
					namemonth= "diciembre";
					break;
			}
		System.out.println("El mes" + month + "es:" + namemonth);

	return namemonth;
	}
	/**
	 * Metodo en el que escribes un dia para un mes y te dice si es verdadero o falso
	 * @param rigth Dice si el numero de dias es correcto o no
	 */
	public boolean isDayRight(){
		
		boolean rigth=false;
			switch(month){
				case 1: //next
				case 3: //next
				case 5: //next
				case 7: //next
				case 8: //next
				case 10: //next
				case 12:
					if(day<1 || day>31){
						rigth=false;
					}
					else{
				rigth=true;
					}
					break;
				case 2: 
					if(day<1 || day>28){
				rigth=false;
					}
					else{
				rigth=true;
					}
					break;
				case 4: //next
				case 6: //next
				case 9: //next
				case 11:
					if(day<1 || day>30){
				rigth=false;
					}
					else{
				rigth=true;
				}
					break;
		}
		return rigth;
	}
	/**
	 * Metodo con el que escribes un mes y te dice a que estacion pertenece
	 * @param season nombre de la estacion
	 */
	public String seasonOfThisMonth(){
		System.out.println("Escriba el mes del que quiere saber la estacion: ");
		month=Teclado.readInteger();
		String season="";
			switch(month){
				case 12: //next
				case 1: //next
				case 2: 
					season="Invierno";
					break;
				case 3: //next
				case 4: //next 
				case 5:
					season= "Primavera";
					break;
				case 6: //next
				case 7: //next
				case 8: //next
					season= "Verano";
					break;
				case 9: //next
				case 10: //next
				case 11:
					season="Otoño";
					break;
			}
			System.out.println("La estacion es: " + season);
		return season;
	}
	/**
	 * Metodo que te dice cuantos meses quedan para que se acabe el año desde el mes introducido
	 * @param left meses que quedan para que se acabe el año
	 */
	public int monthleft(){
		System.out.println("Escriba el mes del que quiere saber cuantos meses quedan hasta final de año: ");
		month=Teclado.readInteger();
		int left=0;
		switch(left){
		case 1:
			left=11;
			break;
		case 2:
			left=10;
			break;
		case 3:
			left= 9;
			break;
		case 4:
			left= 8;
			break;
		case 5:
			left=7;
			break;
		case 6:
			left=6;
			break;
		case 7:
			left=5;
			break;
		case 8:
			left=4;
			break;
		case 9:
			left=3;
			break;
		case 10:
			left=2;
			break;
		case 11:
			left=1;
			break;
		case 12:
			left=0;
			break;
		}
	System.out.println("Quedan " + left + " meses hasta fin de año");
	return left;
	}
	/**
	 * Metodo que te dice cuantos dias quedan para que se acabe el mes
	 * @param message mensaje que te dice los dias que faltan para que se acabe el mes
	 */
	public void Dateleft(){
		int i;
		String message= "";
		for(i=this.day; i<dayOfMonth(month); i++){
				message= i+"/" + month + "/" + year;
				System.out.println(message+"\n");
		}

	}
	/**
	 * Metodo que te dice que meses tienen los mismos dias que el mes introducido
	 * @param months parametro que te dice los meses que tienen los mismos dias que el mes introducido
	 */
	public String monthSameDays(){
		String months="";
		System.out.println("Escriba el mes del que quiere saber los meses con los mismos dias: ");
		month=Teclado.readInteger();
		switch(month){
			case 1:
				months="Marzo, Mayo, Julio, Agosto, Octubre, Diciembre";
				break;
			case 2:
				months="Ninguno";
				break;
			case 3:
				months="Enero, Mayo, Julio, Agosto, Octubre, Diciembre";
				break;
			case 4:
				months="Julio, Septiembre, Noviembre";
				break;
			case 5:
				months="Enero, Marzo, Julio, Agosto, Octubre, Diciembre";
				break;
			case 6:
				months="Abril, Septiembre, Noviembre";
				break;
			case 7:
				months="Enero, Marzo, Mayo, Agosto, Octubre, Diciembre";
				break;
			case 8:
				months="Abril, Julio, Noviembre";
				break;
			case 10:
				months="Enero, Marzo, Mayo, Agosto, Octubre, Diciembre";
				break;
			case 11:
				months="Abril, Julio, Septiembre";
				break;
			case 12:
				months="Enero, Marzo, Mayo,Julio, Agosto, Octubre";
				break;

		}
		System.out.println("El mes tiene los mismos dias que: " + months);
		return months;
	}

	public void daysSinceFirstDay (){
		int i;
		String mensaje= "";
		for(i=this.day; i>dayOfMonth(month); i++){
			mensaje= i+"/" + month + "/" + year;
			System.out.println(mensaje+"\n");
		}

	}


}
