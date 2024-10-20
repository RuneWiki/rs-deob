package deob;

@ObfuscatedName("t")
public class class20 implements class38 {

    @ObfuscatedName("t.q")
    public int field133;

    @ObfuscatedName("t.w")
    public int field131;

    @ObfuscatedName("t.e")
    public int field132;

    @ObfuscatedName("t.p")
    public int field137;

    @ObfuscatedName("t.k")
    public int field134;

    @ObfuscatedName("t.l")
    public int field135;

    @ObfuscatedName("t.b")
    public int field141;

    @ObfuscatedName("t.i")
    public int field144;

    @ObfuscatedName("t.c")
    public int field138;

    @ObfuscatedName("t.f")
    public int field139;

    @ObfuscatedName("t.m")
    public int field140;

    @ObfuscatedName("t.u")
    public int field142;

    @ObfuscatedName("t.x")
    public int field130;

    @ObfuscatedName("t.r")
    public int field143;

    @ObfuscatedName("t.q(Lal;B)V")
    public void method198(class27 arg0) {
        if (arg0.field218 > this.field134) {
            arg0.field218 = this.field134;
        }
        if (arg0.field224 < this.field134) {
            arg0.field224 = this.field134;
        }
        if (arg0.field221 > this.field135) {
            arg0.field221 = this.field135;
        }
        if (arg0.field223 < this.field135) {
            arg0.field223 = this.field135;
        }
    }

    @ObfuscatedName("t.w(IIII)Z")
    public boolean method199(int arg0, int arg1, int arg2) {
        if (arg0 >= this.field133 && arg0 < this.field133 + this.field131) {
            return arg1 >= (this.field141 << 3) + (this.field132 << 6) && arg1 <= (this.field138 << 3) + (this.field132 << 6) + 7 && arg2 >= (this.field144 << 3) + (this.field137 << 6) && arg2 <= (this.field139 << 3) + (this.field137 << 6) + 7;
        } else {
            return false;
        }
    }

    @ObfuscatedName("t.e(IIB)Z")
    public boolean method213(int arg0, int arg1) {
        return arg0 >= (this.field140 << 3) + (this.field134 << 6) && arg0 <= (this.field134 << 6) + (this.field130 << 3) + 7 && arg1 >= (this.field142 << 3) + (this.field135 << 6) && arg1 <= (this.field143 << 3) + (this.field135 << 6) + 7;
    }

    @ObfuscatedName("t.p(IIIB)[I")
    public int[] method201(int arg0, int arg1, int arg2) {
        return this.method199(arg0, arg1, arg2) ? new int[] { this.field140 * 8 - this.field141 * 8 + this.field134 * 64 - this.field132 * 64 + arg1, this.field142 * 8 - this.field144 * 8 + this.field135 * 64 - this.field137 * 64 + arg2 } : null;
    }

    @ObfuscatedName("t.k(IIB)Lhv;")
    public class214 method215(int arg0, int arg1) {
        if (this.method213(arg0, arg1)) {
            int var3 = this.field141 * 8 - this.field140 * 8 + this.field132 * 64 - this.field134 * 64 + arg0;
            int var4 = this.field144 * 8 - this.field142 * 8 + this.field137 * 64 - this.field135 * 64 + arg1;
            return new class214(this.field133, var3, var4);
        } else {
            return null;
        }
    }

    @ObfuscatedName("t.l(Lkf;I)V")
    public void method203(class301 arg0) {
        this.field133 = arg0.method5077();
        this.field131 = arg0.method5077();
        this.field132 = arg0.method5069();
        this.field141 = arg0.method5077();
        this.field138 = arg0.method5077();
        this.field137 = arg0.method5069();
        this.field144 = arg0.method5077();
        this.field139 = arg0.method5077();
        this.field134 = arg0.method5069();
        this.field140 = arg0.method5077();
        this.field130 = arg0.method5077();
        this.field135 = arg0.method5069();
        this.field142 = arg0.method5077();
        this.field143 = arg0.method5077();
        this.method197();
    }

    @ObfuscatedName("t.b(I)V")
    public void method197() {
    }
}
