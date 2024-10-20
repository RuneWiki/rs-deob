package deob;

@ObfuscatedName("ag")
public final class class43 extends class90 {

    @ObfuscatedName("ag.b")
    public int field872;

    @ObfuscatedName("ag.l")
    public int field856;

    @ObfuscatedName("ag.i")
    public int field857;

    @ObfuscatedName("ag.t")
    public int field874;

    @ObfuscatedName("ag.k")
    public int field859;

    @ObfuscatedName("ag.h")
    public int field860;

    @ObfuscatedName("ag.n")
    public int field858;

    @ObfuscatedName("ag.f")
    public int field862;

    @ObfuscatedName("ag.a")
    public int field863;

    @ObfuscatedName("ag.r")
    public int field867;

    @ObfuscatedName("ag.x")
    public int field855;

    @ObfuscatedName("ag.z")
    public boolean field866 = false;

    @ObfuscatedName("ag.p")
    public double field864;

    @ObfuscatedName("ag.s")
    public double field868;

    @ObfuscatedName("ag.o")
    public double field869;

    @ObfuscatedName("ag.y")
    public double field870;

    @ObfuscatedName("ag.w")
    public double field871;

    @ObfuscatedName("ag.m")
    public double field875;

    @ObfuscatedName("ag.u")
    public double field873;

    @ObfuscatedName("ag.q")
    public double field865;

    @ObfuscatedName("ag.c")
    public int field861;

    @ObfuscatedName("ag.v")
    public int field876;

    @ObfuscatedName("ag.e")
    public class202 field877;

    @ObfuscatedName("ag.j")
    public int field878 = 0;

    @ObfuscatedName("ag.d")
    public int field879 = 0;

    public class43(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        this.field872 = arg0;
        this.field856 = arg1;
        this.field857 = arg2;
        this.field874 = arg3;
        this.field859 = arg4;
        this.field858 = arg5;
        this.field862 = arg6;
        this.field863 = arg7;
        this.field867 = arg8;
        this.field855 = arg9;
        this.field860 = arg10;
        this.field866 = false;
        int var12 = class191.method2966(this.field872).field2798;
        if (var12 == -1) {
            this.field877 = null;
        } else {
            this.field877 = class202.method262(var12);
        }
    }

    @ObfuscatedName("ag.b(IIIII)V")
    public final void method840(int arg0, int arg1, int arg2, int arg3) {
        if (!this.field866) {
            double var5 = (double) (arg0 - this.field857);
            double var7 = (double) (arg1 - this.field874);
            double var9 = Math.sqrt(var5 * var5 + var7 * var7);
            this.field864 = (double) this.field867 * var5 / var9 + (double) this.field857;
            this.field868 = (double) this.field867 * var7 / var9 + (double) this.field874;
            this.field869 = (double) this.field859;
        }
        double var11 = (double) (this.field862 + 1 - arg3);
        this.field870 = ((double) arg0 - this.field864) / var11;
        this.field871 = ((double) arg1 - this.field868) / var11;
        this.field875 = Math.sqrt(this.field871 * this.field871 + this.field870 * this.field870);
        if (!this.field866) {
            this.field873 = -this.field875 * Math.tan((double) this.field863 * 0.02454369D);
        }
        this.field865 = ((double) arg2 - this.field869 - this.field873 * var11) * 2.0D / (var11 * var11);
    }

    @ObfuscatedName("ag.l(II)V")
    public final void method841(int arg0) {
        this.field866 = true;
        this.field864 += (double) arg0 * this.field870;
        this.field868 += (double) arg0 * this.field871;
        this.field869 += this.field865 * 0.5D * (double) arg0 * (double) arg0 + (double) arg0 * this.field873;
        this.field873 += (double) arg0 * this.field865;
        this.field861 = (int) (Math.atan2(this.field870, this.field871) * 325.949D) + 1024 & 0x7FF;
        this.field876 = (int) (Math.atan2(this.field873, this.field875) * 325.949D) & 0x7FF;
        if (this.field877 == null) {
            return;
        }
        this.field879 += arg0;
        while (true) {
            do {
                do {
                    if (this.field879 <= this.field877.field3067[this.field878]) {
                        return;
                    }
                    this.field879 -= this.field877.field3067[this.field878];
                    this.field878++;
                } while (this.field878 < this.field877.field3073.length);
                this.field878 -= this.field877.field3069;
            } while (this.field878 >= 0 && this.field878 < this.field877.field3073.length);
            this.field878 = 0;
        }
    }

    @ObfuscatedName("ag.i(B)Lcs;")
    public final class83 method226() {
        class191 var1 = class191.method2966(this.field872);
        class83 var2 = var1.method3334(this.field878);
        if (var2 == null) {
            return null;
        } else {
            var2.method1535(this.field876);
            return var2;
        }
    }
}
