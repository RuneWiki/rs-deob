package deob;

@ObfuscatedName("cs")
public class class99 implements class96 {

    @ObfuscatedName("cs.x")
    public class87[] field1674;

    @ObfuscatedName("cs.r")
    public class203 field1669 = new class203();

    @ObfuscatedName("cs.j")
    public int field1670;

    @ObfuscatedName("cs.z")
    public int field1671 = 0;

    @ObfuscatedName("cs.i")
    public double field1673 = 1.0D;

    @ObfuscatedName("cs.b")
    public int field1677 = 128;

    @ObfuscatedName("cs.l")
    public class171 field1672;

    public class99(class171 arg0, class171 arg1, int arg2, double arg3, int arg4) {
        this.field1672 = arg1;
        this.field1670 = arg2;
        this.field1671 = this.field1670;
        this.field1673 = arg3;
        this.field1677 = arg4;
        int[] var7 = arg0.method3078(0);
        int var8 = var7.length;
        this.field1674 = new class87[arg0.method3088(0)];
        for (int var9 = 0; var9 < var8; var9++) {
            class123 var10 = new class123(arg0.method3079(0, var7[var9]));
            this.field1674[var7[var9]] = new class87(var10);
        }
    }

    @ObfuscatedName("cs.u(D)V")
    public void method2100(double arg0) {
        this.field1673 = arg0;
        this.method2101();
    }

    @ObfuscatedName("cs.x(II)[I")
    public int[] method2088(int arg0) {
        class87 var2 = this.field1674[arg0];
        if (var2 != null) {
            if (var2.field1489 != null) {
                this.field1669.method3596(var2);
                var2.field1491 = true;
                return var2.field1489;
            }
            boolean var3 = var2.method1809(this.field1673, this.field1677, this.field1672);
            if (var3) {
                if (this.field1671 == 0) {
                    class87 var4 = (class87) this.field1669.method3599();
                    var4.method1810();
                } else {
                    this.field1671--;
                }
                this.field1669.method3596(var2);
                var2.field1491 = true;
                return var2.field1489;
            }
        }
        return null;
    }

    @ObfuscatedName("cs.r(II)I")
    public int method2078(int arg0) {
        return this.field1674[arg0] == null ? 0 : this.field1674[arg0].field1482;
    }

    @ObfuscatedName("cs.j(IB)Z")
    public boolean method2089(int arg0) {
        return this.field1674[arg0].field1484;
    }

    @ObfuscatedName("cs.z(II)Z")
    public boolean method2080(int arg0) {
        return this.field1677 == 64;
    }

    @ObfuscatedName("cs.a(I)V")
    public void method2101() {
        for (int var1 = 0; var1 < this.field1674.length; var1++) {
            if (this.field1674[var1] != null) {
                this.field1674[var1].method1810();
            }
        }
        this.field1669 = new class203();
        this.field1671 = this.field1670;
    }

    @ObfuscatedName("cs.e(II)V")
    public void method2102(int arg0) {
        for (int var2 = 0; var2 < this.field1674.length; var2++) {
            class87 var3 = this.field1674[var2];
            if (var3 != null && var3.field1487 != 0 && var3.field1491) {
                var3.method1816(arg0);
                var3.field1491 = false;
            }
        }
    }
}
