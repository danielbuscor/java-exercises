package oop.practice1;

public class EBook extends Book{
    private double fileSize;
    private String format;

    public double getFileSize() {
        return fileSize;
    }

    public void setFileSize(double fileSize) {
        this.fileSize = fileSize;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    @Override
    public void displayBookInfo() {
        super.displayBookInfo();
        System.out.println("File Size: " + this.fileSize + "\nFormat: " + this.format);
    }
}
