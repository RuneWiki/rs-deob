package deob;

@ObfuscatedName("qr")
public class class424 {

    @ObfuscatedName("qr.af")
    public float field4656;

    @ObfuscatedName("qr.an")
    public float field4653;

    @ObfuscatedName("qr.aw")
    public float field4655;

    static {
        new class424(0.0F, 0.0F, 0.0F);
        new class424(1.0F, 1.0F, 1.0F);
        new class424(1.0F, 0.0F, 0.0F);
        new class424(0.0F, 1.0F, 0.0F);
        new class424(0.0F, 0.0F, 1.0F);
    }

    public class424(float arg0, float arg1, float arg2) {
        this.field4656 = arg0;
        this.field4653 = arg1;
        this.field4655 = arg2;
    }

    @ObfuscatedName("qr.af(B)F")
    public final float method7414() {
        return (float) Math.sqrt((double) (this.field4655 * this.field4655 + this.field4656 * this.field4656 + this.field4653 * this.field4653));
    }

    public String toString() {
        return this.field4656 + ", " + this.field4653 + ", " + this.field4655;
    }
}
