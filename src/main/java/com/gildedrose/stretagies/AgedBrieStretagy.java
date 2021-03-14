package com.gildedrose.stretagies;

import com.gildedrose.Item;

public class AgedBrieStretagy implements QualityStretagy{
    @Override
    public Item updateQaulity(Item item) {
        Item output = new Item(item.name, item.sellIn, item.quality);
        output.sellIn = output.sellIn - 1;
        if(output.sellIn < 0) {
            output.quality = output.quality + 2;
        } else {
            output.quality = output.quality + 1;
        }
        if(output.quality > 50)
            output.quality = 50;
        return output;
    }
}
