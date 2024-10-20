package deob;

@ObfuscatedName("cp")
public class class96 implements class93 {

    @ObfuscatedName("cp.f")
    public class84[] field1628;

    @ObfuscatedName("cp.u")
    public class200 field1622 = new class200();

    @ObfuscatedName("cp.x")
    public int field1623;

    @ObfuscatedName("cp.b")
    public int field1624 = 0;

    @ObfuscatedName("cp.l")
    public double field1631 = 1.0D;

    @ObfuscatedName("cp.d")
    public int field1626 = 128;

    @ObfuscatedName("cp.n")
    public class168 field1627;

    public class96(class168 arg0, class168 arg1, int arg2, double arg3, int arg4) {
        this.field1627 = arg1;
        this.field1623 = arg2;
        this.field1624 = this.field1623;
        this.field1631 = arg3;
        this.field1626 = arg4;
        int[] var7 = arg0.method3117(0);
        int var8 = var7.length;
        this.field1628 = new class84[arg0.method3096(0)];
        for (int var9 = 0; var9 < var8; var9++) {
            class120 var10 = new class120(arg0.method3061(0, var7[var9]));
            this.field1628[var7[var9]] = new class84(var10);
        }
    }

    @ObfuscatedName("cp.t(D)V")
    public void method2087(double arg0) {
        this.field1631 = arg0;
        this.method2085();
    }

    @ObfuscatedName("cp.f(II)[I")
    public int[] method2071(int arg0) {
        class84 var2 = this.field1628[arg0];
        if (var2 != null) {
            if (var2.field1458 != null) {
                this.field1622.method3584(var2);
                var2.field1459 = true;
                return var2.field1458;
            }
            boolean var3 = var2.method1809(this.field1631, this.field1626, this.field1627);
            if (var3) {
                if (this.field1624 == 0) {
                    class84 var4 = (class84) this.field1622.method3583();
                    var4.method1808();
                } else {
                    this.field1624--;
                }
                this.field1622.method3584(var2);
                var2.field1459 = true;
                return var2.field1458;
            }
        }
        return null;
    }

    @ObfuscatedName("cp.u(II)I")
    public int method2065(int arg0) {
        return this.field1628[arg0] == null ? 0 : this.field1628[arg0].field1450;
    }

    @ObfuscatedName("cp.x(II)Z")
    public boolean method2066(int arg0) {
        return this.field1628[arg0].field1452;
    }

    @ObfuscatedName("cp.b(IB)Z")
    public boolean method2067(int arg0) {
        return this.field1626 == 64;
    }

    @ObfuscatedName("cp.w(I)V")
    public void method2085() {
        for (int var1 = 0; var1 < this.field1628.length; var1++) {
            if (this.field1628[var1] != null) {
                this.field1628[var1].method1808();
            }
        }
        this.field1622 = new class200();
        this.field1624 = this.field1623;
    }

    @ObfuscatedName("cp.v(II)V")
    public void method2086(int arg0) {
        for (int var2 = 0; var2 < this.field1628.length; var2++) {
            class84 var3 = this.field1628[var2];
            if (var3 != null && var3.field1456 != 0 && var3.field1459) {
                var3.method1810(arg0);
                var3.field1459 = false;
            }
        }
    }
}
