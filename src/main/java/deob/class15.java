package deob;

@ObfuscatedName("g")
public class class15 implements class32 {

    @ObfuscatedName("g.f")
    public int field116;

    @ObfuscatedName("g.l")
    public int field125;

    @ObfuscatedName("g.w")
    public int field115;

    @ObfuscatedName("g.s")
    public int field114;

    @ObfuscatedName("g.e")
    public int field126;

    @ObfuscatedName("g.a")
    public int field118;

    @ObfuscatedName("g.c")
    public int field123;

    @ObfuscatedName("g.p")
    public int field127;

    @ObfuscatedName("g.r")
    public int field121;

    @ObfuscatedName("g.m")
    public int field122;

    @ObfuscatedName("g.d")
    public int field117;

    @ObfuscatedName("g.z")
    public int field124;

    @ObfuscatedName("g.x")
    public int field119;

    @ObfuscatedName("g.v")
    public int field120;

    @ObfuscatedName("g.f(Lh;B)V")
    public void method121(class21 arg0) {
        if (arg0.field191 > this.field126) {
            arg0.field191 = this.field126;
        }
        if (arg0.field192 < this.field126) {
            arg0.field192 = this.field126;
        }
        if (arg0.field187 > this.field118) {
            arg0.field187 = this.field118;
        }
        if (arg0.field194 < this.field118) {
            arg0.field194 = this.field118;
        }
    }

    @ObfuscatedName("g.l(IIIB)Z")
    public boolean method122(int arg0, int arg1, int arg2) {
        if (arg0 >= this.field116 && arg0 < this.field125 + this.field116) {
            return arg1 >= (this.field123 << 3) + (this.field115 << 6) && arg1 <= (this.field121 << 3) + (this.field115 << 6) + 7 && arg2 >= (this.field127 << 3) + (this.field114 << 6) && arg2 <= (this.field122 << 3) + (this.field114 << 6) + 7;
        } else {
            return false;
        }
    }

    @ObfuscatedName("g.w(IIB)Z")
    public boolean method131(int arg0, int arg1) {
        return arg0 >= (this.field126 << 6) + (this.field117 << 3) && arg0 <= (this.field126 << 6) + (this.field119 << 3) + 7 && arg1 >= (this.field124 << 3) + (this.field118 << 6) && arg1 <= (this.field120 << 3) + (this.field118 << 6) + 7;
    }

    @ObfuscatedName("g.s(IIII)[I")
    public int[] method124(int arg0, int arg1, int arg2) {
        return this.method122(arg0, arg1, arg2) ? new int[] { this.field117 * 8 - this.field123 * 8 + this.field126 * 64 - this.field115 * 64 + arg1, this.field124 * 8 - this.field127 * 8 + this.field118 * 64 - this.field114 * 64 + arg2 } : null;
    }

    @ObfuscatedName("g.e(IIB)Lhx;")
    public class229 method125(int arg0, int arg1) {
        if (this.method131(arg0, arg1)) {
            int var3 = this.field123 * 8 - this.field117 * 8 + this.field115 * 64 - this.field126 * 64 + arg0;
            int var4 = this.field127 * 8 - this.field124 * 8 + this.field114 * 64 - this.field118 * 64 + arg1;
            return new class229(this.field116, var3, var4);
        } else {
            return null;
        }
    }

    @ObfuscatedName("g.c(Lgm;I)V")
    public void method126(class185 arg0) {
        this.field116 = arg0.method3344();
        this.field125 = arg0.method3344();
        this.field115 = arg0.method3346();
        this.field123 = arg0.method3344();
        this.field121 = arg0.method3344();
        this.field114 = arg0.method3346();
        this.field127 = arg0.method3344();
        this.field122 = arg0.method3344();
        this.field126 = arg0.method3346();
        this.field117 = arg0.method3344();
        this.field119 = arg0.method3344();
        this.field118 = arg0.method3346();
        this.field124 = arg0.method3344();
        this.field120 = arg0.method3344();
        this.method127();
    }

    @ObfuscatedName("g.p(B)V")
    public void method127() {
    }
}
