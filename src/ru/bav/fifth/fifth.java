package ru.bav.fifth;

import java.util.Scanner;

public class fifth {
    /**
     * На каком этаже
     * Для начало получить данные о их местоположении и куда нужно вызвать лифт.
     * Чтобы рассчитать ближайший лифт надо к текущему положению прибавить количество этажей и минимальное число будет кратчайшим путём.
     * Если расстояние до ближайшего лифта равно 10 то нужно найти 2е минимальное расстояние
     * Тут лифты узнают где они находятся и куда им надо
     */
    public static int[] elevatorUp(int[] floor, int button) {
        int[] arr = new int[4];
        for (int i = 1; i < floor.length; i++) {
            arr[i] = Math.abs(button - floor[i]);
            if (arr[i]<arr[i-1]){
                floor[i] = button;
                System.out.println(floor[i]);
            }
        }
        return floor;
    }
    public static int elevatorDown(int[] floor, int button) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите нужный этаж");
        int max = sc.nextInt();
        int elevator = 0;
        for (int i = 0; i < floor.length; i++) {
            if (floor[i] == button) {
                floor[i] = max;
                elevator = i;
                break;
            }
        }
        return elevator;
    }

}