package deob;

@ObfuscatedName("sh")
public final class class470 {

    @ObfuscatedName("sh.az")
    public static class470[] field4867 = new class470[0];

    @ObfuscatedName("sh.at")
    public float field4864;

    @ObfuscatedName("sh.an")
    public float field4866;

    @ObfuscatedName("sh.ao")
    public float field4865;

    @ObfuscatedName("sh.ab")
    public float field4868;

    static {
        method6267(100);
        new class470();
    }

    @ObfuscatedName("ok.az(II)V")
    public static void method6267(int arg0) {
        Statics.field4863 = arg0;
        field4867 = new class470[arg0];
        Statics.field3055 = 0;
    }

    @ObfuscatedName("ka.ah(B)Lsh;")
    public static class470 method4824() {
        class470[] var0 = field4867;
        synchronized (field4867) {
            if (Statics.field3055 == 0) {
                return new class470();
            } else {
                field4867[--Statics.field3055].method7659();
                return field4867[Statics.field3055];
            }
        }
    }

    @ObfuscatedName("sh.af(B)V")
    public void method7664() {
        class470[] var1 = field4867;
        synchronized (field4867) {
            if (Statics.field3055 < Statics.field4863 - 1) {
                field4867[++Statics.field3055 - 1] = this;
            }
        }
    }

    public class470() {
        this.method7659();
    }

    @ObfuscatedName("sh.at(FFFFI)V")
    public void method7657(float arg0, float arg1, float arg2, float arg3) {
        this.field4864 = arg0;
        this.field4866 = arg1;
        this.field4865 = arg2;
        this.field4868 = arg3;
    }

    @ObfuscatedName("sh.an(FFFFI)V")
    public void method7661(float arg0, float arg1, float arg2, float arg3) {
        float var5 = (float) Math.sin((double) (arg3 * 0.5F));
        float var6 = (float) Math.cos((double) (arg3 * 0.5F));
        this.field4864 = arg0 * var5;
        this.field4866 = arg1 * var5;
        this.field4865 = arg2 * var5;
        this.field4868 = var6;
    }

    @ObfuscatedName("sh.ao(I)V")
    public final void method7659() {
        this.field4865 = 0.0F;
        this.field4866 = 0.0F;
        this.field4864 = 0.0F;
        this.field4868 = 1.0F;
    }

    @ObfuscatedName("sh.ab(Lsh;S)V")
    public final void method7660(class470 arg0) {
        this.method7657(this.field4865 * arg0.field4866 + this.field4868 * arg0.field4864 + this.field4864 * arg0.field4868 - this.field4866 * arg0.field4865, this.field4864 * arg0.field4865 + this.field4868 * arg0.field4866 + (this.field4866 * arg0.field4868 - this.field4865 * arg0.field4864), this.field4868 * arg0.field4865 + (this.field4866 * arg0.field4864 + this.field4865 * arg0.field4868 - this.field4864 * arg0.field4866), this.field4868 * arg0.field4868 - this.field4864 * arg0.field4864 - this.field4866 * arg0.field4866 - this.field4865 * arg0.field4865);
    }

    public boolean equals(Object arg0) {
        if ((arg0 instanceof class470)) {
            class470 var2 = (class470) arg0;
            return this.field4864 == var2.field4864 && this.field4866 == var2.field4866 && this.field4865 == var2.field4865 && this.field4868 == var2.field4868;
        } else {
            return false;
        }
    }

    public int hashCode() {
        boolean var1 = true;
        float var2 = 1.0F;
        float var3 = var2 * 31.0F + this.field4864;
        float var4 = var3 * 31.0F + this.field4866;
        float var5 = var4 * 31.0F + this.field4865;
        float var6 = var5 * 31.0F + this.field4868;
        return (int) var6;
    }

    public String toString() {
        return this.field4864 + "," + this.field4866 + "," + this.field4865 + "," + this.field4868;
    }
}
