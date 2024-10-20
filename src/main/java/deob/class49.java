package deob;

@ObfuscatedName("ah")
public class class49 implements class43 {

    @ObfuscatedName("ah.w")
    public int field644;

    @ObfuscatedName("ah.o")
    public int field634;

    @ObfuscatedName("ah.x")
    public int field635;

    @ObfuscatedName("ah.k")
    public int field636;

    @ObfuscatedName("ah.f")
    public int field637;

    @ObfuscatedName("ah.i")
    public int field638;

    @ObfuscatedName("ah.j")
    public int field642;

    @ObfuscatedName("ah.m")
    public int field639;

    @ObfuscatedName("ah.u")
    public int field641;

    @ObfuscatedName("ah.r")
    public int field640;

    @ObfuscatedName("ah.w(Laq;I)V")
    public void method203(class33 arg0) {
        if (arg0.field461 > this.field637) {
            arg0.field461 = this.field637;
        }
        if (arg0.field468 < this.field637) {
            arg0.field468 = this.field637;
        }
        if (arg0.field474 > this.field638) {
            arg0.field474 = this.field638;
        }
        if (arg0.field470 < this.field638) {
            arg0.field470 = this.field638;
        }
    }

    @ObfuscatedName("ah.o(IIIB)Z")
    public boolean method177(int arg0, int arg1, int arg2) {
        if (arg0 >= this.field644 && arg0 < this.field644 + this.field634) {
            return arg1 >= (this.field642 << 3) + (this.field635 << 6) && arg1 <= (this.field642 << 3) + (this.field635 << 6) + 7 && arg2 >= (this.field639 << 3) + (this.field636 << 6) && arg2 <= (this.field639 << 3) + (this.field636 << 6) + 7;
        } else {
            return false;
        }
    }

    @ObfuscatedName("ah.x(III)Z")
    public boolean method176(int arg0, int arg1) {
        return arg0 >= (this.field641 << 3) + (this.field637 << 6) && arg0 <= (this.field641 << 3) + (this.field637 << 6) + 7 && arg1 >= (this.field640 << 3) + (this.field638 << 6) && arg1 <= (this.field640 << 3) + (this.field638 << 6) + 7;
    }

    @ObfuscatedName("ah.k(IIII)[I")
    public int[] method179(int arg0, int arg1, int arg2) {
        return this.method177(arg0, arg1, arg2) ? new int[] { this.field641 * 8 - this.field642 * 8 + this.field637 * 64 - this.field635 * 64 + arg1, this.field640 * 8 - this.field639 * 8 + this.field638 * 64 - this.field636 * 64 + arg2 } : null;
    }

    @ObfuscatedName("ah.f(III)Lhp;")
    public class216 method180(int arg0, int arg1) {
        if (this.method176(arg0, arg1)) {
            int var3 = this.field642 * 8 - this.field641 * 8 + this.field635 * 64 - this.field637 * 64 + arg0;
            int var4 = this.field639 * 8 - this.field640 * 8 + this.field636 * 64 - this.field638 * 64 + arg1;
            return new class216(this.field644, var3, var4);
        } else {
            return null;
        }
    }

    @ObfuscatedName("ah.i(Lfi;B)V")
    public void method181(class177 arg0) {
        this.field644 = arg0.method2931();
        this.field634 = arg0.method2931();
        this.field635 = arg0.method2886();
        this.field642 = arg0.method2931();
        this.field636 = arg0.method2886();
        this.field639 = arg0.method2931();
        this.field637 = arg0.method2886();
        this.field641 = arg0.method2931();
        this.field638 = arg0.method2886();
        this.field640 = arg0.method2931();
        this.method625();
    }

    @ObfuscatedName("ah.j(B)V")
    public void method625() {
    }
}
