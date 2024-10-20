package deob;

@ObfuscatedName("ng")
public class class373 {

    @ObfuscatedName("ng.c")
    public float field4257;

    @ObfuscatedName("ng.l")
    public float field4254;

    @ObfuscatedName("ng.s")
    public float field4248;

    @ObfuscatedName("ng.e")
    public float field4249;

    @ObfuscatedName("ng.r")
    public float field4246;

    @ObfuscatedName("ng.o")
    public float field4250;

    @ObfuscatedName("ng.i")
    public float field4252;

    @ObfuscatedName("ng.w")
    public float field4253;

    @ObfuscatedName("ng.v")
    public float field4255;

    @ObfuscatedName("ng.a")
    public float field4251;

    @ObfuscatedName("ng.y")
    public float field4256;

    @ObfuscatedName("ng.u")
    public float field4247;

    static {
        new class373();
    }

    public class373() {
        this.method6078();
    }

    @ObfuscatedName("ng.c(I)V")
    public void method6078() {
        this.field4247 = 0.0F;
        this.field4256 = 0.0F;
        this.field4251 = 0.0F;
        this.field4253 = 0.0F;
        this.field4252 = 0.0F;
        this.field4250 = 0.0F;
        this.field4249 = 0.0F;
        this.field4248 = 0.0F;
        this.field4254 = 0.0F;
        this.field4255 = 1.0F;
        this.field4246 = 1.0F;
        this.field4257 = 1.0F;
    }

    @ObfuscatedName("ng.l(FI)V")
    public void method6086(float arg0) {
        float var2 = (float) Math.cos((double) arg0);
        float var3 = (float) Math.sin((double) arg0);
        float var4 = this.field4254;
        float var5 = this.field4246;
        float var6 = this.field4253;
        float var7 = this.field4256;
        this.field4254 = var2 * var4 - this.field4248 * var3;
        this.field4248 = this.field4248 * var2 + var3 * var4;
        this.field4246 = var2 * var5 - this.field4250 * var3;
        this.field4250 = this.field4250 * var2 + var3 * var5;
        this.field4253 = var2 * var6 - this.field4255 * var3;
        this.field4255 = this.field4255 * var2 + var3 * var6;
        this.field4256 = var2 * var7 - this.field4247 * var3;
        this.field4247 = this.field4247 * var2 + var3 * var7;
    }

    @ObfuscatedName("ng.s(FB)V")
    public void method6080(float arg0) {
        float var2 = (float) Math.cos((double) arg0);
        float var3 = (float) Math.sin((double) arg0);
        float var4 = this.field4257;
        float var5 = this.field4249;
        float var6 = this.field4252;
        float var7 = this.field4251;
        this.field4257 = this.field4248 * var3 + var2 * var4;
        this.field4248 = this.field4248 * var2 - var3 * var4;
        this.field4249 = this.field4250 * var3 + var2 * var5;
        this.field4250 = this.field4250 * var2 - var3 * var5;
        this.field4252 = this.field4255 * var3 + var2 * var6;
        this.field4255 = this.field4255 * var2 - var3 * var6;
        this.field4251 = this.field4247 * var3 + var2 * var7;
        this.field4247 = this.field4247 * var2 - var3 * var7;
    }

    @ObfuscatedName("ng.e(FS)V")
    public void method6081(float arg0) {
        float var2 = (float) Math.cos((double) arg0);
        float var3 = (float) Math.sin((double) arg0);
        float var4 = this.field4257;
        float var5 = this.field4249;
        float var6 = this.field4252;
        float var7 = this.field4251;
        this.field4257 = var2 * var4 - this.field4254 * var3;
        this.field4254 = this.field4254 * var2 + var3 * var4;
        this.field4249 = var2 * var5 - this.field4246 * var3;
        this.field4246 = this.field4246 * var2 + var3 * var5;
        this.field4252 = var2 * var6 - this.field4253 * var3;
        this.field4253 = this.field4253 * var2 + var3 * var6;
        this.field4251 = var2 * var7 - this.field4256 * var3;
        this.field4256 = this.field4256 * var2 + var3 * var7;
    }

    @ObfuscatedName("ng.r(FFFI)V")
    public void method6082(float arg0, float arg1, float arg2) {
        this.field4251 += arg0;
        this.field4256 += arg1;
        this.field4247 += arg2;
    }

    public String toString() {
        return this.field4257 + "," + this.field4249 + "," + this.field4252 + "," + this.field4251 + "\n" + this.field4254 + "," + this.field4246 + "," + this.field4253 + "," + this.field4256 + "\n" + this.field4248 + "," + this.field4250 + "," + this.field4255 + "," + this.field4247;
    }
}
