import java.util.*;
public class Main3{
    public static void main(String[]args){
        Scanner in=new Scanner(System.in);
        while(in.hasNext()){
            StringBuffer a=new StringBuffer(in.nextLine());
            for (int i = 0; i <a.length() ; i++) {
                char b=a.charAt(i);
                for (int j = i+1; j <a.length() ; j++) {
                    if(b==a.charAt(j)){
                        a.deleteCharAt(j);
                        j--;
                    }
                }
            }


            System.out.println(a);
        }
    }
}