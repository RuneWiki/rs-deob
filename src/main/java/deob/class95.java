package deob;

@ObfuscatedName("cn")
public class class95 implements class92 {

    @ObfuscatedName("cn.d")
    public class83[] field1614;

    @ObfuscatedName("cn.p")
    public class199 field1610 = new class199();

    @ObfuscatedName("cn.v")
    public int field1611;

    @ObfuscatedName("cn.l")
    public int field1612 = 0;

    @ObfuscatedName("cn.y")
    public double field1613 = 1.0D;

    @ObfuscatedName("cn.w")
    public int field1609 = 128;

    @ObfuscatedName("cn.u")
    public class167 field1615;

    public class95(class167 arg0, class167 arg1, int arg2, double arg3, int arg4) {
        this.field1615 = arg1;
        this.field1611 = arg2;
        this.field1612 = this.field1611;
        this.field1613 = arg3;
        this.field1609 = arg4;
        int[] var7 = arg0.method3144(0);
        int var8 = var7.length;
        this.field1614 = new class83[arg0.method3101(0)];
        for (int var9 = 0; var9 < var8; var9++) {
            class119 var10 = new class119(arg0.method3134(0, var7[var9]));
            this.field1614[var7[var9]] = new class83(var10);
        }
    }

    @ObfuscatedName("cn.z(D)V")
    public void method2045(double arg0) {
        this.field1613 = arg0;
        this.method2051();
    }

    @ObfuscatedName("cn.d(II)[I")
    public int[] method2029(int arg0) {
        class83 var2 = this.field1614[arg0];
        if (var2 != null) {
            if (var2.field1438 != null) {
                this.field1610.method3630(var2);
                var2.field1439 = true;
                return var2.field1438;
            }
            boolean var3 = var2.method1758(this.field1613, this.field1609, this.field1615);
            if (var3) {
                if (this.field1612 == 0) {
                    class83 var4 = (class83) this.field1610.method3612();
                    var4.method1753();
                } else {
                    this.field1612--;
                }
                this.field1610.method3630(var2);
                var2.field1439 = true;
                return var2.field1438;
            }
        }
        return null;
    }

    @ObfuscatedName("cn.p(II)I")
    public int method2023(int arg0) {
        return this.field1614[arg0] == null ? 0 : this.field1614[arg0].field1430;
    }

    @ObfuscatedName("cn.v(IB)Z")
    public boolean method2024(int arg0) {
        return this.field1614[arg0].field1428;
    }

    @ObfuscatedName("cn.l(IB)Z")
    public boolean method2025(int arg0) {
        return this.field1609 == 64;
    }

    @ObfuscatedName("cn.h(I)V")
    public void method2051() {
        for (int var1 = 0; var1 < this.field1614.length; var1++) {
            if (this.field1614[var1] != null) {
                this.field1614[var1].method1753();
            }
        }
        this.field1610 = new class199();
        this.field1612 = this.field1611;
    }

    @ObfuscatedName("cn.i(II)V")
    public void method2047(int arg0) {
        for (int var2 = 0; var2 < this.field1614.length; var2++) {
            class83 var3 = this.field1614[var2];
            if (var3 != null && var3.field1440 != 0 && var3.field1439) {
                var3.method1754(arg0);
                var3.field1439 = false;
            }
        }
    }
}
