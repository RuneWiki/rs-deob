package deob;

@ObfuscatedName("fn")
public class class181 implements class189 {

    @ObfuscatedName("fn.f")
    public class171[] field2039;

    @ObfuscatedName("fn.o")
    public class272 field2031 = new class272();

    @ObfuscatedName("fn.u")
    public int field2033;

    @ObfuscatedName("fn.p")
    public int field2032 = 0;

    @ObfuscatedName("fn.b")
    public double field2035 = 1.0D;

    @ObfuscatedName("fn.e")
    public int field2036 = 128;

    @ObfuscatedName("fn.k")
    public class253 field2037;

    public class181(class253 arg0, class253 arg1, int arg2, double arg3, int arg4) {
        this.field2037 = arg1;
        this.field2033 = arg2;
        this.field2032 = this.field2033;
        this.field2035 = arg3;
        this.field2036 = arg4;
        int[] var7 = arg0.method3943(0);
        int var8 = var7.length;
        this.field2039 = new class171[arg0.method3944(0)];
        for (int var9 = 0; var9 < var8; var9++) {
            class382 var10 = new class382(arg0.method3933(0, var7[var9]));
            this.field2039[var7[var9]] = new class171(var10);
        }
    }

    @ObfuscatedName("fn.f(B)I")
    public int method3202() {
        int var1 = 0;
        int var2 = 0;
        class171[] var3 = this.field2039;
        for (int var4 = 0; var4 < var3.length; var4++) {
            class171 var5 = var3[var4];
            if (var5 != null && var5.field1855 != null) {
                var1 += var5.field1855.length;
                int[] var6 = var5.field1855;
                for (int var7 = 0; var7 < var6.length; var7++) {
                    int var8 = var6[var7];
                    if (this.field2037.method3936(var8)) {
                        var2++;
                    }
                }
            }
        }
        if (var1 == 0) {
            return 0;
        } else {
            return var2 * 100 / var1;
        }
    }

    @ObfuscatedName("fn.o(D)V")
    public void method3203(double arg0) {
        this.field2035 = arg0;
        this.method3208();
    }

    @ObfuscatedName("fn.u(II)[I")
    public int[] method3223(int arg0) {
        class171 var2 = this.field2039[arg0];
        if (var2 != null) {
            if (var2.field1857 != null) {
                this.field2031.method4156(var2);
                var2.field1858 = true;
                return var2.field1857;
            }
            boolean var3 = var2.method2910(this.field2035, this.field2036, this.field2037);
            if (var3) {
                if (this.field2032 == 0) {
                    class171 var4 = (class171) this.field2031.method4175();
                    var4.method2911();
                } else {
                    this.field2032--;
                }
                this.field2031.method4156(var2);
                var2.field1858 = true;
                return var2.field1857;
            }
        }
        return null;
    }

    @ObfuscatedName("fn.p(II)I")
    public int method3219(int arg0) {
        return this.field2039[arg0] == null ? 0 : this.field2039[arg0].field1849;
    }

    @ObfuscatedName("fn.b(II)Z")
    public boolean method3206(int arg0) {
        return this.field2039[arg0].field1850;
    }

    @ObfuscatedName("fn.e(II)Z")
    public boolean method3209(int arg0) {
        return this.field2036 == 64;
    }

    @ObfuscatedName("fn.k(B)V")
    public void method3208() {
        for (int var1 = 0; var1 < this.field2039.length; var1++) {
            if (this.field2039[var1] != null) {
                this.field2039[var1].method2911();
            }
        }
        this.field2031 = new class272();
        this.field2032 = this.field2033;
    }

    @ObfuscatedName("fn.g(II)V")
    public void method3232(int arg0) {
        for (int var2 = 0; var2 < this.field2039.length; var2++) {
            class171 var3 = this.field2039[var2];
            if (var3 != null && var3.field1851 != 0 && var3.field1858) {
                var3.method2912(arg0);
                var3.field1858 = false;
            }
        }
    }
}
