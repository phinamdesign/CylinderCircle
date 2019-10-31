public class Cylinder extends Circle{
    private double height ;
    private double volumetric ;

    public Cylinder(){

    }

    public Cylinder(double height) {
        this.height = height;
    }

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
        this.volumetric = volumetric;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolumetric(){
        return height*Math.PI*getRadius()*getRadius();
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Thể tích = "+getVolumetric());
    }
}
