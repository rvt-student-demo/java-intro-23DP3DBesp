package lv.rvt;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        Scanner reader = new Scanner(System.in);
        System.out.println("Give numbers:");
        int sum = 0;
        int cipari = 0;
        int even = 0;
        int odd = 0;

        while (true) {
            int numbers = Integer.valueOf(reader.nextLine());
            if (numbers == -1){
                System.out.println("Thx! Bye!");
                break;
            }
        sum += numbers;
        cipari++;
        if (numbers % 2 == 0){
            even++;
        }
        else {
            odd++;
        }
        }
        System.out.println("Summa: "+sum);
        System.out.println("Numbers: "+cipari);
        System.out.println("Average: "+ (sum/cipari));
        System.out.println("Even: "+ even);
        System.out.println("Odd: "+ odd);

    }

}
