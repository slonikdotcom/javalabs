import java.util.ArrayList;

public class NumberOperations {

    public static void main(String[] args) {

        ArrayList<Number> numbers = new ArrayList<>();

        numbers.add(10);  // int
        numbers.add(20.5);  // double
        numbers.add(30);  // int
        numbers.add(40.7);  // double
        numbers.add(50);  // int
        numbers.add(60.3);  // double
        numbers.add(70);  // int
        numbers.add(80.1);  // double
        numbers.add(90);  // int
        numbers.add(100.9);  // double

        // 1
        int intNumber = 1;
        double doubleNumber = 16.7;
        float floatNumber = 3.857f;
        long longNumber = 12345L;
        short shortNumber = 50;
        byte byteNumber = 60;

        // 2, 3
        numbers.add(intNumber);
        numbers.add(doubleNumber);
        numbers.add(floatNumber);
        numbers.add(longNumber);
        numbers.add(shortNumber);
        numbers.add(byteNumber);

        // 4
        System.out.println("Список чисел: " + numbers);

        // 5
        ArrayList<Integer> integerList = new ArrayList<>();
        for (Number num : numbers) {
            int newNumber = num.intValue();
            integerList.add(newNumber);
        }
        System.out.println("Цілі числа:" + integerList);

        // 6
        ArrayList<Double> decimalList = new ArrayList<>();
        for (Number num : numbers) {
            double decimalNumber = num.doubleValue();
            decimalList.add(decimalNumber);
        }
        System.out.print("Дробові числа: [");
        for (int i = 0; i < decimalList.size(); i++) {
            System.out.printf("%.2f", decimalList.get(i));
            if (i < decimalList.size() - 1) {
                System.out.print(" ");
            }
        }
        System.out.print("]");

        // 7
        ArrayList<Integer> intList = new ArrayList<>();
        ArrayList<Double> doubleList = new ArrayList<>();
        ArrayList<Float> floatList = new ArrayList<>();
        ArrayList<Long> longList = new ArrayList<>();
        ArrayList<Short> shortList = new ArrayList<>();
        ArrayList<Byte> byteList = new ArrayList<>();

        for (Number number : numbers) {
            if (number instanceof Integer) {
                intList.add((Integer) number);
            } else if (number instanceof Double) {
                doubleList.add((Double) number);
            } else if (number instanceof Float) {
                floatList.add((Float) number);
            } else if (number instanceof Long) {
                longList.add((Long) number);
            } else if (number instanceof Short) {
                shortList.add((Short) number);
            } else if (number instanceof Byte) {
                byteList.add((Byte) number);
            }
        }

        System.out.println("\nСписок цілих чисел (Integer): " + intList);
        System.out.println("Список дробних чисел (Double): " + doubleList);
        System.out.println("Список дробних чисел (Float): " + floatList);
        System.out.println("Список великих цілих чисел (Long): " + longList);
        System.out.println("Список коротких цілих чисел (Short): " + shortList);
        System.out.println("Список байтів (Byte): " + byteList);

        // 10
        Number largest = findLargestNumber(numbers);
        System.out.println("\nНайбільше число зі списку: " + largest);
    }

    // Метод для знаходження найбільшого числа
    public static Number findLargestNumber(ArrayList<Number> numbers) {
        if (numbers.isEmpty()) {
            return null;
        }
        Number largest = numbers.get(0);
        for (Number num : numbers) {
            if (num.doubleValue() > largest.doubleValue()) {
                largest = num;
            }
        }
        return largest;
    }
}
