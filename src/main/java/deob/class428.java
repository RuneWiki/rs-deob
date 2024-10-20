package deob;

@ObfuscatedName("qp")
public final class class428 {

    @ObfuscatedName("qp.ap")
    public static class428[] field4777 = new class428[0];

    @ObfuscatedName("qp.aj")
    public float field4779;

    @ObfuscatedName("qp.ai")
    public float field4775;

    @ObfuscatedName("qp.ay")
    public float field4778;

    @ObfuscatedName("qp.as")
    public float field4780;

    static {
        method7170(100);
        new class428();
    }

    @ObfuscatedName("pj.ap(IB)V")
    public static void method7170(int arg0) {
        Statics.field5049 = arg0;
        field4777 = new class428[arg0];
        Statics.field4776 = 0;
    }

    @ObfuscatedName("jb.aw(B)Lqp;")
    public static class428 method4930() {
        class428[] var0 = field4777;
        synchronized (field4777) {
            if (Statics.field4776 == 0) {
                return new class428();
            } else {
                field4777[--Statics.field4776].method7589();
                return field4777[Statics.field4776];
            }
        }
    }

    @ObfuscatedName("qp.ak(I)V")
    public void method7593() {
        class428[] var1 = field4777;
        synchronized (field4777) {
            if (Statics.field4776 < Statics.field5049 - 1) {
                field4777[++Statics.field4776 - 1] = this;
            }
        }
    }

    public class428() {
        this.method7589();
    }

    public class428(float arg0, float arg1, float arg2) {
        this.method7600(arg0, arg1, arg2);
    }

    @ObfuscatedName("qp.aj(FFFFI)V")
    public void method7587(float arg0, float arg1, float arg2, float arg3) {
        this.field4779 = arg0;
        this.field4775 = arg1;
        this.field4778 = arg2;
        this.field4780 = arg3;
    }

    @ObfuscatedName("qp.ai(FFFFB)V")
    public void method7595(float arg0, float arg1, float arg2, float arg3) {
        float var5 = (float) Math.sin((double) (arg3 * 0.5F));
        float var6 = (float) Math.cos((double) (arg3 * 0.5F));
        this.field4779 = arg0 * var5;
        this.field4775 = arg1 * var5;
        this.field4778 = arg2 * var5;
        this.field4780 = var6;
    }

    @ObfuscatedName("qp.ay(FFFI)V")
    public void method7600(float arg0, float arg1, float arg2) {
        this.method7595(0.0F, 1.0F, 0.0F, arg0);
        class428 var4 = method4930();
        var4.method7595(1.0F, 0.0F, 0.0F, arg1);
        this.method7591(var4);
        var4.method7595(0.0F, 0.0F, 1.0F, arg2);
        this.method7591(var4);
        var4.method7593();
    }

    @ObfuscatedName("qp.as(B)V")
    public final void method7589() {
        this.field4778 = 0.0F;
        this.field4775 = 0.0F;
        this.field4779 = 0.0F;
        this.field4780 = 1.0F;
    }

    @ObfuscatedName("qp.ae(Lqp;B)V")
    public final void method7591(class428 arg0) {
        this.method7587(this.field4778 * arg0.field4775 + this.field4780 * arg0.field4779 + this.field4779 * arg0.field4780 - this.field4775 * arg0.field4778, this.field4779 * arg0.field4778 + this.field4780 * arg0.field4775 + (this.field4775 * arg0.field4780 - this.field4778 * arg0.field4779), this.field4780 * arg0.field4778 + (this.field4778 * arg0.field4780 + this.field4775 * arg0.field4779 - this.field4779 * arg0.field4775), this.field4780 * arg0.field4780 - this.field4779 * arg0.field4779 - this.field4775 * arg0.field4775 - this.field4778 * arg0.field4778);
    }

    public boolean equals(Object arg0) {
        if ((arg0 instanceof class428)) {
            class428 var2 = (class428) arg0;
            return this.field4779 == var2.field4779 && this.field4775 == var2.field4775 && this.field4778 == var2.field4778 && this.field4780 == var2.field4780;
        } else {
            return false;
        }
    }

    public int hashCode() {
        boolean var1 = true;
        float var2 = 1.0F;
        float var3 = var2 * 31.0F + this.field4779;
        float var4 = var3 * 31.0F + this.field4775;
        float var5 = var4 * 31.0F + this.field4778;
        float var6 = var5 * 31.0F + this.field4780;
        return (int) var6;
    }

    public String toString() {
        return this.field4779 + "," + this.field4775 + "," + this.field4778 + "," + this.field4780;
    }
}
