package Task2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        while(true) {

            System.out.print("Введите число : ");
            try{

                Scanner sc = new Scanner(System.in);
                String input = sc.nextLine();
                float num = Float.parseFloat(input);

                if (num>0) System.out.println(" Число положительное " );
                else System.out.println("Число отрицательное" );

                if (num%2==0) System.out.println("Число четное" );
                else System.out.println(" Число нечетное"  );

                if (hasFractionalPaert(num)) System.out.println("Дробное" );
                else System.out.println("Недробное" );

                if (hasFractionalPaert(num)) System.out.println("Непростое" );
                else  if ( isPrime((int)num)) System.out.println("Простое");
                else System.out.println("Непростое");

                System.out.println("Квадрат числа: "+ Math.pow(num,2));
                System.out.println("Корень числа: " + Math.sqrt(num));

                System.out.println();

                break;

            } catch (Exception e) {
                System.out.println("Некорректный  ввод. Попробуйте еще раз ");;
            }
        }
    }

    public static boolean isPrime(int number){
        if(number<=0) return false;
        if (number<=3) return true;
        if (number%2==0) return false;

        for (int i =3 ; i<=Math.sqrt(number); i+=2){
            if (number %i==0) return false;
        }
        return true;
    }

    public static boolean hasFractionalPaert( float number){
        return Math.abs(number- (long) number) > 1e-10;
    }

}
