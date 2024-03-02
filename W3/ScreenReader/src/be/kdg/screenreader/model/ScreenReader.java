package be.kdg.screenreader.model;

import com.sun.speech.freetts.Voice;
import com.sun.speech.freetts.VoiceManager;

public class ScreenReader {
    private String voiceName;
    private String text = "No text";

    public ScreenReader() {
        System.setProperty("freetts.voices",
                "com.sun.speech.freetts.en.us.cmu_us_kal.KevinVoiceDirectory");
        this.voiceName = "kevin16";
    }
    public void setText(String tekst) {this.text = tekst;}

    public String getText() {return text;}

    public void readAloud() {
        Voice voice = VoiceManager.getInstance().getVoice(voiceName);
        voice.allocate();
        voice.speak(text);
        voice.deallocate();
    }
}
