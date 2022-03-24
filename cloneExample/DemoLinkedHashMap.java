package cloneExample;

public class DemoLinkedHashMap {
    public static boolean isMagram(String s1,String s2){
        if(s1.length() != s2.length()){
            return false;
        }else {
          char[] c =  s1.toCharArray();

            for (char c2:c) {
                String s= String.valueOf(c2);
                if(!s2.contains(s)){
                    return false;
                }
            }
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(isMagram("aash","shna"));
    }
}
