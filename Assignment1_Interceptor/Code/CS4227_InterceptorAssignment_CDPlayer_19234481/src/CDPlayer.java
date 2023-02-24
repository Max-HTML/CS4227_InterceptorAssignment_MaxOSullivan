//Name: Max O'Sullivan
//StudentID: 19234481
//Course: LM121 Computer Systems
//Module: CS4227 Software Design and Architecture

interface CDPlayerButtons{
    public void play();
    public void pause();
    public void stop();

}

public class CDPlayer implements CDPlayerButtons {
    private boolean cdInserted = false;
    private String cdName = "";
    private String cdLength;
    private boolean playing;
    private boolean paused;

    public void insertCD(String cdInsertedName, String cdInsertedLength) {
        cdInserted = true;
        cdName = cdInsertedName;
        cdLength = cdInsertedLength;
    }

    public void extractCD() {
        cdInserted = false;
    }

    public void play() {
        playing = true;
        paused = false;
    }

    public void pause() {
        playing = false;
        paused = true;
    }

    public void stop() {
        playing = false;
    }

    public String getCDName() {
        if (cdInserted != true) {
            return "Error: Insert CD!";
        } else {
            return cdName;
        }

    }

    public String getCDLength() {
        if (cdInserted != true) {
            return "Error: Insert CD!";
        } else {

            return cdLength;
        }
    }
}

    class main {
        public static void main(String[] args) {
            CDPlayer currentCDPlayer = new CDPlayer();  // Creating a CDPlayer Object
            currentCDPlayer.getCDName();
        }
    }






