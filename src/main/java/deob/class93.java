package deob;

@ObfuscatedName("ck")
public final class class93 extends class141 {

    @ObfuscatedName("ck.b")
    public int field1374;

    @ObfuscatedName("ck.s")
    public int field1378;

    @ObfuscatedName("ck.r")
    public int field1368;

    @ObfuscatedName("ck.g")
    public int field1369;

    @ObfuscatedName("ck.x")
    public int field1386;

    @ObfuscatedName("ck.f")
    public int field1371;

    @ObfuscatedName("ck.u")
    public int field1372;

    @ObfuscatedName("ck.t")
    public int field1373;

    @ObfuscatedName("ck.k")
    public int field1384;

    @ObfuscatedName("ck.n")
    public int field1375;

    @ObfuscatedName("ck.d")
    public int field1376;

    @ObfuscatedName("ck.o")
    public boolean field1377 = false;

    @ObfuscatedName("ck.a")
    public double field1370;

    @ObfuscatedName("ck.q")
    public double field1385;

    @ObfuscatedName("ck.j")
    public double field1380;

    @ObfuscatedName("ck.m")
    public double field1381;

    @ObfuscatedName("ck.h")
    public double field1382;

    @ObfuscatedName("ck.c")
    public double field1367;

    @ObfuscatedName("ck.y")
    public double field1366;

    @ObfuscatedName("ck.p")
    public double field1379;

    @ObfuscatedName("ck.i")
    public int field1383;

    @ObfuscatedName("ck.l")
    public int field1387;

    @ObfuscatedName("ck.z")
    public class268 field1388;

    @ObfuscatedName("ck.e")
    public int field1389 = 0;

    @ObfuscatedName("ck.v")
    public int field1390 = 0;

    public class93(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        this.field1374 = arg0;
        this.field1378 = arg1;
        this.field1368 = arg2;
        this.field1369 = arg3;
        this.field1386 = arg4;
        this.field1372 = arg5;
        this.field1373 = arg6;
        this.field1384 = arg7;
        this.field1375 = arg8;
        this.field1376 = arg9;
        this.field1371 = arg10;
        this.field1377 = false;
        int var12 = class253.method3933(this.field1374).field3388;
        if (var12 == -1) {
            this.field1388 = null;
        } else {
            this.field1388 = class268.method1560(var12);
        }
    }

    @ObfuscatedName("ck.b(IIIIB)V")
    public final void method1615(int arg0, int arg1, int arg2, int arg3) {
        if (!this.field1377) {
            double var5 = (double) (arg0 - this.field1368);
            double var7 = (double) (arg1 - this.field1369);
            double var9 = Math.sqrt(var5 * var5 + var7 * var7);
            this.field1370 = (double) this.field1375 * var5 / var9 + (double) this.field1368;
            this.field1385 = (double) this.field1375 * var7 / var9 + (double) this.field1369;
            this.field1380 = (double) this.field1386;
        }
        double var11 = (double) (this.field1373 + 1 - arg3);
        this.field1381 = ((double) arg0 - this.field1370) / var11;
        this.field1382 = ((double) arg1 - this.field1385) / var11;
        this.field1367 = Math.sqrt(this.field1382 * this.field1382 + this.field1381 * this.field1381);
        if (!this.field1377) {
            this.field1366 = -this.field1367 * Math.tan((double) this.field1384 * 0.02454369D);
        }
        this.field1379 = ((double) arg2 - this.field1380 - this.field1366 * var11) * 2.0D / (var11 * var11);
    }

    @ObfuscatedName("ck.s(II)V")
    public final void method1611(int arg0) {
        this.field1377 = true;
        this.field1370 += (double) arg0 * this.field1381;
        this.field1385 += (double) arg0 * this.field1382;
        this.field1380 += this.field1379 * 0.5D * (double) arg0 * (double) arg0 + (double) arg0 * this.field1366;
        this.field1366 += (double) arg0 * this.field1379;
        this.field1383 = (int) (Math.atan2(this.field1381, this.field1382) * 325.949D) + 1024 & 0x7FF;
        this.field1387 = (int) (Math.atan2(this.field1366, this.field1367) * 325.949D) & 0x7FF;
        if (this.field1388 == null) {
            return;
        }
        this.field1390 += arg0;
        while (true) {
            do {
                do {
                    if (this.field1390 <= this.field1388.field3656[this.field1389]) {
                        return;
                    }
                    this.field1390 -= this.field1388.field3656[this.field1389];
                    this.field1389++;
                } while (this.field1389 < this.field1388.field3661.length);
                this.field1389 -= this.field1388.field3658;
            } while (this.field1389 >= 0 && this.field1389 < this.field1388.field3661.length);
            this.field1389 = 0;
        }
    }

    @ObfuscatedName("ck.r(I)Lev;")
    public final class133 method983() {
        class253 var1 = class253.method3933(this.field1374);
        class133 var2 = var1.method4018(this.field1389);
        if (var2 == null) {
            return null;
        } else {
            var2.method2322(this.field1387);
            return var2;
        }
    }
}
