package deob;

@ObfuscatedName("rj")
public class class449 {

    @ObfuscatedName("rj.au")
    public float field4727;

    @ObfuscatedName("rj.ae")
    public float field4726;

    @ObfuscatedName("rj.ao")
    public float field4728;

    static {
        new class449(0.0F, 0.0F, 0.0F);
        new class449(1.0F, 1.0F, 1.0F);
        new class449(1.0F, 0.0F, 0.0F);
        new class449(0.0F, 1.0F, 0.0F);
        new class449(0.0F, 0.0F, 1.0F);
        method4797(100);
    }

    @ObfuscatedName("jf.au(II)V")
    public static void method4797(int arg0) {
    }

    public class449(float arg0, float arg1, float arg2) {
        this.field4727 = arg0;
        this.field4726 = arg1;
        this.field4728 = arg2;
    }

    @ObfuscatedName("rj.ae(B)F")
    public final float method7480() {
        return (float) Math.sqrt((double) (this.field4728 * this.field4728 + this.field4727 * this.field4727 + this.field4726 * this.field4726));
    }

    public String toString() {
        return this.field4727 + ", " + this.field4726 + ", " + this.field4728;
    }
}
