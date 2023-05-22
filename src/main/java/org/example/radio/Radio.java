package org.example.radio;
public class Radio {
    private final int minChannelNumber = 0;
    private final int defaultChannel = 10;
    private int maxChannelNumber = defaultChannel - 1;
    private int currentChannelNumber;
    private final int minVolume = 0;
    private final int maxVolume = 100;
    private int currentVolume;

    public Radio() {

    }

    public Radio(int defaultChannel ) {

        this.maxChannelNumber= defaultChannel -1;

    }

    //GET
    public int getCurrentChannelNumber() {
        return currentChannelNumber;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    // SET
    public void setCurrentChannelNumber(int currentChannelNumber) {
        if (currentChannelNumber > maxChannelNumber) {
            return;
        }
        if (currentChannelNumber < minChannelNumber) {
            return;
        }
        this.currentChannelNumber = currentChannelNumber;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume > maxVolume) {
            return;
        }
        if (currentVolume < minVolume) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public void increaseVolume() {
        if (currentVolume < maxVolume) {
            currentVolume++;
        } else {
            currentVolume = maxVolume;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > minVolume) {
            currentVolume--;
        } else {
            currentVolume = minVolume;
        }
    }

    public void increaseChannelNumber() {
        if (currentChannelNumber < maxChannelNumber) {
            currentChannelNumber++;
        } else {
            currentChannelNumber = minChannelNumber;
        }
    }

    public void decreaseChannelNumber() {
        if (currentChannelNumber > minChannelNumber) {
            currentChannelNumber--;
        } else {
            currentChannelNumber = maxChannelNumber;
        }
    }

}