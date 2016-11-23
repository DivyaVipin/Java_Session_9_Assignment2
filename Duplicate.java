import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * 
 */

/**
 * @author DivyaVipin
 *
 */
public class Duplicate {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] names={"Divya","Vipin","Divya","Dhanya","Aneesh","Vidyuth","Arjun","Vipin","Anitha","Aneesh"};
		List<String> list=Arrays.asList(names);
		System.out.printf("%s",list);
		System.out.println();
		Set<String> set=new HashSet<String>(list);
		System.out.printf("%s",set);
		
		
	}

}
