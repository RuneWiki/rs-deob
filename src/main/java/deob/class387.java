package deob;

@ObfuscatedName("nv")
public class class387 {

    @ObfuscatedName("nv.o")
    public float field4393;

    @ObfuscatedName("nv.q")
    public float field4391;

    @ObfuscatedName("nv.l")
    public float field4392;

    static {
        new class387(0.0F, 0.0F, 0.0F);
        new class387(1.0F, 1.0F, 1.0F);
        new class387(1.0F, 0.0F, 0.0F);
        new class387(0.0F, 1.0F, 0.0F);
        new class387(0.0F, 0.0F, 1.0F);
        method6644(100);
    }

    @ObfuscatedName("pi.o(II)V")
    public static void method6644(int arg0) {
    }

    public class387(float arg0, float arg1, float arg2) {
        this.field4393 = arg0;
        this.field4391 = arg1;
        this.field4392 = arg2;
    }

    @ObfuscatedName("nv.q(B)F")
    public final float method6198() {
        return (float) Math.sqrt((double) (this.field4392 * this.field4392 + this.field4393 * this.field4393 + this.field4391 * this.field4391));
    }

    public String toString() {
        return this.field4393 + ", " + this.field4391 + ", " + this.field4392;
    }
}
