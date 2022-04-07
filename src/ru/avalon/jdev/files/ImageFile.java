package ru.avalon.jdev.files;

public class ImageFile extends FileInfo {

    private int height;
    private int width;

    public ImageFile(final String fileName,final long size, final int height, final int width) {
        super(fileName, size);
        setHeight(height);
        setWidth(width);
        this.fileFormat = "image";
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(final int height) {
        if (height < 1)
            throw new IllegalArgumentException("Высота должна быть больше ноля");
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(final int width) {
        if (height < 1)
            throw new IllegalArgumentException("Ширина должна быть больше ноля");
        this.width = width;
    }

    @Override
    public void print() {
        super.print();
        System.out.println(", " + getHeight() + "x" + getWidth());
    }

}
