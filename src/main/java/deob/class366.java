package deob;

@ObfuscatedName("ns")
public final class class366 {

    @ObfuscatedName("ns.c")
    public static class366[] field4190 = new class366[0];

    @ObfuscatedName("ns.b")
    public static int field4185 = 100;

    @ObfuscatedName("ns.p")
    public static int field4186;

    @ObfuscatedName("ns.m")
    public float field4187;

    @ObfuscatedName("ns.t")
    public float field4189;

    @ObfuscatedName("ns.s")
    public float field4188;

    @ObfuscatedName("ns.j")
    public float field4184;

    static {
        field4190 = new class366[100];
        field4186 = 0;
        new class366();
    }

    @ObfuscatedName("mw.c(B)Lns;")
    public static class366 method5715() {
        class366[] var0 = field4190;
        synchronized (field4190) {
            if (field4186 == 0) {
                return new class366();
            } else {
                field4190[--field4186].method5984();
                return field4190[field4186];
            }
        }
    }

    @ObfuscatedName("ns.b(I)V")
    public void method6003() {
        class366[] var1 = field4190;
        synchronized (field4190) {
            if (field4186 < field4185 - 1) {
                field4190[++field4186 - 1] = this;
            }
        }
    }

    public class366() {
        this.method5984();
    }

    @ObfuscatedName("ns.p(FFFFI)V")
    public void method5982(float arg0, float arg1, float arg2, float arg3) {
        this.field4187 = arg0;
        this.field4189 = arg1;
        this.field4188 = arg2;
        this.field4184 = arg3;
    }

    @ObfuscatedName("ns.m(FFFFI)V")
    public void method5987(float arg0, float arg1, float arg2, float arg3) {
        float var5 = (float) Math.sin((double) (arg3 * 0.5F));
        float var6 = (float) Math.cos((double) (arg3 * 0.5F));
        this.field4187 = arg0 * var5;
        this.field4189 = arg1 * var5;
        this.field4188 = arg2 * var5;
        this.field4184 = var6;
    }

    @ObfuscatedName("ns.t(B)V")
    public final void method5984() {
        this.field4188 = 0.0F;
        this.field4189 = 0.0F;
        this.field4187 = 0.0F;
        this.field4184 = 1.0F;
    }

    @ObfuscatedName("ns.s(Lns;B)V")
    public final void method5985(class366 arg0) {
        this.method5982(this.field4188 * arg0.field4189 + this.field4187 * arg0.field4184 + this.field4184 * arg0.field4187 - this.field4189 * arg0.field4188, this.field4187 * arg0.field4188 + this.field4184 * arg0.field4189 + (this.field4189 * arg0.field4184 - this.field4188 * arg0.field4187), this.field4184 * arg0.field4188 + (this.field4189 * arg0.field4187 + this.field4188 * arg0.field4184 - this.field4187 * arg0.field4189), this.field4184 * arg0.field4184 - this.field4187 * arg0.field4187 - this.field4189 * arg0.field4189 - this.field4188 * arg0.field4188);
    }

    public boolean equals(Object arg0) {
        if ((arg0 instanceof class366)) {
            class366 var2 = (class366) arg0;
            return this.field4187 == var2.field4187 && this.field4189 == var2.field4189 && this.field4188 == var2.field4188 && this.field4184 == var2.field4184;
        } else {
            return false;
        }
    }

    public int hashCode() {
        boolean var1 = true;
        float var2 = 1.0F;
        float var3 = var2 * 31.0F + this.field4187;
        float var4 = var3 * 31.0F + this.field4189;
        float var5 = var4 * 31.0F + this.field4188;
        float var6 = var5 * 31.0F + this.field4184;
        return (int) var6;
    }

    public String toString() {
        return this.field4187 + "," + this.field4189 + "," + this.field4188 + "," + this.field4184;
    }
}
