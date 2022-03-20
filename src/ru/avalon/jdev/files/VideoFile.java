package ru.avalon.jdev.files;

import ru.avalon.jdev.utils.IDuration;

public class VideoFile extends MediaFile implements IDuration {

    private int height;
    private int width;

    public VideoFile(final String fileName,
                     final long size,
                     final String description,
                     final int durationInSeconds,
                     final int height, final int width) {
        super(fileName, size, description, durationInSeconds);
        setHeight(height);
        setWidth(width);
        this.fileFormat = "video";
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

// Костыль для печати в одно строку

        System.out.println(getFileName() + "|" +
                getSize() + "|" +
                getFileFormat() +
                ", " + getDescription() + ", " + getDurationToString() + ", " + getHeight() + "x" + getWidth());
    }

}
