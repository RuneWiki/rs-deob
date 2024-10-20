package deob;

@ObfuscatedName("cc")
public class class90 implements class87 {

    @ObfuscatedName("cc.n")
    public class78[] field1551;

    @ObfuscatedName("cc.d")
    public class190 field1543 = new class190();

    @ObfuscatedName("cc.z")
    public int field1544;

    @ObfuscatedName("cc.y")
    public int field1545 = 0;

    @ObfuscatedName("cc.e")
    public double field1549 = 1.0D;

    @ObfuscatedName("cc.g")
    public int field1547 = 128;

    @ObfuscatedName("cc.f")
    public class158 field1548;

    public class90(class158 arg0, class158 arg1, int arg2, double arg3, int arg4) {
        this.field1548 = arg1;
        this.field1544 = arg2;
        this.field1545 = this.field1544;
        this.field1549 = arg3;
        this.field1547 = arg4;
        int[] var7 = arg0.method2959(0);
        int var8 = var7.length;
        this.field1551 = new class78[arg0.method2978(0)];
        for (int var9 = 0; var9 < var8; var9++) {
            class111 var10 = new class111(arg0.method2948(0, var7[var9]));
            this.field1551[var7[var9]] = new class78(var10);
        }
    }

    @ObfuscatedName("cc.r(D)V")
    public void method1949(double arg0) {
        this.field1549 = arg0;
        this.method1951();
    }

    @ObfuscatedName("cc.n(II)[I")
    public int[] method1937(int arg0) {
        class78 var2 = this.field1551[arg0];
        if (var2 != null) {
            if (var2.field1375 != null) {
                this.field1543.method3478(var2);
                var2.field1376 = true;
                return var2.field1375;
            }
            boolean var3 = var2.method1656(this.field1549, this.field1547, this.field1548);
            if (var3) {
                if (this.field1545 == 0) {
                    class78 var4 = (class78) this.field1543.method3481();
                    var4.method1657();
                } else {
                    this.field1545--;
                }
                this.field1543.method3478(var2);
                var2.field1376 = true;
                return var2.field1375;
            }
        }
        return null;
    }

    @ObfuscatedName("cc.d(II)I")
    public int method1931(int arg0) {
        return this.field1551[arg0] == null ? 0 : this.field1551[arg0].field1367;
    }

    @ObfuscatedName("cc.z(IS)Z")
    public boolean method1932(int arg0) {
        return this.field1551[arg0].field1368;
    }

    @ObfuscatedName("cc.y(II)Z")
    public boolean method1933(int arg0) {
        return this.field1547 == 64;
    }

    @ObfuscatedName("cc.j(I)V")
    public void method1951() {
        for (int var1 = 0; var1 < this.field1551.length; var1++) {
            if (this.field1551[var1] != null) {
                this.field1551[var1].method1657();
            }
        }
        this.field1543 = new class190();
        this.field1545 = this.field1544;
    }

    @ObfuscatedName("cc.s(II)V")
    public void method1950(int arg0) {
        for (int var2 = 0; var2 < this.field1551.length; var2++) {
            class78 var3 = this.field1551[var2];
            if (var3 != null && var3.field1373 != 0 && var3.field1376) {
                var3.method1663(arg0);
                var3.field1376 = false;
            }
        }
    }
}
