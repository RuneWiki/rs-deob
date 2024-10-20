package deob;

@ObfuscatedName("qz")
public final class class423 {

    @ObfuscatedName("qz.ak")
    public static class423[] field4691 = new class423[0];

    @ObfuscatedName("qz.az")
    public float field4688;

    @ObfuscatedName("qz.af")
    public float field4685;

    @ObfuscatedName("qz.aa")
    public float field4690;

    @ObfuscatedName("qz.at")
    public float field4686;

    static {
        Statics.method5583(100);
        new class423();
    }

    @ObfuscatedName("eb.al(B)Lqz;")
    public static class423 method2787() {
        class423[] var0 = field4691;
        synchronized (field4691) {
            if (Statics.field4687 == 0) {
                return new class423();
            } else {
                field4691[--Statics.field4687].method7141();
                return field4691[Statics.field4687];
            }
        }
    }

    @ObfuscatedName("qz.aj(S)V")
    public void method7160() {
        class423[] var1 = field4691;
        synchronized (field4691) {
            if (Statics.field4687 < Statics.field4689 - 1) {
                field4691[++Statics.field4687 - 1] = this;
            }
        }
    }

    public class423() {
        this.method7141();
    }

    public class423(float arg0, float arg1, float arg2) {
        this.method7138(arg0, arg1, arg2);
    }

    @ObfuscatedName("qz.az(FFFFS)V")
    public void method7140(float arg0, float arg1, float arg2, float arg3) {
        this.field4688 = arg0;
        this.field4685 = arg1;
        this.field4690 = arg2;
        this.field4686 = arg3;
    }

    @ObfuscatedName("qz.af(FFFFB)V")
    public void method7139(float arg0, float arg1, float arg2, float arg3) {
        float var5 = (float) Math.sin((double) (arg3 * 0.5F));
        float var6 = (float) Math.cos((double) (arg3 * 0.5F));
        this.field4688 = arg0 * var5;
        this.field4685 = arg1 * var5;
        this.field4690 = arg2 * var5;
        this.field4686 = var6;
    }

    @ObfuscatedName("qz.aa(FFFI)V")
    public void method7138(float arg0, float arg1, float arg2) {
        this.method7139(0.0F, 1.0F, 0.0F, arg0);
        class423 var4 = method2787();
        var4.method7139(1.0F, 0.0F, 0.0F, arg1);
        this.method7142(var4);
        var4.method7139(0.0F, 0.0F, 1.0F, arg2);
        this.method7142(var4);
        var4.method7160();
    }

    @ObfuscatedName("qz.at(I)V")
    public final void method7141() {
        this.field4690 = 0.0F;
        this.field4685 = 0.0F;
        this.field4688 = 0.0F;
        this.field4686 = 1.0F;
    }

    @ObfuscatedName("qz.ab(Lqz;B)V")
    public final void method7142(class423 arg0) {
        this.method7140(this.field4690 * arg0.field4685 + this.field4688 * arg0.field4686 + this.field4686 * arg0.field4688 - this.field4685 * arg0.field4690, this.field4688 * arg0.field4690 + this.field4686 * arg0.field4685 + (this.field4685 * arg0.field4686 - this.field4690 * arg0.field4688), this.field4686 * arg0.field4690 + (this.field4690 * arg0.field4686 + this.field4685 * arg0.field4688 - this.field4688 * arg0.field4685), this.field4686 * arg0.field4686 - this.field4688 * arg0.field4688 - this.field4685 * arg0.field4685 - this.field4690 * arg0.field4690);
    }

    public boolean equals(Object arg0) {
        if ((arg0 instanceof class423)) {
            class423 var2 = (class423) arg0;
            return this.field4688 == var2.field4688 && this.field4685 == var2.field4685 && this.field4690 == var2.field4690 && this.field4686 == var2.field4686;
        } else {
            return false;
        }
    }

    public int hashCode() {
        boolean var1 = true;
        float var2 = 1.0F;
        float var3 = var2 * 31.0F + this.field4688;
        float var4 = var3 * 31.0F + this.field4685;
        float var5 = var4 * 31.0F + this.field4690;
        float var6 = var5 * 31.0F + this.field4686;
        return (int) var6;
    }

    public String toString() {
        return this.field4688 + "," + this.field4685 + "," + this.field4690 + "," + this.field4686;
    }
}
