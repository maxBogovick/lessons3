package com;

import java.util.Arrays;
import java.util.Objects;

public class B extends Main {

    private String variable = "test";
    public static int variable2;
    //public static final int variable3;
    public String name;
    
    private int age;
    private String course;
    
    public void setCourse(String course) {
        if (Objects.isNull(course) || course.trim().length() == 0) {
            return;
        }
        if (Objects.isNull(this.course)) {
            this.course = course;
        }        
    }
    
    public void setAge(int age) {
        if (age <= 0 || this.age > 0) {
            return;
        }       
    }

    @Override
    public String toString() {
        return "B{" +
                "name='" + name + '\'' +
                '}';
    }
    
    public static boolean checkName(String name) {
        /*for(char c : name.toCharArray()){
            if (Character.isDigit(c)) return false;
        }*/
        if (name.replaceAll("[^0-9]", "").length() > 0) return false;
        return true;
    }

    public static void main(String[] args) {

        System.out.println(checkName("wert"));
        System.out.println(checkName("wer12t"));
        HumanResourceCollector humanResource = new HumanResourceCollector();
        humanResource.saveNewStudent(new B("test1"));
        humanResource.saveNewStudent(new B("test2"));
        humanResource.saveNewStudent(new B("test3"));
        humanResource.saveNewStudent(new B("test4"));
        humanResource.saveNewStudent(new B("test5"));
        System.out.println(Arrays.toString(humanResource.getAllStudents()));
    }

    public B(String name) {
        this.name = name;
    }
}

class HumanResourceCollector{

    private B[] array = new B[2];
    private int newPosition = 0;

    public void saveNewStudent(B newStudent) {
        // проверить входные параметры
        if (Objects.isNull(newStudent)) return;
        // нельзя просто так добавить в массив, а вдруг он уже полный
        if (array.length < newPosition+1) {
            // склонировать нужно, если исходный массив будет изменяться
            B[]  temp = array.clone();
            temp[0] = null;
            System.out.println(array[0]);
            array = new B[newPosition*2+1];
            System.arraycopy(temp, 0, array, 0, temp.length);
        }
        array[newPosition++] = newStudent;
    }
    
    public B[] getAllStudents() {return array;}


}