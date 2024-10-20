package deob;

@ObfuscatedName("hd")
public class class218 implements class221 {

    @ObfuscatedName("hd.v")
    public int field2396;

    @ObfuscatedName("hd.c")
    public int field2401;

    @ObfuscatedName("hd.i")
    public int field2397;

    @ObfuscatedName("hd.f")
    public int field2398;

    @ObfuscatedName("hd.b")
    public int field2404;

    @ObfuscatedName("hd.n")
    public int field2400;

    @ObfuscatedName("hd.v(Lgu;I)V")
    public void method3590(class201 arg0) {
        if (arg0.field2243 > this.field2404) {
            arg0.field2243 = this.field2404;
        }
        if (arg0.field2249 < this.field2404) {
            arg0.field2249 = this.field2404;
        }
        if (arg0.field2245 > this.field2400) {
            arg0.field2245 = this.field2400;
        }
        if (arg0.field2246 < this.field2400) {
            arg0.field2246 = this.field2400;
        }
    }

    @ObfuscatedName("hd.c(IIII)Z")
    public boolean method3597(int arg0, int arg1, int arg2) {
        if (arg0 >= this.field2396 && arg0 < this.field2401 + this.field2396) {
            return arg1 >> 6 == this.field2397 && arg2 >> 6 == this.field2398;
        } else {
            return false;
        }
    }

    @ObfuscatedName("hd.i(III)Z")
    public boolean method3602(int arg0, int arg1) {
        return arg0 >> 6 == this.field2404 && arg1 >> 6 == this.field2400;
    }

    @ObfuscatedName("hd.f(IIII)[I")
    public int[] method3592(int arg0, int arg1, int arg2) {
        return this.method3597(arg0, arg1, arg2) ? new int[] { this.field2404 * 64 - this.field2397 * 64 + arg1, this.field2400 * 64 - this.field2398 * 64 + arg2 } : null;
    }

    @ObfuscatedName("hd.b(III)Lks;")
    public class290 method3606(int arg0, int arg1) {
        if (this.method3602(arg0, arg1)) {
            int var3 = this.field2397 * 64 - this.field2404 * 64 + arg0;
            int var4 = this.field2398 * 64 - this.field2400 * 64 + arg1;
            return new class290(this.field2396, var3, var4);
        } else {
            return null;
        }
    }

    @ObfuscatedName("hd.n(Lpi;I)V")
    public void method3594(class438 arg0) {
        this.field2396 = arg0.method6971();
        this.field2401 = arg0.method6971();
        this.field2397 = arg0.method7148();
        this.field2398 = arg0.method7148();
        this.field2404 = arg0.method7148();
        this.field2400 = arg0.method7148();
        this.method3952();
    }

    @ObfuscatedName("hd.s(I)V")
    public void method3952() {
    }
}
