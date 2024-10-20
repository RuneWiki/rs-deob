package deob;

@ObfuscatedName("ab")
public class class31 implements class44 {

    @ObfuscatedName("ab.c")
    public int field407;

    @ObfuscatedName("ab.i")
    public int field415;

    @ObfuscatedName("ab.o")
    public int field408;

    @ObfuscatedName("ab.j")
    public int field410;

    @ObfuscatedName("ab.k")
    public int field406;

    @ObfuscatedName("ab.x")
    public int field411;

    @ObfuscatedName("ab.z")
    public int field412;

    @ObfuscatedName("ab.p")
    public int field413;

    @ObfuscatedName("ab.w")
    public int field409;

    @ObfuscatedName("ab.r")
    public int field414;

    @ObfuscatedName("ab.c(Las;I)V")
    public void method216(class33 arg0) {
        if (arg0.field434 > this.field412) {
            arg0.field434 = this.field412;
        }
        if (arg0.field432 < this.field409) {
            arg0.field432 = this.field409;
        }
        if (arg0.field435 > this.field413) {
            arg0.field435 = this.field413;
        }
        if (arg0.field437 < this.field414) {
            arg0.field437 = this.field414;
        }
    }

    @ObfuscatedName("ab.i(IIII)Z")
    public boolean method194(int arg0, int arg1, int arg2) {
        if (arg0 >= this.field407 && arg0 < this.field415 + this.field407) {
            return arg1 >> 6 >= this.field408 && arg1 >> 6 <= this.field406 && arg2 >> 6 >= this.field410 && arg2 >> 6 <= this.field411;
        } else {
            return false;
        }
    }

    @ObfuscatedName("ab.o(IIS)Z")
    public boolean method195(int arg0, int arg1) {
        return arg0 >> 6 >= this.field412 && arg0 >> 6 <= this.field409 && arg1 >> 6 >= this.field413 && arg1 >> 6 <= this.field414;
    }

    @ObfuscatedName("ab.j(IIII)[I")
    public int[] method196(int arg0, int arg1, int arg2) {
        return this.method194(arg0, arg1, arg2) ? new int[] { this.field412 * 64 - this.field408 * 64 + arg1, this.field413 * 64 - this.field410 * 64 + arg2 } : null;
    }

    @ObfuscatedName("ab.k(IIB)Lim;")
    public class239 method218(int arg0, int arg1) {
        if (this.method195(arg0, arg1)) {
            int var3 = this.field408 * 64 - this.field412 * 64 + arg0;
            int var4 = this.field410 * 64 - this.field413 * 64 + arg1;
            return new class239(this.field407, var3, var4);
        } else {
            return null;
        }
    }

    @ObfuscatedName("ab.x(Lgp;I)V")
    public void method198(class195 arg0) {
        this.field407 = arg0.method3429();
        this.field415 = arg0.method3429();
        this.field408 = arg0.method3218();
        this.field410 = arg0.method3218();
        this.field406 = arg0.method3218();
        this.field411 = arg0.method3218();
        this.field412 = arg0.method3218();
        this.field413 = arg0.method3218();
        this.field409 = arg0.method3218();
        this.field414 = arg0.method3218();
        this.method262();
    }

    @ObfuscatedName("ab.z(B)V")
    public void method262() {
    }
}
