package deob;

@ObfuscatedName("cy")
public final class class94 extends class142 {

    @ObfuscatedName("cy.p")
    public int field1469;

    @ObfuscatedName("cy.m")
    public int field1451;

    @ObfuscatedName("cy.e")
    public int field1452;

    @ObfuscatedName("cy.t")
    public int field1454;

    @ObfuscatedName("cy.w")
    public int field1466;

    @ObfuscatedName("cy.z")
    public int field1455;

    @ObfuscatedName("cy.j")
    public int field1456;

    @ObfuscatedName("cy.i")
    public int field1453;

    @ObfuscatedName("cy.f")
    public int field1450;

    @ObfuscatedName("cy.c")
    public int field1475;

    @ObfuscatedName("cy.o")
    public int field1460;

    @ObfuscatedName("cy.q")
    public boolean field1461 = false;

    @ObfuscatedName("cy.n")
    public double field1457;

    @ObfuscatedName("cy.a")
    public double field1463;

    @ObfuscatedName("cy.g")
    public double field1464;

    @ObfuscatedName("cy.v")
    public double field1465;

    @ObfuscatedName("cy.s")
    public double field1473;

    @ObfuscatedName("cy.k")
    public double field1467;

    @ObfuscatedName("cy.r")
    public double field1458;

    @ObfuscatedName("cy.l")
    public double field1459;

    @ObfuscatedName("cy.h")
    public int field1470;

    @ObfuscatedName("cy.d")
    public int field1471;

    @ObfuscatedName("cy.x")
    public class261 field1472;

    @ObfuscatedName("cy.b")
    public int field1462 = 0;

    @ObfuscatedName("cy.y")
    public int field1474 = 0;

    public class94(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        this.field1469 = arg0;
        this.field1451 = arg1;
        this.field1452 = arg2;
        this.field1454 = arg3;
        this.field1466 = arg4;
        this.field1456 = arg5;
        this.field1453 = arg6;
        this.field1450 = arg7;
        this.field1475 = arg8;
        this.field1460 = arg9;
        this.field1455 = arg10;
        this.field1461 = false;
        int var12 = class246.method3873(this.field1469).field3336;
        if (var12 == -1) {
            this.field1472 = null;
        } else {
            this.field1472 = class261.method790(var12);
        }
    }

    @ObfuscatedName("cy.p(IIIII)V")
    public final void method1546(int arg0, int arg1, int arg2, int arg3) {
        if (!this.field1461) {
            double var5 = (double) (arg0 - this.field1452);
            double var7 = (double) (arg1 - this.field1454);
            double var9 = Math.sqrt(var5 * var5 + var7 * var7);
            this.field1457 = (double) this.field1475 * var5 / var9 + (double) this.field1452;
            this.field1463 = (double) this.field1475 * var7 / var9 + (double) this.field1454;
            this.field1464 = (double) this.field1466;
        }
        double var11 = (double) (this.field1453 + 1 - arg3);
        this.field1465 = ((double) arg0 - this.field1457) / var11;
        this.field1473 = ((double) arg1 - this.field1463) / var11;
        this.field1467 = Math.sqrt(this.field1473 * this.field1473 + this.field1465 * this.field1465);
        if (!this.field1461) {
            this.field1458 = -this.field1467 * Math.tan((double) this.field1450 * 0.02454369D);
        }
        this.field1459 = ((double) arg2 - this.field1464 - this.field1458 * var11) * 2.0D / (var11 * var11);
    }

    @ObfuscatedName("cy.m(II)V")
    public final void method1547(int arg0) {
        this.field1461 = true;
        this.field1457 += (double) arg0 * this.field1465;
        this.field1463 += (double) arg0 * this.field1473;
        this.field1464 += this.field1459 * 0.5D * (double) arg0 * (double) arg0 + (double) arg0 * this.field1458;
        this.field1458 += (double) arg0 * this.field1459;
        this.field1470 = (int) (Math.atan2(this.field1465, this.field1473) * 325.949D) + 1024 & 0x7FF;
        this.field1471 = (int) (Math.atan2(this.field1458, this.field1467) * 325.949D) & 0x7FF;
        if (this.field1472 == null) {
            return;
        }
        this.field1474 += arg0;
        while (true) {
            do {
                do {
                    if (this.field1474 <= this.field1472.field3606[this.field1462]) {
                        return;
                    }
                    this.field1474 -= this.field1472.field3606[this.field1462];
                    this.field1462++;
                } while (this.field1462 < this.field1472.field3608.length);
                this.field1462 -= this.field1472.field3613;
            } while (this.field1462 >= 0 && this.field1462 < this.field1472.field3608.length);
            this.field1462 = 0;
        }
    }

    @ObfuscatedName("cy.e(I)Les;")
    public final class134 method1001() {
        class246 var1 = class246.method3873(this.field1469);
        class134 var2 = var1.method3910(this.field1462);
        if (var2 == null) {
            return null;
        } else {
            var2.method2234(this.field1471);
            return var2;
        }
    }
}
