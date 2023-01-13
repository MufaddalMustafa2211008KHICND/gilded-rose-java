import org.apache.commons.lang3.StringUtils;

public class GildedRose {

    public String name;
    public int quality;
    public int daysRemaining;

    public GildedRose(String name, int quality, int daysRemaining) {
        this.name = name;
        this.quality = quality;
        this.daysRemaining = daysRemaining;
    }

    public void tick() {

        if(name.equals("normal")){
            if(quality > 0)
                quality -= 1;
            if(daysRemaining <= 0)
                quality -= 1;
            daysRemaining -= 1;
        }

        if(name.equals("Aged Brie")){
            if(quality < 50 && daysRemaining > 0)
                quality += 1;
            if(quality < 49 && daysRemaining <= 0)
                quality += 2;
            if(quality == 49 && daysRemaining <= 0)
                quality += 1;
            daysRemaining -= 1;
        }

        if(name.equals("Backstage passes to a TAFKAL80ETC concert")){
            if(quality < 50 && daysRemaining > 0){
                quality += 1;
                if(daysRemaining < 30) quality += 1;
                if(daysRemaining <= 5) quality += 1;
            }
            if(daysRemaining <= 0)
                quality = 0;
            daysRemaining -= 1;
        }
        // if(!StringUtils.equals(name, "Aged Brie") && !StringUtils.equals(name, "Backstage passes to a TAFKAL80ETC concert")) {
        //     if(quality > 0) {
        //         if(!StringUtils.equals(name, "Sulfuras, Hand of Ragnaros")) {
        //             quality -= 1;
        //         }
        //     }
        // } else {
        //     if(quality < 50) {
        //         quality += 1;
        //         if(StringUtils.equals(name, "Backstage passes to a TAFKAL80ETC concert")) {
        //             if(daysRemaining < 11) {
        //                 if(quality < 50) {
        //                     quality += 1;
        //                 }
        //             }
        //             if(daysRemaining < 6) {
        //                 if(quality < 50) {
        //                     quality += 1;
        //                 }
        //             }
        //         }
        //     }
        // }
        // if(!StringUtils.equals(name, "Sulfuras, Hand of Ragnaros")) {
        //     daysRemaining -= 1;
        // }
        // if(daysRemaining < 0) {
        //     if(!StringUtils.equals(name, "Aged Brie")) {
        //         if(!StringUtils.equals(name, "Backstage passes to a TAFKAL80ETC concert")) {
        //             if(quality > 0) {
        //                 if(!StringUtils.equals(name, "Sulfuras, Hand of Ragnaros")) {
        //                     quality -=1;
        //                 }
        //             }
        //         } else {
        //             quality = quality - quality;
        //         }
        //     } else {
        //         if(quality < 50) {
        //             quality += 1;
        //         }
        //     }
        // }
    }
}
