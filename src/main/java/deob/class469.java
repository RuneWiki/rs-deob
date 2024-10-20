package deob;

@ObfuscatedName("se")
public class class469 {

    @ObfuscatedName("se.az")
    public float field4860;

    @ObfuscatedName("se.ah")
    public float field4861;

    @ObfuscatedName("se.af")
    public float field4862;

    static {
        new class469(0.0F, 0.0F, 0.0F);
        new class469(1.0F, 1.0F, 1.0F);
        new class469(1.0F, 0.0F, 0.0F);
        new class469(0.0F, 1.0F, 0.0F);
        new class469(0.0F, 0.0F, 1.0F);
    }

    public class469(float arg0, float arg1, float arg2) {
        this.field4860 = arg0;
        this.field4861 = arg1;
        this.field4862 = arg2;
    }

    @ObfuscatedName("se.az(B)F")
    public final float method7650() {
        return (float) Math.sqrt((double) (this.field4862 * this.field4862 + this.field4861 * this.field4861 + this.field4860 * this.field4860));
    }

    public String toString() {
        return this.field4860 + ", " + this.field4861 + ", " + this.field4862;
    }
}
