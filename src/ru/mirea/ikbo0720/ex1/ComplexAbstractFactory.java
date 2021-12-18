package ru.mirea.ikbo0720.ex1;

public interface ComplexAbstractFactory {
    public default Complex createComplex(){
        Complex l = new Complex(0, 0);
        return l;
    }

    public default Complex createComplex(int real, int image){
        Complex l = new Complex(real, image);
        return l;
    }
}
