package deob;

@ObfuscatedName("cf")
public final class class93 extends class141 {

    @ObfuscatedName("cf.m")
    public int field1378;

    @ObfuscatedName("cf.p")
    public int field1390;

    @ObfuscatedName("cf.i")
    public int field1373;

    @ObfuscatedName("cf.j")
    public int field1374;

    @ObfuscatedName("cf.v")
    public int field1391;

    @ObfuscatedName("cf.x")
    public int field1376;

    @ObfuscatedName("cf.e")
    public int field1377;

    @ObfuscatedName("cf.l")
    public int field1375;

    @ObfuscatedName("cf.b")
    public int field1394;

    @ObfuscatedName("cf.n")
    public int field1380;

    @ObfuscatedName("cf.c")
    public int field1372;

    @ObfuscatedName("cf.a")
    public boolean field1382 = false;

    @ObfuscatedName("cf.y")
    public double field1383;

    @ObfuscatedName("cf.w")
    public double field1379;

    @ObfuscatedName("cf.k")
    public double field1384;

    @ObfuscatedName("cf.t")
    public double field1371;

    @ObfuscatedName("cf.h")
    public double field1387;

    @ObfuscatedName("cf.u")
    public double field1388;

    @ObfuscatedName("cf.r")
    public double field1389;

    @ObfuscatedName("cf.g")
    public double field1385;

    @ObfuscatedName("cf.z")
    public int field1381;

    @ObfuscatedName("cf.o")
    public int field1392;

    @ObfuscatedName("cf.d")
    public class268 field1393;

    @ObfuscatedName("cf.s")
    public int field1386 = 0;

    @ObfuscatedName("cf.f")
    public int field1395 = 0;

    public class93(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        this.field1378 = arg0;
        this.field1390 = arg1;
        this.field1373 = arg2;
        this.field1374 = arg3;
        this.field1391 = arg4;
        this.field1377 = arg5;
        this.field1375 = arg6;
        this.field1394 = arg7;
        this.field1380 = arg8;
        this.field1372 = arg9;
        this.field1376 = arg10;
        this.field1382 = false;
        int var12 = class253.method4750(this.field1378).field3387;
        if (var12 == -1) {
            this.field1393 = null;
        } else {
            this.field1393 = class268.method2289(var12);
        }
    }

    @ObfuscatedName("cf.m(IIIII)V")
    public final void method1678(int arg0, int arg1, int arg2, int arg3) {
        if (!this.field1382) {
            double var5 = (double) (arg0 - this.field1373);
            double var7 = (double) (arg1 - this.field1374);
            double var9 = Math.sqrt(var5 * var5 + var7 * var7);
            this.field1383 = (double) this.field1380 * var5 / var9 + (double) this.field1373;
            this.field1379 = (double) this.field1380 * var7 / var9 + (double) this.field1374;
            this.field1384 = (double) this.field1391;
        }
        double var11 = (double) (this.field1375 + 1 - arg3);
        this.field1371 = ((double) arg0 - this.field1383) / var11;
        this.field1387 = ((double) arg1 - this.field1379) / var11;
        this.field1388 = Math.sqrt(this.field1387 * this.field1387 + this.field1371 * this.field1371);
        if (!this.field1382) {
            this.field1389 = -this.field1388 * Math.tan((double) this.field1394 * 0.02454369D);
        }
        this.field1385 = ((double) arg2 - this.field1384 - this.field1389 * var11) * 2.0D / (var11 * var11);
    }

    @ObfuscatedName("cf.p(II)V")
    public final void method1676(int arg0) {
        this.field1382 = true;
        this.field1383 += (double) arg0 * this.field1371;
        this.field1379 += (double) arg0 * this.field1387;
        this.field1384 += this.field1385 * 0.5D * (double) arg0 * (double) arg0 + (double) arg0 * this.field1389;
        this.field1389 += (double) arg0 * this.field1385;
        this.field1381 = (int) (Math.atan2(this.field1371, this.field1387) * 325.949D) + 1024 & 0x7FF;
        this.field1392 = (int) (Math.atan2(this.field1389, this.field1388) * 325.949D) & 0x7FF;
        if (this.field1393 == null) {
            return;
        }
        this.field1395 += arg0;
        while (true) {
            do {
                do {
                    if (this.field1395 <= this.field1393.field3662[this.field1386]) {
                        return;
                    }
                    this.field1395 -= this.field1393.field3662[this.field1386];
                    this.field1386++;
                } while (this.field1386 < this.field1393.field3660.length);
                this.field1386 -= this.field1393.field3664;
            } while (this.field1386 >= 0 && this.field1386 < this.field1393.field3660.length);
            this.field1386 = 0;
        }
    }

    @ObfuscatedName("cf.i(I)Len;")
    public final class133 method1070() {
        class253 var1 = class253.method4750(this.field1378);
        class133 var2 = var1.method4154(this.field1386);
        if (var2 == null) {
            return null;
        } else {
            var2.method2395(this.field1392);
            return var2;
        }
    }
}
