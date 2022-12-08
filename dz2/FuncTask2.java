package exeption.dz2;

import java.io.FileNotFoundException;
import java.util.Scanner;


public class FuncTask2 {
    /*1. Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float), и возвращает введенное значение.
        Ввод текста вместо числа не должно приводить к падению приложения, вместо этого, необходимо повторно запросить у пользователя 
        ввод данных. */
    static float getFloat(){

        Scanner in = new Scanner(System.in);
        System.out.print("Input a number: ");
        float result = 0.0f;
        
        boolean condition = true;
        while (condition == true) {
            
            try {
                result = in.nextFloat();
                condition = false;
            } catch (Exception e) {
                System.out.println("You didn't enter a float");
                System.out.println("Input a correct number: ");
                in.next();
            }
        }
       
        
          
        //System.out.printf("Your number: %d \n", result);
        in.close();
        
        return result;

    }
/*2. Если необходимо, исправьте данный код (https://docs.google.com/document/d/17EaA1lDxzD5YigQ5OAal60fOFKVoCbEJqooB9XfhT7w/edit) */
    static void execercise1(){
        try {
            int d = 0;
            int[] intArray = {1,2,3,4,5,6,7,8,9};
            double catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
         } catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e);
         }
         
    }
    
/*3. Дан следующий код, исправьте его там, где требуется 
(https://docs.google.com/document/d/17EaA1lDxzD5YigQ5OAal60fOFKVoCbEJqooB9XfhT7w/edit) */    
    static void exercize2() throws Exception {
        try {
            int a = 90;
            int b = 3;
            System.out.println(a / b);
            printSum(23, 234);
            int[] abc = { 1, 2 };// можно указать null, чтобы вышла первая ошибка
            abc[3] = 9;// тут либо менять массив на ArrayList и тогда можно будет увеличить размер массива, либо менять индекс
        } catch (NullPointerException ex) {
            System.out.println("Указатель не может указывать на null!");
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("Массив выходит за пределы своего размера!");
        } catch (Throwable ex) {
            System.out.println("Что-то пошло не так...");
        }
    }
    static void printSum(Integer a, Integer b) throws FileNotFoundException {
        System.out.println(a + b);
    }

/*
Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку. 
Пользователю должно показаться сообщение, что пустые строки вводить нельзя.
 */

    static void getInputNull(){
        Scanner in = new Scanner(System.in);
        System.out.print("Input a number: ");
       
         // try {
        //     String res = in.nextLine();
        //     System.out.println(res);
        // } catch (Exception e) {
        //     System.out.println("вы ничего не ввели");
        // }
        String res = in.nextLine();
        if (res.isEmpty()){
            System.out.println("вы ничего не ввели");
        }
        else {
            System.out.println(res);
        }
        
        in.close();
    }
    
}
