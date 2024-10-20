package deob;

@ObfuscatedName("cg")
public final class class94 extends class142 {

    @ObfuscatedName("cg.c")
    public int field1457;

    @ObfuscatedName("cg.o")
    public int field1434;

    @ObfuscatedName("cg.i")
    public int field1435;

    @ObfuscatedName("cg.u")
    public int field1436;

    @ObfuscatedName("cg.g")
    public int field1437;

    @ObfuscatedName("cg.m")
    public int field1438;

    @ObfuscatedName("cg.s")
    public int field1454;

    @ObfuscatedName("cg.x")
    public int field1440;

    @ObfuscatedName("cg.p")
    public int field1445;

    @ObfuscatedName("cg.k")
    public int field1439;

    @ObfuscatedName("cg.r")
    public int field1442;

    @ObfuscatedName("cg.w")
    public boolean field1444 = false;

    @ObfuscatedName("cg.v")
    public double field1443;

    @ObfuscatedName("cg.h")
    public double field1446;

    @ObfuscatedName("cg.t")
    public double field1447;

    @ObfuscatedName("cg.a")
    public double field1448;

    @ObfuscatedName("cg.e")
    public double field1449;

    @ObfuscatedName("cg.y")
    public double field1450;

    @ObfuscatedName("cg.l")
    public double field1433;

    @ObfuscatedName("cg.q")
    public double field1452;

    @ObfuscatedName("cg.f")
    public int field1451;

    @ObfuscatedName("cg.j")
    public int field1441;

    @ObfuscatedName("cg.n")
    public class261 field1455;

    @ObfuscatedName("cg.z")
    public int field1456 = 0;

    @ObfuscatedName("cg.b")
    public int field1453 = 0;

    public class94(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        this.field1457 = arg0;
        this.field1434 = arg1;
        this.field1435 = arg2;
        this.field1436 = arg3;
        this.field1437 = arg4;
        this.field1454 = arg5;
        this.field1440 = arg6;
        this.field1445 = arg7;
        this.field1439 = arg8;
        this.field1442 = arg9;
        this.field1438 = arg10;
        this.field1444 = false;
        int var12 = class246.method3494(this.field1457).field3300;
        if (var12 == -1) {
            this.field1455 = null;
        } else {
            this.field1455 = Statics.method240(var12);
        }
    }

    @ObfuscatedName("cg.c(IIIII)V")
    public final void method1567(int arg0, int arg1, int arg2, int arg3) {
        if (!this.field1444) {
            double var5 = (double) (arg0 - this.field1435);
            double var7 = (double) (arg1 - this.field1436);
            double var9 = Math.sqrt(var5 * var5 + var7 * var7);
            this.field1443 = (double) this.field1439 * var5 / var9 + (double) this.field1435;
            this.field1446 = (double) this.field1439 * var7 / var9 + (double) this.field1436;
            this.field1447 = (double) this.field1437;
        }
        double var11 = (double) (this.field1440 + 1 - arg3);
        this.field1448 = ((double) arg0 - this.field1443) / var11;
        this.field1449 = ((double) arg1 - this.field1446) / var11;
        this.field1450 = Math.sqrt(this.field1449 * this.field1449 + this.field1448 * this.field1448);
        if (!this.field1444) {
            this.field1433 = -this.field1450 * Math.tan((double) this.field1445 * 0.02454369D);
        }
        this.field1452 = ((double) arg2 - this.field1447 - this.field1433 * var11) * 2.0D / (var11 * var11);
    }

    @ObfuscatedName("cg.o(IS)V")
    public final void method1570(int arg0) {
        this.field1444 = true;
        this.field1443 += (double) arg0 * this.field1448;
        this.field1446 += (double) arg0 * this.field1449;
        this.field1447 += this.field1452 * 0.5D * (double) arg0 * (double) arg0 + (double) arg0 * this.field1433;
        this.field1433 += (double) arg0 * this.field1452;
        this.field1451 = (int) (Math.atan2(this.field1448, this.field1449) * 325.949D) + 1024 & 0x7FF;
        this.field1441 = (int) (Math.atan2(this.field1433, this.field1450) * 325.949D) & 0x7FF;
        if (this.field1455 == null) {
            return;
        }
        this.field1453 += arg0;
        while (true) {
            do {
                do {
                    if (this.field1453 <= this.field1455.field3586[this.field1456]) {
                        return;
                    }
                    this.field1453 -= this.field1455.field3586[this.field1456];
                    this.field1456++;
                } while (this.field1456 < this.field1455.field3584.length);
                this.field1456 -= this.field1455.field3588;
            } while (this.field1456 >= 0 && this.field1456 < this.field1455.field3584.length);
            this.field1456 = 0;
        }
    }

    @ObfuscatedName("cg.i(B)Leo;")
    public final class134 method983() {
        class246 var1 = class246.method3494(this.field1457);
        class134 var2 = var1.method3925(this.field1456);
        if (var2 == null) {
            return null;
        } else {
            var2.method2272(this.field1441);
            return var2;
        }
    }
}
