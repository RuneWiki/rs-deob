package deob;

@ObfuscatedName("ad")
public class class27 implements class43 {

    @ObfuscatedName("ad.s")
    public int field366;

    @ObfuscatedName("ad.g")
    public int field364;

    @ObfuscatedName("ad.m")
    public int field360;

    @ObfuscatedName("ad.h")
    public int field358;

    @ObfuscatedName("ad.i")
    public int field362;

    @ObfuscatedName("ad.w")
    public int field363;

    @ObfuscatedName("ad.t")
    public int field367;

    @ObfuscatedName("ad.d")
    public int field365;

    @ObfuscatedName("ad.z")
    public int field359;

    @ObfuscatedName("ad.k")
    public int field361;

    @ObfuscatedName("ad.c")
    public int field368;

    @ObfuscatedName("ad.o")
    public int field369;

    @ObfuscatedName("ad.l")
    public int field370;

    @ObfuscatedName("ad.f")
    public int field371;

    @ObfuscatedName("ad.s(Las;I)V")
    public void method181(class33 arg0) {
        if (arg0.field433 > this.field362) {
            arg0.field433 = this.field362;
        }
        if (arg0.field434 < this.field362) {
            arg0.field434 = this.field362;
        }
        if (arg0.field427 > this.field363) {
            arg0.field427 = this.field363;
        }
        if (arg0.field436 < this.field363) {
            arg0.field436 = this.field363;
        }
    }

    @ObfuscatedName("ad.g(IIIB)Z")
    public boolean method182(int arg0, int arg1, int arg2) {
        if (arg0 >= this.field366 && arg0 < this.field366 + this.field364) {
            return arg1 >= (this.field367 << 3) + (this.field360 << 6) && arg1 <= (this.field360 << 6) + (this.field359 << 3) + 7 && arg2 >= (this.field365 << 3) + (this.field358 << 6) && arg2 <= (this.field361 << 3) + (this.field358 << 6) + 7;
        } else {
            return false;
        }
    }

    @ObfuscatedName("ad.m(III)Z")
    public boolean method183(int arg0, int arg1) {
        return arg0 >= (this.field368 << 3) + (this.field362 << 6) && arg0 <= (this.field370 << 3) + (this.field362 << 6) + 7 && arg1 >= (this.field369 << 3) + (this.field363 << 6) && arg1 <= (this.field371 << 3) + (this.field363 << 6) + 7;
    }

    @ObfuscatedName("ad.h(IIII)[I")
    public int[] method187(int arg0, int arg1, int arg2) {
        return this.method182(arg0, arg1, arg2) ? new int[] { this.field368 * 8 - this.field367 * 8 + this.field362 * 64 - this.field360 * 64 + arg1, this.field369 * 8 - this.field365 * 8 + this.field363 * 64 - this.field358 * 64 + arg2 } : null;
    }

    @ObfuscatedName("ad.i(IIB)Lhv;")
    public class224 method185(int arg0, int arg1) {
        if (this.method183(arg0, arg1)) {
            int var3 = this.field367 * 8 - this.field368 * 8 + this.field360 * 64 - this.field362 * 64 + arg0;
            int var4 = this.field365 * 8 - this.field369 * 8 + this.field358 * 64 - this.field363 * 64 + arg1;
            return new class224(this.field366, var3, var4);
        } else {
            return null;
        }
    }

    @ObfuscatedName("ad.w(Lgy;I)V")
    public void method186(class185 arg0) {
        this.field366 = arg0.method3239();
        this.field364 = arg0.method3239();
        this.field360 = arg0.method3241();
        this.field367 = arg0.method3239();
        this.field359 = arg0.method3239();
        this.field358 = arg0.method3241();
        this.field365 = arg0.method3239();
        this.field361 = arg0.method3239();
        this.field362 = arg0.method3241();
        this.field368 = arg0.method3239();
        this.field370 = arg0.method3239();
        this.field363 = arg0.method3241();
        this.field369 = arg0.method3239();
        this.field371 = arg0.method3239();
        this.method204();
    }

    @ObfuscatedName("ad.t(I)V")
    public void method204() {
    }
}
