package deob;

@ObfuscatedName("j")
public class class25 implements class38 {

    @ObfuscatedName("j.a")
    public int field215;

    @ObfuscatedName("j.s")
    public int field206;

    @ObfuscatedName("j.g")
    public int field207;

    @ObfuscatedName("j.x")
    public int field208;

    @ObfuscatedName("j.h")
    public int field209;

    @ObfuscatedName("j.f")
    public int field214;

    @ObfuscatedName("j.p")
    public int field205;

    @ObfuscatedName("j.m")
    public int field216;

    @ObfuscatedName("j.q")
    public int field211;

    @ObfuscatedName("j.b")
    public int field210;

    @ObfuscatedName("j.a(Lag;B)V")
    public void method242(class27 arg0) {
        if (arg0.field238 > this.field205) {
            arg0.field238 = this.field205;
        }
        if (arg0.field233 < this.field211) {
            arg0.field233 = this.field211;
        }
        if (arg0.field236 > this.field216) {
            arg0.field236 = this.field216;
        }
        if (arg0.field237 < this.field210) {
            arg0.field237 = this.field210;
        }
    }

    @ObfuscatedName("j.s(IIII)Z")
    public boolean method227(int arg0, int arg1, int arg2) {
        if (arg0 >= this.field215 && arg0 < this.field215 + this.field206) {
            return arg1 >> 6 >= this.field207 && arg1 >> 6 <= this.field209 && arg2 >> 6 >= this.field208 && arg2 >> 6 <= this.field214;
        } else {
            return false;
        }
    }

    @ObfuscatedName("j.g(III)Z")
    public boolean method219(int arg0, int arg1) {
        return arg0 >> 6 >= this.field205 && arg0 >> 6 <= this.field211 && arg1 >> 6 >= this.field216 && arg1 >> 6 <= this.field210;
    }

    @ObfuscatedName("j.x(IIIB)[I")
    public int[] method241(int arg0, int arg1, int arg2) {
        return this.method227(arg0, arg1, arg2) ? new int[] { this.field205 * 64 - this.field207 * 64 + arg1, this.field216 * 64 - this.field208 * 64 + arg2 } : null;
    }

    @ObfuscatedName("j.h(III)Lif;")
    public class235 method221(int arg0, int arg1) {
        if (this.method219(arg0, arg1)) {
            int var3 = this.field207 * 64 - this.field205 * 64 + arg0;
            int var4 = this.field208 * 64 - this.field216 * 64 + arg1;
            return new class235(this.field215, var3, var4);
        } else {
            return null;
        }
    }

    @ObfuscatedName("j.f(Lgx;B)V")
    public void method230(class190 arg0) {
        this.field215 = arg0.method3443();
        this.field206 = arg0.method3443();
        this.field207 = arg0.method3610();
        this.field208 = arg0.method3610();
        this.field209 = arg0.method3610();
        this.field214 = arg0.method3610();
        this.field205 = arg0.method3610();
        this.field216 = arg0.method3610();
        this.field211 = arg0.method3610();
        this.field210 = arg0.method3610();
        this.method286();
    }

    @ObfuscatedName("j.p(B)V")
    public void method286() {
    }
}
