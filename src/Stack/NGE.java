package Stack;
import java.util.Stack;

public class NGE {

    public static void main(String[] args) {

        int ht[] = {100,80,60,70,60,75,85};
        Stack<Integer> vis = new Stack<>();
        vis.push(0);
        int nge[] = new int[ht.length];

        for(int curr=1; curr<ht.length; curr++){
            while(!vis.isEmpty() && ht[vis.peek()] < ht[curr]){
                nge[vis.pop()] = ht[curr];
            }
            vis.push(curr);
        }
        while(!vis.isEmpty()){
            nge[vis.pop()] = -1;
        }

        for(int i=0; i< nge.length; i++){
            System.out.println(" nge of " + ht[i] + " is " + nge[i]);
        }
    }
}
