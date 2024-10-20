package deob;

@ObfuscatedName("ol")
public class class406 {

    @ObfuscatedName("ol.a")
    public float field4554;

    @ObfuscatedName("ol.f")
    public float field4555;

    @ObfuscatedName("ol.c")
    public float field4553;

    static {
        new class406(0.0F, 0.0F, 0.0F);
        new class406(1.0F, 1.0F, 1.0F);
        new class406(1.0F, 0.0F, 0.0F);
        new class406(0.0F, 1.0F, 0.0F);
        new class406(0.0F, 0.0F, 1.0F);
        Statics.method2541(100);
    }

    public class406(float arg0, float arg1, float arg2) {
        this.field4554 = arg0;
        this.field4555 = arg1;
        this.field4553 = arg2;
    }

    @ObfuscatedName("ol.f(I)F")
    public final float method6962() {
        return (float) Math.sqrt((double) (this.field4553 * this.field4553 + this.field4555 * this.field4555 + this.field4554 * this.field4554));
    }

    public String toString() {
        return this.field4554 + ", " + this.field4555 + ", " + this.field4553;
    }
}
