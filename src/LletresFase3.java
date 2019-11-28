import java.util.*;

public class LletresFase3 {

	public static void main(String[] args) {

		Map<Character, Integer> nameMap = new LinkedHashMap<Character, Integer>();
		String name = "Jordi Bonet";
		char[] myname = name.toUpperCase().toCharArray();
		for (int i=0;i<myname.length;i++) {
		int value=1;
			if(!nameMap.containsKey(myname[i])){
				nameMap.put(myname[i],value);
		}
			else { 
				value=nameMap.get(myname[i]);
				nameMap.put(myname[i],value+1);
				}
		}
			System.out.println(nameMap);
	}
			
}
	


