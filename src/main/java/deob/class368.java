package deob;

@ObfuscatedName("nu")
public class class368 {

    @ObfuscatedName("nu.c")
    public float field4198;

    @ObfuscatedName("nu.b")
    public float field4199;

    @ObfuscatedName("nu.p")
    public float field4200;

    @ObfuscatedName("nu.m")
    public float field4201;

    @ObfuscatedName("nu.t")
    public float field4202;

    @ObfuscatedName("nu.s")
    public float field4203;

    @ObfuscatedName("nu.j")
    public float field4205;

    @ObfuscatedName("nu.w")
    public float field4204;

    @ObfuscatedName("nu.n")
    public float field4206;

    @ObfuscatedName("nu.r")
    public float field4207;

    @ObfuscatedName("nu.o")
    public float field4208;

    @ObfuscatedName("nu.v")
    public float field4209;

    static {
        new class368();
    }

    public class368() {
        this.method6096();
    }

    @ObfuscatedName("nu.c(I)V")
    public void method6096() {
        this.field4209 = 0.0F;
        this.field4208 = 0.0F;
        this.field4207 = 0.0F;
        this.field4204 = 0.0F;
        this.field4205 = 0.0F;
        this.field4203 = 0.0F;
        this.field4201 = 0.0F;
        this.field4200 = 0.0F;
        this.field4199 = 0.0F;
        this.field4206 = 1.0F;
        this.field4202 = 1.0F;
        this.field4198 = 1.0F;
    }

    @ObfuscatedName("nu.b(FI)V")
    public void method6089(float arg0) {
        float var2 = (float) Math.cos((double) arg0);
        float var3 = (float) Math.sin((double) arg0);
        float var4 = this.field4199;
        float var5 = this.field4202;
        float var6 = this.field4204;
        float var7 = this.field4208;
        this.field4199 = var2 * var4 - this.field4200 * var3;
        this.field4200 = this.field4200 * var2 + var3 * var4;
        this.field4202 = var2 * var5 - this.field4203 * var3;
        this.field4203 = this.field4203 * var2 + var3 * var5;
        this.field4204 = var2 * var6 - this.field4206 * var3;
        this.field4206 = this.field4206 * var2 + var3 * var6;
        this.field4208 = var2 * var7 - this.field4209 * var3;
        this.field4209 = this.field4209 * var2 + var3 * var7;
    }

    @ObfuscatedName("nu.p(FI)V")
    public void method6074(float arg0) {
        float var2 = (float) Math.cos((double) arg0);
        float var3 = (float) Math.sin((double) arg0);
        float var4 = this.field4198;
        float var5 = this.field4201;
        float var6 = this.field4205;
        float var7 = this.field4207;
        this.field4198 = this.field4200 * var3 + var2 * var4;
        this.field4200 = this.field4200 * var2 - var3 * var4;
        this.field4201 = this.field4203 * var3 + var2 * var5;
        this.field4203 = this.field4203 * var2 - var3 * var5;
        this.field4205 = this.field4206 * var3 + var2 * var6;
        this.field4206 = this.field4206 * var2 - var3 * var6;
        this.field4207 = this.field4209 * var3 + var2 * var7;
        this.field4209 = this.field4209 * var2 - var3 * var7;
    }

    @ObfuscatedName("nu.m(FI)V")
    public void method6075(float arg0) {
        float var2 = (float) Math.cos((double) arg0);
        float var3 = (float) Math.sin((double) arg0);
        float var4 = this.field4198;
        float var5 = this.field4201;
        float var6 = this.field4205;
        float var7 = this.field4207;
        this.field4198 = var2 * var4 - this.field4199 * var3;
        this.field4199 = this.field4199 * var2 + var3 * var4;
        this.field4201 = var2 * var5 - this.field4202 * var3;
        this.field4202 = this.field4202 * var2 + var3 * var5;
        this.field4205 = var2 * var6 - this.field4204 * var3;
        this.field4204 = this.field4204 * var2 + var3 * var6;
        this.field4207 = var2 * var7 - this.field4208 * var3;
        this.field4208 = this.field4208 * var2 + var3 * var7;
    }

    @ObfuscatedName("nu.t(FFFB)V")
    public void method6076(float arg0, float arg1, float arg2) {
        this.field4207 += arg0;
        this.field4208 += arg1;
        this.field4209 += arg2;
    }

    public String toString() {
        return this.field4198 + "," + this.field4201 + "," + this.field4205 + "," + this.field4207 + "\n" + this.field4199 + "," + this.field4202 + "," + this.field4204 + "," + this.field4208 + "\n" + this.field4200 + "," + this.field4203 + "," + this.field4206 + "," + this.field4209;
    }
}
