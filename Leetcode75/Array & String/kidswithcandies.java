import java.lang.reflect.Array;
import java.util.*;
class kidswithcandies{
    public List<Boolean> kidswithcandies(int[] candies, int extraCandies){
        List <Boolean> result = new ArrayList<>();
        int max = 0;
        for (int i =0; i<candies.length; i++){
            if(candies[i]> max){
                max = candies[i];
            }
        }
        for(int i =0; i<candies.length;i++){
            int total = candies[i]+ extraCandies;
            if(total >= max){
                result.add(true);
            }
            else{
                result.add(false);
            }
        }
        return result; 
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n=sc.nextInt();
        System.out.println("Enter elements in an array:");
        int candies [] =new int [n] ;
        for(int i=0;i<n;++i){
            candies[i]=sc.nextInt();}
        System.out.println("Candies = "+Arrays.toString(candies));
        int extraCandies = sc.nextInt();
        System.out.println("extraCandies = "+extraCandies);
        
        kidswithcandies obj = new kidswithcandies ();
        List<Boolean> result =obj .kidswithcandies(candies , extraCandies );
        for (int i = 0; i < result.size(); i++) {
            boolean canHaveMostCandies = result.get(i);
            System.out.println("Child " + i + " can have the most candies: " + canHaveMostCandies);
        }
            System.out.println("Result = "+result);

    }
}
