package xavier.game.common.item;

public interface IItem {
    String getName();
    void setName(String name);
    void onItemUse();
}
