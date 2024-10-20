package deob;

@ObfuscatedName("ro")
public final class class450 {

    @ObfuscatedName("ro.au")
    public static class450[] field4732 = new class450[0];

    @ObfuscatedName("ro.at")
    public float field4734;

    @ObfuscatedName("ro.ac")
    public float field4733;

    @ObfuscatedName("ro.ai")
    public float field4735;

    @ObfuscatedName("ro.az")
    public float field4730;

    static {
        method6309(100);
        new class450();
    }

    @ObfuscatedName("oh.au(IS)V")
    public static void method6309(int arg0) {
        Statics.field4731 = arg0;
        field4732 = new class450[arg0];
        Statics.field3817 = 0;
    }

    @ObfuscatedName("cy.ae(I)Lro;")
    public static class450 method2000() {
        class450[] var0 = field4732;
        synchronized (field4732) {
            if (Statics.field3817 == 0) {
                return new class450();
            } else {
                field4732[--Statics.field3817].method7492();
                return field4732[Statics.field3817];
            }
        }
    }

    @ObfuscatedName("ro.ao(I)V")
    public void method7508() {
        class450[] var1 = field4732;
        synchronized (field4732) {
            if (Statics.field3817 < Statics.field4731 - 1) {
                field4732[++Statics.field3817 - 1] = this;
            }
        }
    }

    public class450() {
        this.method7492();
    }

    @ObfuscatedName("ro.at(FFFFI)V")
    public void method7490(float arg0, float arg1, float arg2, float arg3) {
        this.field4734 = arg0;
        this.field4733 = arg1;
        this.field4735 = arg2;
        this.field4730 = arg3;
    }

    @ObfuscatedName("ro.ac(FFFFI)V")
    public void method7491(float arg0, float arg1, float arg2, float arg3) {
        float var5 = (float) Math.sin((double) (arg3 * 0.5F));
        float var6 = (float) Math.cos((double) (arg3 * 0.5F));
        this.field4734 = arg0 * var5;
        this.field4733 = arg1 * var5;
        this.field4735 = arg2 * var5;
        this.field4730 = var6;
    }

    @ObfuscatedName("ro.ai(B)V")
    public final void method7492() {
        this.field4735 = 0.0F;
        this.field4733 = 0.0F;
        this.field4734 = 0.0F;
        this.field4730 = 1.0F;
    }

    @ObfuscatedName("ro.az(Lro;B)V")
    public final void method7493(class450 arg0) {
        this.method7490(this.field4735 * arg0.field4733 + this.field4734 * arg0.field4730 + this.field4730 * arg0.field4734 - this.field4733 * arg0.field4735, this.field4734 * arg0.field4735 + this.field4730 * arg0.field4733 + (this.field4733 * arg0.field4730 - this.field4735 * arg0.field4734), this.field4730 * arg0.field4735 + (this.field4735 * arg0.field4730 + this.field4733 * arg0.field4734 - this.field4734 * arg0.field4733), this.field4730 * arg0.field4730 - this.field4734 * arg0.field4734 - this.field4733 * arg0.field4733 - this.field4735 * arg0.field4735);
    }

    public boolean equals(Object arg0) {
        if ((arg0 instanceof class450)) {
            class450 var2 = (class450) arg0;
            return this.field4734 == var2.field4734 && this.field4733 == var2.field4733 && this.field4735 == var2.field4735 && this.field4730 == var2.field4730;
        } else {
            return false;
        }
    }

    public int hashCode() {
        boolean var1 = true;
        float var2 = 1.0F;
        float var3 = var2 * 31.0F + this.field4734;
        float var4 = var3 * 31.0F + this.field4733;
        float var5 = var4 * 31.0F + this.field4735;
        float var6 = var5 * 31.0F + this.field4730;
        return (int) var6;
    }

    public String toString() {
        return this.field4734 + "," + this.field4733 + "," + this.field4735 + "," + this.field4730;
    }
}
