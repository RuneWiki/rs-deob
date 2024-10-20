package deob;

@ObfuscatedName("ch")
public class class99 implements class96 {

    @ObfuscatedName("ch.e")
    public class87[] field1692;

    @ObfuscatedName("ch.l")
    public class203 field1691 = new class203();

    @ObfuscatedName("ch.c")
    public int field1687;

    @ObfuscatedName("ch.h")
    public int field1689 = 0;

    @ObfuscatedName("ch.r")
    public double field1686 = 1.0D;

    @ObfuscatedName("ch.a")
    public int field1690 = 128;

    @ObfuscatedName("ch.b")
    public class171 field1688;

    public class99(class171 arg0, class171 arg1, int arg2, double arg3, int arg4) {
        this.field1688 = arg1;
        this.field1687 = arg2;
        this.field1689 = this.field1687;
        this.field1686 = arg3;
        this.field1690 = arg4;
        int[] var7 = arg0.method3136(0);
        int var8 = var7.length;
        this.field1692 = new class87[arg0.method3142(0)];
        for (int var9 = 0; var9 < var8; var9++) {
            class123 var10 = new class123(arg0.method3130(0, var7[var9]));
            this.field1692[var7[var9]] = new class87(var10);
        }
    }

    @ObfuscatedName("ch.g(D)V")
    public void method2142(double arg0) {
        this.field1686 = arg0;
        this.method2144();
    }

    @ObfuscatedName("ch.e(II)[I")
    public int[] method2127(int arg0) {
        class87 var2 = this.field1692[arg0];
        if (var2 != null) {
            if (var2.field1518 != null) {
                this.field1691.method3651(var2);
                var2.field1519 = true;
                return var2.field1518;
            }
            boolean var3 = var2.method1876(this.field1686, this.field1690, this.field1688);
            if (var3) {
                if (this.field1689 == 0) {
                    class87 var4 = (class87) this.field1691.method3653();
                    var4.method1871();
                } else {
                    this.field1689--;
                }
                this.field1691.method3651(var2);
                var2.field1519 = true;
                return var2.field1518;
            }
        }
        return null;
    }

    @ObfuscatedName("ch.l(II)I")
    public int method2126(int arg0) {
        return this.field1692[arg0] == null ? 0 : this.field1692[arg0].field1510;
    }

    @ObfuscatedName("ch.c(IB)Z")
    public boolean method2131(int arg0) {
        return this.field1692[arg0].field1511;
    }

    @ObfuscatedName("ch.h(II)Z")
    public boolean method2133(int arg0) {
        return this.field1690 == 64;
    }

    @ObfuscatedName("ch.j(I)V")
    public void method2144() {
        for (int var1 = 0; var1 < this.field1692.length; var1++) {
            if (this.field1692[var1] != null) {
                this.field1692[var1].method1871();
            }
        }
        this.field1691 = new class203();
        this.field1689 = this.field1687;
    }

    @ObfuscatedName("ch.w(IB)V")
    public void method2147(int arg0) {
        for (int var2 = 0; var2 < this.field1692.length; var2++) {
            class87 var3 = this.field1692[var2];
            if (var3 != null && var3.field1516 != 0 && var3.field1519) {
                var3.method1872(arg0);
                var3.field1519 = false;
            }
        }
    }
}
