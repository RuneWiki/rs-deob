package deob;

@ObfuscatedName("id")
public class class242 implements class258 {

    @ObfuscatedName("id.h")
    public int field2904;

    @ObfuscatedName("id.e")
    public int field2899;

    @ObfuscatedName("id.v")
    public int field2900;

    @ObfuscatedName("id.x")
    public int field2898;

    @ObfuscatedName("id.m")
    public int field2906;

    @ObfuscatedName("id.q")
    public int field2902;

    @ObfuscatedName("id.f")
    public int field2905;

    @ObfuscatedName("id.r")
    public int field2901;

    @ObfuscatedName("id.u")
    public int field2903;

    @ObfuscatedName("id.b")
    public int field2907;

    @ObfuscatedName("id.h(Lit;B)V")
    public void method4475(class238 arg0) {
        if (arg0.field2856 > this.field2906) {
            arg0.field2856 = this.field2906;
        }
        if (arg0.field2857 < this.field2906) {
            arg0.field2857 = this.field2906;
        }
        if (arg0.field2852 > this.field2902) {
            arg0.field2852 = this.field2902;
        }
        if (arg0.field2859 < this.field2902) {
            arg0.field2859 = this.field2902;
        }
    }

    @ObfuscatedName("id.e(IIII)Z")
    public boolean method4476(int arg0, int arg1, int arg2) {
        if (arg0 >= this.field2904 && arg0 < this.field2904 + this.field2899) {
            return arg1 >= (this.field2905 << 3) + (this.field2900 << 6) && arg1 <= (this.field2905 << 3) + (this.field2900 << 6) + 7 && arg2 >= (this.field2901 << 3) + (this.field2898 << 6) && arg2 <= (this.field2901 << 3) + (this.field2898 << 6) + 7;
        } else {
            return false;
        }
    }

    @ObfuscatedName("id.v(IIS)Z")
    public boolean method4477(int arg0, int arg1) {
        return arg0 >= (this.field2906 << 6) + (this.field2903 << 3) && arg0 <= (this.field2906 << 6) + (this.field2903 << 3) + 7 && arg1 >= (this.field2907 << 3) + (this.field2902 << 6) && arg1 <= (this.field2907 << 3) + (this.field2902 << 6) + 7;
    }

    @ObfuscatedName("id.x(IIIB)[I")
    public int[] method4478(int arg0, int arg1, int arg2) {
        return this.method4476(arg0, arg1, arg2) ? new int[] { this.field2903 * 8 - this.field2905 * 8 + this.field2906 * 64 - this.field2900 * 64 + arg1, this.field2907 * 8 - this.field2901 * 8 + this.field2902 * 64 - this.field2898 * 64 + arg2 } : null;
    }

    @ObfuscatedName("id.m(III)Lky;")
    public class297 method4479(int arg0, int arg1) {
        if (this.method4477(arg0, arg1)) {
            int var3 = this.field2905 * 8 - this.field2903 * 8 + this.field2900 * 64 - this.field2906 * 64 + arg0;
            int var4 = this.field2901 * 8 - this.field2907 * 8 + this.field2898 * 64 - this.field2902 * 64 + arg1;
            return new class297(this.field2904, var3, var4);
        } else {
            return null;
        }
    }

    @ObfuscatedName("id.q(Lqy;I)V")
    public void method4480(class467 arg0) {
        this.field2904 = arg0.method7792();
        this.field2899 = arg0.method7792();
        this.field2900 = arg0.method7794();
        this.field2905 = arg0.method7792();
        this.field2898 = arg0.method7794();
        this.field2901 = arg0.method7792();
        this.field2906 = arg0.method7794();
        this.field2903 = arg0.method7792();
        this.field2902 = arg0.method7794();
        this.field2907 = arg0.method7792();
        this.method4748();
    }

    @ObfuscatedName("id.f(I)V")
    public void method4748() {
    }
}
