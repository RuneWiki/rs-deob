package deob;

@ObfuscatedName("ab")
public class class27 implements class43 {

    @ObfuscatedName("ab.a")
    public int field350;

    @ObfuscatedName("ab.w")
    public int field363;

    @ObfuscatedName("ab.e")
    public int field351;

    @ObfuscatedName("ab.k")
    public int field349;

    @ObfuscatedName("ab.u")
    public int field353;

    @ObfuscatedName("ab.z")
    public int field364;

    @ObfuscatedName("ab.t")
    public int field355;

    @ObfuscatedName("ab.f")
    public int field356;

    @ObfuscatedName("ab.g")
    public int field357;

    @ObfuscatedName("ab.j")
    public int field358;

    @ObfuscatedName("ab.x")
    public int field359;

    @ObfuscatedName("ab.c")
    public int field360;

    @ObfuscatedName("ab.s")
    public int field361;

    @ObfuscatedName("ab.n")
    public int field362;

    @ObfuscatedName("ab.a(Lax;I)V")
    public void method174(class33 arg0) {
        if (arg0.field425 > this.field353) {
            arg0.field425 = this.field353;
        }
        if (arg0.field418 < this.field353) {
            arg0.field418 = this.field353;
        }
        if (arg0.field426 > this.field364) {
            arg0.field426 = this.field364;
        }
        if (arg0.field432 < this.field364) {
            arg0.field432 = this.field364;
        }
    }

    @ObfuscatedName("ab.w(IIII)Z")
    public boolean method175(int arg0, int arg1, int arg2) {
        if (arg0 >= this.field350 && arg0 < this.field363 + this.field350) {
            return arg1 >= (this.field355 << 3) + (this.field351 << 6) && arg1 <= (this.field357 << 3) + (this.field351 << 6) + 7 && arg2 >= (this.field356 << 3) + (this.field349 << 6) && arg2 <= (this.field358 << 3) + (this.field349 << 6) + 7;
        } else {
            return false;
        }
    }

    @ObfuscatedName("ab.e(III)Z")
    public boolean method176(int arg0, int arg1) {
        return arg0 >= (this.field359 << 3) + (this.field353 << 6) && arg0 <= (this.field361 << 3) + (this.field353 << 6) + 7 && arg1 >= (this.field364 << 6) + (this.field360 << 3) && arg1 <= (this.field364 << 6) + (this.field362 << 3) + 7;
    }

    @ObfuscatedName("ab.k(IIII)[I")
    public int[] method177(int arg0, int arg1, int arg2) {
        return this.method175(arg0, arg1, arg2) ? new int[] { this.field359 * 8 - this.field355 * 8 + this.field353 * 64 - this.field351 * 64 + arg1, this.field360 * 8 - this.field356 * 8 + this.field364 * 64 - this.field349 * 64 + arg2 } : null;
    }

    @ObfuscatedName("ab.u(III)Lhc;")
    public class224 method178(int arg0, int arg1) {
        if (this.method176(arg0, arg1)) {
            int var3 = this.field355 * 8 - this.field359 * 8 + this.field351 * 64 - this.field353 * 64 + arg0;
            int var4 = this.field356 * 8 - this.field360 * 8 + this.field349 * 64 - this.field364 * 64 + arg1;
            return new class224(this.field350, var3, var4);
        } else {
            return null;
        }
    }

    @ObfuscatedName("ab.z(Lgh;I)V")
    public void method194(class185 arg0) {
        this.field350 = arg0.method2962();
        this.field363 = arg0.method2962();
        this.field351 = arg0.method3194();
        this.field355 = arg0.method2962();
        this.field357 = arg0.method2962();
        this.field349 = arg0.method3194();
        this.field356 = arg0.method2962();
        this.field358 = arg0.method2962();
        this.field353 = arg0.method3194();
        this.field359 = arg0.method2962();
        this.field361 = arg0.method2962();
        this.field364 = arg0.method3194();
        this.field360 = arg0.method2962();
        this.field362 = arg0.method2962();
        this.method180();
    }

    @ObfuscatedName("ab.t(I)V")
    public void method180() {
    }
}
