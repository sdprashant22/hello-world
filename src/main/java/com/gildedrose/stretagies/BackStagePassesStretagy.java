package com.gildedrose.stretagies;

import com.gildedrose.Item;

public class BackStagePassesStretagy implements QualityStretagy {
    @Override
    public Item updateQaulity(Item item) {
        Item output = new Item(item.name, item.sellIn, item.quality);
        output.sellIn = output.sellIn - 1;
        if(output.sellIn <= 0) {
            output.quality = 0;
        } else if(output.sellIn <= 5) {
            output.quality = output.quality + 3;
        } else if(output.sellIn <= 10) {
            output.quality = output.quality + 2;
        } else {
            output.quality = output.quality + 1;
        }
        if(output.quality > 50)
            output.quality = 50;
        return output;
    }
}
