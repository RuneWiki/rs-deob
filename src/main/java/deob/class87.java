package deob;

@ObfuscatedName("cp")
public final class class87 extends class136 {

    @ObfuscatedName("cp.q")
    public int field1236;

    @ObfuscatedName("cp.w")
    public int field1216;

    @ObfuscatedName("cp.e")
    public int field1232;

    @ObfuscatedName("cp.p")
    public int field1215;

    @ObfuscatedName("cp.k")
    public int field1240;

    @ObfuscatedName("cp.l")
    public int field1226;

    @ObfuscatedName("cp.b")
    public int field1218;

    @ObfuscatedName("cp.i")
    public int field1241;

    @ObfuscatedName("cp.c")
    public int field1223;

    @ObfuscatedName("cp.f")
    public int field1224;

    @ObfuscatedName("cp.m")
    public int field1225;

    @ObfuscatedName("cp.u")
    public boolean field1221 = false;

    @ObfuscatedName("cp.x")
    public double field1219;

    @ObfuscatedName("cp.r")
    public double field1228;

    @ObfuscatedName("cp.v")
    public double field1229;

    @ObfuscatedName("cp.y")
    public double field1230;

    @ObfuscatedName("cp.g")
    public double field1231;

    @ObfuscatedName("cp.a")
    public double field1222;

    @ObfuscatedName("cp.j")
    public double field1233;

    @ObfuscatedName("cp.t")
    public double field1234;

    @ObfuscatedName("cp.h")
    public int field1235;

    @ObfuscatedName("cp.o")
    public int field1227;

    @ObfuscatedName("cp.n")
    public class259 field1237;

    @ObfuscatedName("cp.d")
    public int field1238 = 0;

    @ObfuscatedName("cp.s")
    public int field1239 = 0;

    public class87(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        this.field1236 = arg0;
        this.field1216 = arg1;
        this.field1232 = arg2;
        this.field1215 = arg3;
        this.field1240 = arg4;
        this.field1218 = arg5;
        this.field1241 = arg6;
        this.field1223 = arg7;
        this.field1224 = arg8;
        this.field1225 = arg9;
        this.field1226 = arg10;
        this.field1221 = false;
        int var12 = class244.method3544(this.field1236).field3239;
        if (var12 == -1) {
            this.field1237 = null;
        } else {
            this.field1237 = class259.method67(var12);
        }
    }

    @ObfuscatedName("cp.q(IIIII)V")
    public final void method1851(int arg0, int arg1, int arg2, int arg3) {
        if (!this.field1221) {
            double var5 = (double) (arg0 - this.field1232);
            double var7 = (double) (arg1 - this.field1215);
            double var9 = Math.sqrt(var5 * var5 + var7 * var7);
            this.field1219 = (double) this.field1224 * var5 / var9 + (double) this.field1232;
            this.field1228 = (double) this.field1224 * var7 / var9 + (double) this.field1215;
            this.field1229 = (double) this.field1240;
        }
        double var11 = (double) (this.field1241 + 1 - arg3);
        this.field1230 = ((double) arg0 - this.field1219) / var11;
        this.field1231 = ((double) arg1 - this.field1228) / var11;
        this.field1222 = Math.sqrt(this.field1231 * this.field1231 + this.field1230 * this.field1230);
        if (!this.field1221) {
            this.field1233 = -this.field1222 * Math.tan((double) this.field1223 * 0.02454369D);
        }
        this.field1234 = ((double) arg2 - this.field1229 - this.field1233 * var11) * 2.0D / (var11 * var11);
    }

    @ObfuscatedName("cp.w(IB)V")
    public final void method1857(int arg0) {
        this.field1221 = true;
        this.field1219 += (double) arg0 * this.field1230;
        this.field1228 += (double) arg0 * this.field1231;
        this.field1229 += this.field1234 * 0.5D * (double) arg0 * (double) arg0 + (double) arg0 * this.field1233;
        this.field1233 += (double) arg0 * this.field1234;
        this.field1235 = (int) (Math.atan2(this.field1230, this.field1231) * 325.949D) + 1024 & 0x7FF;
        this.field1227 = (int) (Math.atan2(this.field1233, this.field1222) * 325.949D) & 0x7FF;
        if (this.field1237 == null) {
            return;
        }
        this.field1239 += arg0;
        while (true) {
            do {
                do {
                    if (this.field1239 <= this.field1237.field3523[this.field1238]) {
                        return;
                    }
                    this.field1239 -= this.field1237.field3523[this.field1238];
                    this.field1238++;
                } while (this.field1238 < this.field1237.field3521.length);
                this.field1238 -= this.field1237.field3516;
            } while (this.field1238 >= 0 && this.field1238 < this.field1237.field3521.length);
            this.field1238 = 0;
        }
    }

    @ObfuscatedName("cp.c(I)Ldm;")
    public final class128 method1087() {
        class244 var1 = class244.method3544(this.field1236);
        class128 var2 = var1.method4023(this.field1238);
        if (var2 == null) {
            return null;
        } else {
            var2.method2606(this.field1227);
            return var2;
        }
    }
}
