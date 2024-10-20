package deob;

@ObfuscatedName("cr")
public class class95 implements class92 {

    @ObfuscatedName("cr.h")
    public class83[] field1624;

    @ObfuscatedName("cr.q")
    public class199 field1615 = new class199();

    @ObfuscatedName("cr.v")
    public int field1616;

    @ObfuscatedName("cr.n")
    public int field1617 = 0;

    @ObfuscatedName("cr.f")
    public double field1622 = 1.0D;

    @ObfuscatedName("cr.g")
    public int field1623 = 128;

    @ObfuscatedName("cr.o")
    public class167 field1620;

    public class95(class167 arg0, class167 arg1, int arg2, double arg3, int arg4) {
        this.field1620 = arg1;
        this.field1616 = arg2;
        this.field1617 = this.field1616;
        this.field1622 = arg3;
        this.field1623 = arg4;
        int[] var7 = arg0.method3132(0);
        int var8 = var7.length;
        this.field1624 = new class83[arg0.method3092(0)];
        for (int var9 = 0; var9 < var8; var9++) {
            class119 var10 = new class119(arg0.method3073(0, var7[var9]));
            this.field1624[var7[var9]] = new class83(var10);
        }
    }

    @ObfuscatedName("cr.m(D)V")
    public void method2064(double arg0) {
        this.field1622 = arg0;
        this.method2063();
    }

    @ObfuscatedName("cr.h(IB)[I")
    public int[] method2048(int arg0) {
        class83 var2 = this.field1624[arg0];
        if (var2 != null) {
            if (var2.field1442 != null) {
                this.field1615.method3621(var2);
                var2.field1440 = true;
                return var2.field1442;
            }
            boolean var3 = var2.method1777(this.field1622, this.field1623, this.field1620);
            if (var3) {
                if (this.field1617 == 0) {
                    class83 var4 = (class83) this.field1615.method3619();
                    var4.method1772();
                } else {
                    this.field1617--;
                }
                this.field1615.method3621(var2);
                var2.field1440 = true;
                return var2.field1442;
            }
        }
        return null;
    }

    @ObfuscatedName("cr.q(IB)I")
    public int method2040(int arg0) {
        return this.field1624[arg0] == null ? 0 : this.field1624[arg0].field1434;
    }

    @ObfuscatedName("cr.v(II)Z")
    public boolean method2041(int arg0) {
        return this.field1624[arg0].field1435;
    }

    @ObfuscatedName("cr.n(II)Z")
    public boolean method2042(int arg0) {
        return this.field1623 == 64;
    }

    @ObfuscatedName("cr.t(S)V")
    public void method2063() {
        for (int var1 = 0; var1 < this.field1624.length; var1++) {
            if (this.field1624[var1] != null) {
                this.field1624[var1].method1772();
            }
        }
        this.field1615 = new class199();
        this.field1617 = this.field1616;
    }

    @ObfuscatedName("cr.z(II)V")
    public void method2065(int arg0) {
        for (int var2 = 0; var2 < this.field1624.length; var2++) {
            class83 var3 = this.field1624[var2];
            if (var3 != null && var3.field1430 != 0 && var3.field1440) {
                var3.method1770(arg0);
                var3.field1440 = false;
            }
        }
    }
}
