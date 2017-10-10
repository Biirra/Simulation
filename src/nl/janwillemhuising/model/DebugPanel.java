package nl.janwillemhuising.model;

public class DebugPanel {

    //----------------------------------
    // for checking the FPS
    //----------------------------------
    private final long[] frameTimes = new long[100];
    private int frameTimeIndex = 0;
    private boolean arrayFilled = false;

    public String getFPS(long now) {
        //---------------------------
        // stuff to get FPS
        //---------------------------
        long oldFrameTime = frameTimes[frameTimeIndex];
        frameTimes[frameTimeIndex] = now;
        frameTimeIndex = (frameTimeIndex + 1) % frameTimes.length;
        if (frameTimeIndex == 0) {
            arrayFilled = true;
        }
        if (arrayFilled) {
            long elapsedNanos = now - oldFrameTime;
            long elapsedNanosPerFrame = elapsedNanos / frameTimes.length;
            double frameRate = 1_000_000_000.0 / elapsedNanosPerFrame;

            return String.format("Current frame rate: %.3f", frameRate);

        }
        return " Calculating... ";
    }
}
