public class Main {
    public static void main(String[] args) {
            Author author1 = new Author("Лев", "Толстой");
            Author author2 = new Author("Николай", "Некрасов");

            Book book1 = new Book("Хаджи Мурад", author1, 1912);
            Book book2 = new Book("На Волге", author2, 1860);

            book1.setPublicationYear(1900);

            System.out.println(book1);
            System.out.println(book2);
        }
    }
