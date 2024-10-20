package deob;

@ObfuscatedName("ck")
public class class88 implements class85 {

    @ObfuscatedName("ck.e")
    public class76[] field1505;

    @ObfuscatedName("ck.p")
    public class176 field1496 = new class176();

    @ObfuscatedName("ck.a")
    public int field1497;

    @ObfuscatedName("ck.g")
    public int field1499 = 0;

    @ObfuscatedName("ck.u")
    public double field1495 = 1.0D;

    @ObfuscatedName("ck.k")
    public int field1500 = 128;

    @ObfuscatedName("ck.m")
    public class145 field1501;

    public class88(class145 arg0, class145 arg1, int arg2, double arg3, int arg4) {
        this.field1501 = arg1;
        this.field1497 = arg2;
        this.field1499 = this.field1497;
        this.field1495 = arg3;
        this.field1500 = arg4;
        int[] var7 = arg0.method2737(0);
        int var8 = var7.length;
        this.field1505 = new class76[arg0.method2726(0)];
        for (int var9 = 0; var9 < var8; var9++) {
            class107 var10 = new class107(arg0.method2717(0, var7[var9]));
            this.field1505[var7[var9]] = new class76(var10);
        }
    }

    @ObfuscatedName("ck.v(D)V")
    public void method1878(double arg0) {
        this.field1495 = arg0;
        this.method1876();
    }

    @ObfuscatedName("ck.e(IB)[I")
    public int[] method1856(int arg0) {
        class76 var2 = this.field1505[arg0];
        if (var2 != null) {
            if (var2.field1329 != null) {
                this.field1496.method3221(var2);
                var2.field1326 = true;
                return var2.field1329;
            }
            boolean var3 = var2.method1600(this.field1495, this.field1500, this.field1501);
            if (var3) {
                if (this.field1499 == 0) {
                    class76 var4 = (class76) this.field1496.method3224();
                    var4.method1594();
                } else {
                    this.field1499--;
                }
                this.field1496.method3221(var2);
                var2.field1326 = true;
                return var2.field1329;
            }
        }
        return null;
    }

    @ObfuscatedName("ck.p(IB)I")
    public int method1851(int arg0) {
        return this.field1505[arg0] == null ? 0 : this.field1505[arg0].field1317;
    }

    @ObfuscatedName("ck.a(IS)Z")
    public boolean method1852(int arg0) {
        return this.field1505[arg0].field1328;
    }

    @ObfuscatedName("ck.g(IB)Z")
    public boolean method1853(int arg0) {
        return this.field1500 == 64;
    }

    @ObfuscatedName("ck.n(B)V")
    public void method1876() {
        for (int var1 = 0; var1 < this.field1505.length; var1++) {
            if (this.field1505[var1] != null) {
                this.field1505[var1].method1594();
            }
        }
        this.field1496 = new class176();
        this.field1499 = this.field1497;
    }

    @ObfuscatedName("ck.w(IB)V")
    public void method1877(int arg0) {
        for (int var2 = 0; var2 < this.field1505.length; var2++) {
            class76 var3 = this.field1505[var2];
            if (var3 != null && var3.field1327 != 0 && var3.field1326) {
                var3.method1595(arg0);
                var3.field1326 = false;
            }
        }
    }
}
