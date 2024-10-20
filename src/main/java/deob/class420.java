package deob;

@ObfuscatedName("qe")
public class class420 {

    @ObfuscatedName("qe.aj")
    public float field4598;

    @ObfuscatedName("qe.al")
    public float field4595;

    @ObfuscatedName("qe.ac")
    public float field4599;

    static {
        new class420(0.0F, 0.0F, 0.0F);
        new class420(1.0F, 1.0F, 1.0F);
        new class420(1.0F, 0.0F, 0.0F);
        new class420(0.0F, 1.0F, 0.0F);
        new class420(0.0F, 0.0F, 1.0F);
    }

    public class420(float arg0, float arg1, float arg2) {
        this.field4598 = arg0;
        this.field4595 = arg1;
        this.field4599 = arg2;
    }

    @ObfuscatedName("qe.aj(B)F")
    public final float method7154() {
        return (float) Math.sqrt((double) (this.field4599 * this.field4599 + this.field4598 * this.field4598 + this.field4595 * this.field4595));
    }

    public String toString() {
        return this.field4598 + ", " + this.field4595 + ", " + this.field4599;
    }
}
