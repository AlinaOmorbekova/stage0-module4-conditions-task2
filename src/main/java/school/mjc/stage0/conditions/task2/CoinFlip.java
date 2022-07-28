package school.mjc.stage0.conditions.task2;

public class CoinFlip {
    public void throwCoin(int from1UpTo1000) {
        boolean isEagle = from1UpTo1000 < 500;
        boolean isTail = from1UpTo1000 > 500;
        if (isEagle){
            System.out.println("Eagle");
        }
        else{
            System.out.println("Tail");
        }

    }
}
