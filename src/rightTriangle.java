public class rightTriangle {

    private double base;
    private double height;


    public rightTriangle(double base, double height){
        this.height = height;
        this.base = base;
    }

    public String Hypotenuse(){
        return "base = " + base + "\n" + "height = " + height + "\n" + "hypotenuse = " + Math.sqrt(Math.pow(base, 2) + Math.pow(height, 2));
    }


}
