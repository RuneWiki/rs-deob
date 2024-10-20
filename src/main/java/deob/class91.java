package deob;

@ObfuscatedName("cr")
public final class class91 extends class139 {

    @ObfuscatedName("cr.b")
    public int field1343;

    @ObfuscatedName("cr.q")
    public int field1337;

    @ObfuscatedName("cr.o")
    public int field1339;

    @ObfuscatedName("cr.p")
    public int field1340;

    @ObfuscatedName("cr.a")
    public int field1344;

    @ObfuscatedName("cr.h")
    public int field1342;

    @ObfuscatedName("cr.l")
    public int field1346;

    @ObfuscatedName("cr.y")
    public int field1351;

    @ObfuscatedName("cr.g")
    public int field1361;

    @ObfuscatedName("cr.c")
    public int field1353;

    @ObfuscatedName("cr.u")
    public int field1356;

    @ObfuscatedName("cr.r")
    public boolean field1348 = false;

    @ObfuscatedName("cr.d")
    public double field1349;

    @ObfuscatedName("cr.v")
    public double field1350;

    @ObfuscatedName("cr.s")
    public double field1338;

    @ObfuscatedName("cr.t")
    public double field1352;

    @ObfuscatedName("cr.f")
    public double field1341;

    @ObfuscatedName("cr.m")
    public double field1354;

    @ObfuscatedName("cr.x")
    public double field1355;

    @ObfuscatedName("cr.w")
    public double field1345;

    @ObfuscatedName("cr.j")
    public int field1357;

    @ObfuscatedName("cr.z")
    public int field1358;

    @ObfuscatedName("cr.e")
    public class281 field1359;

    @ObfuscatedName("cr.k")
    public int field1360 = 0;

    @ObfuscatedName("cr.n")
    public int field1347 = 0;

    public class91(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        this.field1343 = arg0;
        this.field1337 = arg1;
        this.field1339 = arg2;
        this.field1340 = arg3;
        this.field1344 = arg4;
        this.field1346 = arg5;
        this.field1351 = arg6;
        this.field1361 = arg7;
        this.field1353 = arg8;
        this.field1356 = arg9;
        this.field1342 = arg10;
        this.field1348 = false;
        int var12 = class266.method3059(this.field1343).field3426;
        if (var12 == -1) {
            this.field1359 = null;
        } else {
            this.field1359 = class281.method2838(var12);
        }
    }

    @ObfuscatedName("cr.b(IIIII)V")
    public final void method1768(int arg0, int arg1, int arg2, int arg3) {
        if (!this.field1348) {
            double var5 = (double) (arg0 - this.field1339);
            double var7 = (double) (arg1 - this.field1340);
            double var9 = Math.sqrt(var5 * var5 + var7 * var7);
            this.field1349 = (double) this.field1353 * var5 / var9 + (double) this.field1339;
            this.field1350 = (double) this.field1353 * var7 / var9 + (double) this.field1340;
            this.field1338 = (double) this.field1344;
        }
        double var11 = (double) (this.field1351 + 1 - arg3);
        this.field1352 = ((double) arg0 - this.field1349) / var11;
        this.field1341 = ((double) arg1 - this.field1350) / var11;
        this.field1354 = Math.sqrt(this.field1352 * this.field1352 + this.field1341 * this.field1341);
        if (!this.field1348) {
            this.field1355 = -this.field1354 * Math.tan((double) this.field1361 * 0.02454369D);
        }
        this.field1345 = ((double) arg2 - this.field1338 - this.field1355 * var11) * 2.0D / (var11 * var11);
    }

    @ObfuscatedName("cr.q(IB)V")
    public final void method1769(int arg0) {
        this.field1348 = true;
        this.field1349 += (double) arg0 * this.field1352;
        this.field1350 += (double) arg0 * this.field1341;
        this.field1338 += this.field1345 * 0.5D * (double) arg0 * (double) arg0 + (double) arg0 * this.field1355;
        this.field1355 += (double) arg0 * this.field1345;
        this.field1357 = (int) (Math.atan2(this.field1352, this.field1341) * 325.949D) + 1024 & 0x7FF;
        this.field1358 = (int) (Math.atan2(this.field1355, this.field1354) * 325.949D) & 0x7FF;
        if (this.field1359 == null) {
            return;
        }
        this.field1347 += arg0;
        while (true) {
            do {
                do {
                    if (this.field1347 <= this.field1359.field3693[this.field1360]) {
                        return;
                    }
                    this.field1347 -= this.field1359.field3693[this.field1360];
                    this.field1360++;
                } while (this.field1360 < this.field1359.field3684.length);
                this.field1360 -= this.field1359.field3688;
            } while (this.field1360 >= 0 && this.field1360 < this.field1359.field3684.length);
            this.field1360 = 0;
        }
    }

    @ObfuscatedName("cr.g(I)Lee;")
    public final class131 method1092() {
        class266 var1 = class266.method3059(this.field1343);
        class131 var2 = var1.method4392(this.field1360);
        if (var2 == null) {
            return null;
        } else {
            var2.method2532(this.field1358);
            return var2;
        }
    }
}
