/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10119024.latihan32.datafilm;

/**
 *
 * @author Kusnandi
 * NAMA  : Kusnandi Pirmansyah
 * KELAS : IF-1
 * NIM   : 10119024
 */
public class If110119024Latihan32Datafilm {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Film jadul1 = new Film();
        Film jadul2 = new Film();
        Film jadul3 = new Film();
        Film jadul4 = new Film();
        
        judul1.filmName = "Venom";
        judul1.filmGenre = "Action, Horror, Scifi";
        judul1.filmRating = 8.5;
        judul1.filmDuration = 120;
        
        judul2.filmName = "Small Foot";
        judul2.filmGenre = "Animation";
        judul2.filmRating = 9.0;
        judul2.filmDuration = 119;
        
        judul3.filmName = "Crazy Rich Asian";
        judul3.filmGenre = "Comedy";
        judul3.filmRating = 7.8;
        judul3.filmDuration = 119;
        
        judul4.filmName = "Asih";
        judul4.filmGenre = "Horror";
        judul4.filmRating = 6.0;
        judul4.filmDuration = 100;
        
        System.out.println("===Daftar Film Sedang Tayang===\n");
        judul1.nowPlaying();
        judul2.nowPlaying();
        judul3.nowPlaying();
        judul4.nowPlaying();
    }
    
}
