package deob;

@ObfuscatedName("nn")
public final class class389 {

    @ObfuscatedName("nn.c")
    public static class389[] field4430 = new class389[0];

    @ObfuscatedName("nn.n")
    public float field4433;

    @ObfuscatedName("nn.k")
    public float field4434;

    @ObfuscatedName("nn.s")
    public float field4432;

    @ObfuscatedName("nn.q")
    public float field4436;

    static {
        method3875(100);
        new class389();
    }

    @ObfuscatedName("gm.c(IB)V")
    public static void method3875(int arg0) {
        Statics.field4431 = arg0;
        field4430 = new class389[arg0];
        Statics.field4435 = 0;
    }

    @ObfuscatedName("ct.p(B)Lnn;")
    public static class389 method2165() {
        class389[] var0 = field4430;
        synchronized (field4430) {
            if (Statics.field4435 == 0) {
                return new class389();
            } else {
                field4430[--Statics.field4435].method6486();
                return field4430[Statics.field4435];
            }
        }
    }

    @ObfuscatedName("nn.f(I)V")
    public void method6472() {
        class389[] var1 = field4430;
        synchronized (field4430) {
            if (Statics.field4435 < Statics.field4431 - 1) {
                field4430[++Statics.field4435 - 1] = this;
            }
        }
    }

    public class389() {
        this.method6486();
    }

    @ObfuscatedName("nn.n(FFFFI)V")
    public void method6470(float arg0, float arg1, float arg2, float arg3) {
        this.field4433 = arg0;
        this.field4434 = arg1;
        this.field4432 = arg2;
        this.field4436 = arg3;
    }

    @ObfuscatedName("nn.k(FFFFB)V")
    public void method6473(float arg0, float arg1, float arg2, float arg3) {
        float var5 = (float) Math.sin((double) (arg3 * 0.5F));
        float var6 = (float) Math.cos((double) (arg3 * 0.5F));
        this.field4433 = arg0 * var5;
        this.field4434 = arg1 * var5;
        this.field4432 = arg2 * var5;
        this.field4436 = var6;
    }

    @ObfuscatedName("nn.w(I)V")
    public final void method6486() {
        this.field4432 = 0.0F;
        this.field4434 = 0.0F;
        this.field4433 = 0.0F;
        this.field4436 = 1.0F;
    }

    @ObfuscatedName("nn.s(Lnn;B)V")
    public final void method6492(class389 arg0) {
        this.method6470(this.field4432 * arg0.field4434 + this.field4436 * arg0.field4433 + this.field4433 * arg0.field4436 - this.field4434 * arg0.field4432, this.field4433 * arg0.field4432 + this.field4436 * arg0.field4434 + (this.field4434 * arg0.field4436 - this.field4432 * arg0.field4433), this.field4436 * arg0.field4432 + (this.field4434 * arg0.field4433 + this.field4432 * arg0.field4436 - this.field4433 * arg0.field4434), this.field4436 * arg0.field4436 - this.field4433 * arg0.field4433 - this.field4434 * arg0.field4434 - this.field4432 * arg0.field4432);
    }

    public boolean equals(Object arg0) {
        if ((arg0 instanceof class389)) {
            class389 var2 = (class389) arg0;
            return this.field4433 == var2.field4433 && this.field4434 == var2.field4434 && this.field4432 == var2.field4432 && this.field4436 == var2.field4436;
        } else {
            return false;
        }
    }

    public int hashCode() {
        boolean var1 = true;
        float var2 = 1.0F;
        float var3 = var2 * 31.0F + this.field4433;
        float var4 = var3 * 31.0F + this.field4434;
        float var5 = var4 * 31.0F + this.field4432;
        float var6 = var5 * 31.0F + this.field4436;
        return (int) var6;
    }

    public String toString() {
        return this.field4433 + "," + this.field4434 + "," + this.field4432 + "," + this.field4436;
    }
}
