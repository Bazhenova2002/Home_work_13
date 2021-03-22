/*
Необходимо создать класс аналогичный стандартному ArrayList<Integer> на базе массива.
И реализовать 5 методов:
add - добавить значеине в список
get - получить по индексу
set - заменить по индексу
size - верзнуть размер, изначально 0
toString - красиво печатет список
 */
package home.work13;

public class Main {
    public static void main(String[] args) {
        IntList list = new IntList();
        list.add(10);
        list.add(20);
        list.add(30);
        list.set(1, 123);
        System.out.println(list);
    }
}
