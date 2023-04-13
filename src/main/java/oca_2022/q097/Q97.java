package oca_2022.q097;

public class Q97 {

	public static void main(String[] args) {
		
		StringBuilder sb = new StringBuilder("Java");
      String s = "Java";                        //object ile string i karsilastiramiyoruz. Karsilastirma yapmamiz icin toStiring kullanmamiz lazim
      //System.out.println(sb);
      //System.out.println(s);
      if (sb.toString().equals(s)){ //StringBuilder classinda equals methodu yok, bundan dolayi tostring ile string e cevirmemiz lazim
          System.out.println("Match 1");
      }else if(sb.equals(s)){
          System.out.println("Match 2");
      }else {
          System.out.println("No Match");
//      

	}
  }
}
		/*
		/What is the result?
		A. Match 1
		B. Match 2
		C. No Match
		D. A NullPointerException is thrown at runtime. 
		
		Answer: A
		*/

//second version
//StringBuilder sb = new StringBuilder(5);
//String s = "";
//if (sb.equals(s)){
//  System.out.println("Match 1");
//}else if(sb.toString().equals(s.toString())){
//  System.out.println("Match 2");
//}else {
//  System.out.println("Not Match");
//}

//third virdsion
//StringBuilder sb = new StringBuilder("Java");
//String s = "Java";
//if(sb.equals(s)){
//  System.out.println("Match 1");
//}else {
//  System.out.println("Not Match");
//}
