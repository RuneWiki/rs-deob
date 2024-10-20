package deob;

@ObfuscatedName("bm")
public final class class70 extends class205 {

    @ObfuscatedName("bm.s")
    public int field922;

    @ObfuscatedName("bm.h")
    public int field930;

    @ObfuscatedName("bm.w")
    public int field914;

    @ObfuscatedName("bm.v")
    public int field915;

    @ObfuscatedName("bm.c")
    public int field913;

    @ObfuscatedName("bm.q")
    public int field920;

    @ObfuscatedName("bm.i")
    public int field918;

    @ObfuscatedName("bm.k")
    public int field919;

    @ObfuscatedName("bm.o")
    public int field916;

    @ObfuscatedName("bm.n")
    public int field934;

    @ObfuscatedName("bm.d")
    public int field938;

    @ObfuscatedName("bm.a")
    public boolean field921 = false;

    @ObfuscatedName("bm.m")
    public double field924;

    @ObfuscatedName("bm.u")
    public double field925;

    @ObfuscatedName("bm.l")
    public double field926;

    @ObfuscatedName("bm.z")
    public double field931;

    @ObfuscatedName("bm.r")
    public double field928;

    @ObfuscatedName("bm.y")
    public double field929;

    @ObfuscatedName("bm.p")
    public double field927;

    @ObfuscatedName("bm.e")
    public double field912;

    @ObfuscatedName("bm.b")
    public int field932;

    @ObfuscatedName("bm.x")
    public int field933;

    @ObfuscatedName("bm.f")
    public class190 field917;

    @ObfuscatedName("bm.t")
    public int field935 = 0;

    @ObfuscatedName("bm.j")
    public int field936 = 0;

    public class70(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        this.field922 = arg0;
        this.field930 = arg1;
        this.field914 = arg2;
        this.field915 = arg3;
        this.field913 = arg4;
        this.field918 = arg5;
        this.field919 = arg6;
        this.field916 = arg7;
        this.field934 = arg8;
        this.field938 = arg9;
        this.field920 = arg10;
        this.field921 = false;
        int var12 = class180.method6177(this.field922).field1961;
        if (var12 == -1) {
            this.field917 = null;
        } else {
            this.field917 = class190.method5853(var12);
        }
    }

    @ObfuscatedName("bm.s(IIIIB)V")
    public final void method1820(int arg0, int arg1, int arg2, int arg3) {
        if (!this.field921) {
            double var5 = (double) (arg0 - this.field914);
            double var7 = (double) (arg1 - this.field915);
            double var9 = Math.sqrt(var5 * var5 + var7 * var7);
            this.field924 = (double) this.field934 * var5 / var9 + (double) this.field914;
            this.field925 = (double) this.field934 * var7 / var9 + (double) this.field915;
            this.field926 = (double) this.field913;
        }
        double var11 = (double) (this.field919 + 1 - arg3);
        this.field931 = ((double) arg0 - this.field924) / var11;
        this.field928 = ((double) arg1 - this.field925) / var11;
        this.field929 = Math.sqrt(this.field931 * this.field931 + this.field928 * this.field928);
        if (!this.field921) {
            this.field927 = -this.field929 * Math.tan((double) this.field916 * 0.02454369D);
        }
        this.field912 = ((double) arg2 - this.field926 - this.field927 * var11) * 2.0D / (var11 * var11);
    }

    @ObfuscatedName("bm.w(II)V")
    public final void method1819(int arg0) {
        this.field921 = true;
        this.field924 += (double) arg0 * this.field931;
        this.field925 += (double) arg0 * this.field928;
        this.field926 += this.field912 * 0.5D * (double) arg0 * (double) arg0 + (double) arg0 * this.field927;
        this.field927 += (double) arg0 * this.field912;
        this.field932 = (int) (Math.atan2(this.field931, this.field928) * 325.949D) + 1024 & 0x7FF;
        this.field933 = (int) (Math.atan2(this.field927, this.field929) * 325.949D) & 0x7FF;
        if (this.field917 == null) {
            return;
        }
        if (this.field917.method3388()) {
            this.field935 += arg0;
            int var2 = this.field917.method3392();
            if (this.field935 >= var2) {
                this.field935 = var2 - this.field917.field2171;
            }
            return;
        }
        this.field936 += arg0;
        while (true) {
            do {
                do {
                    if (this.field936 <= this.field917.field2164[this.field935]) {
                        return;
                    }
                    this.field936 -= this.field917.field2164[this.field935];
                    this.field935++;
                } while (this.field935 < this.field917.field2167.length);
                this.field935 -= this.field917.field2171;
            } while (this.field935 >= 0 && this.field935 < this.field917.field2167.length);
            this.field935 = 0;
        }
    }

    @ObfuscatedName("bm.h(B)Lhp;")
    public final class211 method1748() {
        class180 var1 = class180.method6177(this.field922);
        class211 var2 = var1.method3109(this.field935);
        if (var2 == null) {
            return null;
        } else {
            var2.method3945(this.field933);
            return var2;
        }
    }
}
