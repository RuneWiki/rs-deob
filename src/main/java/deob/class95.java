package deob;

@ObfuscatedName("ci")
public class class95 implements class92 {

    @ObfuscatedName("ci.f")
    public class83[] field1623;

    @ObfuscatedName("ci.s")
    public class199 field1617 = new class199();

    @ObfuscatedName("ci.q")
    public int field1618;

    @ObfuscatedName("ci.g")
    public int field1616 = 0;

    @ObfuscatedName("ci.m")
    public double field1620 = 1.0D;

    @ObfuscatedName("ci.t")
    public int field1622 = 128;

    @ObfuscatedName("ci.j")
    public class167 field1621;

    public class95(class167 arg0, class167 arg1, int arg2, double arg3, int arg4) {
        this.field1621 = arg1;
        this.field1618 = arg2;
        this.field1616 = this.field1618;
        this.field1620 = arg3;
        this.field1622 = arg4;
        int[] var7 = arg0.method3046(0);
        int var8 = var7.length;
        this.field1623 = new class83[arg0.method3047(0)];
        for (int var9 = 0; var9 < var8; var9++) {
            class119 var10 = new class119(arg0.method3038(0, var7[var9]));
            this.field1623[var7[var9]] = new class83(var10);
        }
    }

    @ObfuscatedName("ci.o(D)V")
    public void method2048(double arg0) {
        this.field1620 = arg0;
        this.method2045();
    }

    @ObfuscatedName("ci.f(IB)[I")
    public int[] method2040(int arg0) {
        class83 var2 = this.field1623[arg0];
        if (var2 != null) {
            if (var2.field1445 != null) {
                this.field1617.method3561(var2);
                var2.field1452 = true;
                return var2.field1445;
            }
            boolean var3 = var2.method1763(this.field1620, this.field1622, this.field1621);
            if (var3) {
                if (this.field1616 == 0) {
                    class83 var4 = (class83) this.field1617.method3565();
                    var4.method1764();
                } else {
                    this.field1616--;
                }
                this.field1617.method3561(var2);
                var2.field1452 = true;
                return var2.field1445;
            }
        }
        return null;
    }

    @ObfuscatedName("ci.s(II)I")
    public int method2030(int arg0) {
        return this.field1623[arg0] == null ? 0 : this.field1623[arg0].field1443;
    }

    @ObfuscatedName("ci.q(II)Z")
    public boolean method2031(int arg0) {
        return this.field1623[arg0].field1444;
    }

    @ObfuscatedName("ci.g(II)Z")
    public boolean method2029(int arg0) {
        return this.field1622 == 64;
    }

    @ObfuscatedName("ci.p(B)V")
    public void method2045() {
        for (int var1 = 0; var1 < this.field1623.length; var1++) {
            if (this.field1623[var1] != null) {
                this.field1623[var1].method1764();
            }
        }
        this.field1617 = new class199();
        this.field1616 = this.field1618;
    }

    @ObfuscatedName("ci.b(IS)V")
    public void method2047(int arg0) {
        for (int var2 = 0; var2 < this.field1623.length; var2++) {
            class83 var3 = this.field1623[var2];
            if (var3 != null && var3.field1449 != 0 && var3.field1452) {
                var3.method1765(arg0);
                var3.field1452 = false;
            }
        }
    }
}
