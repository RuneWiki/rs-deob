package deob;

@ObfuscatedName("cu")
public class class88 implements class85 {

    @ObfuscatedName("cu.y")
    public class76[] field1508;

    @ObfuscatedName("cu.u")
    public class176 field1511 = new class176();

    @ObfuscatedName("cu.k")
    public int field1507;

    @ObfuscatedName("cu.v")
    public int field1512 = 0;

    @ObfuscatedName("cu.l")
    public double field1510 = 1.0D;

    @ObfuscatedName("cu.g")
    public int field1513 = 128;

    @ObfuscatedName("cu.a")
    public class145 field1509;

    public class88(class145 arg0, class145 arg1, int arg2, double arg3, int arg4) {
        this.field1509 = arg1;
        this.field1507 = arg2;
        this.field1512 = this.field1507;
        this.field1510 = arg3;
        this.field1513 = arg4;
        int[] var7 = arg0.method2713(0);
        int var8 = var7.length;
        this.field1508 = new class76[arg0.method2714(0)];
        for (int var9 = 0; var9 < var8; var9++) {
            class107 var10 = new class107(arg0.method2704(0, var7[var9]));
            this.field1508[var7[var9]] = new class76(var10);
        }
    }

    @ObfuscatedName("cu.j(D)V")
    public void method1855(double arg0) {
        this.field1510 = arg0;
        this.method1857();
    }

    @ObfuscatedName("cu.y(II)[I")
    public int[] method1845(int arg0) {
        class76 var2 = this.field1508[arg0];
        if (var2 != null) {
            if (var2.field1324 != null) {
                this.field1511.method3211(var2);
                var2.field1329 = true;
                return var2.field1324;
            }
            boolean var3 = var2.method1580(this.field1510, this.field1513, this.field1509);
            if (var3) {
                if (this.field1512 == 0) {
                    class76 var4 = (class76) this.field1511.method3206();
                    var4.method1581();
                } else {
                    this.field1512--;
                }
                this.field1511.method3211(var2);
                var2.field1329 = true;
                return var2.field1324;
            }
        }
        return null;
    }

    @ObfuscatedName("cu.u(II)I")
    public int method1846(int arg0) {
        return this.field1508[arg0] == null ? 0 : this.field1508[arg0].field1326;
    }

    @ObfuscatedName("cu.k(II)Z")
    public boolean method1833(int arg0) {
        return this.field1508[arg0].field1321;
    }

    @ObfuscatedName("cu.v(IB)Z")
    public boolean method1844(int arg0) {
        return this.field1513 == 64;
    }

    @ObfuscatedName("cu.b(S)V")
    public void method1857() {
        for (int var1 = 0; var1 < this.field1508.length; var1++) {
            if (this.field1508[var1] != null) {
                this.field1508[var1].method1581();
            }
        }
        this.field1511 = new class176();
        this.field1512 = this.field1507;
    }

    @ObfuscatedName("cu.i(IB)V")
    public void method1858(int arg0) {
        for (int var2 = 0; var2 < this.field1508.length; var2++) {
            class76 var3 = this.field1508[var2];
            if (var3 != null && var3.field1328 != 0 && var3.field1329) {
                var3.method1579(arg0);
                var3.field1329 = false;
            }
        }
    }
}
