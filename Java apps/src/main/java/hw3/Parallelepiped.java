package hw3;
//завдання: розрахувати і вивести на екран об'єм та сумарну довжину усіх сторін паралелепіпеда

public class Parallelepiped {
    public static void main(String[] args) {
        float length = 10; // довжина
        float width = 5; // ширина
        float height = 3; // висота

        // розрахунок об'єму паралелепіпеда
        float volume = length * width * height;

        //виводимо розрахований об'єм на екран
        System.out.println("Об'єм паралелепіпеда = " + volume);

        // розрахунок сумарної довжини усіх сторін
        float totalLength = 4 * (length + width + height);
        //виводимо розраховану сумарну довжину усіх сторін на екран
        System.out.println("Сумарна довжина усіх сторін = " + totalLength);
    }
}
