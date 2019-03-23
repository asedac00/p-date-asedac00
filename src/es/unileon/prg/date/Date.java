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

	public int dayOfMonth(int month){

		int number =0;
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
		return number;
	}

	public boolean isSameYear(Date anotherDate){

		if(this.year==anotherDate.getYear()){
			return true;
		}
		else{
			return false;
		}
	}

	public boolean isSameMonth(Date anotherDate){

		if(this.month==anotherDate.getMonth()){
			return true;
		}
		else{
			return false;
		}
	}

	public boolean isSameDay(Date anotherDate){

		if(this.day==anotherDate.getDay()){
			return true;
		}
		else{
			return false;
		}
	}

	public boolean isSame(Date anotherDate){

		if(this.day==anotherDate.getDay() && this.month==anotherDate.getMonth() && this.year==anotherDate.getYear()){
			return true;
		}
		else{
			return false;
		}
	}

	public String nameOfMonth(){

			String namemonth="";
			switch(month){
				case 1: 
					namemonth= "Enero";
					break;
				case 2: 
					namemonth= "Febrero";
					break;
				case 3: 
					namemonth= "Marzo";
					break;
				case 4: 
					namemonth= "Abril";
					break;
				case 5: 
					namemonth= "Mayo";
					break;
				case 6: 
					namemonth= "Junio";
					break;
				case 7: 
					namemonth= "Julio";
					break;
				case 8: 
					namemonth= "Agosto";
					break;
				case 9: 
					namemonth= "Septiembre";
					break;
				case 10: 
					namemonth= "Octubre";
					break;
				case 11: 
					namemonth= "Noviembre";
					break;
				case 12: 
					namemonth= "Diciembre";
					break;
			}

	return namemonth;
	}

	public boolean isDayRight(){

		boolean right=false;
			switch(month){
				case 1: //next
				case 3: //next
				case 5: //next
				case 7: //next
				case 8: //next
				case 10: //next
				case 12:
					if(day<1 || day>31){
						right=false;
					}
					else{
						right=true;
					}
					break;
				case 2: 
					if(day<1 || day>28){
						right=false;
					}
					else{
						right=true;
					}
					break;
				case 4: //next
				case 6: //next
				case 9: //next
				case 11:
					if(day<1 || day>30){
						right=false;
					}
					else{
						right=true;
				}
					break;
		}
		return right;
	}

	public String seasonOfThisMonth(){

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

		return season;
	}

	public int monthleft(){

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
	
	return left;
	}

	public void Dateleft(){
		int i;
		String message= "";
		for(i=this.day; i<dayOfMonth(month); i++){
				message= i+"/" + month + "/" + year;
				System.out.println(message+"\n");
		}

	}

	public String monthSameDays(){
		String months="";

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
		return months;
	}

}
