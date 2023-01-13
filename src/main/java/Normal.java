public class Normal {

    private GildedRose gr;
    public Normal(GildedRose gr) {
        this.gr = gr;
    }

    public void tick() {
        if (gr.quality > 0)
            gr.quality -= 1;
        if (gr.daysRemaining <= 0)
            gr.quality -= 1;
        gr.daysRemaining -= 1;
    }
}
