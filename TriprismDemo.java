class TriPrism<T> {
    private T length, base, height;

    public void setLength(T length) {
        this.length = length;
    }

    public T getLength() {
        return length;
    }

    public void setBase(T base) {
        this.base = base;
    }

    public T getBase() {
        return base;
    }

    public void setHeight(T height) {
        this.height = height;
    }

    public T getHeight() {
        return height;
    }
}

public class TriprismDemo {
    public static void main(String[] args) {
        
        TriPrism<Integer> tp1 = new TriPrism();
        TriPrism<Double> tp2 = new TriPrism();

        tp1.setLength(10);
        tp1.setBase(7);
        tp1.setHeight(5);

        tp2.setLength(9.10);
        tp2.setBase(6.25);
        tp2.setHeight(4.20);

        System.out.println("Triangular Prism 1");
        System.out.println("Lenght: " + tp1.getLength());
        System.out.println("Base: " + tp1.getBase());
        System.out.println("Height: " + tp1.getHeight());
        System.out.println("The volume of the triangular prism is " + 0.5 * tp1.getLength() * tp1.getBase() * tp1.getHeight());

        System.out.println("Triangular Prism 2");
        System.out.println("Lenght: " + tp2.getLength());
        System.out.println("Base: " + tp2.getBase());
        System.out.println("Height: " + tp2.getHeight());
        System.out.println("The volume of the triangular prism is " + 0.5 * tp2.getLength() * tp2.getBase() * tp2.getHeight());

    }
}
