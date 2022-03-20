package ru.avalon.jdev.files;

public abstract class FileInfo {

    private static final int MAX_CHAR_COUNT_IN_NAME = 20; //для красивой печати таблицы
    private static final int MAX_CHAR_COUNT_IN_SIZE = 10; //для красивой печати таблицы

    protected String fileFormat;
    private String fileName;
    private long size;

    public FileInfo(final String fileName, final long size) {
        setFileName(fileName);
        setSize(size);
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(final String fileName) {
        if (fileName == null)
            throw new IllegalArgumentException("Ссылка на null");
        this.fileName = fileName;
    }

    public long getSize() {
        return size;
    }

    public void setSize(final long size) {
        if (size < 0)
            throw new IllegalArgumentException("Размер файла не может быть меньше ноля");
        this.size = size;
    }

    public String getFileFormat() {
        return fileFormat;
    }

    public void print() {
        System.out.print(getFileName() + printSpaceChar(MAX_CHAR_COUNT_IN_NAME - getFileName().length()) + "|" +
                printSpaceChar(MAX_CHAR_COUNT_IN_SIZE - sizeLength()) + getSize() + "|" +
                getFileFormat());
    }

    public static void printAll(final FileInfo[] files) {
        if (files == null)
            throw new IllegalArgumentException("Ссылка на null");

        System.out.println("     File name      |   Size   |  Details");
        System.out.println("------------------------------------------");

        for (FileInfo tmp : files) {
            tmp.print();
        }
    }

    // методы printSpaceChar и sizeLength для красоты выводимой таблицы
    private String printSpaceChar(final int count) {
        String s = "";
        if (count <= 0)
            return s;
        for (int i = 0; i < count; i++) {
            s = s.concat(" ");
        }
        return s;
    }

    private int sizeLength() {
        return String.valueOf(size).length();
    }

}
