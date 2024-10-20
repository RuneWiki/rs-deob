package deob;

@ObfuscatedName("pl")
public final class class417 {

    @ObfuscatedName("pl.f")
    public static class417[] field4636 = new class417[0];

    @ObfuscatedName("pl.z")
    public float field4640;

    @ObfuscatedName("pl.j")
    public float field4637;

    @ObfuscatedName("pl.i")
    public float field4638;

    @ObfuscatedName("pl.n")
    public float field4639;

    static {
        method6457(100);
        new class417();
    }

    @ObfuscatedName("ni.f(IB)V")
    public static void method6457(int arg0) {
        Statics.field4635 = arg0;
        field4636 = new class417[arg0];
        Statics.field4511 = 0;
    }

    @ObfuscatedName("pl.w(B)V")
    public void method7266() {
        class417[] var1 = field4636;
        synchronized (field4636) {
            if (Statics.field4511 < Statics.field4635 - 1) {
                field4636[++Statics.field4511 - 1] = this;
            }
        }
    }

    public class417() {
        this.method7254();
    }

    @ObfuscatedName("pl.v(FFFFI)V")
    public void method7253(float arg0, float arg1, float arg2, float arg3) {
        this.field4637 = arg0;
        this.field4638 = arg1;
        this.field4639 = arg2;
        this.field4640 = arg3;
    }

    @ObfuscatedName("pl.s(FFFFI)V")
    public void method7269(float arg0, float arg1, float arg2, float arg3) {
        float var5 = (float) Math.sin((double) (arg3 * 0.5F));
        float var6 = (float) Math.cos((double) (arg3 * 0.5F));
        this.field4637 = arg0 * var5;
        this.field4638 = arg1 * var5;
        this.field4639 = arg2 * var5;
        this.field4640 = var6;
    }

    @ObfuscatedName("pl.z(I)V")
    public final void method7254() {
        this.field4639 = 0.0F;
        this.field4638 = 0.0F;
        this.field4637 = 0.0F;
        this.field4640 = 1.0F;
    }

    @ObfuscatedName("pl.j(Lpl;I)V")
    public final void method7255(class417 arg0) {
        this.method7253(this.field4639 * arg0.field4638 + this.field4640 * arg0.field4637 + this.field4637 * arg0.field4640 - this.field4638 * arg0.field4639, this.field4637 * arg0.field4639 + this.field4640 * arg0.field4638 + (this.field4638 * arg0.field4640 - this.field4639 * arg0.field4637), this.field4640 * arg0.field4639 + (this.field4639 * arg0.field4640 + this.field4638 * arg0.field4637 - this.field4637 * arg0.field4638), this.field4640 * arg0.field4640 - this.field4637 * arg0.field4637 - this.field4638 * arg0.field4638 - this.field4639 * arg0.field4639);
    }

    public boolean equals(Object arg0) {
        if ((arg0 instanceof class417)) {
            class417 var2 = (class417) arg0;
            return this.field4637 == var2.field4637 && this.field4638 == var2.field4638 && this.field4639 == var2.field4639 && this.field4640 == var2.field4640;
        } else {
            return false;
        }
    }

    public int hashCode() {
        boolean var1 = true;
        float var2 = 1.0F;
        float var3 = var2 * 31.0F + this.field4637;
        float var4 = var3 * 31.0F + this.field4638;
        float var5 = var4 * 31.0F + this.field4639;
        float var6 = var5 * 31.0F + this.field4640;
        return (int) var6;
    }

    public String toString() {
        return this.field4637 + "," + this.field4638 + "," + this.field4639 + "," + this.field4640;
    }
}
