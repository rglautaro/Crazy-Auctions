package me.badbones69.crazyauctions.api.events;

import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;
import org.bukkit.inventory.ItemStack;

/**
 *
 * @author BadBones69
 *
 * This event is fired when a player buys something from the selling auction house.
 *
 */
public class AuctionBuyEvent extends Event {
    
    private static final HandlerList handlers = new HandlerList();
    private Player player;
    private long price;
    private ItemStack item;
    
    /**
     *
     * @param player The player who bought the item.
     * @param item The item that was bought.
     * @param price The price of the item.
     */
    public AuctionBuyEvent(Player player, ItemStack item, long price) {
        this.player = player;
        this.item = item;
        this.price = price;
    }
    
    public static HandlerList getHandlerList() {
        return handlers;
    }
    
    public HandlerList getHandlers() {
        return handlers;
    }
    
    public Player getPlayer() {
        return player;
    }
    
    public ItemStack getItem() {
        return item;
    }
    
    public long getPrice() {
        return price;
    }
    
}