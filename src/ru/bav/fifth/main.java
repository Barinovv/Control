package ru.bav.fifth;
import java.util.*;

public class main {

    public static void main(String[] args){
        Random r = new Random();
        //Elevator elevator = new Elevator();
        //elevator.setState(new DownState(elevator));
        int button = user();
        int[] floor = new int[3];
        floor[0] = 1;
        int[] att;

        for (int i = 1; i < floor.length; i++) {
            floor[i] = r.nextInt(9) + 1;
        }
        for (int i : floor) {
            System.out.print(i);
        }
        System.out.println();

        if (button!=1){
            att = fifth.elevatorUp(floor, button);
            for (int j : att) {
                System.out.print(j);
            }
        } else {
            int elevator = fifth.elevatorDown(floor, button);
            floorOne(button, floor, elevator);
            for (int i : floor) {
                System.out.print(i);
            }
        }


    }


    /**
     * На каком этаже
     *  (в этом классе человек нажимает на кнопку. После данные о местоположении перекидываются дольше)
     */
    public static int user() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите этаж");
        int button = sc.nextInt();
        return button;
    }

    /**
     * 	На каком этаже находится
     * 	(принимаем данные из класса main о местоположении человека. Получем данные о местоположении лифтов.
     *  вызываем лифт(если лифт и человек находятся на одном и том же этаже)
     * 	человек заходит в этот лифт, но прежде чем куда либо поехать, нужно вызвать другой ближайший лифт на 1 этаж
     *
     */
    public static int[] floorOne(int button, int[] floor, int elevator) {
        //Сравниваем всех покемонов ищем следующий кто не первый отправляем на первый
        int[] arr = new int[4];
        for (int i = 0; i < floor.length; i++) {
            arr[i] = Math.abs(button - floor[i]);
        }
        for (int j = 1;j < floor.length; j++ ){
            if (arr[j] < arr[j - 1] & j != elevator) {
                floor[j] = 1;

            }
        }
        return floor;
    }


}