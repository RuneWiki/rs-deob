package deob;

@ObfuscatedName("ow")
public class class409 {

    @ObfuscatedName("ow.h")
    public float field4599;

    @ObfuscatedName("ow.e")
    public float field4600;

    @ObfuscatedName("ow.v")
    public float field4598;

    static {
        new class409(0.0F, 0.0F, 0.0F);
        new class409(1.0F, 1.0F, 1.0F);
        new class409(1.0F, 0.0F, 0.0F);
        new class409(0.0F, 1.0F, 0.0F);
        new class409(0.0F, 0.0F, 1.0F);
    }

    public class409(float arg0, float arg1, float arg2) {
        this.field4599 = arg0;
        this.field4600 = arg1;
        this.field4598 = arg2;
    }

    @ObfuscatedName("ow.h(B)F")
    public final float method7049() {
        return (float) Math.sqrt((double) (this.field4598 * this.field4598 + this.field4600 * this.field4600 + this.field4599 * this.field4599));
    }

    public String toString() {
        return this.field4599 + ", " + this.field4600 + ", " + this.field4598;
    }
}
