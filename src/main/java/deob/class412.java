package deob;

@ObfuscatedName("oc")
public class class412 {

    @ObfuscatedName("oc.h")
    public float field4625;

    @ObfuscatedName("oc.e")
    public float field4618;

    @ObfuscatedName("oc.v")
    public float field4619;

    @ObfuscatedName("oc.x")
    public float field4626;

    @ObfuscatedName("oc.m")
    public float field4621;

    @ObfuscatedName("oc.q")
    public float field4622;

    @ObfuscatedName("oc.f")
    public float field4623;

    @ObfuscatedName("oc.r")
    public float field4624;

    @ObfuscatedName("oc.u")
    public float field4617;

    @ObfuscatedName("oc.b")
    public float field4628;

    @ObfuscatedName("oc.j")
    public float field4627;

    @ObfuscatedName("oc.g")
    public float field4620;

    static {
        new class412();
    }

    public class412() {
        this.method7135();
    }

    @ObfuscatedName("oc.h(B)V")
    public void method7135() {
        this.field4620 = 0.0F;
        this.field4627 = 0.0F;
        this.field4628 = 0.0F;
        this.field4624 = 0.0F;
        this.field4623 = 0.0F;
        this.field4622 = 0.0F;
        this.field4626 = 0.0F;
        this.field4619 = 0.0F;
        this.field4618 = 0.0F;
        this.field4617 = 1.0F;
        this.field4621 = 1.0F;
        this.field4625 = 1.0F;
    }

    @ObfuscatedName("oc.e(FB)V")
    public void method7133(float arg0) {
        float var2 = (float) Math.cos((double) arg0);
        float var3 = (float) Math.sin((double) arg0);
        float var4 = this.field4618;
        float var5 = this.field4621;
        float var6 = this.field4624;
        float var7 = this.field4627;
        this.field4618 = var2 * var4 - this.field4619 * var3;
        this.field4619 = this.field4619 * var2 + var3 * var4;
        this.field4621 = var2 * var5 - this.field4622 * var3;
        this.field4622 = this.field4622 * var2 + var3 * var5;
        this.field4624 = var2 * var6 - this.field4617 * var3;
        this.field4617 = this.field4617 * var2 + var3 * var6;
        this.field4627 = var2 * var7 - this.field4620 * var3;
        this.field4620 = this.field4620 * var2 + var3 * var7;
    }

    @ObfuscatedName("oc.v(FB)V")
    public void method7134(float arg0) {
        float var2 = (float) Math.cos((double) arg0);
        float var3 = (float) Math.sin((double) arg0);
        float var4 = this.field4625;
        float var5 = this.field4626;
        float var6 = this.field4623;
        float var7 = this.field4628;
        this.field4625 = this.field4619 * var3 + var2 * var4;
        this.field4619 = this.field4619 * var2 - var3 * var4;
        this.field4626 = this.field4622 * var3 + var2 * var5;
        this.field4622 = this.field4622 * var2 - var3 * var5;
        this.field4623 = this.field4617 * var3 + var2 * var6;
        this.field4617 = this.field4617 * var2 - var3 * var6;
        this.field4628 = this.field4620 * var3 + var2 * var7;
        this.field4620 = this.field4620 * var2 - var3 * var7;
    }

    @ObfuscatedName("oc.x(FI)V")
    public void method7138(float arg0) {
        float var2 = (float) Math.cos((double) arg0);
        float var3 = (float) Math.sin((double) arg0);
        float var4 = this.field4625;
        float var5 = this.field4626;
        float var6 = this.field4623;
        float var7 = this.field4628;
        this.field4625 = var2 * var4 - this.field4618 * var3;
        this.field4618 = this.field4618 * var2 + var3 * var4;
        this.field4626 = var2 * var5 - this.field4621 * var3;
        this.field4621 = this.field4621 * var2 + var3 * var5;
        this.field4623 = var2 * var6 - this.field4624 * var3;
        this.field4624 = this.field4624 * var2 + var3 * var6;
        this.field4628 = var2 * var7 - this.field4627 * var3;
        this.field4627 = this.field4627 * var2 + var3 * var7;
    }

    @ObfuscatedName("oc.m(FFFB)V")
    public void method7136(float arg0, float arg1, float arg2) {
        this.field4628 += arg0;
        this.field4627 += arg1;
        this.field4620 += arg2;
    }

    public String toString() {
        return this.field4625 + "," + this.field4626 + "," + this.field4623 + "," + this.field4628 + "\n" + this.field4618 + "," + this.field4621 + "," + this.field4624 + "," + this.field4627 + "\n" + this.field4619 + "," + this.field4622 + "," + this.field4617 + "," + this.field4620;
    }
}
