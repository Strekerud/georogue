package no.ok.it.georogue.gameObjects;

public interface IGameObject {
	void Render();
	boolean IsColiding();
	int GetXPos();
	int GetYPos();
	void Update();
}
