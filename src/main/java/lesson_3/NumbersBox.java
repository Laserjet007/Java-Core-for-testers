package lesson_3;

import java.util.Arrays;

public class NumbersBox<T extends Number> {
    private T [] array;

    public NumbersBox(T... array) {   //... значит можно запихнуть что угодно в массив не только [] числа (Number)
        this.array = array;
    }

    public T[] getArray() {
        return array;
    }

    public void setArray(T[] array) {
        this.array = array;
    }

    @Override
    public String toString() {
        return "NumbersBox{" +
                "array=" + Arrays.toString(array) +
                '}';
    }

    public double calcAverage(){
        double sum = 0.0;

        for(T num : array) {
            sum = sum + num.doubleValue();
        }

        return sum / array.length;
    }


    public static void main(String[] args) {
         NumbersBox<Integer> integerNumbersBox1 = new NumbersBox<>(1,2,3,5,6,4,4);
         System.out.println(integerNumbersBox1.calcAverage());
    }

}
