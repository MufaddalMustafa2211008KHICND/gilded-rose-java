import org.apache.commons.lang3.StringUtils;

public class GildedRose {

    public String name;
    public int quality;
    public int daysRemaining;

    public Normal GildedRose(String name, int quality, int daysRemaining) {
        this.name = name;
        this.quality = quality;
        this.daysRemaining = daysRemaining;
        return new Normal(null);
    }

    public void tick() {

        if(name.equals("normal")){
            Normal normal = new Normal(this);
            normal.tick();
        }

        if(name.equals("Aged Brie")){
            Brie brie = new Brie(this);
            brie.tick(); 
        }

        if(name.equals("Backstage passes to a TAFKAL80ETC concert")){
            Backstage backstage = new Backstage(this);
            backstage.tick();
        }

        if(name.equals("Sulfuras, Hand of Ragnaros")){
            Sulfuras sulfuras = new Sulfuras(this);
            sulfuras.tick();
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
