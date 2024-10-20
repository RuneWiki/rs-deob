package deob;

@ObfuscatedName("qe")
public class class422 {

    @ObfuscatedName("qe.ak")
    public float field4684;

    @ObfuscatedName("qe.al")
    public float field4681;

    @ObfuscatedName("qe.aj")
    public float field4682;

    static {
        new class422(0.0F, 0.0F, 0.0F);
        new class422(1.0F, 1.0F, 1.0F);
        new class422(1.0F, 0.0F, 0.0F);
        new class422(0.0F, 1.0F, 0.0F);
        new class422(0.0F, 0.0F, 1.0F);
    }

    public class422() {
    }

    public class422(float arg0, float arg1, float arg2) {
        this.field4684 = arg0;
        this.field4681 = arg1;
        this.field4682 = arg2;
    }

    @ObfuscatedName("qe.ak(Lqe;I)Z")
    public boolean method7124(class422 arg0) {
        return this.field4684 == arg0.field4684 && this.field4681 == arg0.field4681 && this.field4682 == arg0.field4682;
    }

    @ObfuscatedName("qe.al(I)F")
    public final float method7125() {
        return (float) Math.sqrt((double) (this.field4682 * this.field4682 + this.field4684 * this.field4684 + this.field4681 * this.field4681));
    }

    public String toString() {
        return this.field4684 + ", " + this.field4681 + ", " + this.field4682;
    }
}
