package deob;

@ObfuscatedName("cv")
public final class class81 extends class130 {

    @ObfuscatedName("cv.c")
    public int field1175;

    @ObfuscatedName("cv.q")
    public int field1173;

    @ObfuscatedName("cv.m")
    public int field1181;

    @ObfuscatedName("cv.j")
    public int field1177;

    @ObfuscatedName("cv.g")
    public int field1176;

    @ObfuscatedName("cv.i")
    public int field1186;

    @ObfuscatedName("cv.h")
    public int field1178;

    @ObfuscatedName("cv.l")
    public int field1179;

    @ObfuscatedName("cv.d")
    public int field1196;

    @ObfuscatedName("cv.o")
    public int field1192;

    @ObfuscatedName("cv.s")
    public int field1182;

    @ObfuscatedName("cv.k")
    public boolean field1183 = false;

    @ObfuscatedName("cv.v")
    public double field1184;

    @ObfuscatedName("cv.p")
    public double field1185;

    @ObfuscatedName("cv.n")
    public double field1172;

    @ObfuscatedName("cv.t")
    public double field1187;

    @ObfuscatedName("cv.r")
    public double field1188;

    @ObfuscatedName("cv.x")
    public double field1190;

    @ObfuscatedName("cv.b")
    public double field1180;

    @ObfuscatedName("cv.w")
    public double field1191;

    @ObfuscatedName("cv.e")
    public int field1189;

    @ObfuscatedName("cv.a")
    public int field1193;

    @ObfuscatedName("cv.z")
    public class276 field1194;

    @ObfuscatedName("cv.y")
    public int field1195 = 0;

    @ObfuscatedName("cv.u")
    public int field1174 = 0;

    public class81(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        this.field1175 = arg0;
        this.field1173 = arg1;
        this.field1181 = arg2;
        this.field1177 = arg3;
        this.field1176 = arg4;
        this.field1178 = arg5;
        this.field1179 = arg6;
        this.field1196 = arg7;
        this.field1192 = arg8;
        this.field1182 = arg9;
        this.field1186 = arg10;
        this.field1183 = false;
        int var12 = class261.method34(this.field1175).field3308;
        if (var12 == -1) {
            this.field1194 = null;
        } else {
            this.field1194 = class276.method2826(var12);
        }
    }

    @ObfuscatedName("cv.c(IIIII)V")
    public final void method1724(int arg0, int arg1, int arg2, int arg3) {
        if (!this.field1183) {
            double var5 = (double) (arg0 - this.field1181);
            double var7 = (double) (arg1 - this.field1177);
            double var9 = Math.sqrt(var5 * var5 + var7 * var7);
            this.field1184 = (double) this.field1192 * var5 / var9 + (double) this.field1181;
            this.field1185 = (double) this.field1192 * var7 / var9 + (double) this.field1177;
            this.field1172 = (double) this.field1176;
        }
        double var11 = (double) (this.field1179 + 1 - arg3);
        this.field1187 = ((double) arg0 - this.field1184) / var11;
        this.field1188 = ((double) arg1 - this.field1185) / var11;
        this.field1190 = Math.sqrt(this.field1188 * this.field1188 + this.field1187 * this.field1187);
        if (!this.field1183) {
            this.field1180 = -this.field1190 * Math.tan((double) this.field1196 * 0.02454369D);
        }
        this.field1191 = ((double) arg2 - this.field1172 - this.field1180 * var11) * 2.0D / (var11 * var11);
    }

    @ObfuscatedName("cv.q(IS)V")
    public final void method1726(int arg0) {
        this.field1183 = true;
        this.field1184 += (double) arg0 * this.field1187;
        this.field1185 += (double) arg0 * this.field1188;
        this.field1172 += this.field1191 * 0.5D * (double) arg0 * (double) arg0 + (double) arg0 * this.field1180;
        this.field1180 += (double) arg0 * this.field1191;
        this.field1189 = (int) (Math.atan2(this.field1187, this.field1188) * 325.949D) + 1024 & 0x7FF;
        this.field1193 = (int) (Math.atan2(this.field1180, this.field1190) * 325.949D) & 0x7FF;
        if (this.field1194 == null) {
            return;
        }
        this.field1174 += arg0;
        while (true) {
            do {
                do {
                    if (this.field1174 <= this.field1194.field3587[this.field1195]) {
                        return;
                    }
                    this.field1174 -= this.field1194.field3587[this.field1195];
                    this.field1195++;
                } while (this.field1195 < this.field1194.field3585.length);
                this.field1195 -= this.field1194.field3594;
            } while (this.field1195 >= 0 && this.field1195 < this.field1194.field3585.length);
            this.field1195 = 0;
        }
    }

    @ObfuscatedName("cv.o(B)Ldx;")
    public final class122 method1063() {
        class261 var1 = class261.method34(this.field1175);
        class122 var2 = var1.method4477(this.field1195);
        if (var2 == null) {
            return null;
        } else {
            var2.method2430(this.field1193);
            return var2;
        }
    }
}
