package deob;

@ObfuscatedName("ni")
public final class class387 {

    @ObfuscatedName("ni.c")
    public static class387[] field4390 = new class387[0];

    @ObfuscatedName("ni.v")
    public static int field4387 = 100;

    @ObfuscatedName("ni.q")
    public static int field4386;

    @ObfuscatedName("ni.f")
    public float field4389;

    @ObfuscatedName("ni.j")
    public float field4388;

    @ObfuscatedName("ni.e")
    public float field4391;

    @ObfuscatedName("ni.g")
    public float field4392;

    static {
        field4390 = new class387[100];
        field4386 = 0;
        new class387();
    }

    @ObfuscatedName("ni.c(I)V")
    public void method6308() {
        class387[] var1 = field4390;
        synchronized (field4390) {
            if (field4386 < field4387 - 1) {
                field4390[++field4386 - 1] = this;
            }
        }
    }

    public class387() {
        this.method6323();
    }

    @ObfuscatedName("ni.v(FFFFI)V")
    public void method6314(float arg0, float arg1, float arg2, float arg3) {
        this.field4389 = arg0;
        this.field4388 = arg1;
        this.field4391 = arg2;
        this.field4392 = arg3;
    }

    @ObfuscatedName("ni.q(FFFFI)V")
    public void method6317(float arg0, float arg1, float arg2, float arg3) {
        float var5 = (float) Math.sin((double) (arg3 * 0.5F));
        float var6 = (float) Math.cos((double) (arg3 * 0.5F));
        this.field4389 = arg0 * var5;
        this.field4388 = arg1 * var5;
        this.field4391 = arg2 * var5;
        this.field4392 = var6;
    }

    @ObfuscatedName("ni.f(B)V")
    public final void method6323() {
        this.field4391 = 0.0F;
        this.field4388 = 0.0F;
        this.field4389 = 0.0F;
        this.field4392 = 1.0F;
    }

    @ObfuscatedName("ni.j(Lni;I)V")
    public final void method6310(class387 arg0) {
        this.method6314(this.field4391 * arg0.field4388 + this.field4392 * arg0.field4389 + this.field4389 * arg0.field4392 - this.field4388 * arg0.field4391, this.field4389 * arg0.field4391 + this.field4392 * arg0.field4388 + (this.field4388 * arg0.field4392 - this.field4391 * arg0.field4389), this.field4392 * arg0.field4391 + (this.field4391 * arg0.field4392 + this.field4388 * arg0.field4389 - this.field4389 * arg0.field4388), this.field4392 * arg0.field4392 - this.field4389 * arg0.field4389 - this.field4388 * arg0.field4388 - this.field4391 * arg0.field4391);
    }

    public boolean equals(Object arg0) {
        if ((arg0 instanceof class387)) {
            class387 var2 = (class387) arg0;
            return this.field4389 == var2.field4389 && this.field4388 == var2.field4388 && this.field4391 == var2.field4391 && this.field4392 == var2.field4392;
        } else {
            return false;
        }
    }

    public int hashCode() {
        boolean var1 = true;
        float var2 = 1.0F;
        float var3 = var2 * 31.0F + this.field4389;
        float var4 = var3 * 31.0F + this.field4388;
        float var5 = var4 * 31.0F + this.field4391;
        float var6 = var5 * 31.0F + this.field4392;
        return (int) var6;
    }

    public String toString() {
        return this.field4389 + "," + this.field4388 + "," + this.field4391 + "," + this.field4392;
    }
}
