package deob;

@ObfuscatedName("cd")
public class class88 implements class85 {

    @ObfuscatedName("cd.i")
    public class76[] field1519;

    @ObfuscatedName("cd.c")
    public class177 field1513 = new class177();

    @ObfuscatedName("cd.h")
    public int field1514;

    @ObfuscatedName("cd.v")
    public int field1515 = 0;

    @ObfuscatedName("cd.q")
    public double field1520 = 1.0D;

    @ObfuscatedName("cd.s")
    public int field1517 = 128;

    @ObfuscatedName("cd.g")
    public class146 field1518;

    public class88(class146 arg0, class146 arg1, int arg2, double arg3, int arg4) {
        this.field1518 = arg1;
        this.field1514 = arg2;
        this.field1515 = this.field1514;
        this.field1520 = arg3;
        this.field1517 = arg4;
        int[] var7 = arg0.method2749(0);
        int var8 = var7.length;
        this.field1519 = new class76[arg0.method2750(0)];
        for (int var9 = 0; var9 < var8; var9++) {
            class107 var10 = new class107(arg0.method2811(0, var7[var9]));
            this.field1519[var7[var9]] = new class76(var10);
        }
    }

    @ObfuscatedName("cd.t(D)V")
    public void method1883(double arg0) {
        this.field1520 = arg0;
        this.method1892();
    }

    @ObfuscatedName("cd.i(II)[I")
    public int[] method1875(int arg0) {
        class76 var2 = this.field1519[arg0];
        if (var2 != null) {
            if (var2.field1339 != null) {
                this.field1513.method3252(var2);
                var2.field1348 = true;
                return var2.field1339;
            }
            boolean var3 = var2.method1612(this.field1520, this.field1517, this.field1518);
            if (var3) {
                if (this.field1515 == 0) {
                    class76 var4 = (class76) this.field1513.method3255();
                    var4.method1619();
                } else {
                    this.field1515--;
                }
                this.field1513.method3252(var2);
                var2.field1348 = true;
                return var2.field1339;
            }
        }
        return null;
    }

    @ObfuscatedName("cd.c(IB)I")
    public int method1868(int arg0) {
        return this.field1519[arg0] == null ? 0 : this.field1519[arg0].field1338;
    }

    @ObfuscatedName("cd.h(II)Z")
    public boolean method1865(int arg0) {
        return this.field1519[arg0].field1347;
    }

    @ObfuscatedName("cd.v(II)Z")
    public boolean method1873(int arg0) {
        return this.field1517 == 64;
    }

    @ObfuscatedName("cd.z(I)V")
    public void method1892() {
        for (int var1 = 0; var1 < this.field1519.length; var1++) {
            if (this.field1519[var1] != null) {
                this.field1519[var1].method1619();
            }
        }
        this.field1513 = new class177();
        this.field1515 = this.field1514;
    }

    @ObfuscatedName("cd.b(II)V")
    public void method1886(int arg0) {
        for (int var2 = 0; var2 < this.field1519.length; var2++) {
            class76 var3 = this.field1519[var2];
            if (var3 != null && var3.field1345 != 0 && var3.field1348) {
                var3.method1621(arg0);
                var3.field1348 = false;
            }
        }
    }
}
