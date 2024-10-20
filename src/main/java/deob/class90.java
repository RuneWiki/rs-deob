package deob;

@ObfuscatedName("cl")
public class class90 implements class87 {

    @ObfuscatedName("cl.b")
    public class78[] field1558;

    @ObfuscatedName("cl.e")
    public class190 field1548 = new class190();

    @ObfuscatedName("cl.a")
    public int field1550;

    @ObfuscatedName("cl.k")
    public int field1547 = 0;

    @ObfuscatedName("cl.p")
    public double field1551 = 1.0D;

    @ObfuscatedName("cl.l")
    public int field1552 = 128;

    @ObfuscatedName("cl.u")
    public class158 field1553;

    public class90(class158 arg0, class158 arg1, int arg2, double arg3, int arg4) {
        this.field1553 = arg1;
        this.field1550 = arg2;
        this.field1547 = this.field1550;
        this.field1551 = arg3;
        this.field1552 = arg4;
        int[] var7 = arg0.method2827(0);
        int var8 = var7.length;
        this.field1558 = new class78[arg0.method2828(0)];
        for (int var9 = 0; var9 < var8; var9++) {
            class111 var10 = new class111(arg0.method2819(0, var7[var9]));
            this.field1558[var7[var9]] = new class78(var10);
        }
    }

    @ObfuscatedName("cl.c(D)V")
    public void method1868(double arg0) {
        this.field1551 = arg0;
        this.method1864();
    }

    @ObfuscatedName("cl.b(II)[I")
    public int[] method1855(int arg0) {
        class78 var2 = this.field1558[arg0];
        if (var2 != null) {
            if (var2.field1371 != null) {
                this.field1548.method3320(var2);
                var2.field1372 = true;
                return var2.field1371;
            }
            boolean var3 = var2.method1572(this.field1551, this.field1552, this.field1553);
            if (var3) {
                if (this.field1547 == 0) {
                    class78 var4 = (class78) this.field1548.method3323();
                    var4.method1579();
                } else {
                    this.field1547--;
                }
                this.field1548.method3320(var2);
                var2.field1372 = true;
                return var2.field1371;
            }
        }
        return null;
    }

    @ObfuscatedName("cl.e(IB)I")
    public int method1842(int arg0) {
        return this.field1558[arg0] == null ? 0 : this.field1558[arg0].field1365;
    }

    @ObfuscatedName("cl.a(II)Z")
    public boolean method1843(int arg0) {
        return this.field1558[arg0].field1359;
    }

    @ObfuscatedName("cl.k(IB)Z")
    public boolean method1847(int arg0) {
        return this.field1552 == 64;
    }

    @ObfuscatedName("cl.t(I)V")
    public void method1864() {
        for (int var1 = 0; var1 < this.field1558.length; var1++) {
            if (this.field1558[var1] != null) {
                this.field1558[var1].method1579();
            }
        }
        this.field1548 = new class190();
        this.field1547 = this.field1550;
    }

    @ObfuscatedName("cl.h(II)V")
    public void method1866(int arg0) {
        for (int var2 = 0; var2 < this.field1558.length; var2++) {
            class78 var3 = this.field1558[var2];
            if (var3 != null && var3.field1369 != 0 && var3.field1372) {
                var3.method1573(arg0);
                var3.field1372 = false;
            }
        }
    }
}
