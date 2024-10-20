package deob;

@ObfuscatedName("cw")
public final class class92 extends class140 {

    @ObfuscatedName("cw.d")
    public int field1395;

    @ObfuscatedName("cw.z")
    public int field1373;

    @ObfuscatedName("cw.n")
    public int field1374;

    @ObfuscatedName("cw.r")
    public int field1375;

    @ObfuscatedName("cw.e")
    public int field1394;

    @ObfuscatedName("cw.y")
    public int field1377;

    @ObfuscatedName("cw.k")
    public int field1378;

    @ObfuscatedName("cw.s")
    public int field1372;

    @ObfuscatedName("cw.p")
    public int field1380;

    @ObfuscatedName("cw.x")
    public int field1390;

    @ObfuscatedName("cw.m")
    public int field1382;

    @ObfuscatedName("cw.h")
    public boolean field1383 = false;

    @ObfuscatedName("cw.t")
    public double field1391;

    @ObfuscatedName("cw.i")
    public double field1385;

    @ObfuscatedName("cw.u")
    public double field1386;

    @ObfuscatedName("cw.q")
    public double field1387;

    @ObfuscatedName("cw.v")
    public double field1388;

    @ObfuscatedName("cw.f")
    public double field1389;

    @ObfuscatedName("cw.b")
    public double field1384;

    @ObfuscatedName("cw.c")
    public double field1376;

    @ObfuscatedName("cw.j")
    public int field1379;

    @ObfuscatedName("cw.l")
    public int field1381;

    @ObfuscatedName("cw.g")
    public class288 field1393;

    @ObfuscatedName("cw.w")
    public int field1392 = 0;

    @ObfuscatedName("cw.o")
    public int field1396 = 0;

    public class92(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        this.field1395 = arg0;
        this.field1373 = arg1;
        this.field1374 = arg2;
        this.field1375 = arg3;
        this.field1394 = arg4;
        this.field1378 = arg5;
        this.field1372 = arg6;
        this.field1380 = arg7;
        this.field1390 = arg8;
        this.field1382 = arg9;
        this.field1377 = arg10;
        this.field1383 = false;
        int var12 = class273.method698(this.field1395).field3485;
        if (var12 == -1) {
            this.field1393 = null;
        } else {
            this.field1393 = class288.method4510(var12);
        }
    }

    @ObfuscatedName("cw.d(IIIII)V")
    public final void method1801(int arg0, int arg1, int arg2, int arg3) {
        if (!this.field1383) {
            double var5 = (double) (arg0 - this.field1374);
            double var7 = (double) (arg1 - this.field1375);
            double var9 = Math.sqrt(var5 * var5 + var7 * var7);
            this.field1391 = (double) this.field1390 * var5 / var9 + (double) this.field1374;
            this.field1385 = (double) this.field1390 * var7 / var9 + (double) this.field1375;
            this.field1386 = (double) this.field1394;
        }
        double var11 = (double) (this.field1372 + 1 - arg3);
        this.field1387 = ((double) arg0 - this.field1391) / var11;
        this.field1388 = ((double) arg1 - this.field1385) / var11;
        this.field1389 = Math.sqrt(this.field1388 * this.field1388 + this.field1387 * this.field1387);
        if (!this.field1383) {
            this.field1384 = -this.field1389 * Math.tan((double) this.field1380 * 0.02454369D);
        }
        this.field1376 = ((double) arg2 - this.field1386 - this.field1384 * var11) * 2.0D / (var11 * var11);
    }

    @ObfuscatedName("cw.z(IB)V")
    public final void method1798(int arg0) {
        this.field1383 = true;
        this.field1391 += (double) arg0 * this.field1387;
        this.field1385 += (double) arg0 * this.field1388;
        this.field1386 += this.field1376 * 0.5D * (double) arg0 * (double) arg0 + (double) arg0 * this.field1384;
        this.field1384 += (double) arg0 * this.field1376;
        this.field1379 = (int) (Math.atan2(this.field1387, this.field1388) * 325.949D) + 1024 & 0x7FF;
        this.field1381 = (int) (Math.atan2(this.field1384, this.field1389) * 325.949D) & 0x7FF;
        if (this.field1393 == null) {
            return;
        }
        this.field1396 += arg0;
        while (true) {
            do {
                do {
                    if (this.field1396 <= this.field1393.field3758[this.field1392]) {
                        return;
                    }
                    this.field1396 -= this.field1393.field3758[this.field1392];
                    this.field1392++;
                } while (this.field1392 < this.field1393.field3764.length);
                this.field1392 -= this.field1393.field3760;
            } while (this.field1392 >= 0 && this.field1392 < this.field1393.field3764.length);
            this.field1392 = 0;
        }
    }

    @ObfuscatedName("cw.x(I)Lel;")
    public final class132 method1067() {
        class273 var1 = class273.method698(this.field1395);
        class132 var2 = var1.method4528(this.field1392);
        if (var2 == null) {
            return null;
        } else {
            var2.method2603(this.field1381);
            return var2;
        }
    }
}
