package deob;

@ObfuscatedName("cg")
public final class class93 extends class141 {

    @ObfuscatedName("cg.i")
    public int field1469;

    @ObfuscatedName("cg.j")
    public int field1470;

    @ObfuscatedName("cg.a")
    public int field1471;

    @ObfuscatedName("cg.r")
    public int field1472;

    @ObfuscatedName("cg.o")
    public int field1494;

    @ObfuscatedName("cg.n")
    public int field1474;

    @ObfuscatedName("cg.q")
    public int field1475;

    @ObfuscatedName("cg.b")
    public int field1482;

    @ObfuscatedName("cg.k")
    public int field1477;

    @ObfuscatedName("cg.s")
    public int field1478;

    @ObfuscatedName("cg.d")
    public int field1479;

    @ObfuscatedName("cg.l")
    public boolean field1480 = false;

    @ObfuscatedName("cg.t")
    public double field1473;

    @ObfuscatedName("cg.y")
    public double field1489;

    @ObfuscatedName("cg.v")
    public double field1493;

    @ObfuscatedName("cg.c")
    public double field1484;

    @ObfuscatedName("cg.z")
    public double field1485;

    @ObfuscatedName("cg.u")
    public double field1488;

    @ObfuscatedName("cg.e")
    public double field1483;

    @ObfuscatedName("cg.p")
    public double field1487;

    @ObfuscatedName("cg.m")
    public int field1481;

    @ObfuscatedName("cg.x")
    public int field1490;

    @ObfuscatedName("cg.h")
    public class262 field1491;

    @ObfuscatedName("cg.f")
    public int field1492 = 0;

    @ObfuscatedName("cg.g")
    public int field1476 = 0;

    public class93(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        this.field1469 = arg0;
        this.field1470 = arg1;
        this.field1471 = arg2;
        this.field1472 = arg3;
        this.field1494 = arg4;
        this.field1475 = arg5;
        this.field1482 = arg6;
        this.field1477 = arg7;
        this.field1478 = arg8;
        this.field1479 = arg9;
        this.field1474 = arg10;
        this.field1480 = false;
        int var12 = class247.method80(this.field1469).field3333;
        if (var12 == -1) {
            this.field1491 = null;
        } else {
            this.field1491 = class262.method3737(var12);
        }
    }

    @ObfuscatedName("cg.i(IIIII)V")
    public final void method1620(int arg0, int arg1, int arg2, int arg3) {
        if (!this.field1480) {
            double var5 = (double) (arg0 - this.field1471);
            double var7 = (double) (arg1 - this.field1472);
            double var9 = Math.sqrt(var5 * var5 + var7 * var7);
            this.field1473 = (double) this.field1478 * var5 / var9 + (double) this.field1471;
            this.field1489 = (double) this.field1478 * var7 / var9 + (double) this.field1472;
            this.field1493 = (double) this.field1494;
        }
        double var11 = (double) (this.field1482 + 1 - arg3);
        this.field1484 = ((double) arg0 - this.field1473) / var11;
        this.field1485 = ((double) arg1 - this.field1489) / var11;
        this.field1488 = Math.sqrt(this.field1485 * this.field1485 + this.field1484 * this.field1484);
        if (!this.field1480) {
            this.field1483 = -this.field1488 * Math.tan((double) this.field1477 * 0.02454369D);
        }
        this.field1487 = ((double) arg2 - this.field1493 - this.field1483 * var11) * 2.0D / (var11 * var11);
    }

    @ObfuscatedName("cg.j(II)V")
    public final void method1621(int arg0) {
        this.field1480 = true;
        this.field1473 += (double) arg0 * this.field1484;
        this.field1489 += (double) arg0 * this.field1485;
        this.field1493 += this.field1487 * 0.5D * (double) arg0 * (double) arg0 + (double) arg0 * this.field1483;
        this.field1483 += (double) arg0 * this.field1487;
        this.field1481 = (int) (Math.atan2(this.field1484, this.field1485) * 325.949D) + 1024 & 0x7FF;
        this.field1490 = (int) (Math.atan2(this.field1483, this.field1488) * 325.949D) & 0x7FF;
        if (this.field1491 == null) {
            return;
        }
        this.field1476 += arg0;
        while (true) {
            do {
                do {
                    if (this.field1476 <= this.field1491.field3604[this.field1492]) {
                        return;
                    }
                    this.field1476 -= this.field1491.field3604[this.field1492];
                    this.field1492++;
                } while (this.field1492 < this.field1491.field3614.length);
                this.field1492 -= this.field1491.field3605;
            } while (this.field1492 >= 0 && this.field1492 < this.field1491.field3614.length);
            this.field1492 = 0;
        }
    }

    @ObfuscatedName("cg.a(I)Lem;")
    public final class133 method1038() {
        class247 var1 = class247.method80(this.field1469);
        class133 var2 = var1.method4017(this.field1492);
        if (var2 == null) {
            return null;
        } else {
            var2.method2320(this.field1490);
            return var2;
        }
    }
}
