package deob;

@ObfuscatedName("ch")
public class class85 implements class82 {

    @ObfuscatedName("ch.m")
    public class73[] field1478;

    @ObfuscatedName("ch.k")
    public class171 field1488 = new class171();

    @ObfuscatedName("ch.y")
    public int field1484;

    @ObfuscatedName("ch.g")
    public int field1477 = 0;

    @ObfuscatedName("ch.r")
    public double field1480 = 1.0D;

    @ObfuscatedName("ch.i")
    public int field1481 = 128;

    @ObfuscatedName("ch.f")
    public class142 field1482;

    public class85(class142 arg0, class142 arg1, int arg2, double arg3, int arg4) {
        this.field1482 = arg1;
        this.field1484 = arg2;
        this.field1477 = this.field1484;
        this.field1480 = arg3;
        this.field1481 = arg4;
        int[] var7 = arg0.method2704(0);
        int var8 = var7.length;
        this.field1478 = new class73[arg0.method2705(0)];
        for (int var9 = 0; var9 < var8; var9++) {
            class104 var10 = new class104(arg0.method2725(0, var7[var9]));
            this.field1478[var7[var9]] = new class73(var10);
        }
    }

    @ObfuscatedName("ch.v(D)V")
    public void method1857(double arg0) {
        this.field1480 = arg0;
        this.method1854();
    }

    @ObfuscatedName("ch.m(II)[I")
    public int[] method1848(int arg0) {
        class73 var2 = this.field1478[arg0];
        if (var2 != null) {
            if (var2.field1304 != null) {
                this.field1488.method3176(var2);
                var2.field1298 = true;
                return var2.field1304;
            }
            boolean var3 = var2.method1567(this.field1480, this.field1481, this.field1482);
            if (var3) {
                if (this.field1477 == 0) {
                    class73 var4 = (class73) this.field1488.method3177();
                    var4.method1569();
                } else {
                    this.field1477--;
                }
                this.field1488.method3176(var2);
                var2.field1298 = true;
                return var2.field1304;
            }
        }
        return null;
    }

    @ObfuscatedName("ch.k(II)I")
    public int method1835(int arg0) {
        return this.field1478[arg0] == null ? 0 : this.field1478[arg0].field1303;
    }

    @ObfuscatedName("ch.y(II)Z")
    public boolean method1836(int arg0) {
        return this.field1478[arg0].field1297;
    }

    @ObfuscatedName("ch.g(II)Z")
    public boolean method1842(int arg0) {
        return this.field1481 == 64;
    }

    @ObfuscatedName("ch.n(I)V")
    public void method1854() {
        for (int var1 = 0; var1 < this.field1478.length; var1++) {
            if (this.field1478[var1] != null) {
                this.field1478[var1].method1569();
            }
        }
        this.field1488 = new class171();
        this.field1477 = this.field1484;
    }

    @ObfuscatedName("ch.l(IB)V")
    public void method1861(int arg0) {
        for (int var2 = 0; var2 < this.field1478.length; var2++) {
            class73 var3 = this.field1478[var2];
            if (var3 != null && var3.field1302 != 0 && var3.field1298) {
                var3.method1566(arg0);
                var3.field1298 = false;
            }
        }
    }
}
