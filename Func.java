package exeption;
/*
Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, и возвращающий новый массив, каждый элемент которого
равен разности элементов двух входящих массивов в той же ячейке. Если длины массивов не равны, необходимо как-то оповестить
пользователя.
* 
*/
public class Func {
    static int[] getArray(int[] array1, int[] array2){
        int[] result;
        if (array1.length > array2.length){
            result = new int[array1.length];

        }
        else result = new int[array2.length];
        
        try {
            for (int i = 0; i < result.length; i++) {
                result[i] = array1[i]-array2[i];
            }
            //return result;
            
        } catch (Exception e) {
            System.out.println("arrays don't same length");
        }
        return result;

    }   
    static int getdiv(int number1, int number2){
        int res = 0;
        try {
          res = number1 / number2;
        } catch (Exception e) {
            System.out.println("второе число является нулём");
        }
        return res;
    }
    static double getsqr(double number3, double number4){
        double a = 0.0;
        try {
            a = Math.pow(number3, number4);
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("слишком большое число");
        }
        
        return a;
    }
}
