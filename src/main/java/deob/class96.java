package deob;

@ObfuscatedName("cz")
public class class96 implements class93 {

    @ObfuscatedName("cz.b")
    public class84[] field1598;

    @ObfuscatedName("cz.g")
    public class200 field1591 = new class200();

    @ObfuscatedName("cz.j")
    public int field1592;

    @ObfuscatedName("cz.d")
    public int field1593 = 0;

    @ObfuscatedName("cz.x")
    public double field1594 = 1.0D;

    @ObfuscatedName("cz.y")
    public int field1595 = 128;

    @ObfuscatedName("cz.r")
    public class168 field1600;

    public class96(class168 arg0, class168 arg1, int arg2, double arg3, int arg4) {
        this.field1600 = arg1;
        this.field1592 = arg2;
        this.field1593 = this.field1592;
        this.field1594 = arg3;
        this.field1595 = arg4;
        int[] var7 = arg0.method3078(0);
        int var8 = var7.length;
        this.field1598 = new class84[arg0.method3047(0)];
        for (int var9 = 0; var9 < var8; var9++) {
            class120 var10 = new class120(arg0.method3037(0, var7[var9]));
            this.field1598[var7[var9]] = new class84(var10);
        }
    }

    @ObfuscatedName("cz.z(D)V")
    public void method2029(double arg0) {
        this.field1594 = arg0;
        this.method2030();
    }

    @ObfuscatedName("cz.b(II)[I")
    public int[] method2018(int arg0) {
        class84 var2 = this.field1598[arg0];
        if (var2 != null) {
            if (var2.field1420 != null) {
                this.field1591.method3551(var2);
                var2.field1409 = true;
                return var2.field1420;
            }
            boolean var3 = var2.method1757(this.field1594, this.field1595, this.field1600);
            if (var3) {
                if (this.field1593 == 0) {
                    class84 var4 = (class84) this.field1591.method3549();
                    var4.method1758();
                } else {
                    this.field1593--;
                }
                this.field1591.method3551(var2);
                var2.field1409 = true;
                return var2.field1420;
            }
        }
        return null;
    }

    @ObfuscatedName("cz.g(II)I")
    public int method2015(int arg0) {
        return this.field1598[arg0] == null ? 0 : this.field1598[arg0].field1412;
    }

    @ObfuscatedName("cz.j(IB)Z")
    public boolean method2013(int arg0) {
        return this.field1598[arg0].field1413;
    }

    @ObfuscatedName("cz.d(II)Z")
    public boolean method2016(int arg0) {
        return this.field1595 == 64;
    }

    @ObfuscatedName("cz.k(B)V")
    public void method2030() {
        for (int var1 = 0; var1 < this.field1598.length; var1++) {
            if (this.field1598[var1] != null) {
                this.field1598[var1].method1758();
            }
        }
        this.field1591 = new class200();
        this.field1593 = this.field1592;
    }

    @ObfuscatedName("cz.o(II)V")
    public void method2031(int arg0) {
        for (int var2 = 0; var2 < this.field1598.length; var2++) {
            class84 var3 = this.field1598[var2];
            if (var3 != null && var3.field1415 != 0 && var3.field1409) {
                var3.method1759(arg0);
                var3.field1409 = false;
            }
        }
    }
}
