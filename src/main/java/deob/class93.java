package deob;

@ObfuscatedName("cj")
public class class93 implements class90 {

    @ObfuscatedName("cj.j")
    public class81[] field1576;

    @ObfuscatedName("cj.y")
    public class193 field1566 = new class193();

    @ObfuscatedName("cj.z")
    public int field1567;

    @ObfuscatedName("cj.l")
    public int field1568 = 0;

    @ObfuscatedName("cj.w")
    public double field1569 = 1.0D;

    @ObfuscatedName("cj.d")
    public int field1570 = 128;

    @ObfuscatedName("cj.f")
    public class161 field1565;

    public class93(class161 arg0, class161 arg1, int arg2, double arg3, int arg4) {
        this.field1565 = arg1;
        this.field1567 = arg2;
        this.field1568 = this.field1567;
        this.field1569 = arg3;
        this.field1570 = arg4;
        int[] var7 = arg0.method2988(0);
        int var8 = var7.length;
        this.field1576 = new class81[arg0.method3008(0)];
        for (int var9 = 0; var9 < var8; var9++) {
            class114 var10 = new class114(arg0.method2995(0, var7[var9]));
            this.field1576[var7[var9]] = new class81(var10);
        }
    }

    @ObfuscatedName("cj.r(D)V")
    public void method2054(double arg0) {
        this.field1569 = arg0;
        this.method2055();
    }

    @ObfuscatedName("cj.j(II)[I")
    public int[] method2047(int arg0) {
        class81 var2 = this.field1576[arg0];
        if (var2 != null) {
            if (var2.field1398 != null) {
                this.field1566.method3486(var2);
                var2.field1411 = true;
                return var2.field1398;
            }
            boolean var3 = var2.method1782(this.field1569, this.field1570, this.field1565);
            if (var3) {
                if (this.field1568 == 0) {
                    class81 var4 = (class81) this.field1566.method3510();
                    var4.method1783();
                } else {
                    this.field1568--;
                }
                this.field1566.method3486(var2);
                var2.field1411 = true;
                return var2.field1398;
            }
        }
        return null;
    }

    @ObfuscatedName("cj.y(II)I")
    public int method2050(int arg0) {
        return this.field1576[arg0] == null ? 0 : this.field1576[arg0].field1402;
    }

    @ObfuscatedName("cj.z(II)Z")
    public boolean method2039(int arg0) {
        return this.field1576[arg0].field1404;
    }

    @ObfuscatedName("cj.l(II)Z")
    public boolean method2040(int arg0) {
        return this.field1570 == 64;
    }

    @ObfuscatedName("cj.t(I)V")
    public void method2055() {
        for (int var1 = 0; var1 < this.field1576.length; var1++) {
            if (this.field1576[var1] != null) {
                this.field1576[var1].method1783();
            }
        }
        this.field1566 = new class193();
        this.field1568 = this.field1567;
    }

    @ObfuscatedName("cj.g(II)V")
    public void method2056(int arg0) {
        for (int var2 = 0; var2 < this.field1576.length; var2++) {
            class81 var3 = this.field1576[var2];
            if (var3 != null && var3.field1408 != 0 && var3.field1411) {
                var3.method1784(arg0);
                var3.field1411 = false;
            }
        }
    }
}
