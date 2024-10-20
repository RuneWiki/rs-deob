package deob;

@ObfuscatedName("rc")
public class class465 {

    @ObfuscatedName("rc.am")
    public float field4795;

    @ObfuscatedName("rc.ap")
    public float field4796;

    @ObfuscatedName("rc.af")
    public float field4797;

    static {
        new class465(0.0F, 0.0F, 0.0F);
        new class465(1.0F, 1.0F, 1.0F);
        new class465(1.0F, 0.0F, 0.0F);
        new class465(0.0F, 1.0F, 0.0F);
        new class465(0.0F, 0.0F, 1.0F);
        Statics.method2904(100);
    }

    public class465(float arg0, float arg1, float arg2) {
        this.field4795 = arg0;
        this.field4796 = arg1;
        this.field4797 = arg2;
    }

    @ObfuscatedName("rc.ap(I)F")
    public final float method7761() {
        return (float) Math.sqrt((double) (this.field4797 * this.field4797 + this.field4796 * this.field4796 + this.field4795 * this.field4795));
    }

    public String toString() {
        return this.field4795 + ", " + this.field4796 + ", " + this.field4797;
    }
}
