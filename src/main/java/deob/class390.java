package deob;

@ObfuscatedName("nt")
public class class390 {

    @ObfuscatedName("nt.o")
    public float field4411;

    @ObfuscatedName("nt.q")
    public float field4406;

    @ObfuscatedName("nt.l")
    public float field4407;

    @ObfuscatedName("nt.k")
    public float field4408;

    @ObfuscatedName("nt.a")
    public float field4410;

    @ObfuscatedName("nt.m")
    public float field4413;

    @ObfuscatedName("nt.p")
    public float field4414;

    @ObfuscatedName("nt.s")
    public float field4412;

    @ObfuscatedName("nt.r")
    public float field4405;

    @ObfuscatedName("nt.v")
    public float field4409;

    @ObfuscatedName("nt.y")
    public float field4415;

    @ObfuscatedName("nt.c")
    public float field4416;

    static {
        new class390();
    }

    public class390() {
        this.method6303();
    }

    @ObfuscatedName("nt.o(I)V")
    public void method6303() {
        this.field4416 = 0.0F;
        this.field4415 = 0.0F;
        this.field4409 = 0.0F;
        this.field4412 = 0.0F;
        this.field4414 = 0.0F;
        this.field4413 = 0.0F;
        this.field4408 = 0.0F;
        this.field4407 = 0.0F;
        this.field4406 = 0.0F;
        this.field4405 = 1.0F;
        this.field4410 = 1.0F;
        this.field4411 = 1.0F;
    }

    @ObfuscatedName("nt.q(FI)V")
    public void method6304(float arg0) {
        float var2 = (float) Math.cos((double) arg0);
        float var3 = (float) Math.sin((double) arg0);
        float var4 = this.field4406;
        float var5 = this.field4410;
        float var6 = this.field4412;
        float var7 = this.field4415;
        this.field4406 = var2 * var4 - this.field4407 * var3;
        this.field4407 = this.field4407 * var2 + var3 * var4;
        this.field4410 = var2 * var5 - this.field4413 * var3;
        this.field4413 = this.field4413 * var2 + var3 * var5;
        this.field4412 = var2 * var6 - this.field4405 * var3;
        this.field4405 = this.field4405 * var2 + var3 * var6;
        this.field4415 = var2 * var7 - this.field4416 * var3;
        this.field4416 = this.field4416 * var2 + var3 * var7;
    }

    @ObfuscatedName("nt.l(FI)V")
    public void method6305(float arg0) {
        float var2 = (float) Math.cos((double) arg0);
        float var3 = (float) Math.sin((double) arg0);
        float var4 = this.field4411;
        float var5 = this.field4408;
        float var6 = this.field4414;
        float var7 = this.field4409;
        this.field4411 = this.field4407 * var3 + var2 * var4;
        this.field4407 = this.field4407 * var2 - var3 * var4;
        this.field4408 = this.field4413 * var3 + var2 * var5;
        this.field4413 = this.field4413 * var2 - var3 * var5;
        this.field4414 = this.field4405 * var3 + var2 * var6;
        this.field4405 = this.field4405 * var2 - var3 * var6;
        this.field4409 = this.field4416 * var3 + var2 * var7;
        this.field4416 = this.field4416 * var2 - var3 * var7;
    }

    @ObfuscatedName("nt.k(FI)V")
    public void method6306(float arg0) {
        float var2 = (float) Math.cos((double) arg0);
        float var3 = (float) Math.sin((double) arg0);
        float var4 = this.field4411;
        float var5 = this.field4408;
        float var6 = this.field4414;
        float var7 = this.field4409;
        this.field4411 = var2 * var4 - this.field4406 * var3;
        this.field4406 = this.field4406 * var2 + var3 * var4;
        this.field4408 = var2 * var5 - this.field4410 * var3;
        this.field4410 = this.field4410 * var2 + var3 * var5;
        this.field4414 = var2 * var6 - this.field4412 * var3;
        this.field4412 = this.field4412 * var2 + var3 * var6;
        this.field4409 = var2 * var7 - this.field4415 * var3;
        this.field4415 = this.field4415 * var2 + var3 * var7;
    }

    @ObfuscatedName("nt.a(FFFI)V")
    public void method6314(float arg0, float arg1, float arg2) {
        this.field4409 += arg0;
        this.field4415 += arg1;
        this.field4416 += arg2;
    }

    public String toString() {
        return this.field4411 + "," + this.field4408 + "," + this.field4414 + "," + this.field4409 + "\n" + this.field4406 + "," + this.field4410 + "," + this.field4412 + "," + this.field4415 + "\n" + this.field4407 + "," + this.field4413 + "," + this.field4405 + "," + this.field4416;
    }
}
