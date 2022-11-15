/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mp3Player;

import jaco.mp3.player.MP3Player;

public class PlayerSet{
    public MP3Player player;
    public MP3Player setPlayer(){
        player=new MP3Player();
        return player;
    }
    
}