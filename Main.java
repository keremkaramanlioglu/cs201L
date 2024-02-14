import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        File input = new File("input.txt");
        isPrime(input);
    }

    static void isPrime(File inputFile) throws IOException {
        Scanner reader = new Scanner(inputFile);
        try (FileWriter writer = new FileWriter("out.txt")) {
            String prime = "prime";
            String not = "not";
            while (reader.hasNextLine()) {
                String num = reader.nextLine();
                if (isPrimeNumber(Integer.parseInt(num))) {
                    writer.write(prime + "\n");
                } else {
                    writer.write(not + "\n");
                }
            }
        }
    }
      static boolean isPrimeNumber(int number) {
        if(number <= 1) {
            return false;
        } else if(number == 2) {
            return true;
        } else {
            for(int div = 2; div <= Math.sqrt(number) + 1; div++) {
                if(number % div == 0) {
                    return false;
                }
            }
            return true;
        }
    }
}
