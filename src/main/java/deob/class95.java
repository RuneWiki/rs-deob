package deob;

@ObfuscatedName("cb")
public class class95 implements class92 {

    @ObfuscatedName("cb.a")
    public class83[] field1608;

    @ObfuscatedName("cb.r")
    public class199 field1607 = new class199();

    @ObfuscatedName("cb.f")
    public int field1612;

    @ObfuscatedName("cb.s")
    public int field1609 = 0;

    @ObfuscatedName("cb.y")
    public double field1610 = 1.0D;

    @ObfuscatedName("cb.e")
    public int field1611 = 128;

    @ObfuscatedName("cb.g")
    public class167 field1616;

    public class95(class167 arg0, class167 arg1, int arg2, double arg3, int arg4) {
        this.field1616 = arg1;
        this.field1612 = arg2;
        this.field1609 = this.field1612;
        this.field1610 = arg3;
        this.field1611 = arg4;
        int[] var7 = arg0.method3034(0);
        int var8 = var7.length;
        this.field1608 = new class83[arg0.method3035(0)];
        for (int var9 = 0; var9 < var8; var9++) {
            class119 var10 = new class119(arg0.method3025(0, var7[var9]));
            this.field1608[var7[var9]] = new class83(var10);
        }
    }

    @ObfuscatedName("cb.z(D)V")
    public void method2045(double arg0) {
        this.field1610 = arg0;
        this.method2046();
    }

    @ObfuscatedName("cb.a(IB)[I")
    public int[] method2037(int arg0) {
        class83 var2 = this.field1608[arg0];
        if (var2 != null) {
            if (var2.field1438 != null) {
                this.field1607.method3571(var2);
                var2.field1439 = true;
                return var2.field1438;
            }
            boolean var3 = var2.method1770(this.field1610, this.field1611, this.field1616);
            if (var3) {
                if (this.field1609 == 0) {
                    class83 var4 = (class83) this.field1607.method3574();
                    var4.method1767();
                } else {
                    this.field1609--;
                }
                this.field1607.method3571(var2);
                var2.field1439 = true;
                return var2.field1438;
            }
        }
        return null;
    }

    @ObfuscatedName("cb.r(II)I")
    public int method2035(int arg0) {
        return this.field1608[arg0] == null ? 0 : this.field1608[arg0].field1430;
    }

    @ObfuscatedName("cb.f(II)Z")
    public boolean method2024(int arg0) {
        return this.field1608[arg0].field1431;
    }

    @ObfuscatedName("cb.s(II)Z")
    public boolean method2027(int arg0) {
        return this.field1611 == 64;
    }

    @ObfuscatedName("cb.u(B)V")
    public void method2046() {
        for (int var1 = 0; var1 < this.field1608.length; var1++) {
            if (this.field1608[var1] != null) {
                this.field1608[var1].method1767();
            }
        }
        this.field1607 = new class199();
        this.field1609 = this.field1612;
    }

    @ObfuscatedName("cb.t(II)V")
    public void method2056(int arg0) {
        for (int var2 = 0; var2 < this.field1608.length; var2++) {
            class83 var3 = this.field1608[var2];
            if (var3 != null && var3.field1432 != 0 && var3.field1439) {
                var3.method1769(arg0);
                var3.field1439 = false;
            }
        }
    }
}
