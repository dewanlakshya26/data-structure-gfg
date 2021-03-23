package array;

public class MergeOverlapingIntervalAndReturnAnArrayOfNonOverlappingInterval {
    public int[][] merge(int[][] intervals) {
        for (int i = 0,j=i+1; j < intervals.length; i++,j++) {
            int[] first = intervals[i];
            int[] second = intervals[j];
            if(first[1]>=second[0]){

                intervals = mergeIt(intervals,i,j);
            }
        }
        return intervals;
    }

    private int[][] mergeIt(int[][] intervals, int i, int j) {
        int first = Math.min(intervals[i][0], intervals[j][0]);
        int second = Math.max(intervals[j][1],intervals[i][1]);
        intervals[i] = new int[]{first,second};
        int[][] copyArray = new int[intervals.length -1][] ;
        for (int i1 = 0,j1 = 0; i1 < intervals.length; i1++) {
            if (i1 !=j){
                copyArray[j1++] = intervals[i1];
            }
        }
        return copyArray;
    }
}
