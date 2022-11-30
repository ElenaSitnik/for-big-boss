public class Book {
    private String name;
    private String author;
    private String publishingHouse;
    private int yearPublishing;
    private int pagesCount;
    private double length; //cm
    private double width; //cm
    private int thickness; //mm
    private double weight; //kg

    public Book(String name, String author, String publishingHouse, int yearPublishing, int pagesCount,
                double length, double width, int thickness, double weight) {
        this.name = name;
        this.author = author;
        this.publishingHouse = publishingHouse;
        this.yearPublishing = yearPublishing;
        this.pagesCount = pagesCount;
        this.length = length;
        this.width = width;
        this.thickness = thickness;
        this.weight = weight;
    }

}
