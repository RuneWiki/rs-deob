package deob;

@ObfuscatedName("cm")
public final class class96 extends class145 {

    @ObfuscatedName("cm.m")
    public int field1249;

    @ObfuscatedName("cm.o")
    public int field1257;

    @ObfuscatedName("cm.q")
    public int field1238;

    @ObfuscatedName("cm.j")
    public int field1255;

    @ObfuscatedName("cm.p")
    public int field1236;

    @ObfuscatedName("cm.g")
    public int field1241;

    @ObfuscatedName("cm.n")
    public int field1242;

    @ObfuscatedName("cm.u")
    public int field1243;

    @ObfuscatedName("cm.a")
    public int field1261;

    @ObfuscatedName("cm.z")
    public int field1237;

    @ObfuscatedName("cm.w")
    public int field1246;

    @ObfuscatedName("cm.y")
    public boolean field1247 = false;

    @ObfuscatedName("cm.c")
    public double field1248;

    @ObfuscatedName("cm.h")
    public double field1258;

    @ObfuscatedName("cm.k")
    public double field1250;

    @ObfuscatedName("cm.r")
    public double field1251;

    @ObfuscatedName("cm.s")
    public double field1252;

    @ObfuscatedName("cm.v")
    public double field1253;

    @ObfuscatedName("cm.d")
    public double field1244;

    @ObfuscatedName("cm.e")
    public double field1260;

    @ObfuscatedName("cm.l")
    public int field1256;

    @ObfuscatedName("cm.t")
    public int field1245;

    @ObfuscatedName("cm.x")
    public class269 field1239;

    @ObfuscatedName("cm.b")
    public int field1259 = 0;

    @ObfuscatedName("cm.i")
    public int field1240 = 0;

    public class96(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        this.field1249 = arg0;
        this.field1257 = arg1;
        this.field1238 = arg2;
        this.field1255 = arg3;
        this.field1236 = arg4;
        this.field1242 = arg5;
        this.field1243 = arg6;
        this.field1261 = arg7;
        this.field1237 = arg8;
        this.field1246 = arg9;
        this.field1241 = arg10;
        this.field1247 = false;
        int var12 = class254.method41(this.field1249).field3274;
        if (var12 == -1) {
            this.field1239 = null;
        } else {
            this.field1239 = class269.method3330(var12);
        }
    }

    @ObfuscatedName("cm.m(IIIII)V")
    public final void method2024(int arg0, int arg1, int arg2, int arg3) {
        if (!this.field1247) {
            double var5 = (double) (arg0 - this.field1238);
            double var7 = (double) (arg1 - this.field1255);
            double var9 = Math.sqrt(var5 * var5 + var7 * var7);
            this.field1248 = (double) this.field1237 * var5 / var9 + (double) this.field1238;
            this.field1258 = (double) this.field1237 * var7 / var9 + (double) this.field1255;
            this.field1250 = (double) this.field1236;
        }
        double var11 = (double) (this.field1243 + 1 - arg3);
        this.field1251 = ((double) arg0 - this.field1248) / var11;
        this.field1252 = ((double) arg1 - this.field1258) / var11;
        this.field1253 = Math.sqrt(this.field1252 * this.field1252 + this.field1251 * this.field1251);
        if (!this.field1247) {
            this.field1244 = -this.field1253 * Math.tan((double) this.field1261 * 0.02454369D);
        }
        this.field1260 = ((double) arg2 - this.field1250 - this.field1244 * var11) * 2.0D / (var11 * var11);
    }

    @ObfuscatedName("cm.o(IB)V")
    public final void method2031(int arg0) {
        this.field1247 = true;
        this.field1248 += (double) arg0 * this.field1251;
        this.field1258 += (double) arg0 * this.field1252;
        this.field1250 += this.field1260 * 0.5D * (double) arg0 * (double) arg0 + (double) arg0 * this.field1244;
        this.field1244 += (double) arg0 * this.field1260;
        this.field1256 = (int) (Math.atan2(this.field1251, this.field1252) * 325.949D) + 1024 & 0x7FF;
        this.field1245 = (int) (Math.atan2(this.field1244, this.field1253) * 325.949D) & 0x7FF;
        if (this.field1239 == null) {
            return;
        }
        this.field1240 += arg0;
        while (true) {
            do {
                do {
                    if (this.field1240 <= this.field1239.field3551[this.field1259]) {
                        return;
                    }
                    this.field1240 -= this.field1239.field3551[this.field1259];
                    this.field1259++;
                } while (this.field1259 < this.field1239.field3552.length);
                this.field1259 -= this.field1239.field3553;
            } while (this.field1259 >= 0 && this.field1259 < this.field1239.field3552.length);
            this.field1259 = 0;
        }
    }

    @ObfuscatedName("cm.a(I)Lef;")
    public final class137 method1131() {
        class254 var1 = class254.method41(this.field1249);
        class137 var2 = var1.method4145(this.field1259);
        if (var2 == null) {
            return null;
        } else {
            var2.method2721(this.field1245);
            return var2;
        }
    }
}
