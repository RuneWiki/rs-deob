package deob;

@ObfuscatedName("od")
public class class391 {

    @ObfuscatedName("od.c")
    public float field4449;

    @ObfuscatedName("od.p")
    public float field4453;

    @ObfuscatedName("od.f")
    public float field4445;

    @ObfuscatedName("od.n")
    public float field4451;

    @ObfuscatedName("od.k")
    public float field4447;

    @ObfuscatedName("od.w")
    public float field4448;

    @ObfuscatedName("od.s")
    public float field4443;

    @ObfuscatedName("od.q")
    public float field4450;

    @ObfuscatedName("od.m")
    public float field4444;

    @ObfuscatedName("od.x")
    public float field4452;

    @ObfuscatedName("od.j")
    public float field4446;

    @ObfuscatedName("od.v")
    public float field4454;

    static {
        new class391();
    }

    public class391() {
        this.method6562();
    }

    @ObfuscatedName("od.c(I)V")
    public void method6562() {
        this.field4454 = 0.0F;
        this.field4446 = 0.0F;
        this.field4452 = 0.0F;
        this.field4450 = 0.0F;
        this.field4443 = 0.0F;
        this.field4448 = 0.0F;
        this.field4451 = 0.0F;
        this.field4445 = 0.0F;
        this.field4453 = 0.0F;
        this.field4444 = 1.0F;
        this.field4447 = 1.0F;
        this.field4449 = 1.0F;
    }

    @ObfuscatedName("od.p(FI)V")
    public void method6569(float arg0) {
        float var2 = (float) Math.cos((double) arg0);
        float var3 = (float) Math.sin((double) arg0);
        float var4 = this.field4453;
        float var5 = this.field4447;
        float var6 = this.field4450;
        float var7 = this.field4446;
        this.field4453 = var2 * var4 - this.field4445 * var3;
        this.field4445 = this.field4445 * var2 + var3 * var4;
        this.field4447 = var2 * var5 - this.field4448 * var3;
        this.field4448 = this.field4448 * var2 + var3 * var5;
        this.field4450 = var2 * var6 - this.field4444 * var3;
        this.field4444 = this.field4444 * var2 + var3 * var6;
        this.field4446 = var2 * var7 - this.field4454 * var3;
        this.field4454 = this.field4454 * var2 + var3 * var7;
    }

    @ObfuscatedName("od.f(FB)V")
    public void method6564(float arg0) {
        float var2 = (float) Math.cos((double) arg0);
        float var3 = (float) Math.sin((double) arg0);
        float var4 = this.field4449;
        float var5 = this.field4451;
        float var6 = this.field4443;
        float var7 = this.field4452;
        this.field4449 = this.field4445 * var3 + var2 * var4;
        this.field4445 = this.field4445 * var2 - var3 * var4;
        this.field4451 = this.field4448 * var3 + var2 * var5;
        this.field4448 = this.field4448 * var2 - var3 * var5;
        this.field4443 = this.field4444 * var3 + var2 * var6;
        this.field4444 = this.field4444 * var2 - var3 * var6;
        this.field4452 = this.field4454 * var3 + var2 * var7;
        this.field4454 = this.field4454 * var2 - var3 * var7;
    }

    @ObfuscatedName("od.n(FI)V")
    public void method6565(float arg0) {
        float var2 = (float) Math.cos((double) arg0);
        float var3 = (float) Math.sin((double) arg0);
        float var4 = this.field4449;
        float var5 = this.field4451;
        float var6 = this.field4443;
        float var7 = this.field4452;
        this.field4449 = var2 * var4 - this.field4453 * var3;
        this.field4453 = this.field4453 * var2 + var3 * var4;
        this.field4451 = var2 * var5 - this.field4447 * var3;
        this.field4447 = this.field4447 * var2 + var3 * var5;
        this.field4443 = var2 * var6 - this.field4450 * var3;
        this.field4450 = this.field4450 * var2 + var3 * var6;
        this.field4452 = var2 * var7 - this.field4446 * var3;
        this.field4446 = this.field4446 * var2 + var3 * var7;
    }

    @ObfuscatedName("od.k(FFFI)V")
    public void method6566(float arg0, float arg1, float arg2) {
        this.field4452 += arg0;
        this.field4446 += arg1;
        this.field4454 += arg2;
    }

    public String toString() {
        return this.field4449 + "," + this.field4451 + "," + this.field4443 + "," + this.field4452 + "\n" + this.field4453 + "," + this.field4447 + "," + this.field4450 + "," + this.field4446 + "\n" + this.field4445 + "," + this.field4448 + "," + this.field4444 + "," + this.field4454;
    }
}
