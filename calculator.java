import java.util.Scanner;

class calculator{
    public static void add(int a, int b)
    {
        int sum=a+b;
        System.out.println(sum);
    }
    public static void sub(int a, int b)
    {
        int sub=a-b;
        System.out.println(sub);
    }
    public static void mul(int a , int b)
    {
        int mul=a*b;
        System.out.println(mul);
    }

    public static void div(int a , int b) {
        int div=a/b;
        System.out.println(div);
    }

    public static void main(String[] args)
    {
        Scanner obj= new Scanner(System.in);
       
        System.out.println("Enter a input to perform operation:");
        System.out.println("Choose below options:");
        System.out.println("1.Addition");
        System.out.println("2.Substraction");
        System.out.println("3.Multiplication");
        System.out.println("4.Division");
        System.out.println("5.Exit");
        int choice=obj.nextInt();
        switch(choice)
        {
            case 1: System.out.println("Enter a and b :");
            int a=obj.nextInt();
            int b=obj.nextInt();
            add(a,b);
            break;
            
            case 2: System.out.println("Enter a and b :");
            a=obj.nextInt();
            b=obj.nextInt();
            sub(a,b);
            break;

            case 3: System.out.println("Enter a and b :");
            a=obj.nextInt();
            b=obj.nextInt();
            mul(a,b);
            break;

            case 4: System.out.println("Enter a and b :");
            a=obj.nextInt();
            b=obj.nextInt();
            div(a,b);
            break;

            case 5: System.out.println("Exiting");
            break;
              
            default:System.out.println("choose correct option...");
            break;
          

        }
    }
    

}
