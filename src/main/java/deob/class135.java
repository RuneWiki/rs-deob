package deob;

@ObfuscatedName("da")
public class class135 implements class41 {

    @ObfuscatedName("da.d")
    public int field2098 = 128;

    @ObfuscatedName("da.b")
    public class158[] field2097;

    @ObfuscatedName("da.l")
    public class89 field2099;

    @ObfuscatedName("da.k")
    public int field2095;

    @ObfuscatedName("da.h")
    public class15 field2093 = new class15();

    @ObfuscatedName("da.w")
    public int field2096 = 0;

    @ObfuscatedName("da.t")
    public double field2094 = 1.0D;

    @ObfuscatedName("da.i(I)V")
    public void method2330() {
        for (int var1 = 0; var1 < this.field2097.length; var1++) {
            if (this.field2097[var1] != null) {
                this.field2097[var1].method2745();
            }
        }
        this.field2093 = new class15();
        this.field2096 = this.field2095;
    }

    @ObfuscatedName("da.h(II)I")
    public int method557(int arg0) {
        return this.field2097[arg0] == null ? 0 : this.field2097[arg0].field2400;
    }

    @ObfuscatedName("da.k(IB)Z")
    public boolean method556(int arg0) {
        return this.field2097[arg0].field2402;
    }

    @ObfuscatedName("da.r(II)V")
    public void method2334(int arg0) {
        for (int var2 = 0; var2 < this.field2097.length; var2++) {
            class158 var3 = this.field2097[var2];
            if (var3 != null && var3.field2407 != 0 && var3.field2410) {
                var3.method2746(arg0);
                var3.field2410 = false;
            }
        }
    }

    public class135(class89 arg0, class89 arg1, int arg2, double arg3, int arg4) {
        this.field2099 = arg1;
        this.field2095 = arg2;
        this.field2096 = this.field2095;
        this.field2094 = arg3;
        this.field2098 = arg4;
        int[] var7 = arg0.method1275(0);
        int var8 = var7.length;
        this.field2097 = new class158[arg0.method1276(0)];
        for (int var9 = 0; var9 < var8; var9++) {
            class50 var10 = new class50(arg0.method1266(0, var7[var9]));
            this.field2097[var7[var9]] = new class158(var10);
        }
    }

    @ObfuscatedName("da.b(II)[I")
    public int[] method570(int arg0) {
        class158 var2 = this.field2097[arg0];
        if (var2 != null) {
            if (var2.field2406 != null) {
                this.field2093.method204(var2);
                var2.field2410 = true;
                return var2.field2406;
            }
            boolean var3 = var2.method2744(this.field2094, this.field2098, this.field2099);
            if (var3) {
                if (this.field2096 == 0) {
                    class158 var4 = (class158) this.field2093.method198();
                    var4.method2745();
                } else {
                    this.field2096--;
                }
                this.field2093.method204(var2);
                var2.field2410 = true;
                return var2.field2406;
            }
        }
        return null;
    }

    @ObfuscatedName("da.z(D)V")
    public void method2343(double arg0) {
        this.field2094 = arg0;
        this.method2330();
    }

    @ObfuscatedName("da.w(II)Z")
    public boolean method560(int arg0) {
        return this.field2098 == 64;
    }
}
