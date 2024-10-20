package deob;

@ObfuscatedName("ce")
public final class class94 extends class142 {

    @ObfuscatedName("ce.e")
    public int field1481;

    @ObfuscatedName("ce.o")
    public int field1466;

    @ObfuscatedName("ce.m")
    public int field1483;

    @ObfuscatedName("ce.g")
    public int field1468;

    @ObfuscatedName("ce.d")
    public int field1469;

    @ObfuscatedName("ce.b")
    public int field1470;

    @ObfuscatedName("ce.k")
    public int field1471;

    @ObfuscatedName("ce.f")
    public int field1472;

    @ObfuscatedName("ce.j")
    public int field1473;

    @ObfuscatedName("ce.q")
    public int field1474;

    @ObfuscatedName("ce.h")
    public int field1479;

    @ObfuscatedName("ce.i")
    public boolean field1476 = false;

    @ObfuscatedName("ce.s")
    public double field1477;

    @ObfuscatedName("ce.n")
    public double field1478;

    @ObfuscatedName("ce.c")
    public double field1484;

    @ObfuscatedName("ce.v")
    public double field1480;

    @ObfuscatedName("ce.u")
    public double field1467;

    @ObfuscatedName("ce.w")
    public double field1482;

    @ObfuscatedName("ce.z")
    public double field1489;

    @ObfuscatedName("ce.y")
    public double field1475;

    @ObfuscatedName("ce.p")
    public int field1491;

    @ObfuscatedName("ce.l")
    public int field1486;

    @ObfuscatedName("ce.x")
    public class261 field1487;

    @ObfuscatedName("ce.r")
    public int field1488 = 0;

    @ObfuscatedName("ce.t")
    public int field1485 = 0;

    public class94(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        this.field1481 = arg0;
        this.field1466 = arg1;
        this.field1483 = arg2;
        this.field1468 = arg3;
        this.field1469 = arg4;
        this.field1471 = arg5;
        this.field1472 = arg6;
        this.field1473 = arg7;
        this.field1474 = arg8;
        this.field1479 = arg9;
        this.field1470 = arg10;
        this.field1476 = false;
        int var12 = class246.method707(this.field1481).field3304;
        if (var12 == -1) {
            this.field1487 = null;
        } else {
            this.field1487 = class261.method2746(var12);
        }
    }

    @ObfuscatedName("ce.e(IIIII)V")
    public final void method1595(int arg0, int arg1, int arg2, int arg3) {
        if (!this.field1476) {
            double var5 = (double) (arg0 - this.field1483);
            double var7 = (double) (arg1 - this.field1468);
            double var9 = Math.sqrt(var5 * var5 + var7 * var7);
            this.field1477 = (double) this.field1474 * var5 / var9 + (double) this.field1483;
            this.field1478 = (double) this.field1474 * var7 / var9 + (double) this.field1468;
            this.field1484 = (double) this.field1469;
        }
        double var11 = (double) (this.field1472 + 1 - arg3);
        this.field1480 = ((double) arg0 - this.field1477) / var11;
        this.field1467 = ((double) arg1 - this.field1478) / var11;
        this.field1482 = Math.sqrt(this.field1480 * this.field1480 + this.field1467 * this.field1467);
        if (!this.field1476) {
            this.field1489 = -this.field1482 * Math.tan((double) this.field1473 * 0.02454369D);
        }
        this.field1475 = ((double) arg2 - this.field1484 - this.field1489 * var11) * 2.0D / (var11 * var11);
    }

    @ObfuscatedName("ce.o(II)V")
    public final void method1593(int arg0) {
        this.field1476 = true;
        this.field1477 += (double) arg0 * this.field1480;
        this.field1478 += (double) arg0 * this.field1467;
        this.field1484 += this.field1475 * 0.5D * (double) arg0 * (double) arg0 + (double) arg0 * this.field1489;
        this.field1489 += (double) arg0 * this.field1475;
        this.field1491 = (int) (Math.atan2(this.field1480, this.field1467) * 325.949D) + 1024 & 0x7FF;
        this.field1486 = (int) (Math.atan2(this.field1489, this.field1482) * 325.949D) & 0x7FF;
        if (this.field1487 == null) {
            return;
        }
        this.field1485 += arg0;
        while (true) {
            do {
                do {
                    if (this.field1485 <= this.field1487.field3588[this.field1488]) {
                        return;
                    }
                    this.field1485 -= this.field1487.field3588[this.field1488];
                    this.field1488++;
                } while (this.field1488 < this.field1487.field3587.length);
                this.field1488 -= this.field1487.field3591;
            } while (this.field1488 >= 0 && this.field1488 < this.field1487.field3587.length);
            this.field1488 = 0;
        }
    }

    @ObfuscatedName("ce.m(B)Leo;")
    public final class134 method1018() {
        class246 var1 = class246.method707(this.field1481);
        class134 var2 = var1.method3957(this.field1488);
        if (var2 == null) {
            return null;
        } else {
            var2.method2287(this.field1486);
            return var2;
        }
    }
}
