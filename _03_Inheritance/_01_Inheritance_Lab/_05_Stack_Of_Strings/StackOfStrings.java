package _03_Inheritance._01_Inheritance_Lab._05_Stack_Of_Strings;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

public class StackOfStrings {
    private List<String> data;

    public StackOfStrings(List<String> data) {
        this.data = new ArrayList<>();
    }

    public void push(String someString) {
        data.add(someString);
    }

    public String pop() {
        return this.data.remove(this.data.size() - 1);
    }

    public String peek(){
        return this.data.get(this.data.size() - 1);
    }

    public boolean isEmpty(){
        return this.data.isEmpty();
    }
}
