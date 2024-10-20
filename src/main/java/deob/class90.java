package deob;

@ObfuscatedName("cw")
public class class90 implements class87 {

    @ObfuscatedName("cw.n")
    public class78[] field1554;

    @ObfuscatedName("cw.o")
    public class190 field1551 = new class190();

    @ObfuscatedName("cw.a")
    public int field1549;

    @ObfuscatedName("cw.w")
    public int field1548 = 0;

    @ObfuscatedName("cw.m")
    public double field1550 = 1.0D;

    @ObfuscatedName("cw.h")
    public int field1552 = 128;

    @ObfuscatedName("cw.i")
    public class158 field1553;

    public class90(class158 arg0, class158 arg1, int arg2, double arg3, int arg4) {
        this.field1553 = arg1;
        this.field1549 = arg2;
        this.field1548 = this.field1549;
        this.field1550 = arg3;
        this.field1552 = arg4;
        int[] var7 = arg0.method2933(0);
        int var8 = var7.length;
        this.field1554 = new class78[arg0.method2945(0)];
        for (int var9 = 0; var9 < var8; var9++) {
            class111 var10 = new class111(arg0.method2925(0, var7[var9]));
            this.field1554[var7[var9]] = new class78(var10);
        }
    }

    @ObfuscatedName("cw.v(D)V")
    public void method1950(double arg0) {
        this.field1550 = arg0;
        this.method1954();
    }

    @ObfuscatedName("cw.n(II)[I")
    public int[] method1936(int arg0) {
        class78 var2 = this.field1554[arg0];
        if (var2 != null) {
            if (var2.field1381 != null) {
                this.field1551.method3442(var2);
                var2.field1382 = true;
                return var2.field1381;
            }
            boolean var3 = var2.method1683(this.field1550, this.field1552, this.field1553);
            if (var3) {
                if (this.field1548 == 0) {
                    class78 var4 = (class78) this.field1551.method3443();
                    var4.method1684();
                } else {
                    this.field1548--;
                }
                this.field1551.method3442(var2);
                var2.field1382 = true;
                return var2.field1381;
            }
        }
        return null;
    }

    @ObfuscatedName("cw.o(II)I")
    public int method1941(int arg0) {
        return this.field1554[arg0] == null ? 0 : this.field1554[arg0].field1373;
    }

    @ObfuscatedName("cw.a(IB)Z")
    public boolean method1935(int arg0) {
        return this.field1554[arg0].field1380;
    }

    @ObfuscatedName("cw.w(IB)Z")
    public boolean method1938(int arg0) {
        return this.field1552 == 64;
    }

    @ObfuscatedName("cw.x(B)V")
    public void method1954() {
        for (int var1 = 0; var1 < this.field1554.length; var1++) {
            if (this.field1554[var1] != null) {
                this.field1554[var1].method1684();
            }
        }
        this.field1551 = new class190();
        this.field1548 = this.field1549;
    }

    @ObfuscatedName("cw.q(II)V")
    public void method1953(int arg0) {
        for (int var2 = 0; var2 < this.field1554.length; var2++) {
            class78 var3 = this.field1554[var2];
            if (var3 != null && var3.field1379 != 0 && var3.field1382) {
                var3.method1688(arg0);
                var3.field1382 = false;
            }
        }
    }
}
