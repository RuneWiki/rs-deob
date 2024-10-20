package deob;

@ObfuscatedName("y")
public class class20 implements class38 {

    @ObfuscatedName("y.m")
    public int field132;

    @ObfuscatedName("y.f")
    public int field128;

    @ObfuscatedName("y.q")
    public int field118;

    @ObfuscatedName("y.w")
    public int field119;

    @ObfuscatedName("y.o")
    public int field116;

    @ObfuscatedName("y.u")
    public int field125;

    @ObfuscatedName("y.g")
    public int field122;

    @ObfuscatedName("y.l")
    public int field123;

    @ObfuscatedName("y.e")
    public int field124;

    @ObfuscatedName("y.x")
    public int field126;

    @ObfuscatedName("y.d")
    public int field117;

    @ObfuscatedName("y.k")
    public int field120;

    @ObfuscatedName("y.n")
    public int field121;

    @ObfuscatedName("y.i")
    public int field129;

    @ObfuscatedName("y.m(Lag;I)V")
    public void method204(class27 arg0) {
        if (arg0.field211 > this.field116) {
            arg0.field211 = this.field116;
        }
        if (arg0.field212 < this.field116) {
            arg0.field212 = this.field116;
        }
        if (arg0.field218 > this.field125) {
            arg0.field218 = this.field125;
        }
        if (arg0.field214 < this.field125) {
            arg0.field214 = this.field125;
        }
    }

    @ObfuscatedName("y.f(IIIB)Z")
    public boolean method205(int arg0, int arg1, int arg2) {
        if (arg0 >= this.field132 && arg0 < this.field132 + this.field128) {
            return arg1 >= (this.field122 << 3) + (this.field118 << 6) && arg1 <= (this.field124 << 3) + (this.field118 << 6) + 7 && arg2 >= (this.field123 << 3) + (this.field119 << 6) && arg2 <= (this.field126 << 3) + (this.field119 << 6) + 7;
        } else {
            return false;
        }
    }

    @ObfuscatedName("y.q(IIB)Z")
    public boolean method223(int arg0, int arg1) {
        return arg0 >= (this.field117 << 3) + (this.field116 << 6) && arg0 <= (this.field121 << 3) + (this.field116 << 6) + 7 && arg1 >= (this.field125 << 6) + (this.field120 << 3) && arg1 <= (this.field129 << 3) + (this.field125 << 6) + 7;
    }

    @ObfuscatedName("y.w(IIII)[I")
    public int[] method209(int arg0, int arg1, int arg2) {
        return this.method205(arg0, arg1, arg2) ? new int[] { this.field117 * 8 - this.field122 * 8 + this.field116 * 64 - this.field118 * 64 + arg1, this.field120 * 8 - this.field123 * 8 + this.field125 * 64 - this.field119 * 64 + arg2 } : null;
    }

    @ObfuscatedName("y.o(III)Lhu;")
    public class225 method207(int arg0, int arg1) {
        if (this.method223(arg0, arg1)) {
            int var3 = this.field122 * 8 - this.field117 * 8 + this.field118 * 64 - this.field116 * 64 + arg0;
            int var4 = this.field123 * 8 - this.field120 * 8 + this.field119 * 64 - this.field125 * 64 + arg1;
            return new class225(this.field132, var3, var4);
        } else {
            return null;
        }
    }

    @ObfuscatedName("y.u(Lgr;B)V")
    public void method208(class202 arg0) {
        this.field132 = arg0.method3551();
        this.field128 = arg0.method3551();
        this.field118 = arg0.method3530();
        this.field122 = arg0.method3551();
        this.field124 = arg0.method3551();
        this.field119 = arg0.method3530();
        this.field123 = arg0.method3551();
        this.field126 = arg0.method3551();
        this.field116 = arg0.method3530();
        this.field117 = arg0.method3551();
        this.field121 = arg0.method3551();
        this.field125 = arg0.method3530();
        this.field120 = arg0.method3551();
        this.field129 = arg0.method3551();
        this.method219();
    }

    @ObfuscatedName("y.g(I)V")
    public void method219() {
    }
}
