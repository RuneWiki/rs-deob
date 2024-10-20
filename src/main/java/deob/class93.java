package deob;

@ObfuscatedName("cp")
public final class class93 extends class141 {

    @ObfuscatedName("cp.d")
    public int field1391;

    @ObfuscatedName("cp.x")
    public int field1388;

    @ObfuscatedName("cp.k")
    public int field1398;

    @ObfuscatedName("cp.z")
    public int field1381;

    @ObfuscatedName("cp.v")
    public int field1380;

    @ObfuscatedName("cp.m")
    public int field1383;

    @ObfuscatedName("cp.b")
    public int field1384;

    @ObfuscatedName("cp.t")
    public int field1386;

    @ObfuscatedName("cp.p")
    public int field1379;

    @ObfuscatedName("cp.r")
    public int field1387;

    @ObfuscatedName("cp.l")
    public int field1400;

    @ObfuscatedName("cp.u")
    public boolean field1389 = false;

    @ObfuscatedName("cp.n")
    public double field1390;

    @ObfuscatedName("cp.c")
    public double field1402;

    @ObfuscatedName("cp.y")
    public double field1392;

    @ObfuscatedName("cp.j")
    public double field1393;

    @ObfuscatedName("cp.f")
    public double field1394;

    @ObfuscatedName("cp.s")
    public double field1395;

    @ObfuscatedName("cp.e")
    public double field1396;

    @ObfuscatedName("cp.q")
    public double field1397;

    @ObfuscatedName("cp.h")
    public int field1382;

    @ObfuscatedName("cp.i")
    public int field1399;

    @ObfuscatedName("cp.o")
    public class268 field1378;

    @ObfuscatedName("cp.w")
    public int field1401 = 0;

    @ObfuscatedName("cp.g")
    public int field1385 = 0;

    public class93(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        this.field1391 = arg0;
        this.field1388 = arg1;
        this.field1398 = arg2;
        this.field1381 = arg3;
        this.field1380 = arg4;
        this.field1384 = arg5;
        this.field1386 = arg6;
        this.field1379 = arg7;
        this.field1387 = arg8;
        this.field1400 = arg9;
        this.field1383 = arg10;
        this.field1389 = false;
        int var12 = class253.method3903(this.field1391).field3394;
        if (var12 == -1) {
            this.field1378 = null;
        } else {
            this.field1378 = class268.method76(var12);
        }
    }

    @ObfuscatedName("cp.d(IIIII)V")
    public final void method1676(int arg0, int arg1, int arg2, int arg3) {
        if (!this.field1389) {
            double var5 = (double) (arg0 - this.field1398);
            double var7 = (double) (arg1 - this.field1381);
            double var9 = Math.sqrt(var5 * var5 + var7 * var7);
            this.field1390 = (double) this.field1387 * var5 / var9 + (double) this.field1398;
            this.field1402 = (double) this.field1387 * var7 / var9 + (double) this.field1381;
            this.field1392 = (double) this.field1380;
        }
        double var11 = (double) (this.field1386 + 1 - arg3);
        this.field1393 = ((double) arg0 - this.field1390) / var11;
        this.field1394 = ((double) arg1 - this.field1402) / var11;
        this.field1395 = Math.sqrt(this.field1394 * this.field1394 + this.field1393 * this.field1393);
        if (!this.field1389) {
            this.field1396 = -this.field1395 * Math.tan((double) this.field1379 * 0.02454369D);
        }
        this.field1397 = ((double) arg2 - this.field1392 - this.field1396 * var11) * 2.0D / (var11 * var11);
    }

    @ObfuscatedName("cp.x(II)V")
    public final void method1677(int arg0) {
        this.field1389 = true;
        this.field1390 += (double) arg0 * this.field1393;
        this.field1402 += (double) arg0 * this.field1394;
        this.field1392 += this.field1397 * 0.5D * (double) arg0 * (double) arg0 + (double) arg0 * this.field1396;
        this.field1396 += (double) arg0 * this.field1397;
        this.field1382 = (int) (Math.atan2(this.field1393, this.field1394) * 325.949D) + 1024 & 0x7FF;
        this.field1399 = (int) (Math.atan2(this.field1396, this.field1395) * 325.949D) & 0x7FF;
        if (this.field1378 == null) {
            return;
        }
        this.field1385 += arg0;
        while (true) {
            do {
                do {
                    if (this.field1385 <= this.field1378.field3671[this.field1401]) {
                        return;
                    }
                    this.field1385 -= this.field1378.field3671[this.field1401];
                    this.field1401++;
                } while (this.field1401 < this.field1378.field3669.length);
                this.field1401 -= this.field1378.field3673;
            } while (this.field1401 >= 0 && this.field1401 < this.field1378.field3669.length);
            this.field1401 = 0;
        }
    }

    @ObfuscatedName("cp.k(I)Leh;")
    public final class133 method1060() {
        class253 var1 = class253.method3903(this.field1391);
        class133 var2 = var1.method4151(this.field1401);
        if (var2 == null) {
            return null;
        } else {
            var2.method2417(this.field1399);
            return var2;
        }
    }
}
