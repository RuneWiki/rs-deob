package deob;

@ObfuscatedName("ig")
public class class255 implements class258 {

    @ObfuscatedName("ig.h")
    public int field2998;

    @ObfuscatedName("ig.e")
    public int field2994;

    @ObfuscatedName("ig.v")
    public int field2995;

    @ObfuscatedName("ig.x")
    public int field2996;

    @ObfuscatedName("ig.m")
    public int field2993;

    @ObfuscatedName("ig.q")
    public int field2997;

    @ObfuscatedName("ig.h(Lit;B)V")
    public void method4475(class238 arg0) {
        if (arg0.field2856 > this.field2993) {
            arg0.field2856 = this.field2993;
        }
        if (arg0.field2857 < this.field2993) {
            arg0.field2857 = this.field2993;
        }
        if (arg0.field2852 > this.field2997) {
            arg0.field2852 = this.field2997;
        }
        if (arg0.field2859 < this.field2997) {
            arg0.field2859 = this.field2997;
        }
    }

    @ObfuscatedName("ig.e(IIII)Z")
    public boolean method4476(int arg0, int arg1, int arg2) {
        if (arg0 >= this.field2998 && arg0 < this.field2998 + this.field2994) {
            return arg1 >> 6 == this.field2995 && arg2 >> 6 == this.field2996;
        } else {
            return false;
        }
    }

    @ObfuscatedName("ig.v(IIS)Z")
    public boolean method4477(int arg0, int arg1) {
        return arg0 >> 6 == this.field2993 && arg1 >> 6 == this.field2997;
    }

    @ObfuscatedName("ig.x(IIIB)[I")
    public int[] method4478(int arg0, int arg1, int arg2) {
        return this.method4476(arg0, arg1, arg2) ? new int[] { this.field2993 * 64 - this.field2995 * 64 + arg1, this.field2997 * 64 - this.field2996 * 64 + arg2 } : null;
    }

    @ObfuscatedName("ig.m(III)Lky;")
    public class297 method4479(int arg0, int arg1) {
        if (this.method4477(arg0, arg1)) {
            int var3 = this.field2995 * 64 - this.field2993 * 64 + arg0;
            int var4 = this.field2996 * 64 - this.field2997 * 64 + arg1;
            return new class297(this.field2998, var3, var4);
        } else {
            return null;
        }
    }

    @ObfuscatedName("ig.q(Lqy;I)V")
    public void method4480(class467 arg0) {
        this.field2998 = arg0.method7792();
        this.field2994 = arg0.method7792();
        this.field2995 = arg0.method7794();
        this.field2996 = arg0.method7794();
        this.field2993 = arg0.method7794();
        this.field2997 = arg0.method7794();
        this.method4806();
    }

    @ObfuscatedName("ig.f(I)V")
    public void method4806() {
    }
}
