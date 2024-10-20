package deob;

@ObfuscatedName("ck")
public final class class94 extends class142 {

    @ObfuscatedName("ck.s")
    public int field1454;

    @ObfuscatedName("ck.c")
    public int field1449;

    @ObfuscatedName("ck.f")
    public int field1450;

    @ObfuscatedName("ck.m")
    public int field1451;

    @ObfuscatedName("ck.h")
    public int field1452;

    @ObfuscatedName("ck.t")
    public int field1453;

    @ObfuscatedName("ck.p")
    public int field1459;

    @ObfuscatedName("ck.d")
    public int field1455;

    @ObfuscatedName("ck.n")
    public int field1470;

    @ObfuscatedName("ck.z")
    public int field1466;

    @ObfuscatedName("ck.o")
    public int field1458;

    @ObfuscatedName("ck.q")
    public boolean field1460 = false;

    @ObfuscatedName("ck.u")
    public double field1448;

    @ObfuscatedName("ck.k")
    public double field1461;

    @ObfuscatedName("ck.e")
    public double field1456;

    @ObfuscatedName("ck.r")
    public double field1463;

    @ObfuscatedName("ck.l")
    public double field1467;

    @ObfuscatedName("ck.y")
    public double field1457;

    @ObfuscatedName("ck.w")
    public double field1462;

    @ObfuscatedName("ck.i")
    public double field1465;

    @ObfuscatedName("ck.g")
    public int field1468;

    @ObfuscatedName("ck.a")
    public int field1469;

    @ObfuscatedName("ck.x")
    public class264 field1464;

    @ObfuscatedName("ck.b")
    public int field1471 = 0;

    @ObfuscatedName("ck.j")
    public int field1472 = 0;

    public class94(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        this.field1454 = arg0;
        this.field1449 = arg1;
        this.field1450 = arg2;
        this.field1451 = arg3;
        this.field1452 = arg4;
        this.field1459 = arg5;
        this.field1455 = arg6;
        this.field1470 = arg7;
        this.field1466 = arg8;
        this.field1458 = arg9;
        this.field1453 = arg10;
        this.field1460 = false;
        int var12 = class249.method3835(this.field1454).field3338;
        if (var12 == -1) {
            this.field1464 = null;
        } else {
            this.field1464 = class264.method341(var12);
        }
    }

    @ObfuscatedName("ck.s(IIIII)V")
    public final void method1635(int arg0, int arg1, int arg2, int arg3) {
        if (!this.field1460) {
            double var5 = (double) (arg0 - this.field1450);
            double var7 = (double) (arg1 - this.field1451);
            double var9 = Math.sqrt(var5 * var5 + var7 * var7);
            this.field1448 = (double) this.field1466 * var5 / var9 + (double) this.field1450;
            this.field1461 = (double) this.field1466 * var7 / var9 + (double) this.field1451;
            this.field1456 = (double) this.field1452;
        }
        double var11 = (double) (this.field1455 + 1 - arg3);
        this.field1463 = ((double) arg0 - this.field1448) / var11;
        this.field1467 = ((double) arg1 - this.field1461) / var11;
        this.field1457 = Math.sqrt(this.field1467 * this.field1467 + this.field1463 * this.field1463);
        if (!this.field1460) {
            this.field1462 = -this.field1457 * Math.tan((double) this.field1470 * 0.02454369D);
        }
        this.field1465 = ((double) arg2 - this.field1456 - this.field1462 * var11) * 2.0D / (var11 * var11);
    }

    @ObfuscatedName("ck.c(IB)V")
    public final void method1637(int arg0) {
        this.field1460 = true;
        this.field1448 += (double) arg0 * this.field1463;
        this.field1461 += (double) arg0 * this.field1467;
        this.field1456 += this.field1465 * 0.5D * (double) arg0 * (double) arg0 + (double) arg0 * this.field1462;
        this.field1462 += (double) arg0 * this.field1465;
        this.field1468 = (int) (Math.atan2(this.field1463, this.field1467) * 325.949D) + 1024 & 0x7FF;
        this.field1469 = (int) (Math.atan2(this.field1462, this.field1457) * 325.949D) & 0x7FF;
        if (this.field1464 == null) {
            return;
        }
        this.field1472 += arg0;
        while (true) {
            do {
                do {
                    if (this.field1472 <= this.field1464.field3631[this.field1471]) {
                        return;
                    }
                    this.field1472 -= this.field1464.field3631[this.field1471];
                    this.field1471++;
                } while (this.field1471 < this.field1464.field3620.length);
                this.field1471 -= this.field1464.field3624;
            } while (this.field1471 >= 0 && this.field1471 < this.field1464.field3620.length);
            this.field1471 = 0;
        }
    }

    @ObfuscatedName("ck.f(B)Leb;")
    public final class134 method1016() {
        class249 var1 = class249.method3835(this.field1454);
        class134 var2 = var1.method4051(this.field1471);
        if (var2 == null) {
            return null;
        } else {
            var2.method2365(this.field1469);
            return var2;
        }
    }
}
