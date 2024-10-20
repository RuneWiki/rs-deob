package deob;

@ObfuscatedName("qv")
public class class437 {

    @ObfuscatedName("qv.at")
    public float field4672;

    @ObfuscatedName("qv.an")
    public float field4673;

    @ObfuscatedName("qv.av")
    public float field4674;

    static {
        new class437(0.0F, 0.0F, 0.0F);
        new class437(1.0F, 1.0F, 1.0F);
        new class437(1.0F, 0.0F, 0.0F);
        new class437(0.0F, 1.0F, 0.0F);
        new class437(0.0F, 0.0F, 1.0F);
        method7268(100);
    }

    @ObfuscatedName("qz.at(II)V")
    public static void method7268(int arg0) {
    }

    public class437(float arg0, float arg1, float arg2) {
        this.field4672 = arg0;
        this.field4673 = arg1;
        this.field4674 = arg2;
    }

    @ObfuscatedName("qv.an(B)F")
    public final float method7360() {
        return (float) Math.sqrt((double) (this.field4674 * this.field4674 + this.field4673 * this.field4673 + this.field4672 * this.field4672));
    }

    public String toString() {
        return this.field4672 + ", " + this.field4673 + ", " + this.field4674;
    }
}
