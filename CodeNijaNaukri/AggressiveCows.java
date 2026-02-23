import java.util.Arrays;

public class AggressiveCows {
    public static int aggressiveCows(int []stalls, int k) {
        Arrays.sort(stalls);
        int start = 1;
        int end = stalls[stalls.length - 1] - stalls[0];
        int ans = 0;

        while(start<= end){
            int mid = start+ (end - start) / 2;

            if(place(stalls, k, mid)){
                ans = mid;
                start = mid+ 1;
            }else{
                end = mid - 1;
            }
        }
        return ans;
    }

    public static boolean place(int[] stalls, int k, int dist){
        int cow = 1, last = stalls[0];
        for(int i = 1; i < stalls.length; i++){
            if(stalls[i] - last >= dist){
                cow++;
                last = stalls[i];
            }
            if(cow >=k) return true;
        }
        return false;
    }
    public static void main(String[] args) {
        int []stalls = {1, 2, 3};
        int k = 2;
        System.out.println(aggressiveCows(stalls, k));
    }
}
