public class Brie {
    private GildedRose gr;

    public Brie(GildedRose gr) {
        this.gr = gr;
    }

    public void tick() {
        if (gr.quality < 50 && gr.daysRemaining > 0)
            gr.quality += 1;
        if (gr.quality < 49 && gr.daysRemaining <= 0)
            gr.quality += 2;
        if (gr.quality == 49 && gr.daysRemaining <= 0)
            gr.quality += 1;
        gr.daysRemaining -= 1;
    }
}
