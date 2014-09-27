package no.ok.it.georogue.gameObjects;

import org.newdawn.slick.Image;
import org.newdawn.slick.geom.Shape;

public abstract class GameObject implements IGameObject {
	
	int ypos = 0;
	int xpos = 0;
	Image sprite = null;
	Shape collitionShape = null;
	
	@Override
	public void Render() {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean IsColiding(Shape other) {
		return collitionShape.intersects(other);
	}

	@Override
	public int GetXPos() {
		// TODO Auto-generated method stub
		return xpos;
	}

	@Override
	public int GetYPos() {
		// TODO Auto-generated method stub
		return ypos;
	}

	@Override
	public void Update() {
		// TODO Auto-generated method stub

	}

}
