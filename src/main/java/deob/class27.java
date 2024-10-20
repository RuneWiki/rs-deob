package deob;

@ObfuscatedName("aa")
public class class27 implements class43 {

    @ObfuscatedName("aa.p")
    public int field357;

    @ObfuscatedName("aa.i")
    public int field355;

    @ObfuscatedName("aa.w")
    public int field356;

    @ObfuscatedName("aa.s")
    public int field368;

    @ObfuscatedName("aa.j")
    public int field363;

    @ObfuscatedName("aa.a")
    public int field362;

    @ObfuscatedName("aa.t")
    public int field360;

    @ObfuscatedName("aa.r")
    public int field361;

    @ObfuscatedName("aa.m")
    public int field359;

    @ObfuscatedName("aa.h")
    public int field354;

    @ObfuscatedName("aa.o")
    public int field358;

    @ObfuscatedName("aa.x")
    public int field365;

    @ObfuscatedName("aa.q")
    public int field366;

    @ObfuscatedName("aa.v")
    public int field367;

    @ObfuscatedName("aa.p(Lae;I)V")
    public void method184(class33 arg0) {
        if (arg0.field427 > this.field363) {
            arg0.field427 = this.field363;
        }
        if (arg0.field434 < this.field363) {
            arg0.field434 = this.field363;
        }
        if (arg0.field429 > this.field362) {
            arg0.field429 = this.field362;
        }
        if (arg0.field423 < this.field362) {
            arg0.field423 = this.field362;
        }
    }

    @ObfuscatedName("aa.i(IIII)Z")
    public boolean method185(int arg0, int arg1, int arg2) {
        if (arg0 >= this.field357 && arg0 < this.field357 + this.field355) {
            return arg1 >= (this.field360 << 3) + (this.field356 << 6) && arg1 <= (this.field359 << 3) + (this.field356 << 6) + 7 && arg2 >= (this.field368 << 6) + (this.field361 << 3) && arg2 <= (this.field368 << 6) + (this.field354 << 3) + 7;
        } else {
            return false;
        }
    }

    @ObfuscatedName("aa.w(III)Z")
    public boolean method186(int arg0, int arg1) {
        return arg0 >= (this.field363 << 6) + (this.field358 << 3) && arg0 <= (this.field366 << 3) + (this.field363 << 6) + 7 && arg1 >= (this.field365 << 3) + (this.field362 << 6) && arg1 <= (this.field367 << 3) + (this.field362 << 6) + 7;
    }

    @ObfuscatedName("aa.s(IIII)[I")
    public int[] method187(int arg0, int arg1, int arg2) {
        return this.method185(arg0, arg1, arg2) ? new int[] { this.field358 * 8 - this.field360 * 8 + this.field363 * 64 - this.field356 * 64 + arg1, this.field365 * 8 - this.field361 * 8 + this.field362 * 64 - this.field368 * 64 + arg2 } : null;
    }

    @ObfuscatedName("aa.j(III)Lhn;")
    public class224 method213(int arg0, int arg1) {
        if (this.method186(arg0, arg1)) {
            int var3 = this.field360 * 8 - this.field358 * 8 + this.field356 * 64 - this.field363 * 64 + arg0;
            int var4 = this.field361 * 8 - this.field365 * 8 + this.field368 * 64 - this.field362 * 64 + arg1;
            return new class224(this.field357, var3, var4);
        } else {
            return null;
        }
    }

    @ObfuscatedName("aa.a(Lgj;B)V")
    public void method189(class185 arg0) {
        this.field357 = arg0.method3197();
        this.field355 = arg0.method3197();
        this.field356 = arg0.method3124();
        this.field360 = arg0.method3197();
        this.field359 = arg0.method3197();
        this.field368 = arg0.method3124();
        this.field361 = arg0.method3197();
        this.field354 = arg0.method3197();
        this.field363 = arg0.method3124();
        this.field358 = arg0.method3197();
        this.field366 = arg0.method3197();
        this.field362 = arg0.method3124();
        this.field365 = arg0.method3197();
        this.field367 = arg0.method3197();
        this.method192();
    }

    @ObfuscatedName("aa.t(B)V")
    public void method192() {
    }
}
