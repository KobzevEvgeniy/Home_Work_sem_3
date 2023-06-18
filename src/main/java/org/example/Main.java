package org.example;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.print("Введите длину массива: ");
        Scanner scanner= new Scanner(System.in);
        int leng = scanner.nextInt();
        ArrayList <Integer> num_list = new ArrayList<>();
        for (int i = 0; i < leng; i++) {
            num_list.add(new Random().nextInt(leng));
        }
        System.out.print("Список случайных чисел: ");
        num_list.forEach(n -> System.out.print(n+" "));
        System.out.println();

        //1. Нужно удалить из него чётные числа
        ArrayList <Integer> multyplay_number =getArrayMultiplay(num_list);
        System.out.print("Массив некратных чисел: ");
        multyplay_number.forEach(n -> System.out.print(n+" "));
        System.out.println();

        //2) Найти минимальное значение
        int min= getMinNumber(num_list);
        System.out.printf("Минимальное число: "+min);
        System.out.println();

        //3) Найти максимальное значение
        int max= getMaxNumber(num_list);
        System.out.printf("Максимальное число: "+max);
        System.out.println();

        //4) Найти среднее значение
        float avarage= getAvarage(num_list);
        System.out.printf("Среднеарифметическое число: "+avarage);
        System.out.println();


}
    public static ArrayList <Integer> getArrayMultiplay(ArrayList <Integer> array ){
        for (int i = 0; i < array.size() ; i++) {
            array.removeIf(el -> el % 2 == 0);
        }
        return  array;
    }
    public static int getMinNumber(ArrayList <Integer> array ){
        int min = array.get(0);
        for (Integer integer: array) {
            if (min>integer) min = integer;
        }
        return  min;
    }
    public static int getMaxNumber(ArrayList <Integer> array ){
        int max = array.get(0);
        for (Integer integer: array) {
            if (max<integer) max = integer;
        }
        return  max;
    }

    public static float getAvarage(ArrayList<Integer> array){
        int sum =0;
        for (Integer integer : array){
            sum= sum+integer;
        }
        return sum/ array.size();
    }

}