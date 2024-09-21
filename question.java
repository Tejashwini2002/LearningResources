/* To return pair of integers from array which add up to give the given sum. */
import java.util.*;
import java.io.*;
public class question {
        public static void main(String[] args) {
            int sum=6;
            int []a={1,4,2,6,5,5,-1,7};
    
            List<List<Integer>> res=given(a,sum);

            for(List<Integer> i:res){
                System.out.println("("+i.get(0)+","+i.get(1)+")");
            }
            
        }
        private static List<List<Integer>> given(int []a,int sum){
            HashSet<Integer> set=new HashSet<>();
            List<List<Integer>> li=new ArrayList<>();
            for(int i:a){
                
                if(set.contains(sum-i)){
                    List<Integer> li1=new ArrayList<>();
                    li1.add(sum-i);
                    li1.add(i);
                    li.add(li1);
                }
                set.add(i);
                
            }
            return li;
        }
    }
// OUTPUT:
/*
(4,2)
(1,5)
(1,5)
(-1,7)
*/