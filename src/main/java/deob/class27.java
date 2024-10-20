package deob;

@ObfuscatedName("av")
public class class27 implements class43 {

    @ObfuscatedName("av.p")
    public int field395;

    @ObfuscatedName("av.m")
    public int field390;

    @ObfuscatedName("av.e")
    public int field391;

    @ObfuscatedName("av.t")
    public int field399;

    @ObfuscatedName("av.w")
    public int field392;

    @ObfuscatedName("av.z")
    public int field394;

    @ObfuscatedName("av.j")
    public int field401;

    @ObfuscatedName("av.i")
    public int field396;

    @ObfuscatedName("av.f")
    public int field397;

    @ObfuscatedName("av.c")
    public int field398;

    @ObfuscatedName("av.o")
    public int field389;

    @ObfuscatedName("av.q")
    public int field400;

    @ObfuscatedName("av.n")
    public int field393;

    @ObfuscatedName("av.a")
    public int field402;

    @ObfuscatedName("av.p(Lal;I)V")
    public void method213(class33 arg0) {
        if (arg0.field460 > this.field392) {
            arg0.field460 = this.field392;
        }
        if (arg0.field466 < this.field392) {
            arg0.field466 = this.field392;
        }
        if (arg0.field467 > this.field394) {
            arg0.field467 = this.field394;
        }
        if (arg0.field459 < this.field394) {
            arg0.field459 = this.field394;
        }
    }

    @ObfuscatedName("av.m(IIII)Z")
    public boolean method197(int arg0, int arg1, int arg2) {
        if (arg0 >= this.field395 && arg0 < this.field395 + this.field390) {
            return arg1 >= (this.field401 << 3) + (this.field391 << 6) && arg1 <= (this.field397 << 3) + (this.field391 << 6) + 7 && arg2 >= (this.field399 << 6) + (this.field396 << 3) && arg2 <= (this.field399 << 6) + (this.field398 << 3) + 7;
        } else {
            return false;
        }
    }

    @ObfuscatedName("av.e(IIB)Z")
    public boolean method198(int arg0, int arg1) {
        return arg0 >= (this.field392 << 6) + (this.field389 << 3) && arg0 <= (this.field393 << 3) + (this.field392 << 6) + 7 && arg1 >= (this.field400 << 3) + (this.field394 << 6) && arg1 <= (this.field402 << 3) + (this.field394 << 6) + 7;
    }

    @ObfuscatedName("av.t(IIII)[I")
    public int[] method208(int arg0, int arg1, int arg2) {
        return this.method197(arg0, arg1, arg2) ? new int[] { this.field389 * 8 - this.field401 * 8 + this.field392 * 64 - this.field391 * 64 + arg1, this.field400 * 8 - this.field396 * 8 + this.field394 * 64 - this.field399 * 64 + arg2 } : null;
    }

    @ObfuscatedName("av.w(III)Lhg;")
    public class213 method200(int arg0, int arg1) {
        if (this.method198(arg0, arg1)) {
            int var3 = this.field401 * 8 - this.field389 * 8 + this.field391 * 64 - this.field392 * 64 + arg0;
            int var4 = this.field396 * 8 - this.field400 * 8 + this.field399 * 64 - this.field394 * 64 + arg1;
            return new class213(this.field395, var3, var4);
        } else {
            return null;
        }
    }

    @ObfuscatedName("av.z(Lfr;I)V")
    public void method201(class174 arg0) {
        this.field395 = arg0.method2810();
        this.field390 = arg0.method2810();
        this.field391 = arg0.method2824();
        this.field401 = arg0.method2810();
        this.field397 = arg0.method2810();
        this.field399 = arg0.method2824();
        this.field396 = arg0.method2810();
        this.field398 = arg0.method2810();
        this.field392 = arg0.method2824();
        this.field389 = arg0.method2810();
        this.field393 = arg0.method2810();
        this.field394 = arg0.method2824();
        this.field400 = arg0.method2810();
        this.field402 = arg0.method2810();
        this.method202();
    }

    @ObfuscatedName("av.j(S)V")
    public void method202() {
    }
}
