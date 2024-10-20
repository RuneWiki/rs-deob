package deob;

@ObfuscatedName("ce")
public class class89 implements class86 {

    @ObfuscatedName("ce.e")
    public class77[] field1531;

    @ObfuscatedName("ce.v")
    public class180 field1528 = new class180();

    @ObfuscatedName("ce.k")
    public int field1535;

    @ObfuscatedName("ce.g")
    public int field1530 = 0;

    @ObfuscatedName("ce.q")
    public double field1527 = 1.0D;

    @ObfuscatedName("ce.l")
    public int field1532 = 128;

    @ObfuscatedName("ce.a")
    public class149 field1533;

    public class89(class149 arg0, class149 arg1, int arg2, double arg3, int arg4) {
        this.field1533 = arg1;
        this.field1535 = arg2;
        this.field1530 = this.field1535;
        this.field1527 = arg3;
        this.field1532 = arg4;
        int[] var7 = arg0.method2733(0);
        int var8 = var7.length;
        this.field1531 = new class77[arg0.method2730(0)];
        for (int var9 = 0; var9 < var8; var9++) {
            class108 var10 = new class108(arg0.method2721(0, var7[var9]));
            this.field1531[var7[var9]] = new class77(var10);
        }
    }

    @ObfuscatedName("ce.s(D)V")
    public void method1873(double arg0) {
        this.field1527 = arg0;
        this.method1875();
    }

    @ObfuscatedName("ce.e(IB)[I")
    public int[] method1864(int arg0) {
        class77 var2 = this.field1531[arg0];
        if (var2 != null) {
            if (var2.field1358 != null) {
                this.field1528.method3225(var2);
                var2.field1352 = true;
                return var2.field1358;
            }
            boolean var3 = var2.method1577(this.field1527, this.field1532, this.field1533);
            if (var3) {
                if (this.field1530 == 0) {
                    class77 var4 = (class77) this.field1528.method3228();
                    var4.method1584();
                } else {
                    this.field1530--;
                }
                this.field1528.method3225(var2);
                var2.field1352 = true;
                return var2.field1358;
            }
        }
        return null;
    }

    @ObfuscatedName("ce.v(IB)I")
    public int method1856(int arg0) {
        return this.field1531[arg0] == null ? 0 : this.field1531[arg0].field1350;
    }

    @ObfuscatedName("ce.k(II)Z")
    public boolean method1855(int arg0) {
        return this.field1531[arg0].field1351;
    }

    @ObfuscatedName("ce.g(II)Z")
    public boolean method1866(int arg0) {
        return this.field1532 == 64;
    }

    @ObfuscatedName("ce.f(I)V")
    public void method1875() {
        for (int var1 = 0; var1 < this.field1531.length; var1++) {
            if (this.field1531[var1] != null) {
                this.field1531[var1].method1584();
            }
        }
        this.field1528 = new class180();
        this.field1530 = this.field1535;
    }

    @ObfuscatedName("ce.c(II)V")
    public void method1874(int arg0) {
        for (int var2 = 0; var2 < this.field1531.length; var2++) {
            class77 var3 = this.field1531[var2];
            if (var3 != null && var3.field1356 != 0 && var3.field1352) {
                var3.method1578(arg0);
                var3.field1352 = false;
            }
        }
    }
}
