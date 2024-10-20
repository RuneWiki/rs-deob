package deob;

@ObfuscatedName("ct")
public class class95 implements class92 {

    @ObfuscatedName("ct.z")
    public class83[] field1616;

    @ObfuscatedName("ct.q")
    public class199 field1614 = new class199();

    @ObfuscatedName("ct.k")
    public int field1613;

    @ObfuscatedName("ct.f")
    public int field1619 = 0;

    @ObfuscatedName("ct.d")
    public double field1612 = 1.0D;

    @ObfuscatedName("ct.l")
    public int field1621 = 128;

    @ObfuscatedName("ct.r")
    public class167 field1617;

    public class95(class167 arg0, class167 arg1, int arg2, double arg3, int arg4) {
        this.field1617 = arg1;
        this.field1613 = arg2;
        this.field1619 = this.field1613;
        this.field1612 = arg3;
        this.field1621 = arg4;
        int[] var7 = arg0.method3001(0);
        int var8 = var7.length;
        this.field1616 = new class83[arg0.method2996(0)];
        for (int var9 = 0; var9 < var8; var9++) {
            class119 var10 = new class119(arg0.method2986(0, var7[var9]));
            this.field1616[var7[var9]] = new class83(var10);
        }
    }

    @ObfuscatedName("ct.b(D)V")
    public void method1975(double arg0) {
        this.field1612 = arg0;
        this.method1974();
    }

    @ObfuscatedName("ct.z(II)[I")
    public int[] method1957(int arg0) {
        class83 var2 = this.field1616[arg0];
        if (var2 != null) {
            if (var2.field1426 != null) {
                this.field1614.method3498(var2);
                var2.field1439 = true;
                return var2.field1426;
            }
            boolean var3 = var2.method1703(this.field1612, this.field1621, this.field1617);
            if (var3) {
                if (this.field1619 == 0) {
                    class83 var4 = (class83) this.field1614.method3495();
                    var4.method1708();
                } else {
                    this.field1619--;
                }
                this.field1614.method3498(var2);
                var2.field1439 = true;
                return var2.field1426;
            }
        }
        return null;
    }

    @ObfuscatedName("ct.q(II)I")
    public int method1966(int arg0) {
        return this.field1616[arg0] == null ? 0 : this.field1616[arg0].field1430;
    }

    @ObfuscatedName("ct.k(IB)Z")
    public boolean method1958(int arg0) {
        return this.field1616[arg0].field1436;
    }

    @ObfuscatedName("ct.f(II)Z")
    public boolean method1959(int arg0) {
        return this.field1621 == 64;
    }

    @ObfuscatedName("ct.c(B)V")
    public void method1974() {
        for (int var1 = 0; var1 < this.field1616.length; var1++) {
            if (this.field1616[var1] != null) {
                this.field1616[var1].method1708();
            }
        }
        this.field1614 = new class199();
        this.field1619 = this.field1613;
    }

    @ObfuscatedName("ct.v(IB)V")
    public void method1973(int arg0) {
        for (int var2 = 0; var2 < this.field1616.length; var2++) {
            class83 var3 = this.field1616[var2];
            if (var3 != null && var3.field1433 != 0 && var3.field1439) {
                var3.method1706(arg0);
                var3.field1439 = false;
            }
        }
    }
}
