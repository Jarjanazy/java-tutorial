package refactoringTutorial;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class CleanCode {
    Item[] items;

    public CleanCode(Item[] items) {
        this.items = items;
    }


    public void updateQuality() {
        for (Item item : items) {
            if (conditionsAreMetForQualityReduction(item))
                item.quality = item.quality - 1;
            else if (item.quality < 50)
                performQualityAdditionProcess(item);
        }
    }

    private void performQualityAdditionProcess(Item item) {
        item.quality = item.quality + 1;

        if (item.name.equals("Backstage passes to a TAFKAL80ETC concert")) {

            if (item.sellIn < 11 && item.quality < 50) {
                item.quality = item.quality + 1;
            }
            if (item.sellIn < 6 && item.quality < 50) {
                item.quality = item.quality + 1;
            }
        }
    }

    private boolean conditionsAreMetForQualityReduction(Item item) {
        String name = item.name;
        return !name.equals("Aged Brie") &&
                !name.equals("Backstage passes to a TAFKAL80ETC concert") &&
                item.quality > 0 &&
                !name.equals("Sulfuras, Hand of Ragnaros");
    }

}
