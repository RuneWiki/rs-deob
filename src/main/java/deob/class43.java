package deob;

@ObfuscatedName("aq")
public class class43 implements class38 {

    @ObfuscatedName("aq.a")
    public int field368;

    @ObfuscatedName("aq.s")
    public int field369;

    @ObfuscatedName("aq.g")
    public int field370;

    @ObfuscatedName("aq.x")
    public int field381;

    @ObfuscatedName("aq.h")
    public int field372;

    @ObfuscatedName("aq.f")
    public int field371;

    @ObfuscatedName("aq.p")
    public int field374;

    @ObfuscatedName("aq.m")
    public int field375;

    @ObfuscatedName("aq.q")
    public int field380;

    @ObfuscatedName("aq.b")
    public int field373;

    @ObfuscatedName("aq.a(Lag;B)V")
    public void method242(class27 arg0) {
        if (arg0.field238 > this.field372) {
            arg0.field238 = this.field372;
        }
        if (arg0.field233 < this.field372) {
            arg0.field233 = this.field372;
        }
        if (arg0.field236 > this.field371) {
            arg0.field236 = this.field371;
        }
        if (arg0.field237 < this.field371) {
            arg0.field237 = this.field371;
        }
    }

    @ObfuscatedName("aq.s(IIII)Z")
    public boolean method227(int arg0, int arg1, int arg2) {
        if (arg0 >= this.field368 && arg0 < this.field369 + this.field368) {
            return arg1 >= (this.field374 << 3) + (this.field370 << 6) && arg1 <= (this.field374 << 3) + (this.field370 << 6) + 7 && arg2 >= (this.field381 << 6) + (this.field375 << 3) && arg2 <= (this.field381 << 6) + (this.field375 << 3) + 7;
        } else {
            return false;
        }
    }

    @ObfuscatedName("aq.g(III)Z")
    public boolean method219(int arg0, int arg1) {
        return arg0 >= (this.field380 << 3) + (this.field372 << 6) && arg0 <= (this.field380 << 3) + (this.field372 << 6) + 7 && arg1 >= (this.field373 << 3) + (this.field371 << 6) && arg1 <= (this.field373 << 3) + (this.field371 << 6) + 7;
    }

    @ObfuscatedName("aq.x(IIIB)[I")
    public int[] method241(int arg0, int arg1, int arg2) {
        return this.method227(arg0, arg1, arg2) ? new int[] { this.field380 * 8 - this.field374 * 8 + this.field372 * 64 - this.field370 * 64 + arg1, this.field373 * 8 - this.field375 * 8 + this.field371 * 64 - this.field381 * 64 + arg2 } : null;
    }

    @ObfuscatedName("aq.h(III)Lif;")
    public class235 method221(int arg0, int arg1) {
        if (this.method219(arg0, arg1)) {
            int var3 = this.field374 * 8 - this.field380 * 8 + this.field370 * 64 - this.field372 * 64 + arg0;
            int var4 = this.field375 * 8 - this.field373 * 8 + this.field381 * 64 - this.field371 * 64 + arg1;
            return new class235(this.field368, var3, var4);
        } else {
            return null;
        }
    }

    @ObfuscatedName("aq.f(Lgx;B)V")
    public void method230(class190 arg0) {
        this.field368 = arg0.method3443();
        this.field369 = arg0.method3443();
        this.field370 = arg0.method3610();
        this.field374 = arg0.method3443();
        this.field381 = arg0.method3610();
        this.field375 = arg0.method3443();
        this.field372 = arg0.method3610();
        this.field380 = arg0.method3443();
        this.field371 = arg0.method3610();
        this.field373 = arg0.method3443();
        this.method662();
    }

    @ObfuscatedName("aq.p(I)V")
    public void method662() {
    }
}
