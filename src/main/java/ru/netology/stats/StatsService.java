package ru.netology.stats;

public class StatsService {
    public int findSum(int[] monthResult) {
        int sum = 0;
        for (int i : monthResult) {
            sum += i;

        }
        return sum;
    }



    public int average(int[] monthResult) {

        return findSum(monthResult) / monthResult.length;
    }



    public int maxSales(int[] monthResult) {
        int max = 0;
        int month = 0;
        for (int i : monthResult) {
            if (i>= monthResult[max]) {
                max=month;
            }
            month=month+1;
        }
        return max+1;
    }
    public int minSales(int[] monthResult) {
        int min = 0;
        int month = 0;
        for (int i : monthResult) {
            if (i <= monthResult[min]) {
                min = month;
            }
            month = month + 1;
        }
        return min + 1;
    }

    public int belowAverage(int[] monthResult) {
        int belowAverage = 0;
        for (int i : monthResult) {
            if (i < average(monthResult)) {
                belowAverage = belowAverage + 1;
            }


//        for (int i = 0; i < monthResult.length; i++) {
//            int x = monthResult[i];
//
//            if (x < average(monthResult)) {
//                belowAverage = belowAverage + 1;
//            }
//
//
//
//        }
//        return belowAverage;
        }
        return belowAverage;
    }

    public int overAverage(int[] monthResult) {
        int overAverage = 0;
        for (int i : monthResult) {
            if (i > average(monthResult)) {
                overAverage = overAverage + 1;
            }


        }
        return overAverage;
    }


}


