package deob;

@ObfuscatedName("nq")
public class class390 {

    @ObfuscatedName("nq.s")
    public float field4405;

    @ObfuscatedName("nq.h")
    public float field4406;

    @ObfuscatedName("nq.w")
    public float field4407;

    @ObfuscatedName("nq.v")
    public float field4408;

    @ObfuscatedName("nq.c")
    public float field4414;

    @ObfuscatedName("nq.q")
    public float field4410;

    @ObfuscatedName("nq.i")
    public float field4411;

    @ObfuscatedName("nq.k")
    public float field4412;

    @ObfuscatedName("nq.o")
    public float field4417;

    @ObfuscatedName("nq.n")
    public float field4413;

    @ObfuscatedName("nq.d")
    public float field4415;

    @ObfuscatedName("nq.a")
    public float field4416;

    static {
        new class390();
    }

    public class390() {
        this.method6320();
    }

    @ObfuscatedName("nq.s(I)V")
    public void method6320() {
        this.field4416 = 0.0F;
        this.field4415 = 0.0F;
        this.field4413 = 0.0F;
        this.field4412 = 0.0F;
        this.field4411 = 0.0F;
        this.field4410 = 0.0F;
        this.field4408 = 0.0F;
        this.field4407 = 0.0F;
        this.field4406 = 0.0F;
        this.field4417 = 1.0F;
        this.field4414 = 1.0F;
        this.field4405 = 1.0F;
    }

    @ObfuscatedName("nq.h(FB)V")
    public void method6329(float arg0) {
        float var2 = (float) Math.cos((double) arg0);
        float var3 = (float) Math.sin((double) arg0);
        float var4 = this.field4406;
        float var5 = this.field4414;
        float var6 = this.field4412;
        float var7 = this.field4415;
        this.field4406 = var2 * var4 - this.field4407 * var3;
        this.field4407 = this.field4407 * var2 + var3 * var4;
        this.field4414 = var2 * var5 - this.field4410 * var3;
        this.field4410 = this.field4410 * var2 + var3 * var5;
        this.field4412 = var2 * var6 - this.field4417 * var3;
        this.field4417 = this.field4417 * var2 + var3 * var6;
        this.field4415 = var2 * var7 - this.field4416 * var3;
        this.field4416 = this.field4416 * var2 + var3 * var7;
    }

    @ObfuscatedName("nq.w(FI)V")
    public void method6322(float arg0) {
        float var2 = (float) Math.cos((double) arg0);
        float var3 = (float) Math.sin((double) arg0);
        float var4 = this.field4405;
        float var5 = this.field4408;
        float var6 = this.field4411;
        float var7 = this.field4413;
        this.field4405 = this.field4407 * var3 + var2 * var4;
        this.field4407 = this.field4407 * var2 - var3 * var4;
        this.field4408 = this.field4410 * var3 + var2 * var5;
        this.field4410 = this.field4410 * var2 - var3 * var5;
        this.field4411 = this.field4417 * var3 + var2 * var6;
        this.field4417 = this.field4417 * var2 - var3 * var6;
        this.field4413 = this.field4416 * var3 + var2 * var7;
        this.field4416 = this.field4416 * var2 - var3 * var7;
    }

    @ObfuscatedName("nq.v(FI)V")
    public void method6323(float arg0) {
        float var2 = (float) Math.cos((double) arg0);
        float var3 = (float) Math.sin((double) arg0);
        float var4 = this.field4405;
        float var5 = this.field4408;
        float var6 = this.field4411;
        float var7 = this.field4413;
        this.field4405 = var2 * var4 - this.field4406 * var3;
        this.field4406 = this.field4406 * var2 + var3 * var4;
        this.field4408 = var2 * var5 - this.field4414 * var3;
        this.field4414 = this.field4414 * var2 + var3 * var5;
        this.field4411 = var2 * var6 - this.field4412 * var3;
        this.field4412 = this.field4412 * var2 + var3 * var6;
        this.field4413 = var2 * var7 - this.field4415 * var3;
        this.field4415 = this.field4415 * var2 + var3 * var7;
    }

    @ObfuscatedName("nq.c(FFFI)V")
    public void method6338(float arg0, float arg1, float arg2) {
        this.field4413 += arg0;
        this.field4415 += arg1;
        this.field4416 += arg2;
    }

    public String toString() {
        return this.field4405 + "," + this.field4408 + "," + this.field4411 + "," + this.field4413 + "\n" + this.field4406 + "," + this.field4414 + "," + this.field4412 + "," + this.field4415 + "\n" + this.field4407 + "," + this.field4410 + "," + this.field4417 + "," + this.field4416;
    }
}
