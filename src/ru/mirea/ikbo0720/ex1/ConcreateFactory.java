package ru.mirea.ikbo0720.ex1;

public class ConcreateFactory implements  ComplexAbstractFactory{
    public Complex createComplex(){
        Complex l = new Complex(0, 0);
        return l;
    }

    public Complex createComplex(int real, int image){
        Complex l = new Complex(real, image);
        return l;
    }

    public static void main(String[] args) {
        int num = 2;
        int image = 3;
        ConcreateFactory test = new ConcreateFactory();
        System.out.println(test.createComplex(num, image));
        System.out.println(test.createComplex());
    }
}
