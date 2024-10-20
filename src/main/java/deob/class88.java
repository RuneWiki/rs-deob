package deob;

@ObfuscatedName("ck")
public class class88 implements class85 {

    @ObfuscatedName("ck.b")
    public class76[] field1511;

    @ObfuscatedName("ck.u")
    public class177 field1509 = new class177();

    @ObfuscatedName("ck.x")
    public int field1510;

    @ObfuscatedName("ck.j")
    public int field1515 = 0;

    @ObfuscatedName("ck.o")
    public double field1512 = 1.0D;

    @ObfuscatedName("ck.n")
    public int field1508 = 128;

    @ObfuscatedName("ck.y")
    public class146 field1514;

    public class88(class146 arg0, class146 arg1, int arg2, double arg3, int arg4) {
        this.field1514 = arg1;
        this.field1510 = arg2;
        this.field1515 = this.field1510;
        this.field1512 = arg3;
        this.field1508 = arg4;
        int[] var7 = arg0.method2701(0);
        int var8 = var7.length;
        this.field1511 = new class76[arg0.method2702(0)];
        for (int var9 = 0; var9 < var8; var9++) {
            class107 var10 = new class107(arg0.method2692(0, var7[var9]));
            this.field1511[var7[var9]] = new class76(var10);
        }
    }

    @ObfuscatedName("ck.g(D)V")
    public void method1878(double arg0) {
        this.field1512 = arg0;
        this.method1873();
    }

    @ObfuscatedName("ck.b(IB)[I")
    public int[] method1866(int arg0) {
        class76 var2 = this.field1511[arg0];
        if (var2 != null) {
            if (var2.field1333 != null) {
                this.field1509.method3181(var2);
                var2.field1334 = true;
                return var2.field1333;
            }
            boolean var3 = var2.method1607(this.field1512, this.field1508, this.field1514);
            if (var3) {
                if (this.field1515 == 0) {
                    class76 var4 = (class76) this.field1509.method3184();
                    var4.method1596();
                } else {
                    this.field1515--;
                }
                this.field1509.method3181(var2);
                var2.field1334 = true;
                return var2.field1333;
            }
        }
        return null;
    }

    @ObfuscatedName("ck.u(II)I")
    public int method1854(int arg0) {
        return this.field1511[arg0] == null ? 0 : this.field1511[arg0].field1322;
    }

    @ObfuscatedName("ck.x(IS)Z")
    public boolean method1855(int arg0) {
        return this.field1511[arg0].field1327;
    }

    @ObfuscatedName("ck.j(II)Z")
    public boolean method1853(int arg0) {
        return this.field1508 == 64;
    }

    @ObfuscatedName("ck.c(I)V")
    public void method1873() {
        for (int var1 = 0; var1 < this.field1511.length; var1++) {
            if (this.field1511[var1] != null) {
                this.field1511[var1].method1596();
            }
        }
        this.field1509 = new class177();
        this.field1515 = this.field1510;
    }

    @ObfuscatedName("ck.m(II)V")
    public void method1875(int arg0) {
        for (int var2 = 0; var2 < this.field1511.length; var2++) {
            class76 var3 = this.field1511[var2];
            if (var3 != null && var3.field1328 != 0 && var3.field1334) {
                var3.method1599(arg0);
                var3.field1334 = false;
            }
        }
    }
}
