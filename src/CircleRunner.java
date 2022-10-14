

public class CircleRunner {

    public static void main(String args[]) {

        Circle circle = new Circle(5.0);
            String newInfo =  circle.getInfo();
            System.out.println(newInfo);

            circle.setRadius(9.2);
            String newInfo1 = circle.getInfo();
            System.out.println(newInfo1);

            circle.setRadius(12.89);
            String newInfo2 = circle.getInfo();
            System.out.println(newInfo2);


    }

}
