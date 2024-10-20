package deob;

@ObfuscatedName("cd")
public class class99 implements class96 {

    @ObfuscatedName("cd.i")
    public class87[] field1674;

    @ObfuscatedName("cd.h")
    public class203 field1673 = new class203();

    @ObfuscatedName("cd.e")
    public int field1681;

    @ObfuscatedName("cd.g")
    public int field1680 = 0;

    @ObfuscatedName("cd.n")
    public double field1676 = 1.0D;

    @ObfuscatedName("cd.u")
    public int field1677 = 128;

    @ObfuscatedName("cd.d")
    public class171 field1678;

    public class99(class171 arg0, class171 arg1, int arg2, double arg3, int arg4) {
        this.field1678 = arg1;
        this.field1681 = arg2;
        this.field1680 = this.field1681;
        this.field1676 = arg3;
        this.field1677 = arg4;
        int[] var7 = arg0.method3092(0);
        int var8 = var7.length;
        this.field1674 = new class87[arg0.method3093(0)];
        for (int var9 = 0; var9 < var8; var9++) {
            class123 var10 = new class123(arg0.method3086(0, var7[var9]));
            this.field1674[var7[var9]] = new class87(var10);
        }
    }

    @ObfuscatedName("cd.p(D)V")
    public void method2102(double arg0) {
        this.field1676 = arg0;
        this.method2095();
    }

    @ObfuscatedName("cd.i(IS)[I")
    public int[] method2084(int arg0) {
        class87 var2 = this.field1674[arg0];
        if (var2 != null) {
            if (var2.field1501 != null) {
                this.field1673.method3593(var2);
                var2.field1493 = true;
                return var2.field1501;
            }
            boolean var3 = var2.method1823(this.field1676, this.field1677, this.field1678);
            if (var3) {
                if (this.field1680 == 0) {
                    class87 var4 = (class87) this.field1673.method3596();
                    var4.method1816();
                } else {
                    this.field1680--;
                }
                this.field1673.method3593(var2);
                var2.field1493 = true;
                return var2.field1501;
            }
        }
        return null;
    }

    @ObfuscatedName("cd.h(II)I")
    public int method2080(int arg0) {
        return this.field1674[arg0] == null ? 0 : this.field1674[arg0].field1495;
    }

    @ObfuscatedName("cd.e(IB)Z")
    public boolean method2079(int arg0) {
        return this.field1674[arg0].field1491;
    }

    @ObfuscatedName("cd.g(II)Z")
    public boolean method2082(int arg0) {
        return this.field1677 == 64;
    }

    @ObfuscatedName("cd.v(I)V")
    public void method2095() {
        for (int var1 = 0; var1 < this.field1674.length; var1++) {
            if (this.field1674[var1] != null) {
                this.field1674[var1].method1816();
            }
        }
        this.field1673 = new class203();
        this.field1680 = this.field1681;
    }

    @ObfuscatedName("cd.r(II)V")
    public void method2097(int arg0) {
        for (int var2 = 0; var2 < this.field1674.length; var2++) {
            class87 var3 = this.field1674[var2];
            if (var3 != null && var3.field1494 != 0 && var3.field1493) {
                var3.method1814(arg0);
                var3.field1493 = false;
            }
        }
    }
}
