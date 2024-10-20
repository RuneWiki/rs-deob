package deob;

@ObfuscatedName("cs")
public class class88 implements class85 {

    @ObfuscatedName("cs.k")
    public class76[] field1524;

    @ObfuscatedName("cs.r")
    public class177 field1523 = new class177();

    @ObfuscatedName("cs.y")
    public int field1528;

    @ObfuscatedName("cs.w")
    public int field1521 = 0;

    @ObfuscatedName("cs.m")
    public double field1522 = 1.0D;

    @ObfuscatedName("cs.j")
    public int field1518 = 128;

    @ObfuscatedName("cs.g")
    public class146 field1520;

    public class88(class146 arg0, class146 arg1, int arg2, double arg3, int arg4) {
        this.field1520 = arg1;
        this.field1528 = arg2;
        this.field1521 = this.field1528;
        this.field1522 = arg3;
        this.field1518 = arg4;
        int[] var7 = arg0.method2687(0);
        int var8 = var7.length;
        this.field1524 = new class76[arg0.method2688(0)];
        for (int var9 = 0; var9 < var8; var9++) {
            class107 var10 = new class107(arg0.method2749(0, var7[var9]));
            this.field1524[var7[var9]] = new class76(var10);
        }
    }

    @ObfuscatedName("cs.v(D)V")
    public void method1853(double arg0) {
        this.field1522 = arg0;
        this.method1860();
    }

    @ObfuscatedName("cs.k(II)[I")
    public int[] method1847(int arg0) {
        class76 var2 = this.field1524[arg0];
        if (var2 != null) {
            if (var2.field1338 != null) {
                this.field1523.method3191(var2);
                var2.field1339 = true;
                return var2.field1338;
            }
            boolean var3 = var2.method1590(this.field1522, this.field1518, this.field1520);
            if (var3) {
                if (this.field1521 == 0) {
                    class76 var4 = (class76) this.field1523.method3194();
                    var4.method1591();
                } else {
                    this.field1521--;
                }
                this.field1523.method3191(var2);
                var2.field1339 = true;
                return var2.field1338;
            }
        }
        return null;
    }

    @ObfuscatedName("cs.r(II)I")
    public int method1843(int arg0) {
        return this.field1524[arg0] == null ? 0 : this.field1524[arg0].field1330;
    }

    @ObfuscatedName("cs.y(II)Z")
    public boolean method1837(int arg0) {
        return this.field1524[arg0].field1333;
    }

    @ObfuscatedName("cs.w(II)Z")
    public boolean method1838(int arg0) {
        return this.field1518 == 64;
    }

    @ObfuscatedName("cs.t(I)V")
    public void method1860() {
        for (int var1 = 0; var1 < this.field1524.length; var1++) {
            if (this.field1524[var1] != null) {
                this.field1524[var1].method1591();
            }
        }
        this.field1523 = new class177();
        this.field1521 = this.field1528;
    }

    @ObfuscatedName("cs.u(IB)V")
    public void method1856(int arg0) {
        for (int var2 = 0; var2 < this.field1524.length; var2++) {
            class76 var3 = this.field1524[var2];
            if (var3 != null && var3.field1336 != 0 && var3.field1339) {
                var3.method1592(arg0);
                var3.field1339 = false;
            }
        }
    }
}
