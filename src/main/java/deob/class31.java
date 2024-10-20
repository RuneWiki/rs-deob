package deob;

@ObfuscatedName("ap")
public class class31 implements class43 {

    @ObfuscatedName("ap.p")
    public int field449;

    @ObfuscatedName("ap.m")
    public int field442;

    @ObfuscatedName("ap.e")
    public int field451;

    @ObfuscatedName("ap.t")
    public int field444;

    @ObfuscatedName("ap.w")
    public int field445;

    @ObfuscatedName("ap.z")
    public int field446;

    @ObfuscatedName("ap.j")
    public int field441;

    @ObfuscatedName("ap.i")
    public int field448;

    @ObfuscatedName("ap.f")
    public int field450;

    @ObfuscatedName("ap.c")
    public int field453;

    @ObfuscatedName("ap.p(Lal;I)V")
    public void method213(class33 arg0) {
        if (arg0.field460 > this.field441) {
            arg0.field460 = this.field441;
        }
        if (arg0.field466 < this.field450) {
            arg0.field466 = this.field450;
        }
        if (arg0.field467 > this.field448) {
            arg0.field467 = this.field448;
        }
        if (arg0.field459 < this.field453) {
            arg0.field459 = this.field453;
        }
    }

    @ObfuscatedName("ap.m(IIII)Z")
    public boolean method197(int arg0, int arg1, int arg2) {
        if (arg0 >= this.field449 && arg0 < this.field449 + this.field442) {
            return arg1 >> 6 >= this.field451 && arg1 >> 6 <= this.field445 && arg2 >> 6 >= this.field444 && arg2 >> 6 <= this.field446;
        } else {
            return false;
        }
    }

    @ObfuscatedName("ap.e(IIB)Z")
    public boolean method198(int arg0, int arg1) {
        return arg0 >> 6 >= this.field441 && arg0 >> 6 <= this.field450 && arg1 >> 6 >= this.field448 && arg1 >> 6 <= this.field453;
    }

    @ObfuscatedName("ap.t(IIII)[I")
    public int[] method208(int arg0, int arg1, int arg2) {
        return this.method197(arg0, arg1, arg2) ? new int[] { this.field441 * 64 - this.field451 * 64 + arg1, this.field448 * 64 - this.field444 * 64 + arg2 } : null;
    }

    @ObfuscatedName("ap.w(III)Lhg;")
    public class213 method200(int arg0, int arg1) {
        if (this.method198(arg0, arg1)) {
            int var3 = this.field451 * 64 - this.field441 * 64 + arg0;
            int var4 = this.field444 * 64 - this.field448 * 64 + arg1;
            return new class213(this.field449, var3, var4);
        } else {
            return null;
        }
    }

    @ObfuscatedName("ap.z(Lfr;I)V")
    public void method201(class174 arg0) {
        this.field449 = arg0.method2810();
        this.field442 = arg0.method2810();
        this.field451 = arg0.method2824();
        this.field444 = arg0.method2824();
        this.field445 = arg0.method2824();
        this.field446 = arg0.method2824();
        this.field441 = arg0.method2824();
        this.field448 = arg0.method2824();
        this.field450 = arg0.method2824();
        this.field453 = arg0.method2824();
        this.method243();
    }

    @ObfuscatedName("ap.j(I)V")
    public void method243() {
    }
}
