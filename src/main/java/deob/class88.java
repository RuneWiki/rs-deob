package deob;

@ObfuscatedName("cm")
public class class88 implements class85 {

    @ObfuscatedName("cm.z")
    public class76[] field1489;

    @ObfuscatedName("cm.j")
    public class177 field1481 = new class177();

    @ObfuscatedName("cm.a")
    public int field1482;

    @ObfuscatedName("cm.y")
    public int field1483 = 0;

    @ObfuscatedName("cm.i")
    public double field1484 = 1.0D;

    @ObfuscatedName("cm.b")
    public int field1491 = 128;

    @ObfuscatedName("cm.s")
    public class146 field1485;

    public class88(class146 arg0, class146 arg1, int arg2, double arg3, int arg4) {
        this.field1485 = arg1;
        this.field1482 = arg2;
        this.field1483 = this.field1482;
        this.field1484 = arg3;
        this.field1491 = arg4;
        int[] var7 = arg0.method2720(0);
        int var8 = var7.length;
        this.field1489 = new class76[arg0.method2738(0)];
        for (int var9 = 0; var9 < var8; var9++) {
            class107 var10 = new class107(arg0.method2705(0, var7[var9]));
            this.field1489[var7[var9]] = new class76(var10);
        }
    }

    @ObfuscatedName("cm.u(D)V")
    public void method1863(double arg0) {
        this.field1484 = arg0;
        this.method1866();
    }

    @ObfuscatedName("cm.z(II)[I")
    public int[] method1842(int arg0) {
        class76 var2 = this.field1489[arg0];
        if (var2 != null) {
            if (var2.field1317 != null) {
                this.field1481.method3228(var2);
                var2.field1318 = true;
                return var2.field1317;
            }
            boolean var3 = var2.method1585(this.field1484, this.field1491, this.field1485);
            if (var3) {
                if (this.field1483 == 0) {
                    class76 var4 = (class76) this.field1481.method3231();
                    var4.method1587();
                } else {
                    this.field1483--;
                }
                this.field1481.method3228(var2);
                var2.field1318 = true;
                return var2.field1317;
            }
        }
        return null;
    }

    @ObfuscatedName("cm.j(II)I")
    public int method1845(int arg0) {
        return this.field1489[arg0] == null ? 0 : this.field1489[arg0].field1312;
    }

    @ObfuscatedName("cm.a(II)Z")
    public boolean method1843(int arg0) {
        return this.field1489[arg0].field1310;
    }

    @ObfuscatedName("cm.y(IB)Z")
    public boolean method1844(int arg0) {
        return this.field1491 == 64;
    }

    @ObfuscatedName("cm.c(B)V")
    public void method1866() {
        for (int var1 = 0; var1 < this.field1489.length; var1++) {
            if (this.field1489[var1] != null) {
                this.field1489[var1].method1587();
            }
        }
        this.field1481 = new class177();
        this.field1483 = this.field1482;
    }

    @ObfuscatedName("cm.l(II)V")
    public void method1862(int arg0) {
        for (int var2 = 0; var2 < this.field1489.length; var2++) {
            class76 var3 = this.field1489[var2];
            if (var3 != null && var3.field1315 != 0 && var3.field1318) {
                var3.method1584(arg0);
                var3.field1318 = false;
            }
        }
    }
}
