package no.ok.it.georogue.gameObjects;

import org.newdawn.slick.geom.Shape;

public interface IGameObject {
	void Render();
	boolean IsColiding(Shape other);
	int GetXPos();
	int GetYPos();
	void Update();
}
