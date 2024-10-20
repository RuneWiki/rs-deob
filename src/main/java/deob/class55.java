package deob;

@ObfuscatedName("bi")
public class class55 implements class52 {

    @ObfuscatedName("bi.q")
    public class133[] field735;

    @ObfuscatedName("bi.l")
    public class105 field730 = new class105();

    @ObfuscatedName("bi.a")
    public int field731;

    @ObfuscatedName("bi.o")
    public int field732 = 0;

    @ObfuscatedName("bi.c")
    public double field733 = 1.0D;

    @ObfuscatedName("bi.h")
    public int field734 = 128;

    @ObfuscatedName("bi.r")
    public class87 field729;

    public class55(class87 arg0, class87 arg1, int arg2, double arg3, int arg4) {
        this.field729 = arg1;
        this.field731 = arg2;
        this.field732 = this.field731;
        this.field733 = arg3;
        this.field734 = arg4;
        int[] var7 = arg0.method1084(0);
        int var8 = var7.length;
        this.field735 = new class133[arg0.method1028(0)];
        for (int var9 = 0; var9 < var8; var9++) {
            class136 var10 = new class136(arg0.method1024(0, var7[var9]));
            this.field735[var7[var9]] = new class133(var10);
        }
    }

    @ObfuscatedName("bi.e(D)V")
    public void method724(double arg0) {
        this.field733 = arg0;
        this.method730();
    }

    @ObfuscatedName("bi.q(IB)[I")
    public int[] method705(int arg0) {
        class133 var2 = this.field735[arg0];
        if (var2 != null) {
            if (var2.field1690 != null) {
                this.field730.method1320(var2);
                var2.field1691 = true;
                return var2.field1690;
            }
            boolean var3 = var2.method1575(this.field733, this.field734, this.field729);
            if (var3) {
                if (this.field732 == 0) {
                    class133 var4 = (class133) this.field730.method1297();
                    var4.method1576();
                } else {
                    this.field732--;
                }
                this.field730.method1320(var2);
                var2.field1691 = true;
                return var2.field1690;
            }
        }
        return null;
    }

    @ObfuscatedName("bi.l(II)I")
    public int method704(int arg0) {
        return this.field735[arg0] == null ? 0 : this.field735[arg0].field1682;
    }

    @ObfuscatedName("bi.a(II)Z")
    public boolean method711(int arg0) {
        return this.field735[arg0].field1683;
    }

    @ObfuscatedName("bi.o(II)Z")
    public boolean method703(int arg0) {
        return this.field734 == 64;
    }

    @ObfuscatedName("bi.t(B)V")
    public void method730() {
        for (int var1 = 0; var1 < this.field735.length; var1++) {
            if (this.field735[var1] != null) {
                this.field735[var1].method1576();
            }
        }
        this.field730 = new class105();
        this.field732 = this.field731;
    }

    @ObfuscatedName("bi.y(II)V")
    public void method726(int arg0) {
        for (int var2 = 0; var2 < this.field735.length; var2++) {
            class133 var3 = this.field735[var2];
            if (var3 != null && var3.field1688 != 0 && var3.field1691) {
                var3.method1580(arg0);
                var3.field1691 = false;
            }
        }
    }
}
