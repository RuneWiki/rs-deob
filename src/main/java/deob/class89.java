package deob;

@ObfuscatedName("ca")
public class class89 implements class86 {

    @ObfuscatedName("ca.c")
    public class77[] field1508;

    @ObfuscatedName("ca.j")
    public class180 field1509 = new class180();

    @ObfuscatedName("ca.y")
    public int field1502;

    @ObfuscatedName("ca.r")
    public int field1507 = 0;

    @ObfuscatedName("ca.f")
    public double field1500 = 1.0D;

    @ObfuscatedName("ca.l")
    public int field1505 = 128;

    @ObfuscatedName("ca.b")
    public class149 field1506;

    public class89(class149 arg0, class149 arg1, int arg2, double arg3, int arg4) {
        this.field1506 = arg1;
        this.field1502 = arg2;
        this.field1507 = this.field1502;
        this.field1500 = arg3;
        this.field1505 = arg4;
        int[] var7 = arg0.method2755(0);
        int var8 = var7.length;
        this.field1508 = new class77[arg0.method2756(0)];
        for (int var9 = 0; var9 < var8; var9++) {
            class108 var10 = new class108(arg0.method2746(0, var7[var9]));
            this.field1508[var7[var9]] = new class77(var10);
        }
    }

    @ObfuscatedName("ca.h(D)V")
    public void method1891(double arg0) {
        this.field1500 = arg0;
        this.method1883();
    }

    @ObfuscatedName("ca.c(II)[I")
    public int[] method1865(int arg0) {
        class77 var2 = this.field1508[arg0];
        if (var2 != null) {
            if (var2.field1334 != null) {
                this.field1509.method3242(var2);
                var2.field1335 = true;
                return var2.field1334;
            }
            boolean var3 = var2.method1608(this.field1500, this.field1505, this.field1506);
            if (var3) {
                if (this.field1507 == 0) {
                    class77 var4 = (class77) this.field1509.method3259();
                    var4.method1599();
                } else {
                    this.field1507--;
                }
                this.field1509.method3242(var2);
                var2.field1335 = true;
                return var2.field1334;
            }
        }
        return null;
    }

    @ObfuscatedName("ca.j(IB)I")
    public int method1864(int arg0) {
        return this.field1508[arg0] == null ? 0 : this.field1508[arg0].field1326;
    }

    @ObfuscatedName("ca.y(IB)Z")
    public boolean method1866(int arg0) {
        return this.field1508[arg0].field1327;
    }

    @ObfuscatedName("ca.r(II)Z")
    public boolean method1867(int arg0) {
        return this.field1505 == 64;
    }

    @ObfuscatedName("ca.w(B)V")
    public void method1883() {
        for (int var1 = 0; var1 < this.field1508.length; var1++) {
            if (this.field1508[var1] != null) {
                this.field1508[var1].method1599();
            }
        }
        this.field1509 = new class180();
        this.field1507 = this.field1502;
    }

    @ObfuscatedName("ca.s(IB)V")
    public void method1884(int arg0) {
        for (int var2 = 0; var2 < this.field1508.length; var2++) {
            class77 var3 = this.field1508[var2];
            if (var3 != null && var3.field1332 != 0 && var3.field1335) {
                var3.method1600(arg0);
                var3.field1335 = false;
            }
        }
    }
}
