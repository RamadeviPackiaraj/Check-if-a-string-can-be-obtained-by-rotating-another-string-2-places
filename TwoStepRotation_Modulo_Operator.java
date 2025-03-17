//[Expected Approach] Direct Comparison Using Modulo Operator – O(n) time and O(1) space
import java.util.Scanner;
public class TwoStepRotation_Modulo_Operator{
    public boolean isRotated(String s1,String s2){
        int n=s1.length();
        boolean clockwise=true, auticlockwise=true;
        //check clockwise azamam
        for(int i=0;i<n;i++){
            if(s1.charAt(i)!=s2.charAt((i+2)%n)){
                clockwise=false;
                break;
            }
        }
        //aunti clockwise onamaz
        /*
i (index in s2)	s2.charAt(i)	(i+2) % 6	s1.charAt((i+2) % n)
0	'o'	(0+2) % 6 = 2	'o' ✅
1	'n'	(1+2) % 6 = 3	'n' ✅
2	'a'	(2+2) % 6 = 4	'a' ✅
3	'm'	(3+2) % 6 = 5	'm' ✅
4	'a'	(4+2) % 6 = 0	'a' ✅
5	'z'	(5+2) % 6 = 1	'z' ✅*/
        for(int i=0;i<n;i++){
            if(s1.charAt((i+2)%n)!=s2.charAt(i)){
                auticlockwise=false;
                break;
            }
        }
   return clockwise || auticlockwise;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        //cannot refered from static
        TwoStepRotation_Modulo_Operator t=new TwoStepRotation_Modulo_Operator();
        System.out.println("Enter the String 1:");
        String s1=sc.next();
        System.out.println("Enter String 2:");
        String s2=sc.next();
        System.out.println(t.isRotated(s1,s2));
    }
}