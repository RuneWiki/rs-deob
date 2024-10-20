package deob;

@ObfuscatedName("ae")
public class class27 implements class43 {

    @ObfuscatedName("ae.d")
    public int field391;

    @ObfuscatedName("ae.k")
    public int field380;

    @ObfuscatedName("ae.e")
    public int field394;

    @ObfuscatedName("ae.p")
    public int field382;

    @ObfuscatedName("ae.q")
    public int field385;

    @ObfuscatedName("ae.s")
    public int field384;

    @ObfuscatedName("ae.r")
    public int field400;

    @ObfuscatedName("ae.g")
    public int field381;

    @ObfuscatedName("ae.v")
    public int field387;

    @ObfuscatedName("ae.t")
    public int field388;

    @ObfuscatedName("ae.y")
    public int field389;

    @ObfuscatedName("ae.o")
    public int field390;

    @ObfuscatedName("ae.i")
    public int field396;

    @ObfuscatedName("ae.u")
    public int field392;

    @ObfuscatedName("ae.d(Las;B)V")
    public void method175(class33 arg0) {
        if (arg0.field474 > this.field385) {
            arg0.field474 = this.field385;
        }
        if (arg0.field475 < this.field385) {
            arg0.field475 = this.field385;
        }
        if (arg0.field476 > this.field384) {
            arg0.field476 = this.field384;
        }
        if (arg0.field477 < this.field384) {
            arg0.field477 = this.field384;
        }
    }

    @ObfuscatedName("ae.k(IIII)Z")
    public boolean method169(int arg0, int arg1, int arg2) {
        if (arg0 >= this.field391 && arg0 < this.field391 + this.field380) {
            return arg1 >= (this.field400 << 3) + (this.field394 << 6) && arg1 <= (this.field394 << 6) + (this.field387 << 3) + 7 && arg2 >= (this.field382 << 6) + (this.field381 << 3) && arg2 <= (this.field388 << 3) + (this.field382 << 6) + 7;
        } else {
            return false;
        }
    }

    @ObfuscatedName("ae.e(III)Z")
    public boolean method170(int arg0, int arg1) {
        return arg0 >= (this.field389 << 3) + (this.field385 << 6) && arg0 <= (this.field396 << 3) + (this.field385 << 6) + 7 && arg1 >= (this.field390 << 3) + (this.field384 << 6) && arg1 <= (this.field392 << 3) + (this.field384 << 6) + 7;
    }

    @ObfuscatedName("ae.p(IIII)[I")
    public int[] method168(int arg0, int arg1, int arg2) {
        return this.method169(arg0, arg1, arg2) ? new int[] { this.field389 * 8 - this.field400 * 8 + this.field385 * 64 - this.field394 * 64 + arg1, this.field390 * 8 - this.field381 * 8 + this.field384 * 64 - this.field382 * 64 + arg2 } : null;
    }

    @ObfuscatedName("ae.q(IIB)Lhl;")
    public class213 method177(int arg0, int arg1) {
        if (this.method170(arg0, arg1)) {
            int var3 = this.field400 * 8 - this.field389 * 8 + this.field394 * 64 - this.field385 * 64 + arg0;
            int var4 = this.field381 * 8 - this.field390 * 8 + this.field382 * 64 - this.field384 * 64 + arg1;
            return new class213(this.field391, var3, var4);
        } else {
            return null;
        }
    }

    @ObfuscatedName("ae.s(Lfg;B)V")
    public void method194(class174 arg0) {
        this.field391 = arg0.method2955();
        this.field380 = arg0.method2955();
        this.field394 = arg0.method3035();
        this.field400 = arg0.method2955();
        this.field387 = arg0.method2955();
        this.field382 = arg0.method3035();
        this.field381 = arg0.method2955();
        this.field388 = arg0.method2955();
        this.field385 = arg0.method3035();
        this.field389 = arg0.method2955();
        this.field396 = arg0.method2955();
        this.field384 = arg0.method3035();
        this.field390 = arg0.method2955();
        this.field392 = arg0.method2955();
        this.method173();
    }

    @ObfuscatedName("ae.r(I)V")
    public void method173() {
    }
}
