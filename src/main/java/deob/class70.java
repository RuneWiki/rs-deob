package deob;

@ObfuscatedName("bi")
public final class class70 extends class214 {

    @ObfuscatedName("bi.i")
    public int field899;

    @ObfuscatedName("bi.w")
    public int field892;

    @ObfuscatedName("bi.s")
    public int field909;

    @ObfuscatedName("bi.a")
    public int field894;

    @ObfuscatedName("bi.o")
    public int field913;

    @ObfuscatedName("bi.g")
    public int field895;

    @ObfuscatedName("bi.e")
    public int field897;

    @ObfuscatedName("bi.p")
    public int field898;

    @ObfuscatedName("bi.j")
    public int field915;

    @ObfuscatedName("bi.b")
    public int field900;

    @ObfuscatedName("bi.x")
    public int field893;

    @ObfuscatedName("bi.y")
    public boolean field902 = false;

    @ObfuscatedName("bi.k")
    public double field903;

    @ObfuscatedName("bi.t")
    public double field896;

    @ObfuscatedName("bi.l")
    public double field905;

    @ObfuscatedName("bi.u")
    public double field906;

    @ObfuscatedName("bi.n")
    public double field907;

    @ObfuscatedName("bi.z")
    public double field908;

    @ObfuscatedName("bi.q")
    public double field904;

    @ObfuscatedName("bi.d")
    public double field910;

    @ObfuscatedName("bi.r")
    public int field911;

    @ObfuscatedName("bi.m")
    public int field912;

    @ObfuscatedName("bi.c")
    public class172 field891;

    @ObfuscatedName("bi.f")
    public int field914 = 0;

    @ObfuscatedName("bi.h")
    public int field901 = 0;

    public class70(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        this.field899 = arg0;
        this.field892 = arg1;
        this.field909 = arg2;
        this.field894 = arg3;
        this.field913 = arg4;
        this.field897 = arg5;
        this.field898 = arg6;
        this.field915 = arg7;
        this.field900 = arg8;
        this.field893 = arg9;
        this.field895 = arg10;
        this.field902 = false;
        int var12 = class163.method6452(this.field899).field1751;
        if (var12 == -1) {
            this.field891 = null;
        } else {
            this.field891 = class172.method589(var12);
        }
    }

    @ObfuscatedName("bi.i(IIIII)V")
    public final void method1857(int arg0, int arg1, int arg2, int arg3) {
        if (!this.field902) {
            double var5 = (double) (arg0 - this.field909);
            double var7 = (double) (arg1 - this.field894);
            double var9 = Math.sqrt(var5 * var5 + var7 * var7);
            this.field903 = (double) this.field900 * var5 / var9 + (double) this.field909;
            this.field896 = (double) this.field900 * var7 / var9 + (double) this.field894;
            this.field905 = (double) this.field913;
        }
        double var11 = (double) (this.field898 + 1 - arg3);
        this.field906 = ((double) arg0 - this.field903) / var11;
        this.field907 = ((double) arg1 - this.field896) / var11;
        this.field908 = Math.sqrt(this.field907 * this.field907 + this.field906 * this.field906);
        if (!this.field902) {
            this.field904 = -this.field908 * Math.tan((double) this.field915 * 0.02454369D);
        }
        this.field910 = ((double) arg2 - this.field905 - this.field904 * var11) * 2.0D / (var11 * var11);
    }

    @ObfuscatedName("bi.s(II)V")
    public final void method1863(int arg0) {
        this.field902 = true;
        this.field903 += (double) arg0 * this.field906;
        this.field896 += (double) arg0 * this.field907;
        this.field905 += this.field910 * 0.5D * (double) arg0 * (double) arg0 + (double) arg0 * this.field904;
        this.field904 += (double) arg0 * this.field910;
        this.field911 = (int) (Math.atan2(this.field906, this.field907) * 325.949D) + 1024 & 0x7FF;
        this.field912 = (int) (Math.atan2(this.field904, this.field908) * 325.949D) & 0x7FF;
        if (this.field891 == null) {
            return;
        }
        this.field901 += arg0;
        while (true) {
            do {
                do {
                    if (this.field901 <= this.field891.field1955[this.field914]) {
                        return;
                    }
                    this.field901 -= this.field891.field1955[this.field914];
                    this.field914++;
                } while (this.field914 < this.field891.field1953.length);
                this.field914 -= this.field891.field1961;
            } while (this.field914 >= 0 && this.field914 < this.field891.field1953.length);
            this.field914 = 0;
        }
    }

    @ObfuscatedName("bi.w(I)Lhl;")
    public final class220 method1799() {
        class163 var1 = class163.method6452(this.field899);
        class220 var2 = var1.method2844(this.field914);
        if (var2 == null) {
            return null;
        } else {
            var2.method4071(this.field912);
            return var2;
        }
    }
}
