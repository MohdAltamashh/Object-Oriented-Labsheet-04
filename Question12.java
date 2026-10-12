/*
Java does not allow a class to extend two classes at the same time.
For example, this is invalid Java syntax:

class Child extends ParentA, ParentB { }

Java avoids this class-inheritance ambiguity (such as the diamond problem).
A class can extend only one class. Interfaces are another way to support
multiple-type behavior, but this question asks for the concept only.
*/

public class Question12 {
    public static void main(String[] args) {
        System.out.println("Java supports single class inheritance only.");
        System.out.println("A class cannot extend two classes simultaneously.");
    }
}
