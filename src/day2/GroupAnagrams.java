package day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class GroupAnagrams {

	public static void main(String[] args) {
		String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
		groupAnagrms(strs);
		
//		Map<String,Integer> emps=new TreeMap<String, Integer>();
//		emps.put("Alice", 800);
//		emps.put("David", 900);
//		emps.put("Elcid", 1000);
//		emps.put("Ben", 900);
//		emps.put("Chris", 1000);
//		
//		
//		
//		System.out.println(emps);
//		
//		Map<String,Student> m100=new HashMap();
//		
//		m100.put("first", new Student(18,"Virat",78.5));
//		m100.put("second", new Student(45,"Rohit",88.5));
//		m100.put("third", new Student(33,"Hardik",78.5));
//		
//		
//		Map<String,Student> m200=new HashMap();
//		
//		m200.put("first", new Student(16,"Shubman",48.5));
//		m200.put("second", new Student(17,"Abhishek",58.5));
//		m200.put("third", new Student(95,"Shreyas",56.5));
//		
//		//display name of student who has come 1st in 100m race  - Virat
//		
//		System.out.println(m100.get("first").getSname());
//		
//		//display per of student who has come 3rd in 200m race  - 56.5
//		
//		System.out.println(m200.get("third").getPer());
//		
//		List<Map<String,Student>> olympic=new ArrayList();
//		olympic.add(m100);  //0
//		olympic.add(m200);  //1
//		
//		//using olympic display name of student who has come 1st in 100m race  - Virat
//		
//		System.out.println(olympic.get(0).get("first").getSname());
//		
//		//using olympic display per of student who has come 3rd in 200m race  - 56.5
//		
//		System.out.println(olympic.get(1).get("third").getPer());
//		
//		//display name of all students who have stood first in the races 100,200
//		
//		for(int i=0;i<olympic.size();i++)
//		{
//			System.out.println(olympic.get(i).get("first").getSname());
//		}
//		
	}
	
	//String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};

	private static void groupAnagrms(String[] strs) {
		Map<String,List<String>> anagrams=new HashMap();
		
		for(String str:strs)		//str ate
		{                                                       //       key  value
			char chars[]=str.toCharArray(); // ['a' , 't', 'e']			 aet  [eat,tea,ate]
			Arrays.sort(chars);             // ['a' , 'e', 't']			 ant  [tan]
			
			String key=new String(chars);   //"aet"
			
			anagrams.putIfAbsent(key, new ArrayList());
			anagrams.get(key).add(str);//
			
		}
		System.out.println(anagrams.values());
	}

}
