package deob;

@ObfuscatedName("cb")
public class class95 implements class92 {

    @ObfuscatedName("cb.i")
    public class83[] field1609;

    @ObfuscatedName("cb.v")
    public class199 field1605 = new class199();

    @ObfuscatedName("cb.r")
    public int field1606;

    @ObfuscatedName("cb.n")
    public int field1607 = 0;

    @ObfuscatedName("cb.x")
    public double field1608 = 1.0D;

    @ObfuscatedName("cb.q")
    public int field1604 = 128;

    @ObfuscatedName("cb.h")
    public class167 field1610;

    public class95(class167 arg0, class167 arg1, int arg2, double arg3, int arg4) {
        this.field1610 = arg1;
        this.field1606 = arg2;
        this.field1607 = this.field1606;
        this.field1608 = arg3;
        this.field1604 = arg4;
        int[] var7 = arg0.method3043(0);
        int var8 = var7.length;
        this.field1609 = new class83[arg0.method3044(0)];
        for (int var9 = 0; var9 < var8; var9++) {
            class119 var10 = new class119(arg0.method3035(0, var7[var9]));
            this.field1609[var7[var9]] = new class83(var10);
        }
    }

    @ObfuscatedName("cb.b(D)V")
    public void method2025(double arg0) {
        this.field1608 = arg0;
        this.method2028();
    }

    @ObfuscatedName("cb.i(IB)[I")
    public int[] method2009(int arg0) {
        class83 var2 = this.field1609[arg0];
        if (var2 != null) {
            if (var2.field1443 != null) {
                this.field1605.method3530(var2);
                var2.field1431 = true;
                return var2.field1443;
            }
            boolean var3 = var2.method1746(this.field1608, this.field1604, this.field1610);
            if (var3) {
                if (this.field1607 == 0) {
                    class83 var4 = (class83) this.field1605.method3531();
                    var4.method1751();
                } else {
                    this.field1607--;
                }
                this.field1605.method3530(var2);
                var2.field1431 = true;
                return var2.field1443;
            }
        }
        return null;
    }

    @ObfuscatedName("cb.v(II)I")
    public int method2005(int arg0) {
        return this.field1609[arg0] == null ? 0 : this.field1609[arg0].field1435;
    }

    @ObfuscatedName("cb.r(II)Z")
    public boolean method2017(int arg0) {
        return this.field1609[arg0].field1436;
    }

    @ObfuscatedName("cb.n(II)Z")
    public boolean method2007(int arg0) {
        return this.field1604 == 64;
    }

    @ObfuscatedName("cb.l(I)V")
    public void method2028() {
        for (int var1 = 0; var1 < this.field1609.length; var1++) {
            if (this.field1609[var1] != null) {
                this.field1609[var1].method1751();
            }
        }
        this.field1605 = new class199();
        this.field1607 = this.field1606;
    }

    @ObfuscatedName("cb.s(II)V")
    public void method2024(int arg0) {
        for (int var2 = 0; var2 < this.field1609.length; var2++) {
            class83 var3 = this.field1609[var2];
            if (var3 != null && var3.field1441 != 0 && var3.field1431) {
                var3.method1745(arg0);
                var3.field1431 = false;
            }
        }
    }
}
