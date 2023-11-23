package lab6.ex2;

public class Main {

    public static void main(String[] args) {
        Library l1 = new Library();
        Book b1 = new Book();
        b1.setTitle("iarna pe ulita");
        b1.setAuthor("vasile");
        l1.add(b1);
        l1.delete(b1);
        if (l1.getBooks().isEmpty()) System.out.println("E ok");
    }
}
