package deob;

@ObfuscatedName("ca")
public class class95 implements class92 {

    @ObfuscatedName("ca.o")
    public class83[] field1602;

    @ObfuscatedName("ca.e")
    public class199 field1599 = new class199();

    @ObfuscatedName("ca.u")
    public int field1600;

    @ObfuscatedName("ca.b")
    public int field1601 = 0;

    @ObfuscatedName("ca.p")
    public double field1605 = 1.0D;

    @ObfuscatedName("ca.s")
    public int field1603 = 128;

    @ObfuscatedName("ca.y")
    public class167 field1604;

    public class95(class167 arg0, class167 arg1, int arg2, double arg3, int arg4) {
        this.field1604 = arg1;
        this.field1600 = arg2;
        this.field1601 = this.field1600;
        this.field1605 = arg3;
        this.field1603 = arg4;
        int[] var7 = arg0.method3066(0);
        int var8 = var7.length;
        this.field1602 = new class83[arg0.method3067(0)];
        for (int var9 = 0; var9 < var8; var9++) {
            class119 var10 = new class119(arg0.method3057(0, var7[var9]));
            this.field1602[var7[var9]] = new class83(var10);
        }
    }

    @ObfuscatedName("ca.k(D)V")
    public void method2024(double arg0) {
        this.field1605 = arg0;
        this.method2023();
    }

    @ObfuscatedName("ca.o(II)[I")
    public int[] method2010(int arg0) {
        class83 var2 = this.field1602[arg0];
        if (var2 != null) {
            if (var2.field1430 != null) {
                this.field1599.method3590(var2);
                var2.field1423 = true;
                return var2.field1430;
            }
            boolean var3 = var2.method1729(this.field1605, this.field1603, this.field1604);
            if (var3) {
                if (this.field1601 == 0) {
                    class83 var4 = (class83) this.field1599.method3580();
                    var4.method1734();
                } else {
                    this.field1601--;
                }
                this.field1599.method3590(var2);
                var2.field1423 = true;
                return var2.field1430;
            }
        }
        return null;
    }

    @ObfuscatedName("ca.e(IB)I")
    public int method2003(int arg0) {
        return this.field1602[arg0] == null ? 0 : this.field1602[arg0].field1425;
    }

    @ObfuscatedName("ca.u(II)Z")
    public boolean method2015(int arg0) {
        return this.field1602[arg0].field1419;
    }

    @ObfuscatedName("ca.b(II)Z")
    public boolean method2005(int arg0) {
        return this.field1603 == 64;
    }

    @ObfuscatedName("ca.r(I)V")
    public void method2023() {
        for (int var1 = 0; var1 < this.field1602.length; var1++) {
            if (this.field1602[var1] != null) {
                this.field1602[var1].method1734();
            }
        }
        this.field1599 = new class199();
        this.field1601 = this.field1600;
    }

    @ObfuscatedName("ca.i(II)V")
    public void method2026(int arg0) {
        for (int var2 = 0; var2 < this.field1602.length; var2++) {
            class83 var3 = this.field1602[var2];
            if (var3 != null && var3.field1428 != 0 && var3.field1423) {
                var3.method1731(arg0);
                var3.field1423 = false;
            }
        }
    }
}
