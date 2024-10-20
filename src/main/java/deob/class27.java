package deob;

@ObfuscatedName("ap")
public class class27 implements class43 {

    @ObfuscatedName("ap.s")
    public int field386;

    @ObfuscatedName("ap.c")
    public int field382;

    @ObfuscatedName("ap.f")
    public int field383;

    @ObfuscatedName("ap.m")
    public int field385;

    @ObfuscatedName("ap.h")
    public int field392;

    @ObfuscatedName("ap.t")
    public int field390;

    @ObfuscatedName("ap.p")
    public int field384;

    @ObfuscatedName("ap.d")
    public int field388;

    @ObfuscatedName("ap.n")
    public int field389;

    @ObfuscatedName("ap.z")
    public int field381;

    @ObfuscatedName("ap.o")
    public int field391;

    @ObfuscatedName("ap.q")
    public int field387;

    @ObfuscatedName("ap.u")
    public int field393;

    @ObfuscatedName("ap.k")
    public int field394;

    @ObfuscatedName("ap.s(Laq;I)V")
    public void method184(class33 arg0) {
        if (arg0.field467 > this.field392) {
            arg0.field467 = this.field392;
        }
        if (arg0.field463 < this.field392) {
            arg0.field463 = this.field392;
        }
        if (arg0.field464 > this.field390) {
            arg0.field464 = this.field390;
        }
        if (arg0.field465 < this.field390) {
            arg0.field465 = this.field390;
        }
    }

    @ObfuscatedName("ap.c(IIII)Z")
    public boolean method185(int arg0, int arg1, int arg2) {
        if (arg0 >= this.field386 && arg0 < this.field386 + this.field382) {
            return arg1 >= (this.field384 << 3) + (this.field383 << 6) && arg1 <= (this.field389 << 3) + (this.field383 << 6) + 7 && arg2 >= (this.field388 << 3) + (this.field385 << 6) && arg2 <= (this.field385 << 6) + (this.field381 << 3) + 7;
        } else {
            return false;
        }
    }

    @ObfuscatedName("ap.f(III)Z")
    public boolean method208(int arg0, int arg1) {
        return arg0 >= (this.field392 << 6) + (this.field391 << 3) && arg0 <= (this.field393 << 3) + (this.field392 << 6) + 7 && arg1 >= (this.field390 << 6) + (this.field387 << 3) && arg1 <= (this.field394 << 3) + (this.field390 << 6) + 7;
    }

    @ObfuscatedName("ap.m(IIII)[I")
    public int[] method213(int arg0, int arg1, int arg2) {
        return this.method185(arg0, arg1, arg2) ? new int[] { this.field391 * 8 - this.field384 * 8 + this.field392 * 64 - this.field383 * 64 + arg1, this.field387 * 8 - this.field388 * 8 + this.field390 * 64 - this.field385 * 64 + arg2 } : null;
    }

    @ObfuscatedName("ap.h(IIB)Lhp;")
    public class216 method188(int arg0, int arg1) {
        if (this.method208(arg0, arg1)) {
            int var3 = this.field384 * 8 - this.field391 * 8 + this.field383 * 64 - this.field392 * 64 + arg0;
            int var4 = this.field388 * 8 - this.field387 * 8 + this.field385 * 64 - this.field390 * 64 + arg1;
            return new class216(this.field386, var3, var4);
        } else {
            return null;
        }
    }

    @ObfuscatedName("ap.t(Lfs;I)V")
    public void method189(class177 arg0) {
        this.field386 = arg0.method2965();
        this.field382 = arg0.method2965();
        this.field383 = arg0.method2967();
        this.field384 = arg0.method2965();
        this.field389 = arg0.method2965();
        this.field385 = arg0.method2967();
        this.field388 = arg0.method2965();
        this.field381 = arg0.method2965();
        this.field392 = arg0.method2967();
        this.field391 = arg0.method2965();
        this.field393 = arg0.method2965();
        this.field390 = arg0.method2967();
        this.field387 = arg0.method2965();
        this.field394 = arg0.method2965();
        this.method187();
    }

    @ObfuscatedName("ap.p(I)V")
    public void method187() {
    }
}
