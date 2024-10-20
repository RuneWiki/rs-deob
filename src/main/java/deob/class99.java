package deob;

@ObfuscatedName("cq")
public class class99 implements class96 {

    @ObfuscatedName("cq.m")
    public class87[] field1689;

    @ObfuscatedName("cq.w")
    public class203 field1687 = new class203();

    @ObfuscatedName("cq.e")
    public int field1688;

    @ObfuscatedName("cq.o")
    public int field1686 = 0;

    @ObfuscatedName("cq.g")
    public double field1690 = 1.0D;

    @ObfuscatedName("cq.l")
    public int field1691 = 128;

    @ObfuscatedName("cq.j")
    public class171 field1693;

    public class99(class171 arg0, class171 arg1, int arg2, double arg3, int arg4) {
        this.field1693 = arg1;
        this.field1688 = arg2;
        this.field1686 = this.field1688;
        this.field1690 = arg3;
        this.field1691 = arg4;
        int[] var7 = arg0.method3135(0);
        int var8 = var7.length;
        this.field1689 = new class87[arg0.method3099(0)];
        for (int var9 = 0; var9 < var8; var9++) {
            class123 var10 = new class123(arg0.method3086(0, var7[var9]));
            this.field1689[var7[var9]] = new class87(var10);
        }
    }

    @ObfuscatedName("cq.f(D)V")
    public void method2120(double arg0) {
        this.field1690 = arg0;
        this.method2121();
    }

    @ObfuscatedName("cq.m(II)[I")
    public int[] method2115(int arg0) {
        class87 var2 = this.field1689[arg0];
        if (var2 != null) {
            if (var2.field1525 != null) {
                this.field1687.method3617(var2);
                var2.field1516 = true;
                return var2.field1525;
            }
            boolean var3 = var2.method1851(this.field1690, this.field1691, this.field1693);
            if (var3) {
                if (this.field1686 == 0) {
                    class87 var4 = (class87) this.field1687.method3620();
                    var4.method1852();
                } else {
                    this.field1686--;
                }
                this.field1687.method3617(var2);
                var2.field1516 = true;
                return var2.field1525;
            }
        }
        return null;
    }

    @ObfuscatedName("cq.w(II)I")
    public int method2105(int arg0) {
        return this.field1689[arg0] == null ? 0 : this.field1689[arg0].field1517;
    }

    @ObfuscatedName("cq.e(IB)Z")
    public boolean method2104(int arg0) {
        return this.field1689[arg0].field1518;
    }

    @ObfuscatedName("cq.o(IB)Z")
    public boolean method2102(int arg0) {
        return this.field1691 == 64;
    }

    @ObfuscatedName("cq.i(I)V")
    public void method2121() {
        for (int var1 = 0; var1 < this.field1689.length; var1++) {
            if (this.field1689[var1] != null) {
                this.field1689[var1].method1852();
            }
        }
        this.field1687 = new class203();
        this.field1686 = this.field1688;
    }

    @ObfuscatedName("cq.d(IB)V")
    public void method2122(int arg0) {
        for (int var2 = 0; var2 < this.field1689.length; var2++) {
            class87 var3 = this.field1689[var2];
            if (var3 != null && var3.field1523 != 0 && var3.field1516) {
                var3.method1853(arg0);
                var3.field1516 = false;
            }
        }
    }
}
