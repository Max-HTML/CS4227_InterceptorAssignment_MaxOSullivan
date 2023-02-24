//Name: Max O'Sullivan
//StudentID: 19234481
//Course: LM121 Computer Systems
//Module: CS4227 Software Design and Architecture

public class CDPlayer {
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
    public String getCDName(){
        if(cdInserted != true) {
            return "Error: Insert CD!";
        }
        else {
            return cdName;
        }

    }
    public String getCDLength(){
        if(cdInserted != true) {
            return "Error: Insert CD!";
        }
        else {

            return cdLength;
        }
    }







}