package deob;

@ObfuscatedName("qi")
public final class class424 {

    @ObfuscatedName("qi.aq")
    public static class424[] field4702 = new class424[0];

    @ObfuscatedName("qi.ak")
    public float field4700;

    @ObfuscatedName("qi.ap")
    public float field4701;

    @ObfuscatedName("qi.an")
    public float field4697;

    @ObfuscatedName("qi.aj")
    public float field4703;

    static {
        method15(100);
        new class424();
    }

    @ObfuscatedName("ap.aq(II)V")
    public static void method15(int arg0) {
        Statics.field4698 = arg0;
        field4702 = new class424[arg0];
        Statics.field4699 = 0;
    }

    @ObfuscatedName("dr.ad(B)Lqi;")
    public static class424 method2166() {
        class424[] var0 = field4702;
        synchronized (field4702) {
            if (Statics.field4699 == 0) {
                return new class424();
            } else {
                field4702[--Statics.field4699].method7107();
                return field4702[Statics.field4699];
            }
        }
    }

    @ObfuscatedName("qi.ag(I)V")
    public void method7109() {
        class424[] var1 = field4702;
        synchronized (field4702) {
            if (Statics.field4699 < Statics.field4698 - 1) {
                field4702[++Statics.field4699 - 1] = this;
            }
        }
    }

    public class424() {
        this.method7107();
    }

    public class424(float arg0, float arg1, float arg2) {
        this.method7106(arg0, arg1, arg2);
    }

    @ObfuscatedName("qi.ak(FFFFI)V")
    public void method7105(float arg0, float arg1, float arg2, float arg3) {
        this.field4700 = arg0;
        this.field4701 = arg1;
        this.field4697 = arg2;
        this.field4703 = arg3;
    }

    @ObfuscatedName("qi.ap(FFFFI)V")
    public void method7079(float arg0, float arg1, float arg2, float arg3) {
        float var5 = (float) Math.sin((double) (arg3 * 0.5F));
        float var6 = (float) Math.cos((double) (arg3 * 0.5F));
        this.field4700 = arg0 * var5;
        this.field4701 = arg1 * var5;
        this.field4697 = arg2 * var5;
        this.field4703 = var6;
    }

    @ObfuscatedName("qi.an(FFFI)V")
    public void method7106(float arg0, float arg1, float arg2) {
        this.method7079(0.0F, 1.0F, 0.0F, arg0);
        class424 var4 = method2166();
        var4.method7079(1.0F, 0.0F, 0.0F, arg1);
        this.method7082(var4);
        var4.method7079(0.0F, 0.0F, 1.0F, arg2);
        this.method7082(var4);
        var4.method7109();
    }

    @ObfuscatedName("qi.aj(B)V")
    public final void method7107() {
        this.field4697 = 0.0F;
        this.field4701 = 0.0F;
        this.field4700 = 0.0F;
        this.field4703 = 1.0F;
    }

    @ObfuscatedName("qi.av(Lqi;B)V")
    public final void method7082(class424 arg0) {
        this.method7105(this.field4697 * arg0.field4701 + this.field4703 * arg0.field4700 + this.field4700 * arg0.field4703 - this.field4701 * arg0.field4697, this.field4700 * arg0.field4697 + this.field4703 * arg0.field4701 + (this.field4701 * arg0.field4703 - this.field4697 * arg0.field4700), this.field4703 * arg0.field4697 + (this.field4701 * arg0.field4700 + this.field4697 * arg0.field4703 - this.field4700 * arg0.field4701), this.field4703 * arg0.field4703 - this.field4700 * arg0.field4700 - this.field4701 * arg0.field4701 - this.field4697 * arg0.field4697);
    }

    public boolean equals(Object arg0) {
        if ((arg0 instanceof class424)) {
            class424 var2 = (class424) arg0;
            return this.field4700 == var2.field4700 && this.field4701 == var2.field4701 && this.field4697 == var2.field4697 && this.field4703 == var2.field4703;
        } else {
            return false;
        }
    }

    public int hashCode() {
        boolean var1 = true;
        float var2 = 1.0F;
        float var3 = var2 * 31.0F + this.field4700;
        float var4 = var3 * 31.0F + this.field4701;
        float var5 = var4 * 31.0F + this.field4697;
        float var6 = var5 * 31.0F + this.field4703;
        return (int) var6;
    }

    public String toString() {
        return this.field4700 + "," + this.field4701 + "," + this.field4697 + "," + this.field4703;
    }
}
