package deob;

@ObfuscatedName("rq")
public final class class462 {

    @ObfuscatedName("rq.at")
    public static class462[] field4765 = new class462[0];

    @ObfuscatedName("rq.ao")
    public float field4769;

    @ObfuscatedName("rq.ab")
    public float field4766;

    @ObfuscatedName("rq.au")
    public float field4767;

    @ObfuscatedName("rq.aa")
    public float field4768;

    static {
        method8113(100);
        new class462();
    }

    @ObfuscatedName("th.at(IB)V")
    public static void method8113(int arg0) {
        Statics.field4764 = arg0;
        field4765 = new class462[arg0];
        Statics.field4664 = 0;
    }

    @ObfuscatedName("ib.ah(I)Lrq;")
    public static class462 method3909() {
        class462[] var0 = field4765;
        synchronized (field4765) {
            if (Statics.field4664 == 0) {
                return new class462();
            } else {
                field4765[--Statics.field4664].method7638();
                return field4765[Statics.field4664];
            }
        }
    }

    @ObfuscatedName("rq.ar(I)V")
    public void method7653() {
        class462[] var1 = field4765;
        synchronized (field4765) {
            if (Statics.field4664 < Statics.field4764 - 1) {
                field4765[++Statics.field4664 - 1] = this;
            }
        }
    }

    public class462() {
        this.method7638();
    }

    @ObfuscatedName("rq.ao(FFFFI)V")
    public void method7652(float arg0, float arg1, float arg2, float arg3) {
        this.field4769 = arg0;
        this.field4766 = arg1;
        this.field4767 = arg2;
        this.field4768 = arg3;
    }

    @ObfuscatedName("rq.ab(FFFFI)V")
    public void method7637(float arg0, float arg1, float arg2, float arg3) {
        float var5 = (float) Math.sin((double) (arg3 * 0.5F));
        float var6 = (float) Math.cos((double) (arg3 * 0.5F));
        this.field4769 = arg0 * var5;
        this.field4766 = arg1 * var5;
        this.field4767 = arg2 * var5;
        this.field4768 = var6;
    }

    @ObfuscatedName("rq.au(I)V")
    public final void method7638() {
        this.field4767 = 0.0F;
        this.field4766 = 0.0F;
        this.field4769 = 0.0F;
        this.field4768 = 1.0F;
    }

    @ObfuscatedName("rq.aa(Lrq;I)V")
    public final void method7639(class462 arg0) {
        this.method7652(this.field4767 * arg0.field4766 + this.field4769 * arg0.field4768 + this.field4768 * arg0.field4769 - this.field4766 * arg0.field4767, this.field4769 * arg0.field4767 + this.field4768 * arg0.field4766 + (this.field4766 * arg0.field4768 - this.field4767 * arg0.field4769), this.field4768 * arg0.field4767 + (this.field4767 * arg0.field4768 + this.field4766 * arg0.field4769 - this.field4769 * arg0.field4766), this.field4768 * arg0.field4768 - this.field4769 * arg0.field4769 - this.field4766 * arg0.field4766 - this.field4767 * arg0.field4767);
    }

    public boolean equals(Object arg0) {
        if ((arg0 instanceof class462)) {
            class462 var2 = (class462) arg0;
            return this.field4769 == var2.field4769 && this.field4766 == var2.field4766 && this.field4767 == var2.field4767 && this.field4768 == var2.field4768;
        } else {
            return false;
        }
    }

    public int hashCode() {
        boolean var1 = true;
        float var2 = 1.0F;
        float var3 = var2 * 31.0F + this.field4769;
        float var4 = var3 * 31.0F + this.field4766;
        float var5 = var4 * 31.0F + this.field4767;
        float var6 = var5 * 31.0F + this.field4768;
        return (int) var6;
    }

    public String toString() {
        return this.field4769 + "," + this.field4766 + "," + this.field4767 + "," + this.field4768;
    }
}
