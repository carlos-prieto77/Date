package es.unileon.prg1.pdate;

public class PDatePrincipal {

	public static void main(String[] args) {
		Date myFecha = new Date();
		Date myFecha2 = new Date(30,10,2019);
		
		
		if(myFecha.isSameYear(myFecha2)) {
			System.out.println("es la misma fecha");
		}else {
			System.out.println("son fechas distintas");
		}
		System.out.println(myFecha);
	}

}
