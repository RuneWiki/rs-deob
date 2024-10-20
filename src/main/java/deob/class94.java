package deob;

@ObfuscatedName("cu")
public final class class94 extends class142 {

    @ObfuscatedName("cu.i")
    public int field1474;

    @ObfuscatedName("cu.c")
    public int field1480;

    @ObfuscatedName("cu.e")
    public int field1489;

    @ObfuscatedName("cu.v")
    public int field1475;

    @ObfuscatedName("cu.b")
    public int field1476;

    @ObfuscatedName("cu.y")
    public int field1477;

    @ObfuscatedName("cu.h")
    public int field1478;

    @ObfuscatedName("cu.x")
    public int field1472;

    @ObfuscatedName("cu.f")
    public int field1479;

    @ObfuscatedName("cu.n")
    public int field1481;

    @ObfuscatedName("cu.a")
    public int field1482;

    @ObfuscatedName("cu.o")
    public boolean field1488 = false;

    @ObfuscatedName("cu.z")
    public double field1484;

    @ObfuscatedName("cu.q")
    public double field1483;

    @ObfuscatedName("cu.j")
    public double field1486;

    @ObfuscatedName("cu.k")
    public double field1487;

    @ObfuscatedName("cu.r")
    public double field1497;

    @ObfuscatedName("cu.m")
    public double field1485;

    @ObfuscatedName("cu.d")
    public double field1490;

    @ObfuscatedName("cu.s")
    public double field1491;

    @ObfuscatedName("cu.g")
    public int field1492;

    @ObfuscatedName("cu.w")
    public int field1493;

    @ObfuscatedName("cu.p")
    public class261 field1494;

    @ObfuscatedName("cu.l")
    public int field1495 = 0;

    @ObfuscatedName("cu.u")
    public int field1496 = 0;

    public class94(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        this.field1474 = arg0;
        this.field1480 = arg1;
        this.field1489 = arg2;
        this.field1475 = arg3;
        this.field1476 = arg4;
        this.field1478 = arg5;
        this.field1472 = arg6;
        this.field1479 = arg7;
        this.field1481 = arg8;
        this.field1482 = arg9;
        this.field1477 = arg10;
        this.field1488 = false;
        int var12 = class246.method1412(this.field1474).field3327;
        if (var12 == -1) {
            this.field1494 = null;
        } else {
            this.field1494 = class261.method3748(var12);
        }
    }

    @ObfuscatedName("cu.i(IIIII)V")
    public final void method1599(int arg0, int arg1, int arg2, int arg3) {
        if (!this.field1488) {
            double var5 = (double) (arg0 - this.field1489);
            double var7 = (double) (arg1 - this.field1475);
            double var9 = Math.sqrt(var5 * var5 + var7 * var7);
            this.field1484 = (double) this.field1481 * var5 / var9 + (double) this.field1489;
            this.field1483 = (double) this.field1481 * var7 / var9 + (double) this.field1475;
            this.field1486 = (double) this.field1476;
        }
        double var11 = (double) (this.field1472 + 1 - arg3);
        this.field1487 = ((double) arg0 - this.field1484) / var11;
        this.field1497 = ((double) arg1 - this.field1483) / var11;
        this.field1485 = Math.sqrt(this.field1497 * this.field1497 + this.field1487 * this.field1487);
        if (!this.field1488) {
            this.field1490 = -this.field1485 * Math.tan((double) this.field1479 * 0.02454369D);
        }
        this.field1491 = ((double) arg2 - this.field1486 - this.field1490 * var11) * 2.0D / (var11 * var11);
    }

    @ObfuscatedName("cu.c(II)V")
    public final void method1604(int arg0) {
        this.field1488 = true;
        this.field1484 += (double) arg0 * this.field1487;
        this.field1483 += (double) arg0 * this.field1497;
        this.field1486 += this.field1491 * 0.5D * (double) arg0 * (double) arg0 + (double) arg0 * this.field1490;
        this.field1490 += (double) arg0 * this.field1491;
        this.field1492 = (int) (Math.atan2(this.field1487, this.field1497) * 325.949D) + 1024 & 0x7FF;
        this.field1493 = (int) (Math.atan2(this.field1490, this.field1485) * 325.949D) & 0x7FF;
        if (this.field1494 == null) {
            return;
        }
        this.field1496 += arg0;
        while (true) {
            do {
                do {
                    if (this.field1496 <= this.field1494.field3605[this.field1495]) {
                        return;
                    }
                    this.field1496 -= this.field1494.field3605[this.field1495];
                    this.field1495++;
                } while (this.field1495 < this.field1494.field3600.length);
                this.field1495 -= this.field1494.field3607;
            } while (this.field1495 >= 0 && this.field1495 < this.field1494.field3600.length);
            this.field1495 = 0;
        }
    }

    @ObfuscatedName("cu.e(I)Led;")
    public final class134 method1026() {
        class246 var1 = class246.method1412(this.field1474);
        class134 var2 = var1.method3990(this.field1495);
        if (var2 == null) {
            return null;
        } else {
            var2.method2298(this.field1493);
            return var2;
        }
    }
}
