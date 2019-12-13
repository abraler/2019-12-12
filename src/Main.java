import java.util.Scanner;
public class Main{
    public static int getTotalCount(int mountCount){
        if(mountCount==0||mountCount==1){
            return 1;
        }
        return (getTotalCount(mountCount-1)+getTotalCount(mountCount-2));

    }
    public static void main(String[]args){
        Scanner in=new Scanner(System.in);
        while(in.hasNext()){
            int a=in.nextInt();
            System.out.println(getTotalCount(a));
        }
    }
}