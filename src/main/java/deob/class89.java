package deob;

@ObfuscatedName("cd")
public class class89 implements class86 {

    @ObfuscatedName("cd.b")
    public class77[] field1522;

    @ObfuscatedName("cd.e")
    public class182 field1517 = new class182();

    @ObfuscatedName("cd.i")
    public int field1513;

    @ObfuscatedName("cd.k")
    public int field1515 = 0;

    @ObfuscatedName("cd.h")
    public double field1514 = 1.0D;

    @ObfuscatedName("cd.p")
    public int field1516 = 128;

    @ObfuscatedName("cd.n")
    public class151 field1518;

    public class89(class151 arg0, class151 arg1, int arg2, double arg3, int arg4) {
        this.field1518 = arg1;
        this.field1513 = arg2;
        this.field1515 = this.field1513;
        this.field1514 = arg3;
        this.field1516 = arg4;
        int[] var7 = arg0.method2771(0);
        int var8 = var7.length;
        this.field1522 = new class77[arg0.method2772(0)];
        for (int var9 = 0; var9 < var8; var9++) {
            class110 var10 = new class110(arg0.method2761(0, var7[var9]));
            this.field1522[var7[var9]] = new class77(var10);
        }
    }

    @ObfuscatedName("cd.w(D)V")
    public void method1854(double arg0) {
        this.field1514 = arg0;
        this.method1853();
    }

    @ObfuscatedName("cd.b(II)[I")
    public int[] method1835(int arg0) {
        class77 var2 = this.field1522[arg0];
        if (var2 != null) {
            if (var2.field1336 != null) {
                this.field1517.method3289(var2);
                var2.field1331 = true;
                return var2.field1336;
            }
            boolean var3 = var2.method1587(this.field1514, this.field1516, this.field1518);
            if (var3) {
                if (this.field1515 == 0) {
                    class77 var4 = (class77) this.field1517.method3314();
                    var4.method1585();
                } else {
                    this.field1515--;
                }
                this.field1517.method3289(var2);
                var2.field1331 = true;
                return var2.field1336;
            }
        }
        return null;
    }

    @ObfuscatedName("cd.e(IS)I")
    public int method1836(int arg0) {
        return this.field1522[arg0] == null ? 0 : this.field1522[arg0].field1335;
    }

    @ObfuscatedName("cd.i(IB)Z")
    public boolean method1846(int arg0) {
        return this.field1522[arg0].field1344;
    }

    @ObfuscatedName("cd.k(II)Z")
    public boolean method1838(int arg0) {
        return this.field1516 == 64;
    }

    @ObfuscatedName("cd.x(B)V")
    public void method1853() {
        for (int var1 = 0; var1 < this.field1522.length; var1++) {
            if (this.field1522[var1] != null) {
                this.field1522[var1].method1585();
            }
        }
        this.field1517 = new class182();
        this.field1515 = this.field1513;
    }

    @ObfuscatedName("cd.v(II)V")
    public void method1852(int arg0) {
        for (int var2 = 0; var2 < this.field1522.length; var2++) {
            class77 var3 = this.field1522[var2];
            if (var3 != null && var3.field1341 != 0 && var3.field1331) {
                var3.method1588(arg0);
                var3.field1331 = false;
            }
        }
    }
}
