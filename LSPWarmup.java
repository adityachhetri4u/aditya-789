public class LSPWarmup {
    public static void main(String[] args) {
        
        Rectangle rect = new Square();
        rect.setWidth(10);
        rect.setHeight(20);
        
        System.out.println("Expected area for 10x20 rectangle: 200");
        System.out.println("Actual area got: " + rect.getArea()); // This prints 400!
    }
}
