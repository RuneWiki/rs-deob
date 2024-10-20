package deob;

@ObfuscatedName("cf")
public class class99 implements class96 {

    @ObfuscatedName("cf.f")
    public class87[] field1679;

    @ObfuscatedName("cf.e")
    public class203 field1675 = new class203();

    @ObfuscatedName("cf.n")
    public int field1674;

    @ObfuscatedName("cf.t")
    public int field1677 = 0;

    @ObfuscatedName("cf.v")
    public double field1678 = 1.0D;

    @ObfuscatedName("cf.b")
    public int field1686 = 128;

    @ObfuscatedName("cf.m")
    public class171 field1680;

    public class99(class171 arg0, class171 arg1, int arg2, double arg3, int arg4) {
        this.field1680 = arg1;
        this.field1674 = arg2;
        this.field1677 = this.field1674;
        this.field1678 = arg3;
        this.field1686 = arg4;
        int[] var7 = arg0.method3114(0);
        int var8 = var7.length;
        this.field1679 = new class87[arg0.method3124(0)];
        for (int var9 = 0; var9 < var8; var9++) {
            class123 var10 = new class123(arg0.method3107(0, var7[var9]));
            this.field1679[var7[var9]] = new class87(var10);
        }
    }

    @ObfuscatedName("cf.u(D)V")
    public void method2097(double arg0) {
        this.field1678 = arg0;
        this.method2099();
    }

    @ObfuscatedName("cf.f(II)[I")
    public int[] method2088(int arg0) {
        class87 var2 = this.field1679[arg0];
        if (var2 != null) {
            if (var2.field1491 != null) {
                this.field1675.method3666(var2);
                var2.field1503 = true;
                return var2.field1491;
            }
            boolean var3 = var2.method1837(this.field1678, this.field1686, this.field1680);
            if (var3) {
                if (this.field1677 == 0) {
                    class87 var4 = (class87) this.field1675.method3661();
                    var4.method1838();
                } else {
                    this.field1677--;
                }
                this.field1675.method3666(var2);
                var2.field1503 = true;
                return var2.field1491;
            }
        }
        return null;
    }

    @ObfuscatedName("cf.e(IB)I")
    public int method2079(int arg0) {
        return this.field1679[arg0] == null ? 0 : this.field1679[arg0].field1495;
    }

    @ObfuscatedName("cf.n(II)Z")
    public boolean method2080(int arg0) {
        return this.field1679[arg0].field1496;
    }

    @ObfuscatedName("cf.t(II)Z")
    public boolean method2089(int arg0) {
        return this.field1686 == 64;
    }

    @ObfuscatedName("cf.x(B)V")
    public void method2099() {
        for (int var1 = 0; var1 < this.field1679.length; var1++) {
            if (this.field1679[var1] != null) {
                this.field1679[var1].method1838();
            }
        }
        this.field1675 = new class203();
        this.field1677 = this.field1674;
    }

    @ObfuscatedName("cf.d(IB)V")
    public void method2100(int arg0) {
        for (int var2 = 0; var2 < this.field1679.length; var2++) {
            class87 var3 = this.field1679[var2];
            if (var3 != null && var3.field1498 != 0 && var3.field1503) {
                var3.method1840(arg0);
                var3.field1503 = false;
            }
        }
    }
}
