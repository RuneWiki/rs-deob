package deob;

@ObfuscatedName("ck")
public final class class87 extends class136 {

    @ObfuscatedName("ck.u")
    public int field1228;

    @ObfuscatedName("ck.f")
    public int field1210;

    @ObfuscatedName("ck.b")
    public int field1216;

    @ObfuscatedName("ck.g")
    public int field1212;

    @ObfuscatedName("ck.z")
    public int field1213;

    @ObfuscatedName("ck.p")
    public int field1214;

    @ObfuscatedName("ck.h")
    public int field1209;

    @ObfuscatedName("ck.y")
    public int field1215;

    @ObfuscatedName("ck.w")
    public int field1225;

    @ObfuscatedName("ck.i")
    public int field1217;

    @ObfuscatedName("ck.k")
    public int field1219;

    @ObfuscatedName("ck.x")
    public boolean field1227 = false;

    @ObfuscatedName("ck.o")
    public double field1221;

    @ObfuscatedName("ck.e")
    public double field1222;

    @ObfuscatedName("ck.n")
    public double field1223;

    @ObfuscatedName("ck.r")
    public double field1224;

    @ObfuscatedName("ck.c")
    public double field1218;

    @ObfuscatedName("ck.a")
    public double field1226;

    @ObfuscatedName("ck.d")
    public double field1230;

    @ObfuscatedName("ck.s")
    public double field1229;

    @ObfuscatedName("ck.t")
    public int field1220;

    @ObfuscatedName("ck.m")
    public int field1211;

    @ObfuscatedName("ck.v")
    public class259 field1231;

    @ObfuscatedName("ck.q")
    public int field1232 = 0;

    @ObfuscatedName("ck.l")
    public int field1233 = 0;

    public class87(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        this.field1228 = arg0;
        this.field1210 = arg1;
        this.field1216 = arg2;
        this.field1212 = arg3;
        this.field1213 = arg4;
        this.field1209 = arg5;
        this.field1215 = arg6;
        this.field1225 = arg7;
        this.field1217 = arg8;
        this.field1219 = arg9;
        this.field1214 = arg10;
        this.field1227 = false;
        int var12 = class244.method420(this.field1228).field3252;
        if (var12 == -1) {
            this.field1231 = null;
        } else {
            this.field1231 = class259.method154(var12);
        }
    }

    @ObfuscatedName("ck.u(IIIII)V")
    public final void method1932(int arg0, int arg1, int arg2, int arg3) {
        if (!this.field1227) {
            double var5 = (double) (arg0 - this.field1216);
            double var7 = (double) (arg1 - this.field1212);
            double var9 = Math.sqrt(var5 * var5 + var7 * var7);
            this.field1221 = (double) this.field1217 * var5 / var9 + (double) this.field1216;
            this.field1222 = (double) this.field1217 * var7 / var9 + (double) this.field1212;
            this.field1223 = (double) this.field1213;
        }
        double var11 = (double) (this.field1215 + 1 - arg3);
        this.field1224 = ((double) arg0 - this.field1221) / var11;
        this.field1218 = ((double) arg1 - this.field1222) / var11;
        this.field1226 = Math.sqrt(this.field1224 * this.field1224 + this.field1218 * this.field1218);
        if (!this.field1227) {
            this.field1230 = -this.field1226 * Math.tan((double) this.field1225 * 0.02454369D);
        }
        this.field1229 = ((double) arg2 - this.field1223 - this.field1230 * var11) * 2.0D / (var11 * var11);
    }

    @ObfuscatedName("ck.f(IB)V")
    public final void method1933(int arg0) {
        this.field1227 = true;
        this.field1221 += (double) arg0 * this.field1224;
        this.field1222 += (double) arg0 * this.field1218;
        this.field1223 += this.field1229 * 0.5D * (double) arg0 * (double) arg0 + (double) arg0 * this.field1230;
        this.field1230 += (double) arg0 * this.field1229;
        this.field1220 = (int) (Math.atan2(this.field1224, this.field1218) * 325.949D) + 1024 & 0x7FF;
        this.field1211 = (int) (Math.atan2(this.field1230, this.field1226) * 325.949D) & 0x7FF;
        if (this.field1231 == null) {
            return;
        }
        this.field1233 += arg0;
        while (true) {
            do {
                do {
                    if (this.field1233 <= this.field1231.field3523[this.field1232]) {
                        return;
                    }
                    this.field1233 -= this.field1231.field3523[this.field1232];
                    this.field1232++;
                } while (this.field1232 < this.field1231.field3521.length);
                this.field1232 -= this.field1231.field3525;
            } while (this.field1232 >= 0 && this.field1232 < this.field1231.field3521.length);
            this.field1232 = 0;
        }
    }

    @ObfuscatedName("ck.w(I)Ldf;")
    public final class128 method1103() {
        class244 var1 = class244.method420(this.field1228);
        class128 var2 = var1.method4091(this.field1232);
        if (var2 == null) {
            return null;
        } else {
            var2.method2650(this.field1211);
            return var2;
        }
    }
}
