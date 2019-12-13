// write your code here  
import java.util.*;
public class Main1{
    public static void main(String[]args){
        Scanner in=new Scanner(System.in);
        while(in.hasNext()){
            StringBuffer a=new StringBuffer(in.nextLine());
            StringBuffer b=a;
            for(int i=0;i<a.length();i++){
                if(a.charAt(i)=='A'){
                    b.setCharAt(i,'V');
                }else if(a.charAt(i)=='B'){
                    b.setCharAt(i,'W');
                }else if(a.charAt(i)=='C'){
                    b.setCharAt(i,'X');
                }else if(a.charAt(i)=='D'){
                    b.setCharAt(i,'Y');
                }else if(a.charAt(i)=='E'){
                    b.setCharAt(i,'Z');
                }else if(a.charAt(i)==' '){
                    b.setCharAt(i,' ');
                }else{
                    char s=a.charAt(i);
                    int t=s-5;
                    b.setCharAt(i,(char)t);
                }
            }
            System.out.print(b);
        }
    }
}