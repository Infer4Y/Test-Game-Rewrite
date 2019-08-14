package xavier.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.InputProcessor;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.scenes.scene2d.*;
import xavier.game.common.item.Item;
import xavier.game.common.registry.Blocks;
import xavier.game.common.registry.Items;
import xavier.game.common.world.World;

public class MyGdxGame extends ApplicationAdapter  implements InputProcessor {
	private SpriteBatch batch;
	OrthographicCamera camera;
	private World world;

	@Override
	public void create() {
		float w = Gdx.graphics.getWidth();
		float h = Gdx.graphics.getHeight();
		Blocks.init();
		Items.init();
		Textures.init(Items.ITEM_MAP,Blocks.BLOCK_MAP);
		world = new World(Gdx.graphics.getWidth()/64,Gdx.graphics.getHeight()/64);
		batch = new SpriteBatch();
		camera = new OrthographicCamera();
		camera.setToOrtho(false, w, h);
		batch.setProjectionMatrix(camera.combined);
	}

	@Override
	public void dispose() {
		batch.dispose();
		Textures.dispose();
	}

	@Override
	public void render() {
		Gdx.gl.glClearColor(0.1f, 0.5f, 0.6f, 1.0f);
		Gdx.gl.glBlendFunc(GL20.GL_SRC_ALPHA, GL20.GL_ONE_MINUS_SRC_ALPHA);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		batch.setProjectionMatrix(camera.combined);
		batch.begin();
		world.draw(batch);
		batch.end();
		camera.update();
	}

	@Override
	public void pause() {
	}

	@Override
	public void resume() {
	}


	@Override
	public boolean keyDown(int keycode) {
		if(keycode == Input.Keys.A)
			camera.translate(-32,0);
		if(keycode == Input.Keys.D)
			camera.translate(32,0);
		if(keycode == Input.Keys.W)
			camera.translate(0,-32);
		if(keycode == Input.Keys.S)
			camera.translate(0,32);
		return false;
	}

	@Override
	public boolean keyUp(int keycode) {
		return false;
	}

	@Override
	public boolean keyTyped(char character) {
		return false;
	}

	@Override
	public boolean touchDown(int screenX, int screenY, int pointer, int button) {
		return false;
	}

	@Override
	public boolean touchUp(int screenX, int screenY, int pointer, int button) {
		return false;
	}

	@Override
	public boolean touchDragged(int screenX, int screenY, int pointer) {
		return false;
	}

	@Override
	public boolean mouseMoved(int screenX, int screenY) {
		return false;
	}

	@Override
	public boolean scrolled(int amount) {
		return false;
	}

	@Override
	public void resize(int width, int height) {
		float aspectRatio = (float) width / (float) height;
		camera = new OrthographicCamera(2f * aspectRatio, 2f);
	}
}
