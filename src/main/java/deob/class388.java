package deob;

@ObfuscatedName("ny")
public class class388 {

    @ObfuscatedName("ny.c")
    public float field4424;

    @ObfuscatedName("ny.p")
    public float field4425;

    @ObfuscatedName("ny.f")
    public float field4426;

    static {
        new class388(0.0F, 0.0F, 0.0F);
        new class388(1.0F, 1.0F, 1.0F);
        new class388(1.0F, 0.0F, 0.0F);
        new class388(0.0F, 1.0F, 0.0F);
        new class388(0.0F, 0.0F, 1.0F);
        method3545(100);
    }

    @ObfuscatedName("gw.c(II)V")
    public static void method3545(int arg0) {
    }

    public class388(float arg0, float arg1, float arg2) {
        this.field4424 = arg0;
        this.field4425 = arg1;
        this.field4426 = arg2;
    }

    @ObfuscatedName("ny.p(I)F")
    public final float method6459() {
        return (float) Math.sqrt((double) (this.field4426 * this.field4426 + this.field4425 * this.field4425 + this.field4424 * this.field4424));
    }

    public String toString() {
        return this.field4424 + ", " + this.field4425 + ", " + this.field4426;
    }
}
