public class TestExtend {
    public static void main(String[] args) {
        Sub a = new Sub();
        a.showA();
    }
}

class Super {
    String a;
    public void showA() {
        System.out.println(a);
    }
}

class Sub extends Super {
    public void showA(String b) {
        System.out.println(b);
    }
}
