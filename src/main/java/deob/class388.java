package deob;

@ObfuscatedName("nh")
public final class class388 {

    @ObfuscatedName("nh.o")
    public static class388[] field4396 = new class388[0];

    @ObfuscatedName("nh.k")
    public float field4394;

    @ObfuscatedName("nh.a")
    public float field4395;

    @ObfuscatedName("nh.m")
    public float field4397;

    @ObfuscatedName("nh.p")
    public float field4398;

    static {
        method80(100);
        new class388();
    }

    @ObfuscatedName("y.o(II)V")
    public static void method80(int arg0) {
        Statics.field4073 = arg0;
        field4396 = new class388[arg0];
        Statics.field2493 = 0;
    }

    @ObfuscatedName("nh.q(B)V")
    public void method6206() {
        class388[] var1 = field4396;
        synchronized (field4396) {
            if (Statics.field2493 < Statics.field4073 - 1) {
                field4396[++Statics.field2493 - 1] = this;
            }
        }
    }

    public class388() {
        this.method6209();
    }

    @ObfuscatedName("nh.l(FFFFI)V")
    public void method6224(float arg0, float arg1, float arg2, float arg3) {
        this.field4394 = arg0;
        this.field4395 = arg1;
        this.field4397 = arg2;
        this.field4398 = arg3;
    }

    @ObfuscatedName("nh.k(FFFFB)V")
    public void method6211(float arg0, float arg1, float arg2, float arg3) {
        float var5 = (float) Math.sin((double) (arg3 * 0.5F));
        float var6 = (float) Math.cos((double) (arg3 * 0.5F));
        this.field4394 = arg0 * var5;
        this.field4395 = arg1 * var5;
        this.field4397 = arg2 * var5;
        this.field4398 = var6;
    }

    @ObfuscatedName("nh.a(B)V")
    public final void method6209() {
        this.field4397 = 0.0F;
        this.field4395 = 0.0F;
        this.field4394 = 0.0F;
        this.field4398 = 1.0F;
    }

    @ObfuscatedName("nh.m(Lnh;B)V")
    public final void method6210(class388 arg0) {
        this.method6224(this.field4397 * arg0.field4395 + this.field4398 * arg0.field4394 + this.field4394 * arg0.field4398 - this.field4395 * arg0.field4397, this.field4394 * arg0.field4397 + this.field4398 * arg0.field4395 + (this.field4395 * arg0.field4398 - this.field4397 * arg0.field4394), this.field4398 * arg0.field4397 + (this.field4397 * arg0.field4398 + this.field4395 * arg0.field4394 - this.field4394 * arg0.field4395), this.field4398 * arg0.field4398 - this.field4394 * arg0.field4394 - this.field4395 * arg0.field4395 - this.field4397 * arg0.field4397);
    }

    public boolean equals(Object arg0) {
        if ((arg0 instanceof class388)) {
            class388 var2 = (class388) arg0;
            return this.field4394 == var2.field4394 && this.field4395 == var2.field4395 && this.field4397 == var2.field4397 && this.field4398 == var2.field4398;
        } else {
            return false;
        }
    }

    public int hashCode() {
        boolean var1 = true;
        float var2 = 1.0F;
        float var3 = var2 * 31.0F + this.field4394;
        float var4 = var3 * 31.0F + this.field4395;
        float var5 = var4 * 31.0F + this.field4397;
        float var6 = var5 * 31.0F + this.field4398;
        return (int) var6;
    }

    public String toString() {
        return this.field4394 + "," + this.field4395 + "," + this.field4397 + "," + this.field4398;
    }
}
