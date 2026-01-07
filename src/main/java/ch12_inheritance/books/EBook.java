package ch12_inheritance.books;

public class EBook extends Book{
    private double fileSize;
    private String format;

    public EBook(String title, String author, double fileSize, String format) {
        super(title, author);
        this.fileSize = fileSize;
        this.format = format;
    }

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

    // Book클래스의 showInfo() 메서드를 override하여 추가 부분만 '재정의'
    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("파일 크기 : " + fileSize);
        System.out.println("파일 형식 : " + format);
    }
}
