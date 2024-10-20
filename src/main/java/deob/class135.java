package deob;

@ObfuscatedName("da")
public class class135 implements class45 {

    @ObfuscatedName("da.b")
    public int field2027;

    @ObfuscatedName("da.c")
    public class71 field2030 = new class71();

    @ObfuscatedName("da.m")
    public double field2025 = 1.0D;

    @ObfuscatedName("da.i")
    public int field2028 = 0;

    @ObfuscatedName("da.v")
    public class158[] field2026;

    @ObfuscatedName("da.z")
    public int field2029 = 128;

    @ObfuscatedName("da.x")
    public class87 field2031;

    @ObfuscatedName("da.y(D)V")
    public void method2280(double arg0) {
        this.field2025 = arg0;
        this.method2282();
    }

    @ObfuscatedName("da.v(II)[I")
    public int[] method850(int arg0) {
        class158 var2 = this.field2026[arg0];
        if (var2 != null) {
            if (var2.field2381 != null) {
                this.field2030.method1107(var2);
                var2.field2382 = true;
                return var2.field2381;
            }
            boolean var3 = var2.method2813(this.field2025, this.field2029, this.field2031);
            if (var3) {
                if (this.field2028 == 0) {
                    class158 var4 = (class158) this.field2030.method1137();
                    var4.method2814();
                } else {
                    this.field2028--;
                }
                this.field2030.method1107(var2);
                var2.field2382 = true;
                return var2.field2381;
            }
        }
        return null;
    }

    @ObfuscatedName("da.c(II)I")
    public int method845(int arg0) {
        return this.field2026[arg0] == null ? 0 : this.field2026[arg0].field2373;
    }

    @ObfuscatedName("da.b(II)Z")
    public boolean method847(int arg0) {
        return this.field2026[arg0].field2374;
    }

    @ObfuscatedName("da.a(S)V")
    public void method2282() {
        for (int var1 = 0; var1 < this.field2026.length; var1++) {
            if (this.field2026[var1] != null) {
                this.field2026[var1].method2814();
            }
        }
        this.field2030 = new class71();
        this.field2028 = this.field2027;
    }

    @ObfuscatedName("da.u(II)V")
    public void method2283(int arg0) {
        for (int var2 = 0; var2 < this.field2026.length; var2++) {
            class158 var3 = this.field2026[var2];
            if (var3 != null && var3.field2372 != 0 && var3.field2382) {
                var3.method2815(arg0);
                var3.field2382 = false;
            }
        }
    }

    @ObfuscatedName("da.i(II)Z")
    public boolean method844(int arg0) {
        return this.field2029 == 64;
    }

    public class135(class87 arg0, class87 arg1, int arg2, double arg3, int arg4) {
        this.field2031 = arg1;
        this.field2027 = arg2;
        this.field2028 = this.field2027;
        this.field2025 = arg3;
        this.field2029 = arg4;
        int[] var7 = arg0.method1335(0);
        int var8 = var7.length;
        this.field2026 = new class158[arg0.method1352(0)];
        for (int var9 = 0; var9 < var8; var9++) {
            class28 var10 = new class28(arg0.method1298(0, var7[var9]));
            this.field2026[var7[var9]] = new class158(var10);
        }
    }
}
