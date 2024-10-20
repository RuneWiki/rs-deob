package deob;

@ObfuscatedName("as")
public final class class43 extends class90 {

    @ObfuscatedName("as.i")
    public int field874;

    @ObfuscatedName("as.e")
    public int field885;

    @ObfuscatedName("as.f")
    public int field867;

    @ObfuscatedName("as.k")
    public int field868;

    @ObfuscatedName("as.g")
    public int field882;

    @ObfuscatedName("as.n")
    public int field870;

    @ObfuscatedName("as.a")
    public int field872;

    @ObfuscatedName("as.q")
    public int field866;

    @ObfuscatedName("as.w")
    public int field873;

    @ObfuscatedName("as.v")
    public int field886;

    @ObfuscatedName("as.h")
    public int field875;

    @ObfuscatedName("as.p")
    public boolean field869 = false;

    @ObfuscatedName("as.l")
    public double field876;

    @ObfuscatedName("as.c")
    public double field878;

    @ObfuscatedName("as.m")
    public double field884;

    @ObfuscatedName("as.r")
    public double field880;

    @ObfuscatedName("as.u")
    public double field881;

    @ObfuscatedName("as.j")
    public double field877;

    @ObfuscatedName("as.x")
    public double field883;

    @ObfuscatedName("as.d")
    public double field871;

    @ObfuscatedName("as.y")
    public int field865;

    @ObfuscatedName("as.s")
    public int field879;

    @ObfuscatedName("as.t")
    public class202 field887;

    @ObfuscatedName("as.z")
    public int field888 = 0;

    @ObfuscatedName("as.b")
    public int field889 = 0;

    public class43(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        this.field874 = arg0;
        this.field885 = arg1;
        this.field867 = arg2;
        this.field868 = arg3;
        this.field882 = arg4;
        this.field872 = arg5;
        this.field866 = arg6;
        this.field873 = arg7;
        this.field886 = arg8;
        this.field875 = arg9;
        this.field870 = arg10;
        this.field869 = false;
        int var12 = class191.method194(this.field874).field2798;
        if (var12 == -1) {
            this.field887 = null;
        } else {
            this.field887 = class202.method2010(var12);
        }
    }

    @ObfuscatedName("as.i(IIIII)V")
    public final void method753(int arg0, int arg1, int arg2, int arg3) {
        if (!this.field869) {
            double var5 = (double) (arg0 - this.field867);
            double var7 = (double) (arg1 - this.field868);
            double var9 = Math.sqrt(var5 * var5 + var7 * var7);
            this.field876 = (double) this.field886 * var5 / var9 + (double) this.field867;
            this.field878 = (double) this.field886 * var7 / var9 + (double) this.field868;
            this.field884 = (double) this.field882;
        }
        double var11 = (double) (this.field866 + 1 - arg3);
        this.field880 = ((double) arg0 - this.field876) / var11;
        this.field881 = ((double) arg1 - this.field878) / var11;
        this.field877 = Math.sqrt(this.field881 * this.field881 + this.field880 * this.field880);
        if (!this.field869) {
            this.field883 = -this.field877 * Math.tan((double) this.field873 * 0.02454369D);
        }
        this.field871 = ((double) arg2 - this.field884 - this.field883 * var11) * 2.0D / (var11 * var11);
    }

    @ObfuscatedName("as.e(II)V")
    public final void method754(int arg0) {
        this.field869 = true;
        this.field876 += (double) arg0 * this.field880;
        this.field878 += (double) arg0 * this.field881;
        this.field884 += this.field871 * 0.5D * (double) arg0 * (double) arg0 + (double) arg0 * this.field883;
        this.field883 += (double) arg0 * this.field871;
        this.field865 = (int) (Math.atan2(this.field880, this.field881) * 325.949D) + 1024 & 0x7FF;
        this.field879 = (int) (Math.atan2(this.field883, this.field877) * 325.949D) & 0x7FF;
        if (this.field887 == null) {
            return;
        }
        this.field889 += arg0;
        while (true) {
            do {
                do {
                    if (this.field889 <= this.field887.field3054[this.field888]) {
                        return;
                    }
                    this.field889 -= this.field887.field3054[this.field888];
                    this.field888++;
                } while (this.field888 < this.field887.field3053.length);
                this.field888 -= this.field887.field3068;
            } while (this.field888 >= 0 && this.field888 < this.field887.field3053.length);
            this.field888 = 0;
        }
    }

    @ObfuscatedName("as.f(B)Lch;")
    public final class83 method227() {
        class191 var1 = class191.method194(this.field874);
        class83 var2 = var1.method3208(this.field888);
        if (var2 == null) {
            return null;
        } else {
            var2.method1475(this.field879);
            return var2;
        }
    }
}
