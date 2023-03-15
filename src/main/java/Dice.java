public class Dice {
    Dice dice = new Dice ();
    private int sum;
    private int value;

    public Integer roll(){
        value = (int) (Math.random()*6);
        return value;
    }
    public Integer getSum() {
        return sum;
    }


}
