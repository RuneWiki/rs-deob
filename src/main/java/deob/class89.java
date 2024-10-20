package deob;

@ObfuscatedName("ct")
public class class89 implements class86 {

    @ObfuscatedName("ct.v")
    public class77[] field1523;

    @ObfuscatedName("ct.t")
    public class182 field1513 = new class182();

    @ObfuscatedName("ct.f")
    public int field1518;

    @ObfuscatedName("ct.j")
    public int field1515 = 0;

    @ObfuscatedName("ct.l")
    public double field1516 = 1.0D;

    @ObfuscatedName("ct.g")
    public int field1517 = 128;

    @ObfuscatedName("ct.k")
    public class151 field1521;

    public class89(class151 arg0, class151 arg1, int arg2, double arg3, int arg4) {
        this.field1521 = arg1;
        this.field1518 = arg2;
        this.field1515 = this.field1518;
        this.field1516 = arg3;
        this.field1517 = arg4;
        int[] var7 = arg0.method2793(0);
        int var8 = var7.length;
        this.field1523 = new class77[arg0.method2794(0)];
        for (int var9 = 0; var9 < var8; var9++) {
            class110 var10 = new class110(arg0.method2852(0, var7[var9]));
            this.field1523[var7[var9]] = new class77(var10);
        }
    }

    @ObfuscatedName("ct.q(D)V")
    public void method1882(double arg0) {
        this.field1516 = arg0;
        this.method1884();
    }

    @ObfuscatedName("ct.v(II)[I")
    public int[] method1865(int arg0) {
        class77 var2 = this.field1523[arg0];
        if (var2 != null) {
            if (var2.field1338 != null) {
                this.field1513.method3300(var2);
                var2.field1326 = true;
                return var2.field1338;
            }
            boolean var3 = var2.method1594(this.field1516, this.field1517, this.field1521);
            if (var3) {
                if (this.field1515 == 0) {
                    class77 var4 = (class77) this.field1513.method3320();
                    var4.method1595();
                } else {
                    this.field1515--;
                }
                this.field1513.method3300(var2);
                var2.field1326 = true;
                return var2.field1338;
            }
        }
        return null;
    }

    @ObfuscatedName("ct.t(II)I")
    public int method1871(int arg0) {
        return this.field1523[arg0] == null ? 0 : this.field1523[arg0].field1330;
    }

    @ObfuscatedName("ct.f(II)Z")
    public boolean method1872(int arg0) {
        return this.field1523[arg0].field1328;
    }

    @ObfuscatedName("ct.j(II)Z")
    public boolean method1867(int arg0) {
        return this.field1517 == 64;
    }

    @ObfuscatedName("ct.e(I)V")
    public void method1884() {
        for (int var1 = 0; var1 < this.field1523.length; var1++) {
            if (this.field1523[var1] != null) {
                this.field1523[var1].method1595();
            }
        }
        this.field1513 = new class182();
        this.field1515 = this.field1518;
    }

    @ObfuscatedName("ct.d(IB)V")
    public void method1885(int arg0) {
        for (int var2 = 0; var2 < this.field1523.length; var2++) {
            class77 var3 = this.field1523[var2];
            if (var3 != null && var3.field1336 != 0 && var3.field1326) {
                var3.method1600(arg0);
                var3.field1326 = false;
            }
        }
    }
}
