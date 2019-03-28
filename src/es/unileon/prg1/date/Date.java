package es.unileon.prg1.date;


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
		if(year<1) {
			throw new DateException("Año"+year+" no válido"+ "Valores mayores que 1");
		}else {
			
			this.year = year;
		}
		if (month < 1 || month > 12) {
			throw new DateException("Mes " + month + " no valido" +
					" Valores posibles entre 1 y 12.");
		} else {
			this.month = month;
		}

		if(day < 1 || day > daysOfMonth()){
			throw new DateException("Dia " + day + " no valido" +
					" Valores posibles entre 1 y 31");
		} else {
			this.day = day;

		}
	}

	public Date() {
		this.day= 1;
		this.month=1;
		this.year=2017;
	}
	/**
	 * Copia del construcor de la clase date
	 * 
	 */
	public Date(Date today) {
		this.day=today.day;
		this.month=today.month;
		this.year=today.year;
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
	 * @throws DateException
	 */
	public void setDay(int day) throws DateException {
		if(day<1||day>daysOfMonth()) {
			throw new DateException("Day " + day + "no valido" + "Valores posibles entre 1 y 31");
		}
		else {
			this.day = day;
		}
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
	public void setMonth(int month)throws DateException  {
		if(month<1||month>12) {
			throw new DateException("Mes " + month + "no valido" + "Valores posibles entre 1 y 12");
		}
		else {
		this.month = month;
		}
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
	public void setYear(int y)throws DateException {
		if(y<0) {
			throw new DateException("Año " + y + "no valido" + "Valores mayores que 0");
		}
		else {
			this.year = y;
		}
	}
	/**
	 * Metodo que te dice cuantos dias tiene el mes
	 * @param month El numero del mes
	 * @param number Numero de dias del mes
	 * @return devulve le parametro number
	 * 
	 * 
	 */
	public int daysOfMonth(){
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
	public Date tomorrow () {
		Date tomorrow=null;
		int day, month, year;
		
		try {
		tomorrow=new Date(this);
		day=getDay();
		month=getMonth();
		year=getYear();
		
		day++;
			if(day>tomorrow.daysOfMonth()) {
			day=1;
			month ++;
				if(month>12) {
					month=1;
					year ++;
				}
				
			}
			tomorrow = new Date(day, month, year);
		}	
		catch(DateException e){
			System.out.println(e.getMessage());
		}
		return tomorrow;
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
	public String getMonthName(){
			String namemonth="";
			switch(month){
				case 1: 
					namemonth="January";
					break;
				case 2: 
					namemonth= "February";
					break;
				case 3: 
					namemonth= "March";
					break;
				case 4: 
					namemonth= "April";
					break;
				case 5: 
					namemonth= "May";
					break;
				case 6: 
					namemonth= "June";
					break;
				case 7: 
					namemonth= "July";
					break;
				case 8: 
					namemonth= "August";
					break;
				case 9: 
					namemonth= "September";
					break;
				case 10: 
					namemonth= "October";
					break;
				case 11: 
					namemonth= "November";
					break;
				case 12: 
					namemonth= "December";
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
	public String getSeasonName(){
		String season="";
			switch(month){
				case 12: //next
				case 1: //next
				case 2: 
					season="Winter";
					break;
				case 3: //next
				case 4: //next 
				case 5:
					season= "Spring";
					break;
				case 6: //next
				case 7: //next
				case 8: //next
					season= "Summer";
					break;
				case 9: //next
				case 10: //next
				case 11:
					season="Autumn";
					break;
			}
		return season;
	}
	/**
	 * Metodo que calcula cuantos meses quedan para que se acabe el año desde el mes introducido
	 * @param left meses que quedan para que se acabe el año
	 * @return devuelve el numero de meses que quedan para que se acabe el año
	 */
	public String getMonthsLeft() throws DateException{
		StringBuilder month= new StringBuilder();
		int i;
		Date aux= new Date(this);
		for(i=(this.month)+1; i<=12; i++) {
			aux.setMonth(i);
			month.append(aux.getMonthName()+" ");
		}
		return month.toString();
	}
	/**
	 * Metodo que te dice cuantos dias quedan para que se acabe el mes
	 * @param message mensaje que te dice los dias que faltan para que se acabe el mes
	 */
	public String getDaysLeftOfMonth() throws DateException{
		int i;
		StringBuilder message= new StringBuilder();
		for(i=this.day+1; i<=daysOfMonth(); i++){
				message.append(i+ "/" + this.month + "/" + this.year+" ");
		}
		return message.toString();
	}
	/**
	 * Metodo que te dice que meses tienen los mismos dias que el mes introducido
	 * @param months parametro que te dice los meses que tienen los mismos dias que el mes introducido
	 * @return devuelve los meses que tienen el mismo numero de dias que le introducido
	 */
	public String getMonthsSameDays()throws DateException{
		StringBuilder month=new StringBuilder();
		int i;
		Date aux=new Date(this);
		for(i=1;i<=12;i++) {
			aux.setMonth(i);
			if(aux.daysOfMonth()==this.daysOfMonth()) {
				month.append(aux.getMonthName()+" ");
			}	
		}
		return month.toString();
	}
	/**
	 * Metodo que cuenta los dias desde el primer dia del año
	 * @param dias dice cuantos dias tiene de cada mes
	 * @param suma suma los dias, desde el primer dia del año hasta la fecha anterior
	 * @return devuelve la suma de los dias, desde el primer dia del año hasta el dia anterior
	 */
	public int DaysPast(){
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
	public int numRandomTriesEqualDate(){
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
	 * Metodo que calcula el numero de dias que han pasado desde una fecha
	 * @return devuelve el numero de dias que han pasado
	 */
	public int daysPast() {
		int i, days, past=0;
		
		for(i=1;i<=getMonth()-1; i++) {
			if(i==2) {
				days=28;
				past=past+days;
			}
			else {
				if(i==4||i==6||i==9||i==11) {
					days=30;
					past=past+days;
				}
				else {
					days=31;
					past=past+days;
					}
				}
			}
			past=past +getDay()-1;
			return past;
	}
	/**
	 * Metodo que, metiendo una fecha te devuelve el dia de la semana que es
	 * @param dia dia de la semana
	 * @return devuelve el dia de la semana
	 */
	public String dayOfWeek(int firstOfJanuary){
		String dia= "";
		switch((daysPast()%7)+firstOfJanuary) {
			case 1:
				dia="Monday";
				break;
			case 2:
				dia="Tuesday";
				break;
			case 3:
				dia="Wednesday";
				break;
			case 4:
				dia="Thursday";
				break;
			case 5:
				dia="Friday";
				break;
			case 6:
				dia="Saturday";
				break;
			case 7:
				dia="Sunnday";
				break;
		}
		return dia;
	}
}
