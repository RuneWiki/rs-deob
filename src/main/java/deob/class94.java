package deob;

@ObfuscatedName("co")
public final class class94 extends class142 {

    @ObfuscatedName("co.d")
    public int field1436;

    @ObfuscatedName("co.q")
    public int field1452;

    @ObfuscatedName("co.x")
    public int field1435;

    @ObfuscatedName("co.y")
    public int field1451;

    @ObfuscatedName("co.e")
    public int field1449;

    @ObfuscatedName("co.f")
    public int field1438;

    @ObfuscatedName("co.v")
    public int field1441;

    @ObfuscatedName("co.t")
    public int field1440;

    @ObfuscatedName("co.i")
    public int field1437;

    @ObfuscatedName("co.r")
    public int field1442;

    @ObfuscatedName("co.g")
    public int field1447;

    @ObfuscatedName("co.s")
    public boolean field1444 = false;

    @ObfuscatedName("co.o")
    public double field1445;

    @ObfuscatedName("co.p")
    public double field1446;

    @ObfuscatedName("co.u")
    public double field1454;

    @ObfuscatedName("co.b")
    public double field1448;

    @ObfuscatedName("co.w")
    public double field1434;

    @ObfuscatedName("co.k")
    public double field1450;

    @ObfuscatedName("co.n")
    public double field1453;

    @ObfuscatedName("co.c")
    public double field1443;

    @ObfuscatedName("co.l")
    public int field1457;

    @ObfuscatedName("co.m")
    public int field1439;

    @ObfuscatedName("co.a")
    public class261 field1455;

    @ObfuscatedName("co.h")
    public int field1456 = 0;

    @ObfuscatedName("co.z")
    public int field1433 = 0;

    public class94(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        this.field1436 = arg0;
        this.field1452 = arg1;
        this.field1435 = arg2;
        this.field1451 = arg3;
        this.field1449 = arg4;
        this.field1441 = arg5;
        this.field1440 = arg6;
        this.field1437 = arg7;
        this.field1442 = arg8;
        this.field1447 = arg9;
        this.field1438 = arg10;
        this.field1444 = false;
        int var12 = class246.method465(this.field1436).field3310;
        if (var12 == -1) {
            this.field1455 = null;
        } else {
            this.field1455 = class261.method494(var12);
        }
    }

    @ObfuscatedName("co.d(IIIII)V")
    public final void method1608(int arg0, int arg1, int arg2, int arg3) {
        if (!this.field1444) {
            double var5 = (double) (arg0 - this.field1435);
            double var7 = (double) (arg1 - this.field1451);
            double var9 = Math.sqrt(var5 * var5 + var7 * var7);
            this.field1445 = (double) this.field1442 * var5 / var9 + (double) this.field1435;
            this.field1446 = (double) this.field1442 * var7 / var9 + (double) this.field1451;
            this.field1454 = (double) this.field1449;
        }
        double var11 = (double) (this.field1440 + 1 - arg3);
        this.field1448 = ((double) arg0 - this.field1445) / var11;
        this.field1434 = ((double) arg1 - this.field1446) / var11;
        this.field1450 = Math.sqrt(this.field1448 * this.field1448 + this.field1434 * this.field1434);
        if (!this.field1444) {
            this.field1453 = -this.field1450 * Math.tan((double) this.field1437 * 0.02454369D);
        }
        this.field1443 = ((double) arg2 - this.field1454 - this.field1453 * var11) * 2.0D / (var11 * var11);
    }

    @ObfuscatedName("co.q(II)V")
    public final void method1615(int arg0) {
        this.field1444 = true;
        this.field1445 += (double) arg0 * this.field1448;
        this.field1446 += (double) arg0 * this.field1434;
        this.field1454 += this.field1443 * 0.5D * (double) arg0 * (double) arg0 + (double) arg0 * this.field1453;
        this.field1453 += (double) arg0 * this.field1443;
        this.field1457 = (int) (Math.atan2(this.field1448, this.field1434) * 325.949D) + 1024 & 0x7FF;
        this.field1439 = (int) (Math.atan2(this.field1453, this.field1450) * 325.949D) & 0x7FF;
        if (this.field1455 == null) {
            return;
        }
        this.field1433 += arg0;
        while (true) {
            do {
                do {
                    if (this.field1433 <= this.field1455.field3589[this.field1456]) {
                        return;
                    }
                    this.field1433 -= this.field1455.field3589[this.field1456];
                    this.field1456++;
                } while (this.field1456 < this.field1455.field3586.length);
                this.field1456 -= this.field1455.field3590;
            } while (this.field1456 >= 0 && this.field1456 < this.field1455.field3586.length);
            this.field1456 = 0;
        }
    }

    @ObfuscatedName("co.x(I)Lev;")
    public final class134 method1046() {
        class246 var1 = class246.method465(this.field1436);
        class134 var2 = var1.method3935(this.field1456);
        if (var2 == null) {
            return null;
        } else {
            var2.method2292(this.field1439);
            return var2;
        }
    }
}
