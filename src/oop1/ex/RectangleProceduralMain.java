package oop1.ex;

public class RectangleProceduralMain {
    public static void main(String[] args) {

        Rectangle rec = new Rectangle();
        rec.width = 5;
        rec.height = 8;

        int area = rec.calculateArea();
        System.out.println("넓이 : " + area);

        int perimenter = rec.calculatePerimeter();
        System.out.println("둘레 길이 : " + perimenter);

        boolean square = rec.isSquare();
        System.out.println("정사각형 여부 : " + square);

    }

}
