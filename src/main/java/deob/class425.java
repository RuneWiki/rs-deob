package deob;

@ObfuscatedName("qx")
public final class class425 {

    @ObfuscatedName("qx.af")
    public static class425[] field4660 = new class425[0];

    @ObfuscatedName("qx.ac")
    public float field4661;

    @ObfuscatedName("qx.au")
    public float field4662;

    @ObfuscatedName("qx.ab")
    public float field4663;

    @ObfuscatedName("qx.aq")
    public float field4664;

    static {
        method5436(100);
        new class425();
    }

    @ObfuscatedName("lw.af(II)V")
    public static void method5436(int arg0) {
        Statics.field4658 = arg0;
        field4660 = new class425[arg0];
        Statics.field4659 = 0;
    }

    @ObfuscatedName("fs.an(B)Lqx;")
    public static class425 method2970() {
        class425[] var0 = field4660;
        synchronized (field4660) {
            if (Statics.field4659 == 0) {
                return new class425();
            } else {
                field4660[--Statics.field4659].method7450();
                return field4660[Statics.field4659];
            }
        }
    }

    @ObfuscatedName("qx.aw(B)V")
    public void method7427() {
        class425[] var1 = field4660;
        synchronized (field4660) {
            if (Statics.field4659 < Statics.field4658 - 1) {
                field4660[++Statics.field4659 - 1] = this;
            }
        }
    }

    public class425() {
        this.method7450();
    }

    @ObfuscatedName("qx.ac(FFFFB)V")
    public void method7421(float arg0, float arg1, float arg2, float arg3) {
        this.field4661 = arg0;
        this.field4662 = arg1;
        this.field4663 = arg2;
        this.field4664 = arg3;
    }

    @ObfuscatedName("qx.au(FFFFI)V")
    public void method7422(float arg0, float arg1, float arg2, float arg3) {
        float var5 = (float) Math.sin((double) (arg3 * 0.5F));
        float var6 = (float) Math.cos((double) (arg3 * 0.5F));
        this.field4661 = arg0 * var5;
        this.field4662 = arg1 * var5;
        this.field4663 = arg2 * var5;
        this.field4664 = var6;
    }

    @ObfuscatedName("qx.ab(I)V")
    public final void method7450() {
        this.field4663 = 0.0F;
        this.field4662 = 0.0F;
        this.field4661 = 0.0F;
        this.field4664 = 1.0F;
    }

    @ObfuscatedName("qx.aq(Lqx;B)V")
    public final void method7424(class425 arg0) {
        this.method7421(this.field4663 * arg0.field4662 + this.field4664 * arg0.field4661 + this.field4661 * arg0.field4664 - this.field4662 * arg0.field4663, this.field4661 * arg0.field4663 + this.field4664 * arg0.field4662 + (this.field4662 * arg0.field4664 - this.field4663 * arg0.field4661), this.field4664 * arg0.field4663 + (this.field4663 * arg0.field4664 + this.field4662 * arg0.field4661 - this.field4661 * arg0.field4662), this.field4664 * arg0.field4664 - this.field4661 * arg0.field4661 - this.field4662 * arg0.field4662 - this.field4663 * arg0.field4663);
    }

    public boolean equals(Object arg0) {
        if ((arg0 instanceof class425)) {
            class425 var2 = (class425) arg0;
            return this.field4661 == var2.field4661 && this.field4662 == var2.field4662 && this.field4663 == var2.field4663 && this.field4664 == var2.field4664;
        } else {
            return false;
        }
    }

    public int hashCode() {
        boolean var1 = true;
        float var2 = 1.0F;
        float var3 = var2 * 31.0F + this.field4661;
        float var4 = var3 * 31.0F + this.field4662;
        float var5 = var4 * 31.0F + this.field4663;
        float var6 = var5 * 31.0F + this.field4664;
        return (int) var6;
    }

    public String toString() {
        return this.field4661 + "," + this.field4662 + "," + this.field4663 + "," + this.field4664;
    }
}
