package xavier.game.common.registry;


import xavier.game.common.block.Block;
import xavier.game.common.item.Item;
import xavier.game.common.item.ItemBlock;

import java.util.HashMap;

public class Items {
    public static final HashMap<String, Item> ITEM_MAP = new HashMap<>();

    public static void init(){
        for (Block b: Blocks.BLOCK_MAP.values()) {
            register(new ItemBlock(b));
        }
    }

    public static Item getItem(String air) {
        return ITEM_MAP.get(air);
    }

    private static void register(Item item){
        ITEM_MAP.put(item.getName(), item);
    }
}
