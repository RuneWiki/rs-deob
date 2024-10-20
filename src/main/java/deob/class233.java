package deob;

@ObfuscatedName("ha")
public class class233 implements class246 {

    @ObfuscatedName("ha.o")
    public int field2819;

    @ObfuscatedName("ha.q")
    public int field2816;

    @ObfuscatedName("ha.l")
    public int field2828;

    @ObfuscatedName("ha.k")
    public int field2820;

    @ObfuscatedName("ha.a")
    public int field2822;

    @ObfuscatedName("ha.m")
    public int field2815;

    @ObfuscatedName("ha.p")
    public int field2821;

    @ObfuscatedName("ha.s")
    public int field2818;

    @ObfuscatedName("ha.r")
    public int field2823;

    @ObfuscatedName("ha.v")
    public int field2824;

    @ObfuscatedName("ha.y")
    public int field2825;

    @ObfuscatedName("ha.c")
    public int field2826;

    @ObfuscatedName("ha.w")
    public int field2827;

    @ObfuscatedName("ha.b")
    public int field2817;

    @ObfuscatedName("ha.o(Lhm;I)V")
    public void method4125(class226 arg0) {
        if (arg0.field2743 > this.field2822) {
            arg0.field2743 = this.field2822;
        }
        if (arg0.field2744 < this.field2822) {
            arg0.field2744 = this.field2822;
        }
        if (arg0.field2747 > this.field2815) {
            arg0.field2747 = this.field2815;
        }
        if (arg0.field2746 < this.field2815) {
            arg0.field2746 = this.field2815;
        }
    }

    @ObfuscatedName("ha.q(IIIB)Z")
    public boolean method4120(int arg0, int arg1, int arg2) {
        if (arg0 >= this.field2819 && arg0 < this.field2819 + this.field2816) {
            return arg1 >= (this.field2828 << 6) + (this.field2821 << 3) && arg1 <= (this.field2828 << 6) + (this.field2823 << 3) + 7 && arg2 >= (this.field2820 << 6) + (this.field2818 << 3) && arg2 <= (this.field2824 << 3) + (this.field2820 << 6) + 7;
        } else {
            return false;
        }
    }

    @ObfuscatedName("ha.l(IIB)Z")
    public boolean method4124(int arg0, int arg1) {
        return arg0 >= (this.field2825 << 3) + (this.field2822 << 6) && arg0 <= (this.field2827 << 3) + (this.field2822 << 6) + 7 && arg1 >= (this.field2826 << 3) + (this.field2815 << 6) && arg1 <= (this.field2817 << 3) + (this.field2815 << 6) + 7;
    }

    @ObfuscatedName("ha.k(IIII)[I")
    public int[] method4110(int arg0, int arg1, int arg2) {
        return this.method4120(arg0, arg1, arg2) ? new int[] { this.field2825 * 8 - this.field2821 * 8 + this.field2822 * 64 - this.field2828 * 64 + arg1, this.field2826 * 8 - this.field2818 * 8 + this.field2815 * 64 - this.field2820 * 64 + arg2 } : null;
    }

    @ObfuscatedName("ha.a(III)Lkd;")
    public class290 method4112(int arg0, int arg1) {
        if (this.method4124(arg0, arg1)) {
            int var3 = this.field2821 * 8 - this.field2825 * 8 + this.field2828 * 64 - this.field2822 * 64 + arg0;
            int var4 = this.field2818 * 8 - this.field2826 * 8 + this.field2820 * 64 - this.field2815 * 64 + arg1;
            return new class290(this.field2819, var3, var4);
        } else {
            return null;
        }
    }

    @ObfuscatedName("ha.m(Lpx;I)V")
    public void method4113(class440 arg0) {
        this.field2819 = arg0.method7071();
        this.field2816 = arg0.method7071();
        this.field2828 = arg0.method7082();
        this.field2821 = arg0.method7071();
        this.field2823 = arg0.method7071();
        this.field2820 = arg0.method7082();
        this.field2818 = arg0.method7071();
        this.field2824 = arg0.method7071();
        this.field2822 = arg0.method7082();
        this.field2825 = arg0.method7071();
        this.field2827 = arg0.method7071();
        this.field2815 = arg0.method7082();
        this.field2826 = arg0.method7071();
        this.field2817 = arg0.method7071();
        this.method4394();
    }

    @ObfuscatedName("ha.p(S)V")
    public void method4394() {
    }
}
