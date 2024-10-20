package deob;

@ObfuscatedName("bt")
public final class class70 extends class198 {

    @ObfuscatedName("bt.c")
    public int field906;

    @ObfuscatedName("bt.b")
    public int field925;

    @ObfuscatedName("bt.p")
    public int field899;

    @ObfuscatedName("bt.m")
    public int field921;

    @ObfuscatedName("bt.t")
    public int field901;

    @ObfuscatedName("bt.s")
    public int field902;

    @ObfuscatedName("bt.j")
    public int field903;

    @ObfuscatedName("bt.w")
    public int field904;

    @ObfuscatedName("bt.n")
    public int field909;

    @ObfuscatedName("bt.r")
    public int field915;

    @ObfuscatedName("bt.o")
    public int field907;

    @ObfuscatedName("bt.v")
    public boolean field908 = false;

    @ObfuscatedName("bt.d")
    public double field897;

    @ObfuscatedName("bt.h")
    public double field910;

    @ObfuscatedName("bt.g")
    public double field911;

    @ObfuscatedName("bt.e")
    public double field912;

    @ObfuscatedName("bt.a")
    public double field913;

    @ObfuscatedName("bt.u")
    public double field914;

    @ObfuscatedName("bt.k")
    public double field919;

    @ObfuscatedName("bt.f")
    public double field916;

    @ObfuscatedName("bt.l")
    public int field917;

    @ObfuscatedName("bt.q")
    public int field918;

    @ObfuscatedName("bt.x")
    public class183 field923;

    @ObfuscatedName("bt.z")
    public int field920 = 0;

    @ObfuscatedName("bt.i")
    public int field905 = 0;

    public class70(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        this.field906 = arg0;
        this.field925 = arg1;
        this.field899 = arg2;
        this.field921 = arg3;
        this.field901 = arg4;
        this.field903 = arg5;
        this.field904 = arg6;
        this.field909 = arg7;
        this.field915 = arg8;
        this.field907 = arg9;
        this.field902 = arg10;
        this.field908 = false;
        int var12 = class173.method6501(this.field906).field1885;
        if (var12 == -1) {
            this.field923 = null;
        } else {
            this.field923 = class183.method2402(var12);
        }
    }

    @ObfuscatedName("bt.c(IIIII)V")
    public final void method1910(int arg0, int arg1, int arg2, int arg3) {
        if (!this.field908) {
            double var5 = (double) (arg0 - this.field899);
            double var7 = (double) (arg1 - this.field921);
            double var9 = Math.sqrt(var5 * var5 + var7 * var7);
            this.field897 = (double) this.field915 * var5 / var9 + (double) this.field899;
            this.field910 = (double) this.field915 * var7 / var9 + (double) this.field921;
            this.field911 = (double) this.field901;
        }
        double var11 = (double) (this.field904 + 1 - arg3);
        this.field912 = ((double) arg0 - this.field897) / var11;
        this.field913 = ((double) arg1 - this.field910) / var11;
        this.field914 = Math.sqrt(this.field913 * this.field913 + this.field912 * this.field912);
        if (!this.field908) {
            this.field919 = -this.field914 * Math.tan((double) this.field909 * 0.02454369D);
        }
        this.field916 = ((double) arg2 - this.field911 - this.field919 * var11) * 2.0D / (var11 * var11);
    }

    @ObfuscatedName("bt.p(II)V")
    public final void method1911(int arg0) {
        this.field908 = true;
        this.field897 += (double) arg0 * this.field912;
        this.field910 += (double) arg0 * this.field913;
        this.field911 += this.field916 * 0.5D * (double) arg0 * (double) arg0 + (double) arg0 * this.field919;
        this.field919 += (double) arg0 * this.field916;
        this.field917 = (int) (Math.atan2(this.field912, this.field913) * 325.949D) + 1024 & 0x7FF;
        this.field918 = (int) (Math.atan2(this.field919, this.field914) * 325.949D) & 0x7FF;
        if (this.field923 == null) {
            return;
        }
        if (this.field923.method3381()) {
            this.field920 += arg0;
            int var2 = this.field923.method3338();
            if (this.field920 >= var2) {
                this.field920 = var2 - this.field923.field2089;
            }
            return;
        }
        this.field905 += arg0;
        while (true) {
            do {
                do {
                    if (this.field905 <= this.field923.field2081[this.field920]) {
                        return;
                    }
                    this.field905 -= this.field923.field2081[this.field920];
                    this.field920++;
                } while (this.field920 < this.field923.field2099.length);
                this.field920 -= this.field923.field2089;
            } while (this.field920 >= 0 && this.field920 < this.field923.field2099.length);
            this.field920 = 0;
        }
    }

    @ObfuscatedName("bt.b(I)Lgo;")
    public final class204 method1860() {
        class173 var1 = class173.method6501(this.field906);
        class204 var2 = var1.method3047(this.field920);
        if (var2 == null) {
            return null;
        } else {
            var2.method3887(this.field918);
            return var2;
        }
    }
}
