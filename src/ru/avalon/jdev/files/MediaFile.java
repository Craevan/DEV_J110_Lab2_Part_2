package ru.avalon.jdev.files;


import ru.avalon.jdev.utils.IDuration;

public class MediaFile extends FileInfo implements IDuration {

    private String description;
    private int duration;

    public MediaFile(final String fileName, final long size, final String description, final int durationInSeconds) {
        super(fileName, size);
        setDescription(description);
        setDuration(durationInSeconds);
        this.fileFormat = "audio";
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(final String description) {
        if (description == null)
            throw new IllegalArgumentException("Ссылка на null");
        this.description = description;
    }

    public int getDuration() {
        return duration;
    }

    public String getDurationToString() {
        return duration(getDuration());
    }

    public void setDuration(final int duration) {
        if (duration < 0)
            throw new IllegalArgumentException("Продолжительность должна быть больше ноля");
        this.duration = duration;
    }

    @Override
    public void print() {
        super.print();
        System.out.println(", " + getDescription() + ", " + getDurationToString());
    }

}
