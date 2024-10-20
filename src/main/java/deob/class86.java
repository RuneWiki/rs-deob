package deob;

@ObfuscatedName("cr")
public final class class86 extends class135 {

    @ObfuscatedName("cr.n")
    public int field1190;

    @ObfuscatedName("cr.h")
    public int field1175;

    @ObfuscatedName("cr.l")
    public int field1176;

    @ObfuscatedName("cr.g")
    public int field1178;

    @ObfuscatedName("cr.b")
    public int field1177;

    @ObfuscatedName("cr.a")
    public int field1189;

    @ObfuscatedName("cr.c")
    public int field1180;

    @ObfuscatedName("cr.z")
    public int field1181;

    @ObfuscatedName("cr.j")
    public int field1182;

    @ObfuscatedName("cr.d")
    public int field1183;

    @ObfuscatedName("cr.t")
    public int field1184;

    @ObfuscatedName("cr.f")
    public boolean field1185 = false;

    @ObfuscatedName("cr.i")
    public double field1186;

    @ObfuscatedName("cr.m")
    public double field1187;

    @ObfuscatedName("cr.v")
    public double field1188;

    @ObfuscatedName("cr.r")
    public double field1197;

    @ObfuscatedName("cr.x")
    public double field1194;

    @ObfuscatedName("cr.y")
    public double field1191;

    @ObfuscatedName("cr.p")
    public double field1192;

    @ObfuscatedName("cr.k")
    public double field1179;

    @ObfuscatedName("cr.o")
    public int field1193;

    @ObfuscatedName("cr.s")
    public int field1195;

    @ObfuscatedName("cr.u")
    public class279 field1196;

    @ObfuscatedName("cr.e")
    public int field1174 = 0;

    @ObfuscatedName("cr.w")
    public int field1198 = 0;

    public class86(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        this.field1190 = arg0;
        this.field1175 = arg1;
        this.field1176 = arg2;
        this.field1178 = arg3;
        this.field1177 = arg4;
        this.field1180 = arg5;
        this.field1181 = arg6;
        this.field1182 = arg7;
        this.field1183 = arg8;
        this.field1184 = arg9;
        this.field1189 = arg10;
        this.field1185 = false;
        int var12 = class264.method2268(this.field1190).field3345;
        if (var12 == -1) {
            this.field1196 = null;
        } else {
            this.field1196 = class279.method2783(var12);
        }
    }

    @ObfuscatedName("cr.n(IIIIB)V")
    public final void method1923(int arg0, int arg1, int arg2, int arg3) {
        if (!this.field1185) {
            double var5 = (double) (arg0 - this.field1176);
            double var7 = (double) (arg1 - this.field1178);
            double var9 = Math.sqrt(var5 * var5 + var7 * var7);
            this.field1186 = (double) this.field1183 * var5 / var9 + (double) this.field1176;
            this.field1187 = (double) this.field1183 * var7 / var9 + (double) this.field1178;
            this.field1188 = (double) this.field1177;
        }
        double var11 = (double) (this.field1181 + 1 - arg3);
        this.field1197 = ((double) arg0 - this.field1186) / var11;
        this.field1194 = ((double) arg1 - this.field1187) / var11;
        this.field1191 = Math.sqrt(this.field1197 * this.field1197 + this.field1194 * this.field1194);
        if (!this.field1185) {
            this.field1192 = -this.field1191 * Math.tan((double) this.field1182 * 0.02454369D);
        }
        this.field1179 = ((double) arg2 - this.field1188 - this.field1192 * var11) * 2.0D / (var11 * var11);
    }

    @ObfuscatedName("cr.h(II)V")
    public final void method1924(int arg0) {
        this.field1185 = true;
        this.field1186 += (double) arg0 * this.field1197;
        this.field1187 += (double) arg0 * this.field1194;
        this.field1188 += this.field1179 * 0.5D * (double) arg0 * (double) arg0 + (double) arg0 * this.field1192;
        this.field1192 += (double) arg0 * this.field1179;
        this.field1193 = (int) (Math.atan2(this.field1197, this.field1194) * 325.949D) + 1024 & 0x7FF;
        this.field1195 = (int) (Math.atan2(this.field1192, this.field1191) * 325.949D) & 0x7FF;
        if (this.field1196 == null) {
            return;
        }
        this.field1198 += arg0;
        while (true) {
            do {
                do {
                    if (this.field1198 <= this.field1196.field3603[this.field1174]) {
                        return;
                    }
                    this.field1198 -= this.field1196.field3603[this.field1174];
                    this.field1174++;
                } while (this.field1174 < this.field1196.field3612.length);
                this.field1174 -= this.field1196.field3607;
            } while (this.field1174 >= 0 && this.field1174 < this.field1196.field3612.length);
            this.field1174 = 0;
        }
    }

    @ObfuscatedName("cr.j(I)Ldq;")
    public final class127 method1101() {
        class264 var1 = class264.method2268(this.field1190);
        class127 var2 = var1.method4686(this.field1174);
        if (var2 == null) {
            return null;
        } else {
            var2.method2675(this.field1195);
            return var2;
        }
    }
}
