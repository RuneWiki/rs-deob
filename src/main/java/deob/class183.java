package deob;

@ObfuscatedName("gg")
public class class183 implements class186 {

    @ObfuscatedName("gg.v")
    public int field2123;

    @ObfuscatedName("gg.n")
    public int field2121;

    @ObfuscatedName("gg.f")
    public int field2122;

    @ObfuscatedName("gg.y")
    public int field2126;

    @ObfuscatedName("gg.p")
    public int field2124;

    @ObfuscatedName("gg.j")
    public int field2125;

    @ObfuscatedName("gg.v(Lfo;I)V")
    public void method2996(class166 arg0) {
        if (arg0.field1968 > this.field2124) {
            arg0.field1968 = this.field2124;
        }
        if (arg0.field1959 < this.field2124) {
            arg0.field1959 = this.field2124;
        }
        if (arg0.field1967 > this.field2125) {
            arg0.field1967 = this.field2125;
        }
        if (arg0.field1966 < this.field2125) {
            arg0.field1966 = this.field2125;
        }
    }

    @ObfuscatedName("gg.n(IIII)Z")
    public boolean method2995(int arg0, int arg1, int arg2) {
        if (arg0 >= this.field2123 && arg0 < this.field2123 + this.field2121) {
            return arg1 >> 6 == this.field2122 && arg2 >> 6 == this.field2126;
        } else {
            return false;
        }
    }

    @ObfuscatedName("gg.f(IIB)Z")
    public boolean method2998(int arg0, int arg1) {
        return arg0 >> 6 == this.field2124 && arg1 >> 6 == this.field2125;
    }

    @ObfuscatedName("gg.y(IIII)[I")
    public int[] method3002(int arg0, int arg1, int arg2) {
        return this.method2995(arg0, arg1, arg2) ? new int[] { this.field2124 * 64 - this.field2122 * 64 + arg1, this.field2125 * 64 - this.field2126 * 64 + arg2 } : null;
    }

    @ObfuscatedName("gg.p(III)Lii;")
    public class243 method3000(int arg0, int arg1) {
        if (this.method2998(arg0, arg1)) {
            int var3 = this.field2122 * 64 - this.field2124 * 64 + arg0;
            int var4 = this.field2126 * 64 - this.field2125 * 64 + arg1;
            return new class243(this.field2123, var3, var4);
        } else {
            return null;
        }
    }

    @ObfuscatedName("gg.j(Lnd;I)V")
    public void method3001(class383 arg0) {
        this.field2123 = arg0.method5965();
        this.field2121 = arg0.method5965();
        this.field2122 = arg0.method5967();
        this.field2126 = arg0.method5967();
        this.field2124 = arg0.method5967();
        this.field2125 = arg0.method5967();
        this.method3337();
    }

    @ObfuscatedName("gg.r(I)V")
    public void method3337() {
    }
}
