public class Backstage {

    private GildedRose gr;
    
    public Backstage(GildedRose gr) {
        this.gr = gr;
    }

    public void tick() {
        if(gr.quality < 50 && gr.daysRemaining > 0){
            gr.quality += 1;
            if(gr.daysRemaining < 30) gr.quality += 1;
            if(gr.daysRemaining <= 5) gr.quality += 1;
        }
        if(gr.daysRemaining <= 0)
            gr.quality = 0;
        gr.daysRemaining -= 1;
    }
}
