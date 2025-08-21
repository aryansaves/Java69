public interface Printable {
    void print();
    void show();
    private void display()
    {
        System.out.println(" I am in interface private method");
    }
    public static void say()
    {
        System.out.println(" I am in say method");
    }
}