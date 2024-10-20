package deob;

@ObfuscatedName("cs")
public class class96 implements class93 {

    @ObfuscatedName("cs.t")
    public class84[] field1629;

    @ObfuscatedName("cs.i")
    public class200 field1628 = new class200();

    @ObfuscatedName("cs.g")
    public int field1630;

    @ObfuscatedName("cs.h")
    public int field1631 = 0;

    @ObfuscatedName("cs.z")
    public double field1632 = 1.0D;

    @ObfuscatedName("cs.r")
    public int field1636 = 128;

    @ObfuscatedName("cs.f")
    public class168 field1634;

    public class96(class168 arg0, class168 arg1, int arg2, double arg3, int arg4) {
        this.field1634 = arg1;
        this.field1630 = arg2;
        this.field1631 = this.field1630;
        this.field1632 = arg3;
        this.field1636 = arg4;
        int[] var7 = arg0.method3011(0);
        int var8 = var7.length;
        this.field1629 = new class84[arg0.method3012(0)];
        for (int var9 = 0; var9 < var8; var9++) {
            class120 var10 = new class120(arg0.method3002(0, var7[var9]));
            this.field1629[var7[var9]] = new class84(var10);
        }
    }

    @ObfuscatedName("cs.k(D)V")
    public void method1991(double arg0) {
        this.field1632 = arg0;
        this.method1997();
    }

    @ObfuscatedName("cs.t(II)[I")
    public int[] method1980(int arg0) {
        class84 var2 = this.field1629[arg0];
        if (var2 != null) {
            if (var2.field1456 != null) {
                this.field1628.method3525(var2);
                var2.field1457 = true;
                return var2.field1456;
            }
            boolean var3 = var2.method1713(this.field1632, this.field1636, this.field1634);
            if (var3) {
                if (this.field1631 == 0) {
                    class84 var4 = (class84) this.field1628.method3513();
                    var4.method1714();
                } else {
                    this.field1631--;
                }
                this.field1628.method3525(var2);
                var2.field1457 = true;
                return var2.field1456;
            }
        }
        return null;
    }

    @ObfuscatedName("cs.i(II)I")
    public int method1973(int arg0) {
        return this.field1629[arg0] == null ? 0 : this.field1629[arg0].field1448;
    }

    @ObfuscatedName("cs.g(II)Z")
    public boolean method1974(int arg0) {
        return this.field1629[arg0].field1449;
    }

    @ObfuscatedName("cs.h(IB)Z")
    public boolean method1983(int arg0) {
        return this.field1636 == 64;
    }

    @ObfuscatedName("cs.o(I)V")
    public void method1997() {
        for (int var1 = 0; var1 < this.field1629.length; var1++) {
            if (this.field1629[var1] != null) {
                this.field1629[var1].method1714();
            }
        }
        this.field1628 = new class200();
        this.field1631 = this.field1630;
    }

    @ObfuscatedName("cs.b(II)V")
    public void method1989(int arg0) {
        for (int var2 = 0; var2 < this.field1629.length; var2++) {
            class84 var3 = this.field1629[var2];
            if (var3 != null && var3.field1450 != 0 && var3.field1457) {
                var3.method1715(arg0);
                var3.field1457 = false;
            }
        }
    }
}
