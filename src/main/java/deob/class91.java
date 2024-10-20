package deob;

@ObfuscatedName("cy")
public final class class91 extends class139 {

    @ObfuscatedName("cy.p")
    public int field1343;

    @ObfuscatedName("cy.i")
    public int field1355;

    @ObfuscatedName("cy.w")
    public int field1344;

    @ObfuscatedName("cy.s")
    public int field1345;

    @ObfuscatedName("cy.j")
    public int field1342;

    @ObfuscatedName("cy.a")
    public int field1347;

    @ObfuscatedName("cy.t")
    public int field1352;

    @ObfuscatedName("cy.r")
    public int field1349;

    @ObfuscatedName("cy.m")
    public int field1350;

    @ObfuscatedName("cy.h")
    public int field1358;

    @ObfuscatedName("cy.o")
    public int field1346;

    @ObfuscatedName("cy.x")
    public boolean field1353 = false;

    @ObfuscatedName("cy.q")
    public double field1354;

    @ObfuscatedName("cy.v")
    public double field1363;

    @ObfuscatedName("cy.n")
    public double field1356;

    @ObfuscatedName("cy.y")
    public double field1357;

    @ObfuscatedName("cy.d")
    public double field1351;

    @ObfuscatedName("cy.l")
    public double field1359;

    @ObfuscatedName("cy.f")
    public double field1360;

    @ObfuscatedName("cy.k")
    public double field1361;

    @ObfuscatedName("cy.e")
    public int field1362;

    @ObfuscatedName("cy.u")
    public int field1348;

    @ObfuscatedName("cy.g")
    public class272 field1364;

    @ObfuscatedName("cy.z")
    public int field1365 = 0;

    @ObfuscatedName("cy.b")
    public int field1366 = 0;

    public class91(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        this.field1343 = arg0;
        this.field1355 = arg1;
        this.field1344 = arg2;
        this.field1345 = arg3;
        this.field1342 = arg4;
        this.field1352 = arg5;
        this.field1349 = arg6;
        this.field1350 = arg7;
        this.field1358 = arg8;
        this.field1346 = arg9;
        this.field1347 = arg10;
        this.field1353 = false;
        int var12 = class257.method82(this.field1343).field3396;
        if (var12 == -1) {
            this.field1364 = null;
        } else {
            this.field1364 = class272.method2308(var12);
        }
    }

    @ObfuscatedName("cy.p(IIIII)V")
    public final void method1775(int arg0, int arg1, int arg2, int arg3) {
        if (!this.field1353) {
            double var5 = (double) (arg0 - this.field1344);
            double var7 = (double) (arg1 - this.field1345);
            double var9 = Math.sqrt(var5 * var5 + var7 * var7);
            this.field1354 = (double) this.field1358 * var5 / var9 + (double) this.field1344;
            this.field1363 = (double) this.field1358 * var7 / var9 + (double) this.field1345;
            this.field1356 = (double) this.field1342;
        }
        double var11 = (double) (this.field1349 + 1 - arg3);
        this.field1357 = ((double) arg0 - this.field1354) / var11;
        this.field1351 = ((double) arg1 - this.field1363) / var11;
        this.field1359 = Math.sqrt(this.field1357 * this.field1357 + this.field1351 * this.field1351);
        if (!this.field1353) {
            this.field1360 = -this.field1359 * Math.tan((double) this.field1350 * 0.02454369D);
        }
        this.field1361 = ((double) arg2 - this.field1356 - this.field1360 * var11) * 2.0D / (var11 * var11);
    }

    @ObfuscatedName("cy.i(II)V")
    public final void method1778(int arg0) {
        this.field1353 = true;
        this.field1354 += (double) arg0 * this.field1357;
        this.field1363 += (double) arg0 * this.field1351;
        this.field1356 += this.field1361 * 0.5D * (double) arg0 * (double) arg0 + (double) arg0 * this.field1360;
        this.field1360 += (double) arg0 * this.field1361;
        this.field1362 = (int) (Math.atan2(this.field1357, this.field1351) * 325.949D) + 1024 & 0x7FF;
        this.field1348 = (int) (Math.atan2(this.field1360, this.field1359) * 325.949D) & 0x7FF;
        if (this.field1364 == null) {
            return;
        }
        this.field1366 += arg0;
        while (true) {
            do {
                do {
                    if (this.field1366 <= this.field1364.field3670[this.field1365]) {
                        return;
                    }
                    this.field1366 -= this.field1364.field3670[this.field1365];
                    this.field1365++;
                } while (this.field1365 < this.field1364.field3660.length);
                this.field1365 -= this.field1364.field3664;
            } while (this.field1365 >= 0 && this.field1365 < this.field1364.field3660.length);
            this.field1365 = 0;
        }
    }

    @ObfuscatedName("cy.m(I)Len;")
    public final class131 method1045() {
        class257 var1 = class257.method82(this.field1343);
        class131 var2 = var1.method4252(this.field1365);
        if (var2 == null) {
            return null;
        } else {
            var2.method2475(this.field1348);
            return var2;
        }
    }
}
