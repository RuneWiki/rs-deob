package deob;

@ObfuscatedName("cp")
public class class88 implements class85 {

    @ObfuscatedName("cp.j")
    public class76[] field1513;

    @ObfuscatedName("cp.z")
    public class177 field1522 = new class177();

    @ObfuscatedName("cp.y")
    public int field1515;

    @ObfuscatedName("cp.h")
    public int field1516 = 0;

    @ObfuscatedName("cp.r")
    public double field1517 = 1.0D;

    @ObfuscatedName("cp.e")
    public int field1518 = 128;

    @ObfuscatedName("cp.k")
    public class146 field1519;

    public class88(class146 arg0, class146 arg1, int arg2, double arg3, int arg4) {
        this.field1519 = arg1;
        this.field1515 = arg2;
        this.field1516 = this.field1515;
        this.field1517 = arg3;
        this.field1518 = arg4;
        int[] var7 = arg0.method2748(0);
        int var8 = var7.length;
        this.field1513 = new class76[arg0.method2749(0)];
        for (int var9 = 0; var9 < var8; var9++) {
            class107 var10 = new class107(arg0.method2739(0, var7[var9]));
            this.field1513[var7[var9]] = new class76(var10);
        }
    }

    @ObfuscatedName("cp.m(D)V")
    public void method1877(double arg0) {
        this.field1517 = arg0;
        this.method1878();
    }

    @ObfuscatedName("cp.j(II)[I")
    public int[] method1861(int arg0) {
        class76 var2 = this.field1513[arg0];
        if (var2 != null) {
            if (var2.field1343 != null) {
                this.field1522.method3237(var2);
                var2.field1344 = true;
                return var2.field1343;
            }
            boolean var3 = var2.method1589(this.field1517, this.field1518, this.field1519);
            if (var3) {
                if (this.field1516 == 0) {
                    class76 var4 = (class76) this.field1522.method3240();
                    var4.method1595();
                } else {
                    this.field1516--;
                }
                this.field1522.method3237(var2);
                var2.field1344 = true;
                return var2.field1343;
            }
        }
        return null;
    }

    @ObfuscatedName("cp.z(II)I")
    public int method1862(int arg0) {
        return this.field1513[arg0] == null ? 0 : this.field1513[arg0].field1331;
    }

    @ObfuscatedName("cp.y(II)Z")
    public boolean method1853(int arg0) {
        return this.field1513[arg0].field1340;
    }

    @ObfuscatedName("cp.h(IB)Z")
    public boolean method1855(int arg0) {
        return this.field1518 == 64;
    }

    @ObfuscatedName("cp.v(I)V")
    public void method1878() {
        for (int var1 = 0; var1 < this.field1513.length; var1++) {
            if (this.field1513[var1] != null) {
                this.field1513[var1].method1595();
            }
        }
        this.field1522 = new class177();
        this.field1516 = this.field1515;
    }

    @ObfuscatedName("cp.u(II)V")
    public void method1879(int arg0) {
        for (int var2 = 0; var2 < this.field1513.length; var2++) {
            class76 var3 = this.field1513[var2];
            if (var3 != null && var3.field1336 != 0 && var3.field1344) {
                var3.method1590(arg0);
                var3.field1344 = false;
            }
        }
    }
}
