public class Simulation {
    Integer numberOfDies;
    Integer numberOfTosses;

    Dice dice;

    Bins bins;

    public Simulation(Integer numberOfDies, Integer numberOfTosses){
        this.numberOfDies = numberOfDies;
        this.numberOfTosses = numberOfTosses;
        this.dice = new Dice(numberOfDies);
        this.bins = new Bins(numberOfDies, numberOfDies * 6);
    }
    public void runSimulation(){
        for (int i = 0; i < numberOfTosses; i++){
            Integer rollResult = dice.tossAndSum();
            // increases the result occurrence in bin rolled by 1
            bins.incrementBin(rollResult);
        }
    }
//     print number of lines equal to the max range - min range
// <rollResult> :   <numberOfOccurrences>: <numberOfOccurrences/numberOfTosses> <>


}
