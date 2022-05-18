public class test {
    public static void main(String[] args) {
        Button btn1 = new Button();
        btn1.setOnClickListener(() -> System.out.println("btn1 클릭"));
        btn1.click();
    }
}
