package com.intelliacademy.lesson.cp1;

public class StringReversing {

    public String reverse(String context) {
        if (context.length() == 1) {
            return context;
        }
        return reverse(context.substring(1)).concat(context.substring(0, 1));
    }
}
class StringReversingMain{
    public static void main(String[] args) {
        StringReversing stringReversing=new StringReversing();
        var result = stringReversing.reverse("Hello World");
        System.out.println(result);
    }
}
