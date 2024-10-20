package deob;

@ObfuscatedName("cn")
public class class96 implements class93 {

    @ObfuscatedName("cn.e")
    public class84[] field1597;

    @ObfuscatedName("cn.w")
    public class200 field1595 = new class200();

    @ObfuscatedName("cn.f")
    public int field1600;

    @ObfuscatedName("cn.s")
    public int field1596 = 0;

    @ObfuscatedName("cn.p")
    public double field1598 = 1.0D;

    @ObfuscatedName("cn.h")
    public int field1599 = 128;

    @ObfuscatedName("cn.g")
    public class168 field1604;

    public class96(class168 arg0, class168 arg1, int arg2, double arg3, int arg4) {
        this.field1604 = arg1;
        this.field1600 = arg2;
        this.field1596 = this.field1600;
        this.field1598 = arg3;
        this.field1599 = arg4;
        int[] var7 = arg0.method3033(0);
        int var8 = var7.length;
        this.field1597 = new class84[arg0.method3075(0)];
        for (int var9 = 0; var9 < var8; var9++) {
            class120 var10 = new class120(arg0.method3048(0, var7[var9]));
            this.field1597[var7[var9]] = new class84(var10);
        }
    }

    @ObfuscatedName("cn.n(D)V")
    public void method2040(double arg0) {
        this.field1598 = arg0;
        this.method2049();
    }

    @ObfuscatedName("cn.e(II)[I")
    public int[] method2032(int arg0) {
        class84 var2 = this.field1597[arg0];
        if (var2 != null) {
            if (var2.field1426 != null) {
                this.field1595.method3540(var2);
                var2.field1427 = true;
                return var2.field1426;
            }
            boolean var3 = var2.method1766(this.field1598, this.field1599, this.field1604);
            if (var3) {
                if (this.field1596 == 0) {
                    class84 var4 = (class84) this.field1595.method3543();
                    var4.method1765();
                } else {
                    this.field1596--;
                }
                this.field1595.method3540(var2);
                var2.field1427 = true;
                return var2.field1426;
            }
        }
        return null;
    }

    @ObfuscatedName("cn.w(IB)I")
    public int method2025(int arg0) {
        return this.field1597[arg0] == null ? 0 : this.field1597[arg0].field1418;
    }

    @ObfuscatedName("cn.f(IB)Z")
    public boolean method2024(int arg0) {
        return this.field1597[arg0].field1419;
    }

    @ObfuscatedName("cn.s(II)Z")
    public boolean method2027(int arg0) {
        return this.field1599 == 64;
    }

    @ObfuscatedName("cn.y(I)V")
    public void method2049() {
        for (int var1 = 0; var1 < this.field1597.length; var1++) {
            if (this.field1597[var1] != null) {
                this.field1597[var1].method1765();
            }
        }
        this.field1595 = new class200();
        this.field1596 = this.field1600;
    }

    @ObfuscatedName("cn.i(II)V")
    public void method2043(int arg0) {
        for (int var2 = 0; var2 < this.field1597.length; var2++) {
            class84 var3 = this.field1597[var2];
            if (var3 != null && var3.field1424 != 0 && var3.field1427) {
                var3.method1768(arg0);
                var3.field1427 = false;
            }
        }
    }
}
