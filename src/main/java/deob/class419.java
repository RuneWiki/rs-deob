package deob;

@ObfuscatedName("pn")
public class class419 {

    @ObfuscatedName("pn.f")
    public float field4653;

    @ObfuscatedName("pn.w")
    public float field4649;

    @ObfuscatedName("pn.v")
    public float field4650;

    @ObfuscatedName("pn.s")
    public float field4651;

    @ObfuscatedName("pn.z")
    public float field4652;

    @ObfuscatedName("pn.j")
    public float field4654;

    @ObfuscatedName("pn.i")
    public float field4655;

    @ObfuscatedName("pn.n")
    public float field4656;

    @ObfuscatedName("pn.l")
    public float field4659;

    @ObfuscatedName("pn.k")
    public float field4657;

    @ObfuscatedName("pn.c")
    public float field4658;

    @ObfuscatedName("pn.r")
    public float field4648;

    static {
        new class419();
    }

    public class419() {
        this.method7338();
    }

    @ObfuscatedName("pn.f(B)V")
    public void method7338() {
        this.field4648 = 0.0F;
        this.field4658 = 0.0F;
        this.field4657 = 0.0F;
        this.field4656 = 0.0F;
        this.field4655 = 0.0F;
        this.field4654 = 0.0F;
        this.field4651 = 0.0F;
        this.field4650 = 0.0F;
        this.field4649 = 0.0F;
        this.field4659 = 1.0F;
        this.field4652 = 1.0F;
        this.field4653 = 1.0F;
    }

    @ObfuscatedName("pn.w(FI)V")
    public void method7340(float arg0) {
        float var2 = (float) Math.cos((double) arg0);
        float var3 = (float) Math.sin((double) arg0);
        float var4 = this.field4649;
        float var5 = this.field4652;
        float var6 = this.field4656;
        float var7 = this.field4658;
        this.field4649 = var2 * var4 - this.field4650 * var3;
        this.field4650 = this.field4650 * var2 + var3 * var4;
        this.field4652 = var2 * var5 - this.field4654 * var3;
        this.field4654 = this.field4654 * var2 + var3 * var5;
        this.field4656 = var2 * var6 - this.field4659 * var3;
        this.field4659 = this.field4659 * var2 + var3 * var6;
        this.field4658 = var2 * var7 - this.field4648 * var3;
        this.field4648 = this.field4648 * var2 + var3 * var7;
    }

    @ObfuscatedName("pn.v(FB)V")
    public void method7352(float arg0) {
        float var2 = (float) Math.cos((double) arg0);
        float var3 = (float) Math.sin((double) arg0);
        float var4 = this.field4653;
        float var5 = this.field4651;
        float var6 = this.field4655;
        float var7 = this.field4657;
        this.field4653 = this.field4650 * var3 + var2 * var4;
        this.field4650 = this.field4650 * var2 - var3 * var4;
        this.field4651 = this.field4654 * var3 + var2 * var5;
        this.field4654 = this.field4654 * var2 - var3 * var5;
        this.field4655 = this.field4659 * var3 + var2 * var6;
        this.field4659 = this.field4659 * var2 - var3 * var6;
        this.field4657 = this.field4648 * var3 + var2 * var7;
        this.field4648 = this.field4648 * var2 - var3 * var7;
    }

    @ObfuscatedName("pn.s(FI)V")
    public void method7341(float arg0) {
        float var2 = (float) Math.cos((double) arg0);
        float var3 = (float) Math.sin((double) arg0);
        float var4 = this.field4653;
        float var5 = this.field4651;
        float var6 = this.field4655;
        float var7 = this.field4657;
        this.field4653 = var2 * var4 - this.field4649 * var3;
        this.field4649 = this.field4649 * var2 + var3 * var4;
        this.field4651 = var2 * var5 - this.field4652 * var3;
        this.field4652 = this.field4652 * var2 + var3 * var5;
        this.field4655 = var2 * var6 - this.field4656 * var3;
        this.field4656 = this.field4656 * var2 + var3 * var6;
        this.field4657 = var2 * var7 - this.field4658 * var3;
        this.field4658 = this.field4658 * var2 + var3 * var7;
    }

    @ObfuscatedName("pn.z(FFFI)V")
    public void method7342(float arg0, float arg1, float arg2) {
        this.field4657 += arg0;
        this.field4658 += arg1;
        this.field4648 += arg2;
    }

    public String toString() {
        return this.field4653 + "," + this.field4651 + "," + this.field4655 + "," + this.field4657 + "\n" + this.field4649 + "," + this.field4652 + "," + this.field4656 + "," + this.field4658 + "\n" + this.field4650 + "," + this.field4654 + "," + this.field4659 + "," + this.field4648;
    }
}
