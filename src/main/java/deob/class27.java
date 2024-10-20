package deob;

@ObfuscatedName("ap")
public class class27 implements class43 {

    @ObfuscatedName("ap.c")
    public int field378;

    @ObfuscatedName("ap.o")
    public int field361;

    @ObfuscatedName("ap.i")
    public int field379;

    @ObfuscatedName("ap.u")
    public int field363;

    @ObfuscatedName("ap.g")
    public int field364;

    @ObfuscatedName("ap.m")
    public int field365;

    @ObfuscatedName("ap.s")
    public int field360;

    @ObfuscatedName("ap.x")
    public int field367;

    @ObfuscatedName("ap.p")
    public int field368;

    @ObfuscatedName("ap.k")
    public int field369;

    @ObfuscatedName("ap.r")
    public int field370;

    @ObfuscatedName("ap.w")
    public int field371;

    @ObfuscatedName("ap.v")
    public int field372;

    @ObfuscatedName("ap.h")
    public int field375;

    @ObfuscatedName("ap.c(Lab;S)V")
    public void method172(class33 arg0) {
        if (arg0.field444 > this.field364) {
            arg0.field444 = this.field364;
        }
        if (arg0.field445 < this.field364) {
            arg0.field445 = this.field364;
        }
        if (arg0.field443 > this.field365) {
            arg0.field443 = this.field365;
        }
        if (arg0.field436 < this.field365) {
            arg0.field436 = this.field365;
        }
    }

    @ObfuscatedName("ap.o(IIII)Z")
    public boolean method173(int arg0, int arg1, int arg2) {
        if (arg0 >= this.field378 && arg0 < this.field378 + this.field361) {
            return arg1 >= (this.field379 << 6) + (this.field360 << 3) && arg1 <= (this.field379 << 6) + (this.field368 << 3) + 7 && arg2 >= (this.field367 << 3) + (this.field363 << 6) && arg2 <= (this.field369 << 3) + (this.field363 << 6) + 7;
        } else {
            return false;
        }
    }

    @ObfuscatedName("ap.i(IIS)Z")
    public boolean method174(int arg0, int arg1) {
        return arg0 >= (this.field370 << 3) + (this.field364 << 6) && arg0 <= (this.field372 << 3) + (this.field364 << 6) + 7 && arg1 >= (this.field371 << 3) + (this.field365 << 6) && arg1 <= (this.field375 << 3) + (this.field365 << 6) + 7;
    }

    @ObfuscatedName("ap.u(IIII)[I")
    public int[] method175(int arg0, int arg1, int arg2) {
        return this.method173(arg0, arg1, arg2) ? new int[] { this.field370 * 8 - this.field360 * 8 + this.field364 * 64 - this.field379 * 64 + arg1, this.field371 * 8 - this.field367 * 8 + this.field365 * 64 - this.field363 * 64 + arg2 } : null;
    }

    @ObfuscatedName("ap.g(III)Lhs;")
    public class213 method179(int arg0, int arg1) {
        if (this.method174(arg0, arg1)) {
            int var3 = this.field360 * 8 - this.field370 * 8 + this.field379 * 64 - this.field364 * 64 + arg0;
            int var4 = this.field367 * 8 - this.field371 * 8 + this.field363 * 64 - this.field365 * 64 + arg1;
            return new class213(this.field378, var3, var4);
        } else {
            return null;
        }
    }

    @ObfuscatedName("ap.m(Lfp;B)V")
    public void method177(class174 arg0) {
        this.field378 = arg0.method2843();
        this.field361 = arg0.method2843();
        this.field379 = arg0.method2861();
        this.field360 = arg0.method2843();
        this.field368 = arg0.method2843();
        this.field363 = arg0.method2861();
        this.field367 = arg0.method2843();
        this.field369 = arg0.method2843();
        this.field364 = arg0.method2861();
        this.field370 = arg0.method2843();
        this.field372 = arg0.method2843();
        this.field365 = arg0.method2861();
        this.field371 = arg0.method2843();
        this.field375 = arg0.method2843();
        this.method178();
    }

    @ObfuscatedName("ap.s(I)V")
    public void method178() {
    }
}
