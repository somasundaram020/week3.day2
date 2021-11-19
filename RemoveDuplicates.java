package learn.collection;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text = "We learn java basics as part of java sessions in java week1";
		String[] split = text.split(" ");
		int length = split.length;
		//print the array
		for (int i = 0; i < length; i++) {
			System.out.println(split[i]);
		}
		//Converting Array to List  
		List<String> ref=new ArrayList<String>();
		for(String t:split) {
			ref.add(t);
		}
		
		//printing list
		System.out.println(ref);
		
		//removing duplicates
		Set<String> data = new LinkedHashSet<String>(ref); 
		System.out.println(data);
	}

}
