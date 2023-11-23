import java.util.Random;

public class FindLargestSmallestNumbers {
    public static void main(String[] args) {
        Random random = new Random();
        int counter = 1;
        int smallest = Integer.MAX_VALUE;
        int largest = Integer.MIN_VALUE;


        while (counter <= 10) {
            int randomNumber = random.nextInt(100) + 1;


            if (randomNumber < smallest) {
                smallest = randomNumber;
            }
            if (randomNumber > largest) {
                largest = randomNumber;
            }

            counter++;
        }


        System.out.println("Smallest number: " + smallest);
        System.out.println("Largest number: " + largest);
    }
}

