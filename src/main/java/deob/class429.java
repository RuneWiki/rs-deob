package deob;

@ObfuscatedName("qx")
public class class429 {

    @ObfuscatedName("qx.ac")
    public float field4751;

    @ObfuscatedName("qx.ae")
    public float field4753;

    @ObfuscatedName("qx.ag")
    public float field4744;

    @ObfuscatedName("qx.am")
    public float field4745;

    @ObfuscatedName("qx.ax")
    public float field4746;

    @ObfuscatedName("qx.aq")
    public float field4747;

    @ObfuscatedName("qx.af")
    public float field4748;

    @ObfuscatedName("qx.at")
    public float field4743;

    @ObfuscatedName("qx.au")
    public float field4750;

    @ObfuscatedName("qx.ar")
    public float field4749;

    @ObfuscatedName("qx.al")
    public float field4752;

    @ObfuscatedName("qx.ad")
    public float field4742;

    static {
        new class429();
    }

    public class429() {
        this.method7445();
    }

    @ObfuscatedName("qx.ac(I)V")
    public void method7445() {
        this.field4742 = 0.0F;
        this.field4752 = 0.0F;
        this.field4749 = 0.0F;
        this.field4743 = 0.0F;
        this.field4748 = 0.0F;
        this.field4747 = 0.0F;
        this.field4745 = 0.0F;
        this.field4744 = 0.0F;
        this.field4753 = 0.0F;
        this.field4750 = 1.0F;
        this.field4746 = 1.0F;
        this.field4751 = 1.0F;
    }

    @ObfuscatedName("qx.ae(FB)V")
    public void method7442(float arg0) {
        float var2 = (float) Math.cos((double) arg0);
        float var3 = (float) Math.sin((double) arg0);
        float var4 = this.field4753;
        float var5 = this.field4746;
        float var6 = this.field4743;
        float var7 = this.field4752;
        this.field4753 = var2 * var4 - this.field4744 * var3;
        this.field4744 = this.field4744 * var2 + var3 * var4;
        this.field4746 = var2 * var5 - this.field4747 * var3;
        this.field4747 = this.field4747 * var2 + var3 * var5;
        this.field4743 = var2 * var6 - this.field4750 * var3;
        this.field4750 = this.field4750 * var2 + var3 * var6;
        this.field4752 = var2 * var7 - this.field4742 * var3;
        this.field4742 = this.field4742 * var2 + var3 * var7;
    }

    @ObfuscatedName("qx.ag(FI)V")
    public void method7443(float arg0) {
        float var2 = (float) Math.cos((double) arg0);
        float var3 = (float) Math.sin((double) arg0);
        float var4 = this.field4751;
        float var5 = this.field4745;
        float var6 = this.field4748;
        float var7 = this.field4749;
        this.field4751 = this.field4744 * var3 + var2 * var4;
        this.field4744 = this.field4744 * var2 - var3 * var4;
        this.field4745 = this.field4747 * var3 + var2 * var5;
        this.field4747 = this.field4747 * var2 - var3 * var5;
        this.field4748 = this.field4750 * var3 + var2 * var6;
        this.field4750 = this.field4750 * var2 - var3 * var6;
        this.field4749 = this.field4742 * var3 + var2 * var7;
        this.field4742 = this.field4742 * var2 - var3 * var7;
    }

    @ObfuscatedName("qx.am(FB)V")
    public void method7444(float arg0) {
        float var2 = (float) Math.cos((double) arg0);
        float var3 = (float) Math.sin((double) arg0);
        float var4 = this.field4751;
        float var5 = this.field4745;
        float var6 = this.field4748;
        float var7 = this.field4749;
        this.field4751 = var2 * var4 - this.field4753 * var3;
        this.field4753 = this.field4753 * var2 + var3 * var4;
        this.field4745 = var2 * var5 - this.field4746 * var3;
        this.field4746 = this.field4746 * var2 + var3 * var5;
        this.field4748 = var2 * var6 - this.field4743 * var3;
        this.field4743 = this.field4743 * var2 + var3 * var6;
        this.field4749 = var2 * var7 - this.field4752 * var3;
        this.field4752 = this.field4752 * var2 + var3 * var7;
    }

    @ObfuscatedName("qx.ax(FFFI)V")
    public void method7449(float arg0, float arg1, float arg2) {
        this.field4749 += arg0;
        this.field4752 += arg1;
        this.field4742 += arg2;
    }

    public String toString() {
        return this.field4751 + "," + this.field4745 + "," + this.field4748 + "," + this.field4749 + "\n" + this.field4753 + "," + this.field4746 + "," + this.field4743 + "," + this.field4752 + "\n" + this.field4744 + "," + this.field4747 + "," + this.field4750 + "," + this.field4742;
    }
}
