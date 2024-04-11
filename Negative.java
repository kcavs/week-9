public class Negative{
    public static void main(String[]args){
        int num1= (int)(7*Math.random());
        int num2= (int)(7*Math.random());
        int num3= (int)(7*Math.random());
        int num4= (int)(7*Math.random());
        int sum= (num1+num2+num3+num4);
        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);
        System.out.println(num4);
        System.out.println(sum);
        if(sum>=0){
            System.out.println("not negative");
        }
        if(sum<0){
            System.out.println("negative");
        }
    }
}