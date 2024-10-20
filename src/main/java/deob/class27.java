package deob;

@ObfuscatedName("ah")
public class class27 implements class43 {

    @ObfuscatedName("ah.d")
    public int field365;

    @ObfuscatedName("ah.x")
    public int field363;

    @ObfuscatedName("ah.k")
    public int field356;

    @ObfuscatedName("ah.z")
    public int field357;

    @ObfuscatedName("ah.v")
    public int field355;

    @ObfuscatedName("ah.m")
    public int field359;

    @ObfuscatedName("ah.b")
    public int field354;

    @ObfuscatedName("ah.t")
    public int field358;

    @ObfuscatedName("ah.p")
    public int field360;

    @ObfuscatedName("ah.r")
    public int field362;

    @ObfuscatedName("ah.l")
    public int field364;

    @ObfuscatedName("ah.u")
    public int field361;

    @ObfuscatedName("ah.n")
    public int field366;

    @ObfuscatedName("ah.c")
    public int field367;

    @ObfuscatedName("ah.d(Lal;I)V")
    public void method193(class33 arg0) {
        if (arg0.field428 > this.field355) {
            arg0.field428 = this.field355;
        }
        if (arg0.field432 < this.field355) {
            arg0.field432 = this.field355;
        }
        if (arg0.field429 > this.field359) {
            arg0.field429 = this.field359;
        }
        if (arg0.field437 < this.field359) {
            arg0.field437 = this.field359;
        }
    }

    @ObfuscatedName("ah.x(IIII)Z")
    public boolean method184(int arg0, int arg1, int arg2) {
        if (arg0 >= this.field365 && arg0 < this.field365 + this.field363) {
            return arg1 >= (this.field356 << 6) + (this.field354 << 3) && arg1 <= (this.field360 << 3) + (this.field356 << 6) + 7 && arg2 >= (this.field358 << 3) + (this.field357 << 6) && arg2 <= (this.field362 << 3) + (this.field357 << 6) + 7;
        } else {
            return false;
        }
    }

    @ObfuscatedName("ah.k(IIB)Z")
    public boolean method192(int arg0, int arg1) {
        return arg0 >= (this.field364 << 3) + (this.field355 << 6) && arg0 <= (this.field366 << 3) + (this.field355 << 6) + 7 && arg1 >= (this.field361 << 3) + (this.field359 << 6) && arg1 <= (this.field367 << 3) + (this.field359 << 6) + 7;
    }

    @ObfuscatedName("ah.z(IIII)[I")
    public int[] method186(int arg0, int arg1, int arg2) {
        return this.method184(arg0, arg1, arg2) ? new int[] { this.field364 * 8 - this.field354 * 8 + this.field355 * 64 - this.field356 * 64 + arg1, this.field361 * 8 - this.field358 * 8 + this.field359 * 64 - this.field357 * 64 + arg2 } : null;
    }

    @ObfuscatedName("ah.v(IIB)Lhp;")
    public class220 method187(int arg0, int arg1) {
        if (this.method192(arg0, arg1)) {
            int var3 = this.field354 * 8 - this.field364 * 8 + this.field356 * 64 - this.field355 * 64 + arg0;
            int var4 = this.field358 * 8 - this.field361 * 8 + this.field357 * 64 - this.field359 * 64 + arg1;
            return new class220(this.field365, var3, var4);
        } else {
            return null;
        }
    }

    @ObfuscatedName("ah.m(Lfr;I)V")
    public void method188(class181 arg0) {
        this.field365 = arg0.method3204();
        this.field363 = arg0.method3204();
        this.field356 = arg0.method3179();
        this.field354 = arg0.method3204();
        this.field360 = arg0.method3204();
        this.field357 = arg0.method3179();
        this.field358 = arg0.method3204();
        this.field362 = arg0.method3204();
        this.field355 = arg0.method3179();
        this.field364 = arg0.method3204();
        this.field366 = arg0.method3204();
        this.field359 = arg0.method3179();
        this.field361 = arg0.method3204();
        this.field367 = arg0.method3204();
        this.method189();
    }

    @ObfuscatedName("ah.b(I)V")
    public void method189() {
    }
}
