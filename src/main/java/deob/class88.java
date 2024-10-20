package deob;

@ObfuscatedName("ck")
public class class88 implements class85 {

    @ObfuscatedName("ck.g")
    public class76[] field1512;

    @ObfuscatedName("ck.v")
    public class177 field1513 = new class177();

    @ObfuscatedName("ck.z")
    public int field1518;

    @ObfuscatedName("ck.h")
    public int field1520 = 0;

    @ObfuscatedName("ck.k")
    public double field1516 = 1.0D;

    @ObfuscatedName("ck.l")
    public int field1517 = 128;

    @ObfuscatedName("ck.e")
    public class146 field1515;

    public class88(class146 arg0, class146 arg1, int arg2, double arg3, int arg4) {
        this.field1515 = arg1;
        this.field1518 = arg2;
        this.field1520 = this.field1518;
        this.field1516 = arg3;
        this.field1517 = arg4;
        int[] var7 = arg0.method2717(0);
        int var8 = var7.length;
        this.field1512 = new class76[arg0.method2718(0)];
        for (int var9 = 0; var9 < var8; var9++) {
            class107 var10 = new class107(arg0.method2708(0, var7[var9]));
            this.field1512[var7[var9]] = new class76(var10);
        }
    }

    @ObfuscatedName("ck.a(D)V")
    public void method1882(double arg0) {
        this.field1516 = arg0;
        this.method1877();
    }

    @ObfuscatedName("ck.g(II)[I")
    public int[] method1873(int arg0) {
        class76 var2 = this.field1512[arg0];
        if (var2 != null) {
            if (var2.field1323 != null) {
                this.field1513.method3238(var2);
                var2.field1327 = true;
                return var2.field1323;
            }
            boolean var3 = var2.method1611(this.field1516, this.field1517, this.field1515);
            if (var3) {
                if (this.field1520 == 0) {
                    class76 var4 = (class76) this.field1513.method3236();
                    var4.method1609();
                } else {
                    this.field1520--;
                }
                this.field1513.method3238(var2);
                var2.field1327 = true;
                return var2.field1323;
            }
        }
        return null;
    }

    @ObfuscatedName("ck.v(II)I")
    public int method1864(int arg0) {
        return this.field1512[arg0] == null ? 0 : this.field1512[arg0].field1326;
    }

    @ObfuscatedName("ck.z(II)Z")
    public boolean method1866(int arg0) {
        return this.field1512[arg0].field1328;
    }

    @ObfuscatedName("ck.h(II)Z")
    public boolean method1867(int arg0) {
        return this.field1517 == 64;
    }

    @ObfuscatedName("ck.i(I)V")
    public void method1877() {
        for (int var1 = 0; var1 < this.field1512.length; var1++) {
            if (this.field1512[var1] != null) {
                this.field1512[var1].method1609();
            }
        }
        this.field1513 = new class177();
        this.field1520 = this.field1518;
    }

    @ObfuscatedName("ck.y(II)V")
    public void method1876(int arg0) {
        for (int var2 = 0; var2 < this.field1512.length; var2++) {
            class76 var3 = this.field1512[var2];
            if (var3 != null && var3.field1333 != 0 && var3.field1327) {
                var3.method1610(arg0);
                var3.field1327 = false;
            }
        }
    }
}
