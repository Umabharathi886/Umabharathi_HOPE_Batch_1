

public class FineCalculator {

    public int calculateFine(int delayDays){

        if(delayDays <= 5)
            return delayDays * 2;

        else if(delayDays <= 10)
            return delayDays * 5;

        else
            return delayDays * 10;
    }
}
