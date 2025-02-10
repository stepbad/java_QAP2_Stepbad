public class TestMyLine {
    public static void main(String[] args) {
        // Test MyLine
        // MyLine line1 = new MyLine(1, 2, 4, 6);
        // System.out.println(line1);
        // System.out.println("Length: " + line1.getLength());
        // System.out.println("Gradient: " + line1.getGradient());
        
        MyLine line1 = new MyLine(1, 2, 4, 6);
        System.out.println(line1.toFormattedString());
        System.out.println("Length: " + line1.getLength());
        System.out.println("Gradient: " + line1.getGradient());

        // Test Getters and Setters
        // MyPoint p1 = new MyPoint(0, 0);
        // MyPoint p2 = new MyPoint(3, 4);
        // MyLine line2 = new MyLine(p1, p2);
        // System.out.println(line2);
        // System.out.println("Length: " + line2.getLength());
        // System.out.println("Gradient: " + line2.getGradient());
        
        MyPoint p1 = new MyPoint(0, 0);
        MyPoint p2 = new MyPoint(3, 4);
        MyLine line2 = new MyLine(p1, p2);
        System.out.println(line2.toFormattedString());
        System.out.println("Length: " + line2.getLength());
        System.out.println("Gradient: " + line2.getGradient());

        // Modify line
        // line2.setEndXY(6, 8);
        // System.out.println(line2);
        // System.out.println("Updated Length: " + line2.getLength());
        // System.out.println("Updated Gradient: " + line2.getGradient());
        
        line2.setEndXY(6, 8);
        System.out.println(line2.toFormattedString());
        System.out.println("Updated Length: " + line2.getLength());
        System.out.println("Updated Gradient: " + line2.getGradient());
    }
}
