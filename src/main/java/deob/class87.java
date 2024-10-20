package deob;

@ObfuscatedName("cb")
public final class class87 extends class136 {

    @ObfuscatedName("cb.m")
    public int field1204;

    @ObfuscatedName("cb.f")
    public int field1186;

    @ObfuscatedName("cb.q")
    public int field1185;

    @ObfuscatedName("cb.w")
    public int field1205;

    @ObfuscatedName("cb.o")
    public int field1187;

    @ObfuscatedName("cb.u")
    public int field1188;

    @ObfuscatedName("cb.g")
    public int field1189;

    @ObfuscatedName("cb.l")
    public int field1190;

    @ObfuscatedName("cb.e")
    public int field1192;

    @ObfuscatedName("cb.x")
    public int field1199;

    @ObfuscatedName("cb.d")
    public int field1208;

    @ObfuscatedName("cb.k")
    public boolean field1194 = false;

    @ObfuscatedName("cb.n")
    public double field1195;

    @ObfuscatedName("cb.i")
    public double field1196;

    @ObfuscatedName("cb.a")
    public double field1197;

    @ObfuscatedName("cb.z")
    public double field1198;

    @ObfuscatedName("cb.j")
    public double field1184;

    @ObfuscatedName("cb.s")
    public double field1200;

    @ObfuscatedName("cb.t")
    public double field1201;

    @ObfuscatedName("cb.y")
    public double field1202;

    @ObfuscatedName("cb.h")
    public int field1203;

    @ObfuscatedName("cb.b")
    public int field1193;

    @ObfuscatedName("cb.c")
    public class270 field1183;

    @ObfuscatedName("cb.r")
    public int field1191 = 0;

    @ObfuscatedName("cb.p")
    public int field1207 = 0;

    public class87(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        this.field1204 = arg0;
        this.field1186 = arg1;
        this.field1185 = arg2;
        this.field1205 = arg3;
        this.field1187 = arg4;
        this.field1189 = arg5;
        this.field1190 = arg6;
        this.field1192 = arg7;
        this.field1199 = arg8;
        this.field1208 = arg9;
        this.field1188 = arg10;
        this.field1194 = false;
        int var12 = class255.method756(this.field1204).field3315;
        if (var12 == -1) {
            this.field1183 = null;
        } else {
            this.field1183 = class270.method596(var12);
        }
    }

    @ObfuscatedName("cb.m(IIIII)V")
    public final void method1900(int arg0, int arg1, int arg2, int arg3) {
        if (!this.field1194) {
            double var5 = (double) (arg0 - this.field1185);
            double var7 = (double) (arg1 - this.field1205);
            double var9 = Math.sqrt(var5 * var5 + var7 * var7);
            this.field1195 = (double) this.field1199 * var5 / var9 + (double) this.field1185;
            this.field1196 = (double) this.field1199 * var7 / var9 + (double) this.field1205;
            this.field1197 = (double) this.field1187;
        }
        double var11 = (double) (this.field1190 + 1 - arg3);
        this.field1198 = ((double) arg0 - this.field1195) / var11;
        this.field1184 = ((double) arg1 - this.field1196) / var11;
        this.field1200 = Math.sqrt(this.field1198 * this.field1198 + this.field1184 * this.field1184);
        if (!this.field1194) {
            this.field1201 = -this.field1200 * Math.tan((double) this.field1192 * 0.02454369D);
        }
        this.field1202 = ((double) arg2 - this.field1197 - this.field1201 * var11) * 2.0D / (var11 * var11);
    }

    @ObfuscatedName("cb.f(II)V")
    public final void method1906(int arg0) {
        this.field1194 = true;
        this.field1195 += (double) arg0 * this.field1198;
        this.field1196 += (double) arg0 * this.field1184;
        this.field1197 += this.field1202 * 0.5D * (double) arg0 * (double) arg0 + (double) arg0 * this.field1201;
        this.field1201 += (double) arg0 * this.field1202;
        this.field1203 = (int) (Math.atan2(this.field1198, this.field1184) * 325.949D) + 1024 & 0x7FF;
        this.field1193 = (int) (Math.atan2(this.field1201, this.field1200) * 325.949D) & 0x7FF;
        if (this.field1183 == null) {
            return;
        }
        this.field1207 += arg0;
        while (true) {
            do {
                do {
                    if (this.field1207 <= this.field1183.field3589[this.field1191]) {
                        return;
                    }
                    this.field1207 -= this.field1183.field3589[this.field1191];
                    this.field1191++;
                } while (this.field1191 < this.field1183.field3587.length);
                this.field1191 -= this.field1183.field3591;
            } while (this.field1191 >= 0 && this.field1191 < this.field1183.field3587.length);
            this.field1191 = 0;
        }
    }

    @ObfuscatedName("cb.e(I)Ldu;")
    public final class128 method1105() {
        class255 var1 = class255.method756(this.field1204);
        class128 var2 = var1.method4396(this.field1191);
        if (var2 == null) {
            return null;
        } else {
            var2.method2633(this.field1193);
            return var2;
        }
    }
}
