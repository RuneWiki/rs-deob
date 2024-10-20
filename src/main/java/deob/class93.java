package deob;

@ObfuscatedName("cy")
public final class class93 extends class141 {

    @ObfuscatedName("cy.n")
    public int field1394;

    @ObfuscatedName("cy.v")
    public int field1374;

    @ObfuscatedName("cy.y")
    public int field1390;

    @ObfuscatedName("cy.r")
    public int field1376;

    @ObfuscatedName("cy.h")
    public int field1377;

    @ObfuscatedName("cy.d")
    public int field1378;

    @ObfuscatedName("cy.s")
    public int field1379;

    @ObfuscatedName("cy.b")
    public int field1382;

    @ObfuscatedName("cy.e")
    public int field1381;

    @ObfuscatedName("cy.f")
    public int field1396;

    @ObfuscatedName("cy.z")
    public int field1383;

    @ObfuscatedName("cy.u")
    public boolean field1384 = false;

    @ObfuscatedName("cy.p")
    public double field1385;

    @ObfuscatedName("cy.w")
    public double field1391;

    @ObfuscatedName("cy.t")
    public double field1387;

    @ObfuscatedName("cy.o")
    public double field1395;

    @ObfuscatedName("cy.a")
    public double field1389;

    @ObfuscatedName("cy.i")
    public double field1373;

    @ObfuscatedName("cy.m")
    public double field1386;

    @ObfuscatedName("cy.x")
    public double field1392;

    @ObfuscatedName("cy.l")
    public int field1393;

    @ObfuscatedName("cy.j")
    public int field1380;

    @ObfuscatedName("cy.g")
    public class272 field1388;

    @ObfuscatedName("cy.c")
    public int field1375 = 0;

    @ObfuscatedName("cy.k")
    public int field1397 = 0;

    public class93(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        this.field1394 = arg0;
        this.field1374 = arg1;
        this.field1390 = arg2;
        this.field1376 = arg3;
        this.field1377 = arg4;
        this.field1379 = arg5;
        this.field1382 = arg6;
        this.field1381 = arg7;
        this.field1396 = arg8;
        this.field1383 = arg9;
        this.field1378 = arg10;
        this.field1384 = false;
        int var12 = Statics.method4461(this.field1394).field3420;
        if (var12 == -1) {
            this.field1388 = null;
        } else {
            this.field1388 = class272.method579(var12);
        }
    }

    @ObfuscatedName("cy.n(IIIIB)V")
    public final void method1654(int arg0, int arg1, int arg2, int arg3) {
        if (!this.field1384) {
            double var5 = (double) (arg0 - this.field1390);
            double var7 = (double) (arg1 - this.field1376);
            double var9 = Math.sqrt(var5 * var5 + var7 * var7);
            this.field1385 = (double) this.field1396 * var5 / var9 + (double) this.field1390;
            this.field1391 = (double) this.field1396 * var7 / var9 + (double) this.field1376;
            this.field1387 = (double) this.field1377;
        }
        double var11 = (double) (this.field1382 + 1 - arg3);
        this.field1395 = ((double) arg0 - this.field1385) / var11;
        this.field1389 = ((double) arg1 - this.field1391) / var11;
        this.field1373 = Math.sqrt(this.field1395 * this.field1395 + this.field1389 * this.field1389);
        if (!this.field1384) {
            this.field1386 = -this.field1373 * Math.tan((double) this.field1381 * 0.02454369D);
        }
        this.field1392 = ((double) arg2 - this.field1387 - this.field1386 * var11) * 2.0D / (var11 * var11);
    }

    @ObfuscatedName("cy.v(IB)V")
    public final void method1657(int arg0) {
        this.field1384 = true;
        this.field1385 += (double) arg0 * this.field1395;
        this.field1391 += (double) arg0 * this.field1389;
        this.field1387 += this.field1392 * 0.5D * (double) arg0 * (double) arg0 + (double) arg0 * this.field1386;
        this.field1386 += (double) arg0 * this.field1392;
        this.field1393 = (int) (Math.atan2(this.field1395, this.field1389) * 325.949D) + 1024 & 0x7FF;
        this.field1380 = (int) (Math.atan2(this.field1386, this.field1373) * 325.949D) & 0x7FF;
        if (this.field1388 == null) {
            return;
        }
        this.field1397 += arg0;
        while (true) {
            do {
                do {
                    if (this.field1397 <= this.field1388.field3690[this.field1375]) {
                        return;
                    }
                    this.field1397 -= this.field1388.field3690[this.field1375];
                    this.field1375++;
                } while (this.field1375 < this.field1388.field3688.length);
                this.field1375 -= this.field1388.field3685;
            } while (this.field1375 >= 0 && this.field1375 < this.field1388.field3688.length);
            this.field1375 = 0;
        }
    }

    @ObfuscatedName("cy.y(B)Les;")
    public final class133 method1047() {
        class257 var1 = Statics.method4461(this.field1394);
        class133 var2 = var1.method4116(this.field1375);
        if (var2 == null) {
            return null;
        } else {
            var2.method2361(this.field1380);
            return var2;
        }
    }
}
