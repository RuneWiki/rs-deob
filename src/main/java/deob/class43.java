package deob;

@ObfuscatedName("ah")
public final class class43 extends class90 {

    @ObfuscatedName("ah.n")
    public int field870;

    @ObfuscatedName("ah.d")
    public int field855;

    @ObfuscatedName("ah.m")
    public int field856;

    @ObfuscatedName("ah.h")
    public int field857;

    @ObfuscatedName("ah.w")
    public int field854;

    @ObfuscatedName("ah.r")
    public int field859;

    @ObfuscatedName("ah.c")
    public int field868;

    @ObfuscatedName("ah.p")
    public int field861;

    @ObfuscatedName("ah.g")
    public int field862;

    @ObfuscatedName("ah.z")
    public int field863;

    @ObfuscatedName("ah.q")
    public int field864;

    @ObfuscatedName("ah.l")
    public boolean field865 = false;

    @ObfuscatedName("ah.y")
    public double field866;

    @ObfuscatedName("ah.e")
    public double field867;

    @ObfuscatedName("ah.x")
    public double field874;

    @ObfuscatedName("ah.f")
    public double field869;

    @ObfuscatedName("ah.s")
    public double field860;

    @ObfuscatedName("ah.o")
    public double field871;

    @ObfuscatedName("ah.i")
    public double field872;

    @ObfuscatedName("ah.a")
    public double field882;

    @ObfuscatedName("ah.b")
    public int field875;

    @ObfuscatedName("ah.j")
    public int field858;

    @ObfuscatedName("ah.k")
    public class202 field876;

    @ObfuscatedName("ah.v")
    public int field877 = 0;

    @ObfuscatedName("ah.u")
    public int field873 = 0;

    public class43(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        this.field870 = arg0;
        this.field855 = arg1;
        this.field856 = arg2;
        this.field857 = arg3;
        this.field854 = arg4;
        this.field868 = arg5;
        this.field861 = arg6;
        this.field862 = arg7;
        this.field863 = arg8;
        this.field864 = arg9;
        this.field859 = arg10;
        this.field865 = false;
        int var12 = class191.method3085(this.field870).field2801;
        if (var12 == -1) {
            this.field876 = null;
        } else {
            this.field876 = class202.method119(var12);
        }
    }

    @ObfuscatedName("ah.n(IIIII)V")
    public final void method791(int arg0, int arg1, int arg2, int arg3) {
        if (!this.field865) {
            double var5 = (double) (arg0 - this.field856);
            double var7 = (double) (arg1 - this.field857);
            double var9 = Math.sqrt(var5 * var5 + var7 * var7);
            this.field866 = (double) this.field863 * var5 / var9 + (double) this.field856;
            this.field867 = (double) this.field863 * var7 / var9 + (double) this.field857;
            this.field874 = (double) this.field854;
        }
        double var11 = (double) (this.field861 + 1 - arg3);
        this.field869 = ((double) arg0 - this.field866) / var11;
        this.field860 = ((double) arg1 - this.field867) / var11;
        this.field871 = Math.sqrt(this.field869 * this.field869 + this.field860 * this.field860);
        if (!this.field865) {
            this.field872 = -this.field871 * Math.tan((double) this.field862 * 0.02454369D);
        }
        this.field882 = ((double) arg2 - this.field874 - this.field872 * var11) * 2.0D / (var11 * var11);
    }

    @ObfuscatedName("ah.d(II)V")
    public final void method792(int arg0) {
        this.field865 = true;
        this.field866 += (double) arg0 * this.field869;
        this.field867 += (double) arg0 * this.field860;
        this.field874 += this.field882 * 0.5D * (double) arg0 * (double) arg0 + (double) arg0 * this.field872;
        this.field872 += (double) arg0 * this.field882;
        this.field875 = (int) (Math.atan2(this.field869, this.field860) * 325.949D) + 1024 & 0x7FF;
        this.field858 = (int) (Math.atan2(this.field872, this.field871) * 325.949D) & 0x7FF;
        if (this.field876 == null) {
            return;
        }
        this.field873 += arg0;
        while (true) {
            do {
                do {
                    if (this.field873 <= this.field876.field3051[this.field877]) {
                        return;
                    }
                    this.field873 -= this.field876.field3051[this.field877];
                    this.field877++;
                } while (this.field877 < this.field876.field3048.length);
                this.field877 -= this.field876.field3062;
            } while (this.field877 >= 0 && this.field877 < this.field876.field3048.length);
            this.field877 = 0;
        }
    }

    @ObfuscatedName("ah.m(I)Lca;")
    public final class83 method233() {
        class191 var1 = class191.method3085(this.field870);
        class83 var2 = var1.method3266(this.field877);
        if (var2 == null) {
            return null;
        } else {
            var2.method1503(this.field858);
            return var2;
        }
    }
}
