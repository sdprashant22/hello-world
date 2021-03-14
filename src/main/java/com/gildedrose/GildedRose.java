package com.gildedrose;

import com.gildedrose.stretagies.*;

class GildedRose {
    Item[] items;
    QualityStretagy qualityStretagy;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        for(int i = 0; i < items.length; i++) {
            if(items[i].name.equals("Aged Brie")) {
                qualityStretagy = new AgedBrieStretagy();
            } else if(items[i].name.equals("Backstage passes to a TAFKAL80ETC concert")) {
                qualityStretagy = new BackStagePassesStretagy();
            } else if(items[i].name.equals("Sulfuras, Hand of Ragnaros")) {
                qualityStretagy = new SulfurousStretagy();
            } else if(items[i].name.equals("Conjured Mana Cake")) {
                qualityStretagy = new ConjuredStretagy();
            } else {
                qualityStretagy = new DefaultStretagy();
            }
            items[i] = qualityStretagy.updateQaulity(items[i]);
        }
    }
}