package ru.job4j.ex;

public class FindEl {
    public static int indexOf(String[] value, String key) throws ElementNotFoundExeption {
        int rsl = -1;
        /* цикл fori, поскольку нам надо найти индекс искомого элемента в массиве */
        for (int index = 0; index < value.length; index++) {
            if (value[index].equals(key)) {
                rsl = index;
            }
        }
        if (rsl == -1) {
            throw new ElementNotFoundExeption("Can't find key element in given array");
        }
        return rsl;
    }

    public static void main(String[] args) {
        String[] array = {"FirstElement", "SecondElement", "ThirdElement"};
        try {
            int index = indexOf(array, "FourthElement");
        } catch (ElementNotFoundExeption e) {
            e.printStackTrace();
        }
    }
}
