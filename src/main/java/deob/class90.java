package deob;

@ObfuscatedName("cg")
public class class90 implements class87 {

    @ObfuscatedName("cg.n")
    public class78[] field1567;

    @ObfuscatedName("cg.g")
    public class190 field1565 = new class190();

    @ObfuscatedName("cg.a")
    public int field1566;

    @ObfuscatedName("cg.m")
    public int field1568 = 0;

    @ObfuscatedName("cg.s")
    public double field1564 = 1.0D;

    @ObfuscatedName("cg.j")
    public int field1569 = 128;

    @ObfuscatedName("cg.f")
    public class158 field1570;

    public class90(class158 arg0, class158 arg1, int arg2, double arg3, int arg4) {
        this.field1570 = arg1;
        this.field1566 = arg2;
        this.field1568 = this.field1566;
        this.field1564 = arg3;
        this.field1569 = arg4;
        int[] var7 = arg0.method2918(0);
        int var8 = var7.length;
        this.field1567 = new class78[arg0.method2919(0)];
        for (int var9 = 0; var9 < var8; var9++) {
            class111 var10 = new class111(arg0.method2929(0, var7[var9]));
            this.field1567[var7[var9]] = new class78(var10);
        }
    }

    @ObfuscatedName("cg.e(D)V")
    public void method1943(double arg0) {
        this.field1564 = arg0;
        this.method1946();
    }

    @ObfuscatedName("cg.n(IB)[I")
    public int[] method1935(int arg0) {
        class78 var2 = this.field1567[arg0];
        if (var2 != null) {
            if (var2.field1396 != null) {
                this.field1565.method3464(var2);
                var2.field1397 = true;
                return var2.field1396;
            }
            boolean var3 = var2.method1674(this.field1564, this.field1569, this.field1570);
            if (var3) {
                if (this.field1568 == 0) {
                    class78 var4 = (class78) this.field1565.method3474();
                    var4.method1675();
                } else {
                    this.field1568--;
                }
                this.field1565.method3464(var2);
                var2.field1397 = true;
                return var2.field1396;
            }
        }
        return null;
    }

    @ObfuscatedName("cg.g(II)I")
    public int method1929(int arg0) {
        return this.field1567[arg0] == null ? 0 : this.field1567[arg0].field1389;
    }

    @ObfuscatedName("cg.a(II)Z")
    public boolean method1931(int arg0) {
        return this.field1567[arg0].field1384;
    }

    @ObfuscatedName("cg.m(II)Z")
    public boolean method1928(int arg0) {
        return this.field1569 == 64;
    }

    @ObfuscatedName("cg.q(I)V")
    public void method1946() {
        for (int var1 = 0; var1 < this.field1567.length; var1++) {
            if (this.field1567[var1] != null) {
                this.field1567[var1].method1675();
            }
        }
        this.field1565 = new class190();
        this.field1568 = this.field1566;
    }

    @ObfuscatedName("cg.o(IB)V")
    public void method1945(int arg0) {
        for (int var2 = 0; var2 < this.field1567.length; var2++) {
            class78 var3 = this.field1567[var2];
            if (var3 != null && var3.field1394 != 0 && var3.field1397) {
                var3.method1676(arg0);
                var3.field1397 = false;
            }
        }
    }
}
