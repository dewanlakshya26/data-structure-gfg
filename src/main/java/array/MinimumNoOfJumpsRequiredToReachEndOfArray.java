package array;

public class MinimumNoOfJumpsRequiredToReachEndOfArray {
    int jump = -1;
    public int minJumps(int[] input, int length){

        int step = 0;
        int jumpValue = 0;
        int jumpIndex = 0;


            while (jumpIndex <= length){
                jumpIndex = jumpValue+jumpIndex;
                System.out.println("before "+ " "+jump +" "+jumpValue + " "+ jumpIndex);
                if (jumpIndex>=length){
                    return jump;
                }
                jumpValue = j1(input,jumpIndex) ;


                System.out.println("after "+ " "+jump +" "+jumpValue+ " "+ jumpIndex);
            }


        return jump;
    }
    //{1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9 }
    //{1 ,4 ,3 ,2, 6, 7}

    private int j1(int[] input, int j) {
        jump = jump+1;
        return input[j];
    }
}
