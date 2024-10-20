package deob;

@ObfuscatedName("cl")
public class class95 implements class92 {

    @ObfuscatedName("cl.k")
    public class83[] field1592;

    @ObfuscatedName("cl.h")
    public class199 field1586 = new class199();

    @ObfuscatedName("cl.o")
    public int field1585;

    @ObfuscatedName("cl.z")
    public int field1588 = 0;

    @ObfuscatedName("cl.c")
    public double field1589 = 1.0D;

    @ObfuscatedName("cl.d")
    public int field1590 = 128;

    @ObfuscatedName("cl.l")
    public class167 field1587;

    public class95(class167 arg0, class167 arg1, int arg2, double arg3, int arg4) {
        this.field1587 = arg1;
        this.field1585 = arg2;
        this.field1588 = this.field1585;
        this.field1589 = arg3;
        this.field1590 = arg4;
        int[] var7 = arg0.method3125(0);
        int var8 = var7.length;
        this.field1592 = new class83[arg0.method3059(0)];
        for (int var9 = 0; var9 < var8; var9++) {
            class119 var10 = new class119(arg0.method3118(0, var7[var9]));
            this.field1592[var7[var9]] = new class83(var10);
        }
    }

    @ObfuscatedName("cl.q(D)V")
    public void method2033(double arg0) {
        this.field1589 = arg0;
        this.method2035();
    }

    @ObfuscatedName("cl.k(II)[I")
    public int[] method2017(int arg0) {
        class83 var2 = this.field1592[arg0];
        if (var2 != null) {
            if (var2.field1410 != null) {
                this.field1586.method3577(var2);
                var2.field1411 = true;
                return var2.field1410;
            }
            boolean var3 = var2.method1747(this.field1589, this.field1590, this.field1587);
            if (var3) {
                if (this.field1588 == 0) {
                    class83 var4 = (class83) this.field1586.method3579();
                    var4.method1746();
                } else {
                    this.field1588--;
                }
                this.field1586.method3577(var2);
                var2.field1411 = true;
                return var2.field1410;
            }
        }
        return null;
    }

    @ObfuscatedName("cl.h(IB)I")
    public int method2018(int arg0) {
        return this.field1592[arg0] == null ? 0 : this.field1592[arg0].field1402;
    }

    @ObfuscatedName("cl.o(IB)Z")
    public boolean method2019(int arg0) {
        return this.field1592[arg0].field1403;
    }

    @ObfuscatedName("cl.z(II)Z")
    public boolean method2020(int arg0) {
        return this.field1590 == 64;
    }

    @ObfuscatedName("cl.u(S)V")
    public void method2035() {
        for (int var1 = 0; var1 < this.field1592.length; var1++) {
            if (this.field1592[var1] != null) {
                this.field1592[var1].method1746();
            }
        }
        this.field1586 = new class199();
        this.field1588 = this.field1585;
    }

    @ObfuscatedName("cl.r(IB)V")
    public void method2037(int arg0) {
        for (int var2 = 0; var2 < this.field1592.length; var2++) {
            class83 var3 = this.field1592[var2];
            if (var3 != null && var3.field1408 != 0 && var3.field1411) {
                var3.method1751(arg0);
                var3.field1411 = false;
            }
        }
    }
}
