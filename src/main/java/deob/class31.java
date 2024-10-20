package deob;

@ObfuscatedName("af")
public class class31 implements class43 {

    @ObfuscatedName("af.s")
    public int field445;

    @ObfuscatedName("af.c")
    public int field433;

    @ObfuscatedName("af.f")
    public int field434;

    @ObfuscatedName("af.m")
    public int field435;

    @ObfuscatedName("af.h")
    public int field436;

    @ObfuscatedName("af.t")
    public int field437;

    @ObfuscatedName("af.p")
    public int field440;

    @ObfuscatedName("af.d")
    public int field432;

    @ObfuscatedName("af.n")
    public int field439;

    @ObfuscatedName("af.z")
    public int field441;

    @ObfuscatedName("af.s(Laq;I)V")
    public void method184(class33 arg0) {
        if (arg0.field467 > this.field440) {
            arg0.field467 = this.field440;
        }
        if (arg0.field463 < this.field439) {
            arg0.field463 = this.field439;
        }
        if (arg0.field464 > this.field432) {
            arg0.field464 = this.field432;
        }
        if (arg0.field465 < this.field441) {
            arg0.field465 = this.field441;
        }
    }

    @ObfuscatedName("af.c(IIII)Z")
    public boolean method185(int arg0, int arg1, int arg2) {
        if (arg0 >= this.field445 && arg0 < this.field445 + this.field433) {
            return arg1 >> 6 >= this.field434 && arg1 >> 6 <= this.field436 && arg2 >> 6 >= this.field435 && arg2 >> 6 <= this.field437;
        } else {
            return false;
        }
    }

    @ObfuscatedName("af.f(III)Z")
    public boolean method208(int arg0, int arg1) {
        return arg0 >> 6 >= this.field440 && arg0 >> 6 <= this.field439 && arg1 >> 6 >= this.field432 && arg1 >> 6 <= this.field441;
    }

    @ObfuscatedName("af.m(IIII)[I")
    public int[] method213(int arg0, int arg1, int arg2) {
        return this.method185(arg0, arg1, arg2) ? new int[] { this.field440 * 64 - this.field434 * 64 + arg1, this.field432 * 64 - this.field435 * 64 + arg2 } : null;
    }

    @ObfuscatedName("af.h(IIB)Lhp;")
    public class216 method188(int arg0, int arg1) {
        if (this.method208(arg0, arg1)) {
            int var3 = this.field434 * 64 - this.field440 * 64 + arg0;
            int var4 = this.field435 * 64 - this.field432 * 64 + arg1;
            return new class216(this.field445, var3, var4);
        } else {
            return null;
        }
    }

    @ObfuscatedName("af.t(Lfs;I)V")
    public void method189(class177 arg0) {
        this.field445 = arg0.method2965();
        this.field433 = arg0.method2965();
        this.field434 = arg0.method2967();
        this.field435 = arg0.method2967();
        this.field436 = arg0.method2967();
        this.field437 = arg0.method2967();
        this.field440 = arg0.method2967();
        this.field432 = arg0.method2967();
        this.field439 = arg0.method2967();
        this.field441 = arg0.method2967();
        this.method245();
    }

    @ObfuscatedName("af.p(I)V")
    public void method245() {
    }
}
