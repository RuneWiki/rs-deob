package deob;

@ObfuscatedName("ox")
public class class409 {

    @ObfuscatedName("ox.a")
    public float field4577;

    @ObfuscatedName("ox.f")
    public float field4571;

    @ObfuscatedName("ox.c")
    public float field4572;

    @ObfuscatedName("ox.x")
    public float field4570;

    @ObfuscatedName("ox.h")
    public float field4574;

    @ObfuscatedName("ox.j")
    public float field4575;

    @ObfuscatedName("ox.y")
    public float field4576;

    @ObfuscatedName("ox.d")
    public float field4573;

    @ObfuscatedName("ox.n")
    public float field4578;

    @ObfuscatedName("ox.r")
    public float field4579;

    @ObfuscatedName("ox.l")
    public float field4580;

    @ObfuscatedName("ox.s")
    public float field4581;

    static {
        new class409();
    }

    public class409() {
        this.method7073();
    }

    @ObfuscatedName("ox.a(I)V")
    public void method7073() {
        this.field4581 = 0.0F;
        this.field4580 = 0.0F;
        this.field4579 = 0.0F;
        this.field4573 = 0.0F;
        this.field4576 = 0.0F;
        this.field4575 = 0.0F;
        this.field4570 = 0.0F;
        this.field4572 = 0.0F;
        this.field4571 = 0.0F;
        this.field4578 = 1.0F;
        this.field4574 = 1.0F;
        this.field4577 = 1.0F;
    }

    @ObfuscatedName("ox.f(FB)V")
    public void method7072(float arg0) {
        float var2 = (float) Math.cos((double) arg0);
        float var3 = (float) Math.sin((double) arg0);
        float var4 = this.field4571;
        float var5 = this.field4574;
        float var6 = this.field4573;
        float var7 = this.field4580;
        this.field4571 = var2 * var4 - this.field4572 * var3;
        this.field4572 = this.field4572 * var2 + var3 * var4;
        this.field4574 = var2 * var5 - this.field4575 * var3;
        this.field4575 = this.field4575 * var2 + var3 * var5;
        this.field4573 = var2 * var6 - this.field4578 * var3;
        this.field4578 = this.field4578 * var2 + var3 * var6;
        this.field4580 = var2 * var7 - this.field4581 * var3;
        this.field4581 = this.field4581 * var2 + var3 * var7;
    }

    @ObfuscatedName("ox.c(FI)V")
    public void method7090(float arg0) {
        float var2 = (float) Math.cos((double) arg0);
        float var3 = (float) Math.sin((double) arg0);
        float var4 = this.field4577;
        float var5 = this.field4570;
        float var6 = this.field4576;
        float var7 = this.field4579;
        this.field4577 = this.field4572 * var3 + var2 * var4;
        this.field4572 = this.field4572 * var2 - var3 * var4;
        this.field4570 = this.field4575 * var3 + var2 * var5;
        this.field4575 = this.field4575 * var2 - var3 * var5;
        this.field4576 = this.field4578 * var3 + var2 * var6;
        this.field4578 = this.field4578 * var2 - var3 * var6;
        this.field4579 = this.field4581 * var3 + var2 * var7;
        this.field4581 = this.field4581 * var2 - var3 * var7;
    }

    @ObfuscatedName("ox.x(FB)V")
    public void method7091(float arg0) {
        float var2 = (float) Math.cos((double) arg0);
        float var3 = (float) Math.sin((double) arg0);
        float var4 = this.field4577;
        float var5 = this.field4570;
        float var6 = this.field4576;
        float var7 = this.field4579;
        this.field4577 = var2 * var4 - this.field4571 * var3;
        this.field4571 = this.field4571 * var2 + var3 * var4;
        this.field4570 = var2 * var5 - this.field4574 * var3;
        this.field4574 = this.field4574 * var2 + var3 * var5;
        this.field4576 = var2 * var6 - this.field4573 * var3;
        this.field4573 = this.field4573 * var2 + var3 * var6;
        this.field4579 = var2 * var7 - this.field4580 * var3;
        this.field4580 = this.field4580 * var2 + var3 * var7;
    }

    @ObfuscatedName("ox.h(FFFI)V")
    public void method7074(float arg0, float arg1, float arg2) {
        this.field4579 += arg0;
        this.field4580 += arg1;
        this.field4581 += arg2;
    }

    public String toString() {
        return this.field4577 + "," + this.field4570 + "," + this.field4576 + "," + this.field4579 + "\n" + this.field4571 + "," + this.field4574 + "," + this.field4573 + "," + this.field4580 + "\n" + this.field4572 + "," + this.field4575 + "," + this.field4578 + "," + this.field4581;
    }
}
