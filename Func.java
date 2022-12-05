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
    
}
