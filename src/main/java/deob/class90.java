package deob;

@ObfuscatedName("cs")
public class class90 implements class87 {

    @ObfuscatedName("cs.p")
    public class78[] field1565;

    @ObfuscatedName("cs.k")
    public class190 field1555 = new class190();

    @ObfuscatedName("cs.e")
    public int field1558;

    @ObfuscatedName("cs.f")
    public int field1557 = 0;

    @ObfuscatedName("cs.w")
    public double field1554 = 1.0D;

    @ObfuscatedName("cs.t")
    public int field1559 = 128;

    @ObfuscatedName("cs.s")
    public class158 field1560;

    public class90(class158 arg0, class158 arg1, int arg2, double arg3, int arg4) {
        this.field1560 = arg1;
        this.field1558 = arg2;
        this.field1557 = this.field1558;
        this.field1554 = arg3;
        this.field1559 = arg4;
        int[] var7 = arg0.method2905(0);
        int var8 = var7.length;
        this.field1565 = new class78[arg0.method2904(0)];
        for (int var9 = 0; var9 < var8; var9++) {
            class111 var10 = new class111(arg0.method2896(0, var7[var9]));
            this.field1565[var7[var9]] = new class78(var10);
        }
    }

    @ObfuscatedName("cs.x(D)V")
    public void method1898(double arg0) {
        this.field1554 = arg0;
        this.method1897();
    }

    @ObfuscatedName("cs.p(II)[I")
    public int[] method1880(int arg0) {
        class78 var2 = this.field1565[arg0];
        if (var2 != null) {
            if (var2.field1377 != null) {
                this.field1555.method3438(var2);
                var2.field1379 = true;
                return var2.field1377;
            }
            boolean var3 = var2.method1613(this.field1554, this.field1559, this.field1560);
            if (var3) {
                if (this.field1557 == 0) {
                    class78 var4 = (class78) this.field1555.method3440();
                    var4.method1611();
                } else {
                    this.field1557--;
                }
                this.field1555.method3438(var2);
                var2.field1379 = true;
                return var2.field1377;
            }
        }
        return null;
    }

    @ObfuscatedName("cs.k(IB)I")
    public int method1883(int arg0) {
        return this.field1565[arg0] == null ? 0 : this.field1565[arg0].field1366;
    }

    @ObfuscatedName("cs.e(IB)Z")
    public boolean method1887(int arg0) {
        return this.field1565[arg0].field1371;
    }

    @ObfuscatedName("cs.f(II)Z")
    public boolean method1881(int arg0) {
        return this.field1559 == 64;
    }

    @ObfuscatedName("cs.o(I)V")
    public void method1897() {
        for (int var1 = 0; var1 < this.field1565.length; var1++) {
            if (this.field1565[var1] != null) {
                this.field1565[var1].method1611();
            }
        }
        this.field1555 = new class190();
        this.field1557 = this.field1558;
    }

    @ObfuscatedName("cs.r(II)V")
    public void method1907(int arg0) {
        for (int var2 = 0; var2 < this.field1565.length; var2++) {
            class78 var3 = this.field1565[var2];
            if (var3 != null && var3.field1376 != 0 && var3.field1379) {
                var3.method1612(arg0);
                var3.field1379 = false;
            }
        }
    }
}
