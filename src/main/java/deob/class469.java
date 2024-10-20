package deob;

@ObfuscatedName("sf")
public final class class469 {

    @ObfuscatedName("sf.aq")
    public static class469[] field4834 = new class469[0];

    @ObfuscatedName("sf.aw")
    public static int field4839 = 100;

    @ObfuscatedName("sf.al")
    public static int field4835;

    @ObfuscatedName("sf.ai")
    public float field4836;

    @ObfuscatedName("sf.ar")
    public float field4837;

    @ObfuscatedName("sf.as")
    public float field4838;

    @ObfuscatedName("sf.aa")
    public float field4833;

    static {
        field4834 = new class469[100];
        field4835 = 0;
        new class469();
    }

    @ObfuscatedName("nc.aq(I)Lsf;")
    public static class469 method6286() {
        class469[] var0 = field4834;
        synchronized (field4834) {
            if (field4835 == 0) {
                return new class469();
            } else {
                field4834[--field4835].method7786();
                return field4834[field4835];
            }
        }
    }

    @ObfuscatedName("sf.aw(B)V")
    public void method7790() {
        class469[] var1 = field4834;
        synchronized (field4834) {
            if (field4835 < field4839 - 1) {
                field4834[++field4835 - 1] = this;
            }
        }
    }

    public class469() {
        this.method7786();
    }

    @ObfuscatedName("sf.al(FFFFB)V")
    public void method7789(float arg0, float arg1, float arg2, float arg3) {
        this.field4836 = arg0;
        this.field4837 = arg1;
        this.field4838 = arg2;
        this.field4833 = arg3;
    }

    @ObfuscatedName("sf.ai(FFFFI)V")
    public void method7785(float arg0, float arg1, float arg2, float arg3) {
        float var5 = (float) Math.sin((double) (arg3 * 0.5F));
        float var6 = (float) Math.cos((double) (arg3 * 0.5F));
        this.field4836 = arg0 * var5;
        this.field4837 = arg1 * var5;
        this.field4838 = arg2 * var5;
        this.field4833 = var6;
    }

    @ObfuscatedName("sf.ar(I)V")
    public final void method7786() {
        this.field4838 = 0.0F;
        this.field4837 = 0.0F;
        this.field4836 = 0.0F;
        this.field4833 = 1.0F;
    }

    @ObfuscatedName("sf.as(Lsf;I)V")
    public final void method7787(class469 arg0) {
        this.method7789(this.field4838 * arg0.field4837 + this.field4836 * arg0.field4833 + this.field4833 * arg0.field4836 - this.field4837 * arg0.field4838, this.field4836 * arg0.field4838 + this.field4833 * arg0.field4837 + (this.field4837 * arg0.field4833 - this.field4838 * arg0.field4836), this.field4833 * arg0.field4838 + (this.field4838 * arg0.field4833 + this.field4837 * arg0.field4836 - this.field4836 * arg0.field4837), this.field4833 * arg0.field4833 - this.field4836 * arg0.field4836 - this.field4837 * arg0.field4837 - this.field4838 * arg0.field4838);
    }

    public boolean equals(Object arg0) {
        if ((arg0 instanceof class469)) {
            class469 var2 = (class469) arg0;
            return this.field4836 == var2.field4836 && this.field4837 == var2.field4837 && this.field4838 == var2.field4838 && this.field4833 == var2.field4833;
        } else {
            return false;
        }
    }

    public int hashCode() {
        boolean var1 = true;
        float var2 = 1.0F;
        float var3 = var2 * 31.0F + this.field4836;
        float var4 = var3 * 31.0F + this.field4837;
        float var5 = var4 * 31.0F + this.field4838;
        float var6 = var5 * 31.0F + this.field4833;
        return (int) var6;
    }

    public String toString() {
        return this.field4836 + "," + this.field4837 + "," + this.field4838 + "," + this.field4833;
    }
}
