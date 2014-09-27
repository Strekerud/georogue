package no.ok.it.georogue.main;

import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.BasicGame;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Music;
import org.newdawn.slick.SlickException;

public class Georogue extends BasicGame{

	public Georogue() {
		super("Georogue");
	}

	public static void main(String[] args) {
		try
        {
            AppGameContainer app = new AppGameContainer(new Georogue());
            app.setDisplayMode(500, 400, false);
            app.setShowFPS(false);
            app.setTargetFrameRate(60);
            app.start();
        }
        catch (SlickException e)
        {
            e.printStackTrace();
        }

	}

	@Override
	public void render(GameContainer arg0, Graphics arg1) throws SlickException {
		

		
	}

	@Override
	public void init(GameContainer arg0) throws SlickException {
		Music openingMenuMusic = new Music("res/sound/fast.ogg");
		
		openingMenuMusic.loop();
	}

	@Override
	public void update(GameContainer arg0, int arg1) throws SlickException {
		
	}

}
