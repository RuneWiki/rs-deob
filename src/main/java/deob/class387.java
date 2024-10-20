package deob;

@ObfuscatedName("nw")
public class class387 {

    @ObfuscatedName("nw.s")
    public float field4388;

    @ObfuscatedName("nw.h")
    public float field4387;

    @ObfuscatedName("nw.w")
    public float field4389;

    static {
        new class387(0.0F, 0.0F, 0.0F);
        new class387(1.0F, 1.0F, 1.0F);
        new class387(1.0F, 0.0F, 0.0F);
        new class387(0.0F, 1.0F, 0.0F);
        new class387(0.0F, 0.0F, 1.0F);
    }

    public class387(float arg0, float arg1, float arg2) {
        this.field4388 = arg0;
        this.field4387 = arg1;
        this.field4389 = arg2;
    }

    @ObfuscatedName("nw.s(I)F")
    public final float method6214() {
        return (float) Math.sqrt((double) (this.field4389 * this.field4389 + this.field4388 * this.field4388 + this.field4387 * this.field4387));
    }

    public String toString() {
        return this.field4388 + ", " + this.field4387 + ", " + this.field4389;
    }
}
