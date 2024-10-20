package deob;

@ObfuscatedName("cp")
public final class class92 extends class140 {

    @ObfuscatedName("cp.d")
    public int field1464;

    @ObfuscatedName("cp.k")
    public int field1454;

    @ObfuscatedName("cp.e")
    public int field1448;

    @ObfuscatedName("cp.p")
    public int field1446;

    @ObfuscatedName("cp.q")
    public int field1452;

    @ObfuscatedName("cp.s")
    public int field1451;

    @ObfuscatedName("cp.r")
    public int field1469;

    @ObfuscatedName("cp.g")
    public int field1462;

    @ObfuscatedName("cp.v")
    public int field1447;

    @ObfuscatedName("cp.t")
    public int field1455;

    @ObfuscatedName("cp.y")
    public int field1456;

    @ObfuscatedName("cp.o")
    public boolean field1457 = false;

    @ObfuscatedName("cp.i")
    public double field1470;

    @ObfuscatedName("cp.u")
    public double field1459;

    @ObfuscatedName("cp.b")
    public double field1453;

    @ObfuscatedName("cp.f")
    public double field1461;

    @ObfuscatedName("cp.j")
    public double field1450;

    @ObfuscatedName("cp.x")
    public double field1463;

    @ObfuscatedName("cp.c")
    public double field1458;

    @ObfuscatedName("cp.h")
    public double field1465;

    @ObfuscatedName("cp.a")
    public int field1466;

    @ObfuscatedName("cp.z")
    public int field1467;

    @ObfuscatedName("cp.l")
    public class261 field1468;

    @ObfuscatedName("cp.w")
    public int field1449 = 0;

    @ObfuscatedName("cp.n")
    public int field1460 = 0;

    public class92(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        this.field1464 = arg0;
        this.field1454 = arg1;
        this.field1448 = arg2;
        this.field1446 = arg3;
        this.field1452 = arg4;
        this.field1469 = arg5;
        this.field1462 = arg6;
        this.field1447 = arg7;
        this.field1455 = arg8;
        this.field1456 = arg9;
        this.field1451 = arg10;
        this.field1457 = false;
        int var12 = class246.method2787(this.field1464).field3327;
        if (var12 == -1) {
            this.field1468 = null;
        } else {
            this.field1468 = class261.method3613(var12);
        }
    }

    @ObfuscatedName("cp.d(IIIII)V")
    public final void method1671(int arg0, int arg1, int arg2, int arg3) {
        if (!this.field1457) {
            double var5 = (double) (arg0 - this.field1448);
            double var7 = (double) (arg1 - this.field1446);
            double var9 = Math.sqrt(var5 * var5 + var7 * var7);
            this.field1470 = (double) this.field1455 * var5 / var9 + (double) this.field1448;
            this.field1459 = (double) this.field1455 * var7 / var9 + (double) this.field1446;
            this.field1453 = (double) this.field1452;
        }
        double var11 = (double) (this.field1462 + 1 - arg3);
        this.field1461 = ((double) arg0 - this.field1470) / var11;
        this.field1450 = ((double) arg1 - this.field1459) / var11;
        this.field1463 = Math.sqrt(this.field1461 * this.field1461 + this.field1450 * this.field1450);
        if (!this.field1457) {
            this.field1458 = -this.field1463 * Math.tan((double) this.field1447 * 0.02454369D);
        }
        this.field1465 = ((double) arg2 - this.field1453 - this.field1458 * var11) * 2.0D / (var11 * var11);
    }

    @ObfuscatedName("cp.k(II)V")
    public final void method1672(int arg0) {
        this.field1457 = true;
        this.field1470 += (double) arg0 * this.field1461;
        this.field1459 += (double) arg0 * this.field1450;
        this.field1453 += this.field1465 * 0.5D * (double) arg0 * (double) arg0 + (double) arg0 * this.field1458;
        this.field1458 += (double) arg0 * this.field1465;
        this.field1466 = (int) (Math.atan2(this.field1461, this.field1450) * 325.949D) + 1024 & 0x7FF;
        this.field1467 = (int) (Math.atan2(this.field1458, this.field1463) * 325.949D) & 0x7FF;
        if (this.field1468 == null) {
            return;
        }
        this.field1460 += arg0;
        while (true) {
            do {
                do {
                    if (this.field1460 <= this.field1468.field3611[this.field1449]) {
                        return;
                    }
                    this.field1460 -= this.field1468.field3611[this.field1449];
                    this.field1449++;
                } while (this.field1449 < this.field1468.field3622.length);
                this.field1449 -= this.field1468.field3609;
            } while (this.field1449 >= 0 && this.field1449 < this.field1468.field3622.length);
            this.field1449 = 0;
        }
    }

    @ObfuscatedName("cp.e(I)Leb;")
    public final class132 method1070() {
        class246 var1 = class246.method2787(this.field1464);
        class132 var2 = var1.method4078(this.field1449);
        if (var2 == null) {
            return null;
        } else {
            var2.method2403(this.field1467);
            return var2;
        }
    }
}
