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

        switch (name) {
            case "normal":
                Normal normal = new Normal(this);
                normal.tick();
                break;
            case "Aged Brie":
                Brie brie = new Brie(this);
                brie.tick();
                break;
            case "Backstage passes to a TAFKAL80ETC concert":
                Backstage backstage = new Backstage(this);
                backstage.tick();
                break;
            case "Sulfuras, Hand of Ragnaros":
                Sulfuras sulfuras = new Sulfuras(this);
                sulfuras.tick();
                break;
            case "Conjured Item":
                Conjured conjured = new Conjured(this);
                conjured.tick();
                break;
        }
        // if(!StringUtils.equals(name, "Aged Brie") && !StringUtils.equals(name,
        // "Backstage passes to a TAFKAL80ETC concert")) {
        // if(quality > 0) {
        // if(!StringUtils.equals(name, "Sulfuras, Hand of Ragnaros")) {
        // quality -= 1;
        // }
        // }
        // } else {
        // if(quality < 50) {
        // quality += 1;
        // if(StringUtils.equals(name, "Backstage passes to a TAFKAL80ETC concert")) {
        // if(daysRemaining < 11) {
        // if(quality < 50) {
        // quality += 1;
        // }
        // }
        // if(daysRemaining < 6) {
        // if(quality < 50) {
        // quality += 1;
        // }
        // }
        // }
        // }
        // }
        // if(!StringUtils.equals(name, "Sulfuras, Hand of Ragnaros")) {
        // daysRemaining -= 1;
        // }
        // if(daysRemaining < 0) {
        // if(!StringUtils.equals(name, "Aged Brie")) {
        // if(!StringUtils.equals(name, "Backstage passes to a TAFKAL80ETC concert")) {
        // if(quality > 0) {
        // if(!StringUtils.equals(name, "Sulfuras, Hand of Ragnaros")) {
        // quality -=1;
        // }
        // }
        // } else {
        // quality = quality - quality;
        // }
        // } else {
        // if(quality < 50) {
        // quality += 1;
        // }
        // }
        // }
    }
}
