package deob;

@ObfuscatedName("rj")
public final class class451 {

    @ObfuscatedName("rj.aw")
    public static class451[] field4735 = new class451[0];

    @ObfuscatedName("rj.am")
    public float field4737;

    @ObfuscatedName("rj.as")
    public float field4734;

    @ObfuscatedName("rj.aj")
    public float field4738;

    @ObfuscatedName("rj.ag")
    public float field4736;

    static {
        method4938(100);
        new class451();
    }

    @ObfuscatedName("jf.aw(IB)V")
    public static void method4938(int arg0) {
        Statics.field4739 = arg0;
        field4735 = new class451[arg0];
        Statics.field3853 = 0;
    }

    @ObfuscatedName("jr.ay(I)Lrj;")
    public static class451 method4567() {
        class451[] var0 = field4735;
        synchronized (field4735) {
            if (Statics.field3853 == 0) {
                return new class451();
            } else {
                field4735[--Statics.field3853].method7463();
                return field4735[Statics.field3853];
            }
        }
    }

    @ObfuscatedName("rj.ar(I)V")
    public void method7464() {
        class451[] var1 = field4735;
        synchronized (field4735) {
            if (Statics.field3853 < Statics.field4739 - 1) {
                field4735[++Statics.field3853 - 1] = this;
            }
        }
    }

    public class451() {
        this.method7463();
    }

    @ObfuscatedName("rj.am(FFFFI)V")
    public void method7461(float arg0, float arg1, float arg2, float arg3) {
        this.field4737 = arg0;
        this.field4734 = arg1;
        this.field4738 = arg2;
        this.field4736 = arg3;
    }

    @ObfuscatedName("rj.as(FFFFI)V")
    public void method7462(float arg0, float arg1, float arg2, float arg3) {
        float var5 = (float) Math.sin((double) (arg3 * 0.5F));
        float var6 = (float) Math.cos((double) (arg3 * 0.5F));
        this.field4737 = arg0 * var5;
        this.field4734 = arg1 * var5;
        this.field4738 = arg2 * var5;
        this.field4736 = var6;
    }

    @ObfuscatedName("rj.aj(I)V")
    public final void method7463() {
        this.field4738 = 0.0F;
        this.field4734 = 0.0F;
        this.field4737 = 0.0F;
        this.field4736 = 1.0F;
    }

    @ObfuscatedName("rj.ag(Lrj;S)V")
    public final void method7468(class451 arg0) {
        this.method7461(this.field4738 * arg0.field4734 + this.field4737 * arg0.field4736 + this.field4736 * arg0.field4737 - this.field4734 * arg0.field4738, this.field4737 * arg0.field4738 + this.field4736 * arg0.field4734 + (this.field4734 * arg0.field4736 - this.field4738 * arg0.field4737), this.field4736 * arg0.field4738 + (this.field4738 * arg0.field4736 + this.field4734 * arg0.field4737 - this.field4737 * arg0.field4734), this.field4736 * arg0.field4736 - this.field4737 * arg0.field4737 - this.field4734 * arg0.field4734 - this.field4738 * arg0.field4738);
    }

    public boolean equals(Object arg0) {
        if ((arg0 instanceof class451)) {
            class451 var2 = (class451) arg0;
            return this.field4737 == var2.field4737 && this.field4734 == var2.field4734 && this.field4738 == var2.field4738 && this.field4736 == var2.field4736;
        } else {
            return false;
        }
    }

    public int hashCode() {
        boolean var1 = true;
        float var2 = 1.0F;
        float var3 = var2 * 31.0F + this.field4737;
        float var4 = var3 * 31.0F + this.field4734;
        float var5 = var4 * 31.0F + this.field4738;
        float var6 = var5 * 31.0F + this.field4736;
        return (int) var6;
    }

    public String toString() {
        return this.field4737 + "," + this.field4734 + "," + this.field4738 + "," + this.field4736;
    }
}
