package LeetCode;

public class Leetcode_1057 {
    public static void main(String[] args) {
        int[][] workers1 = {{0, 0}, {2, 1}};
        int[][] bikes1 = {{1, 2}, {3, 3}};
        int[] result = assignBikes(workers1, bikes1);
        for (int i = 0; i < result.length; i++) {
            System.out.println("this is the result: " + result[i]);

        }
        int[][] workers2 = {{0, 0}, {1, 1}, {2, 0}};
        int[][] bikes2 = {{1, 0}, {2, 2}, {2, 1}};
        int[] result2 = assignBikes(workers2, bikes2);
        for (int i = 0; i < result2.length; i++) {
            System.out.println("this is the result 2: " + result2[i]);

        }
    }

    public static int[] assignBikes(int[][] workers, int[][] bikes) {
        int[] result = new int[workers.length];
        int[] workerWithBike = new int[workers.length];

        // 思路不对
        //这样的算法是看每一个去某一个车最近，然后骑走最近的车，先到的人可以先拿车
        //而这道题当中，是先看车，离哪个人最近，然后车就被最近的人骑走
        //然后剩下的人，就要去骑剩下的车，即使人离车很远
//        for (int i = 0; i < workers.length; i++) {
//            int smallestLength = Integer.MAX_VALUE;
//            for (int j  = 0; j < bikes.length; j++) {
//                System.out.println("The Manhattan Distance for worker " + i + " and bike " + j + " is " + getManhattanDistance(workers[i], bikes[j]));
//                if(getManhattanDistance(workers[i],bikes[j]) < smallestLength){
//                   smallestLength = getManhattanDistance(workers[i], bikes[j]);
//                   result[i] = i;
//               }
//            }
//
//            System.out.println("This is the smallest Length" + result[i]);
//
//        }


        //大体思路正确，但是没有由于是优先看车离哪个人最近，后面有可能有离同样的人更近的车
        for (int bike = 0; bike < bikes.length; bike++) {
            int smallestDistance = Integer.MAX_VALUE;
            for (int worker = 0; worker < workers.length; worker++) {
                if (workers[worker] != null) {

                    System.out.println("The Manhattan Distance for worker " + worker + " and bike " + bike + " is " + getManhattanDistance(workers[worker], bikes[bike]));
                    int distance = getManhattanDistance(workers[worker], bikes[bike]);
                    if (distance < smallestDistance) {
                        smallestDistance = distance;
                        result[bike] = worker;
                    }else if(distance == smallestDistance){

                    }
                }

            }
            workers[result[bike]] = null;
            System.out.println("worker with bike is now: " + workerWithBike[bike]);

        }

        return result;
    }

    public static int getManhattanDistance(int[] x1, int[] x2) {
        return Math.abs(x1[0] - x2[0]) + Math.abs(x1[1] - x2[1]);
    }

}
