package deob;

@ObfuscatedName("cu")
public final class class96 extends class145 {

    @ObfuscatedName("cu.h")
    public int field1213;

    @ObfuscatedName("cu.v")
    public int field1226;

    @ObfuscatedName("cu.x")
    public int field1215;

    @ObfuscatedName("cu.w")
    public int field1216;

    @ObfuscatedName("cu.t")
    public int field1217;

    @ObfuscatedName("cu.j")
    public int field1228;

    @ObfuscatedName("cu.n")
    public int field1219;

    @ObfuscatedName("cu.p")
    public int field1235;

    @ObfuscatedName("cu.l")
    public int field1227;

    @ObfuscatedName("cu.z")
    public int field1222;

    @ObfuscatedName("cu.u")
    public int field1232;

    @ObfuscatedName("cu.e")
    public boolean field1224 = false;

    @ObfuscatedName("cu.m")
    public double field1225;

    @ObfuscatedName("cu.c")
    public double field1218;

    @ObfuscatedName("cu.i")
    public double field1233;

    @ObfuscatedName("cu.f")
    public double field1221;

    @ObfuscatedName("cu.a")
    public double field1229;

    @ObfuscatedName("cu.b")
    public double field1230;

    @ObfuscatedName("cu.y")
    public double field1231;

    @ObfuscatedName("cu.r")
    public double field1220;

    @ObfuscatedName("cu.q")
    public int field1223;

    @ObfuscatedName("cu.g")
    public int field1234;

    @ObfuscatedName("cu.s")
    public class270 field1214;

    @ObfuscatedName("cu.o")
    public int field1236 = 0;

    @ObfuscatedName("cu.k")
    public int field1237 = 0;

    public class96(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        this.field1213 = arg0;
        this.field1226 = arg1;
        this.field1215 = arg2;
        this.field1216 = arg3;
        this.field1217 = arg4;
        this.field1219 = arg5;
        this.field1235 = arg6;
        this.field1227 = arg7;
        this.field1222 = arg8;
        this.field1232 = arg9;
        this.field1228 = arg10;
        this.field1224 = false;
        int var12 = class255.method2025(this.field1213).field3285;
        if (var12 == -1) {
            this.field1214 = null;
        } else {
            this.field1214 = class270.method4174(var12);
        }
    }

    @ObfuscatedName("cu.h(IIIII)V")
    public final void method2014(int arg0, int arg1, int arg2, int arg3) {
        if (!this.field1224) {
            double var5 = (double) (arg0 - this.field1215);
            double var7 = (double) (arg1 - this.field1216);
            double var9 = Math.sqrt(var5 * var5 + var7 * var7);
            this.field1225 = (double) this.field1222 * var5 / var9 + (double) this.field1215;
            this.field1218 = (double) this.field1222 * var7 / var9 + (double) this.field1216;
            this.field1233 = (double) this.field1217;
        }
        double var11 = (double) (this.field1235 + 1 - arg3);
        this.field1221 = ((double) arg0 - this.field1225) / var11;
        this.field1229 = ((double) arg1 - this.field1218) / var11;
        this.field1230 = Math.sqrt(this.field1229 * this.field1229 + this.field1221 * this.field1221);
        if (!this.field1224) {
            this.field1231 = -this.field1230 * Math.tan((double) this.field1227 * 0.02454369D);
        }
        this.field1220 = ((double) arg2 - this.field1233 - this.field1231 * var11) * 2.0D / (var11 * var11);
    }

    @ObfuscatedName("cu.v(IB)V")
    public final void method2016(int arg0) {
        this.field1224 = true;
        this.field1225 += (double) arg0 * this.field1221;
        this.field1218 += (double) arg0 * this.field1229;
        this.field1233 += this.field1220 * 0.5D * (double) arg0 * (double) arg0 + (double) arg0 * this.field1231;
        this.field1231 += (double) arg0 * this.field1220;
        this.field1223 = (int) (Math.atan2(this.field1221, this.field1229) * 325.949D) + 1024 & 0x7FF;
        this.field1234 = (int) (Math.atan2(this.field1231, this.field1230) * 325.949D) & 0x7FF;
        if (this.field1214 == null) {
            return;
        }
        this.field1237 += arg0;
        while (true) {
            do {
                do {
                    if (this.field1237 <= this.field1214.field3553[this.field1236]) {
                        return;
                    }
                    this.field1237 -= this.field1214.field3553[this.field1236];
                    this.field1236++;
                } while (this.field1236 < this.field1214.field3551.length);
                this.field1236 -= this.field1214.field3559;
            } while (this.field1236 >= 0 && this.field1236 < this.field1214.field3551.length);
            this.field1236 = 0;
        }
    }

    @ObfuscatedName("cu.l(I)Leh;")
    public final class137 method1198() {
        class255 var1 = class255.method2025(this.field1213);
        class137 var2 = var1.method4075(this.field1236);
        if (var2 == null) {
            return null;
        } else {
            var2.method2733(this.field1234);
            return var2;
        }
    }
}
