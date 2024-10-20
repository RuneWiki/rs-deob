package deob;

@ObfuscatedName("h")
public class class20 implements class38 {

    @ObfuscatedName("h.z")
    public int field132;

    @ObfuscatedName("h.n")
    public int field139;

    @ObfuscatedName("h.v")
    public int field143;

    @ObfuscatedName("h.u")
    public int field131;

    @ObfuscatedName("h.r")
    public int field141;

    @ObfuscatedName("h.p")
    public int field133;

    @ObfuscatedName("h.q")
    public int field134;

    @ObfuscatedName("h.m")
    public int field135;

    @ObfuscatedName("h.y")
    public int field136;

    @ObfuscatedName("h.i")
    public int field137;

    @ObfuscatedName("h.c")
    public int field138;

    @ObfuscatedName("h.b")
    public int field130;

    @ObfuscatedName("h.o")
    public int field140;

    @ObfuscatedName("h.a")
    public int field129;

    @ObfuscatedName("h.z(Lac;I)V")
    public void method210(class27 arg0) {
        if (arg0.field209 > this.field141) {
            arg0.field209 = this.field141;
        }
        if (arg0.field213 < this.field141) {
            arg0.field213 = this.field141;
        }
        if (arg0.field214 > this.field133) {
            arg0.field214 = this.field133;
        }
        if (arg0.field206 < this.field133) {
            arg0.field206 = this.field133;
        }
    }

    @ObfuscatedName("h.n(IIII)Z")
    public boolean method211(int arg0, int arg1, int arg2) {
        if (arg0 >= this.field132 && arg0 < this.field139 + this.field132) {
            return arg1 >= (this.field143 << 6) + (this.field134 << 3) && arg1 <= (this.field143 << 6) + (this.field136 << 3) + 7 && arg2 >= (this.field135 << 3) + (this.field131 << 6) && arg2 <= (this.field137 << 3) + (this.field131 << 6) + 7;
        } else {
            return false;
        }
    }

    @ObfuscatedName("h.v(III)Z")
    public boolean method212(int arg0, int arg1) {
        return arg0 >= (this.field141 << 6) + (this.field138 << 3) && arg0 <= (this.field141 << 6) + (this.field140 << 3) + 7 && arg1 >= (this.field133 << 6) + (this.field130 << 3) && arg1 <= (this.field133 << 6) + (this.field129 << 3) + 7;
    }

    @ObfuscatedName("h.u(IIII)[I")
    public int[] method223(int arg0, int arg1, int arg2) {
        return this.method211(arg0, arg1, arg2) ? new int[] { this.field138 * 8 - this.field134 * 8 + this.field141 * 64 - this.field143 * 64 + arg1, this.field130 * 8 - this.field135 * 8 + this.field133 * 64 - this.field131 * 64 + arg2 } : null;
    }

    @ObfuscatedName("h.r(III)Lhb;")
    public class214 method214(int arg0, int arg1) {
        if (this.method212(arg0, arg1)) {
            int var3 = this.field134 * 8 - this.field138 * 8 + this.field143 * 64 - this.field141 * 64 + arg0;
            int var4 = this.field135 * 8 - this.field130 * 8 + this.field131 * 64 - this.field133 * 64 + arg1;
            return new class214(this.field132, var3, var4);
        } else {
            return null;
        }
    }

    @ObfuscatedName("h.p(Lkl;B)V")
    public void method215(class300 arg0) {
        this.field132 = arg0.method4990();
        this.field139 = arg0.method4990();
        this.field143 = arg0.method4992();
        this.field134 = arg0.method4990();
        this.field136 = arg0.method4990();
        this.field131 = arg0.method4992();
        this.field135 = arg0.method4990();
        this.field137 = arg0.method4990();
        this.field141 = arg0.method4992();
        this.field138 = arg0.method4990();
        this.field140 = arg0.method4990();
        this.field133 = arg0.method4992();
        this.field130 = arg0.method4990();
        this.field129 = arg0.method4990();
        this.method216();
    }

    @ObfuscatedName("h.q(I)V")
    public void method216() {
    }
}
