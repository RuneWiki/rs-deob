package deob;

@ObfuscatedName("qu")
public class class440 {

    @ObfuscatedName("qu.at")
    public float field4696;

    @ObfuscatedName("qu.an")
    public float field4689;

    @ObfuscatedName("qu.av")
    public float field4688;

    @ObfuscatedName("qu.as")
    public float field4700;

    @ObfuscatedName("qu.ax")
    public float field4692;

    @ObfuscatedName("qu.ap")
    public float field4693;

    @ObfuscatedName("qu.ab")
    public float field4694;

    @ObfuscatedName("qu.ak")
    public float field4695;

    @ObfuscatedName("qu.ae")
    public float field4690;

    @ObfuscatedName("qu.af")
    public float field4697;

    @ObfuscatedName("qu.ao")
    public float field4691;

    @ObfuscatedName("qu.aa")
    public float field4699;

    static {
        new class440();
    }

    public class440() {
        this.method7455();
    }

    @ObfuscatedName("qu.at(I)V")
    public void method7455() {
        this.field4699 = 0.0F;
        this.field4691 = 0.0F;
        this.field4697 = 0.0F;
        this.field4695 = 0.0F;
        this.field4694 = 0.0F;
        this.field4693 = 0.0F;
        this.field4700 = 0.0F;
        this.field4688 = 0.0F;
        this.field4689 = 0.0F;
        this.field4690 = 1.0F;
        this.field4692 = 1.0F;
        this.field4696 = 1.0F;
    }

    @ObfuscatedName("qu.an(FB)V")
    public void method7459(float arg0) {
        float var2 = (float) Math.cos((double) arg0);
        float var3 = (float) Math.sin((double) arg0);
        float var4 = this.field4689;
        float var5 = this.field4692;
        float var6 = this.field4695;
        float var7 = this.field4691;
        this.field4689 = var2 * var4 - this.field4688 * var3;
        this.field4688 = this.field4688 * var2 + var3 * var4;
        this.field4692 = var2 * var5 - this.field4693 * var3;
        this.field4693 = this.field4693 * var2 + var3 * var5;
        this.field4695 = var2 * var6 - this.field4690 * var3;
        this.field4690 = this.field4690 * var2 + var3 * var6;
        this.field4691 = var2 * var7 - this.field4699 * var3;
        this.field4699 = this.field4699 * var2 + var3 * var7;
    }

    @ObfuscatedName("qu.av(FI)V")
    public void method7471(float arg0) {
        float var2 = (float) Math.cos((double) arg0);
        float var3 = (float) Math.sin((double) arg0);
        float var4 = this.field4696;
        float var5 = this.field4700;
        float var6 = this.field4694;
        float var7 = this.field4697;
        this.field4696 = this.field4688 * var3 + var2 * var4;
        this.field4688 = this.field4688 * var2 - var3 * var4;
        this.field4700 = this.field4693 * var3 + var2 * var5;
        this.field4693 = this.field4693 * var2 - var3 * var5;
        this.field4694 = this.field4690 * var3 + var2 * var6;
        this.field4690 = this.field4690 * var2 - var3 * var6;
        this.field4697 = this.field4699 * var3 + var2 * var7;
        this.field4699 = this.field4699 * var2 - var3 * var7;
    }

    @ObfuscatedName("qu.as(FI)V")
    public void method7470(float arg0) {
        float var2 = (float) Math.cos((double) arg0);
        float var3 = (float) Math.sin((double) arg0);
        float var4 = this.field4696;
        float var5 = this.field4700;
        float var6 = this.field4694;
        float var7 = this.field4697;
        this.field4696 = var2 * var4 - this.field4689 * var3;
        this.field4689 = this.field4689 * var2 + var3 * var4;
        this.field4700 = var2 * var5 - this.field4692 * var3;
        this.field4692 = this.field4692 * var2 + var3 * var5;
        this.field4694 = var2 * var6 - this.field4695 * var3;
        this.field4695 = this.field4695 * var2 + var3 * var6;
        this.field4697 = var2 * var7 - this.field4691 * var3;
        this.field4691 = this.field4691 * var2 + var3 * var7;
    }

    @ObfuscatedName("qu.ax(FFFI)V")
    public void method7464(float arg0, float arg1, float arg2) {
        this.field4697 += arg0;
        this.field4691 += arg1;
        this.field4699 += arg2;
    }

    public String toString() {
        return this.field4696 + "," + this.field4700 + "," + this.field4694 + "," + this.field4697 + "\n" + this.field4689 + "," + this.field4692 + "," + this.field4695 + "," + this.field4691 + "\n" + this.field4688 + "," + this.field4693 + "," + this.field4690 + "," + this.field4699;
    }
}
