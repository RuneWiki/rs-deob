package deob;

@ObfuscatedName("ct")
public class class95 implements class92 {

    @ObfuscatedName("ct.v")
    public class83[] field1601;

    @ObfuscatedName("ct.f")
    public class199 field1597 = new class199();

    @ObfuscatedName("ct.i")
    public int field1603;

    @ObfuscatedName("ct.d")
    public int field1598 = 0;

    @ObfuscatedName("ct.o")
    public double field1599 = 1.0D;

    @ObfuscatedName("ct.c")
    public int field1600 = 128;

    @ObfuscatedName("ct.p")
    public class167 field1595;

    public class95(class167 arg0, class167 arg1, int arg2, double arg3, int arg4) {
        this.field1595 = arg1;
        this.field1603 = arg2;
        this.field1598 = this.field1603;
        this.field1599 = arg3;
        this.field1600 = arg4;
        int[] var7 = arg0.method3034(0);
        int var8 = var7.length;
        this.field1601 = new class83[arg0.method3093(0)];
        for (int var9 = 0; var9 < var8; var9++) {
            class119 var10 = new class119(arg0.method3082(0, var7[var9]));
            this.field1601[var7[var9]] = new class83(var10);
        }
    }

    @ObfuscatedName("ct.q(D)V")
    public void method2034(double arg0) {
        this.field1599 = arg0;
        this.method2038();
    }

    @ObfuscatedName("ct.v(II)[I")
    public int[] method2028(int arg0) {
        class83 var2 = this.field1601[arg0];
        if (var2 != null) {
            if (var2.field1433 != null) {
                this.field1597.method3559(var2);
                var2.field1434 = true;
                return var2.field1433;
            }
            boolean var3 = var2.method1767(this.field1599, this.field1600, this.field1595);
            if (var3) {
                if (this.field1598 == 0) {
                    class83 var4 = (class83) this.field1597.method3562();
                    var4.method1768();
                } else {
                    this.field1598--;
                }
                this.field1597.method3559(var2);
                var2.field1434 = true;
                return var2.field1433;
            }
        }
        return null;
    }

    @ObfuscatedName("ct.f(II)I")
    public int method2018(int arg0) {
        return this.field1601[arg0] == null ? 0 : this.field1601[arg0].field1425;
    }

    @ObfuscatedName("ct.i(II)Z")
    public boolean method2023(int arg0) {
        return this.field1601[arg0].field1427;
    }

    @ObfuscatedName("ct.d(II)Z")
    public boolean method2020(int arg0) {
        return this.field1600 == 64;
    }

    @ObfuscatedName("ct.x(I)V")
    public void method2038() {
        for (int var1 = 0; var1 < this.field1601.length; var1++) {
            if (this.field1601[var1] != null) {
                this.field1601[var1].method1768();
            }
        }
        this.field1597 = new class199();
        this.field1598 = this.field1603;
    }

    @ObfuscatedName("ct.s(II)V")
    public void method2037(int arg0) {
        for (int var2 = 0; var2 < this.field1601.length; var2++) {
            class83 var3 = this.field1601[var2];
            if (var3 != null && var3.field1431 != 0 && var3.field1434) {
                var3.method1769(arg0);
                var3.field1434 = false;
            }
        }
    }
}
