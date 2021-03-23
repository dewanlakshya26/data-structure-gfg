package array;
//Not Completed
public class TrappingRainWaterProblem {
    int trappingWater(int arr[], int n) {
        int waterCollected = 0;
        int beforePillar = arr[0];
        int afterPillar = arr[n-1];
        int afterPillarAd = arr[n-1];
        for (int i = 1; i < arr.length -1; i++) {
             beforePillar = Math.max(arr[i-1],beforePillar);
            int currentPillar = arr[i];
             afterPillar = Math.max(arr[i+1],arr[n-1]);
            System.out.println("before Pillar "+ beforePillar + "after pillar"+ afterPillar);
            if (beforePillar>currentPillar && afterPillar>currentPillar){
                waterCollected = waterCollected + Math.min(beforePillar,afterPillar) - currentPillar;


            }


        }
        return waterCollected;

    }
}
