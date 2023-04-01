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
    }
  }