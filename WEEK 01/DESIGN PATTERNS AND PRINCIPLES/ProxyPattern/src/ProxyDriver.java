public class ProxyDriver {
    public static void main(String[] args) {
        Image image1 = new ProxyImage("image1.jpg");
        Image image2 = new ProxyImage("image2.jpg");

        // Display image1 for the first time (will load from disk)
        System.out.println("First call to display image1:");
        image1.display();
        System.out.println();

        // Display image1 again (should use cached image)
        System.out.println("Second call to display image1:");
        image1.display();
        System.out.println();

        // Display image2 for the first time (will load from disk)
        System.out.println("First call to display image2:");
        image2.display();
        System.out.println();
    }
}
