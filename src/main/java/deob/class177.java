package deob;

@ObfuscatedName("fy")
public class class177 extends class62 {

    @ObfuscatedName("fy.n")
    public class175 field2897;

    @ObfuscatedName("fy.g")
    public class190 field2898 = new class190();

    @ObfuscatedName("fy.a")
    public class51 field2899 = new class51();

    public class177(class175 arg0) {
        this.field2897 = arg0;
    }

    @ObfuscatedName("fy.j()Lbh;")
    public class62 method998() {
        class178 var1 = (class178) this.field2898.method3468();
        if (var1 == null) {
            return null;
        } else if (var1.field2921 == null) {
            return this.method999();
        } else {
            return var1.field2921;
        }
    }

    @ObfuscatedName("fy.f()Lbh;")
    public class62 method999() {
        class178 var1;
        do {
            var1 = (class178) this.field2898.method3470();
            if (var1 == null) {
                return null;
            }
        } while (var1.field2921 == null);
        return var1.field2921;
    }

    @ObfuscatedName("fy.b()I")
    public int method1000() {
        return 0;
    }

    @ObfuscatedName("fy.t([III)V")
    public void method1001(int[] arg0, int arg1, int arg2) {
        this.field2899.method1001(arg0, arg1, arg2);
        for (class178 var4 = (class178) this.field2898.method3468(); var4 != null; var4 = (class178) this.field2898.method3470()) {
            if (!this.field2897.method3276(var4)) {
                int var5 = arg1;
                int var6 = arg2;
                do {
                    if (var6 <= var4.field2913) {
                        this.method3367(var4, arg0, var5, var6, var5 + var6);
                        var4.field2913 -= var6;
                        break;
                    }
                    this.method3367(var4, arg0, var5, var4.field2913, var5 + var6);
                    var5 += var4.field2913;
                    var6 -= var4.field2913;
                } while (!this.field2897.method3301(var4, arg0, var5, var6));
            }
        }
    }

    @ObfuscatedName("fy.c(I)V")
    public void method1022(int arg0) {
        this.field2899.method1022(arg0);
        for (class178 var2 = (class178) this.field2898.method3468(); var2 != null; var2 = (class178) this.field2898.method3470()) {
            if (!this.field2897.method3276(var2)) {
                int var3 = arg0;
                do {
                    if (var3 <= var2.field2913) {
                        this.method3366(var2, var3);
                        var2.field2913 -= var3;
                        break;
                    }
                    this.method3366(var2, var2.field2913);
                    var3 -= var2.field2913;
                } while (!this.field2897.method3301(var2, (int[]) null, 0, var3));
            }
        }
    }

    @ObfuscatedName("fy.n(Lfa;[IIIII)V")
    public void method3367(class178 arg0, int[] arg1, int arg2, int arg3, int arg4) {
        if ((this.field2897.field2869[arg0.field2908] & 0x4) != 0 && arg0.field2917 < 0) {
            int var6 = this.field2897.field2877[arg0.field2908] / Statics.field1142;
            while (true) {
                int var7 = (var6 + 1048575 - arg0.field2914) / var6;
                if (var7 > arg3) {
                    arg0.field2914 += arg3 * var6;
                    break;
                }
                arg0.field2921.method1001(arg1, arg2, var7);
                arg2 += var7;
                arg3 -= var7;
                arg0.field2914 += var6 * var7 - 1048576;
                int var8 = Statics.field1142 / 100;
                int var9 = 262144 / var6;
                if (var9 < var8) {
                    var8 = var9;
                }
                class60 var10 = arg0.field2921;
                if (this.field2897.field2872[arg0.field2908] == 0) {
                    arg0.field2921 = class60.method1168(arg0.field2905, var10.method1183(), var10.method1174(), var10.method1180());
                } else {
                    arg0.field2921 = class60.method1168(arg0.field2905, var10.method1183(), 0, var10.method1180());
                    this.field2897.method3258(arg0, arg0.field2904.field2819[arg0.field2918] < 0);
                    arg0.field2921.method1299(var8, var10.method1174());
                }
                if (arg0.field2904.field2819[arg0.field2918] < 0) {
                    arg0.field2921.method1170(-1);
                }
                var10.method1223(var8);
                var10.method1001(arg1, arg2, arg4 - arg2);
                if (var10.method1185()) {
                    this.field2899.method993(var10);
                }
            }
        }
        arg0.field2921.method1001(arg1, arg2, arg3);
    }

    @ObfuscatedName("fy.g(Lfa;II)V")
    public void method3366(class178 arg0, int arg1) {
        if ((this.field2897.field2869[arg0.field2908] & 0x4) != 0 && arg0.field2917 < 0) {
            int var3 = this.field2897.field2877[arg0.field2908] / Statics.field1142;
            int var4 = (var3 + 1048575 - arg0.field2914) / var3;
            arg0.field2914 = arg0.field2914 + arg1 * var3 & 0xFFFFF;
            if (var4 <= arg1) {
                if (this.field2897.field2872[arg0.field2908] == 0) {
                    arg0.field2921 = class60.method1168(arg0.field2905, arg0.field2921.method1183(), arg0.field2921.method1174(), arg0.field2921.method1180());
                } else {
                    arg0.field2921 = class60.method1168(arg0.field2905, arg0.field2921.method1183(), 0, arg0.field2921.method1180());
                    this.field2897.method3258(arg0, arg0.field2904.field2819[arg0.field2918] < 0);
                }
                if (arg0.field2904.field2819[arg0.field2918] < 0) {
                    arg0.field2921.method1170(-1);
                }
                arg1 = arg0.field2914 / var3;
            }
        }
        arg0.field2921.method1022(arg1);
    }
}
