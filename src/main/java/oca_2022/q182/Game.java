package oca_2022.q182;

import java.util.ArrayList;
import java.util.List;

class Player{

}

interface Playable{
    public void play();
    public void setPlayers(List<Player> players);
}

class Game implements Playable{
    private List<Player> players;
    public List <Player> getPlayers(){
        return players;
    }
    public void setPlayers(List<Player> players){
        this.players = players;
    }
    public void play(){
        System.out.println("Played.");
    }

    public static void main(String[] args) {
        Playable p = new Game();
        List<Player> players = new ArrayList<>();
        p.setPlayers(players);
        p.play();
    }
}

/*

Which statement is true about the implementation of Object-Oriented Programming concepts in the given code?
A. Polymorphism, abstraction, and encapsulation are implemented.
B. Only polymorphism and inheritance are implemented.
C. Polymorphism, inheritance, and abstraction are implemented.
D. Only inheritance and encapsulation are implemented.
Answer:
Played.
* */
