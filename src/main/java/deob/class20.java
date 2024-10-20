package deob;

@ObfuscatedName("v")
public class class20 implements class38 {

    @ObfuscatedName("v.a")
    public int field140;

    @ObfuscatedName("v.s")
    public int field152;

    @ObfuscatedName("v.g")
    public int field153;

    @ObfuscatedName("v.x")
    public int field141;

    @ObfuscatedName("v.h")
    public int field142;

    @ObfuscatedName("v.f")
    public int field143;

    @ObfuscatedName("v.p")
    public int field144;

    @ObfuscatedName("v.m")
    public int field145;

    @ObfuscatedName("v.q")
    public int field146;

    @ObfuscatedName("v.b")
    public int field151;

    @ObfuscatedName("v.n")
    public int field148;

    @ObfuscatedName("v.e")
    public int field149;

    @ObfuscatedName("v.r")
    public int field150;

    @ObfuscatedName("v.t")
    public int field139;

    @ObfuscatedName("v.a(Lag;B)V")
    public void method242(class27 arg0) {
        if (arg0.field238 > this.field142) {
            arg0.field238 = this.field142;
        }
        if (arg0.field233 < this.field142) {
            arg0.field233 = this.field142;
        }
        if (arg0.field236 > this.field143) {
            arg0.field236 = this.field143;
        }
        if (arg0.field237 < this.field143) {
            arg0.field237 = this.field143;
        }
    }

    @ObfuscatedName("v.s(IIII)Z")
    public boolean method227(int arg0, int arg1, int arg2) {
        if (arg0 >= this.field140 && arg0 < this.field152 + this.field140) {
            return arg1 >= (this.field153 << 6) + (this.field144 << 3) && arg1 <= (this.field153 << 6) + (this.field146 << 3) + 7 && arg2 >= (this.field145 << 3) + (this.field141 << 6) && arg2 <= (this.field151 << 3) + (this.field141 << 6) + 7;
        } else {
            return false;
        }
    }

    @ObfuscatedName("v.g(III)Z")
    public boolean method219(int arg0, int arg1) {
        return arg0 >= (this.field148 << 3) + (this.field142 << 6) && arg0 <= (this.field150 << 3) + (this.field142 << 6) + 7 && arg1 >= (this.field149 << 3) + (this.field143 << 6) && arg1 <= (this.field143 << 6) + (this.field139 << 3) + 7;
    }

    @ObfuscatedName("v.x(IIIB)[I")
    public int[] method241(int arg0, int arg1, int arg2) {
        return this.method227(arg0, arg1, arg2) ? new int[] { this.field148 * 8 - this.field144 * 8 + this.field142 * 64 - this.field153 * 64 + arg1, this.field149 * 8 - this.field145 * 8 + this.field143 * 64 - this.field141 * 64 + arg2 } : null;
    }

    @ObfuscatedName("v.h(III)Lif;")
    public class235 method221(int arg0, int arg1) {
        if (this.method219(arg0, arg1)) {
            int var3 = this.field144 * 8 - this.field148 * 8 + this.field153 * 64 - this.field142 * 64 + arg0;
            int var4 = this.field145 * 8 - this.field149 * 8 + this.field141 * 64 - this.field143 * 64 + arg1;
            return new class235(this.field140, var3, var4);
        } else {
            return null;
        }
    }

    @ObfuscatedName("v.f(Lgx;B)V")
    public void method230(class190 arg0) {
        this.field140 = arg0.method3443();
        this.field152 = arg0.method3443();
        this.field153 = arg0.method3610();
        this.field144 = arg0.method3443();
        this.field146 = arg0.method3443();
        this.field141 = arg0.method3610();
        this.field145 = arg0.method3443();
        this.field151 = arg0.method3443();
        this.field142 = arg0.method3610();
        this.field148 = arg0.method3443();
        this.field150 = arg0.method3443();
        this.field143 = arg0.method3610();
        this.field149 = arg0.method3443();
        this.field139 = arg0.method3443();
        this.method223();
    }

    @ObfuscatedName("v.p(B)V")
    public void method223() {
    }
}
