package deob;

@ObfuscatedName("cx")
public class class95 implements class92 {

    @ObfuscatedName("cx.h")
    public class83[] field1622;

    @ObfuscatedName("cx.m")
    public class199 field1626 = new class199();

    @ObfuscatedName("cx.i")
    public int field1628;

    @ObfuscatedName("cx.q")
    public int field1621 = 0;

    @ObfuscatedName("cx.p")
    public double field1623 = 1.0D;

    @ObfuscatedName("cx.c")
    public int field1624 = 128;

    @ObfuscatedName("cx.f")
    public class167 field1625;

    public class95(class167 arg0, class167 arg1, int arg2, double arg3, int arg4) {
        this.field1625 = arg1;
        this.field1628 = arg2;
        this.field1621 = this.field1628;
        this.field1623 = arg3;
        this.field1624 = arg4;
        int[] var7 = arg0.method3016(0);
        int var8 = var7.length;
        this.field1622 = new class83[arg0.method3017(0)];
        for (int var9 = 0; var9 < var8; var9++) {
            class119 var10 = new class119(arg0.method3051(0, var7[var9]));
            this.field1622[var7[var9]] = new class83(var10);
        }
    }

    @ObfuscatedName("cx.u(D)V")
    public void method2013(double arg0) {
        this.field1623 = arg0;
        this.method2015();
    }

    @ObfuscatedName("cx.h(II)[I")
    public int[] method2004(int arg0) {
        class83 var2 = this.field1622[arg0];
        if (var2 != null) {
            if (var2.field1450 != null) {
                this.field1626.method3542(var2);
                var2.field1442 = true;
                return var2.field1450;
            }
            boolean var3 = var2.method1739(this.field1623, this.field1624, this.field1625);
            if (var3) {
                if (this.field1621 == 0) {
                    class83 var4 = (class83) this.field1626.method3562();
                    var4.method1735();
                } else {
                    this.field1621--;
                }
                this.field1626.method3542(var2);
                var2.field1442 = true;
                return var2.field1450;
            }
        }
        return null;
    }

    @ObfuscatedName("cx.m(II)I")
    public int method1994(int arg0) {
        return this.field1622[arg0] == null ? 0 : this.field1622[arg0].field1447;
    }

    @ObfuscatedName("cx.i(IB)Z")
    public boolean method1996(int arg0) {
        return this.field1622[arg0].field1443;
    }

    @ObfuscatedName("cx.q(II)Z")
    public boolean method1997(int arg0) {
        return this.field1624 == 64;
    }

    @ObfuscatedName("cx.s(I)V")
    public void method2015() {
        for (int var1 = 0; var1 < this.field1622.length; var1++) {
            if (this.field1622[var1] != null) {
                this.field1622[var1].method1735();
            }
        }
        this.field1626 = new class199();
        this.field1621 = this.field1628;
    }

    @ObfuscatedName("cx.g(II)V")
    public void method2014(int arg0) {
        for (int var2 = 0; var2 < this.field1622.length; var2++) {
            class83 var3 = this.field1622[var2];
            if (var3 != null && var3.field1448 != 0 && var3.field1442) {
                var3.method1734(arg0);
                var3.field1442 = false;
            }
        }
    }
}
