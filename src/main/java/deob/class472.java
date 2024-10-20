package deob;

@ObfuscatedName("sy")
public class class472 {

    @ObfuscatedName("sy.az")
    public float field4885;

    @ObfuscatedName("sy.ah")
    public float field4880;

    @ObfuscatedName("sy.af")
    public float field4879;

    @ObfuscatedName("sy.at")
    public float field4884;

    @ObfuscatedName("sy.an")
    public float field4881;

    @ObfuscatedName("sy.ao")
    public float field4882;

    @ObfuscatedName("sy.ab")
    public float field4883;

    @ObfuscatedName("sy.aw")
    public float field4877;

    @ObfuscatedName("sy.ad")
    public float field4878;

    @ObfuscatedName("sy.al")
    public float field4886;

    @ObfuscatedName("sy.as")
    public float field4887;

    @ObfuscatedName("sy.ag")
    public float field4888;

    static {
        new class472();
    }

    public class472() {
        this.method7758();
    }

    @ObfuscatedName("sy.az(I)V")
    public void method7758() {
        this.field4888 = 0.0F;
        this.field4887 = 0.0F;
        this.field4886 = 0.0F;
        this.field4877 = 0.0F;
        this.field4883 = 0.0F;
        this.field4882 = 0.0F;
        this.field4884 = 0.0F;
        this.field4879 = 0.0F;
        this.field4880 = 0.0F;
        this.field4878 = 1.0F;
        this.field4881 = 1.0F;
        this.field4885 = 1.0F;
    }

    @ObfuscatedName("sy.ah(FI)V")
    public void method7747(float arg0) {
        float var2 = (float) Math.cos((double) arg0);
        float var3 = (float) Math.sin((double) arg0);
        float var4 = this.field4880;
        float var5 = this.field4881;
        float var6 = this.field4877;
        float var7 = this.field4887;
        this.field4880 = var2 * var4 - this.field4879 * var3;
        this.field4879 = this.field4879 * var2 + var3 * var4;
        this.field4881 = var2 * var5 - this.field4882 * var3;
        this.field4882 = this.field4882 * var2 + var3 * var5;
        this.field4877 = var2 * var6 - this.field4878 * var3;
        this.field4878 = this.field4878 * var2 + var3 * var6;
        this.field4887 = var2 * var7 - this.field4888 * var3;
        this.field4888 = this.field4888 * var2 + var3 * var7;
    }

    @ObfuscatedName("sy.af(FI)V")
    public void method7757(float arg0) {
        float var2 = (float) Math.cos((double) arg0);
        float var3 = (float) Math.sin((double) arg0);
        float var4 = this.field4885;
        float var5 = this.field4884;
        float var6 = this.field4883;
        float var7 = this.field4886;
        this.field4885 = this.field4879 * var3 + var2 * var4;
        this.field4879 = this.field4879 * var2 - var3 * var4;
        this.field4884 = this.field4882 * var3 + var2 * var5;
        this.field4882 = this.field4882 * var2 - var3 * var5;
        this.field4883 = this.field4878 * var3 + var2 * var6;
        this.field4878 = this.field4878 * var2 - var3 * var6;
        this.field4886 = this.field4888 * var3 + var2 * var7;
        this.field4888 = this.field4888 * var2 - var3 * var7;
    }

    @ObfuscatedName("sy.at(FB)V")
    public void method7749(float arg0) {
        float var2 = (float) Math.cos((double) arg0);
        float var3 = (float) Math.sin((double) arg0);
        float var4 = this.field4885;
        float var5 = this.field4884;
        float var6 = this.field4883;
        float var7 = this.field4886;
        this.field4885 = var2 * var4 - this.field4880 * var3;
        this.field4880 = this.field4880 * var2 + var3 * var4;
        this.field4884 = var2 * var5 - this.field4881 * var3;
        this.field4881 = this.field4881 * var2 + var3 * var5;
        this.field4883 = var2 * var6 - this.field4877 * var3;
        this.field4877 = this.field4877 * var2 + var3 * var6;
        this.field4886 = var2 * var7 - this.field4887 * var3;
        this.field4887 = this.field4887 * var2 + var3 * var7;
    }

    @ObfuscatedName("sy.an(FFFI)V")
    public void method7750(float arg0, float arg1, float arg2) {
        this.field4886 += arg0;
        this.field4887 += arg1;
        this.field4888 += arg2;
    }

    public String toString() {
        return this.field4885 + "," + this.field4884 + "," + this.field4883 + "," + this.field4886 + "\n" + this.field4880 + "," + this.field4881 + "," + this.field4877 + "," + this.field4887 + "\n" + this.field4879 + "," + this.field4882 + "," + this.field4878 + "," + this.field4888;
    }
}
