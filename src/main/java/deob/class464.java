package deob;

@ObfuscatedName("rj")
public class class464 {

    @ObfuscatedName("rj.at")
    public float field4777;

    @ObfuscatedName("rj.ah")
    public float field4776;

    @ObfuscatedName("rj.ar")
    public float field4786;

    @ObfuscatedName("rj.ao")
    public float field4778;

    @ObfuscatedName("rj.ab")
    public float field4779;

    @ObfuscatedName("rj.au")
    public float field4780;

    @ObfuscatedName("rj.aa")
    public float field4781;

    @ObfuscatedName("rj.ac")
    public float field4782;

    @ObfuscatedName("rj.al")
    public float field4783;

    @ObfuscatedName("rj.az")
    public float field4784;

    @ObfuscatedName("rj.ap")
    public float field4785;

    @ObfuscatedName("rj.av")
    public float field4775;

    static {
        new class464();
    }

    public class464() {
        this.method7726();
    }

    @ObfuscatedName("rj.at(I)V")
    public void method7726() {
        this.field4775 = 0.0F;
        this.field4785 = 0.0F;
        this.field4784 = 0.0F;
        this.field4782 = 0.0F;
        this.field4781 = 0.0F;
        this.field4780 = 0.0F;
        this.field4778 = 0.0F;
        this.field4786 = 0.0F;
        this.field4776 = 0.0F;
        this.field4783 = 1.0F;
        this.field4779 = 1.0F;
        this.field4777 = 1.0F;
    }

    @ObfuscatedName("rj.ah(FI)V")
    public void method7727(float arg0) {
        float var2 = (float) Math.cos((double) arg0);
        float var3 = (float) Math.sin((double) arg0);
        float var4 = this.field4776;
        float var5 = this.field4779;
        float var6 = this.field4782;
        float var7 = this.field4785;
        this.field4776 = var2 * var4 - this.field4786 * var3;
        this.field4786 = this.field4786 * var2 + var3 * var4;
        this.field4779 = var2 * var5 - this.field4780 * var3;
        this.field4780 = this.field4780 * var2 + var3 * var5;
        this.field4782 = var2 * var6 - this.field4783 * var3;
        this.field4783 = this.field4783 * var2 + var3 * var6;
        this.field4785 = var2 * var7 - this.field4775 * var3;
        this.field4775 = this.field4775 * var2 + var3 * var7;
    }

    @ObfuscatedName("rj.ar(FB)V")
    public void method7743(float arg0) {
        float var2 = (float) Math.cos((double) arg0);
        float var3 = (float) Math.sin((double) arg0);
        float var4 = this.field4777;
        float var5 = this.field4778;
        float var6 = this.field4781;
        float var7 = this.field4784;
        this.field4777 = this.field4786 * var3 + var2 * var4;
        this.field4786 = this.field4786 * var2 - var3 * var4;
        this.field4778 = this.field4780 * var3 + var2 * var5;
        this.field4780 = this.field4780 * var2 - var3 * var5;
        this.field4781 = this.field4783 * var3 + var2 * var6;
        this.field4783 = this.field4783 * var2 - var3 * var6;
        this.field4784 = this.field4775 * var3 + var2 * var7;
        this.field4775 = this.field4775 * var2 - var3 * var7;
    }

    @ObfuscatedName("rj.ao(FI)V")
    public void method7728(float arg0) {
        float var2 = (float) Math.cos((double) arg0);
        float var3 = (float) Math.sin((double) arg0);
        float var4 = this.field4777;
        float var5 = this.field4778;
        float var6 = this.field4781;
        float var7 = this.field4784;
        this.field4777 = var2 * var4 - this.field4776 * var3;
        this.field4776 = this.field4776 * var2 + var3 * var4;
        this.field4778 = var2 * var5 - this.field4779 * var3;
        this.field4779 = this.field4779 * var2 + var3 * var5;
        this.field4781 = var2 * var6 - this.field4782 * var3;
        this.field4782 = this.field4782 * var2 + var3 * var6;
        this.field4784 = var2 * var7 - this.field4785 * var3;
        this.field4785 = this.field4785 * var2 + var3 * var7;
    }

    @ObfuscatedName("rj.ab(FFFB)V")
    public void method7730(float arg0, float arg1, float arg2) {
        this.field4784 += arg0;
        this.field4785 += arg1;
        this.field4775 += arg2;
    }

    public String toString() {
        return this.field4777 + "," + this.field4778 + "," + this.field4781 + "," + this.field4784 + "\n" + this.field4776 + "," + this.field4779 + "," + this.field4782 + "," + this.field4785 + "\n" + this.field4786 + "," + this.field4780 + "," + this.field4783 + "," + this.field4775;
    }
}
