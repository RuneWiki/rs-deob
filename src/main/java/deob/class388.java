package deob;

@ObfuscatedName("ni")
public final class class388 {

    @ObfuscatedName("ni.s")
    public static class388[] field4398 = new class388[0];

    @ObfuscatedName("ni.h")
    public static int field4392 = 100;

    @ObfuscatedName("ni.v")
    public static int field4393;

    @ObfuscatedName("ni.c")
    public float field4394;

    @ObfuscatedName("ni.q")
    public float field4396;

    @ObfuscatedName("ni.i")
    public float field4395;

    @ObfuscatedName("ni.k")
    public float field4397;

    static {
        field4398 = new class388[100];
        field4393 = 0;
        new class388();
    }

    @ObfuscatedName("kl.s(S)Lni;")
    public static class388 method4900() {
        class388[] var0 = field4398;
        synchronized (field4398) {
            if (field4393 == 0) {
                return new class388();
            } else {
                field4398[--field4393].method6231();
                return field4398[field4393];
            }
        }
    }

    @ObfuscatedName("ni.h(B)V")
    public void method6221() {
        class388[] var1 = field4398;
        synchronized (field4398) {
            if (field4393 < field4392 - 1) {
                field4398[++field4393 - 1] = this;
            }
        }
    }

    public class388() {
        this.method6231();
    }

    @ObfuscatedName("ni.w(FFFFB)V")
    public void method6226(float arg0, float arg1, float arg2, float arg3) {
        this.field4394 = arg0;
        this.field4396 = arg1;
        this.field4395 = arg2;
        this.field4397 = arg3;
    }

    @ObfuscatedName("ni.v(FFFFI)V")
    public void method6223(float arg0, float arg1, float arg2, float arg3) {
        float var5 = (float) Math.sin((double) (arg3 * 0.5F));
        float var6 = (float) Math.cos((double) (arg3 * 0.5F));
        this.field4394 = arg0 * var5;
        this.field4396 = arg1 * var5;
        this.field4395 = arg2 * var5;
        this.field4397 = var6;
    }

    @ObfuscatedName("ni.c(S)V")
    public final void method6231() {
        this.field4395 = 0.0F;
        this.field4396 = 0.0F;
        this.field4394 = 0.0F;
        this.field4397 = 1.0F;
    }

    @ObfuscatedName("ni.q(Lni;I)V")
    public final void method6225(class388 arg0) {
        this.method6226(this.field4395 * arg0.field4396 + this.field4397 * arg0.field4394 + this.field4394 * arg0.field4397 - this.field4396 * arg0.field4395, this.field4394 * arg0.field4395 + this.field4397 * arg0.field4396 + (this.field4396 * arg0.field4397 - this.field4395 * arg0.field4394), this.field4397 * arg0.field4395 + (this.field4396 * arg0.field4394 + this.field4395 * arg0.field4397 - this.field4394 * arg0.field4396), this.field4397 * arg0.field4397 - this.field4394 * arg0.field4394 - this.field4396 * arg0.field4396 - this.field4395 * arg0.field4395);
    }

    public boolean equals(Object arg0) {
        if ((arg0 instanceof class388)) {
            class388 var2 = (class388) arg0;
            return this.field4394 == var2.field4394 && this.field4396 == var2.field4396 && this.field4395 == var2.field4395 && this.field4397 == var2.field4397;
        } else {
            return false;
        }
    }

    public int hashCode() {
        boolean var1 = true;
        float var2 = 1.0F;
        float var3 = var2 * 31.0F + this.field4394;
        float var4 = var3 * 31.0F + this.field4396;
        float var5 = var4 * 31.0F + this.field4395;
        float var6 = var5 * 31.0F + this.field4397;
        return (int) var6;
    }

    public String toString() {
        return this.field4394 + "," + this.field4396 + "," + this.field4395 + "," + this.field4397;
    }
}
