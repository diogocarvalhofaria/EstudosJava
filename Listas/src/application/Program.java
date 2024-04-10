package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		list.add("pepino");
		list.add("uan");
		list.add("pepino");
		list.add("uan");
		list.add("pepino");

		

		for (String mang : list) {
			System.out.println(mang);
		}
		
		System.out.println("Removendo os pepinos do uan: ");
		list.removeIf(x -> x.charAt(0) == 'p');
		for (String x : list) {
			System.out.println(x);
		}
		System.out.println("---------------------------------------------");
		System.out.println("Index of uan: " + list.indexOf("uan"));
		System.out.println("Index of uan: " + list.indexOf("chheira"));
		System.out.println("---------------------------------------------");
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'u').collect(Collectors.toList());
		
		for (String x : result) {
			System.out.println(x);
			
		}
		System.out.println("---------------------------------------------");
		String name = list.stream().filter(x -> x.charAt(0) == 'u').findFirst().orElse(null);
		System.out.println(name);

	}

}
