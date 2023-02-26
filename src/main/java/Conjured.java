public class Conjured {

    private GildedRose gr;
    
    public Conjured(GildedRose gr) {
        this.gr = gr;
    }

    public void tick() {
        if(gr.daysRemaining > 0){
            if(gr.quality != 1)
                gr.quality -= 1;
            gr.quality -= 1;
        }
        else{
            if(gr.quality != 0)
                gr.quality -= 4;
        }
        gr.daysRemaining -= 1;
    }
}
