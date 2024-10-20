package deob;

@ObfuscatedName("bq")
public final class class70 extends class214 {

    @ObfuscatedName("bq.l")
    public int field939;

    @ObfuscatedName("bq.q")
    public int field914;

    @ObfuscatedName("bq.f")
    public int field915;

    @ObfuscatedName("bq.j")
    public int field935;

    @ObfuscatedName("bq.m")
    public int field917;

    @ObfuscatedName("bq.k")
    public int field918;

    @ObfuscatedName("bq.t")
    public int field919;

    @ObfuscatedName("bq.a")
    public int field920;

    @ObfuscatedName("bq.e")
    public int field928;

    @ObfuscatedName("bq.i")
    public int field921;

    @ObfuscatedName("bq.y")
    public int field923;

    @ObfuscatedName("bq.w")
    public boolean field924 = false;

    @ObfuscatedName("bq.g")
    public double field913;

    @ObfuscatedName("bq.v")
    public double field926;

    @ObfuscatedName("bq.s")
    public double field927;

    @ObfuscatedName("bq.c")
    public double field929;

    @ObfuscatedName("bq.b")
    public double field922;

    @ObfuscatedName("bq.x")
    public double field930;

    @ObfuscatedName("bq.p")
    public double field931;

    @ObfuscatedName("bq.z")
    public double field932;

    @ObfuscatedName("bq.h")
    public int field933;

    @ObfuscatedName("bq.o")
    public int field934;

    @ObfuscatedName("bq.r")
    public class172 field925;

    @ObfuscatedName("bq.n")
    public int field936 = 0;

    @ObfuscatedName("bq.u")
    public int field938 = 0;

    public class70(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        this.field939 = arg0;
        this.field914 = arg1;
        this.field915 = arg2;
        this.field935 = arg3;
        this.field917 = arg4;
        this.field919 = arg5;
        this.field920 = arg6;
        this.field928 = arg7;
        this.field921 = arg8;
        this.field923 = arg9;
        this.field918 = arg10;
        this.field924 = false;
        int var12 = Statics.method304(this.field939).field1761;
        if (var12 == -1) {
            this.field925 = null;
        } else {
            this.field925 = class172.method2708(var12);
        }
    }

    @ObfuscatedName("bq.l(IIIII)V")
    public final void method1844(int arg0, int arg1, int arg2, int arg3) {
        if (!this.field924) {
            double var5 = (double) (arg0 - this.field915);
            double var7 = (double) (arg1 - this.field935);
            double var9 = Math.sqrt(var5 * var5 + var7 * var7);
            this.field913 = (double) this.field921 * var5 / var9 + (double) this.field915;
            this.field926 = (double) this.field921 * var7 / var9 + (double) this.field935;
            this.field927 = (double) this.field917;
        }
        double var11 = (double) (this.field920 + 1 - arg3);
        this.field929 = ((double) arg0 - this.field913) / var11;
        this.field922 = ((double) arg1 - this.field926) / var11;
        this.field930 = Math.sqrt(this.field929 * this.field929 + this.field922 * this.field922);
        if (!this.field924) {
            this.field931 = -this.field930 * Math.tan((double) this.field928 * 0.02454369D);
        }
        this.field932 = ((double) arg2 - this.field927 - this.field931 * var11) * 2.0D / (var11 * var11);
    }

    @ObfuscatedName("bq.f(IB)V")
    public final void method1849(int arg0) {
        this.field924 = true;
        this.field913 += (double) arg0 * this.field929;
        this.field926 += (double) arg0 * this.field922;
        this.field927 += this.field932 * 0.5D * (double) arg0 * (double) arg0 + (double) arg0 * this.field931;
        this.field931 += (double) arg0 * this.field932;
        this.field933 = (int) (Math.atan2(this.field929, this.field922) * 325.949D) + 1024 & 0x7FF;
        this.field934 = (int) (Math.atan2(this.field931, this.field930) * 325.949D) & 0x7FF;
        if (this.field925 == null) {
            return;
        }
        this.field938 += arg0;
        while (true) {
            do {
                do {
                    if (this.field938 <= this.field925.field1951[this.field936]) {
                        return;
                    }
                    this.field938 -= this.field925.field1951[this.field936];
                    this.field936++;
                } while (this.field936 < this.field925.field1959.length);
                this.field936 -= this.field925.field1949;
            } while (this.field936 >= 0 && this.field936 < this.field925.field1959.length);
            this.field936 = 0;
        }
    }

    @ObfuscatedName("bq.q(B)Lhl;")
    public final class220 method1785() {
        class163 var1 = Statics.method304(this.field939);
        class220 var2 = var1.method2814(this.field936);
        if (var2 == null) {
            return null;
        } else {
            var2.method4077(this.field934);
            return var2;
        }
    }
}
