package deob;

@ObfuscatedName("ct")
public class class95 implements class92 {

    @ObfuscatedName("ct.l")
    public class83[] field1601;

    @ObfuscatedName("ct.e")
    public class199 field1596 = new class199();

    @ObfuscatedName("ct.q")
    public int field1594;

    @ObfuscatedName("ct.o")
    public int field1595 = 0;

    @ObfuscatedName("ct.g")
    public double field1592 = 1.0D;

    @ObfuscatedName("ct.m")
    public int field1597 = 128;

    @ObfuscatedName("ct.b")
    public class167 field1598;

    public class95(class167 arg0, class167 arg1, int arg2, double arg3, int arg4) {
        this.field1598 = arg1;
        this.field1594 = arg2;
        this.field1595 = this.field1594;
        this.field1592 = arg3;
        this.field1597 = arg4;
        int[] var7 = arg0.method3059(0);
        int var8 = var7.length;
        this.field1601 = new class83[arg0.method3085(0)];
        for (int var9 = 0; var9 < var8; var9++) {
            class119 var10 = new class119(arg0.method3050(0, var7[var9]));
            this.field1601[var7[var9]] = new class83(var10);
        }
    }

    @ObfuscatedName("ct.f(D)V")
    public void method2057(double arg0) {
        this.field1592 = arg0;
        this.method2067();
    }

    @ObfuscatedName("ct.l(II)[I")
    public int[] method2042(int arg0) {
        class83 var2 = this.field1601[arg0];
        if (var2 != null) {
            if (var2.field1418 != null) {
                this.field1596.method3540(var2);
                var2.field1430 = true;
                return var2.field1418;
            }
            boolean var3 = var2.method1773(this.field1592, this.field1597, this.field1598);
            if (var3) {
                if (this.field1595 == 0) {
                    class83 var4 = (class83) this.field1596.method3553();
                    var4.method1775();
                } else {
                    this.field1595--;
                }
                this.field1596.method3540(var2);
                var2.field1430 = true;
                return var2.field1418;
            }
        }
        return null;
    }

    @ObfuscatedName("ct.e(II)I")
    public int method2039(int arg0) {
        return this.field1601[arg0] == null ? 0 : this.field1601[arg0].field1422;
    }

    @ObfuscatedName("ct.q(II)Z")
    public boolean method2040(int arg0) {
        return this.field1601[arg0].field1423;
    }

    @ObfuscatedName("ct.o(II)Z")
    public boolean method2041(int arg0) {
        return this.field1597 == 64;
    }

    @ObfuscatedName("ct.c(I)V")
    public void method2067() {
        for (int var1 = 0; var1 < this.field1601.length; var1++) {
            if (this.field1601[var1] != null) {
                this.field1601[var1].method1775();
            }
        }
        this.field1596 = new class199();
        this.field1595 = this.field1594;
    }

    @ObfuscatedName("ct.s(II)V")
    public void method2058(int arg0) {
        for (int var2 = 0; var2 < this.field1601.length; var2++) {
            class83 var3 = this.field1601[var2];
            if (var3 != null && var3.field1428 != 0 && var3.field1430) {
                var3.method1776(arg0);
                var3.field1430 = false;
            }
        }
    }
}
