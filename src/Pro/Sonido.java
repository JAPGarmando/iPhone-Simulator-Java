/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pro;

import java.applet.Applet;
import java.applet.AudioClip;

/**
 *
 * @author Azka
 */
public class Sonido {
	public static final AudioClip LINK = Applet.newAudioClip(Sonido.class.getResource("zeldaa.wav"));
        public static final AudioClip GAMEOVER = Applet.newAudioClip(Sonido.class.getResource("gameoveer.wav"));
        public static final AudioClip CHUEK = Applet.newAudioClip(Sonido_1.class.getResource("chuek.wav"));
        public static final AudioClip GAMEOVERR = Applet.newAudioClip(Sonido_1.class.getResource("gameover.wav"));
        public static final AudioClip BOING = Applet.newAudioClip(Sonido_1.class.getResource("boingo.wav"));
}
