package uet.oop.bomberman.sound;

import sun.audio.AudioData;
import sun.audio.AudioPlayer;
import sun.audio.AudioStream;
import sun.audio.ContinuousAudioDataStream;
import java.io.InputStream;

public class SoundEffect {

    public SoundEffect(){
    }


    public void playBombExplode(){
        try {
            InputStream inputStream = this.getClass().getResourceAsStream("/sound/BOM_11_S.wav");
            AudioStream as = new AudioStream(inputStream);
            AudioPlayer.player.start(as);

        }catch (Exception e){
            e.printStackTrace();
        }

    }
    public void playItemGet(){
        try {
            InputStream inputStream = this.getClass().getResourceAsStream("/sound/ITEM_GET.wav");
            AudioStream as = new AudioStream(inputStream);
            AudioPlayer.player.start(as);

        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public void playNo(){
        try {
            InputStream inputStream = this.getClass().getResourceAsStream("/sound/NO.wav");
            AudioStream as = new AudioStream(inputStream);
            AudioPlayer.player.start(as);

        }catch (Exception e){
            e.printStackTrace();
        }

    }
    public void playGameOver(){
        try{
            InputStream inputStream = this.getClass().getResourceAsStream("/sound/GAME_OVER.wav");
            AudioStream as = new AudioStream(inputStream);
            AudioPlayer.player.start(as);

        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public void playPause(){
        try{
            InputStream inputStream = this.getClass().getResourceAsStream("/sound/PAUSE.wav");
            AudioStream as = new AudioStream(inputStream);
            AudioPlayer.player.start(as);

        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public void playTheme(){
        try{
            AudioPlayer player = AudioPlayer.player;
            AudioData data = null;
            ContinuousAudioDataStream loop;
            InputStream is = this.getClass().getResourceAsStream("/sound/THEME.wav");
            AudioStream auStream = new AudioStream(is);

            data = auStream.getData();
            loop = new ContinuousAudioDataStream(data);
            player.start(loop);

        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
