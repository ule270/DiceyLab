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
//            bins.incrementBin(rollResult);
        }
    }

    public void printResults() {
        String result = String.format("***\nSimulation of %d dice tossed for %d times.\n***\n",numberOfDies,numberOfTosses);

    }

    // method to generate a string of stars based on a percentage
        public String printStars(double percentage) {
        String stars = "";
        for(double i = 0.0; i <percentage;  i+=0.01) {
            stars +=  "*";
        }
        return stars;
    }
    public static void main(String[] args) {
        Simulation simulation = new Simulation(2,1000000);
        simulation.runSimulation();
        simulation.printResults();
    }
//     print number of lines equal to the max range - min range
// <rollResult> :   <numberOfOccurrences>: <numberOfOccurrences/numberOfTosses> <>
}
