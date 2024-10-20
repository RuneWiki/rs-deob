package deob;

@ObfuscatedName("an")
public final class class43 extends class90 {

    @ObfuscatedName("an.p")
    public int field875;

    @ObfuscatedName("an.g")
    public int field856;

    @ObfuscatedName("an.x")
    public int field869;

    @ObfuscatedName("an.q")
    public int field858;

    @ObfuscatedName("an.d")
    public int field859;

    @ObfuscatedName("an.k")
    public int field860;

    @ObfuscatedName("an.j")
    public int field861;

    @ObfuscatedName("an.s")
    public int field862;

    @ObfuscatedName("an.o")
    public int field863;

    @ObfuscatedName("an.a")
    public int field865;

    @ObfuscatedName("an.c")
    public int field857;

    @ObfuscatedName("an.m")
    public boolean field866 = false;

    @ObfuscatedName("an.h")
    public double field867;

    @ObfuscatedName("an.r")
    public double field871;

    @ObfuscatedName("an.u")
    public double field877;

    @ObfuscatedName("an.i")
    public double field870;

    @ObfuscatedName("an.z")
    public double field864;

    @ObfuscatedName("an.n")
    public double field872;

    @ObfuscatedName("an.w")
    public double field873;

    @ObfuscatedName("an.y")
    public double field874;

    @ObfuscatedName("an.v")
    public int field855;

    @ObfuscatedName("an.f")
    public int field876;

    @ObfuscatedName("an.l")
    public class202 field879;

    @ObfuscatedName("an.t")
    public int field881 = 0;

    @ObfuscatedName("an.b")
    public int field880 = 0;

    public class43(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        this.field875 = arg0;
        this.field856 = arg1;
        this.field869 = arg2;
        this.field858 = arg3;
        this.field859 = arg4;
        this.field861 = arg5;
        this.field862 = arg6;
        this.field863 = arg7;
        this.field865 = arg8;
        this.field857 = arg9;
        this.field860 = arg10;
        this.field866 = false;
        int var12 = class191.method1354(this.field875).field2793;
        if (var12 == -1) {
            this.field879 = null;
        } else {
            this.field879 = class202.method2533(var12);
        }
    }

    @ObfuscatedName("an.p(IIIII)V")
    public final void method761(int arg0, int arg1, int arg2, int arg3) {
        if (!this.field866) {
            double var5 = (double) (arg0 - this.field869);
            double var7 = (double) (arg1 - this.field858);
            double var9 = Math.sqrt(var5 * var5 + var7 * var7);
            this.field867 = (double) this.field865 * var5 / var9 + (double) this.field869;
            this.field871 = (double) this.field865 * var7 / var9 + (double) this.field858;
            this.field877 = (double) this.field859;
        }
        double var11 = (double) (this.field862 + 1 - arg3);
        this.field870 = ((double) arg0 - this.field867) / var11;
        this.field864 = ((double) arg1 - this.field871) / var11;
        this.field872 = Math.sqrt(this.field870 * this.field870 + this.field864 * this.field864);
        if (!this.field866) {
            this.field873 = -this.field872 * Math.tan((double) this.field863 * 0.02454369D);
        }
        this.field874 = ((double) arg2 - this.field877 - this.field873 * var11) * 2.0D / (var11 * var11);
    }

    @ObfuscatedName("an.g(IB)V")
    public final void method762(int arg0) {
        this.field866 = true;
        this.field867 += (double) arg0 * this.field870;
        this.field871 += (double) arg0 * this.field864;
        this.field877 += this.field874 * 0.5D * (double) arg0 * (double) arg0 + (double) arg0 * this.field873;
        this.field873 += (double) arg0 * this.field874;
        this.field855 = (int) (Math.atan2(this.field870, this.field864) * 325.949D) + 1024 & 0x7FF;
        this.field876 = (int) (Math.atan2(this.field873, this.field872) * 325.949D) & 0x7FF;
        if (this.field879 == null) {
            return;
        }
        this.field880 += arg0;
        while (true) {
            do {
                do {
                    if (this.field880 <= this.field879.field3061[this.field881]) {
                        return;
                    }
                    this.field880 -= this.field879.field3061[this.field881];
                    this.field881++;
                } while (this.field881 < this.field879.field3050.length);
                this.field881 -= this.field879.field3054;
            } while (this.field881 >= 0 && this.field881 < this.field879.field3050.length);
            this.field881 = 0;
        }
    }

    @ObfuscatedName("an.x(I)Lcw;")
    public final class83 method223() {
        class191 var1 = class191.method1354(this.field875);
        class83 var2 = var1.method3209(this.field881);
        if (var2 == null) {
            return null;
        } else {
            var2.method1469(this.field876);
            return var2;
        }
    }
}
