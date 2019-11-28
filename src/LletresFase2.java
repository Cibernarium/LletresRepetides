/*Canvia la taula per una llista (List<Character>)
Al bucle, si la lletra és una vocal imprimeix a la consola: ‘VOCAL’. Sinó, imprimeix: ‘CONSONTANT’.
Si trobes un numero, mostra per pantalla: ‘Els noms de persones no contenen números!’.
*/

import java.util.*;

public class LletresFase2 {

	public static void main(String[] args) {
		
		String stringname = "Jordi";
		char[] charname = stringname.toUpperCase().toCharArray();
		List<Character> name = new ArrayList<Character>();
		char type=' ';
		for( int i=0;i<stringname.length();i++) {
		name.add(i,charname[i]);
		}
	    
	    for (int i = 0; i <= name.size() - 1; i++) {
            type=name.get(i);
            if(type=='A'){
            	System.out.println(type+ " VOCAL");
            }	
            else if(type=='E') {
            	System.out.println(type+" VOCAL");
            }	
            else if(type=='I') {
            	System.out.println(type+" VOCAL");
            }	
            else if(type=='O') {
            	System.out.println(type+" VOCAL");
            }	
            else if(type=='U') {
            	System.out.println(type+" VOCAL");
            }	
            else if(type=='0') {
            	System.out.println(type+" Els noms no contenen numeros");
            }	
            else if(type=='1') {
            	System.out.println(type+" Els noms no contenen numeros");
            }	
            else if(type=='2') {
            	System.out.println(type+" Els noms no contenen numeros");
            }	
            else if(type=='3') {
            	System.out.println(type+" Els noms no contenen numeros");
            }	
            else if(type=='4') {
            	System.out.println(type+" Els noms no contenen numeros");
            }	
            else if(type=='5') {
            	System.out.println(type+" Els noms no contenen numeros");
            }	
            else if(type=='6') {
            	System.out.println(type+" Els noms no contenen numeros");
            }	
            else if(type=='7') {
            	System.out.println(type+" Els noms no contenen numeros");
            }	
            else if(type=='8') {
            	System.out.println(type+" Els noms no contenen numeros");
            }	
            else if(type=='9') {
            	System.out.println(type+" Els noms no contenen numeros");
            }		
            else {System.out.println(type+" CONSONANT");
            }       
	    }
	}
}
	

