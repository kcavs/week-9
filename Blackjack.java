import java.util.*;
public class Blackjack{
    public static void main(String[]args){
        int num1=(int)(9*Math.random()+1);
        int num2=(int)(9*Math.random()+1);
        int sum=(num1+num2);
        int d_num1= (int)(9*Math.random()+1);
        int d_num2= (int)(9*Math.random()+1);
        int d_sum=(d_num1+d_num2);
        int click;
        int num3= (int)(9*Math.random()+1);
        System.out.println("you have a(n) "+num1+" and a(n) "+num2+" for a total of "+sum);
        Scanner input= new Scanner(System.in);
        System.out.println("enter a 1 if you want another card, or click any other for no card");
        click= input.nextInt();
        if(click!=1){
            System.out.println("dealer has a(n) "+d_num1+" and a(n) "+d_num2+" for a total of "+d_sum);
            if((d_sum>sum)&&(d_sum<21)){
                System.out.println("dealer wins!");
            }
            if((sum>d_sum)&&(sum<21)){
                System.out.println("player wins!");
            }
            if(d_sum>21){
                System.out.println("player wins! dealer busted.");
            }
            if(sum>21){
                System.out.println("dealer wins! player busted.");
            }
        }
        if (click==1){
            sum=sum+num3;
            System.out.println("you have a(n) "+num1+", a(n) "+num2+", and a(n) "+num3+ " for a total of "+sum);
            if((d_sum>sum)&&(d_sum<21)){
                System.out.println("dealer wins!");
            }
            if((sum>d_sum)&&(sum<21)){
                System.out.println("player wins!");
            }
            if(d_sum>21){
                System.out.println("player wins! dealer busted.");
            }
            if(sum>21){
                System.out.println("dealer wins! player busted.");
            }
        }

    }
}