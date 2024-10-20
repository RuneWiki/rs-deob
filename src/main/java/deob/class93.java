package deob;

@ObfuscatedName("co")
public final class class93 extends class141 {

    @ObfuscatedName("co.a")
    public int field1355;

    @ObfuscatedName("co.w")
    public int field1373;

    @ObfuscatedName("co.e")
    public int field1357;

    @ObfuscatedName("co.k")
    public int field1380;

    @ObfuscatedName("co.u")
    public int field1379;

    @ObfuscatedName("co.z")
    public int field1360;

    @ObfuscatedName("co.t")
    public int field1361;

    @ObfuscatedName("co.f")
    public int field1362;

    @ObfuscatedName("co.g")
    public int field1359;

    @ObfuscatedName("co.j")
    public int field1370;

    @ObfuscatedName("co.x")
    public int field1365;

    @ObfuscatedName("co.c")
    public boolean field1366 = false;

    @ObfuscatedName("co.s")
    public double field1367;

    @ObfuscatedName("co.n")
    public double field1368;

    @ObfuscatedName("co.y")
    public double field1369;

    @ObfuscatedName("co.o")
    public double field1375;

    @ObfuscatedName("co.r")
    public double field1371;

    @ObfuscatedName("co.i")
    public double field1372;

    @ObfuscatedName("co.l")
    public double field1364;

    @ObfuscatedName("co.m")
    public double field1374;

    @ObfuscatedName("co.q")
    public int field1358;

    @ObfuscatedName("co.b")
    public int field1376;

    @ObfuscatedName("co.h")
    public class272 field1377;

    @ObfuscatedName("co.d")
    public int field1363 = 0;

    @ObfuscatedName("co.v")
    public int field1356 = 0;

    public class93(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        this.field1355 = arg0;
        this.field1373 = arg1;
        this.field1357 = arg2;
        this.field1380 = arg3;
        this.field1379 = arg4;
        this.field1361 = arg5;
        this.field1362 = arg6;
        this.field1359 = arg7;
        this.field1370 = arg8;
        this.field1365 = arg9;
        this.field1360 = arg10;
        this.field1366 = false;
        int var12 = class257.method4035(this.field1355).field3414;
        if (var12 == -1) {
            this.field1377 = null;
        } else {
            this.field1377 = class272.method3881(var12);
        }
    }

    @ObfuscatedName("co.a(IIIII)V")
    public final void method1585(int arg0, int arg1, int arg2, int arg3) {
        if (!this.field1366) {
            double var5 = (double) (arg0 - this.field1357);
            double var7 = (double) (arg1 - this.field1380);
            double var9 = Math.sqrt(var5 * var5 + var7 * var7);
            this.field1367 = (double) this.field1370 * var5 / var9 + (double) this.field1357;
            this.field1368 = (double) this.field1370 * var7 / var9 + (double) this.field1380;
            this.field1369 = (double) this.field1379;
        }
        double var11 = (double) (this.field1362 + 1 - arg3);
        this.field1375 = ((double) arg0 - this.field1367) / var11;
        this.field1371 = ((double) arg1 - this.field1368) / var11;
        this.field1372 = Math.sqrt(this.field1375 * this.field1375 + this.field1371 * this.field1371);
        if (!this.field1366) {
            this.field1364 = -this.field1372 * Math.tan((double) this.field1359 * 0.02454369D);
        }
        this.field1374 = ((double) arg2 - this.field1369 - this.field1364 * var11) * 2.0D / (var11 * var11);
    }

    @ObfuscatedName("co.w(II)V")
    public final void method1584(int arg0) {
        this.field1366 = true;
        this.field1367 += (double) arg0 * this.field1375;
        this.field1368 += (double) arg0 * this.field1371;
        this.field1369 += this.field1374 * 0.5D * (double) arg0 * (double) arg0 + (double) arg0 * this.field1364;
        this.field1364 += (double) arg0 * this.field1374;
        this.field1358 = (int) (Math.atan2(this.field1375, this.field1371) * 325.949D) + 1024 & 0x7FF;
        this.field1376 = (int) (Math.atan2(this.field1364, this.field1372) * 325.949D) & 0x7FF;
        if (this.field1377 == null) {
            return;
        }
        this.field1356 += arg0;
        while (true) {
            do {
                do {
                    if (this.field1356 <= this.field1377.field3676[this.field1363]) {
                        return;
                    }
                    this.field1356 -= this.field1377.field3676[this.field1363];
                    this.field1363++;
                } while (this.field1363 < this.field1377.field3671.length);
                this.field1363 -= this.field1377.field3683;
            } while (this.field1363 >= 0 && this.field1363 < this.field1377.field3671.length);
            this.field1363 = 0;
        }
    }

    @ObfuscatedName("co.e(I)Lef;")
    public final class133 method981() {
        class257 var1 = class257.method4035(this.field1355);
        class133 var2 = var1.method4109(this.field1363);
        if (var2 == null) {
            return null;
        } else {
            var2.method2362(this.field1376);
            return var2;
        }
    }
}
