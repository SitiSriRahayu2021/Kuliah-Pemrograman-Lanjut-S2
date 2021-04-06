package ExceptionsListsThreadsFiles;

import java.util.*;
public class BowlingGame {
    HashMap<String, Integer> players;
    BowlingGame() {
        players = new HashMap<String, Integer>();
    }
    public void addPlayer(String name, int p) {
        players.put(name, p);
    }
    //your code goes here
    public void getWinner(){
        String best="";
        Iterator<Map.Entry<String,Integer>> it =players.entrySet().iterator();
        int max=0;
        while(it.hasNext()){

            String playerName=it.next().getKey();
            Integer checkVal=players.get(playerName);
            if (checkVal>=max){

                max=checkVal;
                best=playerName;
            }

        }

        System.out.println(best);
    }

}

class Program {
    public static void main(String[ ] args) {
        BowlingGame game = new BowlingGame();
        Scanner sc = new Scanner(System.in);

        for(int i=0;i<3;i++) {
            String input = sc.nextLine();
            String[] values = input.split(" ");
            String name = values[0];
            int points = Integer.parseInt(values[1]);
            game.addPlayer(name, points);
        }
        game.getWinner();
    }
}

