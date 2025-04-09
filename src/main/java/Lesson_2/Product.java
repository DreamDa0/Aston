package Lesson_2;

public class Product {
        private String name;
        private String date;
        private String manufacture;
        private String country;
        private int price;
        private boolean status;


        public Product(String name, String date, String manufacture, String country, int price, boolean status) {
            this.name = name;
            this.date = date;
            this.manufacture = manufacture;
            this.country = country;
            this.price = price;
            this.status = status;

        }

    @Override
    public String toString(){
        return(name+ "\n-"
                +date+ "\n-"
                +manufacture+ "\n-"
                +country+ "\n-"
                +price+ "\n-"
                +status);
    }

}
