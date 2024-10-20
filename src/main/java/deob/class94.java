package deob;

@ObfuscatedName("ci")
public final class class94 extends class142 {

    @ObfuscatedName("ci.a")
    public int field1474;

    @ObfuscatedName("ci.j")
    public int field1451;

    @ObfuscatedName("ci.n")
    public int field1477;

    @ObfuscatedName("ci.r")
    public int field1453;

    @ObfuscatedName("ci.v")
    public int field1454;

    @ObfuscatedName("ci.e")
    public int field1455;

    @ObfuscatedName("ci.l")
    public int field1456;

    @ObfuscatedName("ci.s")
    public int field1457;

    @ObfuscatedName("ci.w")
    public int field1450;

    @ObfuscatedName("ci.p")
    public int field1470;

    @ObfuscatedName("ci.m")
    public int field1460;

    @ObfuscatedName("ci.u")
    public boolean field1461 = false;

    @ObfuscatedName("ci.g")
    public double field1462;

    @ObfuscatedName("ci.k")
    public double field1463;

    @ObfuscatedName("ci.t")
    public double field1464;

    @ObfuscatedName("ci.c")
    public double field1459;

    @ObfuscatedName("ci.o")
    public double field1475;

    @ObfuscatedName("ci.x")
    public double field1465;

    @ObfuscatedName("ci.f")
    public double field1468;

    @ObfuscatedName("ci.h")
    public double field1473;

    @ObfuscatedName("ci.z")
    public int field1467;

    @ObfuscatedName("ci.i")
    public int field1469;

    @ObfuscatedName("ci.d")
    public class261 field1472;

    @ObfuscatedName("ci.b")
    public int field1471 = 0;

    @ObfuscatedName("ci.q")
    public int field1466 = 0;

    public class94(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        this.field1474 = arg0;
        this.field1451 = arg1;
        this.field1477 = arg2;
        this.field1453 = arg3;
        this.field1454 = arg4;
        this.field1456 = arg5;
        this.field1457 = arg6;
        this.field1450 = arg7;
        this.field1470 = arg8;
        this.field1460 = arg9;
        this.field1455 = arg10;
        this.field1461 = false;
        int var12 = class246.method3901(this.field1474).field3330;
        if (var12 == -1) {
            this.field1472 = null;
        } else {
            this.field1472 = class261.method1884(var12);
        }
    }

    @ObfuscatedName("ci.a(IIIII)V")
    public final void method1581(int arg0, int arg1, int arg2, int arg3) {
        if (!this.field1461) {
            double var5 = (double) (arg0 - this.field1477);
            double var7 = (double) (arg1 - this.field1453);
            double var9 = Math.sqrt(var5 * var5 + var7 * var7);
            this.field1462 = (double) this.field1470 * var5 / var9 + (double) this.field1477;
            this.field1463 = (double) this.field1470 * var7 / var9 + (double) this.field1453;
            this.field1464 = (double) this.field1454;
        }
        double var11 = (double) (this.field1457 + 1 - arg3);
        this.field1459 = ((double) arg0 - this.field1462) / var11;
        this.field1475 = ((double) arg1 - this.field1463) / var11;
        this.field1465 = Math.sqrt(this.field1475 * this.field1475 + this.field1459 * this.field1459);
        if (!this.field1461) {
            this.field1468 = -this.field1465 * Math.tan((double) this.field1450 * 0.02454369D);
        }
        this.field1473 = ((double) arg2 - this.field1464 - this.field1468 * var11) * 2.0D / (var11 * var11);
    }

    @ObfuscatedName("ci.j(II)V")
    public final void method1582(int arg0) {
        this.field1461 = true;
        this.field1462 += (double) arg0 * this.field1459;
        this.field1463 += (double) arg0 * this.field1475;
        this.field1464 += this.field1473 * 0.5D * (double) arg0 * (double) arg0 + (double) arg0 * this.field1468;
        this.field1468 += (double) arg0 * this.field1473;
        this.field1467 = (int) (Math.atan2(this.field1459, this.field1475) * 325.949D) + 1024 & 0x7FF;
        this.field1469 = (int) (Math.atan2(this.field1468, this.field1465) * 325.949D) & 0x7FF;
        if (this.field1472 == null) {
            return;
        }
        this.field1466 += arg0;
        while (true) {
            do {
                do {
                    if (this.field1466 <= this.field1472.field3619[this.field1471]) {
                        return;
                    }
                    this.field1466 -= this.field1472.field3619[this.field1471];
                    this.field1471++;
                } while (this.field1471 < this.field1472.field3608.length);
                this.field1471 -= this.field1472.field3611;
            } while (this.field1471 >= 0 && this.field1471 < this.field1472.field3608.length);
            this.field1471 = 0;
        }
    }

    @ObfuscatedName("ci.n(B)Lej;")
    public final class134 method1018() {
        class246 var1 = class246.method3901(this.field1474);
        class134 var2 = var1.method3954(this.field1471);
        if (var2 == null) {
            return null;
        } else {
            var2.method2286(this.field1469);
            return var2;
        }
    }
}
