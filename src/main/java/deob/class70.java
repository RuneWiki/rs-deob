package deob;

@ObfuscatedName("bx")
public final class class70 extends class214 {

    @ObfuscatedName("bx.n")
    public int field918;

    @ObfuscatedName("bx.c")
    public int field927;

    @ObfuscatedName("bx.m")
    public int field908;

    @ObfuscatedName("bx.k")
    public int field913;

    @ObfuscatedName("bx.o")
    public int field910;

    @ObfuscatedName("bx.g")
    public int field911;

    @ObfuscatedName("bx.z")
    public int field912;

    @ObfuscatedName("bx.a")
    public int field932;

    @ObfuscatedName("bx.u")
    public int field914;

    @ObfuscatedName("bx.e")
    public int field920;

    @ObfuscatedName("bx.l")
    public int field916;

    @ObfuscatedName("bx.y")
    public boolean field917 = false;

    @ObfuscatedName("bx.v")
    public double field906;

    @ObfuscatedName("bx.f")
    public double field919;

    @ObfuscatedName("bx.s")
    public double field925;

    @ObfuscatedName("bx.h")
    public double field921;

    @ObfuscatedName("bx.d")
    public double field922;

    @ObfuscatedName("bx.q")
    public double field923;

    @ObfuscatedName("bx.j")
    public double field909;

    @ObfuscatedName("bx.x")
    public double field928;

    @ObfuscatedName("bx.b")
    public int field926;

    @ObfuscatedName("bx.t")
    public int field907;

    @ObfuscatedName("bx.r")
    public class172 field915;

    @ObfuscatedName("bx.p")
    public int field929 = 0;

    @ObfuscatedName("bx.w")
    public int field930 = 0;

    public class70(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        this.field918 = arg0;
        this.field927 = arg1;
        this.field908 = arg2;
        this.field913 = arg3;
        this.field910 = arg4;
        this.field912 = arg5;
        this.field932 = arg6;
        this.field914 = arg7;
        this.field920 = arg8;
        this.field916 = arg9;
        this.field911 = arg10;
        this.field917 = false;
        int var12 = class163.method2520(this.field918).field1751;
        if (var12 == -1) {
            this.field915 = null;
        } else {
            this.field915 = class172.method269(var12);
        }
    }

    @ObfuscatedName("bx.n(IIIII)V")
    public final void method1818(int arg0, int arg1, int arg2, int arg3) {
        if (!this.field917) {
            double var5 = (double) (arg0 - this.field908);
            double var7 = (double) (arg1 - this.field913);
            double var9 = Math.sqrt(var5 * var5 + var7 * var7);
            this.field906 = (double) this.field920 * var5 / var9 + (double) this.field908;
            this.field919 = (double) this.field920 * var7 / var9 + (double) this.field913;
            this.field925 = (double) this.field910;
        }
        double var11 = (double) (this.field932 + 1 - arg3);
        this.field921 = ((double) arg0 - this.field906) / var11;
        this.field922 = ((double) arg1 - this.field919) / var11;
        this.field923 = Math.sqrt(this.field922 * this.field922 + this.field921 * this.field921);
        if (!this.field917) {
            this.field909 = -this.field923 * Math.tan((double) this.field914 * 0.02454369D);
        }
        this.field928 = ((double) arg2 - this.field925 - this.field909 * var11) * 2.0D / (var11 * var11);
    }

    @ObfuscatedName("bx.m(II)V")
    public final void method1819(int arg0) {
        this.field917 = true;
        this.field906 += (double) arg0 * this.field921;
        this.field919 += (double) arg0 * this.field922;
        this.field925 += this.field928 * 0.5D * (double) arg0 * (double) arg0 + (double) arg0 * this.field909;
        this.field909 += (double) arg0 * this.field928;
        this.field926 = (int) (Math.atan2(this.field921, this.field922) * 325.949D) + 1024 & 0x7FF;
        this.field907 = (int) (Math.atan2(this.field909, this.field923) * 325.949D) & 0x7FF;
        if (this.field915 == null) {
            return;
        }
        this.field930 += arg0;
        while (true) {
            do {
                do {
                    if (this.field930 <= this.field915.field1951[this.field929]) {
                        return;
                    }
                    this.field930 -= this.field915.field1951[this.field929];
                    this.field929++;
                } while (this.field929 < this.field915.field1952.length);
                this.field929 -= this.field915.field1958;
            } while (this.field929 >= 0 && this.field929 < this.field915.field1952.length);
            this.field929 = 0;
        }
    }

    @ObfuscatedName("bx.c(B)Lhg;")
    public final class220 method1766() {
        class163 var1 = class163.method2520(this.field918);
        class220 var2 = var1.method2749(this.field929);
        if (var2 == null) {
            return null;
        } else {
            var2.method4028(this.field907);
            return var2;
        }
    }
}
