package JavaBasic.ch05.ex;

public class ex8 {
    public static void main(String[] args) {
        int[][] arr = {
                {95, 86},
                {83, 92, 96},
                {78, 83, 93, 87, 88}
        };

        int sum = 0;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                sum += arr[i][j];
                count++;
            }
        }
        double avg = (double) sum / count;

        System.out.println("sum = " + sum);
        System.out.println("avg = " + avg);
    }
}
