package exeption ;

import java.util.Arrays;

/*Реализуйте 3 метода, чтобы в каждом из них получить разные исключения
Посмотрите на код, и подумайте сколько разных типов исключений вы тут сможете получить?
Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, и возвращающий новый массив, каждый элемент которого равен разности элементов двух входящих массивов в той же ячейке. Если длины массивов не равны, необходимо как-то оповестить пользователя.
* Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, и возвращающий новый массив, каждый элемент которого равен частному элементов двух входящих массивов в той же ячейке. Если длины массивов не равны, необходимо как-то оповестить пользователя. Важно: При выполнении метода единственное исключение, которое пользователь может увидеть - RuntimeException, т.е. ваше.
*/
public class Task {

    public static void main(String[] args) {
        System.out.println("hello");
        int [] mass = {1,22,3,4};
        int[] mass2 = {1,2,3,4};
        
        int[] res2 = Func.getArray(mass, mass2) ; 

        for (int i : res2) {
            System.out.println(i);
        }
        
    }
    
}
