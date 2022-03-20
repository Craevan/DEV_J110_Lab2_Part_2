package ru.avalon.jdev.files;

public class DocFile extends FileInfo {

    private int pageCount;

    public DocFile(final String fileName, final long size, final int pageCount) {
        super(fileName, size);
        setPageCount(pageCount);
        this.fileFormat = "docx";
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(final int pageCount) {
        if (pageCount < 1)
            throw new IllegalArgumentException("В документе должна быть минимум одна страница");
        this.pageCount = pageCount;
    }

    @Override
    public void print() {
        super.print();
        System.out.println(", " + getPageCount() + (getPageCount() > 1 ? " pages" : " page"));
    }
}
