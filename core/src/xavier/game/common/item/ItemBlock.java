package xavier.game.common.item;


import xavier.game.common.block.Block;

public class ItemBlock extends Item{
    private Block block;

    public ItemBlock(Block block){
        this.block = block;
        this.setName(this.block.getName());
    }

    public Block getBlock() {
        return block;
    }
}
