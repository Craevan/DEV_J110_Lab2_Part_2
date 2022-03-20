package ru.avalon.jdev.utils;

public interface IDuration {

    default String duration(final int durationInSeconds) {
        int hours = durationInSeconds / 3600;
        int minutes = durationInSeconds % 3600 / 60;
        int seconds = durationInSeconds % 3600 % 60;

        return String.format("%d:%02d:%02d", hours, minutes, seconds);
    }

}
