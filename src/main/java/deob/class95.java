package deob;

@ObfuscatedName("cs")
public class class95 implements class92 {

    @ObfuscatedName("cs.n")
    public class83[] field1612;

    @ObfuscatedName("cs.q")
    public class199 field1605 = new class199();

    @ObfuscatedName("cs.c")
    public int field1606;

    @ObfuscatedName("cs.l")
    public int field1607 = 0;

    @ObfuscatedName("cs.r")
    public double field1604 = 1.0D;

    @ObfuscatedName("cs.u")
    public int field1609 = 128;

    @ObfuscatedName("cs.j")
    public class167 field1608;

    public class95(class167 arg0, class167 arg1, int arg2, double arg3, int arg4) {
        this.field1608 = arg1;
        this.field1606 = arg2;
        this.field1607 = this.field1606;
        this.field1604 = arg3;
        this.field1609 = arg4;
        int[] var7 = arg0.method3085(0);
        int var8 = var7.length;
        this.field1612 = new class83[arg0.method3030(0)];
        for (int var9 = 0; var9 < var8; var9++) {
            class119 var10 = new class119(arg0.method3094(0, var7[var9]));
            this.field1612[var7[var9]] = new class83(var10);
        }
    }

    @ObfuscatedName("cs.x(D)V")
    public void method2048(double arg0) {
        this.field1604 = arg0;
        this.method2063();
    }

    @ObfuscatedName("cs.n(II)[I")
    public int[] method2023(int arg0) {
        class83 var2 = this.field1612[arg0];
        if (var2 != null) {
            if (var2.field1415 != null) {
                this.field1605.method3554(var2);
                var2.field1418 = true;
                return var2.field1415;
            }
            boolean var3 = var2.method1765(this.field1604, this.field1609, this.field1608);
            if (var3) {
                if (this.field1607 == 0) {
                    class83 var4 = (class83) this.field1605.method3548();
                    var4.method1769();
                } else {
                    this.field1607--;
                }
                this.field1605.method3554(var2);
                var2.field1418 = true;
                return var2.field1415;
            }
        }
        return null;
    }

    @ObfuscatedName("cs.q(II)I")
    public int method2020(int arg0) {
        return this.field1612[arg0] == null ? 0 : this.field1612[arg0].field1419;
    }

    @ObfuscatedName("cs.c(IB)Z")
    public boolean method2022(int arg0) {
        return this.field1612[arg0].field1420;
    }

    @ObfuscatedName("cs.l(II)Z")
    public boolean method2021(int arg0) {
        return this.field1609 == 64;
    }

    @ObfuscatedName("cs.z(I)V")
    public void method2063() {
        for (int var1 = 0; var1 < this.field1612.length; var1++) {
            if (this.field1612[var1] != null) {
                this.field1612[var1].method1769();
            }
        }
        this.field1605 = new class199();
        this.field1607 = this.field1606;
    }

    @ObfuscatedName("cs.d(IB)V")
    public void method2051(int arg0) {
        for (int var2 = 0; var2 < this.field1612.length; var2++) {
            class83 var3 = this.field1612[var2];
            if (var3 != null && var3.field1425 != 0 && var3.field1418) {
                var3.method1767(arg0);
                var3.field1418 = false;
            }
        }
    }
}
