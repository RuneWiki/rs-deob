package deob;

@ObfuscatedName("cr")
public final class class94 extends class142 {

    @ObfuscatedName("cr.i")
    public int field1487;

    @ObfuscatedName("cr.w")
    public int field1504;

    @ObfuscatedName("cr.a")
    public int field1484;

    @ObfuscatedName("cr.t")
    public int field1485;

    @ObfuscatedName("cr.s")
    public int field1495;

    @ObfuscatedName("cr.r")
    public int field1482;

    @ObfuscatedName("cr.v")
    public int field1483;

    @ObfuscatedName("cr.y")
    public int field1486;

    @ObfuscatedName("cr.j")
    public int field1490;

    @ObfuscatedName("cr.k")
    public int field1491;

    @ObfuscatedName("cr.e")
    public int field1492;

    @ObfuscatedName("cr.o")
    public boolean field1493 = false;

    @ObfuscatedName("cr.z")
    public double field1494;

    @ObfuscatedName("cr.l")
    public double field1496;

    @ObfuscatedName("cr.c")
    public double field1488;

    @ObfuscatedName("cr.m")
    public double field1497;

    @ObfuscatedName("cr.b")
    public double field1498;

    @ObfuscatedName("cr.f")
    public double field1499;

    @ObfuscatedName("cr.n")
    public double field1489;

    @ObfuscatedName("cr.u")
    public double field1501;

    @ObfuscatedName("cr.p")
    public int field1502;

    @ObfuscatedName("cr.q")
    public int field1503;

    @ObfuscatedName("cr.d")
    public class261 field1500;

    @ObfuscatedName("cr.h")
    public int field1505 = 0;

    @ObfuscatedName("cr.g")
    public int field1506 = 0;

    public class94(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        this.field1487 = arg0;
        this.field1504 = arg1;
        this.field1484 = arg2;
        this.field1485 = arg3;
        this.field1495 = arg4;
        this.field1483 = arg5;
        this.field1486 = arg6;
        this.field1490 = arg7;
        this.field1491 = arg8;
        this.field1492 = arg9;
        this.field1482 = arg10;
        this.field1493 = false;
        int var12 = class246.method2634(this.field1487).field3333;
        if (var12 == -1) {
            this.field1500 = null;
        } else {
            this.field1500 = class261.method3746(var12);
        }
    }

    @ObfuscatedName("cr.i(IIIII)V")
    public final void method1609(int arg0, int arg1, int arg2, int arg3) {
        if (!this.field1493) {
            double var5 = (double) (arg0 - this.field1484);
            double var7 = (double) (arg1 - this.field1485);
            double var9 = Math.sqrt(var5 * var5 + var7 * var7);
            this.field1494 = (double) this.field1491 * var5 / var9 + (double) this.field1484;
            this.field1496 = (double) this.field1491 * var7 / var9 + (double) this.field1485;
            this.field1488 = (double) this.field1495;
        }
        double var11 = (double) (this.field1486 + 1 - arg3);
        this.field1497 = ((double) arg0 - this.field1494) / var11;
        this.field1498 = ((double) arg1 - this.field1496) / var11;
        this.field1499 = Math.sqrt(this.field1498 * this.field1498 + this.field1497 * this.field1497);
        if (!this.field1493) {
            this.field1489 = -this.field1499 * Math.tan((double) this.field1490 * 0.02454369D);
        }
        this.field1501 = ((double) arg2 - this.field1488 - this.field1489 * var11) * 2.0D / (var11 * var11);
    }

    @ObfuscatedName("cr.w(II)V")
    public final void method1610(int arg0) {
        this.field1493 = true;
        this.field1494 += (double) arg0 * this.field1497;
        this.field1496 += (double) arg0 * this.field1498;
        this.field1488 += this.field1501 * 0.5D * (double) arg0 * (double) arg0 + (double) arg0 * this.field1489;
        this.field1489 += (double) arg0 * this.field1501;
        this.field1502 = (int) (Math.atan2(this.field1497, this.field1498) * 325.949D) + 1024 & 0x7FF;
        this.field1503 = (int) (Math.atan2(this.field1489, this.field1499) * 325.949D) & 0x7FF;
        if (this.field1500 == null) {
            return;
        }
        this.field1506 += arg0;
        while (true) {
            do {
                do {
                    if (this.field1506 <= this.field1500.field3613[this.field1505]) {
                        return;
                    }
                    this.field1506 -= this.field1500.field3613[this.field1505];
                    this.field1505++;
                } while (this.field1505 < this.field1500.field3610.length);
                this.field1505 -= this.field1500.field3611;
            } while (this.field1505 >= 0 && this.field1505 < this.field1500.field3610.length);
            this.field1505 = 0;
        }
    }

    @ObfuscatedName("cr.a(I)Let;")
    public final class134 method1044() {
        class246 var1 = class246.method2634(this.field1487);
        class134 var2 = var1.method3979(this.field1505);
        if (var2 == null) {
            return null;
        } else {
            var2.method2279(this.field1503);
            return var2;
        }
    }
}
