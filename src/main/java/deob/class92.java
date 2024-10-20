package deob;

@ObfuscatedName("cc")
public final class class92 extends class140 {

    @ObfuscatedName("cc.t")
    public int field1382;

    @ObfuscatedName("cc.q")
    public int field1363;

    @ObfuscatedName("cc.i")
    public int field1380;

    @ObfuscatedName("cc.a")
    public int field1379;

    @ObfuscatedName("cc.l")
    public int field1366;

    @ObfuscatedName("cc.b")
    public int field1367;

    @ObfuscatedName("cc.e")
    public int field1368;

    @ObfuscatedName("cc.x")
    public int field1369;

    @ObfuscatedName("cc.p")
    public int field1370;

    @ObfuscatedName("cc.g")
    public int field1371;

    @ObfuscatedName("cc.n")
    public int field1372;

    @ObfuscatedName("cc.o")
    public boolean field1362 = false;

    @ObfuscatedName("cc.c")
    public double field1374;

    @ObfuscatedName("cc.v")
    public double field1375;

    @ObfuscatedName("cc.u")
    public double field1376;

    @ObfuscatedName("cc.j")
    public double field1377;

    @ObfuscatedName("cc.k")
    public double field1378;

    @ObfuscatedName("cc.z")
    public double field1385;

    @ObfuscatedName("cc.w")
    public double field1364;

    @ObfuscatedName("cc.s")
    public double field1383;

    @ObfuscatedName("cc.d")
    public int field1365;

    @ObfuscatedName("cc.f")
    public int field1386;

    @ObfuscatedName("cc.r")
    public class288 field1381;

    @ObfuscatedName("cc.y")
    public int field1384 = 0;

    @ObfuscatedName("cc.h")
    public int field1373 = 0;

    public class92(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        this.field1382 = arg0;
        this.field1363 = arg1;
        this.field1380 = arg2;
        this.field1379 = arg3;
        this.field1366 = arg4;
        this.field1368 = arg5;
        this.field1369 = arg6;
        this.field1370 = arg7;
        this.field1371 = arg8;
        this.field1372 = arg9;
        this.field1367 = arg10;
        this.field1362 = false;
        int var12 = class273.method346(this.field1382).field3495;
        if (var12 == -1) {
            this.field1381 = null;
        } else {
            this.field1381 = class288.method2932(var12);
        }
    }

    @ObfuscatedName("cc.t(IIIIB)V")
    public final void method1808(int arg0, int arg1, int arg2, int arg3) {
        if (!this.field1362) {
            double var5 = (double) (arg0 - this.field1380);
            double var7 = (double) (arg1 - this.field1379);
            double var9 = Math.sqrt(var5 * var5 + var7 * var7);
            this.field1374 = (double) this.field1371 * var5 / var9 + (double) this.field1380;
            this.field1375 = (double) this.field1371 * var7 / var9 + (double) this.field1379;
            this.field1376 = (double) this.field1366;
        }
        double var11 = (double) (this.field1369 + 1 - arg3);
        this.field1377 = ((double) arg0 - this.field1374) / var11;
        this.field1378 = ((double) arg1 - this.field1375) / var11;
        this.field1385 = Math.sqrt(this.field1378 * this.field1378 + this.field1377 * this.field1377);
        if (!this.field1362) {
            this.field1364 = -this.field1385 * Math.tan((double) this.field1370 * 0.02454369D);
        }
        this.field1383 = ((double) arg2 - this.field1376 - this.field1364 * var11) * 2.0D / (var11 * var11);
    }

    @ObfuscatedName("cc.q(II)V")
    public final void method1809(int arg0) {
        this.field1362 = true;
        this.field1374 += (double) arg0 * this.field1377;
        this.field1375 += (double) arg0 * this.field1378;
        this.field1376 += this.field1383 * 0.5D * (double) arg0 * (double) arg0 + (double) arg0 * this.field1364;
        this.field1364 += (double) arg0 * this.field1383;
        this.field1365 = (int) (Math.atan2(this.field1377, this.field1378) * 325.949D) + 1024 & 0x7FF;
        this.field1386 = (int) (Math.atan2(this.field1364, this.field1385) * 325.949D) & 0x7FF;
        if (this.field1381 == null) {
            return;
        }
        this.field1373 += arg0;
        while (true) {
            do {
                do {
                    if (this.field1373 <= this.field1381.field3762[this.field1384]) {
                        return;
                    }
                    this.field1373 -= this.field1381.field3762[this.field1384];
                    this.field1384++;
                } while (this.field1384 < this.field1381.field3760.length);
                this.field1384 -= this.field1381.field3764;
            } while (this.field1384 >= 0 && this.field1384 < this.field1381.field3760.length);
            this.field1384 = 0;
        }
    }

    @ObfuscatedName("cc.p(B)Lek;")
    public final class132 method1098() {
        class273 var1 = class273.method346(this.field1382);
        class132 var2 = var1.method4420(this.field1384);
        if (var2 == null) {
            return null;
        } else {
            var2.method2479(this.field1386);
            return var2;
        }
    }
}
