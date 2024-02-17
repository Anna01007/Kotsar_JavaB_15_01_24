package hw4;

public class WarLiMin {
    public static void main(String[] args) {
        // Li Dynasty
        int liWarriorAttack = 13;
        int liArcherAttack = 24;
        int liHorsemanAttack = 46;
        int liCount = 860;

        // Min Dynasty
        int minWarriorAttack = 9;
        int minArcherAttack = 35;
        int minHorsemanAttack = 12;
        double countMore = 1.5; // count Min more than 1.5 times
        int minCount = (int) (liCount * countMore);

        // count total attack for both dynasties
        int liTotalAttack = (liWarriorAttack * liCount) + (liArcherAttack * liCount) + (liHorsemanAttack * liCount);
        int minTotalAttack = (minWarriorAttack * minCount) + (minArcherAttack * minCount) + (minHorsemanAttack * minCount);
        System.out.println("Li Dynasty Attack Rate: " + liTotalAttack);
        System.out.println("Min Dynasty Attack Rate: " + minTotalAttack);
    }
}
