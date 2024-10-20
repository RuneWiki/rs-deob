package deob;

@ObfuscatedName("ia")
public class class245 implements class258 {

    @ObfuscatedName("ia.h")
    public int field2926;

    @ObfuscatedName("ia.e")
    public int field2920;

    @ObfuscatedName("ia.v")
    public int field2930;

    @ObfuscatedName("ia.x")
    public int field2922;

    @ObfuscatedName("ia.m")
    public int field2923;

    @ObfuscatedName("ia.q")
    public int field2921;

    @ObfuscatedName("ia.f")
    public int field2925;

    @ObfuscatedName("ia.r")
    public int field2929;

    @ObfuscatedName("ia.u")
    public int field2927;

    @ObfuscatedName("ia.b")
    public int field2928;

    @ObfuscatedName("ia.j")
    public int field2919;

    @ObfuscatedName("ia.g")
    public int field2924;

    @ObfuscatedName("ia.i")
    public int field2931;

    @ObfuscatedName("ia.o")
    public int field2932;

    @ObfuscatedName("ia.h(Lit;B)V")
    public void method4475(class238 arg0) {
        if (arg0.field2856 > this.field2923) {
            arg0.field2856 = this.field2923;
        }
        if (arg0.field2857 < this.field2923) {
            arg0.field2857 = this.field2923;
        }
        if (arg0.field2852 > this.field2921) {
            arg0.field2852 = this.field2921;
        }
        if (arg0.field2859 < this.field2921) {
            arg0.field2859 = this.field2921;
        }
    }

    @ObfuscatedName("ia.e(IIII)Z")
    public boolean method4476(int arg0, int arg1, int arg2) {
        if (arg0 >= this.field2926 && arg0 < this.field2926 + this.field2920) {
            return arg1 >= (this.field2930 << 6) + (this.field2925 << 3) && arg1 <= (this.field2930 << 6) + (this.field2927 << 3) + 7 && arg2 >= (this.field2929 << 3) + (this.field2922 << 6) && arg2 <= (this.field2928 << 3) + (this.field2922 << 6) + 7;
        } else {
            return false;
        }
    }

    @ObfuscatedName("ia.v(IIS)Z")
    public boolean method4477(int arg0, int arg1) {
        return arg0 >= (this.field2923 << 6) + (this.field2919 << 3) && arg0 <= (this.field2931 << 3) + (this.field2923 << 6) + 7 && arg1 >= (this.field2924 << 3) + (this.field2921 << 6) && arg1 <= (this.field2932 << 3) + (this.field2921 << 6) + 7;
    }

    @ObfuscatedName("ia.x(IIIB)[I")
    public int[] method4478(int arg0, int arg1, int arg2) {
        return this.method4476(arg0, arg1, arg2) ? new int[] { this.field2919 * 8 - this.field2925 * 8 + this.field2923 * 64 - this.field2930 * 64 + arg1, this.field2924 * 8 - this.field2929 * 8 + this.field2921 * 64 - this.field2922 * 64 + arg2 } : null;
    }

    @ObfuscatedName("ia.m(III)Lky;")
    public class297 method4479(int arg0, int arg1) {
        if (this.method4477(arg0, arg1)) {
            int var3 = this.field2925 * 8 - this.field2919 * 8 + this.field2930 * 64 - this.field2923 * 64 + arg0;
            int var4 = this.field2929 * 8 - this.field2924 * 8 + this.field2922 * 64 - this.field2921 * 64 + arg1;
            return new class297(this.field2926, var3, var4);
        } else {
            return null;
        }
    }

    @ObfuscatedName("ia.q(Lqy;I)V")
    public void method4480(class467 arg0) {
        this.field2926 = arg0.method7792();
        this.field2920 = arg0.method7792();
        this.field2930 = arg0.method7794();
        this.field2925 = arg0.method7792();
        this.field2927 = arg0.method7792();
        this.field2922 = arg0.method7794();
        this.field2929 = arg0.method7792();
        this.field2928 = arg0.method7792();
        this.field2923 = arg0.method7794();
        this.field2919 = arg0.method7792();
        this.field2931 = arg0.method7792();
        this.field2921 = arg0.method7794();
        this.field2924 = arg0.method7792();
        this.field2932 = arg0.method7792();
        this.method4754();
    }

    @ObfuscatedName("ia.f(B)V")
    public void method4754() {
    }
}
