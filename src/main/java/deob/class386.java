package deob;

@ObfuscatedName("na")
public class class386 {

    @ObfuscatedName("na.v")
    public float field4337;

    @ObfuscatedName("na.c")
    public float field4335;

    @ObfuscatedName("na.i")
    public float field4334;

    static {
        new class386(0.0F, 0.0F, 0.0F);
        new class386(1.0F, 1.0F, 1.0F);
        new class386(1.0F, 0.0F, 0.0F);
        new class386(0.0F, 1.0F, 0.0F);
        new class386(0.0F, 0.0F, 1.0F);
    }

    public class386(float arg0, float arg1, float arg2) {
        this.field4337 = arg0;
        this.field4335 = arg1;
        this.field4334 = arg2;
    }

    @ObfuscatedName("na.v(I)F")
    public final float method6312() {
        return (float) Math.sqrt((double) (this.field4334 * this.field4334 + this.field4337 * this.field4337 + this.field4335 * this.field4335));
    }

    public String toString() {
        return this.field4337 + ", " + this.field4335 + ", " + this.field4334;
    }
}
