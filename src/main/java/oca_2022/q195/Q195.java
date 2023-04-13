package oca_2022.q195;

public class Q195 {
    public static void main(String[] args) {
        String shirts[][] = new String[2][2];
        shirts[0][0] ="red";
        shirts[0][1] ="blue";
        shirts[1][0] ="small";
        shirts[1][1] ="medium";

      for(String [] c : shirts){
      for (String s : c){
          System.out.print(s+":");

      }

  }
        System.out.println("\n");


//Which code fragment prints red: blue: small: medium?
////A
//        for(int index = 1; index <2; index++){
//            for(int idx = 1; idx <2; idx++){
//                System.out.print(shirts[index][idx]+":");
//            }
//        }
////B
////        for(int index = 0; index <2; ++index){
////            for(int idx = 0; idx <index; ++idx){
////                System.out.print(shirts[index][idx]+":");
////            }
////        }
////C
//        for(String [] c : shirts){
//            for (String s : c){
//                System.out.print(s+":");
//            }
//        }
////D
        for(int index = 0; index <2; ){
            for(int idx = 0; idx <2; ){
                System.out.print(shirts[index][idx]+":");
                idx++;
            }
            index++;
        }
    }
}

//A.	Option A
//B.	Option B
//C.	Option C
//D.	Option D
//Answer D

//Diger kaynakta siklar farkliydi diye not alinmis ama cevap C sikki

