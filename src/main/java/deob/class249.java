package deob;

@ObfuscatedName("ir")
public class class249 implements class262 {

    @ObfuscatedName("ir.f")
    public int field2930;

    @ObfuscatedName("ir.w")
    public int field2921;

    @ObfuscatedName("ir.v")
    public int field2920;

    @ObfuscatedName("ir.s")
    public int field2927;

    @ObfuscatedName("ir.z")
    public int field2922;

    @ObfuscatedName("ir.j")
    public int field2923;

    @ObfuscatedName("ir.i")
    public int field2924;

    @ObfuscatedName("ir.n")
    public int field2925;

    @ObfuscatedName("ir.l")
    public int field2919;

    @ObfuscatedName("ir.k")
    public int field2932;

    @ObfuscatedName("ir.c")
    public int field2928;

    @ObfuscatedName("ir.r")
    public int field2929;

    @ObfuscatedName("ir.b")
    public int field2926;

    @ObfuscatedName("ir.m")
    public int field2931;

    @ObfuscatedName("ir.f(Lii;I)V")
    public void method4545(class242 arg0) {
        if (arg0.field2858 > this.field2922) {
            arg0.field2858 = this.field2922;
        }
        if (arg0.field2853 < this.field2922) {
            arg0.field2853 = this.field2922;
        }
        if (arg0.field2854 > this.field2923) {
            arg0.field2854 = this.field2923;
        }
        if (arg0.field2855 < this.field2923) {
            arg0.field2855 = this.field2923;
        }
    }

    @ObfuscatedName("ir.w(IIII)Z")
    public boolean method4549(int arg0, int arg1, int arg2) {
        if (arg0 >= this.field2930 && arg0 < this.field2930 + this.field2921) {
            return arg1 >= (this.field2924 << 3) + (this.field2920 << 6) && arg1 <= (this.field2920 << 6) + (this.field2919 << 3) + 7 && arg2 >= (this.field2927 << 6) + (this.field2925 << 3) && arg2 <= (this.field2932 << 3) + (this.field2927 << 6) + 7;
        } else {
            return false;
        }
    }

    @ObfuscatedName("ir.v(III)Z")
    public boolean method4558(int arg0, int arg1) {
        return arg0 >= (this.field2928 << 3) + (this.field2922 << 6) && arg0 <= (this.field2926 << 3) + (this.field2922 << 6) + 7 && arg1 >= (this.field2929 << 3) + (this.field2923 << 6) && arg1 <= (this.field2931 << 3) + (this.field2923 << 6) + 7;
    }

    @ObfuscatedName("ir.s(IIII)[I")
    public int[] method4541(int arg0, int arg1, int arg2) {
        return this.method4549(arg0, arg1, arg2) ? new int[] { this.field2928 * 8 - this.field2924 * 8 + this.field2922 * 64 - this.field2920 * 64 + arg1, this.field2929 * 8 - this.field2925 * 8 + this.field2923 * 64 - this.field2927 * 64 + arg2 } : null;
    }

    @ObfuscatedName("ir.z(III)Lko;")
    public class301 method4542(int arg0, int arg1) {
        if (this.method4558(arg0, arg1)) {
            int var3 = this.field2924 * 8 - this.field2928 * 8 + this.field2920 * 64 - this.field2922 * 64 + arg0;
            int var4 = this.field2925 * 8 - this.field2929 * 8 + this.field2927 * 64 - this.field2923 * 64 + arg1;
            return new class301(this.field2930, var3, var4);
        } else {
            return null;
        }
    }

    @ObfuscatedName("ir.j(Lrd;I)V")
    public void method4543(class474 arg0) {
        this.field2930 = arg0.method7964();
        this.field2921 = arg0.method7964();
        this.field2920 = arg0.method8032();
        this.field2924 = arg0.method7964();
        this.field2919 = arg0.method7964();
        this.field2927 = arg0.method8032();
        this.field2925 = arg0.method7964();
        this.field2932 = arg0.method7964();
        this.field2922 = arg0.method8032();
        this.field2928 = arg0.method7964();
        this.field2926 = arg0.method7964();
        this.field2923 = arg0.method8032();
        this.field2929 = arg0.method7964();
        this.field2931 = arg0.method7964();
        this.method4863();
    }

    @ObfuscatedName("ir.i(I)V")
    public void method4863() {
    }
}
