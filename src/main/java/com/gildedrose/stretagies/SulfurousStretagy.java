package com.gildedrose.stretagies;

import com.gildedrose.Item;

public class SulfurousStretagy implements QualityStretagy{
    @Override
    public Item updateQaulity(Item item) {
        return new Item(item.name, item.sellIn, item.quality);
    }
}
