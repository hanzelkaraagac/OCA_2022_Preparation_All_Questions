package oca_2022.q136;

import java.util.ArrayList;
import java.util.List;

public class Question136 {
	public static void main(String[] args) {
		
	List<String> arrayList=new ArrayList<>();
	arrayList.add("Tech ");
	arrayList.add("Expert ");
	arrayList.set(0,"Java ");
	arrayList.forEach(a-> a.concat("Forum"));
	arrayList.replaceAll(s-> s.concat("Group"));
	System.out.println(arrayList);
	
	
	}	
}
/*
What is the result?
A. [JavaForum, ExpertForum]
B. [JavaGroup, ExpertGroup]
C. [JavaForumGroup, ExpertForumGroup]
D. [JavaGroup, TechGroup ExpertGroup]
Answer: B
*/