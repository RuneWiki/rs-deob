package deob;

@ObfuscatedName("cx")
public final class class91 extends class139 {

    @ObfuscatedName("cx.s")
    public int field1367;

    @ObfuscatedName("cx.g")
    public int field1360;

    @ObfuscatedName("cx.m")
    public int field1381;

    @ObfuscatedName("cx.h")
    public int field1362;

    @ObfuscatedName("cx.i")
    public int field1363;

    @ObfuscatedName("cx.w")
    public int field1380;

    @ObfuscatedName("cx.t")
    public int field1365;

    @ObfuscatedName("cx.d")
    public int field1366;

    @ObfuscatedName("cx.z")
    public int field1359;

    @ObfuscatedName("cx.k")
    public int field1377;

    @ObfuscatedName("cx.c")
    public int field1369;

    @ObfuscatedName("cx.o")
    public boolean field1370 = false;

    @ObfuscatedName("cx.l")
    public double field1375;

    @ObfuscatedName("cx.f")
    public double field1372;

    @ObfuscatedName("cx.q")
    public double field1373;

    @ObfuscatedName("cx.r")
    public double field1374;

    @ObfuscatedName("cx.x")
    public double field1364;

    @ObfuscatedName("cx.u")
    public double field1376;

    @ObfuscatedName("cx.b")
    public double field1371;

    @ObfuscatedName("cx.p")
    public double field1368;

    @ObfuscatedName("cx.y")
    public int field1379;

    @ObfuscatedName("cx.n")
    public int field1361;

    @ObfuscatedName("cx.j")
    public class272 field1378;

    @ObfuscatedName("cx.e")
    public int field1382 = 0;

    @ObfuscatedName("cx.v")
    public int field1383 = 0;

    public class91(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        this.field1367 = arg0;
        this.field1360 = arg1;
        this.field1381 = arg2;
        this.field1362 = arg3;
        this.field1363 = arg4;
        this.field1365 = arg5;
        this.field1366 = arg6;
        this.field1359 = arg7;
        this.field1377 = arg8;
        this.field1369 = arg9;
        this.field1380 = arg10;
        this.field1370 = false;
        int var12 = class257.method3116(this.field1367).field3405;
        if (var12 == -1) {
            this.field1378 = null;
        } else {
            this.field1378 = class272.method4180(var12);
        }
    }

    @ObfuscatedName("cx.s(IIIII)V")
    public final void method1816(int arg0, int arg1, int arg2, int arg3) {
        if (!this.field1370) {
            double var5 = (double) (arg0 - this.field1381);
            double var7 = (double) (arg1 - this.field1362);
            double var9 = Math.sqrt(var5 * var5 + var7 * var7);
            this.field1375 = (double) this.field1377 * var5 / var9 + (double) this.field1381;
            this.field1372 = (double) this.field1377 * var7 / var9 + (double) this.field1362;
            this.field1373 = (double) this.field1363;
        }
        double var11 = (double) (this.field1366 + 1 - arg3);
        this.field1374 = ((double) arg0 - this.field1375) / var11;
        this.field1364 = ((double) arg1 - this.field1372) / var11;
        this.field1376 = Math.sqrt(this.field1374 * this.field1374 + this.field1364 * this.field1364);
        if (!this.field1370) {
            this.field1371 = -this.field1376 * Math.tan((double) this.field1359 * 0.02454369D);
        }
        this.field1368 = ((double) arg2 - this.field1373 - this.field1371 * var11) * 2.0D / (var11 * var11);
    }

    @ObfuscatedName("cx.g(IB)V")
    public final void method1817(int arg0) {
        this.field1370 = true;
        this.field1375 += (double) arg0 * this.field1374;
        this.field1372 += (double) arg0 * this.field1364;
        this.field1373 += this.field1368 * 0.5D * (double) arg0 * (double) arg0 + (double) arg0 * this.field1371;
        this.field1371 += (double) arg0 * this.field1368;
        this.field1379 = (int) (Math.atan2(this.field1374, this.field1364) * 325.949D) + 1024 & 0x7FF;
        this.field1361 = (int) (Math.atan2(this.field1371, this.field1376) * 325.949D) & 0x7FF;
        if (this.field1378 == null) {
            return;
        }
        this.field1383 += arg0;
        while (true) {
            do {
                do {
                    if (this.field1383 <= this.field1378.field3684[this.field1382]) {
                        return;
                    }
                    this.field1383 -= this.field1378.field3684[this.field1382];
                    this.field1382++;
                } while (this.field1382 < this.field1378.field3689.length);
                this.field1382 -= this.field1378.field3690;
            } while (this.field1382 >= 0 && this.field1382 < this.field1378.field3689.length);
            this.field1382 = 0;
        }
    }

    @ObfuscatedName("cx.z(I)Les;")
    public final class131 method1039() {
        class257 var1 = class257.method3116(this.field1367);
        class131 var2 = var1.method4406(this.field1382);
        if (var2 == null) {
            return null;
        } else {
            var2.method2537(this.field1361);
            return var2;
        }
    }
}
