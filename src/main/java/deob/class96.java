package deob;

@ObfuscatedName("co")
public class class96 implements class93 {

    @ObfuscatedName("co.a")
    public class84[] field1621;

    @ObfuscatedName("co.w")
    public class200 field1622 = new class200();

    @ObfuscatedName("co.d")
    public int field1625;

    @ObfuscatedName("co.c")
    public int field1623 = 0;

    @ObfuscatedName("co.y")
    public double field1624 = 1.0D;

    @ObfuscatedName("co.k")
    public int field1620 = 128;

    @ObfuscatedName("co.r")
    public class168 field1626;

    public class96(class168 arg0, class168 arg1, int arg2, double arg3, int arg4) {
        this.field1626 = arg1;
        this.field1625 = arg2;
        this.field1623 = this.field1625;
        this.field1624 = arg3;
        this.field1620 = arg4;
        int[] var7 = arg0.method3153(0);
        int var8 = var7.length;
        this.field1621 = new class84[arg0.method3157(0)];
        for (int var9 = 0; var9 < var8; var9++) {
            class120 var10 = new class120(arg0.method3188(0, var7[var9]));
            this.field1621[var7[var9]] = new class84(var10);
        }
    }

    @ObfuscatedName("co.i(D)V")
    public void method2129(double arg0) {
        this.field1624 = arg0;
        this.method2127();
    }

    @ObfuscatedName("co.a(IB)[I")
    public int[] method2118(int arg0) {
        class84 var2 = this.field1621[arg0];
        if (var2 != null) {
            if (var2.field1442 != null) {
                this.field1622.method3640(var2);
                var2.field1453 = true;
                return var2.field1442;
            }
            boolean var3 = var2.method1859(this.field1624, this.field1620, this.field1626);
            if (var3) {
                if (this.field1623 == 0) {
                    class84 var4 = (class84) this.field1622.method3647();
                    var4.method1858();
                } else {
                    this.field1623--;
                }
                this.field1622.method3640(var2);
                var2.field1453 = true;
                return var2.field1442;
            }
        }
        return null;
    }

    @ObfuscatedName("co.w(II)I")
    public int method2107(int arg0) {
        return this.field1621[arg0] == null ? 0 : this.field1621[arg0].field1445;
    }

    @ObfuscatedName("co.d(IB)Z")
    public boolean method2108(int arg0) {
        return this.field1621[arg0].field1451;
    }

    @ObfuscatedName("co.c(II)Z")
    public boolean method2109(int arg0) {
        return this.field1620 == 64;
    }

    @ObfuscatedName("co.t(I)V")
    public void method2127() {
        for (int var1 = 0; var1 < this.field1621.length; var1++) {
            if (this.field1621[var1] != null) {
                this.field1621[var1].method1858();
            }
        }
        this.field1622 = new class200();
        this.field1623 = this.field1625;
    }

    @ObfuscatedName("co.n(II)V")
    public void method2128(int arg0) {
        for (int var2 = 0; var2 < this.field1621.length; var2++) {
            class84 var3 = this.field1621[var2];
            if (var3 != null && var3.field1454 != 0 && var3.field1453) {
                var3.method1860(arg0);
                var3.field1453 = false;
            }
        }
    }
}
