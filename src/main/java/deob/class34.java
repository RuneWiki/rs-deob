package deob;

@ObfuscatedName("an")
public class class34 implements class38 {

    @ObfuscatedName("an.a")
    public int field293;

    @ObfuscatedName("an.s")
    public int field290;

    @ObfuscatedName("an.g")
    public int field289;

    @ObfuscatedName("an.x")
    public int field291;

    @ObfuscatedName("an.h")
    public int field288;

    @ObfuscatedName("an.f")
    public int field292;

    @ObfuscatedName("an.a(Lag;B)V")
    public void method242(class27 arg0) {
        if (arg0.field238 > this.field288) {
            arg0.field238 = this.field288;
        }
        if (arg0.field233 < this.field288) {
            arg0.field233 = this.field288;
        }
        if (arg0.field236 > this.field292) {
            arg0.field236 = this.field292;
        }
        if (arg0.field237 < this.field292) {
            arg0.field237 = this.field292;
        }
    }

    @ObfuscatedName("an.s(IIII)Z")
    public boolean method227(int arg0, int arg1, int arg2) {
        if (arg0 >= this.field293 && arg0 < this.field293 + this.field290) {
            return arg1 >> 6 == this.field289 && arg2 >> 6 == this.field291;
        } else {
            return false;
        }
    }

    @ObfuscatedName("an.g(III)Z")
    public boolean method219(int arg0, int arg1) {
        return arg0 >> 6 == this.field288 && arg1 >> 6 == this.field292;
    }

    @ObfuscatedName("an.x(IIIB)[I")
    public int[] method241(int arg0, int arg1, int arg2) {
        return this.method227(arg0, arg1, arg2) ? new int[] { this.field288 * 64 - this.field289 * 64 + arg1, this.field292 * 64 - this.field291 * 64 + arg2 } : null;
    }

    @ObfuscatedName("an.h(III)Lif;")
    public class235 method221(int arg0, int arg1) {
        if (this.method219(arg0, arg1)) {
            int var3 = this.field289 * 64 - this.field288 * 64 + arg0;
            int var4 = this.field291 * 64 - this.field292 * 64 + arg1;
            return new class235(this.field293, var3, var4);
        } else {
            return null;
        }
    }

    @ObfuscatedName("an.f(Lgx;B)V")
    public void method230(class190 arg0) {
        this.field293 = arg0.method3443();
        this.field290 = arg0.method3443();
        this.field289 = arg0.method3610();
        this.field291 = arg0.method3610();
        this.field288 = arg0.method3610();
        this.field292 = arg0.method3610();
        this.method518();
    }

    @ObfuscatedName("an.p(B)V")
    public void method518() {
    }
}
