package deob;

@ObfuscatedName("cq")
public class class90 implements class87 {

    @ObfuscatedName("cq.e")
    public class78[] field1495;

    @ObfuscatedName("cq.a")
    public class189 field1498 = new class189();

    @ObfuscatedName("cq.l")
    public int field1492;

    @ObfuscatedName("cq.c")
    public int field1500 = 0;

    @ObfuscatedName("cq.u")
    public double field1499 = 1.0D;

    @ObfuscatedName("cq.w")
    public int field1497 = 128;

    @ObfuscatedName("cq.i")
    public class158 field1494;

    public class90(class158 arg0, class158 arg1, int arg2, double arg3, int arg4) {
        this.field1494 = arg1;
        this.field1492 = arg2;
        this.field1500 = this.field1492;
        this.field1499 = arg3;
        this.field1497 = arg4;
        int[] var7 = arg0.method2852(0);
        int var8 = var7.length;
        this.field1495 = new class78[arg0.method2864(0)];
        for (int var9 = 0; var9 < var8; var9++) {
            class111 var10 = new class111(arg0.method2843(0, var7[var9]));
            this.field1495[var7[var9]] = new class78(var10);
        }
    }

    @ObfuscatedName("cq.z(D)V")
    public void method1914(double arg0) {
        this.field1499 = arg0;
        this.method1920();
    }

    @ObfuscatedName("cq.e(IB)[I")
    public int[] method1902(int arg0) {
        class78 var2 = this.field1495[arg0];
        if (var2 != null) {
            if (var2.field1300 != null) {
                this.field1498.method3388(var2);
                var2.field1312 = true;
                return var2.field1300;
            }
            boolean var3 = var2.method1644(this.field1499, this.field1497, this.field1494);
            if (var3) {
                if (this.field1500 == 0) {
                    class78 var4 = (class78) this.field1498.method3377();
                    var4.method1646();
                } else {
                    this.field1500--;
                }
                this.field1498.method3388(var2);
                var2.field1312 = true;
                return var2.field1300;
            }
        }
        return null;
    }

    @ObfuscatedName("cq.a(II)I")
    public int method1888(int arg0) {
        return this.field1495[arg0] == null ? 0 : this.field1495[arg0].field1303;
    }

    @ObfuscatedName("cq.l(IB)Z")
    public boolean method1889(int arg0) {
        return this.field1495[arg0].field1304;
    }

    @ObfuscatedName("cq.c(IB)Z")
    public boolean method1890(int arg0) {
        return this.field1497 == 64;
    }

    @ObfuscatedName("cq.y(I)V")
    public void method1920() {
        for (int var1 = 0; var1 < this.field1495.length; var1++) {
            if (this.field1495[var1] != null) {
                this.field1495[var1].method1646();
            }
        }
        this.field1498 = new class189();
        this.field1500 = this.field1492;
    }

    @ObfuscatedName("cq.q(IB)V")
    public void method1915(int arg0) {
        for (int var2 = 0; var2 < this.field1495.length; var2++) {
            class78 var3 = this.field1495[var2];
            if (var3 != null && var3.field1309 != 0 && var3.field1312) {
                var3.method1647(arg0);
                var3.field1312 = false;
            }
        }
    }
}
