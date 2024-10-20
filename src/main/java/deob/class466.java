package deob;

@ObfuscatedName("ro")
public final class class466 {

    @ObfuscatedName("ro.am")
    public static class466[] field4801 = new class466[0];

    @ObfuscatedName("ro.ap")
    public static int field4807 = 100;

    @ObfuscatedName("ro.af")
    public static int field4802;

    @ObfuscatedName("ro.aj")
    public float field4803;

    @ObfuscatedName("ro.aq")
    public float field4804;

    @ObfuscatedName("ro.ar")
    public float field4805;

    @ObfuscatedName("ro.ag")
    public float field4800;

    static {
        field4801 = new class466[100];
        field4802 = 0;
        new class466();
    }

    @ObfuscatedName("ro.am(I)V")
    public void method7790() {
        class466[] var1 = field4801;
        synchronized (field4801) {
            if (field4802 < field4807 - 1) {
                field4801[++field4802 - 1] = this;
            }
        }
    }

    public class466() {
        this.method7772();
    }

    @ObfuscatedName("ro.ap(FFFFI)V")
    public void method7770(float arg0, float arg1, float arg2, float arg3) {
        this.field4803 = arg0;
        this.field4804 = arg1;
        this.field4805 = arg2;
        this.field4800 = arg3;
    }

    @ObfuscatedName("ro.af(FFFFS)V")
    public void method7771(float arg0, float arg1, float arg2, float arg3) {
        float var5 = (float) Math.sin((double) (arg3 * 0.5F));
        float var6 = (float) Math.cos((double) (arg3 * 0.5F));
        this.field4803 = arg0 * var5;
        this.field4804 = arg1 * var5;
        this.field4805 = arg2 * var5;
        this.field4800 = var6;
    }

    @ObfuscatedName("ro.aj(I)V")
    public final void method7772() {
        this.field4805 = 0.0F;
        this.field4804 = 0.0F;
        this.field4803 = 0.0F;
        this.field4800 = 1.0F;
    }

    @ObfuscatedName("ro.aq(Lro;I)V")
    public final void method7788(class466 arg0) {
        this.method7770(this.field4805 * arg0.field4804 + this.field4803 * arg0.field4800 + this.field4800 * arg0.field4803 - this.field4804 * arg0.field4805, this.field4803 * arg0.field4805 + this.field4800 * arg0.field4804 + (this.field4804 * arg0.field4800 - this.field4805 * arg0.field4803), this.field4800 * arg0.field4805 + (this.field4805 * arg0.field4800 + this.field4804 * arg0.field4803 - this.field4803 * arg0.field4804), this.field4800 * arg0.field4800 - this.field4803 * arg0.field4803 - this.field4804 * arg0.field4804 - this.field4805 * arg0.field4805);
    }

    public boolean equals(Object arg0) {
        if ((arg0 instanceof class466)) {
            class466 var2 = (class466) arg0;
            return this.field4803 == var2.field4803 && this.field4804 == var2.field4804 && this.field4805 == var2.field4805 && this.field4800 == var2.field4800;
        } else {
            return false;
        }
    }

    public int hashCode() {
        boolean var1 = true;
        float var2 = 1.0F;
        float var3 = var2 * 31.0F + this.field4803;
        float var4 = var3 * 31.0F + this.field4804;
        float var5 = var4 * 31.0F + this.field4805;
        float var6 = var5 * 31.0F + this.field4800;
        return (int) var6;
    }

    public String toString() {
        return this.field4803 + "," + this.field4804 + "," + this.field4805 + "," + this.field4800;
    }
}
