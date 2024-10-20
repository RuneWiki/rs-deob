package deob;

@ObfuscatedName("b")
public class class20 implements class38 {

    @ObfuscatedName("b.a")
    public int field133;

    @ObfuscatedName("b.t")
    public int field121;

    @ObfuscatedName("b.n")
    public int field122;

    @ObfuscatedName("b.q")
    public int field123;

    @ObfuscatedName("b.v")
    public int field124;

    @ObfuscatedName("b.l")
    public int field125;

    @ObfuscatedName("b.c")
    public int field126;

    @ObfuscatedName("b.o")
    public int field127;

    @ObfuscatedName("b.i")
    public int field128;

    @ObfuscatedName("b.d")
    public int field129;

    @ObfuscatedName("b.m")
    public int field120;

    @ObfuscatedName("b.p")
    public int field131;

    @ObfuscatedName("b.h")
    public int field132;

    @ObfuscatedName("b.k")
    public int field130;

    @ObfuscatedName("b.a(Laa;B)V")
    public void method248(class27 arg0) {
        if (arg0.field209 > this.field124) {
            arg0.field209 = this.field124;
        }
        if (arg0.field208 < this.field124) {
            arg0.field208 = this.field124;
        }
        if (arg0.field211 > this.field125) {
            arg0.field211 = this.field125;
        }
        if (arg0.field210 < this.field125) {
            arg0.field210 = this.field125;
        }
    }

    @ObfuscatedName("b.t(IIII)Z")
    public boolean method225(int arg0, int arg1, int arg2) {
        if (arg0 >= this.field133 && arg0 < this.field133 + this.field121) {
            return arg1 >= (this.field126 << 3) + (this.field122 << 6) && arg1 <= (this.field128 << 3) + (this.field122 << 6) + 7 && arg2 >= (this.field127 << 3) + (this.field123 << 6) && arg2 <= (this.field129 << 3) + (this.field123 << 6) + 7;
        } else {
            return false;
        }
    }

    @ObfuscatedName("b.n(III)Z")
    public boolean method226(int arg0, int arg1) {
        return arg0 >= (this.field124 << 6) + (this.field120 << 3) && arg0 <= (this.field132 << 3) + (this.field124 << 6) + 7 && arg1 >= (this.field131 << 3) + (this.field125 << 6) && arg1 <= (this.field130 << 3) + (this.field125 << 6) + 7;
    }

    @ObfuscatedName("b.q(IIII)[I")
    public int[] method233(int arg0, int arg1, int arg2) {
        return this.method225(arg0, arg1, arg2) ? new int[] { this.field120 * 8 - this.field126 * 8 + this.field124 * 64 - this.field122 * 64 + arg1, this.field131 * 8 - this.field127 * 8 + this.field125 * 64 - this.field123 * 64 + arg2 } : null;
    }

    @ObfuscatedName("b.v(IIS)Lhf;")
    public class214 method227(int arg0, int arg1) {
        if (this.method226(arg0, arg1)) {
            int var3 = this.field126 * 8 - this.field120 * 8 + this.field122 * 64 - this.field124 * 64 + arg0;
            int var4 = this.field127 * 8 - this.field131 * 8 + this.field123 * 64 - this.field125 * 64 + arg1;
            return new class214(this.field133, var3, var4);
        } else {
            return null;
        }
    }

    @ObfuscatedName("b.l(Lkc;I)V")
    public void method229(class300 arg0) {
        this.field133 = arg0.method5123();
        this.field121 = arg0.method5123();
        this.field122 = arg0.method5166();
        this.field126 = arg0.method5123();
        this.field128 = arg0.method5123();
        this.field123 = arg0.method5166();
        this.field127 = arg0.method5123();
        this.field129 = arg0.method5123();
        this.field124 = arg0.method5166();
        this.field120 = arg0.method5123();
        this.field132 = arg0.method5123();
        this.field125 = arg0.method5166();
        this.field131 = arg0.method5123();
        this.field130 = arg0.method5123();
        this.method230();
    }

    @ObfuscatedName("b.c(B)V")
    public void method230() {
    }
}
