package deob;

@ObfuscatedName("ck")
public final class class95 extends class143 {

    @ObfuscatedName("ck.e")
    public int field1458;

    @ObfuscatedName("ck.n")
    public int field1455;

    @ObfuscatedName("ck.g")
    public int field1460;

    @ObfuscatedName("ck.y")
    public int field1457;

    @ObfuscatedName("ck.w")
    public int field1470;

    @ObfuscatedName("ck.k")
    public int field1459;

    @ObfuscatedName("ck.v")
    public int field1476;

    @ObfuscatedName("ck.z")
    public int field1469;

    @ObfuscatedName("ck.r")
    public int field1468;

    @ObfuscatedName("ck.u")
    public int field1463;

    @ObfuscatedName("ck.d")
    public int field1464;

    @ObfuscatedName("ck.o")
    public boolean field1465 = false;

    @ObfuscatedName("ck.l")
    public double field1478;

    @ObfuscatedName("ck.h")
    public double field1467;

    @ObfuscatedName("ck.s")
    public double field1462;

    @ObfuscatedName("ck.c")
    public double field1456;

    @ObfuscatedName("ck.m")
    public double field1471;

    @ObfuscatedName("ck.a")
    public double field1466;

    @ObfuscatedName("ck.t")
    public double field1472;

    @ObfuscatedName("ck.p")
    public double field1473;

    @ObfuscatedName("ck.f")
    public int field1474;

    @ObfuscatedName("ck.b")
    public int field1475;

    @ObfuscatedName("ck.x")
    public class262 field1461;

    @ObfuscatedName("ck.i")
    public int field1477 = 0;

    @ObfuscatedName("ck.j")
    public int field1454 = 0;

    public class95(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        this.field1458 = arg0;
        this.field1455 = arg1;
        this.field1460 = arg2;
        this.field1457 = arg3;
        this.field1470 = arg4;
        this.field1476 = arg5;
        this.field1469 = arg6;
        this.field1468 = arg7;
        this.field1463 = arg8;
        this.field1464 = arg9;
        this.field1459 = arg10;
        this.field1465 = false;
        int var12 = class247.method891(this.field1458).field3332;
        if (var12 == -1) {
            this.field1461 = null;
        } else {
            this.field1461 = class262.method1025(var12);
        }
    }

    @ObfuscatedName("ck.e(IIIII)V")
    public final void method1656(int arg0, int arg1, int arg2, int arg3) {
        if (!this.field1465) {
            double var5 = (double) (arg0 - this.field1460);
            double var7 = (double) (arg1 - this.field1457);
            double var9 = Math.sqrt(var5 * var5 + var7 * var7);
            this.field1478 = (double) this.field1463 * var5 / var9 + (double) this.field1460;
            this.field1467 = (double) this.field1463 * var7 / var9 + (double) this.field1457;
            this.field1462 = (double) this.field1470;
        }
        double var11 = (double) (this.field1469 + 1 - arg3);
        this.field1456 = ((double) arg0 - this.field1478) / var11;
        this.field1471 = ((double) arg1 - this.field1467) / var11;
        this.field1466 = Math.sqrt(this.field1471 * this.field1471 + this.field1456 * this.field1456);
        if (!this.field1465) {
            this.field1472 = -this.field1466 * Math.tan((double) this.field1468 * 0.02454369D);
        }
        this.field1473 = ((double) arg2 - this.field1462 - this.field1472 * var11) * 2.0D / (var11 * var11);
    }

    @ObfuscatedName("ck.n(II)V")
    public final void method1651(int arg0) {
        this.field1465 = true;
        this.field1478 += (double) arg0 * this.field1456;
        this.field1467 += (double) arg0 * this.field1471;
        this.field1462 += this.field1473 * 0.5D * (double) arg0 * (double) arg0 + (double) arg0 * this.field1472;
        this.field1472 += (double) arg0 * this.field1473;
        this.field1474 = (int) (Math.atan2(this.field1456, this.field1471) * 325.949D) + 1024 & 0x7FF;
        this.field1475 = (int) (Math.atan2(this.field1472, this.field1466) * 325.949D) & 0x7FF;
        if (this.field1461 == null) {
            return;
        }
        this.field1454 += arg0;
        while (true) {
            do {
                do {
                    if (this.field1454 <= this.field1461.field3599[this.field1477]) {
                        return;
                    }
                    this.field1454 -= this.field1461.field3599[this.field1477];
                    this.field1477++;
                } while (this.field1477 < this.field1461.field3596.length);
                this.field1477 -= this.field1461.field3601;
            } while (this.field1477 >= 0 && this.field1477 < this.field1461.field3596.length);
            this.field1477 = 0;
        }
    }

    @ObfuscatedName("ck.g(I)Lew;")
    public final class135 method1081() {
        class247 var1 = class247.method891(this.field1458);
        class135 var2 = var1.method4024(this.field1477);
        if (var2 == null) {
            return null;
        } else {
            var2.method2330(this.field1475);
            return var2;
        }
    }
}
