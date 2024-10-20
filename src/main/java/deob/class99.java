package deob;

@ObfuscatedName("cz")
public class class99 implements class96 {

    @ObfuscatedName("cz.k")
    public class87[] field1686;

    @ObfuscatedName("cz.q")
    public class203 field1684 = new class203();

    @ObfuscatedName("cz.f")
    public int field1683;

    @ObfuscatedName("cz.c")
    public int field1688 = 0;

    @ObfuscatedName("cz.v")
    public double field1685 = 1.0D;

    @ObfuscatedName("cz.j")
    public int field1687 = 128;

    @ObfuscatedName("cz.m")
    public class171 field1689;

    public class99(class171 arg0, class171 arg1, int arg2, double arg3, int arg4) {
        this.field1689 = arg1;
        this.field1683 = arg2;
        this.field1688 = this.field1683;
        this.field1685 = arg3;
        this.field1687 = arg4;
        int[] var7 = arg0.method3081(0);
        int var8 = var7.length;
        this.field1686 = new class87[arg0.method3082(0)];
        for (int var9 = 0; var9 < var8; var9++) {
            class123 var10 = new class123(arg0.method3097(0, var7[var9]));
            this.field1686[var7[var9]] = new class87(var10);
        }
    }

    @ObfuscatedName("cz.g(D)V")
    public void method2119(double arg0) {
        this.field1685 = arg0;
        this.method2121();
    }

    @ObfuscatedName("cz.k(II)[I")
    public int[] method2106(int arg0) {
        class87 var2 = this.field1686[arg0];
        if (var2 != null) {
            if (var2.field1505 != null) {
                this.field1684.method3597(var2);
                var2.field1501 = true;
                return var2.field1505;
            }
            boolean var3 = var2.method1824(this.field1685, this.field1687, this.field1689);
            if (var3) {
                if (this.field1688 == 0) {
                    class87 var4 = (class87) this.field1684.method3600();
                    var4.method1826();
                } else {
                    this.field1688--;
                }
                this.field1684.method3597(var2);
                var2.field1501 = true;
                return var2.field1505;
            }
        }
        return null;
    }

    @ObfuscatedName("cz.q(II)I")
    public int method2104(int arg0) {
        return this.field1686[arg0] == null ? 0 : this.field1686[arg0].field1502;
    }

    @ObfuscatedName("cz.f(IB)Z")
    public boolean method2113(int arg0) {
        return this.field1686[arg0].field1509;
    }

    @ObfuscatedName("cz.c(IB)Z")
    public boolean method2105(int arg0) {
        return this.field1687 == 64;
    }

    @ObfuscatedName("cz.e(I)V")
    public void method2121() {
        for (int var1 = 0; var1 < this.field1686.length; var1++) {
            if (this.field1686[var1] != null) {
                this.field1686[var1].method1826();
            }
        }
        this.field1684 = new class203();
        this.field1688 = this.field1683;
    }

    @ObfuscatedName("cz.p(IB)V")
    public void method2127(int arg0) {
        for (int var2 = 0; var2 < this.field1686.length; var2++) {
            class87 var3 = this.field1686[var2];
            if (var3 != null && var3.field1507 != 0 && var3.field1501) {
                var3.method1825(arg0);
                var3.field1501 = false;
            }
        }
    }
}
