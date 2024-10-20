package deob;

@ObfuscatedName("qj")
public final class class438 {

    @ObfuscatedName("qj.at")
    public static class438[] field4678 = new class438[0];

    @ObfuscatedName("qj.an")
    public static int field4681 = 100;

    @ObfuscatedName("qj.av")
    public static int field4677;

    @ObfuscatedName("qj.as")
    public float field4679;

    @ObfuscatedName("qj.ax")
    public float field4676;

    @ObfuscatedName("qj.ap")
    public float field4680;

    @ObfuscatedName("qj.ab")
    public float field4675;

    static {
        field4678 = new class438[100];
        field4677 = 0;
        new class438();
    }

    @ObfuscatedName("qj.at(B)V")
    public void method7378() {
        class438[] var1 = field4678;
        synchronized (field4678) {
            if (field4677 < field4681 - 1) {
                field4678[++field4677 - 1] = this;
            }
        }
    }

    public class438() {
        this.method7372();
    }

    @ObfuscatedName("qj.an(FFFFI)V")
    public void method7370(float arg0, float arg1, float arg2, float arg3) {
        this.field4679 = arg0;
        this.field4676 = arg1;
        this.field4680 = arg2;
        this.field4675 = arg3;
    }

    @ObfuscatedName("qj.av(FFFFS)V")
    public void method7371(float arg0, float arg1, float arg2, float arg3) {
        float var5 = (float) Math.sin((double) (arg3 * 0.5F));
        float var6 = (float) Math.cos((double) (arg3 * 0.5F));
        this.field4679 = arg0 * var5;
        this.field4676 = arg1 * var5;
        this.field4680 = arg2 * var5;
        this.field4675 = var6;
    }

    @ObfuscatedName("qj.as(I)V")
    public final void method7372() {
        this.field4680 = 0.0F;
        this.field4676 = 0.0F;
        this.field4679 = 0.0F;
        this.field4675 = 1.0F;
    }

    @ObfuscatedName("qj.ax(Lqj;I)V")
    public final void method7373(class438 arg0) {
        this.method7370(this.field4680 * arg0.field4676 + this.field4679 * arg0.field4675 + this.field4675 * arg0.field4679 - this.field4676 * arg0.field4680, this.field4679 * arg0.field4680 + this.field4675 * arg0.field4676 + (this.field4676 * arg0.field4675 - this.field4680 * arg0.field4679), this.field4675 * arg0.field4680 + (this.field4680 * arg0.field4675 + this.field4676 * arg0.field4679 - this.field4679 * arg0.field4676), this.field4675 * arg0.field4675 - this.field4679 * arg0.field4679 - this.field4676 * arg0.field4676 - this.field4680 * arg0.field4680);
    }

    public boolean equals(Object arg0) {
        if ((arg0 instanceof class438)) {
            class438 var2 = (class438) arg0;
            return this.field4679 == var2.field4679 && this.field4676 == var2.field4676 && this.field4680 == var2.field4680 && this.field4675 == var2.field4675;
        } else {
            return false;
        }
    }

    public int hashCode() {
        boolean var1 = true;
        float var2 = 1.0F;
        float var3 = var2 * 31.0F + this.field4679;
        float var4 = var3 * 31.0F + this.field4676;
        float var5 = var4 * 31.0F + this.field4680;
        float var6 = var5 * 31.0F + this.field4675;
        return (int) var6;
    }

    public String toString() {
        return this.field4679 + "," + this.field4676 + "," + this.field4680 + "," + this.field4675;
    }
}
