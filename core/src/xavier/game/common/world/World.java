package xavier.game.common.world;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import xavier.game.client.renders.BlockRenderer;
import xavier.game.common.registry.Blocks;

public class World {
    private BlockRenderer[][] blocks;

    public World(int x, int y) {
        this.blocks = new BlockRenderer[y][x];
        for (int i = 0; i <getHeight(); i++){
            for (int j = 0; j <getWidth(); j++){
                blocks[i][j] = new BlockRenderer(Blocks.air,j * 64, i *64);
            }
        }
    }

    public void draw(SpriteBatch batch){

        for (int i = 0; i <getHeight(); i++){
            for (BlockRenderer renderer: blocks[i]){
                renderer.draw(batch);
            }
        }
    }

    public int getHeight() {
        return blocks.length;
    }

    public int getWidth() {
        return blocks[0].length;
    }

    public BlockRenderer[][] getBlocks() {
        return blocks;
    }
}
