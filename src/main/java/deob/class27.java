package deob;

@ObfuscatedName("ak")
public class class27 implements class44 {

    @ObfuscatedName("ak.d")
    public int field391;

    @ObfuscatedName("ak.z")
    public int field398;

    @ObfuscatedName("ak.n")
    public int field385;

    @ObfuscatedName("ak.r")
    public int field384;

    @ObfuscatedName("ak.e")
    public int field387;

    @ObfuscatedName("ak.y")
    public int field383;

    @ObfuscatedName("ak.k")
    public int field386;

    @ObfuscatedName("ak.s")
    public int field390;

    @ObfuscatedName("ak.p")
    public int field396;

    @ObfuscatedName("ak.x")
    public int field389;

    @ObfuscatedName("ak.m")
    public int field393;

    @ObfuscatedName("ak.h")
    public int field394;

    @ObfuscatedName("ak.t")
    public int field395;

    @ObfuscatedName("ak.i")
    public int field392;

    @ObfuscatedName("ak.d(Lal;B)V")
    public void method185(class33 arg0) {
        if (arg0.field460 > this.field387) {
            arg0.field460 = this.field387;
        }
        if (arg0.field461 < this.field387) {
            arg0.field461 = this.field387;
        }
        if (arg0.field454 > this.field383) {
            arg0.field454 = this.field383;
        }
        if (arg0.field463 < this.field383) {
            arg0.field463 = this.field383;
        }
    }

    @ObfuscatedName("ak.z(IIII)Z")
    public boolean method186(int arg0, int arg1, int arg2) {
        if (arg0 >= this.field391 && arg0 < this.field398 + this.field391) {
            return arg1 >= (this.field386 << 3) + (this.field385 << 6) && arg1 <= (this.field396 << 3) + (this.field385 << 6) + 7 && arg2 >= (this.field390 << 3) + (this.field384 << 6) && arg2 <= (this.field389 << 3) + (this.field384 << 6) + 7;
        } else {
            return false;
        }
    }

    @ObfuscatedName("ak.n(IIB)Z")
    public boolean method187(int arg0, int arg1) {
        return arg0 >= (this.field393 << 3) + (this.field387 << 6) && arg0 <= (this.field395 << 3) + (this.field387 << 6) + 7 && arg1 >= (this.field394 << 3) + (this.field383 << 6) && arg1 <= (this.field392 << 3) + (this.field383 << 6) + 7;
    }

    @ObfuscatedName("ak.r(IIII)[I")
    public int[] method207(int arg0, int arg1, int arg2) {
        return this.method186(arg0, arg1, arg2) ? new int[] { this.field393 * 8 - this.field386 * 8 + this.field387 * 64 - this.field385 * 64 + arg1, this.field394 * 8 - this.field390 * 8 + this.field383 * 64 - this.field384 * 64 + arg2 } : null;
    }

    @ObfuscatedName("ak.e(III)Lic;")
    public class239 method191(int arg0, int arg1) {
        if (this.method187(arg0, arg1)) {
            int var3 = this.field386 * 8 - this.field393 * 8 + this.field385 * 64 - this.field387 * 64 + arg0;
            int var4 = this.field390 * 8 - this.field394 * 8 + this.field384 * 64 - this.field383 * 64 + arg1;
            return new class239(this.field391, var3, var4);
        } else {
            return null;
        }
    }

    @ObfuscatedName("ak.y(Lgy;I)V")
    public void method190(class195 arg0) {
        this.field391 = arg0.method3330();
        this.field398 = arg0.method3330();
        this.field385 = arg0.method3269();
        this.field386 = arg0.method3330();
        this.field396 = arg0.method3330();
        this.field384 = arg0.method3269();
        this.field390 = arg0.method3330();
        this.field389 = arg0.method3330();
        this.field387 = arg0.method3269();
        this.field393 = arg0.method3330();
        this.field395 = arg0.method3330();
        this.field383 = arg0.method3269();
        this.field394 = arg0.method3330();
        this.field392 = arg0.method3330();
        this.method209();
    }

    @ObfuscatedName("ak.k(I)V")
    public void method209() {
    }
}
