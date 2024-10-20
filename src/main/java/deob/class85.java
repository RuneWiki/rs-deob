package deob;

@ObfuscatedName("cd")
public class class85 implements class82 {

    @ObfuscatedName("cd.z")
    public class73[] field1483;

    @ObfuscatedName("cd.n")
    public class171 field1479 = new class171();

    @ObfuscatedName("cd.u")
    public int field1481;

    @ObfuscatedName("cd.t")
    public int field1482 = 0;

    @ObfuscatedName("cd.e")
    public double field1487 = 1.0D;

    @ObfuscatedName("cd.a")
    public int field1484 = 128;

    @ObfuscatedName("cd.l")
    public class142 field1485;

    public class85(class142 arg0, class142 arg1, int arg2, double arg3, int arg4) {
        this.field1485 = arg1;
        this.field1481 = arg2;
        this.field1482 = this.field1481;
        this.field1487 = arg3;
        this.field1484 = arg4;
        int[] var7 = arg0.method2749(0);
        int var8 = var7.length;
        this.field1483 = new class73[arg0.method2755(0)];
        for (int var9 = 0; var9 < var8; var9++) {
            class104 var10 = new class104(arg0.method2768(0, var7[var9]));
            this.field1483[var7[var9]] = new class73(var10);
        }
    }

    @ObfuscatedName("cd.x(D)V")
    public void method1877(double arg0) {
        this.field1487 = arg0;
        this.method1879();
    }

    @ObfuscatedName("cd.z(II)[I")
    public int[] method1871(int arg0) {
        class73 var2 = this.field1483[arg0];
        if (var2 != null) {
            if (var2.field1296 != null) {
                this.field1479.method3237(var2);
                var2.field1304 = true;
                return var2.field1296;
            }
            boolean var3 = var2.method1595(this.field1487, this.field1484, this.field1485);
            if (var3) {
                if (this.field1482 == 0) {
                    class73 var4 = (class73) this.field1479.method3225();
                    var4.method1589();
                } else {
                    this.field1482--;
                }
                this.field1479.method3237(var2);
                var2.field1304 = true;
                return var2.field1296;
            }
        }
        return null;
    }

    @ObfuscatedName("cd.n(IB)I")
    public int method1860(int arg0) {
        return this.field1483[arg0] == null ? 0 : this.field1483[arg0].field1303;
    }

    @ObfuscatedName("cd.u(IB)Z")
    public boolean method1861(int arg0) {
        return this.field1483[arg0].field1299;
    }

    @ObfuscatedName("cd.t(II)Z")
    public boolean method1862(int arg0) {
        return this.field1484 == 64;
    }

    @ObfuscatedName("cd.m(I)V")
    public void method1879() {
        for (int var1 = 0; var1 < this.field1483.length; var1++) {
            if (this.field1483[var1] != null) {
                this.field1483[var1].method1589();
            }
        }
        this.field1479 = new class171();
        this.field1482 = this.field1481;
    }

    @ObfuscatedName("cd.f(II)V")
    public void method1878(int arg0) {
        for (int var2 = 0; var2 < this.field1483.length; var2++) {
            class73 var3 = this.field1483[var2];
            if (var3 != null && var3.field1298 != 0 && var3.field1304) {
                var3.method1591(arg0);
                var3.field1304 = false;
            }
        }
    }
}
