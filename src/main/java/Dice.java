public class Dice {
    Integer numberOfDice;
    private int sum;

    private int randomNumber;

    public Dice(Integer numberOfDice){
        this.numberOfDice = numberOfDice;
    }
    public Integer tossAndSum(){
        // rolling one die at a time, then adding the sum of results of roll
        for (int i = 0; i < numberOfDice; i++) {
            randomNumber = (int) (Math.random()*(6-1)) + 1;
            sum += randomNumber;
        }
        return sum;
    }



}
