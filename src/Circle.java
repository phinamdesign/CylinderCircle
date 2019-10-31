public class Circle {
    private double radius ;
    private String color ;
    private double acreage ;

    public Circle(){

    }

    public Circle(double radius, String color){
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getAcreage() {
        return radius*radius*Math.PI;
    }

    public void showInfo(){
        System.out.println("Bán kính = "+getRadius()+" Màu "+getColor()+" Diện tích "+getAcreage());
    }
}
