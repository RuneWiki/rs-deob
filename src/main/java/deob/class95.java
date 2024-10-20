package deob;

@ObfuscatedName("cm")
public class class95 implements class92 {

    @ObfuscatedName("cm.g")
    public class83[] field1610;

    @ObfuscatedName("cm.b")
    public class199 field1602 = new class199();

    @ObfuscatedName("cm.w")
    public int field1603;

    @ObfuscatedName("cm.d")
    public int field1604 = 0;

    @ObfuscatedName("cm.z")
    public double field1608 = 1.0D;

    @ObfuscatedName("cm.l")
    public int field1611 = 128;

    @ObfuscatedName("cm.m")
    public class167 field1605;

    public class95(class167 arg0, class167 arg1, int arg2, double arg3, int arg4) {
        this.field1605 = arg1;
        this.field1603 = arg2;
        this.field1604 = this.field1603;
        this.field1608 = arg3;
        this.field1611 = arg4;
        int[] var7 = arg0.method3087(0);
        int var8 = var7.length;
        this.field1610 = new class83[arg0.method3088(0)];
        for (int var9 = 0; var9 < var8; var9++) {
            class119 var10 = new class119(arg0.method3112(0, var7[var9]));
            this.field1610[var7[var9]] = new class83(var10);
        }
    }

    @ObfuscatedName("cm.k(D)V")
    public void method2058(double arg0) {
        this.field1608 = arg0;
        this.method2060();
    }

    @ObfuscatedName("cm.g(II)[I")
    public int[] method2048(int arg0) {
        class83 var2 = this.field1610[arg0];
        if (var2 != null) {
            if (var2.field1437 != null) {
                this.field1602.method3599(var2);
                var2.field1438 = true;
                return var2.field1437;
            }
            boolean var3 = var2.method1776(this.field1608, this.field1611, this.field1605);
            if (var3) {
                if (this.field1604 == 0) {
                    class83 var4 = (class83) this.field1602.method3602();
                    var4.method1779();
                } else {
                    this.field1604--;
                }
                this.field1602.method3599(var2);
                var2.field1438 = true;
                return var2.field1437;
            }
        }
        return null;
    }

    @ObfuscatedName("cm.b(IB)I")
    public int method2041(int arg0) {
        return this.field1610[arg0] == null ? 0 : this.field1610[arg0].field1434;
    }

    @ObfuscatedName("cm.w(II)Z")
    public boolean method2042(int arg0) {
        return this.field1610[arg0].field1430;
    }

    @ObfuscatedName("cm.d(II)Z")
    public boolean method2043(int arg0) {
        return this.field1611 == 64;
    }

    @ObfuscatedName("cm.f(I)V")
    public void method2060() {
        for (int var1 = 0; var1 < this.field1610.length; var1++) {
            if (this.field1610[var1] != null) {
                this.field1610[var1].method1779();
            }
        }
        this.field1602 = new class199();
        this.field1604 = this.field1603;
    }

    @ObfuscatedName("cm.x(II)V")
    public void method2061(int arg0) {
        for (int var2 = 0; var2 < this.field1610.length; var2++) {
            class83 var3 = this.field1610[var2];
            if (var3 != null && var3.field1432 != 0 && var3.field1438) {
                var3.method1778(arg0);
                var3.field1438 = false;
            }
        }
    }
}
