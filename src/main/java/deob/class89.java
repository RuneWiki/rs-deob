package deob;

@ObfuscatedName("cz")
public class class89 implements class86 {

    @ObfuscatedName("cz.f")
    public class77[] field1524;

    @ObfuscatedName("cz.k")
    public class180 field1523 = new class180();

    @ObfuscatedName("cz.y")
    public int field1529;

    @ObfuscatedName("cz.e")
    public int field1525 = 0;

    @ObfuscatedName("cz.r")
    public double field1526 = 1.0D;

    @ObfuscatedName("cz.a")
    public int field1527 = 128;

    @ObfuscatedName("cz.n")
    public class149 field1528;

    public class89(class149 arg0, class149 arg1, int arg2, double arg3, int arg4) {
        this.field1528 = arg1;
        this.field1529 = arg2;
        this.field1525 = this.field1529;
        this.field1526 = arg3;
        this.field1527 = arg4;
        int[] var7 = arg0.method2817(0);
        int var8 = var7.length;
        this.field1524 = new class77[arg0.method2773(0)];
        for (int var9 = 0; var9 < var8; var9++) {
            class108 var10 = new class108(arg0.method2763(0, var7[var9]));
            this.field1524[var7[var9]] = new class77(var10);
        }
    }

    @ObfuscatedName("cz.p(D)V")
    public void method1903(double arg0) {
        this.field1526 = arg0;
        this.method1906();
    }

    @ObfuscatedName("cz.f(IB)[I")
    public int[] method1893(int arg0) {
        class77 var2 = this.field1524[arg0];
        if (var2 != null) {
            if (var2.field1342 != null) {
                this.field1523.method3274(var2);
                var2.field1341 = true;
                return var2.field1342;
            }
            boolean var3 = var2.method1632(this.field1526, this.field1527, this.field1528);
            if (var3) {
                if (this.field1525 == 0) {
                    class77 var4 = (class77) this.field1523.method3280();
                    var4.method1634();
                } else {
                    this.field1525--;
                }
                this.field1523.method3274(var2);
                var2.field1341 = true;
                return var2.field1342;
            }
        }
        return null;
    }

    @ObfuscatedName("cz.k(II)I")
    public int method1891(int arg0) {
        return this.field1524[arg0] == null ? 0 : this.field1524[arg0].field1353;
    }

    @ObfuscatedName("cz.y(II)Z")
    public boolean method1892(int arg0) {
        return this.field1524[arg0].field1350;
    }

    @ObfuscatedName("cz.e(II)Z")
    public boolean method1899(int arg0) {
        return this.field1527 == 64;
    }

    @ObfuscatedName("cz.v(I)V")
    public void method1906() {
        for (int var1 = 0; var1 < this.field1524.length; var1++) {
            if (this.field1524[var1] != null) {
                this.field1524[var1].method1634();
            }
        }
        this.field1523 = new class180();
        this.field1525 = this.field1529;
    }

    @ObfuscatedName("cz.w(IB)V")
    public void method1909(int arg0) {
        for (int var2 = 0; var2 < this.field1524.length; var2++) {
            class77 var3 = this.field1524[var2];
            if (var3 != null && var3.field1351 != 0 && var3.field1341) {
                var3.method1633(arg0);
                var3.field1341 = false;
            }
        }
    }
}
