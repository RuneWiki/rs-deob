package deob;

@ObfuscatedName("ci")
public class class88 implements class85 {

    @ObfuscatedName("ci.g")
    public class76[] field1522;

    @ObfuscatedName("ci.s")
    public class178 field1526 = new class178();

    @ObfuscatedName("ci.v")
    public int field1521;

    @ObfuscatedName("ci.o")
    public int field1524 = 0;

    @ObfuscatedName("ci.k")
    public double field1525 = 1.0D;

    @ObfuscatedName("ci.m")
    public int field1523 = 128;

    @ObfuscatedName("ci.i")
    public class147 field1527;

    public class88(class147 arg0, class147 arg1, int arg2, double arg3, int arg4) {
        this.field1527 = arg1;
        this.field1521 = arg2;
        this.field1524 = this.field1521;
        this.field1525 = arg3;
        this.field1523 = arg4;
        int[] var7 = arg0.method2739(0);
        int var8 = var7.length;
        this.field1522 = new class76[arg0.method2722(0)];
        for (int var9 = 0; var9 < var8; var9++) {
            class107 var10 = new class107(arg0.method2703(0, var7[var9]));
            this.field1522[var7[var9]] = new class76(var10);
        }
    }

    @ObfuscatedName("ci.q(D)V")
    public void method1822(double arg0) {
        this.field1525 = arg0;
        this.method1824();
    }

    @ObfuscatedName("ci.g(II)[I")
    public int[] method1804(int arg0) {
        class76 var2 = this.field1522[arg0];
        if (var2 != null) {
            if (var2.field1345 != null) {
                this.field1526.method3185(var2);
                var2.field1346 = true;
                return var2.field1345;
            }
            boolean var3 = var2.method1558(this.field1525, this.field1523, this.field1527);
            if (var3) {
                if (this.field1524 == 0) {
                    class76 var4 = (class76) this.field1526.method3188();
                    var4.method1559();
                } else {
                    this.field1524--;
                }
                this.field1526.method3185(var2);
                var2.field1346 = true;
                return var2.field1345;
            }
        }
        return null;
    }

    @ObfuscatedName("ci.s(IB)I")
    public int method1800(int arg0) {
        return this.field1522[arg0] == null ? 0 : this.field1522[arg0].field1337;
    }

    @ObfuscatedName("ci.v(II)Z")
    public boolean method1801(int arg0) {
        return this.field1522[arg0].field1342;
    }

    @ObfuscatedName("ci.o(II)Z")
    public boolean method1802(int arg0) {
        return this.field1523 == 64;
    }

    @ObfuscatedName("ci.n(I)V")
    public void method1824() {
        for (int var1 = 0; var1 < this.field1522.length; var1++) {
            if (this.field1522[var1] != null) {
                this.field1522[var1].method1559();
            }
        }
        this.field1526 = new class178();
        this.field1524 = this.field1521;
    }

    @ObfuscatedName("ci.h(II)V")
    public void method1827(int arg0) {
        for (int var2 = 0; var2 < this.field1522.length; var2++) {
            class76 var3 = this.field1522[var2];
            if (var3 != null && var3.field1343 != 0 && var3.field1346) {
                var3.method1566(arg0);
                var3.field1346 = false;
            }
        }
    }
}
