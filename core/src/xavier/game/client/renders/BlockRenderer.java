package xavier.game.client.renders;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.math.collision.BoundingBox;
import xavier.game.Textures;
import xavier.game.common.block.Block;

public class BlockRenderer extends Renderer {
    private Texture texture;
    private Block block;
    private Rectangle box = new Rectangle();
    private int x, y;

    public BlockRenderer(Block block, int x, int y) {
        this.block = block;
        this.x = x;
        this.y = y;
        this.texture = Textures.getTexture(block.getName());
    }

    @Override
    public void draw(SpriteBatch batch) {
        super.draw(batch);
        batch.draw(texture, x , y);
    }

    @Override
    public void tick() {
        super.tick();
    }

    public Block getBlock() {
        return block;
    }

    public void setBlock(Block block) {
        this.block = block;
    }

    public Rectangle getBox() {
        return box;
    }

    public void setBox(Rectangle box) {
        this.box = box;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
