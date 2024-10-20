package deob;

@ObfuscatedName("am")
public class class39 implements class43 {

    @ObfuscatedName("am.s")
    public int field498;

    @ObfuscatedName("am.g")
    public int field497;

    @ObfuscatedName("am.m")
    public int field493;

    @ObfuscatedName("am.h")
    public int field494;

    @ObfuscatedName("am.i")
    public int field495;

    @ObfuscatedName("am.w")
    public int field496;

    @ObfuscatedName("am.s(Las;I)V")
    public void method181(class33 arg0) {
        if (arg0.field433 > this.field495) {
            arg0.field433 = this.field495;
        }
        if (arg0.field434 < this.field495) {
            arg0.field434 = this.field495;
        }
        if (arg0.field427 > this.field496) {
            arg0.field427 = this.field496;
        }
        if (arg0.field436 < this.field496) {
            arg0.field436 = this.field496;
        }
    }

    @ObfuscatedName("am.g(IIIB)Z")
    public boolean method182(int arg0, int arg1, int arg2) {
        if (arg0 >= this.field498 && arg0 < this.field498 + this.field497) {
            return arg1 >> 6 == this.field493 && arg2 >> 6 == this.field494;
        } else {
            return false;
        }
    }

    @ObfuscatedName("am.m(III)Z")
    public boolean method183(int arg0, int arg1) {
        return arg0 >> 6 == this.field495 && arg1 >> 6 == this.field496;
    }

    @ObfuscatedName("am.h(IIII)[I")
    public int[] method187(int arg0, int arg1, int arg2) {
        return this.method182(arg0, arg1, arg2) ? new int[] { this.field495 * 64 - this.field493 * 64 + arg1, this.field496 * 64 - this.field494 * 64 + arg2 } : null;
    }

    @ObfuscatedName("am.i(IIB)Lhv;")
    public class224 method185(int arg0, int arg1) {
        if (this.method183(arg0, arg1)) {
            int var3 = this.field493 * 64 - this.field495 * 64 + arg0;
            int var4 = this.field494 * 64 - this.field496 * 64 + arg1;
            return new class224(this.field498, var3, var4);
        } else {
            return null;
        }
    }

    @ObfuscatedName("am.w(Lgy;I)V")
    public void method186(class185 arg0) {
        this.field498 = arg0.method3239();
        this.field497 = arg0.method3239();
        this.field493 = arg0.method3241();
        this.field494 = arg0.method3241();
        this.field495 = arg0.method3241();
        this.field496 = arg0.method3241();
        this.method465();
    }

    @ObfuscatedName("am.t(B)V")
    public void method465() {
    }
}
