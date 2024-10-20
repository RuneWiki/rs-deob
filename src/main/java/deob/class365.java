package deob;

@ObfuscatedName("ne")
public class class365 {

    @ObfuscatedName("ne.c")
    public float field4182;

    @ObfuscatedName("ne.b")
    public float field4181;

    @ObfuscatedName("ne.p")
    public float field4183;

    static {
        new class365(0.0F, 0.0F, 0.0F);
        new class365(1.0F, 1.0F, 1.0F);
        new class365(1.0F, 0.0F, 0.0F);
        new class365(0.0F, 1.0F, 0.0F);
        new class365(0.0F, 0.0F, 1.0F);
        method1008(100);
    }

    @ObfuscatedName("bp.c(II)V")
    public static void method1008(int arg0) {
    }

    public class365(float arg0, float arg1, float arg2) {
        this.field4182 = arg0;
        this.field4181 = arg1;
        this.field4183 = arg2;
    }

    @ObfuscatedName("ne.b(I)F")
    public final float method5975() {
        return (float) Math.sqrt((double) (this.field4183 * this.field4183 + this.field4182 * this.field4182 + this.field4181 * this.field4181));
    }

    public String toString() {
        return this.field4182 + ", " + this.field4181 + ", " + this.field4183;
    }
}
