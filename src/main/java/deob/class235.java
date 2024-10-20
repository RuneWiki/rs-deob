package deob;

@ObfuscatedName("ik")
public class class235 implements class238 {

    @ObfuscatedName("ik.c")
    public int field2780;

    @ObfuscatedName("ik.l")
    public int field2783;

    @ObfuscatedName("ik.s")
    public int field2779;

    @ObfuscatedName("ik.e")
    public int field2782;

    @ObfuscatedName("ik.r")
    public int field2781;

    @ObfuscatedName("ik.o")
    public int field2784;

    @ObfuscatedName("ik.c(Lhm;I)V")
    public void method4003(class218 arg0) {
        if (arg0.field2635 > this.field2781) {
            arg0.field2635 = this.field2781;
        }
        if (arg0.field2636 < this.field2781) {
            arg0.field2636 = this.field2781;
        }
        if (arg0.field2630 > this.field2784) {
            arg0.field2630 = this.field2784;
        }
        if (arg0.field2637 < this.field2784) {
            arg0.field2637 = this.field2784;
        }
    }

    @ObfuscatedName("ik.l(IIII)Z")
    public boolean method4024(int arg0, int arg1, int arg2) {
        if (arg0 >= this.field2780 && arg0 < this.field2783 + this.field2780) {
            return arg1 >> 6 == this.field2779 && arg2 >> 6 == this.field2782;
        } else {
            return false;
        }
    }

    @ObfuscatedName("ik.s(III)Z")
    public boolean method4007(int arg0, int arg1) {
        return arg0 >> 6 == this.field2781 && arg1 >> 6 == this.field2784;
    }

    @ObfuscatedName("ik.e(IIII)[I")
    public int[] method4013(int arg0, int arg1, int arg2) {
        return this.method4024(arg0, arg1, arg2) ? new int[] { this.field2781 * 64 - this.field2779 * 64 + arg1, this.field2784 * 64 - this.field2782 * 64 + arg2 } : null;
    }

    @ObfuscatedName("ik.r(IIB)Ljd;")
    public class282 method4006(int arg0, int arg1) {
        if (this.method4007(arg0, arg1)) {
            int var3 = this.field2779 * 64 - this.field2781 * 64 + arg0;
            int var4 = this.field2782 * 64 - this.field2784 * 64 + arg1;
            return new class282(this.field2780, var3, var4);
        } else {
            return null;
        }
    }

    @ObfuscatedName("ik.o(Lpi;B)V")
    public void method4002(class421 arg0) {
        this.field2780 = arg0.method6686();
        this.field2783 = arg0.method6686();
        this.field2779 = arg0.method6666();
        this.field2782 = arg0.method6666();
        this.field2781 = arg0.method6666();
        this.field2784 = arg0.method6666();
        this.method4358();
    }

    @ObfuscatedName("ik.i(I)V")
    public void method4358() {
    }
}
