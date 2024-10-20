package deob;

@ObfuscatedName("cg")
public class class88 implements class85 {

    @ObfuscatedName("cg.g")
    public class76[] field1525;

    @ObfuscatedName("cg.i")
    public class178 field1521 = new class178();

    @ObfuscatedName("cg.k")
    public int field1523;

    @ObfuscatedName("cg.e")
    public int field1522 = 0;

    @ObfuscatedName("cg.w")
    public double field1519 = 1.0D;

    @ObfuscatedName("cg.m")
    public int field1520 = 128;

    @ObfuscatedName("cg.u")
    public class147 field1524;

    public class88(class147 arg0, class147 arg1, int arg2, double arg3, int arg4) {
        this.field1524 = arg1;
        this.field1523 = arg2;
        this.field1522 = this.field1523;
        this.field1519 = arg3;
        this.field1520 = arg4;
        int[] var7 = arg0.method2693(0);
        int var8 = var7.length;
        this.field1525 = new class76[arg0.method2681(0)];
        for (int var9 = 0; var9 < var8; var9++) {
            class107 var10 = new class107(arg0.method2734(0, var7[var9]));
            this.field1525[var7[var9]] = new class76(var10);
        }
    }

    @ObfuscatedName("cg.t(D)V")
    public void method1837(double arg0) {
        this.field1519 = arg0;
        this.method1840();
    }

    @ObfuscatedName("cg.g(II)[I")
    public int[] method1827(int arg0) {
        class76 var2 = this.field1525[arg0];
        if (var2 != null) {
            if (var2.field1339 != null) {
                this.field1521.method3203(var2);
                var2.field1347 = true;
                return var2.field1339;
            }
            boolean var3 = var2.method1555(this.field1519, this.field1520, this.field1524);
            if (var3) {
                if (this.field1522 == 0) {
                    class76 var4 = (class76) this.field1521.method3208();
                    var4.method1558();
                } else {
                    this.field1522--;
                }
                this.field1521.method3203(var2);
                var2.field1347 = true;
                return var2.field1339;
            }
        }
        return null;
    }

    @ObfuscatedName("cg.i(II)I")
    public int method1816(int arg0) {
        return this.field1525[arg0] == null ? 0 : this.field1525[arg0].field1338;
    }

    @ObfuscatedName("cg.k(IB)Z")
    public boolean method1817(int arg0) {
        return this.field1525[arg0].field1337;
    }

    @ObfuscatedName("cg.e(II)Z")
    public boolean method1818(int arg0) {
        return this.field1520 == 64;
    }

    @ObfuscatedName("cg.y(I)V")
    public void method1840() {
        for (int var1 = 0; var1 < this.field1525.length; var1++) {
            if (this.field1525[var1] != null) {
                this.field1525[var1].method1558();
            }
        }
        this.field1521 = new class178();
        this.field1522 = this.field1523;
    }

    @ObfuscatedName("cg.d(II)V")
    public void method1841(int arg0) {
        for (int var2 = 0; var2 < this.field1525.length; var2++) {
            class76 var3 = this.field1525[var2];
            if (var3 != null && var3.field1346 != 0 && var3.field1347) {
                var3.method1562(arg0);
                var3.field1347 = false;
            }
        }
    }
}
