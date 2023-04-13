package oca_2022.q199;

public class Q199 {
    public static void main(String[] args) {
        String stuff = "TV";
        String res = null;

        if (stuff.equals("TV")) {
            res = "Walter";
        } else if (stuff.equals("Movie")) {
            res = "White";
        } else {
            res = "No Result";
        }
    }
}

/*
A) stuff.equals("TV") ? res = "Walter": stuff.equals("Movie") ? res = "White" : res = "No Result";
B) res = stuff.equals("TV") ? "Walter" else stuff.equals("Movie") ? "White" : "No Result";
C) res = stuff.equals("TV") ? stuff.equals("Movie") ? "Walter" : "White" : "No Result";
D) res = stuff.equals("TV") ? "Walter": stuff.equals("Movie") ? "White" : "No Result";

D sikki dogru cevap cunku esit sayida ':' ve '?' olmasi lazim (2'ser tane). C sikkinda "Walter" yanlis yerde; B sikkinda 'else' kullanilmamali.
A sikkinda 'res' ler yanlis yerdeler
 */