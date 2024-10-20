package deob;

@ObfuscatedName("cz")
public class class90 implements class87 {

    @ObfuscatedName("cz.n")
    public class78[] field1546;

    @ObfuscatedName("cz.w")
    public class190 field1543 = new class190();

    @ObfuscatedName("cz.i")
    public int field1549;

    @ObfuscatedName("cz.e")
    public int field1544 = 0;

    @ObfuscatedName("cz.h")
    public double field1547 = 1.0D;

    @ObfuscatedName("cz.q")
    public int field1548 = 128;

    @ObfuscatedName("cz.l")
    public class158 field1555;

    public class90(class158 arg0, class158 arg1, int arg2, double arg3, int arg4) {
        this.field1555 = arg1;
        this.field1549 = arg2;
        this.field1544 = this.field1549;
        this.field1547 = arg3;
        this.field1548 = arg4;
        int[] var7 = arg0.method2868(0);
        int var8 = var7.length;
        this.field1546 = new class78[arg0.method2898(0)];
        for (int var9 = 0; var9 < var8; var9++) {
            class111 var10 = new class111(arg0.method2859(0, var7[var9]));
            this.field1546[var7[var9]] = new class78(var10);
        }
    }

    @ObfuscatedName("cz.z(D)V")
    public void method1880(double arg0) {
        this.field1547 = arg0;
        this.method1882();
    }

    @ObfuscatedName("cz.n(IB)[I")
    public int[] method1875(int arg0) {
        class78 var2 = this.field1546[arg0];
        if (var2 != null) {
            if (var2.field1368 != null) {
                this.field1543.method3378(var2);
                var2.field1366 = true;
                return var2.field1368;
            }
            boolean var3 = var2.method1608(this.field1547, this.field1548, this.field1555);
            if (var3) {
                if (this.field1544 == 0) {
                    class78 var4 = (class78) this.field1543.method3399();
                    var4.method1611();
                } else {
                    this.field1544--;
                }
                this.field1543.method3378(var2);
                var2.field1366 = true;
                return var2.field1368;
            }
        }
        return null;
    }

    @ObfuscatedName("cz.w(IB)I")
    public int method1864(int arg0) {
        return this.field1546[arg0] == null ? 0 : this.field1546[arg0].field1360;
    }

    @ObfuscatedName("cz.i(II)Z")
    public boolean method1876(int arg0) {
        return this.field1546[arg0].field1361;
    }

    @ObfuscatedName("cz.e(IB)Z")
    public boolean method1874(int arg0) {
        return this.field1548 == 64;
    }

    @ObfuscatedName("cz.u(I)V")
    public void method1882() {
        for (int var1 = 0; var1 < this.field1546.length; var1++) {
            if (this.field1546[var1] != null) {
                this.field1546[var1].method1611();
            }
        }
        this.field1543 = new class190();
        this.field1544 = this.field1549;
    }

    @ObfuscatedName("cz.g(IB)V")
    public void method1883(int arg0) {
        for (int var2 = 0; var2 < this.field1546.length; var2++) {
            class78 var3 = this.field1546[var2];
            if (var3 != null && var3.field1358 != 0 && var3.field1366) {
                var3.method1610(arg0);
                var3.field1366 = false;
            }
        }
    }
}
