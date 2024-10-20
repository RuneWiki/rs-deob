package deob;

@ObfuscatedName("ce")
public final class class94 extends class142 {

    @ObfuscatedName("ce.i")
    public int field1462;

    @ObfuscatedName("ce.h")
    public int field1449;

    @ObfuscatedName("ce.u")
    public int field1450;

    @ObfuscatedName("ce.q")
    public int field1460;

    @ObfuscatedName("ce.g")
    public int field1452;

    @ObfuscatedName("ce.v")
    public int field1453;

    @ObfuscatedName("ce.t")
    public int field1451;

    @ObfuscatedName("ce.p")
    public int field1455;

    @ObfuscatedName("ce.l")
    public int field1456;

    @ObfuscatedName("ce.a")
    public int field1468;

    @ObfuscatedName("ce.k")
    public int field1458;

    @ObfuscatedName("ce.r")
    public boolean field1473 = false;

    @ObfuscatedName("ce.b")
    public double field1466;

    @ObfuscatedName("ce.x")
    public double field1461;

    @ObfuscatedName("ce.o")
    public double field1448;

    @ObfuscatedName("ce.j")
    public double field1463;

    @ObfuscatedName("ce.m")
    public double field1464;

    @ObfuscatedName("ce.d")
    public double field1465;

    @ObfuscatedName("ce.e")
    public double field1459;

    @ObfuscatedName("ce.s")
    public double field1457;

    @ObfuscatedName("ce.n")
    public int field1471;

    @ObfuscatedName("ce.y")
    public int field1469;

    @ObfuscatedName("ce.w")
    public class261 field1470;

    @ObfuscatedName("ce.f")
    public int field1454 = 0;

    @ObfuscatedName("ce.c")
    public int field1472 = 0;

    public class94(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        this.field1462 = arg0;
        this.field1449 = arg1;
        this.field1450 = arg2;
        this.field1460 = arg3;
        this.field1452 = arg4;
        this.field1451 = arg5;
        this.field1455 = arg6;
        this.field1456 = arg7;
        this.field1468 = arg8;
        this.field1458 = arg9;
        this.field1453 = arg10;
        this.field1473 = false;
        int var12 = class246.method3468(this.field1462).field3320;
        if (var12 == -1) {
            this.field1470 = null;
        } else {
            this.field1470 = class261.method2856(var12);
        }
    }

    @ObfuscatedName("ce.i(IIIII)V")
    public final void method1642(int arg0, int arg1, int arg2, int arg3) {
        if (!this.field1473) {
            double var5 = (double) (arg0 - this.field1450);
            double var7 = (double) (arg1 - this.field1460);
            double var9 = Math.sqrt(var5 * var5 + var7 * var7);
            this.field1466 = (double) this.field1468 * var5 / var9 + (double) this.field1450;
            this.field1461 = (double) this.field1468 * var7 / var9 + (double) this.field1460;
            this.field1448 = (double) this.field1452;
        }
        double var11 = (double) (this.field1455 + 1 - arg3);
        this.field1463 = ((double) arg0 - this.field1466) / var11;
        this.field1464 = ((double) arg1 - this.field1461) / var11;
        this.field1465 = Math.sqrt(this.field1464 * this.field1464 + this.field1463 * this.field1463);
        if (!this.field1473) {
            this.field1459 = -this.field1465 * Math.tan((double) this.field1456 * 0.02454369D);
        }
        this.field1457 = ((double) arg2 - this.field1448 - this.field1459 * var11) * 2.0D / (var11 * var11);
    }

    @ObfuscatedName("ce.h(IB)V")
    public final void method1646(int arg0) {
        this.field1473 = true;
        this.field1466 += (double) arg0 * this.field1463;
        this.field1461 += (double) arg0 * this.field1464;
        this.field1448 += this.field1457 * 0.5D * (double) arg0 * (double) arg0 + (double) arg0 * this.field1459;
        this.field1459 += (double) arg0 * this.field1457;
        this.field1471 = (int) (Math.atan2(this.field1463, this.field1464) * 325.949D) + 1024 & 0x7FF;
        this.field1469 = (int) (Math.atan2(this.field1459, this.field1465) * 325.949D) & 0x7FF;
        if (this.field1470 == null) {
            return;
        }
        this.field1472 += arg0;
        while (true) {
            do {
                do {
                    if (this.field1472 <= this.field1470.field3596[this.field1454]) {
                        return;
                    }
                    this.field1472 -= this.field1470.field3596[this.field1454];
                    this.field1454++;
                } while (this.field1454 < this.field1470.field3607.length);
                this.field1454 -= this.field1470.field3603;
            } while (this.field1454 >= 0 && this.field1454 < this.field1470.field3607.length);
            this.field1454 = 0;
        }
    }

    @ObfuscatedName("ce.u(I)Lew;")
    public final class134 method1053() {
        class246 var1 = class246.method3468(this.field1462);
        class134 var2 = var1.method4051(this.field1454);
        if (var2 == null) {
            return null;
        } else {
            var2.method2333(this.field1469);
            return var2;
        }
    }
}
