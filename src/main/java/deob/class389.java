package deob;

@ObfuscatedName("nb")
public class class389 {

    @ObfuscatedName("nb.v")
    public float field4356;

    @ObfuscatedName("nb.c")
    public float field4358;

    @ObfuscatedName("nb.i")
    public float field4354;

    @ObfuscatedName("nb.f")
    public float field4355;

    @ObfuscatedName("nb.b")
    public float field4353;

    @ObfuscatedName("nb.n")
    public float field4357;

    @ObfuscatedName("nb.s")
    public float field4352;

    @ObfuscatedName("nb.l")
    public float field4361;

    @ObfuscatedName("nb.q")
    public float field4360;

    @ObfuscatedName("nb.o")
    public float field4363;

    @ObfuscatedName("nb.r")
    public float field4362;

    @ObfuscatedName("nb.p")
    public float field4359;

    static {
        new class389();
    }

    public class389() {
        this.method6416();
    }

    @ObfuscatedName("nb.v(I)V")
    public void method6416() {
        this.field4359 = 0.0F;
        this.field4362 = 0.0F;
        this.field4363 = 0.0F;
        this.field4361 = 0.0F;
        this.field4352 = 0.0F;
        this.field4357 = 0.0F;
        this.field4355 = 0.0F;
        this.field4354 = 0.0F;
        this.field4358 = 0.0F;
        this.field4360 = 1.0F;
        this.field4353 = 1.0F;
        this.field4356 = 1.0F;
    }

    @ObfuscatedName("nb.c(FB)V")
    public void method6417(float arg0) {
        float var2 = (float) Math.cos((double) arg0);
        float var3 = (float) Math.sin((double) arg0);
        float var4 = this.field4358;
        float var5 = this.field4353;
        float var6 = this.field4361;
        float var7 = this.field4362;
        this.field4358 = var2 * var4 - this.field4354 * var3;
        this.field4354 = this.field4354 * var2 + var3 * var4;
        this.field4353 = var2 * var5 - this.field4357 * var3;
        this.field4357 = this.field4357 * var2 + var3 * var5;
        this.field4361 = var2 * var6 - this.field4360 * var3;
        this.field4360 = this.field4360 * var2 + var3 * var6;
        this.field4362 = var2 * var7 - this.field4359 * var3;
        this.field4359 = this.field4359 * var2 + var3 * var7;
    }

    @ObfuscatedName("nb.i(FI)V")
    public void method6422(float arg0) {
        float var2 = (float) Math.cos((double) arg0);
        float var3 = (float) Math.sin((double) arg0);
        float var4 = this.field4356;
        float var5 = this.field4355;
        float var6 = this.field4352;
        float var7 = this.field4363;
        this.field4356 = this.field4354 * var3 + var2 * var4;
        this.field4354 = this.field4354 * var2 - var3 * var4;
        this.field4355 = this.field4357 * var3 + var2 * var5;
        this.field4357 = this.field4357 * var2 - var3 * var5;
        this.field4352 = this.field4360 * var3 + var2 * var6;
        this.field4360 = this.field4360 * var2 - var3 * var6;
        this.field4363 = this.field4359 * var3 + var2 * var7;
        this.field4359 = this.field4359 * var2 - var3 * var7;
    }

    @ObfuscatedName("nb.f(FS)V")
    public void method6421(float arg0) {
        float var2 = (float) Math.cos((double) arg0);
        float var3 = (float) Math.sin((double) arg0);
        float var4 = this.field4356;
        float var5 = this.field4355;
        float var6 = this.field4352;
        float var7 = this.field4363;
        this.field4356 = var2 * var4 - this.field4358 * var3;
        this.field4358 = this.field4358 * var2 + var3 * var4;
        this.field4355 = var2 * var5 - this.field4353 * var3;
        this.field4353 = this.field4353 * var2 + var3 * var5;
        this.field4352 = var2 * var6 - this.field4361 * var3;
        this.field4361 = this.field4361 * var2 + var3 * var6;
        this.field4363 = var2 * var7 - this.field4362 * var3;
        this.field4362 = this.field4362 * var2 + var3 * var7;
    }

    @ObfuscatedName("nb.b(FFFI)V")
    public void method6430(float arg0, float arg1, float arg2) {
        this.field4363 += arg0;
        this.field4362 += arg1;
        this.field4359 += arg2;
    }

    public String toString() {
        return this.field4356 + "," + this.field4355 + "," + this.field4352 + "," + this.field4363 + "\n" + this.field4358 + "," + this.field4353 + "," + this.field4361 + "," + this.field4362 + "\n" + this.field4354 + "," + this.field4357 + "," + this.field4360 + "," + this.field4359;
    }
}
