package deob;

@ObfuscatedName("ac")
public class class31 implements class44 {

    @ObfuscatedName("ac.o")
    public int field436;

    @ObfuscatedName("ac.k")
    public int field439;

    @ObfuscatedName("ac.t")
    public int field430;

    @ObfuscatedName("ac.d")
    public int field432;

    @ObfuscatedName("ac.h")
    public int field441;

    @ObfuscatedName("ac.m")
    public int field433;

    @ObfuscatedName("ac.z")
    public int field428;

    @ObfuscatedName("ac.i")
    public int field435;

    @ObfuscatedName("ac.u")
    public int field429;

    @ObfuscatedName("ac.x")
    public int field437;

    @ObfuscatedName("ac.o(Lah;I)V")
    public void method192(class33 arg0) {
        if (arg0.field451 > this.field428) {
            arg0.field451 = this.field428;
        }
        if (arg0.field456 < this.field429) {
            arg0.field456 = this.field429;
        }
        if (arg0.field457 > this.field435) {
            arg0.field457 = this.field435;
        }
        if (arg0.field458 < this.field437) {
            arg0.field458 = this.field437;
        }
    }

    @ObfuscatedName("ac.k(IIIB)Z")
    public boolean method194(int arg0, int arg1, int arg2) {
        if (arg0 >= this.field436 && arg0 < this.field439 + this.field436) {
            return arg1 >> 6 >= this.field430 && arg1 >> 6 <= this.field441 && arg2 >> 6 >= this.field432 && arg2 >> 6 <= this.field433;
        } else {
            return false;
        }
    }

    @ObfuscatedName("ac.t(III)Z")
    public boolean method195(int arg0, int arg1) {
        return arg0 >> 6 >= this.field428 && arg0 >> 6 <= this.field429 && arg1 >> 6 >= this.field435 && arg1 >> 6 <= this.field437;
    }

    @ObfuscatedName("ac.d(IIIB)[I")
    public int[] method196(int arg0, int arg1, int arg2) {
        return this.method194(arg0, arg1, arg2) ? new int[] { this.field428 * 64 - this.field430 * 64 + arg1, this.field435 * 64 - this.field432 * 64 + arg2 } : null;
    }

    @ObfuscatedName("ac.h(IIB)Lix;")
    public class239 method217(int arg0, int arg1) {
        if (this.method195(arg0, arg1)) {
            int var3 = this.field430 * 64 - this.field428 * 64 + arg0;
            int var4 = this.field432 * 64 - this.field435 * 64 + arg1;
            return new class239(this.field436, var3, var4);
        } else {
            return null;
        }
    }

    @ObfuscatedName("ac.m(Lgc;I)V")
    public void method198(class195 arg0) {
        this.field436 = arg0.method3205();
        this.field439 = arg0.method3205();
        this.field430 = arg0.method3207();
        this.field432 = arg0.method3207();
        this.field441 = arg0.method3207();
        this.field433 = arg0.method3207();
        this.field428 = arg0.method3207();
        this.field435 = arg0.method3207();
        this.field429 = arg0.method3207();
        this.field437 = arg0.method3207();
        this.method268();
    }

    @ObfuscatedName("ac.z(I)V")
    public void method268() {
    }
}
