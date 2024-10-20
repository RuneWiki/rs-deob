package deob;

@ObfuscatedName("cx")
public final class class92 extends class140 {

    @ObfuscatedName("cx.w")
    public int field1468;

    @ObfuscatedName("cx.s")
    public int field1454;

    @ObfuscatedName("cx.q")
    public int field1460;

    @ObfuscatedName("cx.o")
    public int field1456;

    @ObfuscatedName("cx.g")
    public int field1472;

    @ObfuscatedName("cx.v")
    public int field1458;

    @ObfuscatedName("cx.p")
    public int field1459;

    @ObfuscatedName("cx.e")
    public int field1477;

    @ObfuscatedName("cx.d")
    public int field1469;

    @ObfuscatedName("cx.x")
    public int field1474;

    @ObfuscatedName("cx.z")
    public int field1463;

    @ObfuscatedName("cx.n")
    public boolean field1464 = false;

    @ObfuscatedName("cx.u")
    public double field1465;

    @ObfuscatedName("cx.t")
    public double field1466;

    @ObfuscatedName("cx.a")
    public double field1467;

    @ObfuscatedName("cx.i")
    public double field1473;

    @ObfuscatedName("cx.h")
    public double field1455;

    @ObfuscatedName("cx.b")
    public double field1470;

    @ObfuscatedName("cx.j")
    public double field1471;

    @ObfuscatedName("cx.y")
    public double field1453;

    @ObfuscatedName("cx.k")
    public int field1457;

    @ObfuscatedName("cx.c")
    public int field1461;

    @ObfuscatedName("cx.r")
    public class261 field1462;

    @ObfuscatedName("cx.m")
    public int field1476 = 0;

    @ObfuscatedName("cx.l")
    public int field1475 = 0;

    public class92(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        this.field1468 = arg0;
        this.field1454 = arg1;
        this.field1460 = arg2;
        this.field1456 = arg3;
        this.field1472 = arg4;
        this.field1459 = arg5;
        this.field1477 = arg6;
        this.field1469 = arg7;
        this.field1474 = arg8;
        this.field1463 = arg9;
        this.field1458 = arg10;
        this.field1464 = false;
        int var12 = class246.method4062(this.field1468).field3326;
        if (var12 == -1) {
            this.field1462 = null;
        } else {
            this.field1462 = class261.method4424(var12);
        }
    }

    @ObfuscatedName("cx.w(IIIII)V")
    public final void method1648(int arg0, int arg1, int arg2, int arg3) {
        if (!this.field1464) {
            double var5 = (double) (arg0 - this.field1460);
            double var7 = (double) (arg1 - this.field1456);
            double var9 = Math.sqrt(var5 * var5 + var7 * var7);
            this.field1465 = (double) this.field1474 * var5 / var9 + (double) this.field1460;
            this.field1466 = (double) this.field1474 * var7 / var9 + (double) this.field1456;
            this.field1467 = (double) this.field1472;
        }
        double var11 = (double) (this.field1477 + 1 - arg3);
        this.field1473 = ((double) arg0 - this.field1465) / var11;
        this.field1455 = ((double) arg1 - this.field1466) / var11;
        this.field1470 = Math.sqrt(this.field1473 * this.field1473 + this.field1455 * this.field1455);
        if (!this.field1464) {
            this.field1471 = -this.field1470 * Math.tan((double) this.field1469 * 0.02454369D);
        }
        this.field1453 = ((double) arg2 - this.field1467 - this.field1471 * var11) * 2.0D / (var11 * var11);
    }

    @ObfuscatedName("cx.s(IS)V")
    public final void method1649(int arg0) {
        this.field1464 = true;
        this.field1465 += (double) arg0 * this.field1473;
        this.field1466 += (double) arg0 * this.field1455;
        this.field1467 += this.field1453 * 0.5D * (double) arg0 * (double) arg0 + (double) arg0 * this.field1471;
        this.field1471 += (double) arg0 * this.field1453;
        this.field1457 = (int) (Math.atan2(this.field1473, this.field1455) * 325.949D) + 1024 & 0x7FF;
        this.field1461 = (int) (Math.atan2(this.field1471, this.field1470) * 325.949D) & 0x7FF;
        if (this.field1462 == null) {
            return;
        }
        this.field1475 += arg0;
        while (true) {
            do {
                do {
                    if (this.field1475 <= this.field1462.field3609[this.field1476]) {
                        return;
                    }
                    this.field1475 -= this.field1462.field3609[this.field1476];
                    this.field1476++;
                } while (this.field1476 < this.field1462.field3607.length);
                this.field1476 -= this.field1462.field3611;
            } while (this.field1476 >= 0 && this.field1476 < this.field1462.field3607.length);
            this.field1476 = 0;
        }
    }

    @ObfuscatedName("cx.q(B)Leh;")
    public final class132 method1030() {
        class246 var1 = class246.method4062(this.field1468);
        class132 var2 = var1.method4074(this.field1476);
        if (var2 == null) {
            return null;
        } else {
            var2.method2382(this.field1461);
            return var2;
        }
    }
}
