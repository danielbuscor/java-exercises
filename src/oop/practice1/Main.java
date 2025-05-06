package oop.practice1;

public class Main {
    public static void main(String[] args) {
        Book harryPotter = new Book();
        harryPotter.setTitle("Harry Potter and the Philosophers Stone");
        harryPotter.setAuthor("J.K Rowling");
        harryPotter.setPrice(20.00);

        harryPotter.displayBookInfo();

        Book lasLegionesMalditas = new Book();
        lasLegionesMalditas.setTitle("Las Legiones Malditas") ;
        lasLegionesMalditas.setAuthor("Santiago Posteguillo");
        lasLegionesMalditas.setPrice(25.00);

        lasLegionesMalditas.displayBookInfo();

        Book elSeñorDeLosAnillos = new Book();
        elSeñorDeLosAnillos.setTitle("El Señor de los Anillos");
        elSeñorDeLosAnillos.setAuthor("J.R.R Tolkien");
        elSeñorDeLosAnillos.setPrice(0);

        elSeñorDeLosAnillos.displayBookInfo();

        EBook headFirstJava = new EBook();
        headFirstJava.setTitle("Head First Java");
        headFirstJava.setAuthor("Somebody");
        headFirstJava.setPrice(22.00);
        headFirstJava.setFileSize(12.00);
        headFirstJava.setFormat("epub");

        headFirstJava.displayBookInfo();

}

}
