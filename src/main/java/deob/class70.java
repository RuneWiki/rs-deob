package deob;

@ObfuscatedName("bu")
public final class class70 extends class205 {

    @ObfuscatedName("bu.c")
    public int field943;

    @ObfuscatedName("bu.v")
    public int field933;

    @ObfuscatedName("bu.q")
    public int field956;

    @ObfuscatedName("bu.f")
    public int field935;

    @ObfuscatedName("bu.j")
    public int field936;

    @ObfuscatedName("bu.e")
    public int field937;

    @ObfuscatedName("bu.g")
    public int field938;

    @ObfuscatedName("bu.w")
    public int field939;

    @ObfuscatedName("bu.y")
    public int field940;

    @ObfuscatedName("bu.i")
    public int field953;

    @ObfuscatedName("bu.s")
    public int field942;

    @ObfuscatedName("bu.t")
    public boolean field951 = false;

    @ObfuscatedName("bu.z")
    public double field944;

    @ObfuscatedName("bu.r")
    public double field945;

    @ObfuscatedName("bu.u")
    public double field946;

    @ObfuscatedName("bu.k")
    public double field947;

    @ObfuscatedName("bu.h")
    public double field948;

    @ObfuscatedName("bu.x")
    public double field932;

    @ObfuscatedName("bu.l")
    public double field950;

    @ObfuscatedName("bu.a")
    public double field934;

    @ObfuscatedName("bu.p")
    public int field952;

    @ObfuscatedName("bu.b")
    public int field941;

    @ObfuscatedName("bu.n")
    public class190 field954;

    @ObfuscatedName("bu.o")
    public int field955 = 0;

    @ObfuscatedName("bu.m")
    public int field957 = 0;

    public class70(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        this.field943 = arg0;
        this.field933 = arg1;
        this.field956 = arg2;
        this.field935 = arg3;
        this.field936 = arg4;
        this.field938 = arg5;
        this.field939 = arg6;
        this.field940 = arg7;
        this.field953 = arg8;
        this.field942 = arg9;
        this.field937 = arg10;
        this.field951 = false;
        int var12 = class180.method1612(this.field943).field1976;
        if (var12 == -1) {
            this.field954 = null;
        } else {
            this.field954 = class190.method983(var12);
        }
    }

    @ObfuscatedName("bu.c(IIIII)V")
    public final void method1863(int arg0, int arg1, int arg2, int arg3) {
        if (!this.field951) {
            double var5 = (double) (arg0 - this.field956);
            double var7 = (double) (arg1 - this.field935);
            double var9 = Math.sqrt(var5 * var5 + var7 * var7);
            this.field944 = (double) this.field953 * var5 / var9 + (double) this.field956;
            this.field945 = (double) this.field953 * var7 / var9 + (double) this.field935;
            this.field946 = (double) this.field936;
        }
        double var11 = (double) (this.field939 + 1 - arg3);
        this.field947 = ((double) arg0 - this.field944) / var11;
        this.field948 = ((double) arg1 - this.field945) / var11;
        this.field932 = Math.sqrt(this.field948 * this.field948 + this.field947 * this.field947);
        if (!this.field951) {
            this.field950 = -this.field932 * Math.tan((double) this.field940 * 0.02454369D);
        }
        this.field934 = ((double) arg2 - this.field946 - this.field950 * var11) * 2.0D / (var11 * var11);
    }

    @ObfuscatedName("bu.q(IB)V")
    public final void method1861(int arg0) {
        this.field951 = true;
        this.field944 += (double) arg0 * this.field947;
        this.field945 += (double) arg0 * this.field948;
        this.field946 += this.field934 * 0.5D * (double) arg0 * (double) arg0 + (double) arg0 * this.field950;
        this.field950 += (double) arg0 * this.field934;
        this.field952 = (int) (Math.atan2(this.field947, this.field948) * 325.949D) + 1024 & 0x7FF;
        this.field941 = (int) (Math.atan2(this.field950, this.field932) * 325.949D) & 0x7FF;
        if (this.field954 == null) {
            return;
        }
        if (this.field954.method3509()) {
            this.field955 += arg0;
            int var2 = this.field954.method3510();
            if (this.field955 >= var2) {
                this.field955 = var2 - this.field954.field2178;
            }
            return;
        }
        this.field957 += arg0;
        while (true) {
            do {
                do {
                    if (this.field957 <= this.field954.field2180[this.field955]) {
                        return;
                    }
                    this.field957 -= this.field954.field2180[this.field955];
                    this.field955++;
                } while (this.field955 < this.field954.field2176.length);
                this.field955 -= this.field954.field2178;
            } while (this.field955 >= 0 && this.field955 < this.field954.field2176.length);
            this.field955 = 0;
        }
    }

    @ObfuscatedName("bu.v(I)Lhy;")
    public final class211 method1782() {
        class180 var1 = class180.method1612(this.field943);
        class211 var2 = var1.method3213(this.field955);
        if (var2 == null) {
            return null;
        } else {
            var2.method4071(this.field941);
            return var2;
        }
    }
}
