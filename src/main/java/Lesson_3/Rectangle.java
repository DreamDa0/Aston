package Lesson_3;

class Rectangle implements  Figure{

    private double width;
    private double height;
    private String colorFon;
    private String colorBorder;

    public Rectangle(double width, double height, String colorFon, String colorBorder){
        this.width = width;
        this.height = height;
        this.colorFon = colorFon;
        this.colorBorder = colorBorder;

    }

    public double calculationPerimetr(){
        return  2 * (width + height);
    }
    public  double calculationSquare(){
        return  width * height;
    }

    public String toString(){
        return "Прямоугольник: " + "Периметр = " + calculationPerimetr() + ", " +
                "Площадь = " + calculationSquare() + ", " +
                "Цвет фона = " + colorFon + ", " +
                "Цвет границы = " + colorBorder;

    }

}
