package deob;

@ObfuscatedName("cz")
public class class88 implements class85 {

    @ObfuscatedName("cz.t")
    public class76[] field1517;

    @ObfuscatedName("cz.s")
    public class177 field1507 = new class177();

    @ObfuscatedName("cz.f")
    public int field1508;

    @ObfuscatedName("cz.e")
    public int field1509 = 0;

    @ObfuscatedName("cz.d")
    public double field1510 = 1.0D;

    @ObfuscatedName("cz.n")
    public int field1511 = 128;

    @ObfuscatedName("cz.v")
    public class146 field1506;

    public class88(class146 arg0, class146 arg1, int arg2, double arg3, int arg4) {
        this.field1506 = arg1;
        this.field1508 = arg2;
        this.field1509 = this.field1508;
        this.field1510 = arg3;
        this.field1511 = arg4;
        int[] var7 = arg0.method2786(0);
        int var8 = var7.length;
        this.field1517 = new class76[arg0.method2719(0)];
        for (int var9 = 0; var9 < var8; var9++) {
            class107 var10 = new class107(arg0.method2709(0, var7[var9]));
            this.field1517[var7[var9]] = new class76(var10);
        }
    }

    @ObfuscatedName("cz.l(D)V")
    public void method1843(double arg0) {
        this.field1510 = arg0;
        this.method1832();
    }

    @ObfuscatedName("cz.t(IS)[I")
    public int[] method1825(int arg0) {
        class76 var2 = this.field1517[arg0];
        if (var2 != null) {
            if (var2.field1327 != null) {
                this.field1507.method3240(var2);
                var2.field1328 = true;
                return var2.field1327;
            }
            boolean var3 = var2.method1561(this.field1510, this.field1511, this.field1506);
            if (var3) {
                if (this.field1509 == 0) {
                    class76 var4 = (class76) this.field1507.method3238();
                    var4.method1563();
                } else {
                    this.field1509--;
                }
                this.field1507.method3240(var2);
                var2.field1328 = true;
                return var2.field1327;
            }
        }
        return null;
    }

    @ObfuscatedName("cz.s(II)I")
    public int method1817(int arg0) {
        return this.field1517[arg0] == null ? 0 : this.field1517[arg0].field1325;
    }

    @ObfuscatedName("cz.f(IB)Z")
    public boolean method1814(int arg0) {
        return this.field1517[arg0].field1329;
    }

    @ObfuscatedName("cz.e(II)Z")
    public boolean method1815(int arg0) {
        return this.field1511 == 64;
    }

    @ObfuscatedName("cz.q(I)V")
    public void method1832() {
        for (int var1 = 0; var1 < this.field1517.length; var1++) {
            if (this.field1517[var1] != null) {
                this.field1517[var1].method1563();
            }
        }
        this.field1507 = new class177();
        this.field1509 = this.field1508;
    }

    @ObfuscatedName("cz.x(IB)V")
    public void method1833(int arg0) {
        for (int var2 = 0; var2 < this.field1517.length; var2++) {
            class76 var3 = this.field1517[var2];
            if (var3 != null && var3.field1319 != 0 && var3.field1328) {
                var3.method1562(arg0);
                var3.field1328 = false;
            }
        }
    }
}
