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

		if(day < 1 || day > dayOfMonth()){
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
	 * @return devulve le parametro number
	 * 
	 * 
	 */
	public int dayOfMonth(){
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
	/**
	 * Metodo que compara los años y dice si es el mismo
	 * @return devuelve true o false dependiendo de si el año es el mismo o no
	 */
	public boolean isSameYear(Date anotherDate){
	
		if(this.year==anotherDate.getYear()){
			return true;
		}
		else{
			return false;
		}

	}
	/**
	 * Metodo que compara dos fechas y te dice si es el mismo mes
	 * @return  devuelve true o false dependiendo de si el mes es el mismo o no
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
	 * @return  devuelve true o false dependiendo de si el dia es el mismo o no
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
	 * @return  devuelve true o false dependiendo de si la fecha es la misma o no
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
	 * @return devuelve el nombre del mes
	 */
	public String monthName(){
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

	return namemonth;
	}
	/**
	 * Metodo en el que escribes un dia para un mes y te dice si es verdadero o falso
	 * @param rigth Dice si el numero de dias es correcto o no
	 * @return devuelve el parametro rigth
	 */
	public boolean isDayRight(){
        boolean right=true;
        switch(month){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                if(day<1||day>31){
                    right=false;
                }
            break;

            case 2:
                if(day<1||day>28){
                    right=false;
                }
            break;

            case 4:
            case 6:
            case 9:
            case 11:
                if(day<1||day>30){
                    right=false;
                }
            break;            
        }

        return right;
	}
	/**
	 * Metodo con el que escribes un mes y te dice a que estacion pertenece
	 * @param season nombre de la estacion
	 */
	public String seasonOfMonth(){
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
	/**
	 * Metodo que calcula cuantos meses quedan para que se acabe el año desde el mes introducido
	 * @param left meses que quedan para que se acabe el año
	 * @return devuelve el numero de meses que quedan para que se acabe el año
	 */
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
	/**
	 * Metodo que te dice cuantos dias quedan para que se acabe el mes
	 * @param message mensaje que te dice los dias que faltan para que se acabe el mes
	 */
	public void isDateleft(){
		int i;
		String message= "";
		for(i=this.day; i<dayOfMonth(); i++){
				message= i+"/" + month + "/" + year;
				System.out.println(message+"\n");
		}

	}
	/**
	 * Metodo que te dice que meses tienen los mismos dias que el mes introducido
	 * @param months parametro que te dice los meses que tienen los mismos dias que el mes introducido
	 * @return devuelve los meses que tienen el mismo numero de dias que le introducido
	 */
	public String ismonthSameDays(){
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
	/**
	 * Metodo que cuenta los dias desde el primer dia del año
	 * @param dias dice cuantos dias tiene de cada mes
	 * @param suma suma los dias, desde el primer dia del año hasta la fecha anterior
	 * @return devuelve la suma de los dias, desde el primer dia del año hasta el dia anterior
	 */
	public int numberOfDays(){
		int i, days, suma;
		suma=0;
		for(i=1;i<=getMonth()-1;i++){
			if(i==2){
				days=28;
				suma=suma+days;
			} else 
			if(i==4 || i==6 || i==9 || i==11) {
				days=30;
				suma=suma+days;
			}
			else {
				days=31;
				suma=suma+days;
			} 
		}
		suma=suma+getDay()-1;
		return suma;
	}
	/**
	 * Metodo que calcula el numero de intentos para crear una fecha aleatoria con un while
	 * @param day parametro con el que se calculan los dias
	 * @param month parametro con el que se calculan los meses 
	 * @return i devuelve el numero de intentos
	 */
	public int randomDate(){
		int day,mes,i;
		i=0;
		day=0;
		mes=0;
		while(day!=getDay() && mes!=getMonth()){
			day=(int)(Math.random()*31)+1;
			mes=(int)(Math.random()*12)+1;
			i++;
		}
		return i;
	}
	/**
	 * Metodo que calcula el numero de intentos para crear una fecha aleatoria con un do-while
	 * @param day parametro con el que se calculan los dias
	 * @param month parametro con el que se calculan los meses 
	 * @return i devuelve el numero de intentos
	 */
	public int doRandomDate(){
		int day,mes,i;
		i=0;
		day=0;
		mes=0;
		do{
			day=(int)(Math.random()*31)+1;
			mes=(int)(Math.random()*12)+1;
			i++;
		} while(day!=getDay() && mes!=getMonth());
		return i;
	}
	/**
	 * Metodo que, metiendo una fecha te devuelve el dia de la semana que es
	 * @param dia dia de la semana
	 * @return devuelve el dia de la semana
	 */
	public String dayOfWeek(){
		String dia="";
		switch((numberOfDays()+1)%7){
			case 1:
				dia="Lunes";
				break;
			case 2:
				dia="Martes";
				break;
			case 3:
				dia="Miércoles";
				break;
			case 4:
				dia="Jueves";
				break;
			case 5:
				dia="Viernes";
				break;
			case 6:
				dia="Sábado";
				break;
			case 7:
				dia="Domingo";
				break;
		}
		return dia.toString();
	}
}
