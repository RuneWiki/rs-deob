package deob;

@ObfuscatedName("ac")
public final class class43 extends class90 {

    @ObfuscatedName("ac.u")
    public int field856;

    @ObfuscatedName("ac.x")
    public int field870;

    @ObfuscatedName("ac.i")
    public int field859;

    @ObfuscatedName("ac.a")
    public int field851;

    @ObfuscatedName("ac.f")
    public int field852;

    @ObfuscatedName("ac.c")
    public int field877;

    @ObfuscatedName("ac.d")
    public int field861;

    @ObfuscatedName("ac.l")
    public int field855;

    @ObfuscatedName("ac.g")
    public int field848;

    @ObfuscatedName("ac.z")
    public int field857;

    @ObfuscatedName("ac.t")
    public int field858;

    @ObfuscatedName("ac.m")
    public boolean field849 = false;

    @ObfuscatedName("ac.q")
    public double field860;

    @ObfuscatedName("ac.e")
    public double field854;

    @ObfuscatedName("ac.v")
    public double field862;

    @ObfuscatedName("ac.j")
    public double field863;

    @ObfuscatedName("ac.p")
    public double field864;

    @ObfuscatedName("ac.k")
    public double field871;

    @ObfuscatedName("ac.r")
    public double field866;

    @ObfuscatedName("ac.y")
    public double field867;

    @ObfuscatedName("ac.h")
    public int field868;

    @ObfuscatedName("ac.s")
    public int field869;

    @ObfuscatedName("ac.w")
    public class202 field876;

    @ObfuscatedName("ac.n")
    public int field853 = 0;

    @ObfuscatedName("ac.o")
    public int field872 = 0;

    public class43(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        this.field856 = arg0;
        this.field870 = arg1;
        this.field859 = arg2;
        this.field851 = arg3;
        this.field852 = arg4;
        this.field861 = arg5;
        this.field855 = arg6;
        this.field848 = arg7;
        this.field857 = arg8;
        this.field858 = arg9;
        this.field877 = arg10;
        this.field849 = false;
        int var12 = class191.method3182(this.field856).field2773;
        if (var12 == -1) {
            this.field876 = null;
        } else {
            this.field876 = class202.method3327(var12);
        }
    }

    @ObfuscatedName("ac.u(IIIIB)V")
    public final void method766(int arg0, int arg1, int arg2, int arg3) {
        if (!this.field849) {
            double var5 = (double) (arg0 - this.field859);
            double var7 = (double) (arg1 - this.field851);
            double var9 = Math.sqrt(var5 * var5 + var7 * var7);
            this.field860 = (double) this.field857 * var5 / var9 + (double) this.field859;
            this.field854 = (double) this.field857 * var7 / var9 + (double) this.field851;
            this.field862 = (double) this.field852;
        }
        double var11 = (double) (this.field855 + 1 - arg3);
        this.field863 = ((double) arg0 - this.field860) / var11;
        this.field864 = ((double) arg1 - this.field854) / var11;
        this.field871 = Math.sqrt(this.field864 * this.field864 + this.field863 * this.field863);
        if (!this.field849) {
            this.field866 = -this.field871 * Math.tan((double) this.field848 * 0.02454369D);
        }
        this.field867 = ((double) arg2 - this.field862 - this.field866 * var11) * 2.0D / (var11 * var11);
    }

    @ObfuscatedName("ac.x(II)V")
    public final void method767(int arg0) {
        this.field849 = true;
        this.field860 += (double) arg0 * this.field863;
        this.field854 += (double) arg0 * this.field864;
        this.field862 += this.field867 * 0.5D * (double) arg0 * (double) arg0 + (double) arg0 * this.field866;
        this.field866 += (double) arg0 * this.field867;
        this.field868 = (int) (Math.atan2(this.field863, this.field864) * 325.949D) + 1024 & 0x7FF;
        this.field869 = (int) (Math.atan2(this.field866, this.field871) * 325.949D) & 0x7FF;
        if (this.field876 == null) {
            return;
        }
        this.field872 += arg0;
        while (true) {
            do {
                do {
                    if (this.field872 <= this.field876.field3049[this.field853]) {
                        return;
                    }
                    this.field872 -= this.field876.field3049[this.field853];
                    this.field853++;
                } while (this.field853 < this.field876.field3042.length);
                this.field853 -= this.field876.field3046;
            } while (this.field853 >= 0 && this.field853 < this.field876.field3042.length);
            this.field853 = 0;
        }
    }

    @ObfuscatedName("ac.i(B)Lcs;")
    public final class83 method217() {
        class191 var1 = class191.method3182(this.field856);
        class83 var2 = var1.method3239(this.field853);
        if (var2 == null) {
            return null;
        } else {
            var2.method1458(this.field869);
            return var2;
        }
    }
}
