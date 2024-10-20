package deob;

@ObfuscatedName("rm")
public class class452 {

    @ObfuscatedName("rm.au")
    public float field4750;

    @ObfuscatedName("rm.ae")
    public float field4745;

    @ObfuscatedName("rm.ao")
    public float field4746;

    @ObfuscatedName("rm.at")
    public float field4747;

    @ObfuscatedName("rm.ac")
    public float field4749;

    @ObfuscatedName("rm.ai")
    public float field4744;

    @ObfuscatedName("rm.az")
    public float field4754;

    @ObfuscatedName("rm.ap")
    public float field4751;

    @ObfuscatedName("rm.aa")
    public float field4748;

    @ObfuscatedName("rm.af")
    public float field4753;

    @ObfuscatedName("rm.ad")
    public float field4752;

    @ObfuscatedName("rm.aq")
    public float field4755;

    static {
        new class452();
    }

    public class452() {
        this.method7583();
    }

    @ObfuscatedName("rm.au(I)V")
    public void method7583() {
        this.field4755 = 0.0F;
        this.field4752 = 0.0F;
        this.field4753 = 0.0F;
        this.field4751 = 0.0F;
        this.field4754 = 0.0F;
        this.field4744 = 0.0F;
        this.field4747 = 0.0F;
        this.field4746 = 0.0F;
        this.field4745 = 0.0F;
        this.field4748 = 1.0F;
        this.field4749 = 1.0F;
        this.field4750 = 1.0F;
    }

    @ObfuscatedName("rm.ae(FB)V")
    public void method7585(float arg0) {
        float var2 = (float) Math.cos((double) arg0);
        float var3 = (float) Math.sin((double) arg0);
        float var4 = this.field4745;
        float var5 = this.field4749;
        float var6 = this.field4751;
        float var7 = this.field4752;
        this.field4745 = var2 * var4 - this.field4746 * var3;
        this.field4746 = this.field4746 * var2 + var3 * var4;
        this.field4749 = var2 * var5 - this.field4744 * var3;
        this.field4744 = this.field4744 * var2 + var3 * var5;
        this.field4751 = var2 * var6 - this.field4748 * var3;
        this.field4748 = this.field4748 * var2 + var3 * var6;
        this.field4752 = var2 * var7 - this.field4755 * var3;
        this.field4755 = this.field4755 * var2 + var3 * var7;
    }

    @ObfuscatedName("rm.ao(FB)V")
    public void method7589(float arg0) {
        float var2 = (float) Math.cos((double) arg0);
        float var3 = (float) Math.sin((double) arg0);
        float var4 = this.field4750;
        float var5 = this.field4747;
        float var6 = this.field4754;
        float var7 = this.field4753;
        this.field4750 = this.field4746 * var3 + var2 * var4;
        this.field4746 = this.field4746 * var2 - var3 * var4;
        this.field4747 = this.field4744 * var3 + var2 * var5;
        this.field4744 = this.field4744 * var2 - var3 * var5;
        this.field4754 = this.field4748 * var3 + var2 * var6;
        this.field4748 = this.field4748 * var2 - var3 * var6;
        this.field4753 = this.field4755 * var3 + var2 * var7;
        this.field4755 = this.field4755 * var2 - var3 * var7;
    }

    @ObfuscatedName("rm.at(FI)V")
    public void method7586(float arg0) {
        float var2 = (float) Math.cos((double) arg0);
        float var3 = (float) Math.sin((double) arg0);
        float var4 = this.field4750;
        float var5 = this.field4747;
        float var6 = this.field4754;
        float var7 = this.field4753;
        this.field4750 = var2 * var4 - this.field4745 * var3;
        this.field4745 = this.field4745 * var2 + var3 * var4;
        this.field4747 = var2 * var5 - this.field4749 * var3;
        this.field4749 = this.field4749 * var2 + var3 * var5;
        this.field4754 = var2 * var6 - this.field4751 * var3;
        this.field4751 = this.field4751 * var2 + var3 * var6;
        this.field4753 = var2 * var7 - this.field4752 * var3;
        this.field4752 = this.field4752 * var2 + var3 * var7;
    }

    @ObfuscatedName("rm.ac(FFFI)V")
    public void method7587(float arg0, float arg1, float arg2) {
        this.field4753 += arg0;
        this.field4752 += arg1;
        this.field4755 += arg2;
    }

    public String toString() {
        return this.field4750 + "," + this.field4747 + "," + this.field4754 + "," + this.field4753 + "\n" + this.field4745 + "," + this.field4749 + "," + this.field4751 + "," + this.field4752 + "\n" + this.field4746 + "," + this.field4744 + "," + this.field4748 + "," + this.field4755;
    }
}
