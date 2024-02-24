package hw18;

public class MusicStyles {
    public void playMusic() {
        System.out.println("Playing music");
    }

    // The Pop Music class, which inherits from Music Styles
    public static class PopMusic extends MusicStyles {
        @Override
        public void playMusic() {
            System.out.println("Playing Pop music");
        }
    }

    // The RockMusic class, which inherits from MusicStyles
    public static class RockMusic extends MusicStyles {
        @Override
        public void playMusic() {
            System.out.println("Playing Rock music");
        }
    }

    // The ClassicMusic class, which inherits from MusicStyles
    public static class ClassicMusic extends MusicStyles {
        @Override
        public void playMusic() {
            System.out.println("Playing Classical music");
        }
    }

    // Main class for creating music bands and calling playMusic methods
    public static class Main {
        public static void main(String[] args) {
            // Creating music bands for every style
            PopMusic popBand = new PopMusic();
            RockMusic rockBand = new RockMusic();
            ClassicMusic classicBand = new ClassicMusic();

            // Call the playMusic method for each music band using foreach
            MusicStyles[] musicBands = {popBand, rockBand, classicBand};

            for (MusicStyles band : musicBands) {
                band.playMusic();
            }
        }
    }
}