package deob;

@ObfuscatedName("ah")
public class class31 implements class43 {

    @ObfuscatedName("ah.b")
    public int field406;

    @ObfuscatedName("ah.q")
    public int field394;

    @ObfuscatedName("ah.o")
    public int field395;

    @ObfuscatedName("ah.p")
    public int field396;

    @ObfuscatedName("ah.a")
    public int field403;

    @ObfuscatedName("ah.h")
    public int field398;

    @ObfuscatedName("ah.l")
    public int field399;

    @ObfuscatedName("ah.y")
    public int field400;

    @ObfuscatedName("ah.g")
    public int field402;

    @ObfuscatedName("ah.c")
    public int field397;

    @ObfuscatedName("ah.b(Lai;B)V")
    public void method193(class33 arg0) {
        if (arg0.field420 > this.field399) {
            arg0.field420 = this.field399;
        }
        if (arg0.field421 < this.field402) {
            arg0.field421 = this.field402;
        }
        if (arg0.field414 > this.field400) {
            arg0.field414 = this.field400;
        }
        if (arg0.field423 < this.field397) {
            arg0.field423 = this.field397;
        }
    }

    @ObfuscatedName("ah.q(IIII)Z")
    public boolean method194(int arg0, int arg1, int arg2) {
        if (arg0 >= this.field406 && arg0 < this.field406 + this.field394) {
            return arg1 >> 6 >= this.field395 && arg1 >> 6 <= this.field403 && arg2 >> 6 >= this.field396 && arg2 >> 6 <= this.field398;
        } else {
            return false;
        }
    }

    @ObfuscatedName("ah.o(IIB)Z")
    public boolean method195(int arg0, int arg1) {
        return arg0 >> 6 >= this.field399 && arg0 >> 6 <= this.field402 && arg1 >> 6 >= this.field400 && arg1 >> 6 <= this.field397;
    }

    @ObfuscatedName("ah.p(IIII)[I")
    public int[] method214(int arg0, int arg1, int arg2) {
        return this.method194(arg0, arg1, arg2) ? new int[] { this.field399 * 64 - this.field395 * 64 + arg1, this.field400 * 64 - this.field396 * 64 + arg2 } : null;
    }

    @ObfuscatedName("ah.a(III)Lhp;")
    public class233 method192(int arg0, int arg1) {
        if (this.method195(arg0, arg1)) {
            int var3 = this.field395 * 64 - this.field399 * 64 + arg0;
            int var4 = this.field396 * 64 - this.field400 * 64 + arg1;
            return new class233(this.field406, var3, var4);
        } else {
            return null;
        }
    }

    @ObfuscatedName("ah.h(Lgn;I)V")
    public void method197(class194 arg0) {
        this.field406 = arg0.method3247();
        this.field394 = arg0.method3247();
        this.field395 = arg0.method3249();
        this.field396 = arg0.method3249();
        this.field403 = arg0.method3249();
        this.field398 = arg0.method3249();
        this.field399 = arg0.method3249();
        this.field400 = arg0.method3249();
        this.field402 = arg0.method3249();
        this.field397 = arg0.method3249();
        this.method257();
    }

    @ObfuscatedName("ah.l(S)V")
    public void method257() {
    }
}
