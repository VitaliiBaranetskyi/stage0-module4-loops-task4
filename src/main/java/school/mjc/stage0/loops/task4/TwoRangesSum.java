package school.mjc.stage0.loops.task4;

public class TwoRangesSum {
    public void printSumOfTwoRanges(int numberToSkip, int lastInRow) {
        int skippedSum = 0;
        int countedSum = 0;
        for(int  i = 1; i < lastInRow; i++){
            if(i == numberToSkip){
                skippedSum = countedSum + i;
                continue;
            }
            countedSum += i;
        }
        if(numberToSkip > lastInRow)
            System.out.println("number to skip is bugger then the last");
        else if(lastInRow < 0)
            System.out.println("last number in row is negative");
        else if(numberToSkip == lastInRow)
            System.out.println("skipped sum is " + (countedSum + numberToSkip) + "\ncounted sum is " + (countedSum=0));
        else
            System.out.println("skipped sum is " + skippedSum + "\ncounted sum is " + countedSum);
    }
}
