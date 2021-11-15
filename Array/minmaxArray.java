public class minmaxArray {

    static class Pair{
        int min;
        int max;
    }

    static Pair getMinMax (int arr[], int n){
        Pair minmax = new Pair();
        int i;

        // array contains just single element
        if (n == 1 ){
            minmax.min = arr[0];
            minmax.max = arr[0];
        }

        // check if first element is greater than second element
        if ( arr[0] > arr[1]){
            minmax.min = arr[1];
            minmax.max = arr[0];
        }
        else {
            minmax.min = arr[0];
            minmax.max = arr[1];
        }

        // check for rest of the elements
        for (i =2; i<n; ++i){
            if(arr[i]> minmax.max){
                minmax.max = arr[i];
            }
            else if(arr[i] < minmax.min){
                minmax.min = arr[i];
            }
        }

        return minmax;
    }
    public static void main(String[] args){
        int arr[] = {120,9,0,1,30,999,20};
        int n = 7;
        Pair minmax = getMinMax(arr,n);
        System.out.println("Maximum element is " + minmax.max);
        System.out.println("Minimum element is " + minmax.min);
    }
}
