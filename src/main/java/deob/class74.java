package deob;

@ObfuscatedName("bn")
public final class class74 extends class215 {

    @ObfuscatedName("bn.a")
    public int field954;

    @ObfuscatedName("bn.f")
    public int field956;

    @ObfuscatedName("bn.c")
    public int field934;

    @ObfuscatedName("bn.x")
    public int field952;

    @ObfuscatedName("bn.h")
    public int field932;

    @ObfuscatedName("bn.j")
    public int field940;

    @ObfuscatedName("bn.y")
    public int field947;

    @ObfuscatedName("bn.d")
    public int field939;

    @ObfuscatedName("bn.n")
    public int field945;

    @ObfuscatedName("bn.r")
    public int field941;

    @ObfuscatedName("bn.l")
    public int field942;

    @ObfuscatedName("bn.s")
    public boolean field943 = false;

    @ObfuscatedName("bn.p")
    public double field944;

    @ObfuscatedName("bn.b")
    public double field933;

    @ObfuscatedName("bn.o")
    public double field946;

    @ObfuscatedName("bn.u")
    public double field937;

    @ObfuscatedName("bn.z")
    public double field948;

    @ObfuscatedName("bn.t")
    public double field949;

    @ObfuscatedName("bn.w")
    public double field950;

    @ObfuscatedName("bn.m")
    public double field951;

    @ObfuscatedName("bn.q")
    public int field938;

    @ObfuscatedName("bn.i")
    public int field935;

    @ObfuscatedName("bn.e")
    public class197 field953;

    @ObfuscatedName("bn.g")
    public int field955 = 0;

    @ObfuscatedName("bn.k")
    public int field936 = 0;

    public class74(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        this.field954 = arg0;
        this.field956 = arg1;
        this.field934 = arg2;
        this.field952 = arg3;
        this.field932 = arg4;
        this.field947 = arg5;
        this.field939 = arg6;
        this.field945 = arg7;
        this.field941 = arg8;
        this.field942 = arg9;
        this.field940 = arg10;
        this.field943 = false;
        int var12 = class187.method710(this.field954).field2015;
        if (var12 == -1) {
            this.field953 = null;
        } else {
            this.field953 = class197.method3143(var12);
        }
    }

    @ObfuscatedName("bn.a(IIIII)V")
    public final void method2000(int arg0, int arg1, int arg2, int arg3) {
        if (!this.field943) {
            double var5 = (double) (arg0 - this.field934);
            double var7 = (double) (arg1 - this.field952);
            double var9 = Math.sqrt(var5 * var5 + var7 * var7);
            this.field944 = (double) this.field941 * var5 / var9 + (double) this.field934;
            this.field933 = (double) this.field941 * var7 / var9 + (double) this.field952;
            this.field946 = (double) this.field932;
        }
        double var11 = (double) (this.field939 + 1 - arg3);
        this.field937 = ((double) arg0 - this.field944) / var11;
        this.field948 = ((double) arg1 - this.field933) / var11;
        this.field949 = Math.sqrt(this.field948 * this.field948 + this.field937 * this.field937);
        if (!this.field943) {
            this.field950 = -this.field949 * Math.tan((double) this.field945 * 0.02454369D);
        }
        this.field951 = ((double) arg2 - this.field946 - this.field950 * var11) * 2.0D / (var11 * var11);
    }

    @ObfuscatedName("bn.c(II)V")
    public final void method2001(int arg0) {
        this.field943 = true;
        this.field944 += (double) arg0 * this.field937;
        this.field933 += (double) arg0 * this.field948;
        this.field946 += this.field951 * 0.5D * (double) arg0 * (double) arg0 + (double) arg0 * this.field950;
        this.field950 += (double) arg0 * this.field951;
        this.field938 = (int) (Math.atan2(this.field937, this.field948) * 325.949D) + 1024 & 0x7FF;
        this.field935 = (int) (Math.atan2(this.field950, this.field949) * 325.949D) & 0x7FF;
        if (this.field953 == null) {
            return;
        }
        if (this.field953.method3576()) {
            this.field955 += arg0;
            int var2 = this.field953.method3566();
            if (this.field955 >= var2) {
                this.field955 = var2 - this.field953.field2232;
            }
            return;
        }
        this.field936 += arg0;
        while (true) {
            do {
                do {
                    if (this.field936 <= this.field953.field2220[this.field955]) {
                        return;
                    }
                    this.field936 -= this.field953.field2220[this.field955];
                    this.field955++;
                } while (this.field955 < this.field953.field2218.length);
                this.field955 -= this.field953.field2232;
            } while (this.field955 >= 0 && this.field955 < this.field953.field2218.length);
            this.field955 = 0;
        }
    }

    @ObfuscatedName("bn.f(I)Lha;")
    public final class221 method1929() {
        class187 var1 = class187.method710(this.field954);
        class221 var2 = var1.method3279(this.field955);
        if (var2 == null) {
            return null;
        } else {
            var2.method4173(this.field935);
            return var2;
        }
    }
}
