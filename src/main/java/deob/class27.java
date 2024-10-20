package deob;

@ObfuscatedName("ax")
public class class27 implements class44 {

    @ObfuscatedName("ax.g")
    public int field389;

    @ObfuscatedName("ax.e")
    public int field377;

    @ObfuscatedName("ax.b")
    public int field378;

    @ObfuscatedName("ax.z")
    public int field379;

    @ObfuscatedName("ax.n")
    public int field380;

    @ObfuscatedName("ax.l")
    public int field388;

    @ObfuscatedName("ax.s")
    public int field382;

    @ObfuscatedName("ax.y")
    public int field383;

    @ObfuscatedName("ax.c")
    public int field384;

    @ObfuscatedName("ax.h")
    public int field385;

    @ObfuscatedName("ax.i")
    public int field376;

    @ObfuscatedName("ax.o")
    public int field387;

    @ObfuscatedName("ax.d")
    public int field391;

    @ObfuscatedName("ax.r")
    public int field381;

    @ObfuscatedName("ax.g(Las;I)V")
    public void method183(class33 arg0) {
        if (arg0.field450 > this.field380) {
            arg0.field450 = this.field380;
        }
        if (arg0.field449 < this.field380) {
            arg0.field449 = this.field380;
        }
        if (arg0.field443 > this.field388) {
            arg0.field443 = this.field388;
        }
        if (arg0.field451 < this.field388) {
            arg0.field451 = this.field388;
        }
    }

    @ObfuscatedName("ax.e(IIII)Z")
    public boolean method185(int arg0, int arg1, int arg2) {
        if (arg0 >= this.field389 && arg0 < this.field389 + this.field377) {
            return arg1 >= (this.field382 << 3) + (this.field378 << 6) && arg1 <= (this.field384 << 3) + (this.field378 << 6) + 7 && arg2 >= (this.field383 << 3) + (this.field379 << 6) && arg2 <= (this.field385 << 3) + (this.field379 << 6) + 7;
        } else {
            return false;
        }
    }

    @ObfuscatedName("ax.b(III)Z")
    public boolean method204(int arg0, int arg1) {
        return arg0 >= (this.field380 << 6) + (this.field376 << 3) && arg0 <= (this.field391 << 3) + (this.field380 << 6) + 7 && arg1 >= (this.field388 << 6) + (this.field387 << 3) && arg1 <= (this.field388 << 6) + (this.field381 << 3) + 7;
    }

    @ObfuscatedName("ax.z(IIIB)[I")
    public int[] method186(int arg0, int arg1, int arg2) {
        return this.method185(arg0, arg1, arg2) ? new int[] { this.field376 * 8 - this.field382 * 8 + this.field380 * 64 - this.field378 * 64 + arg1, this.field387 * 8 - this.field383 * 8 + this.field388 * 64 - this.field379 * 64 + arg2 } : null;
    }

    @ObfuscatedName("ax.n(IIB)Lio;")
    public class239 method182(int arg0, int arg1) {
        if (this.method204(arg0, arg1)) {
            int var3 = this.field382 * 8 - this.field376 * 8 + this.field378 * 64 - this.field380 * 64 + arg0;
            int var4 = this.field383 * 8 - this.field387 * 8 + this.field379 * 64 - this.field388 * 64 + arg1;
            return new class239(this.field389, var3, var4);
        } else {
            return null;
        }
    }

    @ObfuscatedName("ax.l(Lgg;B)V")
    public void method188(class195 arg0) {
        this.field389 = arg0.method3332();
        this.field377 = arg0.method3332();
        this.field378 = arg0.method3310();
        this.field382 = arg0.method3332();
        this.field384 = arg0.method3332();
        this.field379 = arg0.method3310();
        this.field383 = arg0.method3332();
        this.field385 = arg0.method3332();
        this.field380 = arg0.method3310();
        this.field376 = arg0.method3332();
        this.field391 = arg0.method3332();
        this.field388 = arg0.method3310();
        this.field387 = arg0.method3332();
        this.field381 = arg0.method3332();
        this.method189();
    }

    @ObfuscatedName("ax.s(B)V")
    public void method189() {
    }
}
