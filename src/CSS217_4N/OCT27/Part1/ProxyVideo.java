package CSS217_4N.OCT27.Part1;

import CSS217_4N.OCT27.RealVideo;

class ProxyVideo implements Video {
    private String fileName;
    private RealVideo realVideo;
    private int viewCount = 0;

    public ProxyVideo(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void play() {
        viewCount++;
        System.out.println("--> [AUDIT] Video has been played " + viewCount + " time(s).");

        if (realVideo == null) {
            realVideo = new RealVideo(fileName);
        }

        realVideo.play();
    }
}
