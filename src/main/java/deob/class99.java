package deob;

@ObfuscatedName("cr")
public class class99 implements class96 {

    @ObfuscatedName("cr.l")
    public class87[] field1695;

    @ObfuscatedName("cr.g")
    public class203 field1691 = new class203();

    @ObfuscatedName("cr.r")
    public int field1692;

    @ObfuscatedName("cr.e")
    public int field1694 = 0;

    @ObfuscatedName("cr.h")
    public double field1690 = 1.0D;

    @ObfuscatedName("cr.s")
    public int field1697 = 128;

    @ObfuscatedName("cr.k")
    public class171 field1696;

    public class99(class171 arg0, class171 arg1, int arg2, double arg3, int arg4) {
        this.field1696 = arg1;
        this.field1692 = arg2;
        this.field1694 = this.field1692;
        this.field1690 = arg3;
        this.field1697 = arg4;
        int[] var7 = arg0.method3194(0);
        int var8 = var7.length;
        this.field1695 = new class87[arg0.method3204(0)];
        for (int var9 = 0; var9 < var8; var9++) {
            class123 var10 = new class123(arg0.method3210(0, var7[var9]));
            this.field1695[var7[var9]] = new class87(var10);
        }
    }

    @ObfuscatedName("cr.v(D)V")
    public void method2145(double arg0) {
        this.field1690 = arg0;
        this.method2147();
    }

    @ObfuscatedName("cr.l(II)[I")
    public int[] method2135(int arg0) {
        class87 var2 = this.field1695[arg0];
        if (var2 != null) {
            if (var2.field1521 != null) {
                this.field1691.method3712(var2);
                var2.field1532 = true;
                return var2.field1521;
            }
            boolean var3 = var2.method1869(this.field1690, this.field1697, this.field1696);
            if (var3) {
                if (this.field1694 == 0) {
                    class87 var4 = (class87) this.field1691.method3715();
                    var4.method1870();
                } else {
                    this.field1694--;
                }
                this.field1691.method3712(var2);
                var2.field1532 = true;
                return var2.field1521;
            }
        }
        return null;
    }

    @ObfuscatedName("cr.g(IB)I")
    public int method2121(int arg0) {
        return this.field1695[arg0] == null ? 0 : this.field1695[arg0].field1523;
    }

    @ObfuscatedName("cr.r(IB)Z")
    public boolean method2122(int arg0) {
        return this.field1695[arg0].field1524;
    }

    @ObfuscatedName("cr.e(II)Z")
    public boolean method2136(int arg0) {
        return this.field1697 == 64;
    }

    @ObfuscatedName("cr.j(I)V")
    public void method2147() {
        for (int var1 = 0; var1 < this.field1695.length; var1++) {
            if (this.field1695[var1] != null) {
                this.field1695[var1].method1870();
            }
        }
        this.field1691 = new class203();
        this.field1694 = this.field1692;
    }

    @ObfuscatedName("cr.x(IB)V")
    public void method2148(int arg0) {
        for (int var2 = 0; var2 < this.field1695.length; var2++) {
            class87 var3 = this.field1695[var2];
            if (var3 != null && var3.field1529 != 0 && var3.field1532) {
                var3.method1871(arg0);
                var3.field1532 = false;
            }
        }
    }
}
