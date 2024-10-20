package deob;

@ObfuscatedName("ab")
public class class27 implements class44 {

    @ObfuscatedName("ab.o")
    public int field381;

    @ObfuscatedName("ab.k")
    public int field382;

    @ObfuscatedName("ab.t")
    public int field383;

    @ObfuscatedName("ab.d")
    public int field384;

    @ObfuscatedName("ab.h")
    public int field393;

    @ObfuscatedName("ab.m")
    public int field386;

    @ObfuscatedName("ab.z")
    public int field387;

    @ObfuscatedName("ab.i")
    public int field388;

    @ObfuscatedName("ab.u")
    public int field385;

    @ObfuscatedName("ab.x")
    public int field390;

    @ObfuscatedName("ab.y")
    public int field391;

    @ObfuscatedName("ab.a")
    public int field392;

    @ObfuscatedName("ab.w")
    public int field395;

    @ObfuscatedName("ab.n")
    public int field394;

    @ObfuscatedName("ab.o(Lah;I)V")
    public void method192(class33 arg0) {
        if (arg0.field451 > this.field393) {
            arg0.field451 = this.field393;
        }
        if (arg0.field456 < this.field393) {
            arg0.field456 = this.field393;
        }
        if (arg0.field457 > this.field386) {
            arg0.field457 = this.field386;
        }
        if (arg0.field458 < this.field386) {
            arg0.field458 = this.field386;
        }
    }

    @ObfuscatedName("ab.k(IIIB)Z")
    public boolean method194(int arg0, int arg1, int arg2) {
        if (arg0 >= this.field381 && arg0 < this.field382 + this.field381) {
            return arg1 >= (this.field387 << 3) + (this.field383 << 6) && arg1 <= (this.field385 << 3) + (this.field383 << 6) + 7 && arg2 >= (this.field388 << 3) + (this.field384 << 6) && arg2 <= (this.field390 << 3) + (this.field384 << 6) + 7;
        } else {
            return false;
        }
    }

    @ObfuscatedName("ab.t(III)Z")
    public boolean method195(int arg0, int arg1) {
        return arg0 >= (this.field393 << 6) + (this.field391 << 3) && arg0 <= (this.field395 << 3) + (this.field393 << 6) + 7 && arg1 >= (this.field392 << 3) + (this.field386 << 6) && arg1 <= (this.field394 << 3) + (this.field386 << 6) + 7;
    }

    @ObfuscatedName("ab.d(IIIB)[I")
    public int[] method196(int arg0, int arg1, int arg2) {
        return this.method194(arg0, arg1, arg2) ? new int[] { this.field391 * 8 - this.field387 * 8 + this.field393 * 64 - this.field383 * 64 + arg1, this.field392 * 8 - this.field388 * 8 + this.field386 * 64 - this.field384 * 64 + arg2 } : null;
    }

    @ObfuscatedName("ab.h(IIB)Lix;")
    public class239 method217(int arg0, int arg1) {
        if (this.method195(arg0, arg1)) {
            int var3 = this.field387 * 8 - this.field391 * 8 + this.field383 * 64 - this.field393 * 64 + arg0;
            int var4 = this.field388 * 8 - this.field392 * 8 + this.field384 * 64 - this.field386 * 64 + arg1;
            return new class239(this.field381, var3, var4);
        } else {
            return null;
        }
    }

    @ObfuscatedName("ab.m(Lgc;I)V")
    public void method198(class195 arg0) {
        this.field381 = arg0.method3205();
        this.field382 = arg0.method3205();
        this.field383 = arg0.method3207();
        this.field387 = arg0.method3205();
        this.field385 = arg0.method3205();
        this.field384 = arg0.method3207();
        this.field388 = arg0.method3205();
        this.field390 = arg0.method3205();
        this.field393 = arg0.method3207();
        this.field391 = arg0.method3205();
        this.field395 = arg0.method3205();
        this.field386 = arg0.method3207();
        this.field392 = arg0.method3205();
        this.field394 = arg0.method3205();
        this.method204();
    }

    @ObfuscatedName("ab.z(I)V")
    public void method204() {
    }
}
