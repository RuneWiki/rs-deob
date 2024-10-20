package deob;

@ObfuscatedName("cu")
public final class class81 extends class130 {

    @ObfuscatedName("cu.v")
    public int field1164;

    @ObfuscatedName("cu.s")
    public int field1163;

    @ObfuscatedName("cu.o")
    public int field1175;

    @ObfuscatedName("cu.k")
    public int field1165;

    @ObfuscatedName("cu.u")
    public int field1166;

    @ObfuscatedName("cu.i")
    public int field1167;

    @ObfuscatedName("cu.t")
    public int field1176;

    @ObfuscatedName("cu.p")
    public int field1186;

    @ObfuscatedName("cu.l")
    public int field1170;

    @ObfuscatedName("cu.b")
    public int field1171;

    @ObfuscatedName("cu.c")
    public int field1172;

    @ObfuscatedName("cu.d")
    public boolean field1181 = false;

    @ObfuscatedName("cu.w")
    public double field1174;

    @ObfuscatedName("cu.a")
    public double field1168;

    @ObfuscatedName("cu.z")
    public double field1162;

    @ObfuscatedName("cu.e")
    public double field1177;

    @ObfuscatedName("cu.q")
    public double field1185;

    @ObfuscatedName("cu.j")
    public double field1173;

    @ObfuscatedName("cu.y")
    public double field1180;

    @ObfuscatedName("cu.m")
    public double field1178;

    @ObfuscatedName("cu.h")
    public int field1182;

    @ObfuscatedName("cu.x")
    public int field1183;

    @ObfuscatedName("cu.f")
    public class276 field1184;

    @ObfuscatedName("cu.r")
    public int field1169 = 0;

    @ObfuscatedName("cu.n")
    public int field1179 = 0;

    public class81(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        this.field1164 = arg0;
        this.field1163 = arg1;
        this.field1175 = arg2;
        this.field1165 = arg3;
        this.field1166 = arg4;
        this.field1176 = arg5;
        this.field1186 = arg6;
        this.field1170 = arg7;
        this.field1171 = arg8;
        this.field1172 = arg9;
        this.field1167 = arg10;
        this.field1181 = false;
        int var12 = class261.method2850(this.field1164).field3301;
        if (var12 == -1) {
            this.field1184 = null;
        } else {
            this.field1184 = class276.method115(var12);
        }
    }

    @ObfuscatedName("cu.v(IIIIB)V")
    public final void method1765(int arg0, int arg1, int arg2, int arg3) {
        if (!this.field1181) {
            double var5 = (double) (arg0 - this.field1175);
            double var7 = (double) (arg1 - this.field1165);
            double var9 = Math.sqrt(var5 * var5 + var7 * var7);
            this.field1174 = (double) this.field1171 * var5 / var9 + (double) this.field1175;
            this.field1168 = (double) this.field1171 * var7 / var9 + (double) this.field1165;
            this.field1162 = (double) this.field1166;
        }
        double var11 = (double) (this.field1186 + 1 - arg3);
        this.field1177 = ((double) arg0 - this.field1174) / var11;
        this.field1185 = ((double) arg1 - this.field1168) / var11;
        this.field1173 = Math.sqrt(this.field1185 * this.field1185 + this.field1177 * this.field1177);
        if (!this.field1181) {
            this.field1180 = -this.field1173 * Math.tan((double) this.field1170 * 0.02454369D);
        }
        this.field1178 = ((double) arg2 - this.field1162 - this.field1180 * var11) * 2.0D / (var11 * var11);
    }

    @ObfuscatedName("cu.s(II)V")
    public final void method1767(int arg0) {
        this.field1181 = true;
        this.field1174 += (double) arg0 * this.field1177;
        this.field1168 += (double) arg0 * this.field1185;
        this.field1162 += this.field1178 * 0.5D * (double) arg0 * (double) arg0 + (double) arg0 * this.field1180;
        this.field1180 += (double) arg0 * this.field1178;
        this.field1182 = (int) (Math.atan2(this.field1177, this.field1185) * 325.949D) + 1024 & 0x7FF;
        this.field1183 = (int) (Math.atan2(this.field1180, this.field1173) * 325.949D) & 0x7FF;
        if (this.field1184 == null) {
            return;
        }
        this.field1179 += arg0;
        while (true) {
            do {
                do {
                    if (this.field1179 <= this.field1184.field3568[this.field1169]) {
                        return;
                    }
                    this.field1179 -= this.field1184.field3568[this.field1169];
                    this.field1169++;
                } while (this.field1169 < this.field1184.field3566.length);
                this.field1169 -= this.field1184.field3570;
            } while (this.field1169 >= 0 && this.field1169 < this.field1184.field3566.length);
            this.field1169 = 0;
        }
    }

    @ObfuscatedName("cu.w(I)Lda;")
    public final class122 method1056() {
        class261 var1 = class261.method2850(this.field1164);
        class122 var2 = var1.method4519(this.field1169);
        if (var2 == null) {
            return null;
        } else {
            var2.method2513(this.field1183);
            return var2;
        }
    }
}
