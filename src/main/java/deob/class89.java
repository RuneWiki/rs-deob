package deob;

@ObfuscatedName("ch")
public class class89 implements class86 {

    @ObfuscatedName("ch.a")
    public class77[] field1518;

    @ObfuscatedName("ch.v")
    public class182 field1509 = new class182();

    @ObfuscatedName("ch.i")
    public int field1511;

    @ObfuscatedName("ch.b")
    public int field1512 = 0;

    @ObfuscatedName("ch.l")
    public double field1513 = 1.0D;

    @ObfuscatedName("ch.m")
    public int field1514 = 128;

    @ObfuscatedName("ch.w")
    public class151 field1515;

    public class89(class151 arg0, class151 arg1, int arg2, double arg3, int arg4) {
        this.field1515 = arg1;
        this.field1511 = arg2;
        this.field1512 = this.field1511;
        this.field1513 = arg3;
        this.field1514 = arg4;
        int[] var7 = arg0.method2739(0);
        int var8 = var7.length;
        this.field1518 = new class77[arg0.method2806(0)];
        for (int var9 = 0; var9 < var8; var9++) {
            class110 var10 = new class110(arg0.method2731(0, var7[var9]));
            this.field1518[var7[var9]] = new class77(var10);
        }
    }

    @ObfuscatedName("ch.x(D)V")
    public void method1855(double arg0) {
        this.field1513 = arg0;
        this.method1857();
    }

    @ObfuscatedName("ch.a(IB)[I")
    public int[] method1834(int arg0) {
        class77 var2 = this.field1518[arg0];
        if (var2 != null) {
            if (var2.field1338 != null) {
                this.field1509.method3257(var2);
                var2.field1334 = true;
                return var2.field1338;
            }
            boolean var3 = var2.method1579(this.field1513, this.field1514, this.field1515);
            if (var3) {
                if (this.field1512 == 0) {
                    class77 var4 = (class77) this.field1509.method3250();
                    var4.method1578();
                } else {
                    this.field1512--;
                }
                this.field1509.method3257(var2);
                var2.field1334 = true;
                return var2.field1338;
            }
        }
        return null;
    }

    @ObfuscatedName("ch.v(IB)I")
    public int method1841(int arg0) {
        return this.field1518[arg0] == null ? 0 : this.field1518[arg0].field1347;
    }

    @ObfuscatedName("ch.i(II)Z")
    public boolean method1836(int arg0) {
        return this.field1518[arg0].field1339;
    }

    @ObfuscatedName("ch.b(II)Z")
    public boolean method1837(int arg0) {
        return this.field1514 == 64;
    }

    @ObfuscatedName("ch.o(B)V")
    public void method1857() {
        for (int var1 = 0; var1 < this.field1518.length; var1++) {
            if (this.field1518[var1] != null) {
                this.field1518[var1].method1578();
            }
        }
        this.field1509 = new class182();
        this.field1512 = this.field1511;
    }

    @ObfuscatedName("ch.q(IB)V")
    public void method1856(int arg0) {
        for (int var2 = 0; var2 < this.field1518.length; var2++) {
            class77 var3 = this.field1518[var2];
            if (var3 != null && var3.field1344 != 0 && var3.field1334) {
                var3.method1577(arg0);
                var3.field1334 = false;
            }
        }
    }
}
