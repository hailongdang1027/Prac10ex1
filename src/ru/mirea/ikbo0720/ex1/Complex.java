package ru.mirea.ikbo0720.ex1;

public class Complex {
    private String num;

    public Complex(int num1, int image){
        num = num1 + "+" + image + "i";
    }

    public String toString() {
        return "Complex{" + "num=" + num + '}';
    }
}
