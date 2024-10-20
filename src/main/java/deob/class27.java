package deob;

@ObfuscatedName("ac")
public class class27 implements class43 {

    @ObfuscatedName("ac.n")
    public int field365;

    @ObfuscatedName("ac.v")
    public int field372;

    @ObfuscatedName("ac.y")
    public int field364;

    @ObfuscatedName("ac.r")
    public int field376;

    @ObfuscatedName("ac.h")
    public int field366;

    @ObfuscatedName("ac.d")
    public int field367;

    @ObfuscatedName("ac.s")
    public int field368;

    @ObfuscatedName("ac.b")
    public int field369;

    @ObfuscatedName("ac.e")
    public int field370;

    @ObfuscatedName("ac.f")
    public int field381;

    @ObfuscatedName("ac.z")
    public int field363;

    @ObfuscatedName("ac.u")
    public int field373;

    @ObfuscatedName("ac.p")
    public int field374;

    @ObfuscatedName("ac.w")
    public int field371;

    @ObfuscatedName("ac.n(Laz;I)V")
    public void method170(class33 arg0) {
        if (arg0.field438 > this.field366) {
            arg0.field438 = this.field366;
        }
        if (arg0.field435 < this.field366) {
            arg0.field435 = this.field366;
        }
        if (arg0.field437 > this.field367) {
            arg0.field437 = this.field367;
        }
        if (arg0.field441 < this.field367) {
            arg0.field441 = this.field367;
        }
    }

    @ObfuscatedName("ac.v(IIIB)Z")
    public boolean method171(int arg0, int arg1, int arg2) {
        if (arg0 >= this.field365 && arg0 < this.field372 + this.field365) {
            return arg1 >= (this.field368 << 3) + (this.field364 << 6) && arg1 <= (this.field370 << 3) + (this.field364 << 6) + 7 && arg2 >= (this.field376 << 6) + (this.field369 << 3) && arg2 <= (this.field381 << 3) + (this.field376 << 6) + 7;
        } else {
            return false;
        }
    }

    @ObfuscatedName("ac.y(III)Z")
    public boolean method183(int arg0, int arg1) {
        return arg0 >= (this.field366 << 6) + (this.field363 << 3) && arg0 <= (this.field374 << 3) + (this.field366 << 6) + 7 && arg1 >= (this.field373 << 3) + (this.field367 << 6) && arg1 <= (this.field371 << 3) + (this.field367 << 6) + 7;
    }

    @ObfuscatedName("ac.r(IIII)[I")
    public int[] method194(int arg0, int arg1, int arg2) {
        return this.method171(arg0, arg1, arg2) ? new int[] { this.field363 * 8 - this.field368 * 8 + this.field366 * 64 - this.field364 * 64 + arg1, this.field373 * 8 - this.field369 * 8 + this.field367 * 64 - this.field376 * 64 + arg2 } : null;
    }

    @ObfuscatedName("ac.h(III)Lht;")
    public class224 method174(int arg0, int arg1) {
        if (this.method183(arg0, arg1)) {
            int var3 = this.field368 * 8 - this.field363 * 8 + this.field364 * 64 - this.field366 * 64 + arg0;
            int var4 = this.field369 * 8 - this.field373 * 8 + this.field376 * 64 - this.field367 * 64 + arg1;
            return new class224(this.field365, var3, var4);
        } else {
            return null;
        }
    }

    @ObfuscatedName("ac.d(Lgv;I)V")
    public void method175(class185 arg0) {
        this.field365 = arg0.method3021();
        this.field372 = arg0.method3021();
        this.field364 = arg0.method3015();
        this.field368 = arg0.method3021();
        this.field370 = arg0.method3021();
        this.field376 = arg0.method3015();
        this.field369 = arg0.method3021();
        this.field381 = arg0.method3021();
        this.field366 = arg0.method3015();
        this.field363 = arg0.method3021();
        this.field374 = arg0.method3021();
        this.field367 = arg0.method3015();
        this.field373 = arg0.method3021();
        this.field371 = arg0.method3021();
        this.method176();
    }

    @ObfuscatedName("ac.s(I)V")
    public void method176() {
    }
}
