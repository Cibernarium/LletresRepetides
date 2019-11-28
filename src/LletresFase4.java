/*Crea una altra llista amb el teu cognom on cada posició correspongui a una lletra.

Fusiona les dues llistes en una sola. A més, afegeix una posició amb un espai buit entre la primera i la segona. És a dir, partim de la llista name i surname i al acabar l’execució només tindrem una que es dirà fullName.

    FullName: [‘N’, ‘A’, ‘M’, ‘E’, ‘ ‘, ‘S’, ‘U’, ‘R‘, ‘N’, ‘A’, ‘M’, ‘E’]
*/
import java.util.*;
public class LletresFase4 {

	public static void main(String[] args) {
		List<Character> name = new  ArrayList <Character>(5);
		List<Character> surname = new  ArrayList <Character>(5);
		List<Character> spacer = new  ArrayList <Character>(1);
		char[] charname, charsurname;
		
		charname = new char[5];
		charsurname = new char[5];
		String stringname = "Jordi";
		String stringsurname ="Bonet";
		charname = stringname.toUpperCase().toCharArray();
		charsurname = stringsurname.toUpperCase().toCharArray();
		for (int i =0;i<charname.length;i++) {
			name.add(charname[i]);
			}
		for (int i =0;i<charsurname.length;i++) {
				surname.add(charsurname[i]);	
			}
		spacer.add(' ');
		List<Character> Fullname = new ArrayList<Character>(11);
		Fullname.addAll(name);
		Fullname.addAll(spacer);
		Fullname.addAll(surname);
		System.out.println(Fullname);
	}

}

