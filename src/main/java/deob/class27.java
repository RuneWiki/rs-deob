package deob;

@ObfuscatedName("am")
public class class27 implements class43 {

    @ObfuscatedName("am.d")
    public int field362;

    @ObfuscatedName("am.q")
    public int field361;

    @ObfuscatedName("am.x")
    public int field354;

    @ObfuscatedName("am.y")
    public int field353;

    @ObfuscatedName("am.e")
    public int field355;

    @ObfuscatedName("am.f")
    public int field356;

    @ObfuscatedName("am.v")
    public int field357;

    @ObfuscatedName("am.t")
    public int field358;

    @ObfuscatedName("am.i")
    public int field351;

    @ObfuscatedName("am.r")
    public int field360;

    @ObfuscatedName("am.g")
    public int field359;

    @ObfuscatedName("am.s")
    public int field352;

    @ObfuscatedName("am.o")
    public int field363;

    @ObfuscatedName("am.p")
    public int field364;

    @ObfuscatedName("am.d(Lae;B)V")
    public void method167(class33 arg0) {
        if (arg0.field430 > this.field355) {
            arg0.field430 = this.field355;
        }
        if (arg0.field431 < this.field355) {
            arg0.field431 = this.field355;
        }
        if (arg0.field432 > this.field356) {
            arg0.field432 = this.field356;
        }
        if (arg0.field433 < this.field356) {
            arg0.field433 = this.field356;
        }
    }

    @ObfuscatedName("am.q(IIIS)Z")
    public boolean method191(int arg0, int arg1, int arg2) {
        if (arg0 >= this.field362 && arg0 < this.field362 + this.field361) {
            return arg1 >= (this.field357 << 3) + (this.field354 << 6) && arg1 <= (this.field354 << 6) + (this.field351 << 3) + 7 && arg2 >= (this.field358 << 3) + (this.field353 << 6) && arg2 <= (this.field360 << 3) + (this.field353 << 6) + 7;
        } else {
            return false;
        }
    }

    @ObfuscatedName("am.x(III)Z")
    public boolean method169(int arg0, int arg1) {
        return arg0 >= (this.field359 << 3) + (this.field355 << 6) && arg0 <= (this.field363 << 3) + (this.field355 << 6) + 7 && arg1 >= (this.field356 << 6) + (this.field352 << 3) && arg1 <= (this.field364 << 3) + (this.field356 << 6) + 7;
    }

    @ObfuscatedName("am.y(IIIB)[I")
    public int[] method170(int arg0, int arg1, int arg2) {
        return this.method191(arg0, arg1, arg2) ? new int[] { this.field359 * 8 - this.field357 * 8 + this.field355 * 64 - this.field354 * 64 + arg1, this.field352 * 8 - this.field358 * 8 + this.field356 * 64 - this.field353 * 64 + arg2 } : null;
    }

    @ObfuscatedName("am.e(IIB)Lhy;")
    public class213 method177(int arg0, int arg1) {
        if (this.method169(arg0, arg1)) {
            int var3 = this.field357 * 8 - this.field359 * 8 + this.field354 * 64 - this.field355 * 64 + arg0;
            int var4 = this.field358 * 8 - this.field352 * 8 + this.field353 * 64 - this.field356 * 64 + arg1;
            return new class213(this.field362, var3, var4);
        } else {
            return null;
        }
    }

    @ObfuscatedName("am.f(Lfw;I)V")
    public void method194(class174 arg0) {
        this.field362 = arg0.method2921();
        this.field361 = arg0.method2921();
        this.field354 = arg0.method2916();
        this.field357 = arg0.method2921();
        this.field351 = arg0.method2921();
        this.field353 = arg0.method2916();
        this.field358 = arg0.method2921();
        this.field360 = arg0.method2921();
        this.field355 = arg0.method2916();
        this.field359 = arg0.method2921();
        this.field363 = arg0.method2921();
        this.field356 = arg0.method2916();
        this.field352 = arg0.method2921();
        this.field364 = arg0.method2921();
        this.method173();
    }

    @ObfuscatedName("am.v(I)V")
    public void method173() {
    }
}
