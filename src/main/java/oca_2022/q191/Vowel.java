package oca_2022.q191;

 class Vowel {
    private char var;

    public static void main(String[] args) {
        char var1 = 'a';
        char var2 = var1;
        var2 = 'e';

        Vowel obj1 = new Vowel();
        Vowel obj2 = obj1;  // **************
       // Vowel obj2 = new Vowel();  // **************
        // object are equalized, so change on any one of them will affect both
        obj1.var = 'o';  // both are o
        obj2.var = 'i'; // both are i
        
        System.out.println(var1+ ", " +var2 );
        System.out.println(obj1.var+ ", " +obj2.var);
    }
}

/*
* What is the result?
* A. a, ei, i
B. a, eo, o
C. e, ei, i
D. a, ao, o
*
*
* Answer: A
* */
