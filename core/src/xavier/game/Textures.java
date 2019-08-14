package xavier.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import xavier.game.common.block.Block;
import xavier.game.common.item.Item;

import java.util.HashMap;

public class Textures {
    private static final HashMap<String, Texture> TEXTURE_MAP = new HashMap<>();
    public static final Texture BACKGROUND = new Texture(Gdx.files.internal("tex/background.png"));
    public static final Texture PLAYER = new Texture(Gdx.files.internal("tex/entities/player.png"));
    public static final Texture PLACE_HOLDER = new Texture(Gdx.files.internal("tex/placeholder.png"));

    public static void dispose(){
        for (Texture t: TEXTURE_MAP.values()) {
            t.dispose();
        }
    }

    public static void init(HashMap<String, Item> items, HashMap<String, Block> blocks) {
        for (Block b: blocks.values()) {
            register(b);
        }
        for (Item i : items.values()){
            register(i);
        }
    }

    public static Texture getTexture(String name){
        return TEXTURE_MAP.get(name);
    }

    public static void register(Block block){
        TEXTURE_MAP.put(block.getName(), new Texture(Gdx.files.internal("tex/blocks/"+block.getName()+".png")));
    }

    public static void register(Item block){
        TEXTURE_MAP.put(block.getName(), new Texture(Gdx.files.internal("tex/blocks/"+block.getName()+".png")));
    }

    public static HashMap<String, Texture> getTextures() {
        return TEXTURE_MAP;
    }
}
