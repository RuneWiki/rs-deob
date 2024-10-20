package deob;

@ObfuscatedName("cs")
public final class class92 extends class140 {

    @ObfuscatedName("cs.o")
    public int field1414;

    @ObfuscatedName("cs.k")
    public int field1398;

    @ObfuscatedName("cs.t")
    public int field1399;

    @ObfuscatedName("cs.d")
    public int field1400;

    @ObfuscatedName("cs.h")
    public int field1401;

    @ObfuscatedName("cs.m")
    public int field1402;

    @ObfuscatedName("cs.z")
    public int field1419;

    @ObfuscatedName("cs.i")
    public int field1404;

    @ObfuscatedName("cs.u")
    public int field1405;

    @ObfuscatedName("cs.x")
    public int field1406;

    @ObfuscatedName("cs.y")
    public int field1407;

    @ObfuscatedName("cs.a")
    public boolean field1408 = false;

    @ObfuscatedName("cs.w")
    public double field1409;

    @ObfuscatedName("cs.n")
    public double field1410;

    @ObfuscatedName("cs.l")
    public double field1412;

    @ObfuscatedName("cs.s")
    public double field1411;

    @ObfuscatedName("cs.v")
    public double field1397;

    @ObfuscatedName("cs.q")
    public double field1416;

    @ObfuscatedName("cs.r")
    public double field1415;

    @ObfuscatedName("cs.j")
    public double field1421;

    @ObfuscatedName("cs.b")
    public int field1417;

    @ObfuscatedName("cs.g")
    public int field1403;

    @ObfuscatedName("cs.f")
    public class288 field1413;

    @ObfuscatedName("cs.p")
    public int field1420 = 0;

    @ObfuscatedName("cs.e")
    public int field1418 = 0;

    public class92(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        this.field1414 = arg0;
        this.field1398 = arg1;
        this.field1399 = arg2;
        this.field1400 = arg3;
        this.field1401 = arg4;
        this.field1419 = arg5;
        this.field1404 = arg6;
        this.field1405 = arg7;
        this.field1406 = arg8;
        this.field1407 = arg9;
        this.field1402 = arg10;
        this.field1408 = false;
        int var12 = class273.method1734(this.field1414).field3498;
        if (var12 == -1) {
            this.field1413 = null;
        } else {
            this.field1413 = class288.method1535(var12);
        }
    }

    @ObfuscatedName("cs.o(IIIIB)V")
    public final void method1776(int arg0, int arg1, int arg2, int arg3) {
        if (!this.field1408) {
            double var5 = (double) (arg0 - this.field1399);
            double var7 = (double) (arg1 - this.field1400);
            double var9 = Math.sqrt(var5 * var5 + var7 * var7);
            this.field1409 = (double) this.field1406 * var5 / var9 + (double) this.field1399;
            this.field1410 = (double) this.field1406 * var7 / var9 + (double) this.field1400;
            this.field1412 = (double) this.field1401;
        }
        double var11 = (double) (this.field1404 + 1 - arg3);
        this.field1411 = ((double) arg0 - this.field1409) / var11;
        this.field1397 = ((double) arg1 - this.field1410) / var11;
        this.field1416 = Math.sqrt(this.field1411 * this.field1411 + this.field1397 * this.field1397);
        if (!this.field1408) {
            this.field1415 = -this.field1416 * Math.tan((double) this.field1405 * 0.02454369D);
        }
        this.field1421 = ((double) arg2 - this.field1412 - this.field1415 * var11) * 2.0D / (var11 * var11);
    }

    @ObfuscatedName("cs.k(IB)V")
    public final void method1781(int arg0) {
        this.field1408 = true;
        this.field1409 += (double) arg0 * this.field1411;
        this.field1410 += (double) arg0 * this.field1397;
        this.field1412 += this.field1421 * 0.5D * (double) arg0 * (double) arg0 + (double) arg0 * this.field1415;
        this.field1415 += (double) arg0 * this.field1421;
        this.field1417 = (int) (Math.atan2(this.field1411, this.field1397) * 325.949D) + 1024 & 0x7FF;
        this.field1403 = (int) (Math.atan2(this.field1415, this.field1416) * 325.949D) & 0x7FF;
        if (this.field1413 == null) {
            return;
        }
        this.field1418 += arg0;
        while (true) {
            do {
                do {
                    if (this.field1418 <= this.field1413.field3764[this.field1420]) {
                        return;
                    }
                    this.field1418 -= this.field1413.field3764[this.field1420];
                    this.field1420++;
                } while (this.field1420 < this.field1413.field3758.length);
                this.field1420 -= this.field1413.field3762;
            } while (this.field1420 >= 0 && this.field1420 < this.field1413.field3758.length);
            this.field1420 = 0;
        }
    }

    @ObfuscatedName("cs.u(I)Lei;")
    public final class132 method1081() {
        class273 var1 = class273.method1734(this.field1414);
        class132 var2 = var1.method4416(this.field1420);
        if (var2 == null) {
            return null;
        } else {
            var2.method2474(this.field1403);
            return var2;
        }
    }
}
