package deob;

@ObfuscatedName("cb")
public class class96 implements class93 {

    @ObfuscatedName("cb.j")
    public class84[] field1606;

    @ObfuscatedName("cb.h")
    public class200 field1601 = new class200();

    @ObfuscatedName("cb.m")
    public int field1602;

    @ObfuscatedName("cb.z")
    public int field1605 = 0;

    @ObfuscatedName("cb.x")
    public double field1604 = 1.0D;

    @ObfuscatedName("cb.e")
    public int field1600 = 128;

    @ObfuscatedName("cb.i")
    public class168 field1603;

    public class96(class168 arg0, class168 arg1, int arg2, double arg3, int arg4) {
        this.field1603 = arg1;
        this.field1602 = arg2;
        this.field1605 = this.field1602;
        this.field1604 = arg3;
        this.field1600 = arg4;
        int[] var7 = arg0.method3020(0);
        int var8 = var7.length;
        this.field1606 = new class84[arg0.method3021(0)];
        for (int var9 = 0; var9 < var8; var9++) {
            class120 var10 = new class120(arg0.method3011(0, var7[var9]));
            this.field1606[var7[var9]] = new class84(var10);
        }
    }

    @ObfuscatedName("cb.q(D)V")
    public void method2050(double arg0) {
        this.field1604 = arg0;
        this.method2052();
    }

    @ObfuscatedName("cb.j(IS)[I")
    public int[] method2037(int arg0) {
        class84 var2 = this.field1606[arg0];
        if (var2 != null) {
            if (var2.field1437 != null) {
                this.field1601.method3536(var2);
                var2.field1428 = true;
                return var2.field1437;
            }
            boolean var3 = var2.method1770(this.field1604, this.field1600, this.field1603);
            if (var3) {
                if (this.field1605 == 0) {
                    class84 var4 = (class84) this.field1601.method3534();
                    var4.method1772();
                } else {
                    this.field1605--;
                }
                this.field1601.method3536(var2);
                var2.field1428 = true;
                return var2.field1437;
            }
        }
        return null;
    }

    @ObfuscatedName("cb.h(II)I")
    public int method2033(int arg0) {
        return this.field1606[arg0] == null ? 0 : this.field1606[arg0].field1429;
    }

    @ObfuscatedName("cb.m(II)Z")
    public boolean method2034(int arg0) {
        return this.field1606[arg0].field1430;
    }

    @ObfuscatedName("cb.z(IB)Z")
    public boolean method2032(int arg0) {
        return this.field1600 == 64;
    }

    @ObfuscatedName("cb.b(B)V")
    public void method2052() {
        for (int var1 = 0; var1 < this.field1606.length; var1++) {
            if (this.field1606[var1] != null) {
                this.field1606[var1].method1772();
            }
        }
        this.field1601 = new class200();
        this.field1605 = this.field1602;
    }

    @ObfuscatedName("cb.t(II)V")
    public void method2051(int arg0) {
        for (int var2 = 0; var2 < this.field1606.length; var2++) {
            class84 var3 = this.field1606[var2];
            if (var3 != null && var3.field1434 != 0 && var3.field1428) {
                var3.method1773(arg0);
                var3.field1428 = false;
            }
        }
    }
}
