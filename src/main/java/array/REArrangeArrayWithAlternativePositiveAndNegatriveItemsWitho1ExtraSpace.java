package array;

public class REArrangeArrayWithAlternativePositiveAndNegatriveItemsWitho1ExtraSpace {

    public int[] rearrange(int[] input, int length){
        int positivePosition = 0;
        int negativePosition = 0;
        while (positivePosition< length-2 && negativePosition<length-2  ){
            if (input[positivePosition]< 0){
                positivePosition++;
            }
            else if (input[negativePosition]>0){
                negativePosition++;
            }

            if (input[positivePosition]> 0&& input[negativePosition]<0){
                int temp = input[positivePosition+1];
                input[positivePosition+1]=input[negativePosition];
                input[negativePosition] = temp;
                positivePosition++;
                negativePosition++;
            }
            System.out.println("hi");
           //
            // [-4, 2, 3, 1, -1, 4]
        }
        return input;
    }
}
