package deob;

@ObfuscatedName("aj")
public final class class43 extends class90 {

    @ObfuscatedName("aj.s")
    public int field867;

    @ObfuscatedName("aj.c")
    public int field853;

    @ObfuscatedName("aj.f")
    public int field875;

    @ObfuscatedName("aj.h")
    public int field858;

    @ObfuscatedName("aj.a")
    public int field852;

    @ObfuscatedName("aj.g")
    public int field857;

    @ObfuscatedName("aj.k")
    public int field866;

    @ObfuscatedName("aj.u")
    public int field873;

    @ObfuscatedName("aj.b")
    public int field860;

    @ObfuscatedName("aj.x")
    public int field861;

    @ObfuscatedName("aj.r")
    public int field862;

    @ObfuscatedName("aj.n")
    public boolean field863 = false;

    @ObfuscatedName("aj.m")
    public double field864;

    @ObfuscatedName("aj.j")
    public double field859;

    @ObfuscatedName("aj.w")
    public double field855;

    @ObfuscatedName("aj.p")
    public double field856;

    @ObfuscatedName("aj.o")
    public double field868;

    @ObfuscatedName("aj.i")
    public double field869;

    @ObfuscatedName("aj.z")
    public double field870;

    @ObfuscatedName("aj.e")
    public double field871;

    @ObfuscatedName("aj.d")
    public int field872;

    @ObfuscatedName("aj.t")
    public int field854;

    @ObfuscatedName("aj.q")
    public class202 field865;

    @ObfuscatedName("aj.y")
    public int field874 = 0;

    @ObfuscatedName("aj.l")
    public int field876 = 0;

    public class43(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        this.field867 = arg0;
        this.field853 = arg1;
        this.field875 = arg2;
        this.field858 = arg3;
        this.field852 = arg4;
        this.field866 = arg5;
        this.field873 = arg6;
        this.field860 = arg7;
        this.field861 = arg8;
        this.field862 = arg9;
        this.field857 = arg10;
        this.field863 = false;
        int var12 = class191.method827(this.field867).field2802;
        if (var12 == -1) {
            this.field865 = null;
        } else {
            this.field865 = class202.method1914(var12);
        }
    }

    @ObfuscatedName("aj.s(IIIIB)V")
    public final void method748(int arg0, int arg1, int arg2, int arg3) {
        if (!this.field863) {
            double var5 = (double) (arg0 - this.field875);
            double var7 = (double) (arg1 - this.field858);
            double var9 = Math.sqrt(var5 * var5 + var7 * var7);
            this.field864 = (double) this.field861 * var5 / var9 + (double) this.field875;
            this.field859 = (double) this.field861 * var7 / var9 + (double) this.field858;
            this.field855 = (double) this.field852;
        }
        double var11 = (double) (this.field873 + 1 - arg3);
        this.field856 = ((double) arg0 - this.field864) / var11;
        this.field868 = ((double) arg1 - this.field859) / var11;
        this.field869 = Math.sqrt(this.field868 * this.field868 + this.field856 * this.field856);
        if (!this.field863) {
            this.field870 = -this.field869 * Math.tan((double) this.field860 * 0.02454369D);
        }
        this.field871 = ((double) arg2 - this.field855 - this.field870 * var11) * 2.0D / (var11 * var11);
    }

    @ObfuscatedName("aj.c(II)V")
    public final void method747(int arg0) {
        this.field863 = true;
        this.field864 += (double) arg0 * this.field856;
        this.field859 += (double) arg0 * this.field868;
        this.field855 += this.field871 * 0.5D * (double) arg0 * (double) arg0 + (double) arg0 * this.field870;
        this.field870 += (double) arg0 * this.field871;
        this.field872 = (int) (Math.atan2(this.field856, this.field868) * 325.949D) + 1024 & 0x7FF;
        this.field854 = (int) (Math.atan2(this.field870, this.field869) * 325.949D) & 0x7FF;
        if (this.field865 == null) {
            return;
        }
        this.field876 += arg0;
        while (true) {
            do {
                do {
                    if (this.field876 <= this.field865.field3064[this.field874]) {
                        return;
                    }
                    this.field876 -= this.field865.field3064[this.field874];
                    this.field874++;
                } while (this.field874 < this.field865.field3076.length);
                this.field874 -= this.field865.field3066;
            } while (this.field874 >= 0 && this.field874 < this.field865.field3076.length);
            this.field874 = 0;
        }
    }

    @ObfuscatedName("aj.f(I)Lcz;")
    public final class83 method195() {
        class191 var1 = class191.method827(this.field867);
        class83 var2 = var1.method3150(this.field874);
        if (var2 == null) {
            return null;
        } else {
            var2.method1456(this.field854);
            return var2;
        }
    }
}
