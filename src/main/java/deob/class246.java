package deob;

@ObfuscatedName("iv")
public class class246 implements class262 {

    @ObfuscatedName("iv.f")
    public int field2903;

    @ObfuscatedName("iv.w")
    public int field2899;

    @ObfuscatedName("iv.v")
    public int field2907;

    @ObfuscatedName("iv.s")
    public int field2901;

    @ObfuscatedName("iv.z")
    public int field2902;

    @ObfuscatedName("iv.j")
    public int field2900;

    @ObfuscatedName("iv.i")
    public int field2898;

    @ObfuscatedName("iv.n")
    public int field2904;

    @ObfuscatedName("iv.l")
    public int field2906;

    @ObfuscatedName("iv.k")
    public int field2905;

    @ObfuscatedName("iv.f(Lii;I)V")
    public void method4545(class242 arg0) {
        if (arg0.field2858 > this.field2902) {
            arg0.field2858 = this.field2902;
        }
        if (arg0.field2853 < this.field2902) {
            arg0.field2853 = this.field2902;
        }
        if (arg0.field2854 > this.field2900) {
            arg0.field2854 = this.field2900;
        }
        if (arg0.field2855 < this.field2900) {
            arg0.field2855 = this.field2900;
        }
    }

    @ObfuscatedName("iv.w(IIII)Z")
    public boolean method4549(int arg0, int arg1, int arg2) {
        if (arg0 >= this.field2903 && arg0 < this.field2903 + this.field2899) {
            return arg1 >= (this.field2907 << 6) + (this.field2898 << 3) && arg1 <= (this.field2907 << 6) + (this.field2898 << 3) + 7 && arg2 >= (this.field2904 << 3) + (this.field2901 << 6) && arg2 <= (this.field2904 << 3) + (this.field2901 << 6) + 7;
        } else {
            return false;
        }
    }

    @ObfuscatedName("iv.v(III)Z")
    public boolean method4558(int arg0, int arg1) {
        return arg0 >= (this.field2906 << 3) + (this.field2902 << 6) && arg0 <= (this.field2906 << 3) + (this.field2902 << 6) + 7 && arg1 >= (this.field2905 << 3) + (this.field2900 << 6) && arg1 <= (this.field2905 << 3) + (this.field2900 << 6) + 7;
    }

    @ObfuscatedName("iv.s(IIII)[I")
    public int[] method4541(int arg0, int arg1, int arg2) {
        return this.method4549(arg0, arg1, arg2) ? new int[] { this.field2906 * 8 - this.field2898 * 8 + this.field2902 * 64 - this.field2907 * 64 + arg1, this.field2905 * 8 - this.field2904 * 8 + this.field2900 * 64 - this.field2901 * 64 + arg2 } : null;
    }

    @ObfuscatedName("iv.z(III)Lko;")
    public class301 method4542(int arg0, int arg1) {
        if (this.method4558(arg0, arg1)) {
            int var3 = this.field2898 * 8 - this.field2906 * 8 + this.field2907 * 64 - this.field2902 * 64 + arg0;
            int var4 = this.field2904 * 8 - this.field2905 * 8 + this.field2901 * 64 - this.field2900 * 64 + arg1;
            return new class301(this.field2903, var3, var4);
        } else {
            return null;
        }
    }

    @ObfuscatedName("iv.j(Lrd;I)V")
    public void method4543(class474 arg0) {
        this.field2903 = arg0.method7964();
        this.field2899 = arg0.method7964();
        this.field2907 = arg0.method8032();
        this.field2898 = arg0.method7964();
        this.field2901 = arg0.method8032();
        this.field2904 = arg0.method7964();
        this.field2902 = arg0.method8032();
        this.field2906 = arg0.method7964();
        this.field2900 = arg0.method8032();
        this.field2905 = arg0.method7964();
        this.method4853();
    }

    @ObfuscatedName("iv.i(I)V")
    public void method4853() {
    }
}
