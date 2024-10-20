package deob;

@ObfuscatedName("cn")
public class class90 implements class87 {

    @ObfuscatedName("cn.o")
    public class78[] field1527;

    @ObfuscatedName("cn.l")
    public class190 field1526 = new class190();

    @ObfuscatedName("cn.g")
    public int field1533;

    @ObfuscatedName("cn.u")
    public int field1528 = 0;

    @ObfuscatedName("cn.q")
    public double field1525 = 1.0D;

    @ObfuscatedName("cn.r")
    public int field1530 = 128;

    @ObfuscatedName("cn.v")
    public class158 field1531;

    public class90(class158 arg0, class158 arg1, int arg2, double arg3, int arg4) {
        this.field1531 = arg1;
        this.field1533 = arg2;
        this.field1528 = this.field1533;
        this.field1525 = arg3;
        this.field1530 = arg4;
        int[] var7 = arg0.method2949(0);
        int var8 = var7.length;
        this.field1527 = new class78[arg0.method2950(0)];
        for (int var9 = 0; var9 < var8; var9++) {
            class111 var10 = new class111(arg0.method2940(0, var7[var9]));
            this.field1527[var7[var9]] = new class78(var10);
        }
    }

    @ObfuscatedName("cn.i(D)V")
    public void method1938(double arg0) {
        this.field1525 = arg0;
        this.method1941();
    }

    @ObfuscatedName("cn.o(II)[I")
    public int[] method1924(int arg0) {
        class78 var2 = this.field1527[arg0];
        if (var2 != null) {
            if (var2.field1364 != null) {
                this.field1526.method3471(var2);
                var2.field1365 = true;
                return var2.field1364;
            }
            boolean var3 = var2.method1651(this.field1525, this.field1530, this.field1531);
            if (var3) {
                if (this.field1528 == 0) {
                    class78 var4 = (class78) this.field1526.method3474();
                    var4.method1656();
                } else {
                    this.field1528--;
                }
                this.field1526.method3471(var2);
                var2.field1365 = true;
                return var2.field1364;
            }
        }
        return null;
    }

    @ObfuscatedName("cn.l(II)I")
    public int method1919(int arg0) {
        return this.field1527[arg0] == null ? 0 : this.field1527[arg0].field1356;
    }

    @ObfuscatedName("cn.g(II)Z")
    public boolean method1921(int arg0) {
        return this.field1527[arg0].field1354;
    }

    @ObfuscatedName("cn.u(II)Z")
    public boolean method1931(int arg0) {
        return this.field1530 == 64;
    }

    @ObfuscatedName("cn.n(I)V")
    public void method1941() {
        for (int var1 = 0; var1 < this.field1527.length; var1++) {
            if (this.field1527[var1] != null) {
                this.field1527[var1].method1656();
            }
        }
        this.field1526 = new class190();
        this.field1528 = this.field1533;
    }

    @ObfuscatedName("cn.x(II)V")
    public void method1942(int arg0) {
        for (int var2 = 0; var2 < this.field1527.length; var2++) {
            class78 var3 = this.field1527[var2];
            if (var3 != null && var3.field1362 != 0 && var3.field1365) {
                var3.method1652(arg0);
                var3.field1365 = false;
            }
        }
    }
}
