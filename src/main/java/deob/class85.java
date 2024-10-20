package deob;

@ObfuscatedName("ce")
public final class class85 extends class177 {

    @ObfuscatedName("ce.f")
    public int field1040;

    @ObfuscatedName("ce.o")
    public int field1025;

    @ObfuscatedName("ce.u")
    public int field1036;

    @ObfuscatedName("ce.p")
    public int field1027;

    @ObfuscatedName("ce.b")
    public int field1039;

    @ObfuscatedName("ce.e")
    public int field1029;

    @ObfuscatedName("ce.k")
    public int field1030;

    @ObfuscatedName("ce.g")
    public int field1028;

    @ObfuscatedName("ce.h")
    public int field1032;

    @ObfuscatedName("ce.n")
    public int field1033;

    @ObfuscatedName("ce.l")
    public int field1034;

    @ObfuscatedName("ce.m")
    public boolean field1035 = false;

    @ObfuscatedName("ce.d")
    public double field1031;

    @ObfuscatedName("ce.c")
    public double field1026;

    @ObfuscatedName("ce.j")
    public double field1038;

    @ObfuscatedName("ce.r")
    public double field1041;

    @ObfuscatedName("ce.q")
    public double field1024;

    @ObfuscatedName("ce.t")
    public double field1037;

    @ObfuscatedName("ce.v")
    public double field1042;

    @ObfuscatedName("ce.x")
    public double field1043;

    @ObfuscatedName("ce.z")
    public int field1044;

    @ObfuscatedName("ce.i")
    public int field1045;

    @ObfuscatedName("ce.a")
    public class298 field1046;

    @ObfuscatedName("ce.w")
    public int field1047 = 0;

    @ObfuscatedName("ce.s")
    public int field1048 = 0;

    public class85(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        this.field1040 = arg0;
        this.field1025 = arg1;
        this.field1036 = arg2;
        this.field1027 = arg3;
        this.field1039 = arg4;
        this.field1030 = arg5;
        this.field1028 = arg6;
        this.field1032 = arg7;
        this.field1033 = arg8;
        this.field1034 = arg9;
        this.field1029 = arg10;
        this.field1035 = false;
        int var12 = class289.method3663(this.field1040).field3528;
        if (var12 == -1) {
            this.field1046 = null;
        } else {
            this.field1046 = class298.method3795(var12);
        }
    }

    @ObfuscatedName("ce.f(IIIII)V")
    public final void method1712(int arg0, int arg1, int arg2, int arg3) {
        if (!this.field1035) {
            double var5 = (double) (arg0 - this.field1036);
            double var7 = (double) (arg1 - this.field1027);
            double var9 = Math.sqrt(var5 * var5 + var7 * var7);
            this.field1031 = (double) this.field1033 * var5 / var9 + (double) this.field1036;
            this.field1026 = (double) this.field1033 * var7 / var9 + (double) this.field1027;
            this.field1038 = (double) this.field1039;
        }
        double var11 = (double) (this.field1028 + 1 - arg3);
        this.field1041 = ((double) arg0 - this.field1031) / var11;
        this.field1024 = ((double) arg1 - this.field1026) / var11;
        this.field1037 = Math.sqrt(this.field1041 * this.field1041 + this.field1024 * this.field1024);
        if (!this.field1035) {
            this.field1042 = -this.field1037 * Math.tan((double) this.field1032 * 0.02454369D);
        }
        this.field1043 = ((double) arg2 - this.field1038 - this.field1042 * var11) * 2.0D / (var11 * var11);
    }

    @ObfuscatedName("ce.u(II)V")
    public final void method1713(int arg0) {
        this.field1035 = true;
        this.field1031 += (double) arg0 * this.field1041;
        this.field1026 += (double) arg0 * this.field1024;
        this.field1038 += this.field1043 * 0.5D * (double) arg0 * (double) arg0 + (double) arg0 * this.field1042;
        this.field1042 += (double) arg0 * this.field1043;
        this.field1044 = (int) (Math.atan2(this.field1041, this.field1024) * 325.949D) + 1024 & 0x7FF;
        this.field1045 = (int) (Math.atan2(this.field1042, this.field1037) * 325.949D) & 0x7FF;
        if (this.field1046 == null) {
            return;
        }
        this.field1048 += arg0;
        while (true) {
            do {
                do {
                    if (this.field1048 <= this.field1046.field3714[this.field1047]) {
                        return;
                    }
                    this.field1048 -= this.field1046.field3714[this.field1047];
                    this.field1047++;
                } while (this.field1047 < this.field1046.field3712.length);
                this.field1047 -= this.field1046.field3715;
            } while (this.field1047 >= 0 && this.field1047 < this.field1046.field3712.length);
            this.field1047 = 0;
        }
    }

    @ObfuscatedName("ce.o(I)Lgv;")
    public final class183 method1649() {
        class289 var1 = class289.method3663(this.field1040);
        class183 var2 = var1.method4473(this.field1047);
        if (var2 == null) {
            return null;
        } else {
            var2.method3250(this.field1045);
            return var2;
        }
    }
}
