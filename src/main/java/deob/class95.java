package deob;

@ObfuscatedName("ca")
public class class95 implements class92 {

    @ObfuscatedName("ca.n")
    public class83[] field1610;

    @ObfuscatedName("ca.d")
    public class199 field1607 = new class199();

    @ObfuscatedName("ca.s")
    public int field1599;

    @ObfuscatedName("ca.q")
    public int field1597 = 0;

    @ObfuscatedName("ca.j")
    public double field1600 = 1.0D;

    @ObfuscatedName("ca.k")
    public int field1598 = 128;

    @ObfuscatedName("ca.i")
    public class167 field1603;

    public class95(class167 arg0, class167 arg1, int arg2, double arg3, int arg4) {
        this.field1603 = arg1;
        this.field1599 = arg2;
        this.field1597 = this.field1599;
        this.field1600 = arg3;
        this.field1598 = arg4;
        int[] var7 = arg0.method3019(0);
        int var8 = var7.length;
        this.field1610 = new class83[arg0.method3020(0)];
        for (int var9 = 0; var9 < var8; var9++) {
            class119 var10 = new class119(arg0.method3010(0, var7[var9]));
            this.field1610[var7[var9]] = new class83(var10);
        }
    }

    @ObfuscatedName("ca.o(D)V")
    public void method2004(double arg0) {
        this.field1600 = arg0;
        this.method2005();
    }

    @ObfuscatedName("ca.n(IB)[I")
    public int[] method1984(int arg0) {
        class83 var2 = this.field1610[arg0];
        if (var2 != null) {
            if (var2.field1430 != null) {
                this.field1607.method3549(var2);
                var2.field1427 = true;
                return var2.field1430;
            }
            boolean var3 = var2.method1730(this.field1600, this.field1598, this.field1603);
            if (var3) {
                if (this.field1597 == 0) {
                    class83 var4 = (class83) this.field1607.method3552();
                    var4.method1724();
                } else {
                    this.field1597--;
                }
                this.field1607.method3549(var2);
                var2.field1427 = true;
                return var2.field1430;
            }
        }
        return null;
    }

    @ObfuscatedName("ca.d(II)I")
    public int method1987(int arg0) {
        return this.field1610[arg0] == null ? 0 : this.field1610[arg0].field1428;
    }

    @ObfuscatedName("ca.s(IB)Z")
    public boolean method1982(int arg0) {
        return this.field1610[arg0].field1423;
    }

    @ObfuscatedName("ca.q(II)Z")
    public boolean method1983(int arg0) {
        return this.field1598 == 64;
    }

    @ObfuscatedName("ca.r(I)V")
    public void method2005() {
        for (int var1 = 0; var1 < this.field1610.length; var1++) {
            if (this.field1610[var1] != null) {
                this.field1610[var1].method1724();
            }
        }
        this.field1607 = new class199();
        this.field1597 = this.field1599;
    }

    @ObfuscatedName("ca.u(II)V")
    public void method2006(int arg0) {
        for (int var2 = 0; var2 < this.field1610.length; var2++) {
            class83 var3 = this.field1610[var2];
            if (var3 != null && var3.field1429 != 0 && var3.field1427) {
                var3.method1726(arg0);
                var3.field1427 = false;
            }
        }
    }
}
