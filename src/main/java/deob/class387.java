package deob;

@ObfuscatedName("nq")
public final class class387 {

    @ObfuscatedName("nq.v")
    public static class387[] field4345 = new class387[0];

    @ObfuscatedName("nq.c")
    public static int field4339 = 100;

    @ObfuscatedName("nq.i")
    public static int field4340;

    @ObfuscatedName("nq.f")
    public float field4341;

    @ObfuscatedName("nq.b")
    public float field4342;

    @ObfuscatedName("nq.n")
    public float field4343;

    @ObfuscatedName("nq.s")
    public float field4344;

    static {
        field4345 = new class387[100];
        field4340 = 0;
        new class387();
    }

    @ObfuscatedName("nq.c(B)V")
    public void method6327() {
        class387[] var1 = field4345;
        synchronized (field4345) {
            if (field4340 < field4339 - 1) {
                field4345[++field4340 - 1] = this;
            }
        }
    }

    public class387() {
        this.method6324();
    }

    @ObfuscatedName("nq.i(FFFFI)V")
    public void method6322(float arg0, float arg1, float arg2, float arg3) {
        this.field4341 = arg0;
        this.field4342 = arg1;
        this.field4343 = arg2;
        this.field4344 = arg3;
    }

    @ObfuscatedName("nq.f(FFFFI)V")
    public void method6323(float arg0, float arg1, float arg2, float arg3) {
        float var5 = (float) Math.sin((double) (arg3 * 0.5F));
        float var6 = (float) Math.cos((double) (arg3 * 0.5F));
        this.field4341 = arg0 * var5;
        this.field4342 = arg1 * var5;
        this.field4343 = arg2 * var5;
        this.field4344 = var6;
    }

    @ObfuscatedName("nq.b(I)V")
    public final void method6324() {
        this.field4343 = 0.0F;
        this.field4342 = 0.0F;
        this.field4341 = 0.0F;
        this.field4344 = 1.0F;
    }

    @ObfuscatedName("nq.n(Lnq;I)V")
    public final void method6325(class387 arg0) {
        this.method6322(this.field4343 * arg0.field4342 + this.field4344 * arg0.field4341 + this.field4341 * arg0.field4344 - this.field4342 * arg0.field4343, this.field4341 * arg0.field4343 + this.field4344 * arg0.field4342 + (this.field4342 * arg0.field4344 - this.field4343 * arg0.field4341), this.field4344 * arg0.field4343 + (this.field4343 * arg0.field4344 + this.field4342 * arg0.field4341 - this.field4341 * arg0.field4342), this.field4344 * arg0.field4344 - this.field4341 * arg0.field4341 - this.field4342 * arg0.field4342 - this.field4343 * arg0.field4343);
    }

    public boolean equals(Object arg0) {
        if ((arg0 instanceof class387)) {
            class387 var2 = (class387) arg0;
            return this.field4341 == var2.field4341 && this.field4342 == var2.field4342 && this.field4343 == var2.field4343 && this.field4344 == var2.field4344;
        } else {
            return false;
        }
    }

    public int hashCode() {
        float var1 = 1.0F;
        float var2 = var1 * 31.0F + this.field4341;
        float var3 = var2 * 31.0F + this.field4342;
        float var4 = var3 * 31.0F + this.field4343;
        float var5 = var4 * 31.0F + this.field4344;
        return (int) var5;
    }

    public String toString() {
        return this.field4341 + "," + this.field4342 + "," + this.field4343 + "," + this.field4344;
    }
}
