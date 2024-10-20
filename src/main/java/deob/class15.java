package deob;

@ObfuscatedName("x")
public class class15 implements class32 {

    @ObfuscatedName("x.g")
    public int field126;

    @ObfuscatedName("x.r")
    public int field118;

    @ObfuscatedName("x.e")
    public int field119;

    @ObfuscatedName("x.q")
    public int field120;

    @ObfuscatedName("x.c")
    public int field121;

    @ObfuscatedName("x.l")
    public int field131;

    @ObfuscatedName("x.b")
    public int field123;

    @ObfuscatedName("x.w")
    public int field124;

    @ObfuscatedName("x.n")
    public int field130;

    @ObfuscatedName("x.i")
    public int field125;

    @ObfuscatedName("x.p")
    public int field127;

    @ObfuscatedName("x.m")
    public int field122;

    @ObfuscatedName("x.d")
    public int field132;

    @ObfuscatedName("x.j")
    public int field134;

    @ObfuscatedName("x.g(Lk;B)V")
    public void method147(class21 arg0) {
        if (arg0.field199 > this.field121) {
            arg0.field199 = this.field121;
        }
        if (arg0.field200 < this.field121) {
            arg0.field200 = this.field121;
        }
        if (arg0.field195 > this.field131) {
            arg0.field195 = this.field131;
        }
        if (arg0.field204 < this.field131) {
            arg0.field204 = this.field131;
        }
    }

    @ObfuscatedName("x.r(IIIB)Z")
    public boolean method148(int arg0, int arg1, int arg2) {
        if (arg0 >= this.field126 && arg0 < this.field126 + this.field118) {
            return arg1 >= (this.field123 << 3) + (this.field119 << 6) && arg1 <= (this.field130 << 3) + (this.field119 << 6) + 7 && arg2 >= (this.field124 << 3) + (this.field120 << 6) && arg2 <= (this.field125 << 3) + (this.field120 << 6) + 7;
        } else {
            return false;
        }
    }

    @ObfuscatedName("x.e(IIB)Z")
    public boolean method149(int arg0, int arg1) {
        return arg0 >= (this.field127 << 3) + (this.field121 << 6) && arg0 <= (this.field132 << 3) + (this.field121 << 6) + 7 && arg1 >= (this.field131 << 6) + (this.field122 << 3) && arg1 <= (this.field134 << 3) + (this.field131 << 6) + 7;
    }

    @ObfuscatedName("x.q(IIII)[I")
    public int[] method150(int arg0, int arg1, int arg2) {
        return this.method148(arg0, arg1, arg2) ? new int[] { this.field127 * 8 - this.field123 * 8 + this.field121 * 64 - this.field119 * 64 + arg1, this.field122 * 8 - this.field124 * 8 + this.field131 * 64 - this.field120 * 64 + arg2 } : null;
    }

    @ObfuscatedName("x.c(IIB)Lhz;")
    public class229 method153(int arg0, int arg1) {
        if (this.method149(arg0, arg1)) {
            int var3 = this.field123 * 8 - this.field127 * 8 + this.field119 * 64 - this.field121 * 64 + arg0;
            int var4 = this.field124 * 8 - this.field122 * 8 + this.field120 * 64 - this.field131 * 64 + arg1;
            return new class229(this.field126, var3, var4);
        } else {
            return null;
        }
    }

    @ObfuscatedName("x.i(Lgl;I)V")
    public void method151(class185 arg0) {
        this.field126 = arg0.method3679();
        this.field118 = arg0.method3679();
        this.field119 = arg0.method3467();
        this.field123 = arg0.method3679();
        this.field130 = arg0.method3679();
        this.field120 = arg0.method3467();
        this.field124 = arg0.method3679();
        this.field125 = arg0.method3679();
        this.field121 = arg0.method3467();
        this.field127 = arg0.method3679();
        this.field132 = arg0.method3679();
        this.field131 = arg0.method3467();
        this.field122 = arg0.method3679();
        this.field134 = arg0.method3679();
        this.method169();
    }

    @ObfuscatedName("x.p(I)V")
    public void method169() {
    }
}
