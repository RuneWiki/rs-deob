package deob;

@ObfuscatedName("ci")
public final class class80 extends class128 {

    @ObfuscatedName("ci.w")
    public int field1147;

    @ObfuscatedName("ci.m")
    public int field1145;

    @ObfuscatedName("ci.q")
    public int field1164;

    @ObfuscatedName("ci.b")
    public int field1148;

    @ObfuscatedName("ci.f")
    public int field1149;

    @ObfuscatedName("ci.n")
    public int field1157;

    @ObfuscatedName("ci.h")
    public int field1151;

    @ObfuscatedName("ci.x")
    public int field1159;

    @ObfuscatedName("ci.j")
    public int field1158;

    @ObfuscatedName("ci.a")
    public int field1154;

    @ObfuscatedName("ci.l")
    public int field1155;

    @ObfuscatedName("ci.d")
    public boolean field1146 = false;

    @ObfuscatedName("ci.s")
    public double field1152;

    @ObfuscatedName("ci.p")
    public double field1170;

    @ObfuscatedName("ci.g")
    public double field1156;

    @ObfuscatedName("ci.y")
    public double field1160;

    @ObfuscatedName("ci.c")
    public double field1161;

    @ObfuscatedName("ci.e")
    public double field1162;

    @ObfuscatedName("ci.t")
    public double field1163;

    @ObfuscatedName("ci.u")
    public double field1153;

    @ObfuscatedName("ci.i")
    public int field1165;

    @ObfuscatedName("ci.z")
    public int field1166;

    @ObfuscatedName("ci.k")
    public class274 field1167;

    @ObfuscatedName("ci.r")
    public int field1168 = 0;

    @ObfuscatedName("ci.v")
    public int field1169 = 0;

    public class80(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        this.field1147 = arg0;
        this.field1145 = arg1;
        this.field1164 = arg2;
        this.field1148 = arg3;
        this.field1149 = arg4;
        this.field1151 = arg5;
        this.field1159 = arg6;
        this.field1158 = arg7;
        this.field1154 = arg8;
        this.field1155 = arg9;
        this.field1157 = arg10;
        this.field1146 = false;
        int var12 = class259.method973(this.field1147).field3293;
        if (var12 == -1) {
            this.field1167 = null;
        } else {
            this.field1167 = class274.method2918(var12);
        }
    }

    @ObfuscatedName("ci.w(IIIII)V")
    public final void method1759(int arg0, int arg1, int arg2, int arg3) {
        if (!this.field1146) {
            double var5 = (double) (arg0 - this.field1164);
            double var7 = (double) (arg1 - this.field1148);
            double var9 = Math.sqrt(var5 * var5 + var7 * var7);
            this.field1152 = (double) this.field1154 * var5 / var9 + (double) this.field1164;
            this.field1170 = (double) this.field1154 * var7 / var9 + (double) this.field1148;
            this.field1156 = (double) this.field1149;
        }
        double var11 = (double) (this.field1159 + 1 - arg3);
        this.field1160 = ((double) arg0 - this.field1152) / var11;
        this.field1161 = ((double) arg1 - this.field1170) / var11;
        this.field1162 = Math.sqrt(this.field1161 * this.field1161 + this.field1160 * this.field1160);
        if (!this.field1146) {
            this.field1163 = -this.field1162 * Math.tan((double) this.field1158 * 0.02454369D);
        }
        this.field1153 = ((double) arg2 - this.field1156 - this.field1163 * var11) * 2.0D / (var11 * var11);
    }

    @ObfuscatedName("ci.m(IB)V")
    public final void method1761(int arg0) {
        this.field1146 = true;
        this.field1152 += (double) arg0 * this.field1160;
        this.field1170 += (double) arg0 * this.field1161;
        this.field1156 += this.field1153 * 0.5D * (double) arg0 * (double) arg0 + (double) arg0 * this.field1163;
        this.field1163 += (double) arg0 * this.field1153;
        this.field1165 = (int) (Math.atan2(this.field1160, this.field1161) * 325.949D) + 1024 & 0x7FF;
        this.field1166 = (int) (Math.atan2(this.field1163, this.field1162) * 325.949D) & 0x7FF;
        if (this.field1167 == null) {
            return;
        }
        this.field1169 += arg0;
        while (true) {
            do {
                do {
                    if (this.field1169 <= this.field1167.field3563[this.field1168]) {
                        return;
                    }
                    this.field1169 -= this.field1167.field3563[this.field1168];
                    this.field1168++;
                } while (this.field1168 < this.field1167.field3554.length);
                this.field1168 -= this.field1167.field3558;
            } while (this.field1168 >= 0 && this.field1168 < this.field1167.field3554.length);
            this.field1168 = 0;
        }
    }

    @ObfuscatedName("ci.s(B)Ldk;")
    public final class120 method1048() {
        class259 var1 = class259.method973(this.field1147);
        class120 var2 = var1.method4477(this.field1168);
        if (var2 == null) {
            return null;
        } else {
            var2.method2522(this.field1166);
            return var2;
        }
    }
}
