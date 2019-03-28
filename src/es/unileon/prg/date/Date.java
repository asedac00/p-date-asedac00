package es.unileon.prg1.date;


/**
 * Clase realizada a partir de los ejercicios propuestos en las diapositivas.
 * @author Iván Sánchez Revuelta
 * @version Inicial
 *   
 */

 public class Date{
/**
 * Atributo que establece el día
 */
    private int day;

/**
 * Atributo que establece el mes
 */
    private int month;

/**
 * Atributo que establece el año
 */
    private int year;
/**
 * Constructor de la clase Date que crea un día con los atributos day,month,year
 * @param day Establece el día
 * @param month Establece el mes
 * @param year Establece el año
 * @throws DateException Lanza la excepción de fecha
 */
public Date(int day, int month, int year) throws DateException{
	if(year<1) {
    	throw new DateException("Año " + year + " no valido" +
                " Valores posibles mayores que 1.");
    }else {
    	this.year = year;
    }    
	if (month < 1 || month > 12) {
        throw new DateException("Mes " + month + " no valido" +
                " Valores posibles entre 1 y 12.");
    } else {
        this.month = month;
    }
    if(day<1 || day>daysOfMonth()){
        throw new DateException("Día "+day+"no válido " +
                "Valores posibles entre 1 y 31.");
    }else{
        this.day=day;
    }
}

/**
 * Constructor de la clase Date que crea un día manualmente
 */
public Date() {
	 this.year = 2017;
	 this.month = 1;
	 this.day=1;

}

	
/**
 * Copia del constructor que crea el objeto Date today
 * @param today Una fecha
 */
public Date(Date today) {
	this.year = today.year;
    this.month = today.month;
    this.day=today.month;
}



/**
 * Método que imprime la fecha dada
 */
@Override
public String toString() {
    return this.day + "/" + this.month + "/" + this.year;
}


/**
 * Método que nos autoriza a utilizar el atributo year
 * @return Devuelve el año 
 */
    public int getYear(){
        return year;
    }

/**
 * Método que nos autoriza a usar el atributo month
 * @return Devuelve el mes
 */
    public int getMonth(){
        return month;
    }

/**
 * Método que nos autoriza a usar el atributo day
 * @return Devuelve el día
 */
    public int getDay(){
        return day;
    }

  /**
     * Método que establece el día    
     * @param d El día
 * @throws DateException 
     */
    public void setDay(int d) throws DateException {
        if(d<1||d>daysOfMonth()) {
        	throw new DateException("Dia " + d + " no valido" +
                    " Valores posibles entre 1 y 31.");
        }else {
        	this.day = d;
        }
    }

    /**
     * Método que establece el mes
     * @param m El mes a establecer
     * @throws DateException 
     */
    public void setMonth(int m) throws DateException {
    	if(m<1||m>12) {
        	throw new DateException("Mes " + m + " no valido" +
                    " Valores posibles entre 1 y 12.");
        }else {
        	this.month = m;
        }    }

    /**
     * Método que establece el año
     * @param y El año a establecer
     * @throws DateException 
     */
    public void setYear(int y) throws DateException  {
    	if(y<1) {
        	throw new DateException("Año" + y + " no valido" +
                    " Valores posibles mayores que 0.");
        }else {
        	this.year = y;
        }    }
/**
 * Método que nos devuelve el resultado de comparar el año de las fechas dadas
 * @return Devuelve true en caso de ser igual y false en caso de ser distintas
 * @param anotherDate Otra fecha
 */

    public boolean isSameYear(Date anotherDate){
        if(this.year==anotherDate.getYear()){
            return true;
        }else{
            return false;
        }
    }

/**
 * Método que nos devueve el resultado de comparar el mes de las fechas dadas
 * @return Devuelve true en caso de ser igual y false en caso de ser distintas
 * @param anotherDate Otra fecha
 */
    public boolean isSameMonth(Date anotherDate){
        if(this.month==anotherDate.getMonth()){
            return true;
        }else{
            return false;
        }
    }

/**
 * Método que nos devuelve el resultado de comparar el día de las fechas dadas
 * @return Devuelve true en caso de ser igual y false en caso de ser distintos
 * @param anotherDate Otra fecha
 */
    public boolean isSameDay(Date anotherDate){
        if(this.day==anotherDate.getDay()){
            return true;
        }else{
            return false;
        }
    }

 /**
  * Método que nos devuelve el resultado de comparar las dos fechas completas
  * @return Devuelve true en caso de ser igual y false en caso de ser distintas
  * @param anotherDate Otra fecha
  */
    public boolean isSame(Date anotherDate){
        if(this.year==anotherDate.getYear()&&this.day==anotherDate.getDay()&&this.month==anotherDate.getMonth()){
            return true;
        }else{
            return false;
        }
    }

/**
* Método que imprime el nombre del mes
* @return Devuelve el nombre del mes
*/

   public String getMonthName(){
        String nombreMes="";

       switch(month){
        case 1:
            nombreMes="January";
        break;
        case 2:
            nombreMes="February";
        break;
        case 3:
            nombreMes="March";
        break;
        case 4:
            nombreMes="April";
        break;
        case 5:
            nombreMes="May";
        break;
        case 6:
            nombreMes="June";
        break;
        case 7:
            nombreMes="July";
        break;
        case 8:
            nombreMes="August";
        break;
        case 9:
            nombreMes="September";
        break;
        case 10:
            nombreMes="October";
        break;
        case 11:
            nombreMes="November";
        break;
        case 12:
            nombreMes="December";
        break;
        
               	
    }
    return nombreMes.toString();
    

    }

/**
 * Método que adjunta una estación a un mes
 * @return Devuelve el nombre de la estación a la que corresponde cada mes
 */
   public String getSeasonName(){

        String season="";

        switch(month){
            case 12:
            case 1:
            case 2:
                season="Winter";
            break;
            
            case 3:
            case 4:
            case 5:
                season="Spring";
            break;

            case 6:
            case 7:
            case 8:
                season="Summer";
            break;
            
            case 9:
            case 10:
            case 11:
                season="Autumn";
            break;
        }
        return season.toString();
    }
/**
 * Método que establece el número de días que tiene cada año
 * @return Devuelve el número de días de cada mes
 * @param month Número del mes
 */
    public int daysOfMonth(){
        int number=0;

        switch(month){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                number=31;
            break;

            case 2:
                number=28;
            break;

            case 4:
            case 6:
            case 9:
            case 11:
                number=30;
            break;            
        }

        return number;

    }

/**
 * Método que comprueba que el número de días es correcto
 * @return Devuelve true si el número de días es correcto y false si no
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
 * Método que imprime las fechas hasta final de mes
 * @return Devuelve los meses que faltan hasta final de mes
 *
 */
    public String getDaysLeftOfMonth() throws DateException{
    	StringBuilder monthsLeft = new StringBuilder();
    		
    	for (int i = this.day+1; i <= this.daysOfMonth(); i++){
    		monthsLeft=monthsLeft.append(i+"/"+this.month+"/"+this.year+" ");
		}
    	return monthsLeft.toString();
    }

/**
 * Método que calcula el número de meses que quedan para que acabe el año
 * @return Devuelve el número de meses que quedan hasta diciembre
 * @throws DateException 
 */
    public String getMonthsLeft() throws DateException{
    	StringBuilder month=new StringBuilder();
    	int i;
    	Date aux=new Date(this);
    	for(i=(this.month)+1;i<=12;i++) {
    		aux.setMonth(i);
    		month.append(aux.getMonthName()+" ");
    		
    	}
        
    	return month.toString();

    }

/**
     * Método que busca los meses que tiene los mismos días que la fecha dada
     * @return Devuelve el nombre de los meses que tienen los mismos días
 * @throws DateException 
     */

    public String getMonthsSameDays() throws DateException{
        StringBuilder month=new StringBuilder();
        int i;
        Date aux=new Date(this);
        for(i=1;i<=12;i++){
        	aux.setMonth(i);
        	if(aux.daysOfMonth()==this.daysOfMonth()) {
        		month.append(aux.getMonthName()+" ");
        	}
        }
        return month.toString();
    }
/**
 * Método que calcula el numero de veces que son necesarias para conseguir que una fecha aleatoria sea igual a una fecha dada
 * @return Devuelve el número de intentos necesarios
 */
    public int numRandomTriesEqualDate(){
        int i=0,j=0,tries=0;
        while(i!=day && j!=month){
            i=(int) (Math.random()*12)+1;
            j=(int)(Math.random()*31)+1;
            tries+=1;
        }

        return tries;
    }


/**
 * Método que calcula el dia siguiente 
 * @return Devuelve el dia siguiente
 */
public Date tomorrow() {
	Date tomorrow = null;
	int day,month,year;
	
	try {
		tomorrow=new Date(this);
		day=getDay();
		month=getMonth();
		year=getYear();
		
		day++;
		if(day>tomorrow.daysOfMonth()) {
			day=1;
			month++;
			if(month>12) {
				month=1;
				year++;
			}
		}
		tomorrow=new Date(day,month,year);
	}
	catch(DateException e) {
		System.out.println(e.getMessage());
	}
		
	return tomorrow;
}

/**
 * Método que calcula el número de días que han pasado desde una fecha
 * @return Devuelve el número de días que han pasado
 */
public int daysPast() {
	int i,days,past=0;
	
	for(i=1;i<=getMonth()-1;i++) {
		if(i==2) {
			days=28;
			past=past+days;
		}else {
			if(i==4||i==6||i==9||i==11) {
				days=30;
				past=past+days;
			}else {
				days=31;
				past=past+days;
			}
		}
	
	
	}
	past=past+getDay()-1;
	return past;
}

/**
 * Método que calcula el día de la semana que es cierta fecha
 * @return Día de la semana
 */
public String dayOfWeek(int firstOfJanuary) {
	String dia="";
	
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
			dia="Sunday";
		break;	
	}
	return dia.toString();
}

}











 



 