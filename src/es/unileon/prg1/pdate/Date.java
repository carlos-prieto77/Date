package es.unileon.prg1.pdate;

/*
 * 
 */

public class Date {

		private int day;
		private int month;
		private int year;
		
		
		//Constructor clase date
		public Date() {
			this.day=1;
			this.month=1;
			this.year=1;	
		}
		
		
		
		public Date(int day, int month, int year) throws DateException{
			
			if((day>0) &&(day<32)) {
			this.day=day;
			}else {
				throw new DateException("Error en la introducion");
			}
			
			this.month=month;
			this.year=year;
		}



		public boolean isSameYear(Date miFecha) {
			boolean retorno = false;
			
			if(this.year==miFecha.year) {
				retorno = true;
			}
			return retorno;
		}

		
		
		public String toString() {
			return "Date [day=" + day + ", month=" + month + ", year=" + year + "]";
		}

		
		
		//Variables getters y setters
		
		public int getDay() {
			return day;
		}

		public void setDay(int day) {
			this.day = day;
		}

		public int getMonth() {
			return month;
		}

		public void setMonth(int month) {
			this.month = month;
		}

		public int getYear() {
			return year;
		}

		public void setYear(int year) {
			this.year = year;
		}
		
		
		
}

