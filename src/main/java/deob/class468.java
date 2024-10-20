package deob;

@ObfuscatedName("rg")
public class class468 {

    @ObfuscatedName("rg.am")
    public float field4823;

    @ObfuscatedName("rg.ap")
    public float field4814;

    @ObfuscatedName("rg.af")
    public float field4817;

    @ObfuscatedName("rg.aj")
    public float field4822;

    @ObfuscatedName("rg.aq")
    public float field4816;

    @ObfuscatedName("rg.ar")
    public float field4818;

    @ObfuscatedName("rg.ag")
    public float field4819;

    @ObfuscatedName("rg.ao")
    public float field4820;

    @ObfuscatedName("rg.ae")
    public float field4821;

    @ObfuscatedName("rg.aa")
    public float field4813;

    @ObfuscatedName("rg.au")
    public float field4815;

    @ObfuscatedName("rg.an")
    public float field4824;

    static {
        new class468();
    }

    public class468() {
        this.method7871();
    }

    @ObfuscatedName("rg.am(I)V")
    public void method7871() {
        this.field4824 = 0.0F;
        this.field4815 = 0.0F;
        this.field4813 = 0.0F;
        this.field4820 = 0.0F;
        this.field4819 = 0.0F;
        this.field4818 = 0.0F;
        this.field4822 = 0.0F;
        this.field4817 = 0.0F;
        this.field4814 = 0.0F;
        this.field4821 = 1.0F;
        this.field4816 = 1.0F;
        this.field4823 = 1.0F;
    }

    @ObfuscatedName("rg.ap(FI)V")
    public void method7872(float arg0) {
        float var2 = (float) Math.cos((double) arg0);
        float var3 = (float) Math.sin((double) arg0);
        float var4 = this.field4814;
        float var5 = this.field4816;
        float var6 = this.field4820;
        float var7 = this.field4815;
        this.field4814 = var2 * var4 - this.field4817 * var3;
        this.field4817 = this.field4817 * var2 + var3 * var4;
        this.field4816 = var2 * var5 - this.field4818 * var3;
        this.field4818 = this.field4818 * var2 + var3 * var5;
        this.field4820 = var2 * var6 - this.field4821 * var3;
        this.field4821 = this.field4821 * var2 + var3 * var6;
        this.field4815 = var2 * var7 - this.field4824 * var3;
        this.field4824 = this.field4824 * var2 + var3 * var7;
    }

    @ObfuscatedName("rg.af(FI)V")
    public void method7884(float arg0) {
        float var2 = (float) Math.cos((double) arg0);
        float var3 = (float) Math.sin((double) arg0);
        float var4 = this.field4823;
        float var5 = this.field4822;
        float var6 = this.field4819;
        float var7 = this.field4813;
        this.field4823 = this.field4817 * var3 + var2 * var4;
        this.field4817 = this.field4817 * var2 - var3 * var4;
        this.field4822 = this.field4818 * var3 + var2 * var5;
        this.field4818 = this.field4818 * var2 - var3 * var5;
        this.field4819 = this.field4821 * var3 + var2 * var6;
        this.field4821 = this.field4821 * var2 - var3 * var6;
        this.field4813 = this.field4824 * var3 + var2 * var7;
        this.field4824 = this.field4824 * var2 - var3 * var7;
    }

    @ObfuscatedName("rg.aj(FB)V")
    public void method7876(float arg0) {
        float var2 = (float) Math.cos((double) arg0);
        float var3 = (float) Math.sin((double) arg0);
        float var4 = this.field4823;
        float var5 = this.field4822;
        float var6 = this.field4819;
        float var7 = this.field4813;
        this.field4823 = var2 * var4 - this.field4814 * var3;
        this.field4814 = this.field4814 * var2 + var3 * var4;
        this.field4822 = var2 * var5 - this.field4816 * var3;
        this.field4816 = this.field4816 * var2 + var3 * var5;
        this.field4819 = var2 * var6 - this.field4820 * var3;
        this.field4820 = this.field4820 * var2 + var3 * var6;
        this.field4813 = var2 * var7 - this.field4815 * var3;
        this.field4815 = this.field4815 * var2 + var3 * var7;
    }

    @ObfuscatedName("rg.aq(FFFI)V")
    public void method7875(float arg0, float arg1, float arg2) {
        this.field4813 += arg0;
        this.field4815 += arg1;
        this.field4824 += arg2;
    }

    public String toString() {
        return this.field4823 + "," + this.field4822 + "," + this.field4819 + "," + this.field4813 + "\n" + this.field4814 + "," + this.field4816 + "," + this.field4820 + "," + this.field4815 + "\n" + this.field4817 + "," + this.field4818 + "," + this.field4821 + "," + this.field4824;
    }
}
