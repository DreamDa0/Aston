package Lesson_2;
/*
 *	Андрей Трифонов
 *	задание к занятию 2
 * 1. Создать класс "Товар" с полями: названиеб дата производства, производитель, страна происхождения, цена,
 * состояние бронирования покупателем.
 * Конструктор класса должен заполнять эти поля при создании объекта. Внутри класса "Товар" написать метод который
 * выводит информацию об объекте в консоль.
 * 2. Создать массив из 5 товаров.
 * 3 Создать класс Park с внутренним классом, с помощью объектов которого можно хранить информацию об аттракционах,
 * времени их работы и стоимости.
 */
import java.util.Arrays;

public class Lesson_2 {
    public static void main(String[] args) {
        Product[] productArray = new Product[5];
        productArray[0] = new Product("Samsung s25 Ultra", "01.02.25", "Samsung Corp", "Korea", 5599, true);
        productArray[1] = new Product("Samsung a20 Max", "02.02.23", "Samsung Corp", "Korea", 4000, true);
        productArray[2] = new Product("Samsung A23 Ultra", "04.06.23", "Samsung Corp", "Korea", 4199, true);
        productArray[3] = new Product("Samsung s20 Ultra", "01.02.24", "Samsung Corp", "Korea", 4599, true);
        productArray[4] = new Product("Samsung s24 Ultra", "21.09.24", "Samsung Corp", "Korea", 4999, true);

        System.out.println(Arrays.toString(productArray));


        Park park = new Park();
        Park.Attractions attractions1=new Park.Attractions("Аттакцион 1", "10:00 - 18:00", 100);
        Park.Attractions attractions2=new Park.Attractions("Аттакцион 2", "11:00 - 19:00", 150);
        System.out.println(attractions1.getName());
        System.out.println(attractions2.getCost());

        attractions1.setName("Новое название");
        System.out.println(attractions1.getName());
    }



}
