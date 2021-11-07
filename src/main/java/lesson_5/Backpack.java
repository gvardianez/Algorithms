package lesson_5;

import java.util.ArrayList;
import java.util.List;

public class Backpack {

    private List<Item> bestItems;
    private final int maxWeight;
    private int bestPrice;

    public Backpack(int maxWeight) {
        this.maxWeight = maxWeight;
    }

    public List<Item> getBestSetItems(List<Item> items){
        checkAllSetItems(items);
        return bestItems;
    }

    private void checkAllSetItems(List<Item> items) {
        if (items.size() > 0) {
            checkBestSetItems(items);
        }
        for (int i = 0; i < items.size(); i++) {
            List<Item> newItemsSet = new ArrayList<>(items);
            newItemsSet.remove(i);
            checkAllSetItems(newItemsSet);
        }
    }

    private void checkBestSetItems(List<Item> items) {
        if (bestItems == null) {
            if (calcWeight(items) <= maxWeight) {
                bestItems = items;
                bestPrice = calcPrice(items);
            }
        } else {
            if (calcWeight(items) <= maxWeight && calcPrice(items) > bestPrice) {
                bestItems = items;
                bestPrice = calcPrice(items);
            }
        }
    }

    private int calcWeight(List<Item> items) {
        int sumWeight = 0;
        for (Item item : items) {
            sumWeight += item.getWeight();
        }
        return sumWeight;
    }

    private int calcPrice(List<Item> items) {
        int sumPrice = 0;
        for (Item item : items) {
            sumPrice += item.getPrice();
        }
        return sumPrice;
    }

}
