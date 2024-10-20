package deob;

@ObfuscatedName("cy")
public final class class94 extends class142 {

    @ObfuscatedName("cy.w")
    public int field1484;

    @ObfuscatedName("cy.o")
    public int field1472;

    @ObfuscatedName("cy.x")
    public int field1471;

    @ObfuscatedName("cy.k")
    public int field1495;

    @ObfuscatedName("cy.f")
    public int field1481;

    @ObfuscatedName("cy.i")
    public int field1474;

    @ObfuscatedName("cy.j")
    public int field1475;

    @ObfuscatedName("cy.m")
    public int field1476;

    @ObfuscatedName("cy.u")
    public int field1477;

    @ObfuscatedName("cy.r")
    public int field1478;

    @ObfuscatedName("cy.v")
    public int field1479;

    @ObfuscatedName("cy.h")
    public boolean field1480 = false;

    @ObfuscatedName("cy.a")
    public double field1490;

    @ObfuscatedName("cy.p")
    public double field1482;

    @ObfuscatedName("cy.q")
    public double field1485;

    @ObfuscatedName("cy.l")
    public double field1470;

    @ObfuscatedName("cy.c")
    public double field1493;

    @ObfuscatedName("cy.n")
    public double field1486;

    @ObfuscatedName("cy.z")
    public double field1483;

    @ObfuscatedName("cy.e")
    public double field1488;

    @ObfuscatedName("cy.g")
    public int field1489;

    @ObfuscatedName("cy.d")
    public int field1491;

    @ObfuscatedName("cy.y")
    public class264 field1494;

    @ObfuscatedName("cy.t")
    public int field1492 = 0;

    @ObfuscatedName("cy.b")
    public int field1469 = 0;

    public class94(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        this.field1484 = arg0;
        this.field1472 = arg1;
        this.field1471 = arg2;
        this.field1495 = arg3;
        this.field1481 = arg4;
        this.field1475 = arg5;
        this.field1476 = arg6;
        this.field1477 = arg7;
        this.field1478 = arg8;
        this.field1479 = arg9;
        this.field1474 = arg10;
        this.field1480 = false;
        int var12 = Statics.method3709(this.field1484).field3345;
        if (var12 == -1) {
            this.field1494 = null;
        } else {
            this.field1494 = class264.method3098(var12);
        }
    }

    @ObfuscatedName("cy.w(IIIII)V")
    public final void method1599(int arg0, int arg1, int arg2, int arg3) {
        if (!this.field1480) {
            double var5 = (double) (arg0 - this.field1471);
            double var7 = (double) (arg1 - this.field1495);
            double var9 = Math.sqrt(var5 * var5 + var7 * var7);
            this.field1490 = (double) this.field1478 * var5 / var9 + (double) this.field1471;
            this.field1482 = (double) this.field1478 * var7 / var9 + (double) this.field1495;
            this.field1485 = (double) this.field1481;
        }
        double var11 = (double) (this.field1476 + 1 - arg3);
        this.field1470 = ((double) arg0 - this.field1490) / var11;
        this.field1493 = ((double) arg1 - this.field1482) / var11;
        this.field1486 = Math.sqrt(this.field1493 * this.field1493 + this.field1470 * this.field1470);
        if (!this.field1480) {
            this.field1483 = -this.field1486 * Math.tan((double) this.field1477 * 0.02454369D);
        }
        this.field1488 = ((double) arg2 - this.field1485 - this.field1483 * var11) * 2.0D / (var11 * var11);
    }

    @ObfuscatedName("cy.o(IS)V")
    public final void method1597(int arg0) {
        this.field1480 = true;
        this.field1490 += (double) arg0 * this.field1470;
        this.field1482 += (double) arg0 * this.field1493;
        this.field1485 += this.field1488 * 0.5D * (double) arg0 * (double) arg0 + (double) arg0 * this.field1483;
        this.field1483 += (double) arg0 * this.field1488;
        this.field1489 = (int) (Math.atan2(this.field1470, this.field1493) * 325.949D) + 1024 & 0x7FF;
        this.field1491 = (int) (Math.atan2(this.field1483, this.field1486) * 325.949D) & 0x7FF;
        if (this.field1494 == null) {
            return;
        }
        this.field1469 += arg0;
        while (true) {
            do {
                do {
                    if (this.field1469 <= this.field1494.field3622[this.field1492]) {
                        return;
                    }
                    this.field1469 -= this.field1494.field3622[this.field1492];
                    this.field1492++;
                } while (this.field1492 < this.field1494.field3620.length);
                this.field1492 -= this.field1494.field3624;
            } while (this.field1492 >= 0 && this.field1492 < this.field1494.field3620.length);
            this.field1492 = 0;
        }
    }

    @ObfuscatedName("cy.x(I)Lev;")
    public final class134 method1017() {
        class249 var1 = Statics.method3709(this.field1484);
        class134 var2 = var1.method3940(this.field1492);
        if (var2 == null) {
            return null;
        } else {
            var2.method2289(this.field1491);
            return var2;
        }
    }
}
