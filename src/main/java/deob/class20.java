package deob;

@ObfuscatedName("a")
public class class20 implements class38 {

    @ObfuscatedName("a.s")
    public int field133;

    @ObfuscatedName("a.j")
    public int field122;

    @ObfuscatedName("a.i")
    public int field123;

    @ObfuscatedName("a.k")
    public int field121;

    @ObfuscatedName("a.u")
    public int field125;

    @ObfuscatedName("a.n")
    public int field126;

    @ObfuscatedName("a.t")
    public int field136;

    @ObfuscatedName("a.q")
    public int field137;

    @ObfuscatedName("a.x")
    public int field129;

    @ObfuscatedName("a.d")
    public int field124;

    @ObfuscatedName("a.f")
    public int field131;

    @ObfuscatedName("a.c")
    public int field132;

    @ObfuscatedName("a.r")
    public int field135;

    @ObfuscatedName("a.y")
    public int field134;

    @ObfuscatedName("a.s(Lav;I)V")
    public void method210(class27 arg0) {
        if (arg0.field207 > this.field125) {
            arg0.field207 = this.field125;
        }
        if (arg0.field209 < this.field125) {
            arg0.field209 = this.field125;
        }
        if (arg0.field211 > this.field126) {
            arg0.field211 = this.field126;
        }
        if (arg0.field212 < this.field126) {
            arg0.field212 = this.field126;
        }
    }

    @ObfuscatedName("a.j(IIII)Z")
    public boolean method187(int arg0, int arg1, int arg2) {
        if (arg0 >= this.field133 && arg0 < this.field133 + this.field122) {
            return arg1 >= (this.field136 << 3) + (this.field123 << 6) && arg1 <= (this.field129 << 3) + (this.field123 << 6) + 7 && arg2 >= (this.field137 << 3) + (this.field121 << 6) && arg2 <= (this.field124 << 3) + (this.field121 << 6) + 7;
        } else {
            return false;
        }
    }

    @ObfuscatedName("a.i(III)Z")
    public boolean method208(int arg0, int arg1) {
        return arg0 >= (this.field131 << 3) + (this.field125 << 6) && arg0 <= (this.field135 << 3) + (this.field125 << 6) + 7 && arg1 >= (this.field132 << 3) + (this.field126 << 6) && arg1 <= (this.field134 << 3) + (this.field126 << 6) + 7;
    }

    @ObfuscatedName("a.k(IIII)[I")
    public int[] method189(int arg0, int arg1, int arg2) {
        return this.method187(arg0, arg1, arg2) ? new int[] { this.field131 * 8 - this.field136 * 8 + this.field125 * 64 - this.field123 * 64 + arg1, this.field132 * 8 - this.field137 * 8 + this.field126 * 64 - this.field121 * 64 + arg2 } : null;
    }

    @ObfuscatedName("a.u(III)Lhd;")
    public class214 method185(int arg0, int arg1) {
        if (this.method208(arg0, arg1)) {
            int var3 = this.field136 * 8 - this.field131 * 8 + this.field123 * 64 - this.field125 * 64 + arg0;
            int var4 = this.field137 * 8 - this.field132 * 8 + this.field121 * 64 - this.field126 * 64 + arg1;
            return new class214(this.field133, var3, var4);
        } else {
            return null;
        }
    }

    @ObfuscatedName("a.n(Lky;I)V")
    public void method191(class300 arg0) {
        this.field133 = arg0.method5179();
        this.field122 = arg0.method5179();
        this.field123 = arg0.method5054();
        this.field136 = arg0.method5179();
        this.field129 = arg0.method5179();
        this.field121 = arg0.method5054();
        this.field137 = arg0.method5179();
        this.field124 = arg0.method5179();
        this.field125 = arg0.method5054();
        this.field131 = arg0.method5179();
        this.field135 = arg0.method5179();
        this.field126 = arg0.method5054();
        this.field132 = arg0.method5179();
        this.field134 = arg0.method5179();
        this.method190();
    }

    @ObfuscatedName("a.t(B)V")
    public void method190() {
    }
}
