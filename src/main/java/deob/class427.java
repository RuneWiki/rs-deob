package deob;

@ObfuscatedName("qi")
public class class427 {

    @ObfuscatedName("qi.ab")
    public float field4702;

    @ObfuscatedName("qi.ay")
    public float field4695;

    @ObfuscatedName("qi.an")
    public float field4693;

    @ObfuscatedName("qi.au")
    public float field4694;

    @ObfuscatedName("qi.ax")
    public float field4703;

    @ObfuscatedName("qi.ao")
    public float field4696;

    @ObfuscatedName("qi.am")
    public float field4699;

    @ObfuscatedName("qi.ac")
    public float field4697;

    @ObfuscatedName("qi.ae")
    public float field4691;

    @ObfuscatedName("qi.ad")
    public float field4692;

    @ObfuscatedName("qi.aq")
    public float field4701;

    @ObfuscatedName("qi.al")
    public float field4700;

    static {
        new class427();
    }

    public class427() {
        this.method7330();
    }

    @ObfuscatedName("qi.ab(B)V")
    public void method7330() {
        this.field4700 = 0.0F;
        this.field4701 = 0.0F;
        this.field4692 = 0.0F;
        this.field4697 = 0.0F;
        this.field4699 = 0.0F;
        this.field4696 = 0.0F;
        this.field4694 = 0.0F;
        this.field4693 = 0.0F;
        this.field4695 = 0.0F;
        this.field4691 = 1.0F;
        this.field4703 = 1.0F;
        this.field4702 = 1.0F;
    }

    @ObfuscatedName("qi.ay(FB)V")
    public void method7318(float arg0) {
        float var2 = (float) Math.cos((double) arg0);
        float var3 = (float) Math.sin((double) arg0);
        float var4 = this.field4695;
        float var5 = this.field4703;
        float var6 = this.field4697;
        float var7 = this.field4701;
        this.field4695 = var2 * var4 - this.field4693 * var3;
        this.field4693 = this.field4693 * var2 + var3 * var4;
        this.field4703 = var2 * var5 - this.field4696 * var3;
        this.field4696 = this.field4696 * var2 + var3 * var5;
        this.field4697 = var2 * var6 - this.field4691 * var3;
        this.field4691 = this.field4691 * var2 + var3 * var6;
        this.field4701 = var2 * var7 - this.field4700 * var3;
        this.field4700 = this.field4700 * var2 + var3 * var7;
    }

    @ObfuscatedName("qi.an(FB)V")
    public void method7324(float arg0) {
        float var2 = (float) Math.cos((double) arg0);
        float var3 = (float) Math.sin((double) arg0);
        float var4 = this.field4702;
        float var5 = this.field4694;
        float var6 = this.field4699;
        float var7 = this.field4692;
        this.field4702 = this.field4693 * var3 + var2 * var4;
        this.field4693 = this.field4693 * var2 - var3 * var4;
        this.field4694 = this.field4696 * var3 + var2 * var5;
        this.field4696 = this.field4696 * var2 - var3 * var5;
        this.field4699 = this.field4691 * var3 + var2 * var6;
        this.field4691 = this.field4691 * var2 - var3 * var6;
        this.field4692 = this.field4700 * var3 + var2 * var7;
        this.field4700 = this.field4700 * var2 - var3 * var7;
    }

    @ObfuscatedName("qi.au(FI)V")
    public void method7320(float arg0) {
        float var2 = (float) Math.cos((double) arg0);
        float var3 = (float) Math.sin((double) arg0);
        float var4 = this.field4702;
        float var5 = this.field4694;
        float var6 = this.field4699;
        float var7 = this.field4692;
        this.field4702 = var2 * var4 - this.field4695 * var3;
        this.field4695 = this.field4695 * var2 + var3 * var4;
        this.field4694 = var2 * var5 - this.field4703 * var3;
        this.field4703 = this.field4703 * var2 + var3 * var5;
        this.field4699 = var2 * var6 - this.field4697 * var3;
        this.field4697 = this.field4697 * var2 + var3 * var6;
        this.field4692 = var2 * var7 - this.field4701 * var3;
        this.field4701 = this.field4701 * var2 + var3 * var7;
    }

    @ObfuscatedName("qi.ax(FFFI)V")
    public void method7327(float arg0, float arg1, float arg2) {
        this.field4692 += arg0;
        this.field4701 += arg1;
        this.field4700 += arg2;
    }

    public String toString() {
        return this.field4702 + "," + this.field4694 + "," + this.field4699 + "," + this.field4692 + "\n" + this.field4695 + "," + this.field4703 + "," + this.field4697 + "," + this.field4701 + "\n" + this.field4693 + "," + this.field4696 + "," + this.field4691 + "," + this.field4700;
    }
}
