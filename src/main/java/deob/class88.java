package deob;

@ObfuscatedName("cv")
public class class88 implements class85 {

    @ObfuscatedName("cv.e")
    public class76[] field1514;

    @ObfuscatedName("cv.v")
    public class177 field1509 = new class177();

    @ObfuscatedName("cv.i")
    public int field1510;

    @ObfuscatedName("cv.g")
    public int field1511 = 0;

    @ObfuscatedName("cv.x")
    public double field1512 = 1.0D;

    @ObfuscatedName("cv.b")
    public int field1513 = 128;

    @ObfuscatedName("cv.q")
    public class146 field1516;

    public class88(class146 arg0, class146 arg1, int arg2, double arg3, int arg4) {
        this.field1516 = arg1;
        this.field1510 = arg2;
        this.field1511 = this.field1510;
        this.field1512 = arg3;
        this.field1513 = arg4;
        int[] var7 = arg0.method2704(0);
        int var8 = var7.length;
        this.field1514 = new class76[arg0.method2705(0)];
        for (int var9 = 0; var9 < var8; var9++) {
            class107 var10 = new class107(arg0.method2695(0, var7[var9]));
            this.field1514[var7[var9]] = new class76(var10);
        }
    }

    @ObfuscatedName("cv.j(D)V")
    public void method1864(double arg0) {
        this.field1512 = arg0;
        this.method1863();
    }

    @ObfuscatedName("cv.e(IB)[I")
    public int[] method1847(int arg0) {
        class76 var2 = this.field1514[arg0];
        if (var2 != null) {
            if (var2.field1338 != null) {
                this.field1509.method3216(var2);
                var2.field1332 = true;
                return var2.field1338;
            }
            boolean var3 = var2.method1589(this.field1512, this.field1513, this.field1516);
            if (var3) {
                if (this.field1511 == 0) {
                    class76 var4 = (class76) this.field1509.method3188();
                    var4.method1598();
                } else {
                    this.field1511--;
                }
                this.field1509.method3216(var2);
                var2.field1332 = true;
                return var2.field1338;
            }
        }
        return null;
    }

    @ObfuscatedName("cv.v(II)I")
    public int method1839(int arg0) {
        return this.field1514[arg0] == null ? 0 : this.field1514[arg0].field1330;
    }

    @ObfuscatedName("cv.i(IB)Z")
    public boolean method1840(int arg0) {
        return this.field1514[arg0].field1326;
    }

    @ObfuscatedName("cv.g(II)Z")
    public boolean method1853(int arg0) {
        return this.field1513 == 64;
    }

    @ObfuscatedName("cv.c(I)V")
    public void method1863() {
        for (int var1 = 0; var1 < this.field1514.length; var1++) {
            if (this.field1514[var1] != null) {
                this.field1514[var1].method1598();
            }
        }
        this.field1509 = new class177();
        this.field1511 = this.field1510;
    }

    @ObfuscatedName("cv.d(IB)V")
    public void method1861(int arg0) {
        for (int var2 = 0; var2 < this.field1514.length; var2++) {
            class76 var3 = this.field1514[var2];
            if (var3 != null && var3.field1336 != 0 && var3.field1332) {
                var3.method1591(arg0);
                var3.field1332 = false;
            }
        }
    }
}
