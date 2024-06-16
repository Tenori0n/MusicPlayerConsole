import org.junit.*;

import static org.junit.Assert.assertEquals;

public class MPTest {
    private final MP TestMP = new MP();
    @Test
    public void testAddSong() {
        MPSong testSong = new MPSong();
        testSong.setAuthor("1");
        testSong.setSongName("2");
        testSong.setDuration(3);
        testSong.setPaz(System.getProperty("user.dir") + "\\Resources" + "\\Songs\\" + testSong.getAuthor() + " -- " + testSong.getSongName() + ".mp3");
        TestMP.getPlaylists().getFirst().addSong(testSong);
        assertEquals(testSong, TestMP.getPlaylists().getFirst().getSongList().getFirst());
    }
    @Test
    public void testRemoveSong() {
        MPSong testSong = new MPSong();
        testSong.setAuthor("1");
        testSong.setSongName("2");
        testSong.setDuration(3);
        testSong.setPaz(System.getProperty("user.dir") + "\\Resources" + "\\Songs\\" + testSong.getAuthor() + " -- " + testSong.getSongName() + ".mp3");
        TestMP.getPlaylists().getFirst().addSong(testSong);
        TestMP.getPlaylists().getFirst().removeSong(testSong);
        assertEquals(0, TestMP.getPlaylists().getFirst().getSongList().size());
    }
    @Test
    public void testNextTrack()
    {
        MPSong testSong1 = new MPSong();
        testSong1.setAuthor("1");
        testSong1.setSongName("2");
        testSong1.setDuration(3);
        testSong1.setPaz(System.getProperty("user.dir") + "\\Resources" + "\\Songs\\" + testSong1.getAuthor() + " -- " + testSong1.getSongName() + ".mp3");
        MPSong testSong2 = new MPSong();
        testSong2.setAuthor("4");
        testSong2.setSongName("5");
        testSong2.setDuration(6);
        testSong2.setPaz(System.getProperty("user.dir") + "\\Resources" + "\\Songs\\" + testSong2.getAuthor() + " -- " + testSong2.getSongName() + ".mp3");
        TestMP.getPlaylists().getFirst().addSong(testSong1);
        TestMP.getPlaylists().getFirst().addSong(testSong2);
        TestMP.setCurrentPlaylist(TestMP.getPlaylists().getFirst());
        TestMP.setCurrentSong(TestMP.getPlaylists().getFirst().getSongList().getFirst());
        TestMP.nextTrack();
        assertEquals(testSong2, TestMP.getCurrentSong());
    }
    @Test
    public void testPrevTrack()
    {
        MPSong testSong1 = new MPSong();
        testSong1.setAuthor("1");
        testSong1.setSongName("2");
        testSong1.setDuration(3);
        testSong1.setPaz(System.getProperty("user.dir") + "\\Resources" + "\\Songs\\" + testSong1.getAuthor() + " -- " + testSong1.getSongName() + ".mp3");
        MPSong testSong2 = new MPSong();
        testSong2.setAuthor("4");
        testSong2.setSongName("5");
        testSong2.setDuration(6);
        testSong2.setPaz(System.getProperty("user.dir") + "\\Resources" + "\\Songs\\" + testSong2.getAuthor() + " -- " + testSong2.getSongName() + ".mp3");
        TestMP.getPlaylists().getFirst().addSong(testSong1);
        TestMP.getPlaylists().getFirst().addSong(testSong2);
        TestMP.setCurrentPlaylist(TestMP.getPlaylists().getFirst());
        TestMP.setCurrentSong(TestMP.getPlaylists().getFirst().getSongList().getFirst());
        TestMP.nextTrack();
        TestMP.previousTrack();
        assertEquals(testSong1, TestMP.getCurrentSong());
    }
    @Test
    public void testRepeatTrack()
    {
        MPSong testSong1 = new MPSong();
        testSong1.setAuthor("1");
        testSong1.setSongName("2");
        testSong1.setDuration(3);
        testSong1.setPaz(System.getProperty("user.dir") + "\\Resources" + "\\Songs\\" + testSong1.getAuthor() + " -- " + testSong1.getSongName() + ".mp3");
        MPSong testSong2 = new MPSong();
        testSong2.setAuthor("4");
        testSong2.setSongName("5");
        testSong2.setDuration(6);
        testSong2.setPaz(System.getProperty("user.dir") + "\\Resources" + "\\Songs\\" + testSong2.getAuthor() + " -- " + testSong2.getSongName() + ".mp3");
        TestMP.getPlaylists().getFirst().addSong(testSong1);
        TestMP.getPlaylists().getFirst().addSong(testSong2);
        TestMP.setCurrentPlaylist(TestMP.getPlaylists().getFirst());
        TestMP.setCurrentSong(TestMP.getPlaylists().getFirst().getSongList().getFirst());
        TestMP.nextTrack();
        TestMP.repeatTrack();
        assertEquals(testSong2, TestMP.getCurrentSong());
    }
}
