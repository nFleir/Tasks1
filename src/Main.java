import java.util.Scanner;

 class Main {
    public static void main(String[] args) {
        Scanner intovich = new Scanner(System.in);
        //задача 1

        int chetnost = intovich.nextInt();

        if (chetnost % 2 == 0)
        {
            System.out.println(chetnost + " - четное");
        }
        else
        {
            System.out.println(chetnost + " - нечетное");
        }

        //задача 2
        int b = intovich.nextInt();
        int c = intovich.nextInt();
        int d = intovich.nextInt();
        System.out.println(b < c && b < d ? "Число "+b +" минимальное" : c < b && c < d ? "Число "+ c + " минимальное" : "Число " + d + " минимальное");
        //задача 3
        for (int i = 1; i <= 10; i++)
        {
            System.out.println(i*5);
        }
        //задача 4
        int sum = 0;
        int user = intovich.nextInt();
        for (int i = 1; i <= user; i++){
            sum += i;
        }
        System.out.println(sum);
        //задача 5
        System.out.print("Введите количество чисел Фибоначчи: ");
        int fibCount = intovich.nextInt();
        int[] fibonacci = new int[fibCount];
        fibonacci[0] = 0;
        if (fibCount > 1) fibonacci[1] = 1;
        for (int i = 2; i < fibCount; i++) {
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
        }
        System.out.print("Первые " + fibCount + " чисел Фибоначчи: ");
        for (int i = 0; i < fibCount; i++) {
            System.out.print(fibonacci[i] + (i < fibCount - 1 ? ", " : "\n"));
        }
        //задача 6
        System.out.print("Введите число для проверки на простоту: ");
        int checkNum = intovich.nextInt();
        boolean prime = checkNum > 1;

        for (int i = 2; i <= Math.sqrt(checkNum); i++) {
            if (checkNum % i == 0) {
                prime = false;
                break;
            }
        }
        System.out.println(checkNum + (prime ? " является простым." : " не является простым."));

        //задача 7
        System.out.print("Введите число N: ");
        int reverseLimit = intovich.nextInt();
        System.out.println("Числа от " + reverseLimit + " до 1 в обратном порядке:");
        for (int i = reverseLimit; i >= 1; i--) {
            System.out.println(i);
        }
        //задача9
        System.out.print("Введите первое число (X): ");
        int start = intovich.nextInt();
        System.out.print("Введите второе число (Y): ");
        int end = intovich.nextInt();
        int evenSum = 0;
        for (int i = Math.min(start, end); i <= Math.max(start, end); i++) {
            if (i % 2 == 0) {
                evenSum += i;
            }
        }
        System.out.println("Сумма четных чисел в диапазоне от " + start + " до " + end + ": " + evenSum);

        //задача10
        System.out.print("Введите строку: ");
        String text = intovich.next();
        String reversedText = new StringBuilder(text).reverse().toString();
        System.out.println("Строка в обратном порядке: " + reversedText);

        //задача11
        System.out.print("Введите число: ");
        String numStr = intovich.next();
        int digitCount = numStr.replaceAll("[^\\d]", "").length();
        System.out.println("Количество цифр: " + digitCount);

        //задача12
        System.out.print("Введите число для факториала: ");
        int factNum = intovich.nextInt();
        long factorial = 1;
        for (int i = 1; i <= factNum; i++) {
            factorial *= i;
        }
        System.out.println("Факториал " + factNum + " равен " + factorial);

        //задача13
        System.out.print("Введите число: ");
        numStr = intovich.next();
        int sumDigits = 0;
        for (char digit : numStr.toCharArray()) {
            sumDigits += Character.getNumericValue(digit);
        }
        System.out.println("Сумма цифр числа: " + sumDigits);

        //задача14
        System.out.print("Введите строку для проверки на палиндром: ");
        String palStr = intovich.next();
        String reversedPalStr = new StringBuilder(palStr).reverse().toString();
        System.out.println(palStr + (palStr.equals(reversedPalStr) ? " является палиндромом." : " не является палиндромом."));

        //задача15
        System.out.print("Введите количество элементов в массиве: ");
        int arraySize = intovich.nextInt();
        int[] numbers = new int[arraySize];
        System.out.println("Введите элементы массива:");
        for (int i = 0; i < arraySize; i++) {
            numbers[i] = intovich.nextInt();
        }
        int maxNum = numbers[0];
        for (int num : numbers) {
            if (num > maxNum) {
                maxNum = num;
            }
        }
        System.out.println("Максимальное число в массиве: " + maxNum);

        //задача16
        System.out.print("Введите количество элементов массива: ");
        int arrLength = intovich.nextInt();
        int[] array = new int[arrLength];
        int arraySum = 0;
        System.out.println("Введите элементы массива:");
        for (int i = 0; i < arrLength; i++) {
            array[i] = intovich.nextInt();
            arraySum += array[i];
        }
        System.out.println("Сумма элементов массива: " + arraySum);

        //задача17
        System.out.print("Введите размер массива: ");
        int length = intovich.nextInt();
        int[] numArr = new int[length];
        int posCount = 0, negCount = 0;
        System.out.println("Введите элементы массива:");
        for (int i = 0; i < length; i++) {
            numArr[i] = intovich.nextInt();
            if (numArr[i] > 0) {
                posCount++;
            } else if (numArr[i] < 0) {
                negCount++;
            }
        }
        System.out.println("Количество положительных чисел: " + posCount);
        System.out.println("Количество отрицательных чисел: " + negCount);

        //задача18
        System.out.print("Введите два числа (A < B): ");
        int lower = intovich.nextInt();
        int upper = intovich.nextInt();
        System.out.print("Простые числа в диапазоне от " + lower + " до " + upper + ": ");
        for (int n = lower; n <= upper; n++) {
            if (n < 2) continue;
            boolean isPrime = true;
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.println(n);
            }
        }

        //задача19
        System.out.print("Введите строку: ");
        intovich.nextLine();  // Для захвата новой строки после предыдущего ввода
        String sentence = intovich.nextLine();
        int vowelsCount = 0, consonantsCount = 0;
        String vowels = "аеёиоуыэюяАЕЁИОУЫЭЮЯaeiouyAEIOUY";

        for (char ch : sentence.toCharArray()) {
            if (Character.isLetter(ch)) {
                if (vowels.indexOf(ch) >= 0) {
                    vowelsCount++;
                } else {
                    consonantsCount++;
                }
            }
        }
        System.out.println("Гласные: " + vowelsCount);
        System.out.println("Согласные: " + consonantsCount);

        //задача20
        System.out.print("Введите число: ");
        int armNum = intovich.nextInt();
        int origNum = armNum;
        int numSum = 0;
        int numDigits = String.valueOf(armNum).length();

        while (armNum != 0) {
            int digit = armNum % 10;
            numSum += (int)Math.pow(digit, numDigits);
            armNum /= 10;
        }
        System.out.println(origNum + (numSum == origNum ? " является числом Армстронга." : " не является числом Армстронга."));

        intovich.close();
    }
}