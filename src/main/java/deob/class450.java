package deob;

@ObfuscatedName("ri")
public class class450 {

    @ObfuscatedName("ri.aw")
    public float field4732;

    @ObfuscatedName("ri.ay")
    public float field4731;

    @ObfuscatedName("ri.ar")
    public float field4730;

    static {
        new class450(0.0F, 0.0F, 0.0F);
        new class450(1.0F, 1.0F, 1.0F);
        new class450(1.0F, 0.0F, 0.0F);
        new class450(0.0F, 1.0F, 0.0F);
        new class450(0.0F, 0.0F, 1.0F);
    }

    public class450(float arg0, float arg1, float arg2) {
        this.field4732 = arg0;
        this.field4731 = arg1;
        this.field4730 = arg2;
    }

    @ObfuscatedName("ri.aw(B)F")
    public final float method7454() {
        return (float) Math.sqrt((double) (this.field4730 * this.field4730 + this.field4732 * this.field4732 + this.field4731 * this.field4731));
    }

    public String toString() {
        return this.field4732 + ", " + this.field4731 + ", " + this.field4730;
    }
}
