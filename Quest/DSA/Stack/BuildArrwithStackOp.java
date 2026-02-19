import java.util.ArrayList;

public class BuildArrwithStackOp {
    public ArrayList<String> buildArray(int[] target, int n) {
        ArrayList<String> res = new ArrayList<>();
        int i = 0;
        for(int num : target){
            while (i < num - 1){
                res.add("Push");
                res.add("Pop");
                i++;
            }
            res.add("Push");
            i++;
        }
        return res;
    }
    public static void main(String[] args) {
        BuildArrwithStackOp obj = new BuildArrwithStackOp();
        int[] target = {1,3};
        int n = 3;
        System.out.println(obj.buildArray(target, n));
    }
}
