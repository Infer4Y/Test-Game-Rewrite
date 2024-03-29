package xavier.game.common.block;

import xavier.game.common.item.Item;
import xavier.game.common.registry.Items;

public class Block {
    private String name = "";
    private float hardness, blastResistance = 1.0f;
    private boolean solid = true;

    public Block(String name){
        this.name = name;
    }

    public Block(String name, boolean b) {
        this.name = name;
        setSolid(b);
    }

    public void onBlockRightClick(){ }

    public void onBlockCollision(){ }

    public void onTick(){ }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getHardness() {
        return hardness;
    }

    public void setHardness(float hardness) {
        this.hardness = hardness;
    }

    public float getBlastResistance() {
        return blastResistance;
    }

    public void setBlastResistance(float blastResistance) {
        this.blastResistance = blastResistance;
    }

    public Item getBlockDrop(){
        return Items.getItem(this.getName());
    }

    public void setSolid(boolean solid) {
        this.solid = solid;
    }

    public boolean isSolid(){
        return solid;
    }

    public boolean isAir() {
        return  false;
    }
}
