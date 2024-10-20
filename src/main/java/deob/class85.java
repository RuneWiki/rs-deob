package deob;

@ObfuscatedName("cp")
public final class class85 extends class200 {

    @ObfuscatedName("cp.f")
    public int field1058;

    @ObfuscatedName("cp.e")
    public int field1048;

    @ObfuscatedName("cp.v")
    public int field1040;

    @ObfuscatedName("cp.y")
    public int field1046;

    @ObfuscatedName("cp.j")
    public int field1042;

    @ObfuscatedName("cp.o")
    public int field1043;

    @ObfuscatedName("cp.m")
    public int field1044;

    @ObfuscatedName("cp.r")
    public int field1045;

    @ObfuscatedName("cp.h")
    public int field1060;

    @ObfuscatedName("cp.d")
    public int field1047;

    @ObfuscatedName("cp.z")
    public int field1038;

    @ObfuscatedName("cp.b")
    public boolean field1041 = false;

    @ObfuscatedName("cp.i")
    public double field1039;

    @ObfuscatedName("cp.k")
    public double field1051;

    @ObfuscatedName("cp.g")
    public double field1052;

    @ObfuscatedName("cp.t")
    public double field1055;

    @ObfuscatedName("cp.x")
    public double field1054;

    @ObfuscatedName("cp.u")
    public double field1061;

    @ObfuscatedName("cp.q")
    public double field1056;

    @ObfuscatedName("cp.s")
    public double field1057;

    @ObfuscatedName("cp.p")
    public int field1049;

    @ObfuscatedName("cp.c")
    public int field1059;

    @ObfuscatedName("cp.n")
    public class158 field1053;

    @ObfuscatedName("cp.l")
    public int field1050 = 0;

    @ObfuscatedName("cp.w")
    public int field1062 = 0;

    public class85(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        this.field1058 = arg0;
        this.field1048 = arg1;
        this.field1040 = arg2;
        this.field1046 = arg3;
        this.field1042 = arg4;
        this.field1044 = arg5;
        this.field1045 = arg6;
        this.field1060 = arg7;
        this.field1047 = arg8;
        this.field1038 = arg9;
        this.field1043 = arg10;
        this.field1041 = false;
        int var12 = class149.method1892(this.field1058).field1692;
        if (var12 == -1) {
            this.field1053 = null;
        } else {
            this.field1053 = class158.method3363(var12);
        }
    }

    @ObfuscatedName("cp.f(IIIIB)V")
    public final void method1806(int arg0, int arg1, int arg2, int arg3) {
        if (!this.field1041) {
            double var5 = (double) (arg0 - this.field1040);
            double var7 = (double) (arg1 - this.field1046);
            double var9 = Math.sqrt(var5 * var5 + var7 * var7);
            this.field1039 = (double) this.field1047 * var5 / var9 + (double) this.field1040;
            this.field1051 = (double) this.field1047 * var7 / var9 + (double) this.field1046;
            this.field1052 = (double) this.field1042;
        }
        double var11 = (double) (this.field1045 + 1 - arg3);
        this.field1055 = ((double) arg0 - this.field1039) / var11;
        this.field1054 = ((double) arg1 - this.field1051) / var11;
        this.field1061 = Math.sqrt(this.field1055 * this.field1055 + this.field1054 * this.field1054);
        if (!this.field1041) {
            this.field1056 = -this.field1061 * Math.tan((double) this.field1060 * 0.02454369D);
        }
        this.field1057 = ((double) arg2 - this.field1052 - this.field1056 * var11) * 2.0D / (var11 * var11);
    }

    @ObfuscatedName("cp.v(II)V")
    public final void method1807(int arg0) {
        this.field1041 = true;
        this.field1039 += (double) arg0 * this.field1055;
        this.field1051 += (double) arg0 * this.field1054;
        this.field1052 += this.field1057 * 0.5D * (double) arg0 * (double) arg0 + (double) arg0 * this.field1056;
        this.field1056 += (double) arg0 * this.field1057;
        this.field1049 = (int) (Math.atan2(this.field1055, this.field1054) * 325.949D) + 1024 & 0x7FF;
        this.field1059 = (int) (Math.atan2(this.field1056, this.field1061) * 325.949D) & 0x7FF;
        if (this.field1053 == null) {
            return;
        }
        this.field1062 += arg0;
        while (true) {
            do {
                do {
                    if (this.field1062 <= this.field1053.field1884[this.field1050]) {
                        return;
                    }
                    this.field1062 -= this.field1053.field1884[this.field1050];
                    this.field1050++;
                } while (this.field1050 < this.field1053.field1882.length);
                this.field1050 -= this.field1053.field1888;
            } while (this.field1050 >= 0 && this.field1050 < this.field1053.field1882.length);
            this.field1050 = 0;
        }
    }

    @ObfuscatedName("cp.e(I)Lgd;")
    public final class206 method1758() {
        class149 var1 = class149.method1892(this.field1058);
        class206 var2 = var1.method2580(this.field1050);
        if (var2 == null) {
            return null;
        } else {
            var2.method3852(this.field1059);
            return var2;
        }
    }
}
