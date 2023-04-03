import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class helloWorld {
    public static void main(String[] args) {
        int year = 2023;
        float interger = 20.20F;
        String name = "Moshi \"Moshi\"";
        // path: home\Desktop\folder
        // \t -> tab
        String path = "home\\Desktop\\folder";
        Date now = new Date();
        System.out.println("Hello \tWorld");
        System.out.println(year);
        System.out.println(now);
        System.out.println(name.toUpperCase());
        System.out.println(path);

        //Arrays
        //Old-way syntax
        int[] num = new int[5];
        num[0] = 22;
        num[2] = 20;
        num[4] = 21;
        System.out.println(Arrays.toString(num));

        //new-way syntax
        int[] numbers = {100, 300, 200, 250};
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));

        //multi-dimensional arrays
        int[][] matrix = {{2, 1, 2}, {3, 2, 3}, {1, 2, 1}};
        System.out.println(Arrays.deepToString(matrix));

        //constant
        final float GRAVITATIONAL_CONSTANT = 6.673F;
        System.out.println("GRAVITATIONAL_CONSTANT: " + GRAVITATIONAL_CONSTANT);

        //arithmetic operations
        int div = 20 / 9;
        double div1 = (double)20 / (double)9; //to get a float
        System.out.println(div); //2
        System.out.println(div1); //2.2222222222222223

        //increment
        int x = 21;
        int y = x++;
        System.out.println(x); //22
        System.out.println(y); //21

        //implicit or automatic casting
        short xy = 1;
        int yx = xy + 41;
        System.out.println(yx); //42

        //narrowing casting
        double xx = 12.21;
        int yy = (int)xx + 41;
        System.out.println(yy); //53

        //String to Int
        String number = "11";
        int myNumber = Integer.parseInt(number) - 9;
        System.out.println(myNumber); //2

        //formatting numbers
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        String result = currency.format(1202344.814);
        System.out.println(result); //₹1,202,344.81

        String percent = NumberFormat.getPercentInstance().format(0.9);
        System.out.println(percent); //90%

        //input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Which class are u in? Ans: ");
        String currentClass = scanner.next();
        System.out.println("Okk... U r in class " + currentClass);

        //if statements
        int income = 120_00;
        if (income > 100_00)
            System.out.println("you are the Senior employee");
        else
            System.out.println("junior employee");

        //simplifying if statements
        int salary = 500_000;
        boolean highSalary = (salary < 600_000);
        System.out.println("high salary earning: " + highSalary);

        //ternary operation
        int marks = 95;
        String grades = marks > 90 ? "1st division" : "2nd division";
        System.out.println(grades);

        //switch statement
        int roll_no = 5;
        switch (roll_no) {
            case 1:
                System.out.println("Abhi... present ma'am");
                break;
            case 2:
                System.out.println("Breeze... absent ma'am");
                break;
            case 3:
                System.out.println("Candy... absent ma'am");
                break;
            case 4:
                System.out.println("Deelip... absent ma'am");
                break;
            case 5:
                System.out.println("Easter... present ma'am");
                break;
            case 6:
                System.out.println("Fuzi... present ma'am");
                break;
            default:
                System.out.println("All are present");
        }

        //FizzBuzz exercise
        Scanner scanner2 = new Scanner(System.in);
        System.out.print("Number: ");
        int number1 = scanner2.nextInt();

        if ((number1 % 5 == 0) && (number1 % 3 == 0)) //we have to move the specific code on top
            System.out.println("FizzBuzz");
        else if (number1 % 3 == 0)                      // and most generic one on bottom
            System.out.println("Buzz");
        else if (number1 % 5 == 0)
            System.out.println("Fizz");
        else
            System.out.println("Nothing happening");

        //for loops
        for (int i = 0; i < 4; i++) //increment
            System.out.println("Hi... Robot " + i);

        for (int i = 5; i > 0; i--) //decrement
            System.out.println("Roll no." + i);

        //while loops
        int i = 10;
        while (i > 0) {
            System.out.println("Boring World!");
            i--;
        }

        Scanner scanner3 = new Scanner(System.in);
        String input = "";

        while (!input.equals("quit")) {  // quit the loop when input is quit
            System.out.print("Input: ");
            input = scanner3.next().toLowerCase();
            System.out.println(input);
        }

        //do-while loops
        do {
            System.out.print("Input: ");
            input = scanner3.next().toLowerCase();
            System.out.println(input);
        } while (!input.equals("quit"));

        //break & continue
        while (true) {
            System.out.print("Input: ");
            input = scanner3.next().toLowerCase();
            if (input.equals("pass"))
                continue;
            if (input.equals("quit"))
                break;
            System.out.println(input);
        }

        //for-each loops
        String[] vegetables = {"Carrot", "Reddish", "Cabbage", "Cauliflower", "Onion"};
        
//        for (int i = 0; i < vegetables.length; i++)
//            System.out.println(vegetables[i]);
        
        for (String veg: vegetables)
            System.out.println(veg);

        //limitation: we can't iterate from the end of array

    }
  }