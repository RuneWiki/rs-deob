package deob;

@ObfuscatedName("cn")
public class class88 implements class85 {

    @ObfuscatedName("cn.n")
    public class76[] field1497;

    @ObfuscatedName("cn.x")
    public class178 field1491 = new class178();

    @ObfuscatedName("cn.k")
    public int field1496;

    @ObfuscatedName("cn.i")
    public int field1494 = 0;

    @ObfuscatedName("cn.d")
    public double field1493 = 1.0D;

    @ObfuscatedName("cn.q")
    public int field1498 = 128;

    @ObfuscatedName("cn.m")
    public class147 field1492;

    public class88(class147 arg0, class147 arg1, int arg2, double arg3, int arg4) {
        this.field1492 = arg1;
        this.field1496 = arg2;
        this.field1494 = this.field1496;
        this.field1493 = arg3;
        this.field1498 = arg4;
        int[] var7 = arg0.method2739(0);
        int var8 = var7.length;
        this.field1497 = new class76[arg0.method2684(0)];
        for (int var9 = 0; var9 < var8; var9++) {
            class107 var10 = new class107(arg0.method2738(0, var7[var9]));
            this.field1497[var7[var9]] = new class76(var10);
        }
    }

    @ObfuscatedName("cn.u(D)V")
    public void method1862(double arg0) {
        this.field1493 = arg0;
        this.method1865();
    }

    @ObfuscatedName("cn.n(II)[I")
    public int[] method1840(int arg0) {
        class76 var2 = this.field1497[arg0];
        if (var2 != null) {
            if (var2.field1328 != null) {
                this.field1491.method3182(var2);
                var2.field1326 = true;
                return var2.field1328;
            }
            boolean var3 = var2.method1597(this.field1493, this.field1498, this.field1492);
            if (var3) {
                if (this.field1494 == 0) {
                    class76 var4 = (class76) this.field1491.method3185();
                    var4.method1596();
                } else {
                    this.field1494--;
                }
                this.field1491.method3182(var2);
                var2.field1326 = true;
                return var2.field1328;
            }
        }
        return null;
    }

    @ObfuscatedName("cn.x(II)I")
    public int method1838(int arg0) {
        return this.field1497[arg0] == null ? 0 : this.field1497[arg0].field1320;
    }

    @ObfuscatedName("cn.k(II)Z")
    public boolean method1839(int arg0) {
        return this.field1497[arg0].field1321;
    }

    @ObfuscatedName("cn.i(II)Z")
    public boolean method1846(int arg0) {
        return this.field1498 == 64;
    }

    @ObfuscatedName("cn.h(I)V")
    public void method1865() {
        for (int var1 = 0; var1 < this.field1497.length; var1++) {
            if (this.field1497[var1] != null) {
                this.field1497[var1].method1596();
            }
        }
        this.field1491 = new class178();
        this.field1494 = this.field1496;
    }

    @ObfuscatedName("cn.t(II)V")
    public void method1866(int arg0) {
        for (int var2 = 0; var2 < this.field1497.length; var2++) {
            class76 var3 = this.field1497[var2];
            if (var3 != null && var3.field1327 != 0 && var3.field1326) {
                var3.method1598(arg0);
                var3.field1326 = false;
            }
        }
    }
}
