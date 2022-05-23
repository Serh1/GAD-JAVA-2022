package Lecture7_Concurrency.Ch3;

import java.util.Objects;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        while (true) {
            Integer monitor = 1;
            Player player1 = new Player(monitor);
            Player player2 = new Player(monitor);
            player1.start();
            player2.start();
            Thread.sleep(500 + 100);
            System.out.println(player1 + " vs " + player2);
            System.out.println("Winner is: " + playGame(player1, player2));
        }
    }

    public static Player playGame(Player p1, Player p2) {
        if (Objects.equals(p1.getResult(), "ROCK") && Objects.equals(p2.getResult(), "SCISSORS")) {
            return p1;
        } else if (Objects.equals(p1.getResult(), "ROCK") && Objects.equals(p2.getResult(), "PAPER")) {
            return p2;
        } else if (Objects.equals(p1.getResult(), "ROCK") && Objects.equals(p2.getResult(), "ROCK")) {
            return null;
        }
        if (Objects.equals(p1.getResult(), "SCISSORS") && Objects.equals(p2.getResult(), "PAPER")) {
            return p1;
        } else if (Objects.equals(p1.getResult(), "SCISSORS") && Objects.equals(p2.getResult(), "ROCK")) {
            return p2;
        } else if (Objects.equals(p1.getResult(), "SCISSORS") && Objects.equals(p2.getResult(), "SCISSORS")) {
            return null;
        }
        if (Objects.equals(p1.getResult(), "PAPER") && Objects.equals(p2.getResult(), "ROCK")) {
            return p1;
        } else if (Objects.equals(p1.getResult(), "PAPER") && Objects.equals(p2.getResult(), "SCISSORS")) {
            return p2;
        } else if (Objects.equals(p1.getResult(), "PAPER") && Objects.equals(p2.getResult(), "PAPER")) {
            return null;
        }
        return null;
    }


}
