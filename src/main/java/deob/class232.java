package deob;

@ObfuscatedName("hd")
public class class232 implements class245 {

    @ObfuscatedName("hd.s")
    public int field2791;

    @ObfuscatedName("hd.h")
    public int field2781;

    @ObfuscatedName("hd.w")
    public int field2783;

    @ObfuscatedName("hd.v")
    public int field2784;

    @ObfuscatedName("hd.c")
    public int field2782;

    @ObfuscatedName("hd.q")
    public int field2785;

    @ObfuscatedName("hd.i")
    public int field2787;

    @ObfuscatedName("hd.k")
    public int field2788;

    @ObfuscatedName("hd.o")
    public int field2792;

    @ObfuscatedName("hd.n")
    public int field2790;

    @ObfuscatedName("hd.d")
    public int field2786;

    @ObfuscatedName("hd.a")
    public int field2789;

    @ObfuscatedName("hd.m")
    public int field2793;

    @ObfuscatedName("hd.u")
    public int field2794;

    @ObfuscatedName("hd.s(Lht;I)V")
    public void method4122(class225 arg0) {
        if (arg0.field2722 > this.field2782) {
            arg0.field2722 = this.field2782;
        }
        if (arg0.field2718 < this.field2782) {
            arg0.field2718 = this.field2782;
        }
        if (arg0.field2720 > this.field2785) {
            arg0.field2720 = this.field2785;
        }
        if (arg0.field2719 < this.field2785) {
            arg0.field2719 = this.field2785;
        }
    }

    @ObfuscatedName("hd.h(IIIS)Z")
    public boolean method4123(int arg0, int arg1, int arg2) {
        if (arg0 >= this.field2791 && arg0 < this.field2791 + this.field2781) {
            return arg1 >= (this.field2787 << 3) + (this.field2783 << 6) && arg1 <= (this.field2792 << 3) + (this.field2783 << 6) + 7 && arg2 >= (this.field2788 << 3) + (this.field2784 << 6) && arg2 <= (this.field2790 << 3) + (this.field2784 << 6) + 7;
        } else {
            return false;
        }
    }

    @ObfuscatedName("hd.w(III)Z")
    public boolean method4124(int arg0, int arg1) {
        return arg0 >= (this.field2786 << 3) + (this.field2782 << 6) && arg0 <= (this.field2793 << 3) + (this.field2782 << 6) + 7 && arg1 >= (this.field2789 << 3) + (this.field2785 << 6) && arg1 <= (this.field2794 << 3) + (this.field2785 << 6) + 7;
    }

    @ObfuscatedName("hd.v(IIII)[I")
    public int[] method4125(int arg0, int arg1, int arg2) {
        return this.method4123(arg0, arg1, arg2) ? new int[] { this.field2786 * 8 - this.field2787 * 8 + this.field2782 * 64 - this.field2783 * 64 + arg1, this.field2789 * 8 - this.field2788 * 8 + this.field2785 * 64 - this.field2784 * 64 + arg2 } : null;
    }

    @ObfuscatedName("hd.c(III)Lku;")
    public class290 method4126(int arg0, int arg1) {
        if (this.method4124(arg0, arg1)) {
            int var3 = this.field2787 * 8 - this.field2786 * 8 + this.field2783 * 64 - this.field2782 * 64 + arg0;
            int var4 = this.field2788 * 8 - this.field2789 * 8 + this.field2784 * 64 - this.field2785 * 64 + arg1;
            return new class290(this.field2791, var3, var4);
        } else {
            return null;
        }
    }

    @ObfuscatedName("hd.q(Lqr;B)V")
    public void method4136(class444 arg0) {
        this.field2791 = arg0.method6929();
        this.field2781 = arg0.method6929();
        this.field2783 = arg0.method7120();
        this.field2787 = arg0.method6929();
        this.field2792 = arg0.method6929();
        this.field2784 = arg0.method7120();
        this.field2788 = arg0.method6929();
        this.field2790 = arg0.method6929();
        this.field2782 = arg0.method7120();
        this.field2786 = arg0.method6929();
        this.field2793 = arg0.method6929();
        this.field2785 = arg0.method7120();
        this.field2789 = arg0.method6929();
        this.field2794 = arg0.method6929();
        this.method4435();
    }

    @ObfuscatedName("hd.i(B)V")
    public void method4435() {
    }
}
