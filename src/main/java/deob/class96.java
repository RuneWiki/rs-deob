package deob;

@ObfuscatedName("cp")
public final class class96 extends class145 {

    @ObfuscatedName("cp.z")
    public int field1254;

    @ObfuscatedName("cp.k")
    public int field1239;

    @ObfuscatedName("cp.s")
    public int field1257;

    @ObfuscatedName("cp.t")
    public int field1241;

    @ObfuscatedName("cp.i")
    public int field1242;

    @ObfuscatedName("cp.o")
    public int field1238;

    @ObfuscatedName("cp.x")
    public int field1244;

    @ObfuscatedName("cp.w")
    public int field1245;

    @ObfuscatedName("cp.g")
    public int field1246;

    @ObfuscatedName("cp.m")
    public int field1261;

    @ObfuscatedName("cp.n")
    public int field1248;

    @ObfuscatedName("cp.d")
    public boolean field1249 = false;

    @ObfuscatedName("cp.h")
    public double field1250;

    @ObfuscatedName("cp.a")
    public double field1247;

    @ObfuscatedName("cp.q")
    public double field1240;

    @ObfuscatedName("cp.c")
    public double field1253;

    @ObfuscatedName("cp.f")
    public double field1251;

    @ObfuscatedName("cp.y")
    public double field1258;

    @ObfuscatedName("cp.v")
    public double field1256;

    @ObfuscatedName("cp.j")
    public double field1255;

    @ObfuscatedName("cp.r")
    public int field1243;

    @ObfuscatedName("cp.u")
    public int field1259;

    @ObfuscatedName("cp.p")
    public class269 field1260;

    @ObfuscatedName("cp.b")
    public int field1252 = 0;

    @ObfuscatedName("cp.l")
    public int field1262 = 0;

    public class96(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        this.field1254 = arg0;
        this.field1239 = arg1;
        this.field1257 = arg2;
        this.field1241 = arg3;
        this.field1242 = arg4;
        this.field1244 = arg5;
        this.field1245 = arg6;
        this.field1246 = arg7;
        this.field1261 = arg8;
        this.field1248 = arg9;
        this.field1238 = arg10;
        this.field1249 = false;
        int var12 = class254.method1045(this.field1254).field3268;
        if (var12 == -1) {
            this.field1260 = null;
        } else {
            this.field1260 = class269.method536(var12);
        }
    }

    @ObfuscatedName("cp.z(IIIIB)V")
    public final void method2012(int arg0, int arg1, int arg2, int arg3) {
        if (!this.field1249) {
            double var5 = (double) (arg0 - this.field1257);
            double var7 = (double) (arg1 - this.field1241);
            double var9 = Math.sqrt(var5 * var5 + var7 * var7);
            this.field1250 = (double) this.field1261 * var5 / var9 + (double) this.field1257;
            this.field1247 = (double) this.field1261 * var7 / var9 + (double) this.field1241;
            this.field1240 = (double) this.field1242;
        }
        double var11 = (double) (this.field1245 + 1 - arg3);
        this.field1253 = ((double) arg0 - this.field1250) / var11;
        this.field1251 = ((double) arg1 - this.field1247) / var11;
        this.field1258 = Math.sqrt(this.field1253 * this.field1253 + this.field1251 * this.field1251);
        if (!this.field1249) {
            this.field1256 = -this.field1258 * Math.tan((double) this.field1246 * 0.02454369D);
        }
        this.field1255 = ((double) arg2 - this.field1240 - this.field1256 * var11) * 2.0D / (var11 * var11);
    }

    @ObfuscatedName("cp.k(IB)V")
    public final void method2014(int arg0) {
        this.field1249 = true;
        this.field1250 += (double) arg0 * this.field1253;
        this.field1247 += (double) arg0 * this.field1251;
        this.field1240 += this.field1255 * 0.5D * (double) arg0 * (double) arg0 + (double) arg0 * this.field1256;
        this.field1256 += (double) arg0 * this.field1255;
        this.field1243 = (int) (Math.atan2(this.field1253, this.field1251) * 325.949D) + 1024 & 0x7FF;
        this.field1259 = (int) (Math.atan2(this.field1256, this.field1258) * 325.949D) & 0x7FF;
        if (this.field1260 == null) {
            return;
        }
        this.field1262 += arg0;
        while (true) {
            do {
                do {
                    if (this.field1262 <= this.field1260.field3541[this.field1252]) {
                        return;
                    }
                    this.field1262 -= this.field1260.field3541[this.field1252];
                    this.field1252++;
                } while (this.field1252 < this.field1260.field3535.length);
                this.field1252 -= this.field1260.field3543;
            } while (this.field1252 >= 0 && this.field1252 < this.field1260.field3535.length);
            this.field1252 = 0;
        }
    }

    @ObfuscatedName("cp.g(I)Ler;")
    public final class137 method1141() {
        class254 var1 = class254.method1045(this.field1254);
        class137 var2 = var1.method4116(this.field1252);
        if (var2 == null) {
            return null;
        } else {
            var2.method2759(this.field1259);
            return var2;
        }
    }
}
