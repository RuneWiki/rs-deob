package deob;

@ObfuscatedName("ca")
public class class88 implements class85 {

    @ObfuscatedName("ca.e")
    public class76[] field1519;

    @ObfuscatedName("ca.o")
    public class177 field1518 = new class177();

    @ObfuscatedName("ca.y")
    public int field1516;

    @ObfuscatedName("ca.b")
    public int field1517 = 0;

    @ObfuscatedName("ca.w")
    public double field1522 = 1.0D;

    @ObfuscatedName("ca.r")
    public int field1515 = 128;

    @ObfuscatedName("ca.l")
    public class146 field1520;

    public class88(class146 arg0, class146 arg1, int arg2, double arg3, int arg4) {
        this.field1520 = arg1;
        this.field1516 = arg2;
        this.field1517 = this.field1516;
        this.field1522 = arg3;
        this.field1515 = arg4;
        int[] var7 = arg0.method2657(0);
        int var8 = var7.length;
        this.field1519 = new class76[arg0.method2670(0)];
        for (int var9 = 0; var9 < var8; var9++) {
            class107 var10 = new class107(arg0.method2709(0, var7[var9]));
            this.field1519[var7[var9]] = new class76(var10);
        }
    }

    @ObfuscatedName("ca.n(D)V")
    public void method1811(double arg0) {
        this.field1522 = arg0;
        this.method1815();
    }

    @ObfuscatedName("ca.e(II)[I")
    public int[] method1801(int arg0) {
        class76 var2 = this.field1519[arg0];
        if (var2 != null) {
            if (var2.field1342 != null) {
                this.field1518.method3129(var2);
                var2.field1337 = true;
                return var2.field1342;
            }
            boolean var3 = var2.method1553(this.field1522, this.field1515, this.field1520);
            if (var3) {
                if (this.field1517 == 0) {
                    class76 var4 = (class76) this.field1518.method3121();
                    var4.method1554();
                } else {
                    this.field1517--;
                }
                this.field1518.method3129(var2);
                var2.field1337 = true;
                return var2.field1342;
            }
        }
        return null;
    }

    @ObfuscatedName("ca.o(II)I")
    public int method1795(int arg0) {
        return this.field1519[arg0] == null ? 0 : this.field1519[arg0].field1333;
    }

    @ObfuscatedName("ca.y(II)Z")
    public boolean method1793(int arg0) {
        return this.field1519[arg0].field1335;
    }

    @ObfuscatedName("ca.b(IS)Z")
    public boolean method1796(int arg0) {
        return this.field1515 == 64;
    }

    @ObfuscatedName("ca.d(I)V")
    public void method1815() {
        for (int var1 = 0; var1 < this.field1519.length; var1++) {
            if (this.field1519[var1] != null) {
                this.field1519[var1].method1554();
            }
        }
        this.field1518 = new class177();
        this.field1517 = this.field1516;
    }

    @ObfuscatedName("ca.k(II)V")
    public void method1812(int arg0) {
        for (int var2 = 0; var2 < this.field1519.length; var2++) {
            class76 var3 = this.field1519[var2];
            if (var3 != null && var3.field1340 != 0 && var3.field1337) {
                var3.method1555(arg0);
                var3.field1337 = false;
            }
        }
    }
}
