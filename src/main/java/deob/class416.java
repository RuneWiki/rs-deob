package deob;

@ObfuscatedName("oy")
public class class416 {

    @ObfuscatedName("oy.f")
    public float field4633;

    @ObfuscatedName("oy.w")
    public float field4632;

    @ObfuscatedName("oy.v")
    public float field4631;

    static {
        new class416(0.0F, 0.0F, 0.0F);
        new class416(1.0F, 1.0F, 1.0F);
        new class416(1.0F, 0.0F, 0.0F);
        new class416(0.0F, 1.0F, 0.0F);
        new class416(0.0F, 0.0F, 1.0F);
    }

    public class416(float arg0, float arg1, float arg2) {
        this.field4633 = arg0;
        this.field4632 = arg1;
        this.field4631 = arg2;
    }

    @ObfuscatedName("oy.f(B)F")
    public final float method7244() {
        return (float) Math.sqrt((double) (this.field4631 * this.field4631 + this.field4633 * this.field4633 + this.field4632 * this.field4632));
    }

    public String toString() {
        return this.field4633 + ", " + this.field4632 + ", " + this.field4631;
    }
}
