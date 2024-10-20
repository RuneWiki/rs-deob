package deob;

@ObfuscatedName("iu")
public class class237 implements class258 {

    @ObfuscatedName("iu.h")
    public int field2843;

    @ObfuscatedName("iu.e")
    public int field2841;

    @ObfuscatedName("iu.v")
    public int field2840;

    @ObfuscatedName("iu.x")
    public int field2847;

    @ObfuscatedName("iu.m")
    public int field2844;

    @ObfuscatedName("iu.q")
    public int field2848;

    @ObfuscatedName("iu.f")
    public int field2846;

    @ObfuscatedName("iu.r")
    public int field2845;

    @ObfuscatedName("iu.u")
    public int field2842;

    @ObfuscatedName("iu.b")
    public int field2849;

    @ObfuscatedName("iu.h(Lit;B)V")
    public void method4475(class238 arg0) {
        if (arg0.field2856 > this.field2846) {
            arg0.field2856 = this.field2846;
        }
        if (arg0.field2857 < this.field2842) {
            arg0.field2857 = this.field2842;
        }
        if (arg0.field2852 > this.field2845) {
            arg0.field2852 = this.field2845;
        }
        if (arg0.field2859 < this.field2849) {
            arg0.field2859 = this.field2849;
        }
    }

    @ObfuscatedName("iu.e(IIII)Z")
    public boolean method4476(int arg0, int arg1, int arg2) {
        if (arg0 >= this.field2843 && arg0 < this.field2843 + this.field2841) {
            return arg1 >> 6 >= this.field2840 && arg1 >> 6 <= this.field2844 && arg2 >> 6 >= this.field2847 && arg2 >> 6 <= this.field2848;
        } else {
            return false;
        }
    }

    @ObfuscatedName("iu.v(IIS)Z")
    public boolean method4477(int arg0, int arg1) {
        return arg0 >> 6 >= this.field2846 && arg0 >> 6 <= this.field2842 && arg1 >> 6 >= this.field2845 && arg1 >> 6 <= this.field2849;
    }

    @ObfuscatedName("iu.x(IIIB)[I")
    public int[] method4478(int arg0, int arg1, int arg2) {
        return this.method4476(arg0, arg1, arg2) ? new int[] { this.field2846 * 64 - this.field2840 * 64 + arg1, this.field2845 * 64 - this.field2847 * 64 + arg2 } : null;
    }

    @ObfuscatedName("iu.m(III)Lky;")
    public class297 method4479(int arg0, int arg1) {
        if (this.method4477(arg0, arg1)) {
            int var3 = this.field2840 * 64 - this.field2846 * 64 + arg0;
            int var4 = this.field2847 * 64 - this.field2845 * 64 + arg1;
            return new class297(this.field2843, var3, var4);
        } else {
            return null;
        }
    }

    @ObfuscatedName("iu.q(Lqy;I)V")
    public void method4480(class467 arg0) {
        this.field2843 = arg0.method7792();
        this.field2841 = arg0.method7792();
        this.field2840 = arg0.method7794();
        this.field2847 = arg0.method7794();
        this.field2844 = arg0.method7794();
        this.field2848 = arg0.method7794();
        this.field2846 = arg0.method7794();
        this.field2845 = arg0.method7794();
        this.field2842 = arg0.method7794();
        this.field2849 = arg0.method7794();
        this.method4481();
    }

    @ObfuscatedName("iu.f(B)V")
    public void method4481() {
    }
}
