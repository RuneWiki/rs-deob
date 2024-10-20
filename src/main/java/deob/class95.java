package deob;

@ObfuscatedName("ce")
public class class95 implements class92 {

    @ObfuscatedName("ce.j")
    public class83[] field1608;

    @ObfuscatedName("ce.m")
    public class199 field1614 = new class199();

    @ObfuscatedName("ce.f")
    public int field1605;

    @ObfuscatedName("ce.l")
    public int field1604 = 0;

    @ObfuscatedName("ce.u")
    public double field1607 = 1.0D;

    @ObfuscatedName("ce.a")
    public int field1609 = 128;

    @ObfuscatedName("ce.h")
    public class167 field1603;

    public class95(class167 arg0, class167 arg1, int arg2, double arg3, int arg4) {
        this.field1603 = arg1;
        this.field1605 = arg2;
        this.field1604 = this.field1605;
        this.field1607 = arg3;
        this.field1609 = arg4;
        int[] var7 = arg0.method3093(0);
        int var8 = var7.length;
        this.field1608 = new class83[arg0.method3094(0)];
        for (int var9 = 0; var9 < var8; var9++) {
            class119 var10 = new class119(arg0.method3124(0, var7[var9]));
            this.field1608[var7[var9]] = new class83(var10);
        }
    }

    @ObfuscatedName("ce.g(D)V")
    public void method2046(double arg0) {
        this.field1607 = arg0;
        this.method2047();
    }

    @ObfuscatedName("ce.j(II)[I")
    public int[] method2024(int arg0) {
        class83 var2 = this.field1608[arg0];
        if (var2 != null) {
            if (var2.field1425 != null) {
                this.field1614.method3602(var2);
                var2.field1430 = true;
                return var2.field1425;
            }
            boolean var3 = var2.method1773(this.field1607, this.field1609, this.field1603);
            if (var3) {
                if (this.field1604 == 0) {
                    class83 var4 = (class83) this.field1614.method3601();
                    var4.method1777();
                } else {
                    this.field1604--;
                }
                this.field1614.method3602(var2);
                var2.field1430 = true;
                return var2.field1425;
            }
        }
        return null;
    }

    @ObfuscatedName("ce.m(II)I")
    public int method2035(int arg0) {
        return this.field1608[arg0] == null ? 0 : this.field1608[arg0].field1421;
    }

    @ObfuscatedName("ce.f(II)Z")
    public boolean method2031(int arg0) {
        return this.field1608[arg0].field1422;
    }

    @ObfuscatedName("ce.l(II)Z")
    public boolean method2023(int arg0) {
        return this.field1609 == 64;
    }

    @ObfuscatedName("ce.n(I)V")
    public void method2047() {
        for (int var1 = 0; var1 < this.field1608.length; var1++) {
            if (this.field1608[var1] != null) {
                this.field1608[var1].method1777();
            }
        }
        this.field1614 = new class199();
        this.field1604 = this.field1605;
    }

    @ObfuscatedName("ce.y(II)V")
    public void method2048(int arg0) {
        for (int var2 = 0; var2 < this.field1608.length; var2++) {
            class83 var3 = this.field1608[var2];
            if (var3 != null && var3.field1427 != 0 && var3.field1430) {
                var3.method1775(arg0);
                var3.field1430 = false;
            }
        }
    }
}
