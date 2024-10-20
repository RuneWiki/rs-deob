package deob;

@ObfuscatedName("ay")
public class class39 implements class43 {

    @ObfuscatedName("ay.w")
    public int field531;

    @ObfuscatedName("ay.o")
    public int field535;

    @ObfuscatedName("ay.x")
    public int field532;

    @ObfuscatedName("ay.k")
    public int field530;

    @ObfuscatedName("ay.f")
    public int field534;

    @ObfuscatedName("ay.i")
    public int field533;

    @ObfuscatedName("ay.w(Laq;I)V")
    public void method203(class33 arg0) {
        if (arg0.field461 > this.field534) {
            arg0.field461 = this.field534;
        }
        if (arg0.field468 < this.field534) {
            arg0.field468 = this.field534;
        }
        if (arg0.field474 > this.field533) {
            arg0.field474 = this.field533;
        }
        if (arg0.field470 < this.field533) {
            arg0.field470 = this.field533;
        }
    }

    @ObfuscatedName("ay.o(IIIB)Z")
    public boolean method177(int arg0, int arg1, int arg2) {
        if (arg0 >= this.field531 && arg0 < this.field535 + this.field531) {
            return arg1 >> 6 == this.field532 && arg2 >> 6 == this.field530;
        } else {
            return false;
        }
    }

    @ObfuscatedName("ay.x(III)Z")
    public boolean method176(int arg0, int arg1) {
        return arg0 >> 6 == this.field534 && arg1 >> 6 == this.field533;
    }

    @ObfuscatedName("ay.k(IIII)[I")
    public int[] method179(int arg0, int arg1, int arg2) {
        return this.method177(arg0, arg1, arg2) ? new int[] { this.field534 * 64 - this.field532 * 64 + arg1, this.field533 * 64 - this.field530 * 64 + arg2 } : null;
    }

    @ObfuscatedName("ay.f(III)Lhp;")
    public class216 method180(int arg0, int arg1) {
        if (this.method176(arg0, arg1)) {
            int var3 = this.field532 * 64 - this.field534 * 64 + arg0;
            int var4 = this.field530 * 64 - this.field533 * 64 + arg1;
            return new class216(this.field531, var3, var4);
        } else {
            return null;
        }
    }

    @ObfuscatedName("ay.i(Lfi;B)V")
    public void method181(class177 arg0) {
        this.field531 = arg0.method2931();
        this.field535 = arg0.method2931();
        this.field532 = arg0.method2886();
        this.field530 = arg0.method2886();
        this.field534 = arg0.method2886();
        this.field533 = arg0.method2886();
        this.method477();
    }

    @ObfuscatedName("ay.j(I)V")
    public void method477() {
    }
}
