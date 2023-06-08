
public class Main {
    public static void main(String[] args) {
        MyTable t = new MyTable();
        t.add('a', "Andrew");
        t.add('b',"Billy");
        t.add('w',"William");
        String s = t.get('c');
        System.out.println(t);

    }
}