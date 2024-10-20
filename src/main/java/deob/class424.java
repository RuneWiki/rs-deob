package deob;

@ObfuscatedName("qh")
public class class424 {

    @ObfuscatedName("qh.ab")
    public float field4673;

    @ObfuscatedName("qh.ay")
    public float field4670;

    @ObfuscatedName("qh.an")
    public float field4672;

    static {
        new class424(0.0F, 0.0F, 0.0F);
        new class424(1.0F, 1.0F, 1.0F);
        new class424(1.0F, 0.0F, 0.0F);
        new class424(0.0F, 1.0F, 0.0F);
        new class424(0.0F, 0.0F, 1.0F);
        method4393(100);
    }

    @ObfuscatedName("ic.ab(II)V")
    public static void method4393(int arg0) {
    }

    public class424() {
    }

    public class424(float arg0, float arg1, float arg2) {
        this.field4673 = arg0;
        this.field4670 = arg1;
        this.field4672 = arg2;
    }

    @ObfuscatedName("qh.ay(Lqh;B)Z")
    public boolean method7192(class424 arg0) {
        return this.field4673 == arg0.field4673 && this.field4670 == arg0.field4670 && this.field4672 == arg0.field4672;
    }

    @ObfuscatedName("qh.an(I)F")
    public final float method7190() {
        return (float) Math.sqrt((double) (this.field4672 * this.field4672 + this.field4673 * this.field4673 + this.field4670 * this.field4670));
    }

    public String toString() {
        return this.field4673 + ", " + this.field4670 + ", " + this.field4672;
    }
}
