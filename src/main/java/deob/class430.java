package deob;

@ObfuscatedName("qh")
public class class430 {

    @ObfuscatedName("qh.ap")
    public float field4790;

    @ObfuscatedName("qh.aw")
    public float field4788;

    @ObfuscatedName("qh.ak")
    public float field4797;

    @ObfuscatedName("qh.aj")
    public float field4789;

    @ObfuscatedName("qh.ai")
    public float field4791;

    @ObfuscatedName("qh.ay")
    public float field4792;

    @ObfuscatedName("qh.as")
    public float field4793;

    @ObfuscatedName("qh.ae")
    public float field4794;

    @ObfuscatedName("qh.am")
    public float field4795;

    @ObfuscatedName("qh.at")
    public float field4796;

    @ObfuscatedName("qh.au")
    public float field4787;

    @ObfuscatedName("qh.an")
    public float field4798;

    static {
        new class430();
    }

    public class430() {
        this.method7715();
    }

    @ObfuscatedName("qh.ap(I)V")
    public void method7715() {
        this.field4798 = 0.0F;
        this.field4787 = 0.0F;
        this.field4796 = 0.0F;
        this.field4794 = 0.0F;
        this.field4793 = 0.0F;
        this.field4792 = 0.0F;
        this.field4789 = 0.0F;
        this.field4797 = 0.0F;
        this.field4788 = 0.0F;
        this.field4795 = 1.0F;
        this.field4791 = 1.0F;
        this.field4790 = 1.0F;
    }

    @ObfuscatedName("qh.aw(FI)V")
    public void method7705(float arg0) {
        float var2 = (float) Math.cos((double) arg0);
        float var3 = (float) Math.sin((double) arg0);
        float var4 = this.field4788;
        float var5 = this.field4791;
        float var6 = this.field4794;
        float var7 = this.field4787;
        this.field4788 = var2 * var4 - this.field4797 * var3;
        this.field4797 = this.field4797 * var2 + var3 * var4;
        this.field4791 = var2 * var5 - this.field4792 * var3;
        this.field4792 = this.field4792 * var2 + var3 * var5;
        this.field4794 = var2 * var6 - this.field4795 * var3;
        this.field4795 = this.field4795 * var2 + var3 * var6;
        this.field4787 = var2 * var7 - this.field4798 * var3;
        this.field4798 = this.field4798 * var2 + var3 * var7;
    }

    @ObfuscatedName("qh.ak(FI)V")
    public void method7706(float arg0) {
        float var2 = (float) Math.cos((double) arg0);
        float var3 = (float) Math.sin((double) arg0);
        float var4 = this.field4790;
        float var5 = this.field4789;
        float var6 = this.field4793;
        float var7 = this.field4796;
        this.field4790 = this.field4797 * var3 + var2 * var4;
        this.field4797 = this.field4797 * var2 - var3 * var4;
        this.field4789 = this.field4792 * var3 + var2 * var5;
        this.field4792 = this.field4792 * var2 - var3 * var5;
        this.field4793 = this.field4795 * var3 + var2 * var6;
        this.field4795 = this.field4795 * var2 - var3 * var6;
        this.field4796 = this.field4798 * var3 + var2 * var7;
        this.field4798 = this.field4798 * var2 - var3 * var7;
    }

    @ObfuscatedName("qh.aj(FI)V")
    public void method7707(float arg0) {
        float var2 = (float) Math.cos((double) arg0);
        float var3 = (float) Math.sin((double) arg0);
        float var4 = this.field4790;
        float var5 = this.field4789;
        float var6 = this.field4793;
        float var7 = this.field4796;
        this.field4790 = var2 * var4 - this.field4788 * var3;
        this.field4788 = this.field4788 * var2 + var3 * var4;
        this.field4789 = var2 * var5 - this.field4791 * var3;
        this.field4791 = this.field4791 * var2 + var3 * var5;
        this.field4793 = var2 * var6 - this.field4794 * var3;
        this.field4794 = this.field4794 * var2 + var3 * var6;
        this.field4796 = var2 * var7 - this.field4787 * var3;
        this.field4787 = this.field4787 * var2 + var3 * var7;
    }

    @ObfuscatedName("qh.ai(FFFI)V")
    public void method7704(float arg0, float arg1, float arg2) {
        this.field4796 += arg0;
        this.field4787 += arg1;
        this.field4798 += arg2;
    }

    public String toString() {
        return this.field4790 + "," + this.field4789 + "," + this.field4793 + "," + this.field4796 + "\n" + this.field4788 + "," + this.field4791 + "," + this.field4794 + "," + this.field4787 + "\n" + this.field4797 + "," + this.field4792 + "," + this.field4795 + "," + this.field4798;
    }
}
