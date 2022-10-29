class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        if (boxTypes == null || boxTypes.length == 0) {
            return 0;
        }
        
        // sort the array according to weights
        Arrays.sort(boxTypes, (a, b) -> (b[1] - a[1]));
        
        /*
        checking the sorted array
        for (int[] b: boxTypes) {
            System.out.print(Arrays.toString(b));
        }
        */
        
        
        int res = 0;
        
        // loop through sorted array;
        for (int[] box : boxTypes) {
            
            // if #units < truck capacity -> give full weight*#units to truck
            if (box[0] <= truckSize) {
                res += (box[0]*box[1]);
                
                // update the truck size;
                truckSize -= box[0];
                
                // if truck is full
                if (truckSize == 0) {
                    return res;
                }
            // else give remaining truck size units to truck with weights
            } else if (box[0] > truckSize) {
                res += (truckSize*box[1]);
                return res;
            }
        }
        
        // return solution;
        return res;
    }
}




