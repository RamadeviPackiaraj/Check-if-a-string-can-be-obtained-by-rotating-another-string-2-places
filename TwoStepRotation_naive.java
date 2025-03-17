//time O(n) space O(n)
import java.util.Scanner;
public class TwoStepRotation_naive{
    public boolean isRotated(String s1,String s2){
        if(s1.length()!=s2.length()){
            return false;
        }
        //if the length is s2
        if(s1.length()<=2||s2.length()<=2){
            return s1.equals(s2);
        }
        //Initialize strings to store the clockwise and anti-clockwise rotations of s2
        String clock="";// amazon-> 
        String anticlock="";
        int len=s2.length();
        anticlock=s2.substring(len-2)+s2.substring(0,len-2);
        //str2.substring(6 - 2) = "on" str2.substring(0, len - 2) = "amaz"
        clock=s2.substring(2)+s2.substring(0,2);
        return s1.equals(clock)||s1.equals(anticlock);

    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        //cannot refered from static
        TwoStepRotation_naive t=new TwoStepRotation_naive();
        System.out.println("Enter the String 1:");
        String s1=sc.next();
        System.out.println("Enter String 2:");
        String s2=sc.next();
        System.out.println(t.isRotated(s1,s2));
    }
}