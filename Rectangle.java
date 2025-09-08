package OOP;

public class Rectangle {
    private int width;
    private int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int area() {
        return width * height;
    }

    public int perimeter() {
        return 2 * (width + height);
    }

    private static boolean isPositiveInteger(String value) {
        try {
            int num = Integer.parseInt(value);
            return num > 0;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Vui lòng nhập 2 tham số (chiều rộng và chiều cao):2");
            System.exit(1);
        }

        String x = args[0];
        String y = args[1];

        if (!(isPositiveInteger(x) && isPositiveInteger(y))) {
            System.out.println("Tham số phải là số nguyên dương.");
            System.exit(1);
        }

        int width = Integer.parseInt(x);
        int height = Integer.parseInt(y);

        Rectangle rect = new Rectangle(width, height);

        System.out.println("Chu vi: " + rect.perimeter());
        System.out.println("Diên tích: " + rect.area());
    }
}
