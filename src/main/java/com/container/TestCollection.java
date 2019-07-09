package com.container;

import com.live.Animal;
import com.live.Dog;
import com.live.Duck;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Queue;

public class TestCollection {
    public static void main(String[] args) {
        List c = new LinkedList(); 
        c.add(1);
        int[] arrayInt = {1,2,3,4,5,6,7};
        //тонкости работы
        //c = Arrays.asList(arrayInt);
        //c.remove(5);
        c.add(44);
        Collections.addAll(c,  1,2,3,4,5,6);
        c.add(null);
        c.add(null);
        c.add(null);
        c.forEach(System.out::println);
        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);
        queue.add(6);
        queue.add(7);
        System.out.println(queue.element());
        // извлечь и удалить самый первый добавленный элемент
        System.out.println(queue.poll());
        // только извлечь самый первый элемент или нул
        System.out.println(queue.peek());
        // только извлечь самый первый элемент или завершить работу с ошибкой
        System.out.println(queue.element());
        //печать
        System.out.println(queue);
        //iteration
        for(Iterator<Integer> iterator = queue.iterator(); iterator.hasNext();) {
            Integer intValue = iterator.next();
            System.out.println(intValue);
        }
        //Iteration 2
        for (Integer value: queue) {
            // нельзя в цикле изменять состав коллекции
            // queue.add(1);
            System.out.println(value);
        }
        //Iteration 3
        for (ListIterator<Integer> listIterator = ((LinkedList<Integer>) queue).listIterator(); listIterator.hasNext();) {
            listIterator.next();
            //System.out.println(((LinkedList<Integer>) queue).get(listIterator.nextIndex()));
            listIterator.set(5);
        }
        System.out.println(queue);
        
        HashSet<Animal> animals = new HashSet<>(Arrays.asList(new Dog("100"), new Dog("200")));
        animals.add(new Duck("2"));
        animals.add(new Duck("3"));
        animals.add(new Duck("4"));
        animals.add(new Duck("5"));
        System.out.println(animals);
        HashMap<String, String> map= new HashMap<>();
        map.put("hello", "h");
        map.put("hello", "e");
        map.put("hello", "l");
        map.put("hello", "o");
        System.out.println(map.values());
        // override equals
        System.out.println(animals.equals(new Dog("1")));     
        
    }
}
