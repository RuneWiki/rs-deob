package deob;

@ObfuscatedName("cm")
public class class88 implements class85 {

    @ObfuscatedName("cm.p")
    public class76[] field1519;

    @ObfuscatedName("cm.g")
    public class178 field1522 = new class178();

    @ObfuscatedName("cm.x")
    public int field1520;

    @ObfuscatedName("cm.c")
    public int field1518 = 0;

    @ObfuscatedName("cm.n")
    public double field1527 = 1.0D;

    @ObfuscatedName("cm.s")
    public int field1523 = 128;

    @ObfuscatedName("cm.r")
    public class147 field1524;

    public class88(class147 arg0, class147 arg1, int arg2, double arg3, int arg4) {
        this.field1524 = arg1;
        this.field1520 = arg2;
        this.field1518 = this.field1520;
        this.field1527 = arg3;
        this.field1523 = arg4;
        int[] var7 = arg0.method2795(0);
        int var8 = var7.length;
        this.field1519 = new class76[arg0.method2796(0)];
        for (int var9 = 0; var9 < var8; var9++) {
            class107 var10 = new class107(arg0.method2855(0, var7[var9]));
            this.field1519[var7[var9]] = new class76(var10);
        }
    }

    @ObfuscatedName("cm.b(D)V")
    public void method1919(double arg0) {
        this.field1527 = arg0;
        this.method1930();
    }

    @ObfuscatedName("cm.p(IB)[I")
    public int[] method1911(int arg0) {
        class76 var2 = this.field1519[arg0];
        if (var2 != null) {
            if (var2.field1332 != null) {
                this.field1522.method3294(var2);
                var2.field1345 = true;
                return var2.field1332;
            }
            boolean var3 = var2.method1630(this.field1527, this.field1523, this.field1524);
            if (var3) {
                if (this.field1518 == 0) {
                    class76 var4 = (class76) this.field1522.method3293();
                    var4.method1632();
                } else {
                    this.field1518--;
                }
                this.field1522.method3294(var2);
                var2.field1345 = true;
                return var2.field1332;
            }
        }
        return null;
    }

    @ObfuscatedName("cm.g(II)I")
    public int method1910(int arg0) {
        return this.field1519[arg0] == null ? 0 : this.field1519[arg0].field1336;
    }

    @ObfuscatedName("cm.x(IB)Z")
    public boolean method1901(int arg0) {
        return this.field1519[arg0].field1334;
    }

    @ObfuscatedName("cm.c(IB)Z")
    public boolean method1902(int arg0) {
        return this.field1523 == 64;
    }

    @ObfuscatedName("cm.z(B)V")
    public void method1930() {
        for (int var1 = 0; var1 < this.field1519.length; var1++) {
            if (this.field1519[var1] != null) {
                this.field1519[var1].method1632();
            }
        }
        this.field1522 = new class178();
        this.field1518 = this.field1520;
    }

    @ObfuscatedName("cm.l(IB)V")
    public void method1920(int arg0) {
        for (int var2 = 0; var2 < this.field1519.length; var2++) {
            class76 var3 = this.field1519[var2];
            if (var3 != null && var3.field1338 != 0 && var3.field1345) {
                var3.method1633(arg0);
                var3.field1345 = false;
            }
        }
    }
}
