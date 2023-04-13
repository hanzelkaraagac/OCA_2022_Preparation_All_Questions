package oca_2022.q141;

public class Question141 {
	
	public static void main(String[] args) {
        String names [] = {"Thomas", "Peter", "Joseph"};
        String pwd [] = new String[3];
        int idx = 0;
        try{
            for(String n : names){
                pwd[idx] = n.substring(2,6);  //ilk yazilan deger include ama son yazilan deger include olmaz substring de
              System.out.println(pwd[idx]);
                idx++;
            }
        }
        catch (Exception e){
            System.out.println("Invalid Name");
            //e.printStackTrace(); //con
        }
//        for (String p : pwd){   //pwd[] = {omas, null, null} 2.create edilen array pwd
//            System.out.println(p);
//        }
	}
    //What is result?

//A
// Invalid Name

//B
// Invalid Name
// omas

//C
// Invalid Name
// omas
// null
// null

//D
// omas
// ter
// seph

//A.	Option A
//B.	Option B
//C.	Option C
//D.	Option D
//Answer: C

    //second version


    }








	


