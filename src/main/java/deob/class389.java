package deob;

@ObfuscatedName("nu")
public class class389 {

    @ObfuscatedName("nu.c")
    public float field4406;

    @ObfuscatedName("nu.v")
    public float field4401;

    @ObfuscatedName("nu.q")
    public float field4403;

    @ObfuscatedName("nu.f")
    public float field4410;

    @ObfuscatedName("nu.j")
    public float field4404;

    @ObfuscatedName("nu.e")
    public float field4409;

    @ObfuscatedName("nu.g")
    public float field4402;

    @ObfuscatedName("nu.w")
    public float field4408;

    @ObfuscatedName("nu.y")
    public float field4407;

    @ObfuscatedName("nu.i")
    public float field4405;

    @ObfuscatedName("nu.s")
    public float field4411;

    @ObfuscatedName("nu.t")
    public float field4412;

    static {
        new class389();
    }

    public class389() {
        this.method6394();
    }

    @ObfuscatedName("nu.c(I)V")
    public void method6394() {
        this.field4412 = 0.0F;
        this.field4411 = 0.0F;
        this.field4405 = 0.0F;
        this.field4408 = 0.0F;
        this.field4402 = 0.0F;
        this.field4409 = 0.0F;
        this.field4410 = 0.0F;
        this.field4403 = 0.0F;
        this.field4401 = 0.0F;
        this.field4407 = 1.0F;
        this.field4404 = 1.0F;
        this.field4406 = 1.0F;
    }

    @ObfuscatedName("nu.v(FI)V")
    public void method6401(float arg0) {
        float var2 = (float) Math.cos((double) arg0);
        float var3 = (float) Math.sin((double) arg0);
        float var4 = this.field4401;
        float var5 = this.field4404;
        float var6 = this.field4408;
        float var7 = this.field4411;
        this.field4401 = var2 * var4 - this.field4403 * var3;
        this.field4403 = this.field4403 * var2 + var3 * var4;
        this.field4404 = var2 * var5 - this.field4409 * var3;
        this.field4409 = this.field4409 * var2 + var3 * var5;
        this.field4408 = var2 * var6 - this.field4407 * var3;
        this.field4407 = this.field4407 * var2 + var3 * var6;
        this.field4411 = var2 * var7 - this.field4412 * var3;
        this.field4412 = this.field4412 * var2 + var3 * var7;
    }

    @ObfuscatedName("nu.q(FI)V")
    public void method6399(float arg0) {
        float var2 = (float) Math.cos((double) arg0);
        float var3 = (float) Math.sin((double) arg0);
        float var4 = this.field4406;
        float var5 = this.field4410;
        float var6 = this.field4402;
        float var7 = this.field4405;
        this.field4406 = this.field4403 * var3 + var2 * var4;
        this.field4403 = this.field4403 * var2 - var3 * var4;
        this.field4410 = this.field4409 * var3 + var2 * var5;
        this.field4409 = this.field4409 * var2 - var3 * var5;
        this.field4402 = this.field4407 * var3 + var2 * var6;
        this.field4407 = this.field4407 * var2 - var3 * var6;
        this.field4405 = this.field4412 * var3 + var2 * var7;
        this.field4412 = this.field4412 * var2 - var3 * var7;
    }

    @ObfuscatedName("nu.f(FI)V")
    public void method6411(float arg0) {
        float var2 = (float) Math.cos((double) arg0);
        float var3 = (float) Math.sin((double) arg0);
        float var4 = this.field4406;
        float var5 = this.field4410;
        float var6 = this.field4402;
        float var7 = this.field4405;
        this.field4406 = var2 * var4 - this.field4401 * var3;
        this.field4401 = this.field4401 * var2 + var3 * var4;
        this.field4410 = var2 * var5 - this.field4404 * var3;
        this.field4404 = this.field4404 * var2 + var3 * var5;
        this.field4402 = var2 * var6 - this.field4408 * var3;
        this.field4408 = this.field4408 * var2 + var3 * var6;
        this.field4405 = var2 * var7 - this.field4411 * var3;
        this.field4411 = this.field4411 * var2 + var3 * var7;
    }

    @ObfuscatedName("nu.j(FFFI)V")
    public void method6398(float arg0, float arg1, float arg2) {
        this.field4405 += arg0;
        this.field4411 += arg1;
        this.field4412 += arg2;
    }

    public String toString() {
        return this.field4406 + "," + this.field4410 + "," + this.field4402 + "," + this.field4405 + "\n" + this.field4401 + "," + this.field4404 + "," + this.field4408 + "," + this.field4411 + "\n" + this.field4403 + "," + this.field4409 + "," + this.field4407 + "," + this.field4412;
    }
}
