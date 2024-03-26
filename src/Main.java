public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("Лев", "Толстой");
        Author author2 = new Author("Федор", "Достоевский");

        Book book1 = new Book("Война и мир", author1, 1869);
        Book book2 = new Book("Преступление и наказание", author2, 1866);

        System.out.println("До изменения года публикации:");
        System.out.println("Книга 1: " + book1.getTitle() + " (" + book1.getPublicationYear() + "), Автор: "
                + book1.getAuthor().getName() + " " + book1.getAuthor().getSurname());
        System.out.println("Книга 2: " + book2.getTitle() + " (" + book2.getPublicationYear() + "), Автор: "
                + book2.getAuthor().getName() + " " + book2.getAuthor().getSurname());

        book1.setPublicationYear(1877);

        System.out.println("\nПосле изменения года публикации:");
        System.out.println("Книга 1: " + book1.getTitle() + " (" + book1.getPublicationYear() + "), Автор: "
                + book1.getAuthor().getName() + " " + book1.getAuthor().getSurname());
        System.out.println("Книга 2: " + book2.getTitle() + " (" + book2.getPublicationYear() + "), Автор: "
                + book2.getAuthor().getName() + " " + book2.getAuthor().getSurname());
    }
}