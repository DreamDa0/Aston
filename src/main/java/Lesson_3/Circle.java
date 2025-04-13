package Lesson_3;

class Circle implements Figure{
    private double radius;
    private String colorFon;
    private String colorBorder;

    public Circle(double radius, String colorFon, String colorBorder){
        this.radius = radius;
        this.colorFon = colorFon;
        this.colorBorder = colorBorder;
    }
    public double calculationPerimetr(){
        return 2 * Math.PI * radius;
    }
    public double calculationSquare(){
        return 2 * Math.PI * radius * radius;
    }
    public String toString(){
        return "Круг: " + "Периметр = " + calculationPerimetr() + ", " +
                "Площадь = " + calculationSquare() + ", " +
                "Цвет фона = " + colorFon + ", " +
                "Цвет границы = " + colorBorder;

    }


}
