package ru.avalon.jdev;

import ru.avalon.jdev.files.*;

public class Main {

    public static void main(String[] args) {
        FileInfo doc = new DocFile("j110-lab2-hiers.docx", 23212L, 2);
        FileInfo image = new ImageFile("spb-map.png", 1703527L, 1024, 3072);
        FileInfo audio = new MediaFile("06-PrettyGirl.mp3",7893454L,
                "Eric Clapton, Pretty Girl", 5 * 60 + 28);
        FileInfo video = new VideoFile("BackToTheFuture1.avi", 1470984192L,
                "Back to the future I, 1985", 60 * 60 + 48 * 60 + 8, 640, 352);

        FileInfo[] files = new FileInfo[4];
        files[0] = doc;
        files[1] = image;
        files[2] = audio;
        files[3] = video;

        FileInfo.printAll(files);

    }


}
