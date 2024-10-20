package deob;

@ObfuscatedName("cv")
public class class89 implements class86 {

    @ObfuscatedName("cv.g")
    public class77[] field1512;

    @ObfuscatedName("cv.j")
    public class180 field1503 = new class180();

    @ObfuscatedName("cv.z")
    public int field1511;

    @ObfuscatedName("cv.b")
    public int field1504 = 0;

    @ObfuscatedName("cv.k")
    public double field1506 = 1.0D;

    @ObfuscatedName("cv.c")
    public int field1507 = 128;

    @ObfuscatedName("cv.w")
    public class149 field1502;

    public class89(class149 arg0, class149 arg1, int arg2, double arg3, int arg4) {
        this.field1502 = arg1;
        this.field1511 = arg2;
        this.field1504 = this.field1511;
        this.field1506 = arg3;
        this.field1507 = arg4;
        int[] var7 = arg0.method2675(0);
        int var8 = var7.length;
        this.field1512 = new class77[arg0.method2688(0)];
        for (int var9 = 0; var9 < var8; var9++) {
            class108 var10 = new class108(arg0.method2660(0, var7[var9]));
            this.field1512[var7[var9]] = new class77(var10);
        }
    }

    @ObfuscatedName("cv.p(D)V")
    public void method1835(double arg0) {
        this.field1506 = arg0;
        this.method1834();
    }

    @ObfuscatedName("cv.g(IB)[I")
    public int[] method1816(int arg0) {
        class77 var2 = this.field1512[arg0];
        if (var2 != null) {
            if (var2.field1337 != null) {
                this.field1503.method3170(var2);
                var2.field1339 = true;
                return var2.field1337;
            }
            boolean var3 = var2.method1542(this.field1506, this.field1507, this.field1502);
            if (var3) {
                if (this.field1504 == 0) {
                    class77 var4 = (class77) this.field1503.method3173();
                    var4.method1543();
                } else {
                    this.field1504--;
                }
                this.field1503.method3170(var2);
                var2.field1339 = true;
                return var2.field1337;
            }
        }
        return null;
    }

    @ObfuscatedName("cv.j(IS)I")
    public int method1823(int arg0) {
        return this.field1512[arg0] == null ? 0 : this.field1512[arg0].field1334;
    }

    @ObfuscatedName("cv.z(II)Z")
    public boolean method1817(int arg0) {
        return this.field1512[arg0].field1335;
    }

    @ObfuscatedName("cv.b(IB)Z")
    public boolean method1825(int arg0) {
        return this.field1507 == 64;
    }

    @ObfuscatedName("cv.i(B)V")
    public void method1834() {
        for (int var1 = 0; var1 < this.field1512.length; var1++) {
            if (this.field1512[var1] != null) {
                this.field1512[var1].method1543();
            }
        }
        this.field1503 = new class180();
        this.field1504 = this.field1511;
    }

    @ObfuscatedName("cv.s(IB)V")
    public void method1833(int arg0) {
        for (int var2 = 0; var2 < this.field1512.length; var2++) {
            class77 var3 = this.field1512[var2];
            if (var3 != null && var3.field1343 != 0 && var3.field1339) {
                var3.method1544(arg0);
                var3.field1339 = false;
            }
        }
    }
}
