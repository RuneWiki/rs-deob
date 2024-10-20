package deob;

@ObfuscatedName("aq")
public class class31 implements class43 {

    @ObfuscatedName("aq.b")
    public int field397;

    @ObfuscatedName("aq.s")
    public int field398;

    @ObfuscatedName("aq.r")
    public int field399;

    @ObfuscatedName("aq.g")
    public int field400;

    @ObfuscatedName("aq.x")
    public int field401;

    @ObfuscatedName("aq.f")
    public int field402;

    @ObfuscatedName("aq.u")
    public int field403;

    @ObfuscatedName("aq.t")
    public int field404;

    @ObfuscatedName("aq.k")
    public int field405;

    @ObfuscatedName("aq.n")
    public int field406;

    @ObfuscatedName("aq.b(Lam;I)V")
    public void method184(class33 arg0) {
        if (arg0.field424 > this.field403) {
            arg0.field424 = this.field403;
        }
        if (arg0.field425 < this.field405) {
            arg0.field425 = this.field405;
        }
        if (arg0.field418 > this.field404) {
            arg0.field418 = this.field404;
        }
        if (arg0.field427 < this.field406) {
            arg0.field427 = this.field406;
        }
    }

    @ObfuscatedName("aq.s(IIIB)Z")
    public boolean method172(int arg0, int arg1, int arg2) {
        if (arg0 >= this.field397 && arg0 < this.field398 + this.field397) {
            return arg1 >> 6 >= this.field399 && arg1 >> 6 <= this.field401 && arg2 >> 6 >= this.field400 && arg2 >> 6 <= this.field402;
        } else {
            return false;
        }
    }

    @ObfuscatedName("aq.r(III)Z")
    public boolean method173(int arg0, int arg1) {
        return arg0 >> 6 >= this.field403 && arg0 >> 6 <= this.field405 && arg1 >> 6 >= this.field404 && arg1 >> 6 <= this.field406;
    }

    @ObfuscatedName("aq.g(IIII)[I")
    public int[] method174(int arg0, int arg1, int arg2) {
        return this.method172(arg0, arg1, arg2) ? new int[] { this.field403 * 64 - this.field399 * 64 + arg1, this.field404 * 64 - this.field400 * 64 + arg2 } : null;
    }

    @ObfuscatedName("aq.x(III)Lhk;")
    public class220 method175(int arg0, int arg1) {
        if (this.method173(arg0, arg1)) {
            int var3 = this.field399 * 64 - this.field403 * 64 + arg0;
            int var4 = this.field400 * 64 - this.field404 * 64 + arg1;
            return new class220(this.field397, var3, var4);
        } else {
            return null;
        }
    }

    @ObfuscatedName("aq.f(Lfs;I)V")
    public void method176(class181 arg0) {
        this.field397 = arg0.method2945();
        this.field398 = arg0.method2945();
        this.field399 = arg0.method3081();
        this.field400 = arg0.method3081();
        this.field401 = arg0.method3081();
        this.field402 = arg0.method3081();
        this.field403 = arg0.method3081();
        this.field404 = arg0.method3081();
        this.field405 = arg0.method3081();
        this.field406 = arg0.method3081();
        this.method211();
    }

    @ObfuscatedName("aq.u(I)V")
    public void method211() {
    }
}
