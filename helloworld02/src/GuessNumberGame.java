import java.util.Random;
import java.util.Scanner;

public class GuessNumberGame {
    public static void main(String[] args) {
        Random random = new Random();
        int numberToGuess = random.nextInt(100) + 1; // 生成1到100之间的随机数
        Scanner scanner = new Scanner(System.in);
        int numberOfTries = 0;
        int guess;
        boolean win = false;

        System.out.println("欢迎来到猜数字游戏！请猜一个1到100之间的数字。");

        while (!win) {
            System.out.print("请输入你的猜测: ");
            guess = scanner.nextInt();
            numberOfTries++;

            if (guess == numberToGuess) {
                win = true;
            } else if (guess < numberToGuess) {
                System.out.println("太低了，再试一次。");
            } else if (guess > numberToGuess) {
                System.out.println("太高了，再试一次。");
            }
        }

        System.out.println("恭喜你，猜对了！你总共猜了 " + numberOfTries + " 次。");
        scanner.close();
    }
}
