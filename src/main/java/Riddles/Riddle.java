package Riddles;

public abstract class Riddle {

    private String riddle;
    private String answer;
    private int prizeCoins;

    public Riddle(String riddle, String answer, int prizeCoins) {
        this.riddle = riddle;
        this.answer = answer;
        this.prizeCoins = prizeCoins;
    }

    public String getRiddle() {
        return riddle;
    }

    public String getAnswer() {
        return answer;
    }

    public int getPrizeCoins() {
        return prizeCoins;
    }



}
