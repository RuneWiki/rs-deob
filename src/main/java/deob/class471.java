package deob;

@ObfuscatedName("ss")
public class class471 {

    @ObfuscatedName("ss.aq")
    public float field4850;

    @ObfuscatedName("ss.aw")
    public float field4849;

    @ObfuscatedName("ss.al")
    public float field4857;

    @ObfuscatedName("ss.ai")
    public float field4851;

    @ObfuscatedName("ss.ar")
    public float field4852;

    @ObfuscatedName("ss.as")
    public float field4848;

    @ObfuscatedName("ss.aa")
    public float field4854;

    @ObfuscatedName("ss.az")
    public float field4855;

    @ObfuscatedName("ss.ao")
    public float field4860;

    @ObfuscatedName("ss.au")
    public float field4856;

    @ObfuscatedName("ss.ak")
    public float field4858;

    @ObfuscatedName("ss.ah")
    public float field4859;

    static {
        new class471();
    }

    public class471() {
        this.method7884();
    }

    @ObfuscatedName("ss.aq(I)V")
    public void method7884() {
        this.field4859 = 0.0F;
        this.field4858 = 0.0F;
        this.field4856 = 0.0F;
        this.field4855 = 0.0F;
        this.field4854 = 0.0F;
        this.field4848 = 0.0F;
        this.field4851 = 0.0F;
        this.field4857 = 0.0F;
        this.field4849 = 0.0F;
        this.field4860 = 1.0F;
        this.field4852 = 1.0F;
        this.field4850 = 1.0F;
    }

    @ObfuscatedName("ss.aw(FB)V")
    public void method7880(float arg0) {
        float var2 = (float) Math.cos((double) arg0);
        float var3 = (float) Math.sin((double) arg0);
        float var4 = this.field4849;
        float var5 = this.field4852;
        float var6 = this.field4855;
        float var7 = this.field4858;
        this.field4849 = var2 * var4 - this.field4857 * var3;
        this.field4857 = this.field4857 * var2 + var3 * var4;
        this.field4852 = var2 * var5 - this.field4848 * var3;
        this.field4848 = this.field4848 * var2 + var3 * var5;
        this.field4855 = var2 * var6 - this.field4860 * var3;
        this.field4860 = this.field4860 * var2 + var3 * var6;
        this.field4858 = var2 * var7 - this.field4859 * var3;
        this.field4859 = this.field4859 * var2 + var3 * var7;
    }

    @ObfuscatedName("ss.al(FB)V")
    public void method7885(float arg0) {
        float var2 = (float) Math.cos((double) arg0);
        float var3 = (float) Math.sin((double) arg0);
        float var4 = this.field4850;
        float var5 = this.field4851;
        float var6 = this.field4854;
        float var7 = this.field4856;
        this.field4850 = this.field4857 * var3 + var2 * var4;
        this.field4857 = this.field4857 * var2 - var3 * var4;
        this.field4851 = this.field4848 * var3 + var2 * var5;
        this.field4848 = this.field4848 * var2 - var3 * var5;
        this.field4854 = this.field4860 * var3 + var2 * var6;
        this.field4860 = this.field4860 * var2 - var3 * var6;
        this.field4856 = this.field4859 * var3 + var2 * var7;
        this.field4859 = this.field4859 * var2 - var3 * var7;
    }

    @ObfuscatedName("ss.ai(FI)V")
    public void method7882(float arg0) {
        float var2 = (float) Math.cos((double) arg0);
        float var3 = (float) Math.sin((double) arg0);
        float var4 = this.field4850;
        float var5 = this.field4851;
        float var6 = this.field4854;
        float var7 = this.field4856;
        this.field4850 = var2 * var4 - this.field4849 * var3;
        this.field4849 = this.field4849 * var2 + var3 * var4;
        this.field4851 = var2 * var5 - this.field4852 * var3;
        this.field4852 = this.field4852 * var2 + var3 * var5;
        this.field4854 = var2 * var6 - this.field4855 * var3;
        this.field4855 = this.field4855 * var2 + var3 * var6;
        this.field4856 = var2 * var7 - this.field4858 * var3;
        this.field4858 = this.field4858 * var2 + var3 * var7;
    }

    @ObfuscatedName("ss.ar(FFFI)V")
    public void method7881(float arg0, float arg1, float arg2) {
        this.field4856 += arg0;
        this.field4858 += arg1;
        this.field4859 += arg2;
    }

    public String toString() {
        return this.field4850 + "," + this.field4851 + "," + this.field4854 + "," + this.field4856 + "\n" + this.field4849 + "," + this.field4852 + "," + this.field4855 + "," + this.field4858 + "\n" + this.field4857 + "," + this.field4848 + "," + this.field4860 + "," + this.field4859;
    }
}
