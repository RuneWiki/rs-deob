package deob;

@ObfuscatedName("cq")
public final class class85 extends class199 {

    @ObfuscatedName("cq.v")
    public int field1057;

    @ObfuscatedName("cq.n")
    public int field1058;

    @ObfuscatedName("cq.f")
    public int field1059;

    @ObfuscatedName("cq.y")
    public int field1061;

    @ObfuscatedName("cq.p")
    public int field1064;

    @ObfuscatedName("cq.j")
    public int field1062;

    @ObfuscatedName("cq.r")
    public int field1063;

    @ObfuscatedName("cq.b")
    public int field1075;

    @ObfuscatedName("cq.d")
    public int field1065;

    @ObfuscatedName("cq.s")
    public int field1066;

    @ObfuscatedName("cq.u")
    public int field1067;

    @ObfuscatedName("cq.l")
    public boolean field1068 = false;

    @ObfuscatedName("cq.o")
    public double field1069;

    @ObfuscatedName("cq.c")
    public double field1070;

    @ObfuscatedName("cq.e")
    public double field1071;

    @ObfuscatedName("cq.g")
    public double field1072;

    @ObfuscatedName("cq.a")
    public double field1073;

    @ObfuscatedName("cq.k")
    public double field1079;

    @ObfuscatedName("cq.m")
    public double field1081;

    @ObfuscatedName("cq.x")
    public double field1076;

    @ObfuscatedName("cq.z")
    public int field1077;

    @ObfuscatedName("cq.w")
    public int field1078;

    @ObfuscatedName("cq.t")
    public class157 field1060;

    @ObfuscatedName("cq.h")
    public int field1074 = 0;

    @ObfuscatedName("cq.q")
    public int field1080 = 0;

    public class85(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        this.field1057 = arg0;
        this.field1058 = arg1;
        this.field1059 = arg2;
        this.field1061 = arg3;
        this.field1064 = arg4;
        this.field1063 = arg5;
        this.field1075 = arg6;
        this.field1065 = arg7;
        this.field1066 = arg8;
        this.field1067 = arg9;
        this.field1062 = arg10;
        this.field1068 = false;
        int var12 = class148.method2427(this.field1057).field1690;
        if (var12 == -1) {
            this.field1060 = null;
        } else {
            this.field1060 = class157.method2030(var12);
        }
    }

    @ObfuscatedName("cq.v(IIIII)V")
    public final void method1774(int arg0, int arg1, int arg2, int arg3) {
        if (!this.field1068) {
            double var5 = (double) (arg0 - this.field1059);
            double var7 = (double) (arg1 - this.field1061);
            double var9 = Math.sqrt(var5 * var5 + var7 * var7);
            this.field1069 = (double) this.field1066 * var5 / var9 + (double) this.field1059;
            this.field1070 = (double) this.field1066 * var7 / var9 + (double) this.field1061;
            this.field1071 = (double) this.field1064;
        }
        double var11 = (double) (this.field1075 + 1 - arg3);
        this.field1072 = ((double) arg0 - this.field1069) / var11;
        this.field1073 = ((double) arg1 - this.field1070) / var11;
        this.field1079 = Math.sqrt(this.field1073 * this.field1073 + this.field1072 * this.field1072);
        if (!this.field1068) {
            this.field1081 = -this.field1079 * Math.tan((double) this.field1065 * 0.02454369D);
        }
        this.field1076 = ((double) arg2 - this.field1071 - this.field1081 * var11) * 2.0D / (var11 * var11);
    }

    @ObfuscatedName("cq.f(II)V")
    public final void method1773(int arg0) {
        this.field1068 = true;
        this.field1069 += (double) arg0 * this.field1072;
        this.field1070 += (double) arg0 * this.field1073;
        this.field1071 += this.field1076 * 0.5D * (double) arg0 * (double) arg0 + (double) arg0 * this.field1081;
        this.field1081 += (double) arg0 * this.field1076;
        this.field1077 = (int) (Math.atan2(this.field1072, this.field1073) * 325.949D) + 1024 & 0x7FF;
        this.field1078 = (int) (Math.atan2(this.field1081, this.field1079) * 325.949D) & 0x7FF;
        if (this.field1060 == null) {
            return;
        }
        this.field1080 += arg0;
        while (true) {
            do {
                do {
                    if (this.field1080 <= this.field1060.field1881[this.field1074]) {
                        return;
                    }
                    this.field1080 -= this.field1060.field1881[this.field1074];
                    this.field1074++;
                } while (this.field1074 < this.field1060.field1879.length);
                this.field1074 -= this.field1060.field1878;
            } while (this.field1074 >= 0 && this.field1074 < this.field1060.field1879.length);
            this.field1074 = 0;
        }
    }

    @ObfuscatedName("cq.n(B)Lgr;")
    public final class205 method1710() {
        class148 var1 = class148.method2427(this.field1057);
        class205 var2 = var1.method2562(this.field1074);
        if (var2 == null) {
            return null;
        } else {
            var2.method3801(this.field1078);
            return var2;
        }
    }
}
