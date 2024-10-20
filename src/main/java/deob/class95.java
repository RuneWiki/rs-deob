package deob;

@ObfuscatedName("cd")
public class class95 implements class92 {

    @ObfuscatedName("cd.y")
    public class83[] field1610;

    @ObfuscatedName("cd.d")
    public class199 field1616 = new class199();

    @ObfuscatedName("cd.g")
    public int field1612;

    @ObfuscatedName("cd.w")
    public int field1613 = 0;

    @ObfuscatedName("cd.e")
    public double field1614 = 1.0D;

    @ObfuscatedName("cd.c")
    public int field1615 = 128;

    @ObfuscatedName("cd.a")
    public class167 field1611;

    public class95(class167 arg0, class167 arg1, int arg2, double arg3, int arg4) {
        this.field1611 = arg1;
        this.field1612 = arg2;
        this.field1613 = this.field1612;
        this.field1614 = arg3;
        this.field1615 = arg4;
        int[] var7 = arg0.method3057(0);
        int var8 = var7.length;
        this.field1610 = new class83[arg0.method3050(0)];
        for (int var9 = 0; var9 < var8; var9++) {
            class119 var10 = new class119(arg0.method3045(0, var7[var9]));
            this.field1610[var7[var9]] = new class83(var10);
        }
    }

    @ObfuscatedName("cd.z(D)V")
    public void method2013(double arg0) {
        this.field1614 = arg0;
        this.method2014();
    }

    @ObfuscatedName("cd.y(II)[I")
    public int[] method1997(int arg0) {
        class83 var2 = this.field1610[arg0];
        if (var2 != null) {
            if (var2.field1441 != null) {
                this.field1616.method3489(var2);
                var2.field1442 = true;
                return var2.field1441;
            }
            boolean var3 = var2.method1735(this.field1614, this.field1615, this.field1611);
            if (var3) {
                if (this.field1613 == 0) {
                    class83 var4 = (class83) this.field1616.method3492();
                    var4.method1736();
                } else {
                    this.field1613--;
                }
                this.field1616.method3489(var2);
                var2.field1442 = true;
                return var2.field1441;
            }
        }
        return null;
    }

    @ObfuscatedName("cd.d(II)I")
    public int method1994(int arg0) {
        return this.field1610[arg0] == null ? 0 : this.field1610[arg0].field1433;
    }

    @ObfuscatedName("cd.g(II)Z")
    public boolean method1996(int arg0) {
        return this.field1610[arg0].field1432;
    }

    @ObfuscatedName("cd.w(II)Z")
    public boolean method2002(int arg0) {
        return this.field1615 == 64;
    }

    @ObfuscatedName("cd.b(I)V")
    public void method2014() {
        for (int var1 = 0; var1 < this.field1610.length; var1++) {
            if (this.field1610[var1] != null) {
                this.field1610[var1].method1736();
            }
        }
        this.field1616 = new class199();
        this.field1613 = this.field1612;
    }

    @ObfuscatedName("cd.p(IS)V")
    public void method2017(int arg0) {
        for (int var2 = 0; var2 < this.field1610.length; var2++) {
            class83 var3 = this.field1610[var2];
            if (var3 != null && var3.field1431 != 0 && var3.field1442) {
                var3.method1734(arg0);
                var3.field1442 = false;
            }
        }
    }
}
