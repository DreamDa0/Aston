package Lesson_3;

class Triangle implements  Figure {
    private double side1;
    private double side2;
    private double side3;
    private String colorFon;
    private String colorBorder;

    public Triangle(double side1, double side2, double side3, String colorFon, String colorBorder){
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        this.colorFon = colorFon;
        this.colorBorder = colorBorder;

    }
    public double calculationPerimetr(){
        return side1 + side2 + side3;
    }
    public double calculationSquare(){
        double halfperimeter = calculationPerimetr() / 2;
        return Math.sqrt(halfperimeter*(halfperimeter - side1) * (halfperimeter - side2) * (halfperimeter - side3));
    }
    public String toString(){
        return "Треугольник: " + "Периметр = " + calculationPerimetr() + ", " +
                "Площадь = " + calculationSquare() + ", " +
                "Цвет фона = " + colorFon + ", " +
                "Цвет границы = " + colorBorder;

    }

}
