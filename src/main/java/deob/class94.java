package deob;

@ObfuscatedName("cu")
public final class class94 extends class142 {

    @ObfuscatedName("cu.n")
    public int field1469;

    @ObfuscatedName("cu.p")
    public int field1455;

    @ObfuscatedName("cu.i")
    public int field1456;

    @ObfuscatedName("cu.j")
    public int field1477;

    @ObfuscatedName("cu.f")
    public int field1458;

    @ObfuscatedName("cu.m")
    public int field1474;

    @ObfuscatedName("cu.c")
    public int field1464;

    @ObfuscatedName("cu.z")
    public int field1461;

    @ObfuscatedName("cu.h")
    public int field1462;

    @ObfuscatedName("cu.g")
    public int field1463;

    @ObfuscatedName("cu.e")
    public int field1459;

    @ObfuscatedName("cu.o")
    public boolean field1465 = false;

    @ObfuscatedName("cu.x")
    public double field1466;

    @ObfuscatedName("cu.a")
    public double field1460;

    @ObfuscatedName("cu.y")
    public double field1468;

    @ObfuscatedName("cu.r")
    public double field1472;

    @ObfuscatedName("cu.b")
    public double field1470;

    @ObfuscatedName("cu.s")
    public double field1471;

    @ObfuscatedName("cu.v")
    public double field1454;

    @ObfuscatedName("cu.t")
    public double field1480;

    @ObfuscatedName("cu.w")
    public int field1457;

    @ObfuscatedName("cu.l")
    public int field1475;

    @ObfuscatedName("cu.q")
    public class261 field1476;

    @ObfuscatedName("cu.k")
    public int field1473 = 0;

    @ObfuscatedName("cu.d")
    public int field1478 = 0;

    public class94(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        this.field1469 = arg0;
        this.field1455 = arg1;
        this.field1456 = arg2;
        this.field1477 = arg3;
        this.field1458 = arg4;
        this.field1464 = arg5;
        this.field1461 = arg6;
        this.field1462 = arg7;
        this.field1463 = arg8;
        this.field1459 = arg9;
        this.field1474 = arg10;
        this.field1465 = false;
        int var12 = class246.method1711(this.field1469).field3341;
        if (var12 == -1) {
            this.field1476 = null;
        } else {
            this.field1476 = class261.method2887(var12);
        }
    }

    @ObfuscatedName("cu.n(IIIII)V")
    public final void method1602(int arg0, int arg1, int arg2, int arg3) {
        if (!this.field1465) {
            double var5 = (double) (arg0 - this.field1456);
            double var7 = (double) (arg1 - this.field1477);
            double var9 = Math.sqrt(var5 * var5 + var7 * var7);
            this.field1466 = (double) this.field1463 * var5 / var9 + (double) this.field1456;
            this.field1460 = (double) this.field1463 * var7 / var9 + (double) this.field1477;
            this.field1468 = (double) this.field1458;
        }
        double var11 = (double) (this.field1461 + 1 - arg3);
        this.field1472 = ((double) arg0 - this.field1466) / var11;
        this.field1470 = ((double) arg1 - this.field1460) / var11;
        this.field1471 = Math.sqrt(this.field1472 * this.field1472 + this.field1470 * this.field1470);
        if (!this.field1465) {
            this.field1454 = -this.field1471 * Math.tan((double) this.field1462 * 0.02454369D);
        }
        this.field1480 = ((double) arg2 - this.field1468 - this.field1454 * var11) * 2.0D / (var11 * var11);
    }

    @ObfuscatedName("cu.p(II)V")
    public final void method1603(int arg0) {
        this.field1465 = true;
        this.field1466 += (double) arg0 * this.field1472;
        this.field1460 += (double) arg0 * this.field1470;
        this.field1468 += this.field1480 * 0.5D * (double) arg0 * (double) arg0 + (double) arg0 * this.field1454;
        this.field1454 += (double) arg0 * this.field1480;
        this.field1457 = (int) (Math.atan2(this.field1472, this.field1470) * 325.949D) + 1024 & 0x7FF;
        this.field1475 = (int) (Math.atan2(this.field1454, this.field1471) * 325.949D) & 0x7FF;
        if (this.field1476 == null) {
            return;
        }
        this.field1478 += arg0;
        while (true) {
            do {
                do {
                    if (this.field1478 <= this.field1476.field3615[this.field1473]) {
                        return;
                    }
                    this.field1478 -= this.field1476.field3615[this.field1473];
                    this.field1473++;
                } while (this.field1473 < this.field1476.field3617.length);
                this.field1473 -= this.field1476.field3608;
            } while (this.field1473 >= 0 && this.field1473 < this.field1476.field3617.length);
            this.field1473 = 0;
        }
    }

    @ObfuscatedName("cu.i(S)Lek;")
    public final class134 method1012() {
        class246 var1 = class246.method1711(this.field1469);
        class134 var2 = var1.method4048(this.field1473);
        if (var2 == null) {
            return null;
        } else {
            var2.method2334(this.field1475);
            return var2;
        }
    }
}
