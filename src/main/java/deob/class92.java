package deob;

@ObfuscatedName("ci")
public final class class92 extends class140 {

    @ObfuscatedName("ci.c")
    public int field1386;

    @ObfuscatedName("ci.i")
    public int field1400;

    @ObfuscatedName("ci.o")
    public int field1398;

    @ObfuscatedName("ci.j")
    public int field1380;

    @ObfuscatedName("ci.k")
    public int field1391;

    @ObfuscatedName("ci.x")
    public int field1383;

    @ObfuscatedName("ci.z")
    public int field1384;

    @ObfuscatedName("ci.p")
    public int field1385;

    @ObfuscatedName("ci.w")
    public int field1392;

    @ObfuscatedName("ci.r")
    public int field1387;

    @ObfuscatedName("ci.d")
    public int field1388;

    @ObfuscatedName("ci.a")
    public boolean field1389 = false;

    @ObfuscatedName("ci.e")
    public double field1390;

    @ObfuscatedName("ci.f")
    public double field1393;

    @ObfuscatedName("ci.l")
    public double field1399;

    @ObfuscatedName("ci.m")
    public double field1395;

    @ObfuscatedName("ci.b")
    public double field1394;

    @ObfuscatedName("ci.h")
    public double field1381;

    @ObfuscatedName("ci.t")
    public double field1396;

    @ObfuscatedName("ci.v")
    public double field1397;

    @ObfuscatedName("ci.n")
    public int field1378;

    @ObfuscatedName("ci.u")
    public int field1382;

    @ObfuscatedName("ci.q")
    public class288 field1402;

    @ObfuscatedName("ci.g")
    public int field1401 = 0;

    @ObfuscatedName("ci.y")
    public int field1379 = 0;

    public class92(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        this.field1386 = arg0;
        this.field1400 = arg1;
        this.field1398 = arg2;
        this.field1380 = arg3;
        this.field1391 = arg4;
        this.field1384 = arg5;
        this.field1385 = arg6;
        this.field1392 = arg7;
        this.field1387 = arg8;
        this.field1388 = arg9;
        this.field1383 = arg10;
        this.field1389 = false;
        int var12 = class273.method4166(this.field1386).field3495;
        if (var12 == -1) {
            this.field1402 = null;
        } else {
            this.field1402 = class288.method3535(var12);
        }
    }

    @ObfuscatedName("ci.c(IIIIB)V")
    public final void method1767(int arg0, int arg1, int arg2, int arg3) {
        if (!this.field1389) {
            double var5 = (double) (arg0 - this.field1398);
            double var7 = (double) (arg1 - this.field1380);
            double var9 = Math.sqrt(var5 * var5 + var7 * var7);
            this.field1390 = (double) this.field1387 * var5 / var9 + (double) this.field1398;
            this.field1393 = (double) this.field1387 * var7 / var9 + (double) this.field1380;
            this.field1399 = (double) this.field1391;
        }
        double var11 = (double) (this.field1385 + 1 - arg3);
        this.field1395 = ((double) arg0 - this.field1390) / var11;
        this.field1394 = ((double) arg1 - this.field1393) / var11;
        this.field1381 = Math.sqrt(this.field1395 * this.field1395 + this.field1394 * this.field1394);
        if (!this.field1389) {
            this.field1396 = -this.field1381 * Math.tan((double) this.field1392 * 0.02454369D);
        }
        this.field1397 = ((double) arg2 - this.field1399 - this.field1396 * var11) * 2.0D / (var11 * var11);
    }

    @ObfuscatedName("ci.i(II)V")
    public final void method1768(int arg0) {
        this.field1389 = true;
        this.field1390 += (double) arg0 * this.field1395;
        this.field1393 += (double) arg0 * this.field1394;
        this.field1399 += this.field1397 * 0.5D * (double) arg0 * (double) arg0 + (double) arg0 * this.field1396;
        this.field1396 += (double) arg0 * this.field1397;
        this.field1378 = (int) (Math.atan2(this.field1395, this.field1394) * 325.949D) + 1024 & 0x7FF;
        this.field1382 = (int) (Math.atan2(this.field1396, this.field1381) * 325.949D) & 0x7FF;
        if (this.field1402 == null) {
            return;
        }
        this.field1379 += arg0;
        while (true) {
            do {
                do {
                    if (this.field1379 <= this.field1402.field3764[this.field1401]) {
                        return;
                    }
                    this.field1379 -= this.field1402.field3764[this.field1401];
                    this.field1401++;
                } while (this.field1401 < this.field1402.field3751.length);
                this.field1401 -= this.field1402.field3755;
            } while (this.field1401 >= 0 && this.field1401 < this.field1402.field3751.length);
            this.field1401 = 0;
        }
    }

    @ObfuscatedName("ci.w(B)Led;")
    public final class132 method1043() {
        class273 var1 = class273.method4166(this.field1386);
        class132 var2 = var1.method4422(this.field1401);
        if (var2 == null) {
            return null;
        } else {
            var2.method2544(this.field1382);
            return var2;
        }
    }
}
