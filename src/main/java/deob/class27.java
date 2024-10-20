package deob;

@ObfuscatedName("ar")
public class class27 implements class43 {

    @ObfuscatedName("ar.i")
    public int field401;

    @ObfuscatedName("ar.j")
    public int field386;

    @ObfuscatedName("ar.a")
    public int field387;

    @ObfuscatedName("ar.r")
    public int field388;

    @ObfuscatedName("ar.o")
    public int field389;

    @ObfuscatedName("ar.n")
    public int field390;

    @ObfuscatedName("ar.q")
    public int field391;

    @ObfuscatedName("ar.b")
    public int field392;

    @ObfuscatedName("ar.k")
    public int field393;

    @ObfuscatedName("ar.s")
    public int field397;

    @ObfuscatedName("ar.d")
    public int field396;

    @ObfuscatedName("ar.l")
    public int field394;

    @ObfuscatedName("ar.t")
    public int field395;

    @ObfuscatedName("ar.y")
    public int field398;

    @ObfuscatedName("ar.i(Lam;I)V")
    public void method199(class33 arg0) {
        if (arg0.field463 > this.field389) {
            arg0.field463 = this.field389;
        }
        if (arg0.field469 < this.field389) {
            arg0.field469 = this.field389;
        }
        if (arg0.field457 > this.field390) {
            arg0.field457 = this.field390;
        }
        if (arg0.field466 < this.field390) {
            arg0.field466 = this.field390;
        }
    }

    @ObfuscatedName("ar.j(IIII)Z")
    public boolean method225(int arg0, int arg1, int arg2) {
        if (arg0 >= this.field401 && arg0 < this.field401 + this.field386) {
            return arg1 >= (this.field391 << 3) + (this.field387 << 6) && arg1 <= (this.field393 << 3) + (this.field387 << 6) + 7 && arg2 >= (this.field392 << 3) + (this.field388 << 6) && arg2 <= (this.field397 << 3) + (this.field388 << 6) + 7;
        } else {
            return false;
        }
    }

    @ObfuscatedName("ar.a(IIB)Z")
    public boolean method201(int arg0, int arg1) {
        return arg0 >= (this.field396 << 3) + (this.field389 << 6) && arg0 <= (this.field395 << 3) + (this.field389 << 6) + 7 && arg1 >= (this.field394 << 3) + (this.field390 << 6) && arg1 <= (this.field398 << 3) + (this.field390 << 6) + 7;
    }

    @ObfuscatedName("ar.r(IIII)[I")
    public int[] method202(int arg0, int arg1, int arg2) {
        return this.method225(arg0, arg1, arg2) ? new int[] { this.field396 * 8 - this.field391 * 8 + this.field389 * 64 - this.field387 * 64 + arg1, this.field394 * 8 - this.field392 * 8 + this.field390 * 64 - this.field388 * 64 + arg2 } : null;
    }

    @ObfuscatedName("ar.o(III)Lhs;")
    public class214 method203(int arg0, int arg1) {
        if (this.method201(arg0, arg1)) {
            int var3 = this.field391 * 8 - this.field396 * 8 + this.field387 * 64 - this.field389 * 64 + arg0;
            int var4 = this.field392 * 8 - this.field394 * 8 + this.field388 * 64 - this.field390 * 64 + arg1;
            return new class214(this.field401, var3, var4);
        } else {
            return null;
        }
    }

    @ObfuscatedName("ar.n(Lfp;I)V")
    public void method204(class175 arg0) {
        this.field401 = arg0.method2999();
        this.field386 = arg0.method2999();
        this.field387 = arg0.method2995();
        this.field391 = arg0.method2999();
        this.field393 = arg0.method2999();
        this.field388 = arg0.method2995();
        this.field392 = arg0.method2999();
        this.field397 = arg0.method2999();
        this.field389 = arg0.method2995();
        this.field396 = arg0.method2999();
        this.field395 = arg0.method2999();
        this.field390 = arg0.method2995();
        this.field394 = arg0.method2999();
        this.field398 = arg0.method2999();
        this.method198();
    }

    @ObfuscatedName("ar.q(I)V")
    public void method198() {
    }
}
