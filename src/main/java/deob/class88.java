package deob;

@ObfuscatedName("cr")
public class class88 implements class85 {

    @ObfuscatedName("cr.k")
    public class76[] field1486;

    @ObfuscatedName("cr.y")
    public class178 field1487 = new class178();

    @ObfuscatedName("cr.s")
    public int field1485;

    @ObfuscatedName("cr.g")
    public int field1492 = 0;

    @ObfuscatedName("cr.h")
    public double field1483 = 1.0D;

    @ObfuscatedName("cr.l")
    public int field1488 = 128;

    @ObfuscatedName("cr.e")
    public class147 field1489;

    public class88(class147 arg0, class147 arg1, int arg2, double arg3, int arg4) {
        this.field1489 = arg1;
        this.field1485 = arg2;
        this.field1492 = this.field1485;
        this.field1483 = arg3;
        this.field1488 = arg4;
        int[] var7 = arg0.method2738(0);
        int var8 = var7.length;
        this.field1486 = new class76[arg0.method2739(0)];
        for (int var9 = 0; var9 < var8; var9++) {
            class107 var10 = new class107(arg0.method2729(0, var7[var9]));
            this.field1486[var7[var9]] = new class76(var10);
        }
    }

    @ObfuscatedName("cr.w(D)V")
    public void method1883(double arg0) {
        this.field1483 = arg0;
        this.method1880();
    }

    @ObfuscatedName("cr.k(II)[I")
    public int[] method1866(int arg0) {
        class76 var2 = this.field1486[arg0];
        if (var2 != null) {
            if (var2.field1309 != null) {
                this.field1487.method3294(var2);
                var2.field1322 = true;
                return var2.field1309;
            }
            boolean var3 = var2.method1589(this.field1483, this.field1488, this.field1489);
            if (var3) {
                if (this.field1492 == 0) {
                    class76 var4 = (class76) this.field1487.method3275();
                    var4.method1588();
                } else {
                    this.field1492--;
                }
                this.field1487.method3294(var2);
                var2.field1322 = true;
                return var2.field1309;
            }
        }
        return null;
    }

    @ObfuscatedName("cr.y(II)I")
    public int method1853(int arg0) {
        return this.field1486[arg0] == null ? 0 : this.field1486[arg0].field1316;
    }

    @ObfuscatedName("cr.s(II)Z")
    public boolean method1861(int arg0) {
        return this.field1486[arg0].field1321;
    }

    @ObfuscatedName("cr.g(II)Z")
    public boolean method1860(int arg0) {
        return this.field1488 == 64;
    }

    @ObfuscatedName("cr.b(B)V")
    public void method1880() {
        for (int var1 = 0; var1 < this.field1486.length; var1++) {
            if (this.field1486[var1] != null) {
                this.field1486[var1].method1588();
            }
        }
        this.field1487 = new class178();
        this.field1492 = this.field1485;
    }

    @ObfuscatedName("cr.x(IS)V")
    public void method1877(int arg0) {
        for (int var2 = 0; var2 < this.field1486.length; var2++) {
            class76 var3 = this.field1486[var2];
            if (var3 != null && var3.field1313 != 0 && var3.field1322) {
                var3.method1590(arg0);
                var3.field1322 = false;
            }
        }
    }
}
