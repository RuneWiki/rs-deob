package deob;

@ObfuscatedName("cm")
public class class90 implements class87 {

    @ObfuscatedName("cm.t")
    public class78[] field1531;

    @ObfuscatedName("cm.b")
    public class190 field1530 = new class190();

    @ObfuscatedName("cm.p")
    public int field1528;

    @ObfuscatedName("cm.e")
    public int field1534 = 0;

    @ObfuscatedName("cm.i")
    public double field1532 = 1.0D;

    @ObfuscatedName("cm.o")
    public int field1533 = 128;

    @ObfuscatedName("cm.f")
    public class158 field1529;

    public class90(class158 arg0, class158 arg1, int arg2, double arg3, int arg4) {
        this.field1529 = arg1;
        this.field1528 = arg2;
        this.field1534 = this.field1528;
        this.field1532 = arg3;
        this.field1533 = arg4;
        int[] var7 = arg0.method2899(0);
        int var8 = var7.length;
        this.field1531 = new class78[arg0.method2891(0)];
        for (int var9 = 0; var9 < var8; var9++) {
            class111 var10 = new class111(arg0.method2881(0, var7[var9]));
            this.field1531[var7[var9]] = new class78(var10);
        }
    }

    @ObfuscatedName("cm.l(D)V")
    public void method1909(double arg0) {
        this.field1532 = arg0;
        this.method1910();
    }

    @ObfuscatedName("cm.t(II)[I")
    public int[] method1898(int arg0) {
        class78 var2 = this.field1531[arg0];
        if (var2 != null) {
            if (var2.field1350 != null) {
                this.field1530.method3444(var2);
                var2.field1346 = true;
                return var2.field1350;
            }
            boolean var3 = var2.method1630(this.field1532, this.field1533, this.field1529);
            if (var3) {
                if (this.field1534 == 0) {
                    class78 var4 = (class78) this.field1530.method3410();
                    var4.method1631();
                } else {
                    this.field1534--;
                }
                this.field1530.method3444(var2);
                var2.field1346 = true;
                return var2.field1350;
            }
        }
        return null;
    }

    @ObfuscatedName("cm.b(II)I")
    public int method1894(int arg0) {
        return this.field1531[arg0] == null ? 0 : this.field1531[arg0].field1354;
    }

    @ObfuscatedName("cm.p(IB)Z")
    public boolean method1902(int arg0) {
        return this.field1531[arg0].field1347;
    }

    @ObfuscatedName("cm.e(IB)Z")
    public boolean method1896(int arg0) {
        return this.field1533 == 64;
    }

    @ObfuscatedName("cm.h(B)V")
    public void method1910() {
        for (int var1 = 0; var1 < this.field1531.length; var1++) {
            if (this.field1531[var1] != null) {
                this.field1531[var1].method1631();
            }
        }
        this.field1530 = new class190();
        this.field1534 = this.field1528;
    }

    @ObfuscatedName("cm.c(II)V")
    public void method1913(int arg0) {
        for (int var2 = 0; var2 < this.field1531.length; var2++) {
            class78 var3 = this.field1531[var2];
            if (var3 != null && var3.field1352 != 0 && var3.field1346) {
                var3.method1634(arg0);
                var3.field1346 = false;
            }
        }
    }
}
