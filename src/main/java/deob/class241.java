package deob;

@Deprecated
@ObfuscatedName("iw")
public class class241 implements class262 {

    @ObfuscatedName("iw.f")
    public int field2841;

    @ObfuscatedName("iw.w")
    public int field2840;

    @ObfuscatedName("iw.v")
    public int field2834;

    @ObfuscatedName("iw.s")
    public int field2835;

    @ObfuscatedName("iw.z")
    public int field2838;

    @ObfuscatedName("iw.j")
    public int field2839;

    @ObfuscatedName("iw.i")
    public int field2837;

    @ObfuscatedName("iw.n")
    public int field2836;

    @ObfuscatedName("iw.l")
    public int field2842;

    @ObfuscatedName("iw.k")
    public int field2843;

    @ObfuscatedName("iw.f(Lii;I)V")
    public void method4545(class242 arg0) {
        if (arg0.field2858 > this.field2837) {
            arg0.field2858 = this.field2837;
        }
        if (arg0.field2853 < this.field2842) {
            arg0.field2853 = this.field2842;
        }
        if (arg0.field2854 > this.field2836) {
            arg0.field2854 = this.field2836;
        }
        if (arg0.field2855 < this.field2843) {
            arg0.field2855 = this.field2843;
        }
    }

    @ObfuscatedName("iw.w(IIII)Z")
    public boolean method4549(int arg0, int arg1, int arg2) {
        if (arg0 >= this.field2841 && arg0 < this.field2841 + this.field2840) {
            return arg1 >> 6 >= this.field2834 && arg1 >> 6 <= this.field2838 && arg2 >> 6 >= this.field2835 && arg2 >> 6 <= this.field2839;
        } else {
            return false;
        }
    }

    @ObfuscatedName("iw.v(III)Z")
    public boolean method4558(int arg0, int arg1) {
        return arg0 >> 6 >= this.field2837 && arg0 >> 6 <= this.field2842 && arg1 >> 6 >= this.field2836 && arg1 >> 6 <= this.field2843;
    }

    @ObfuscatedName("iw.s(IIII)[I")
    public int[] method4541(int arg0, int arg1, int arg2) {
        return this.method4549(arg0, arg1, arg2) ? new int[] { this.field2837 * 64 - this.field2834 * 64 + arg1, this.field2836 * 64 - this.field2835 * 64 + arg2 } : null;
    }

    @ObfuscatedName("iw.z(III)Lko;")
    public class301 method4542(int arg0, int arg1) {
        if (this.method4558(arg0, arg1)) {
            int var3 = this.field2834 * 64 - this.field2837 * 64 + arg0;
            int var4 = this.field2835 * 64 - this.field2836 * 64 + arg1;
            return new class301(this.field2841, var3, var4);
        } else {
            return null;
        }
    }

    @ObfuscatedName("iw.j(Lrd;I)V")
    public void method4543(class474 arg0) {
        this.field2841 = arg0.method7964();
        this.field2840 = arg0.method7964();
        this.field2834 = arg0.method8032();
        this.field2835 = arg0.method8032();
        this.field2838 = arg0.method8032();
        this.field2839 = arg0.method8032();
        this.field2837 = arg0.method8032();
        this.field2836 = arg0.method8032();
        this.field2842 = arg0.method8032();
        this.field2843 = arg0.method8032();
        this.method4544();
    }

    @ObfuscatedName("iw.i(I)V")
    public void method4544() {
    }
}
