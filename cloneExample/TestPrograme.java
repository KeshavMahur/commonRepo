package cloneExample;

import java.util.Arrays;
import java.util.List;

public class TestPrograme {
    private static TestPrograme instense = null;
    private TestPrograme() {

    }

    public static TestPrograme getInstense(){
        if(instense == null){
            instense = new TestPrograme();
        }
        return instense;
    }


   /* public static boolean isAmagram(String s1,String s2){
        if(s1.length() != s2.length()){
            return false;
        }
        char[] c1 = s1.toLowerCase().toCharArray();
        char[] c2 = s2.toLowerCase().toCharArray();
        Arrays.sort(c1);
        Arrays.sort(c2);
         return Arrays.equals(c1,c2);
    }

    public static void findPare(int value,int []a) {
        for (int i =0;i<a.length-1;i++) {
            for (int j = i+1;j<a.length;j++){
                if(a[i]+a[j] == value){
                    System.out.println(a[i]+" "+a[j]);
                }
            }
        }
    }

    public static void main(String[] args) {
        *//*TestPrograme.findPare(5,new int[]{1,2,3,4,5,6,7,8,9});
        System.out.println(TestPrograme.isAmagram("ansh","ahna"));*//*
       List<Integer> listInt = Arrays.asList(1,2,3,4,5);

    }*/
}
