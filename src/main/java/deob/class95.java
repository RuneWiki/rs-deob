package deob;

@ObfuscatedName("cw")
public final class class95 extends class143 {

    @ObfuscatedName("cw.j")
    public int field1472;

    @ObfuscatedName("cw.h")
    public int field1469;

    @ObfuscatedName("cw.f")
    public int field1470;

    @ObfuscatedName("cw.p")
    public int field1471;

    @ObfuscatedName("cw.x")
    public int field1487;

    @ObfuscatedName("cw.g")
    public int field1473;

    @ObfuscatedName("cw.c")
    public int field1474;

    @ObfuscatedName("cw.l")
    public int field1475;

    @ObfuscatedName("cw.w")
    public int field1485;

    @ObfuscatedName("cw.b")
    public int field1477;

    @ObfuscatedName("cw.o")
    public int field1478;

    @ObfuscatedName("cw.m")
    public boolean field1479 = false;

    @ObfuscatedName("cw.i")
    public double field1480;

    @ObfuscatedName("cw.s")
    public double field1481;

    @ObfuscatedName("cw.r")
    public double field1482;

    @ObfuscatedName("cw.e")
    public double field1483;

    @ObfuscatedName("cw.a")
    public double field1484;

    @ObfuscatedName("cw.v")
    public double field1492;

    @ObfuscatedName("cw.t")
    public double field1486;

    @ObfuscatedName("cw.y")
    public double field1493;

    @ObfuscatedName("cw.z")
    public int field1491;

    @ObfuscatedName("cw.u")
    public int field1476;

    @ObfuscatedName("cw.k")
    public class262 field1490;

    @ObfuscatedName("cw.q")
    public int field1468 = 0;

    @ObfuscatedName("cw.n")
    public int field1488 = 0;

    public class95(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        this.field1472 = arg0;
        this.field1469 = arg1;
        this.field1470 = arg2;
        this.field1471 = arg3;
        this.field1487 = arg4;
        this.field1474 = arg5;
        this.field1475 = arg6;
        this.field1485 = arg7;
        this.field1477 = arg8;
        this.field1478 = arg9;
        this.field1473 = arg10;
        this.field1479 = false;
        int var12 = class247.method473(this.field1472).field3317;
        if (var12 == -1) {
            this.field1490 = null;
        } else {
            this.field1490 = class262.method1389(var12);
        }
    }

    @ObfuscatedName("cw.j(IIIIB)V")
    public final void method1617(int arg0, int arg1, int arg2, int arg3) {
        if (!this.field1479) {
            double var5 = (double) (arg0 - this.field1470);
            double var7 = (double) (arg1 - this.field1471);
            double var9 = Math.sqrt(var5 * var5 + var7 * var7);
            this.field1480 = (double) this.field1477 * var5 / var9 + (double) this.field1470;
            this.field1481 = (double) this.field1477 * var7 / var9 + (double) this.field1471;
            this.field1482 = (double) this.field1487;
        }
        double var11 = (double) (this.field1475 + 1 - arg3);
        this.field1483 = ((double) arg0 - this.field1480) / var11;
        this.field1484 = ((double) arg1 - this.field1481) / var11;
        this.field1492 = Math.sqrt(this.field1484 * this.field1484 + this.field1483 * this.field1483);
        if (!this.field1479) {
            this.field1486 = -this.field1492 * Math.tan((double) this.field1485 * 0.02454369D);
        }
        this.field1493 = ((double) arg2 - this.field1482 - this.field1486 * var11) * 2.0D / (var11 * var11);
    }

    @ObfuscatedName("cw.h(II)V")
    public final void method1618(int arg0) {
        this.field1479 = true;
        this.field1480 += (double) arg0 * this.field1483;
        this.field1481 += (double) arg0 * this.field1484;
        this.field1482 += this.field1493 * 0.5D * (double) arg0 * (double) arg0 + (double) arg0 * this.field1486;
        this.field1486 += (double) arg0 * this.field1493;
        this.field1491 = (int) (Math.atan2(this.field1483, this.field1484) * 325.949D) + 1024 & 0x7FF;
        this.field1476 = (int) (Math.atan2(this.field1486, this.field1492) * 325.949D) & 0x7FF;
        if (this.field1490 == null) {
            return;
        }
        this.field1488 += arg0;
        while (true) {
            do {
                do {
                    if (this.field1488 <= this.field1490.field3596[this.field1468]) {
                        return;
                    }
                    this.field1488 -= this.field1490.field3596[this.field1468];
                    this.field1468++;
                } while (this.field1468 < this.field1490.field3595.length);
                this.field1468 -= this.field1490.field3592;
            } while (this.field1468 >= 0 && this.field1468 < this.field1490.field3595.length);
            this.field1468 = 0;
        }
    }

    @ObfuscatedName("cw.f(I)Leo;")
    public final class135 method1077() {
        class247 var1 = class247.method473(this.field1472);
        class135 var2 = var1.method4012(this.field1468);
        if (var2 == null) {
            return null;
        } else {
            var2.method2314(this.field1476);
            return var2;
        }
    }
}
