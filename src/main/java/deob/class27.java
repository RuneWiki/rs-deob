package deob;

@ObfuscatedName("ae")
public class class27 implements class43 {

    @ObfuscatedName("ae.n")
    public int field396;

    @ObfuscatedName("ae.p")
    public int field382;

    @ObfuscatedName("ae.i")
    public int field383;

    @ObfuscatedName("ae.j")
    public int field384;

    @ObfuscatedName("ae.f")
    public int field385;

    @ObfuscatedName("ae.m")
    public int field386;

    @ObfuscatedName("ae.c")
    public int field387;

    @ObfuscatedName("ae.z")
    public int field381;

    @ObfuscatedName("ae.h")
    public int field398;

    @ObfuscatedName("ae.g")
    public int field390;

    @ObfuscatedName("ae.e")
    public int field388;

    @ObfuscatedName("ae.o")
    public int field389;

    @ObfuscatedName("ae.x")
    public int field393;

    @ObfuscatedName("ae.a")
    public int field392;

    @ObfuscatedName("ae.n(Lal;B)V")
    public void method214(class33 arg0) {
        if (arg0.field461 > this.field385) {
            arg0.field461 = this.field385;
        }
        if (arg0.field469 < this.field385) {
            arg0.field469 = this.field385;
        }
        if (arg0.field466 > this.field386) {
            arg0.field466 = this.field386;
        }
        if (arg0.field467 < this.field386) {
            arg0.field467 = this.field386;
        }
    }

    @ObfuscatedName("ae.p(IIIB)Z")
    public boolean method210(int arg0, int arg1, int arg2) {
        if (arg0 >= this.field396 && arg0 < this.field396 + this.field382) {
            return arg1 >= (this.field387 << 3) + (this.field383 << 6) && arg1 <= (this.field398 << 3) + (this.field383 << 6) + 7 && arg2 >= (this.field384 << 6) + (this.field381 << 3) && arg2 <= (this.field390 << 3) + (this.field384 << 6) + 7;
        } else {
            return false;
        }
    }

    @ObfuscatedName("ae.i(III)Z")
    public boolean method198(int arg0, int arg1) {
        return arg0 >= (this.field388 << 3) + (this.field385 << 6) && arg0 <= (this.field393 << 3) + (this.field385 << 6) + 7 && arg1 >= (this.field389 << 3) + (this.field386 << 6) && arg1 <= (this.field392 << 3) + (this.field386 << 6) + 7;
    }

    @ObfuscatedName("ae.j(IIIB)[I")
    public int[] method195(int arg0, int arg1, int arg2) {
        return this.method210(arg0, arg1, arg2) ? new int[] { this.field388 * 8 - this.field387 * 8 + this.field385 * 64 - this.field383 * 64 + arg1, this.field389 * 8 - this.field381 * 8 + this.field386 * 64 - this.field384 * 64 + arg2 } : null;
    }

    @ObfuscatedName("ae.f(III)Lhl;")
    public class213 method211(int arg0, int arg1) {
        if (this.method198(arg0, arg1)) {
            int var3 = this.field387 * 8 - this.field388 * 8 + this.field383 * 64 - this.field385 * 64 + arg0;
            int var4 = this.field381 * 8 - this.field389 * 8 + this.field384 * 64 - this.field386 * 64 + arg1;
            return new class213(this.field396, var3, var4);
        } else {
            return null;
        }
    }

    @ObfuscatedName("ae.m(Lfl;I)V")
    public void method201(class174 arg0) {
        this.field396 = arg0.method2925();
        this.field382 = arg0.method2925();
        this.field383 = arg0.method3065();
        this.field387 = arg0.method2925();
        this.field398 = arg0.method2925();
        this.field384 = arg0.method3065();
        this.field381 = arg0.method2925();
        this.field390 = arg0.method2925();
        this.field385 = arg0.method3065();
        this.field388 = arg0.method2925();
        this.field393 = arg0.method2925();
        this.field386 = arg0.method3065();
        this.field389 = arg0.method2925();
        this.field392 = arg0.method2925();
        this.method202();
    }

    @ObfuscatedName("ae.c(I)V")
    public void method202() {
    }
}
