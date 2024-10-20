package deob;

@ObfuscatedName("ca")
public class class95 implements class92 {

    @ObfuscatedName("ca.o")
    public class83[] field1623;

    @ObfuscatedName("ca.f")
    public class199 field1612 = new class199();

    @ObfuscatedName("ca.i")
    public int field1613;

    @ObfuscatedName("ca.h")
    public int field1614 = 0;

    @ObfuscatedName("ca.q")
    public double field1615 = 1.0D;

    @ObfuscatedName("ca.u")
    public int field1616 = 128;

    @ObfuscatedName("ca.m")
    public class167 field1617;

    public class95(class167 arg0, class167 arg1, int arg2, double arg3, int arg4) {
        this.field1617 = arg1;
        this.field1613 = arg2;
        this.field1614 = this.field1613;
        this.field1615 = arg3;
        this.field1616 = arg4;
        int[] var7 = arg0.method2983(0);
        int var8 = var7.length;
        this.field1623 = new class83[arg0.method2973(0)];
        for (int var9 = 0; var9 < var8; var9++) {
            class119 var10 = new class119(arg0.method3030(0, var7[var9]));
            this.field1623[var7[var9]] = new class83(var10);
        }
    }

    @ObfuscatedName("ca.e(D)V")
    public void method1982(double arg0) {
        this.field1615 = arg0;
        this.method1981();
    }

    @ObfuscatedName("ca.o(II)[I")
    public int[] method1966(int arg0) {
        class83 var2 = this.field1623[arg0];
        if (var2 != null) {
            if (var2.field1414 != null) {
                this.field1612.method3516(var2);
                var2.field1426 = true;
                return var2.field1414;
            }
            boolean var3 = var2.method1714(this.field1615, this.field1616, this.field1617);
            if (var3) {
                if (this.field1614 == 0) {
                    class83 var4 = (class83) this.field1612.method3539();
                    var4.method1706();
                } else {
                    this.field1614--;
                }
                this.field1612.method3516(var2);
                var2.field1426 = true;
                return var2.field1414;
            }
        }
        return null;
    }

    @ObfuscatedName("ca.f(IB)I")
    public int method1961(int arg0) {
        return this.field1623[arg0] == null ? 0 : this.field1623[arg0].field1427;
    }

    @ObfuscatedName("ca.i(IB)Z")
    public boolean method1970(int arg0) {
        return this.field1623[arg0].field1418;
    }

    @ObfuscatedName("ca.h(IB)Z")
    public boolean method1963(int arg0) {
        return this.field1616 == 64;
    }

    @ObfuscatedName("ca.a(I)V")
    public void method1981() {
        for (int var1 = 0; var1 < this.field1623.length; var1++) {
            if (this.field1623[var1] != null) {
                this.field1623[var1].method1706();
            }
        }
        this.field1612 = new class199();
        this.field1614 = this.field1613;
    }

    @ObfuscatedName("ca.w(IB)V")
    public void method1983(int arg0) {
        for (int var2 = 0; var2 < this.field1623.length; var2++) {
            class83 var3 = this.field1623[var2];
            if (var3 != null && var3.field1417 != 0 && var3.field1426) {
                var3.method1708(arg0);
                var3.field1426 = false;
            }
        }
    }
}
