package deob;

@ObfuscatedName("cz")
public final class class92 extends class140 {

    @ObfuscatedName("cz.g")
    public int field1383;

    @ObfuscatedName("cz.e")
    public int field1376;

    @ObfuscatedName("cz.b")
    public int field1385;

    @ObfuscatedName("cz.z")
    public int field1399;

    @ObfuscatedName("cz.n")
    public int field1375;

    @ObfuscatedName("cz.l")
    public int field1390;

    @ObfuscatedName("cz.s")
    public int field1381;

    @ObfuscatedName("cz.y")
    public int field1382;

    @ObfuscatedName("cz.c")
    public int field1392;

    @ObfuscatedName("cz.h")
    public int field1378;

    @ObfuscatedName("cz.i")
    public int field1386;

    @ObfuscatedName("cz.o")
    public boolean field1377 = false;

    @ObfuscatedName("cz.d")
    public double field1387;

    @ObfuscatedName("cz.r")
    public double field1388;

    @ObfuscatedName("cz.p")
    public double field1389;

    @ObfuscatedName("cz.q")
    public double field1384;

    @ObfuscatedName("cz.f")
    public double field1391;

    @ObfuscatedName("cz.j")
    public double field1380;

    @ObfuscatedName("cz.v")
    public double field1393;

    @ObfuscatedName("cz.u")
    public double field1394;

    @ObfuscatedName("cz.k")
    public int field1395;

    @ObfuscatedName("cz.w")
    public int field1396;

    @ObfuscatedName("cz.m")
    public class288 field1397;

    @ObfuscatedName("cz.a")
    public int field1398 = 0;

    @ObfuscatedName("cz.x")
    public int field1379 = 0;

    public class92(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        this.field1383 = arg0;
        this.field1376 = arg1;
        this.field1385 = arg2;
        this.field1399 = arg3;
        this.field1375 = arg4;
        this.field1381 = arg5;
        this.field1382 = arg6;
        this.field1392 = arg7;
        this.field1378 = arg8;
        this.field1386 = arg9;
        this.field1390 = arg10;
        this.field1377 = false;
        int var12 = class273.method1058(this.field1383).field3496;
        if (var12 == -1) {
            this.field1397 = null;
        } else {
            this.field1397 = class288.method1825(var12);
        }
    }

    @ObfuscatedName("cz.g(IIIII)V")
    public final void method1879(int arg0, int arg1, int arg2, int arg3) {
        if (!this.field1377) {
            double var5 = (double) (arg0 - this.field1385);
            double var7 = (double) (arg1 - this.field1399);
            double var9 = Math.sqrt(var5 * var5 + var7 * var7);
            this.field1387 = (double) this.field1378 * var5 / var9 + (double) this.field1385;
            this.field1388 = (double) this.field1378 * var7 / var9 + (double) this.field1399;
            this.field1389 = (double) this.field1375;
        }
        double var11 = (double) (this.field1382 + 1 - arg3);
        this.field1384 = ((double) arg0 - this.field1387) / var11;
        this.field1391 = ((double) arg1 - this.field1388) / var11;
        this.field1380 = Math.sqrt(this.field1391 * this.field1391 + this.field1384 * this.field1384);
        if (!this.field1377) {
            this.field1393 = -this.field1380 * Math.tan((double) this.field1392 * 0.02454369D);
        }
        this.field1394 = ((double) arg2 - this.field1389 - this.field1393 * var11) * 2.0D / (var11 * var11);
    }

    @ObfuscatedName("cz.e(IS)V")
    public final void method1880(int arg0) {
        this.field1377 = true;
        this.field1387 += (double) arg0 * this.field1384;
        this.field1388 += (double) arg0 * this.field1391;
        this.field1389 += this.field1394 * 0.5D * (double) arg0 * (double) arg0 + (double) arg0 * this.field1393;
        this.field1393 += (double) arg0 * this.field1394;
        this.field1395 = (int) (Math.atan2(this.field1384, this.field1391) * 325.949D) + 1024 & 0x7FF;
        this.field1396 = (int) (Math.atan2(this.field1393, this.field1380) * 325.949D) & 0x7FF;
        if (this.field1397 == null) {
            return;
        }
        this.field1379 += arg0;
        while (true) {
            do {
                do {
                    if (this.field1379 <= this.field1397.field3757[this.field1398]) {
                        return;
                    }
                    this.field1379 -= this.field1397.field3757[this.field1398];
                    this.field1398++;
                } while (this.field1398 < this.field1397.field3762.length);
                this.field1398 -= this.field1397.field3766;
            } while (this.field1398 >= 0 && this.field1398 < this.field1397.field3762.length);
            this.field1398 = 0;
        }
    }

    @ObfuscatedName("cz.c(I)Lee;")
    public final class132 method1120() {
        class273 var1 = class273.method1058(this.field1383);
        class132 var2 = var1.method4518(this.field1398);
        if (var2 == null) {
            return null;
        } else {
            var2.method2612(this.field1396);
            return var2;
        }
    }
}
