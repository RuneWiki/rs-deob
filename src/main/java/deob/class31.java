package deob;

@ObfuscatedName("ad")
public class class31 implements class43 {

    @ObfuscatedName("ad.w")
    public int field444;

    @ObfuscatedName("ad.o")
    public int field438;

    @ObfuscatedName("ad.x")
    public int field439;

    @ObfuscatedName("ad.k")
    public int field440;

    @ObfuscatedName("ad.f")
    public int field437;

    @ObfuscatedName("ad.i")
    public int field446;

    @ObfuscatedName("ad.j")
    public int field452;

    @ObfuscatedName("ad.m")
    public int field441;

    @ObfuscatedName("ad.u")
    public int field442;

    @ObfuscatedName("ad.r")
    public int field443;

    @ObfuscatedName("ad.w(Laq;I)V")
    public void method203(class33 arg0) {
        if (arg0.field461 > this.field452) {
            arg0.field461 = this.field452;
        }
        if (arg0.field468 < this.field442) {
            arg0.field468 = this.field442;
        }
        if (arg0.field474 > this.field441) {
            arg0.field474 = this.field441;
        }
        if (arg0.field470 < this.field443) {
            arg0.field470 = this.field443;
        }
    }

    @ObfuscatedName("ad.o(IIIB)Z")
    public boolean method177(int arg0, int arg1, int arg2) {
        if (arg0 >= this.field444 && arg0 < this.field444 + this.field438) {
            return arg1 >> 6 >= this.field439 && arg1 >> 6 <= this.field437 && arg2 >> 6 >= this.field440 && arg2 >> 6 <= this.field446;
        } else {
            return false;
        }
    }

    @ObfuscatedName("ad.x(III)Z")
    public boolean method176(int arg0, int arg1) {
        return arg0 >> 6 >= this.field452 && arg0 >> 6 <= this.field442 && arg1 >> 6 >= this.field441 && arg1 >> 6 <= this.field443;
    }

    @ObfuscatedName("ad.k(IIII)[I")
    public int[] method179(int arg0, int arg1, int arg2) {
        return this.method177(arg0, arg1, arg2) ? new int[] { this.field452 * 64 - this.field439 * 64 + arg1, this.field441 * 64 - this.field440 * 64 + arg2 } : null;
    }

    @ObfuscatedName("ad.f(III)Lhp;")
    public class216 method180(int arg0, int arg1) {
        if (this.method176(arg0, arg1)) {
            int var3 = this.field439 * 64 - this.field452 * 64 + arg0;
            int var4 = this.field440 * 64 - this.field441 * 64 + arg1;
            return new class216(this.field444, var3, var4);
        } else {
            return null;
        }
    }

    @ObfuscatedName("ad.i(Lfi;B)V")
    public void method181(class177 arg0) {
        this.field444 = arg0.method2931();
        this.field438 = arg0.method2931();
        this.field439 = arg0.method2886();
        this.field440 = arg0.method2886();
        this.field437 = arg0.method2886();
        this.field446 = arg0.method2886();
        this.field452 = arg0.method2886();
        this.field441 = arg0.method2886();
        this.field442 = arg0.method2886();
        this.field443 = arg0.method2886();
        this.method242();
    }

    @ObfuscatedName("ad.j(I)V")
    public void method242() {
    }
}
