package deob;

@ObfuscatedName("qf")
public final class class425 {

    @ObfuscatedName("qf.ab")
    public static class425[] field4677 = new class425[0];

    @ObfuscatedName("qf.au")
    public float field4678;

    @ObfuscatedName("qf.ax")
    public float field4682;

    @ObfuscatedName("qf.ao")
    public float field4680;

    @ObfuscatedName("qf.am")
    public float field4681;

    static {
        method3280(100);
        new class425();
    }

    @ObfuscatedName("gg.ab(II)V")
    public static void method3280(int arg0) {
        Statics.field4676 = arg0;
        field4677 = new class425[arg0];
        Statics.field4922 = 0;
    }

    @ObfuscatedName("pj.ay(I)Lqf;")
    public static class425 method6787() {
        class425[] var0 = field4677;
        synchronized (field4677) {
            if (Statics.field4922 == 0) {
                return new class425();
            } else {
                field4677[--Statics.field4922].method7205();
                return field4677[Statics.field4922];
            }
        }
    }

    @ObfuscatedName("qf.an(I)V")
    public void method7201() {
        class425[] var1 = field4677;
        synchronized (field4677) {
            if (Statics.field4922 < Statics.field4676 - 1) {
                field4677[++Statics.field4922 - 1] = this;
            }
        }
    }

    public class425() {
        this.method7205();
    }

    public class425(float arg0, float arg1, float arg2) {
        this.method7204(arg0, arg1, arg2);
    }

    @ObfuscatedName("qf.au(FFFFI)V")
    public void method7213(float arg0, float arg1, float arg2, float arg3) {
        this.field4678 = arg0;
        this.field4682 = arg1;
        this.field4680 = arg2;
        this.field4681 = arg3;
    }

    @ObfuscatedName("qf.ax(FFFFI)V")
    public void method7209(float arg0, float arg1, float arg2, float arg3) {
        float var5 = (float) Math.sin((double) (arg3 * 0.5F));
        float var6 = (float) Math.cos((double) (arg3 * 0.5F));
        this.field4678 = arg0 * var5;
        this.field4682 = arg1 * var5;
        this.field4680 = arg2 * var5;
        this.field4681 = var6;
    }

    @ObfuscatedName("qf.ao(FFFI)V")
    public void method7204(float arg0, float arg1, float arg2) {
        this.method7209(0.0F, 1.0F, 0.0F, arg0);
        class425 var4 = method6787();
        var4.method7209(1.0F, 0.0F, 0.0F, arg1);
        this.method7206(var4);
        var4.method7209(0.0F, 0.0F, 1.0F, arg2);
        this.method7206(var4);
        var4.method7201();
    }

    @ObfuscatedName("qf.am(B)V")
    public final void method7205() {
        this.field4680 = 0.0F;
        this.field4682 = 0.0F;
        this.field4678 = 0.0F;
        this.field4681 = 1.0F;
    }

    @ObfuscatedName("qf.ac(Lqf;B)V")
    public final void method7206(class425 arg0) {
        this.method7213(this.field4680 * arg0.field4682 + this.field4681 * arg0.field4678 + this.field4678 * arg0.field4681 - this.field4682 * arg0.field4680, this.field4678 * arg0.field4680 + this.field4681 * arg0.field4682 + (this.field4682 * arg0.field4681 - this.field4680 * arg0.field4678), this.field4681 * arg0.field4680 + (this.field4682 * arg0.field4678 + this.field4680 * arg0.field4681 - this.field4678 * arg0.field4682), this.field4681 * arg0.field4681 - this.field4678 * arg0.field4678 - this.field4682 * arg0.field4682 - this.field4680 * arg0.field4680);
    }

    public boolean equals(Object arg0) {
        if ((arg0 instanceof class425)) {
            class425 var2 = (class425) arg0;
            return this.field4678 == var2.field4678 && this.field4682 == var2.field4682 && this.field4680 == var2.field4680 && this.field4681 == var2.field4681;
        } else {
            return false;
        }
    }

    public int hashCode() {
        boolean var1 = true;
        float var2 = 1.0F;
        float var3 = var2 * 31.0F + this.field4678;
        float var4 = var3 * 31.0F + this.field4682;
        float var5 = var4 * 31.0F + this.field4680;
        float var6 = var5 * 31.0F + this.field4681;
        return (int) var6;
    }

    public String toString() {
        return this.field4678 + "," + this.field4682 + "," + this.field4680 + "," + this.field4681;
    }
}
