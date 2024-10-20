package deob;

@ObfuscatedName("ay")
public class class27 implements class44 {

    @ObfuscatedName("ay.t")
    public int field355;

    @ObfuscatedName("ay.q")
    public int field350;

    @ObfuscatedName("ay.i")
    public int field351;

    @ObfuscatedName("ay.a")
    public int field364;

    @ObfuscatedName("ay.l")
    public int field353;

    @ObfuscatedName("ay.b")
    public int field354;

    @ObfuscatedName("ay.e")
    public int field359;

    @ObfuscatedName("ay.x")
    public int field363;

    @ObfuscatedName("ay.p")
    public int field357;

    @ObfuscatedName("ay.g")
    public int field358;

    @ObfuscatedName("ay.n")
    public int field360;

    @ObfuscatedName("ay.o")
    public int field352;

    @ObfuscatedName("ay.c")
    public int field361;

    @ObfuscatedName("ay.v")
    public int field349;

    @ObfuscatedName("ay.t(Laz;I)V")
    public void method190(class33 arg0) {
        if (arg0.field430 > this.field353) {
            arg0.field430 = this.field353;
        }
        if (arg0.field429 < this.field353) {
            arg0.field429 = this.field353;
        }
        if (arg0.field423 > this.field354) {
            arg0.field423 = this.field354;
        }
        if (arg0.field431 < this.field354) {
            arg0.field431 = this.field354;
        }
    }

    @ObfuscatedName("ay.q(IIIB)Z")
    public boolean method189(int arg0, int arg1, int arg2) {
        if (arg0 >= this.field355 && arg0 < this.field355 + this.field350) {
            return arg1 >= (this.field359 << 3) + (this.field351 << 6) && arg1 <= (this.field357 << 3) + (this.field351 << 6) + 7 && arg2 >= (this.field364 << 6) + (this.field363 << 3) && arg2 <= (this.field364 << 6) + (this.field358 << 3) + 7;
        } else {
            return false;
        }
    }

    @ObfuscatedName("ay.i(IIB)Z")
    public boolean method212(int arg0, int arg1) {
        return arg0 >= (this.field360 << 3) + (this.field353 << 6) && arg0 <= (this.field361 << 3) + (this.field353 << 6) + 7 && arg1 >= (this.field354 << 6) + (this.field352 << 3) && arg1 <= (this.field354 << 6) + (this.field349 << 3) + 7;
    }

    @ObfuscatedName("ay.a(IIII)[I")
    public int[] method192(int arg0, int arg1, int arg2) {
        return this.method189(arg0, arg1, arg2) ? new int[] { this.field360 * 8 - this.field359 * 8 + this.field353 * 64 - this.field351 * 64 + arg1, this.field352 * 8 - this.field363 * 8 + this.field354 * 64 - this.field364 * 64 + arg2 } : null;
    }

    @ObfuscatedName("ay.l(III)Lik;")
    public class239 method211(int arg0, int arg1) {
        if (this.method212(arg0, arg1)) {
            int var3 = this.field359 * 8 - this.field360 * 8 + this.field351 * 64 - this.field353 * 64 + arg0;
            int var4 = this.field363 * 8 - this.field352 * 8 + this.field364 * 64 - this.field354 * 64 + arg1;
            return new class239(this.field355, var3, var4);
        } else {
            return null;
        }
    }

    @ObfuscatedName("ay.b(Lgb;I)V")
    public void method194(class195 arg0) {
        this.field355 = arg0.method3236();
        this.field350 = arg0.method3236();
        this.field351 = arg0.method3238();
        this.field359 = arg0.method3236();
        this.field357 = arg0.method3236();
        this.field364 = arg0.method3238();
        this.field363 = arg0.method3236();
        this.field358 = arg0.method3236();
        this.field353 = arg0.method3238();
        this.field360 = arg0.method3236();
        this.field361 = arg0.method3236();
        this.field354 = arg0.method3238();
        this.field352 = arg0.method3236();
        this.field349 = arg0.method3236();
        this.method195();
    }

    @ObfuscatedName("ay.e(I)V")
    public void method195() {
    }
}
