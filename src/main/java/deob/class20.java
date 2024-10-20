package deob;

@ObfuscatedName("u")
public class class20 implements class38 {

    @ObfuscatedName("u.f")
    public int field119;

    @ObfuscatedName("u.i")
    public int field120;

    @ObfuscatedName("u.y")
    public int field121;

    @ObfuscatedName("u.w")
    public int field122;

    @ObfuscatedName("u.p")
    public int field125;

    @ObfuscatedName("u.b")
    public int field127;

    @ObfuscatedName("u.e")
    public int field131;

    @ObfuscatedName("u.x")
    public int field126;

    @ObfuscatedName("u.a")
    public int field129;

    @ObfuscatedName("u.d")
    public int field128;

    @ObfuscatedName("u.c")
    public int field124;

    @ObfuscatedName("u.o")
    public int field130;

    @ObfuscatedName("u.v")
    public int field123;

    @ObfuscatedName("u.k")
    public int field132;

    @ObfuscatedName("u.f(Laa;I)V")
    public void method185(class27 arg0) {
        if (arg0.field208 > this.field125) {
            arg0.field208 = this.field125;
        }
        if (arg0.field209 < this.field125) {
            arg0.field209 = this.field125;
        }
        if (arg0.field210 > this.field127) {
            arg0.field210 = this.field127;
        }
        if (arg0.field202 < this.field127) {
            arg0.field202 = this.field127;
        }
    }

    @ObfuscatedName("u.i(IIII)Z")
    public boolean method191(int arg0, int arg1, int arg2) {
        if (arg0 >= this.field119 && arg0 < this.field120 + this.field119) {
            return arg1 >= (this.field131 << 3) + (this.field121 << 6) && arg1 <= (this.field129 << 3) + (this.field121 << 6) + 7 && arg2 >= (this.field126 << 3) + (this.field122 << 6) && arg2 <= (this.field128 << 3) + (this.field122 << 6) + 7;
        } else {
            return false;
        }
    }

    @ObfuscatedName("u.y(IIB)Z")
    public boolean method187(int arg0, int arg1) {
        return arg0 >= (this.field125 << 6) + (this.field124 << 3) && arg0 <= (this.field125 << 6) + (this.field123 << 3) + 7 && arg1 >= (this.field130 << 3) + (this.field127 << 6) && arg1 <= (this.field132 << 3) + (this.field127 << 6) + 7;
    }

    @ObfuscatedName("u.w(IIII)[I")
    public int[] method188(int arg0, int arg1, int arg2) {
        return this.method191(arg0, arg1, arg2) ? new int[] { this.field124 * 8 - this.field131 * 8 + this.field125 * 64 - this.field121 * 64 + arg1, this.field130 * 8 - this.field126 * 8 + this.field127 * 64 - this.field122 * 64 + arg2 } : null;
    }

    @ObfuscatedName("u.p(IIB)Lht;")
    public class214 method189(int arg0, int arg1) {
        if (this.method187(arg0, arg1)) {
            int var3 = this.field131 * 8 - this.field124 * 8 + this.field121 * 64 - this.field125 * 64 + arg0;
            int var4 = this.field126 * 8 - this.field130 * 8 + this.field122 * 64 - this.field127 * 64 + arg1;
            return new class214(this.field119, var3, var4);
        } else {
            return null;
        }
    }

    @ObfuscatedName("u.b(Lkq;B)V")
    public void method207(class300 arg0) {
        this.field119 = arg0.method5110();
        this.field120 = arg0.method5110();
        this.field121 = arg0.method5112();
        this.field131 = arg0.method5110();
        this.field129 = arg0.method5110();
        this.field122 = arg0.method5112();
        this.field126 = arg0.method5110();
        this.field128 = arg0.method5110();
        this.field125 = arg0.method5112();
        this.field124 = arg0.method5110();
        this.field123 = arg0.method5110();
        this.field127 = arg0.method5112();
        this.field130 = arg0.method5110();
        this.field132 = arg0.method5110();
        this.method190();
    }

    @ObfuscatedName("u.e(I)V")
    public void method190() {
    }
}
