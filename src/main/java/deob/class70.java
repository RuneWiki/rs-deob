package deob;

@ObfuscatedName("by")
public final class class70 extends class235 {

    @ObfuscatedName("by.v")
    public int field925;

    @ObfuscatedName("by.c")
    public int field922;

    @ObfuscatedName("by.i")
    public int field921;

    @ObfuscatedName("by.f")
    public int field928;

    @ObfuscatedName("by.b")
    public int field924;

    @ObfuscatedName("by.n")
    public int field938;

    @ObfuscatedName("by.s")
    public int field927;

    @ObfuscatedName("by.l")
    public int field923;

    @ObfuscatedName("by.q")
    public int field929;

    @ObfuscatedName("by.o")
    public int field930;

    @ObfuscatedName("by.r")
    public int field931;

    @ObfuscatedName("by.p")
    public boolean field932 = false;

    @ObfuscatedName("by.w")
    public double field933;

    @ObfuscatedName("by.k")
    public double field934;

    @ObfuscatedName("by.d")
    public double field948;

    @ObfuscatedName("by.m")
    public double field936;

    @ObfuscatedName("by.u")
    public double field937;

    @ObfuscatedName("by.t")
    public double field935;

    @ObfuscatedName("by.g")
    public double field939;

    @ObfuscatedName("by.x")
    public double field940;

    @ObfuscatedName("by.a")
    public int field941;

    @ObfuscatedName("by.y")
    public int field942;

    @ObfuscatedName("by.j")
    public class191 field943;

    @ObfuscatedName("by.e")
    public int field944 = 0;

    @ObfuscatedName("by.z")
    public int field945 = 0;

    public class70(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        this.field925 = arg0;
        this.field922 = arg1;
        this.field921 = arg2;
        this.field928 = arg3;
        this.field924 = arg4;
        this.field927 = arg5;
        this.field923 = arg6;
        this.field929 = arg7;
        this.field930 = arg8;
        this.field931 = arg9;
        this.field938 = arg10;
        this.field932 = false;
        int var12 = class181.method2196(this.field925).field1944;
        if (var12 == -1) {
            this.field943 = null;
        } else {
            this.field943 = class191.method3011(var12);
        }
    }

    @ObfuscatedName("by.v(IIIIB)V")
    public final void method1878(int arg0, int arg1, int arg2, int arg3) {
        if (!this.field932) {
            double var5 = (double) (arg0 - this.field921);
            double var7 = (double) (arg1 - this.field928);
            double var9 = Math.sqrt(var5 * var5 + var7 * var7);
            this.field933 = (double) this.field930 * var5 / var9 + (double) this.field921;
            this.field934 = (double) this.field930 * var7 / var9 + (double) this.field928;
            this.field948 = (double) this.field924;
        }
        double var11 = (double) (this.field923 + 1 - arg3);
        this.field936 = ((double) arg0 - this.field933) / var11;
        this.field937 = ((double) arg1 - this.field934) / var11;
        this.field935 = Math.sqrt(this.field937 * this.field937 + this.field936 * this.field936);
        if (!this.field932) {
            this.field939 = -this.field935 * Math.tan((double) this.field929 * 0.02454369D);
        }
        this.field940 = ((double) arg2 - this.field948 - this.field939 * var11) * 2.0D / (var11 * var11);
    }

    @ObfuscatedName("by.i(II)V")
    public final void method1879(int arg0) {
        this.field932 = true;
        this.field933 += (double) arg0 * this.field936;
        this.field934 += (double) arg0 * this.field937;
        this.field948 += this.field940 * 0.5D * (double) arg0 * (double) arg0 + (double) arg0 * this.field939;
        this.field939 += (double) arg0 * this.field940;
        this.field941 = (int) (Math.atan2(this.field936, this.field937) * 325.949D) + 1024 & 0x7FF;
        this.field942 = (int) (Math.atan2(this.field939, this.field935) * 325.949D) & 0x7FF;
        if (this.field943 == null) {
            return;
        }
        if (this.field943.method3462()) {
            this.field944 += arg0;
            int var2 = this.field943.method3507();
            if (this.field944 >= var2) {
                this.field944 = var2 - this.field943.field2154;
            }
            return;
        }
        this.field945 += arg0;
        while (true) {
            do {
                do {
                    if (this.field945 <= this.field943.field2150[this.field944]) {
                        return;
                    }
                    this.field945 -= this.field943.field2150[this.field944];
                    this.field944++;
                } while (this.field944 < this.field943.field2148.length);
                this.field944 -= this.field943.field2154;
            } while (this.field944 >= 0 && this.field944 < this.field943.field2148.length);
            this.field944 = 0;
        }
    }

    @ObfuscatedName("by.c(B)Liq;")
    public final class241 method1809() {
        class181 var1 = class181.method2196(this.field925);
        class241 var2 = var1.method3206(this.field944);
        if (var2 == null) {
            return null;
        } else {
            var2.method4504(this.field942);
            return var2;
        }
    }
}
