package ex3;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
//		inthongtin("minh");
//		ArrayList<Integer> listInt =new ArrayList<Integer>();
//		listInt.add(1);
//		listInt.add(2);
//		listInt.add(4);
//		listInt.add(5);
//		listInt.add(3);
//		
//		inday(listInt);
		
		MyMap<Integer,String> mymap= new MyMap<Integer,String>();
		mymap.push(1, "minh");
		
	}
	public static <T> void inthongtin (T a) {
		System.out.println(a);
	}
	
	public static <T> void inday(ArrayList<T> day ) {
		System.out.println("day mong muon la:");
		for(int i=0;i<day.size();i++) {
			System.out.println(day.get(i));
		}
		
	}
}
