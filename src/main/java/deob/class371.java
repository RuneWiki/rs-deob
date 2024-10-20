package deob;

@ObfuscatedName("nq")
public final class class371 {

    @ObfuscatedName("nq.c")
    public static class371[] field4236 = new class371[0];

    @ObfuscatedName("nq.e")
    public float field4230;

    @ObfuscatedName("nq.r")
    public float field4234;

    @ObfuscatedName("nq.o")
    public float field4235;

    @ObfuscatedName("nq.i")
    public float field4233;

    static {
        method3272(100);
        new class371();
    }

    @ObfuscatedName("fm.c(IB)V")
    public static void method3272(int arg0) {
        Statics.field4231 = arg0;
        field4236 = new class371[arg0];
        Statics.field4232 = 0;
    }

    @ObfuscatedName("kt.l(I)Lnq;")
    public static class371 method5146() {
        class371[] var0 = field4236;
        synchronized (field4236) {
            if (Statics.field4232 == 0) {
                return new class371();
            } else {
                field4236[--Statics.field4232].method5983();
                return field4236[Statics.field4232];
            }
        }
    }

    @ObfuscatedName("nq.s(I)V")
    public void method5982() {
        class371[] var1 = field4236;
        synchronized (field4236) {
            if (Statics.field4232 < Statics.field4231 - 1) {
                field4236[++Statics.field4232 - 1] = this;
            }
        }
    }

    public class371() {
        this.method5983();
    }

    @ObfuscatedName("nq.e(FFFFI)V")
    public void method5986(float arg0, float arg1, float arg2, float arg3) {
        this.field4230 = arg0;
        this.field4234 = arg1;
        this.field4235 = arg2;
        this.field4233 = arg3;
    }

    @ObfuscatedName("nq.r(FFFFI)V")
    public void method6009(float arg0, float arg1, float arg2, float arg3) {
        float var5 = (float) Math.sin((double) (arg3 * 0.5F));
        float var6 = (float) Math.cos((double) (arg3 * 0.5F));
        this.field4230 = arg0 * var5;
        this.field4234 = arg1 * var5;
        this.field4235 = arg2 * var5;
        this.field4233 = var6;
    }

    @ObfuscatedName("nq.o(I)V")
    public final void method5983() {
        this.field4235 = 0.0F;
        this.field4234 = 0.0F;
        this.field4230 = 0.0F;
        this.field4233 = 1.0F;
    }

    @ObfuscatedName("nq.i(Lnq;B)V")
    public final void method6003(class371 arg0) {
        this.method5986(this.field4235 * arg0.field4234 + this.field4233 * arg0.field4230 + this.field4230 * arg0.field4233 - this.field4234 * arg0.field4235, this.field4230 * arg0.field4235 + this.field4233 * arg0.field4234 + (this.field4234 * arg0.field4233 - this.field4235 * arg0.field4230), this.field4233 * arg0.field4235 + (this.field4235 * arg0.field4233 + this.field4234 * arg0.field4230 - this.field4230 * arg0.field4234), this.field4233 * arg0.field4233 - this.field4230 * arg0.field4230 - this.field4234 * arg0.field4234 - this.field4235 * arg0.field4235);
    }

    public boolean equals(Object arg0) {
        if ((arg0 instanceof class371)) {
            class371 var2 = (class371) arg0;
            return this.field4230 == var2.field4230 && this.field4234 == var2.field4234 && this.field4235 == var2.field4235 && this.field4233 == var2.field4233;
        } else {
            return false;
        }
    }

    public int hashCode() {
        boolean var1 = true;
        float var2 = 1.0F;
        float var3 = var2 * 31.0F + this.field4230;
        float var4 = var3 * 31.0F + this.field4234;
        float var5 = var4 * 31.0F + this.field4235;
        float var6 = var5 * 31.0F + this.field4233;
        return (int) var6;
    }

    public String toString() {
        return this.field4230 + "," + this.field4234 + "," + this.field4235 + "," + this.field4233;
    }
}
