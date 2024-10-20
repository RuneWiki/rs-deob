package deob;

@ObfuscatedName("rd")
public final class class465 {

    @ObfuscatedName("rd.ac")
    public static class465[] field4776 = new class465[0];

    @ObfuscatedName("rd.ax")
    public float field4778;

    @ObfuscatedName("rd.ao")
    public float field4779;

    @ObfuscatedName("rd.ah")
    public float field4780;

    @ObfuscatedName("rd.ar")
    public float field4781;

    static {
        method2977(100);
        new class465();
    }

    @ObfuscatedName("fm.ac(II)V")
    public static void method2977(int arg0) {
        Statics.field4777 = arg0;
        field4776 = new class465[arg0];
        Statics.field4775 = 0;
    }

    @ObfuscatedName("rq.al(B)Lrd;")
    public static class465 method7311() {
        class465[] var0 = field4776;
        synchronized (field4776) {
            if (Statics.field4775 == 0) {
                return new class465();
            } else {
                field4776[--Statics.field4775].method7567();
                return field4776[Statics.field4775];
            }
        }
    }

    @ObfuscatedName("rd.ak(I)V")
    public void method7584() {
        class465[] var1 = field4776;
        synchronized (field4776) {
            if (Statics.field4775 < Statics.field4777 - 1) {
                field4776[++Statics.field4775 - 1] = this;
            }
        }
    }

    public class465() {
        this.method7567();
    }

    @ObfuscatedName("rd.ax(FFFFI)V")
    public void method7568(float arg0, float arg1, float arg2, float arg3) {
        this.field4778 = arg0;
        this.field4779 = arg1;
        this.field4780 = arg2;
        this.field4781 = arg3;
    }

    @ObfuscatedName("rd.ao(FFFFI)V")
    public void method7564(float arg0, float arg1, float arg2, float arg3) {
        float var5 = (float) Math.sin((double) (arg3 * 0.5F));
        float var6 = (float) Math.cos((double) (arg3 * 0.5F));
        this.field4778 = arg0 * var5;
        this.field4779 = arg1 * var5;
        this.field4780 = arg2 * var5;
        this.field4781 = var6;
    }

    @ObfuscatedName("rd.ah(I)V")
    public final void method7567() {
        this.field4780 = 0.0F;
        this.field4779 = 0.0F;
        this.field4778 = 0.0F;
        this.field4781 = 1.0F;
    }

    @ObfuscatedName("rd.ar(Lrd;I)V")
    public final void method7572(class465 arg0) {
        this.method7568(this.field4780 * arg0.field4779 + this.field4781 * arg0.field4778 + this.field4778 * arg0.field4781 - this.field4779 * arg0.field4780, this.field4778 * arg0.field4780 + this.field4781 * arg0.field4779 + (this.field4779 * arg0.field4781 - this.field4780 * arg0.field4778), this.field4781 * arg0.field4780 + (this.field4780 * arg0.field4781 + this.field4779 * arg0.field4778 - this.field4778 * arg0.field4779), this.field4781 * arg0.field4781 - this.field4778 * arg0.field4778 - this.field4779 * arg0.field4779 - this.field4780 * arg0.field4780);
    }

    public boolean equals(Object arg0) {
        if ((arg0 instanceof class465)) {
            class465 var2 = (class465) arg0;
            return this.field4778 == var2.field4778 && this.field4779 == var2.field4779 && this.field4780 == var2.field4780 && this.field4781 == var2.field4781;
        } else {
            return false;
        }
    }

    public int hashCode() {
        boolean var1 = true;
        float var2 = 1.0F;
        float var3 = var2 * 31.0F + this.field4778;
        float var4 = var3 * 31.0F + this.field4779;
        float var5 = var4 * 31.0F + this.field4780;
        float var6 = var5 * 31.0F + this.field4781;
        return (int) var6;
    }

    public String toString() {
        return this.field4778 + "," + this.field4779 + "," + this.field4780 + "," + this.field4781;
    }
}
