package rectangle;

public class Rectangle {
    private int width;
    private int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int perimeter() {
        return 2 * (width + height);
    }

    public int area() {
        return width * height;
    }
    public static void main(String[] args) {
        // Kiểm tra số lượng tham số
        if (args.length != 2) {
            System.out.println("Vui lòng nhập đúng 2 tham số: chiều rộng và chiều cao.");
            return;
        }

        try {
            int x = Integer.parseInt(args[0]);
            int y = Integer.parseInt(args[1]);

            // Kiểm tra số nguyên dương
            if (x <= 0 || y <= 0) {
                System.out.println("Chiều rộng và chiều cao phải là số nguyên dương.");
                return;
            }

            Rectangle rect = new Rectangle(x, y);

            System.out.println("Chu vi: " + rect.perimeter());
            System.out.println("Diện tích: " + rect.area());

        } catch (NumberFormatException e) {
            System.out.println("Tham số nhập vào phải là số nguyên.");
        }
    }
}
