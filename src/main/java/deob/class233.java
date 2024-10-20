package deob;

@ObfuscatedName("hb")
public class class233 implements class246 {

    @ObfuscatedName("hb.c")
    public int field2819;

    @ObfuscatedName("hb.p")
    public int field2806;

    @ObfuscatedName("hb.f")
    public int field2807;

    @ObfuscatedName("hb.n")
    public int field2811;

    @ObfuscatedName("hb.k")
    public int field2805;

    @ObfuscatedName("hb.w")
    public int field2810;

    @ObfuscatedName("hb.s")
    public int field2809;

    @ObfuscatedName("hb.q")
    public int field2812;

    @ObfuscatedName("hb.m")
    public int field2813;

    @ObfuscatedName("hb.x")
    public int field2814;

    @ObfuscatedName("hb.j")
    public int field2815;

    @ObfuscatedName("hb.v")
    public int field2808;

    @ObfuscatedName("hb.h")
    public int field2817;

    @ObfuscatedName("hb.t")
    public int field2818;

    @ObfuscatedName("hb.c(Lht;I)V")
    public void method4310(class226 arg0) {
        if (arg0.field2737 > this.field2805) {
            arg0.field2737 = this.field2805;
        }
        if (arg0.field2745 < this.field2805) {
            arg0.field2745 = this.field2805;
        }
        if (arg0.field2739 > this.field2810) {
            arg0.field2739 = this.field2810;
        }
        if (arg0.field2731 < this.field2810) {
            arg0.field2731 = this.field2810;
        }
    }

    @ObfuscatedName("hb.p(IIIB)Z")
    public boolean method4311(int arg0, int arg1, int arg2) {
        if (arg0 >= this.field2819 && arg0 < this.field2819 + this.field2806) {
            return arg1 >= (this.field2809 << 3) + (this.field2807 << 6) && arg1 <= (this.field2813 << 3) + (this.field2807 << 6) + 7 && arg2 >= (this.field2812 << 3) + (this.field2811 << 6) && arg2 <= (this.field2814 << 3) + (this.field2811 << 6) + 7;
        } else {
            return false;
        }
    }

    @ObfuscatedName("hb.f(III)Z")
    public boolean method4312(int arg0, int arg1) {
        return arg0 >= (this.field2815 << 3) + (this.field2805 << 6) && arg0 <= (this.field2817 << 3) + (this.field2805 << 6) + 7 && arg1 >= (this.field2810 << 6) + (this.field2808 << 3) && arg1 <= (this.field2818 << 3) + (this.field2810 << 6) + 7;
    }

    @ObfuscatedName("hb.n(IIIB)[I")
    public int[] method4313(int arg0, int arg1, int arg2) {
        return this.method4311(arg0, arg1, arg2) ? new int[] { this.field2815 * 8 - this.field2809 * 8 + this.field2805 * 64 - this.field2807 * 64 + arg1, this.field2808 * 8 - this.field2812 * 8 + this.field2810 * 64 - this.field2811 * 64 + arg2 } : null;
    }

    @ObfuscatedName("hb.k(III)Lkz;")
    public class291 method4331(int arg0, int arg1) {
        if (this.method4312(arg0, arg1)) {
            int var3 = this.field2809 * 8 - this.field2815 * 8 + this.field2807 * 64 - this.field2805 * 64 + arg0;
            int var4 = this.field2812 * 8 - this.field2808 * 8 + this.field2811 * 64 - this.field2810 * 64 + arg1;
            return new class291(this.field2819, var3, var4);
        } else {
            return null;
        }
    }

    @ObfuscatedName("hb.w(Lqq;I)V")
    public void method4317(class445 arg0) {
        this.field2819 = arg0.method7196();
        this.field2806 = arg0.method7196();
        this.field2807 = arg0.method7198();
        this.field2809 = arg0.method7196();
        this.field2813 = arg0.method7196();
        this.field2811 = arg0.method7198();
        this.field2812 = arg0.method7196();
        this.field2814 = arg0.method7196();
        this.field2805 = arg0.method7198();
        this.field2815 = arg0.method7196();
        this.field2817 = arg0.method7196();
        this.field2810 = arg0.method7198();
        this.field2808 = arg0.method7196();
        this.field2818 = arg0.method7196();
        this.method4611();
    }

    @ObfuscatedName("hb.s(I)V")
    public void method4611() {
    }
}
