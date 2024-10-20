package deob;

@ObfuscatedName("hc")
public class class232 implements class245 {

    @ObfuscatedName("hc.c")
    public int field2781;

    @ObfuscatedName("hc.v")
    public int field2773;

    @ObfuscatedName("hc.q")
    public int field2774;

    @ObfuscatedName("hc.f")
    public int field2782;

    @ObfuscatedName("hc.j")
    public int field2776;

    @ObfuscatedName("hc.e")
    public int field2777;

    @ObfuscatedName("hc.g")
    public int field2772;

    @ObfuscatedName("hc.w")
    public int field2779;

    @ObfuscatedName("hc.y")
    public int field2780;

    @ObfuscatedName("hc.i")
    public int field2786;

    @ObfuscatedName("hc.s")
    public int field2775;

    @ObfuscatedName("hc.t")
    public int field2785;

    @ObfuscatedName("hc.z")
    public int field2784;

    @ObfuscatedName("hc.r")
    public int field2778;

    @ObfuscatedName("hc.c(Lhg;I)V")
    public void method4246(class225 arg0) {
        if (arg0.field2700 > this.field2776) {
            arg0.field2700 = this.field2776;
        }
        if (arg0.field2706 < this.field2776) {
            arg0.field2706 = this.field2776;
        }
        if (arg0.field2707 > this.field2777) {
            arg0.field2707 = this.field2777;
        }
        if (arg0.field2703 < this.field2777) {
            arg0.field2703 = this.field2777;
        }
    }

    @ObfuscatedName("hc.v(IIII)Z")
    public boolean method4259(int arg0, int arg1, int arg2) {
        if (arg0 >= this.field2781 && arg0 < this.field2781 + this.field2773) {
            return arg1 >= (this.field2774 << 6) + (this.field2772 << 3) && arg1 <= (this.field2780 << 3) + (this.field2774 << 6) + 7 && arg2 >= (this.field2782 << 6) + (this.field2779 << 3) && arg2 <= (this.field2786 << 3) + (this.field2782 << 6) + 7;
        } else {
            return false;
        }
    }

    @ObfuscatedName("hc.q(III)Z")
    public boolean method4248(int arg0, int arg1) {
        return arg0 >= (this.field2776 << 6) + (this.field2775 << 3) && arg0 <= (this.field2784 << 3) + (this.field2776 << 6) + 7 && arg1 >= (this.field2785 << 3) + (this.field2777 << 6) && arg1 <= (this.field2778 << 3) + (this.field2777 << 6) + 7;
    }

    @ObfuscatedName("hc.f(IIII)[I")
    public int[] method4249(int arg0, int arg1, int arg2) {
        return this.method4259(arg0, arg1, arg2) ? new int[] { this.field2775 * 8 - this.field2772 * 8 + this.field2776 * 64 - this.field2774 * 64 + arg1, this.field2785 * 8 - this.field2779 * 8 + this.field2777 * 64 - this.field2782 * 64 + arg2 } : null;
    }

    @ObfuscatedName("hc.j(III)Lkd;")
    public class289 method4250(int arg0, int arg1) {
        if (this.method4248(arg0, arg1)) {
            int var3 = this.field2772 * 8 - this.field2775 * 8 + this.field2774 * 64 - this.field2776 * 64 + arg0;
            int var4 = this.field2779 * 8 - this.field2785 * 8 + this.field2782 * 64 - this.field2777 * 64 + arg1;
            return new class289(this.field2781, var3, var4);
        } else {
            return null;
        }
    }

    @ObfuscatedName("hc.e(Lqt;B)V")
    public void method4270(class443 arg0) {
        this.field2781 = arg0.method7047();
        this.field2773 = arg0.method7047();
        this.field2774 = arg0.method7049();
        this.field2772 = arg0.method7047();
        this.field2780 = arg0.method7047();
        this.field2782 = arg0.method7049();
        this.field2779 = arg0.method7047();
        this.field2786 = arg0.method7047();
        this.field2776 = arg0.method7049();
        this.field2775 = arg0.method7047();
        this.field2784 = arg0.method7047();
        this.field2777 = arg0.method7049();
        this.field2785 = arg0.method7047();
        this.field2778 = arg0.method7047();
        this.method4539();
    }

    @ObfuscatedName("hc.g(I)V")
    public void method4539() {
    }
}
