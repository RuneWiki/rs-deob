package deob;

@ObfuscatedName("cl")
public class class89 implements class86 {

    @ObfuscatedName("cl.x")
    public class77[] field1525;

    @ObfuscatedName("cl.v")
    public class180 field1515 = new class180();

    @ObfuscatedName("cl.m")
    public int field1517;

    @ObfuscatedName("cl.e")
    public int field1518 = 0;

    @ObfuscatedName("cl.h")
    public double field1522 = 1.0D;

    @ObfuscatedName("cl.p")
    public int field1519 = 128;

    @ObfuscatedName("cl.j")
    public class149 field1521;

    public class89(class149 arg0, class149 arg1, int arg2, double arg3, int arg4) {
        this.field1521 = arg1;
        this.field1517 = arg2;
        this.field1518 = this.field1517;
        this.field1522 = arg3;
        this.field1519 = arg4;
        int[] var7 = arg0.method2740(0);
        int var8 = var7.length;
        this.field1525 = new class77[arg0.method2741(0)];
        for (int var9 = 0; var9 < var8; var9++) {
            class108 var10 = new class108(arg0.method2751(0, var7[var9]));
            this.field1525[var7[var9]] = new class77(var10);
        }
    }

    @ObfuscatedName("cl.b(D)V")
    public void method1869(double arg0) {
        this.field1522 = arg0;
        this.method1873();
    }

    @ObfuscatedName("cl.x(IB)[I")
    public int[] method1864(int arg0) {
        class77 var2 = this.field1525[arg0];
        if (var2 != null) {
            if (var2.field1339 != null) {
                this.field1515.method3247(var2);
                var2.field1343 = true;
                return var2.field1339;
            }
            boolean var3 = var2.method1608(this.field1522, this.field1519, this.field1521);
            if (var3) {
                if (this.field1518 == 0) {
                    class77 var4 = (class77) this.field1515.method3258();
                    var4.method1609();
                } else {
                    this.field1518--;
                }
                this.field1515.method3247(var2);
                var2.field1343 = true;
                return var2.field1339;
            }
        }
        return null;
    }

    @ObfuscatedName("cl.v(II)I")
    public int method1857(int arg0) {
        return this.field1525[arg0] == null ? 0 : this.field1525[arg0].field1333;
    }

    @ObfuscatedName("cl.m(II)Z")
    public boolean method1867(int arg0) {
        return this.field1525[arg0].field1335;
    }

    @ObfuscatedName("cl.e(IB)Z")
    public boolean method1858(int arg0) {
        return this.field1519 == 64;
    }

    @ObfuscatedName("cl.w(I)V")
    public void method1873() {
        for (int var1 = 0; var1 < this.field1525.length; var1++) {
            if (this.field1525[var1] != null) {
                this.field1525[var1].method1609();
            }
        }
        this.field1515 = new class180();
        this.field1518 = this.field1517;
    }

    @ObfuscatedName("cl.g(II)V")
    public void method1871(int arg0) {
        for (int var2 = 0; var2 < this.field1525.length; var2++) {
            class77 var3 = this.field1525[var2];
            if (var3 != null && var3.field1341 != 0 && var3.field1343) {
                var3.method1611(arg0);
                var3.field1343 = false;
            }
        }
    }
}
