package deob;

@ObfuscatedName("fj")
public class class177 extends class62 {

    @ObfuscatedName("fj.y")
    public class175 field2917;

    @ObfuscatedName("fj.k")
    public class190 field2920 = new class190();

    @ObfuscatedName("fj.g")
    public class51 field2919 = new class51();

    public class177(class175 arg0) {
        this.field2917 = arg0;
    }

    @ObfuscatedName("fj.e()Lbk;")
    public class62 method1009() {
        class178 var1 = (class178) this.field2920.method3396();
        if (var1 == null) {
            return null;
        } else if (var1.field2941 == null) {
            return this.method1007();
        } else {
            return var1.field2941;
        }
    }

    @ObfuscatedName("fj.q()Lbk;")
    public class62 method1007() {
        class178 var1;
        do {
            var1 = (class178) this.field2920.method3398();
            if (var1 == null) {
                return null;
            }
        } while (var1.field2941 == null);
        return var1.field2941;
    }

    @ObfuscatedName("fj.z()I")
    public int method1006() {
        return 0;
    }

    @ObfuscatedName("fj.v([III)V")
    public void method1005(int[] arg0, int arg1, int arg2) {
        this.field2919.method1005(arg0, arg1, arg2);
        for (class178 var4 = (class178) this.field2920.method3396(); var4 != null; var4 = (class178) this.field2920.method3398()) {
            if (!this.field2917.method3234(var4)) {
                int var5 = arg1;
                int var6 = arg2;
                do {
                    if (var6 <= var4.field2942) {
                        this.method3310(var4, arg0, var5, var6, var5 + var6);
                        var4.field2942 -= var6;
                        break;
                    }
                    this.method3310(var4, arg0, var5, var4.field2942, var5 + var6);
                    var5 += var4.field2942;
                    var6 -= var4.field2942;
                } while (!this.field2917.method3245(var4, arg0, var5, var6));
            }
        }
    }

    @ObfuscatedName("fj.f(I)V")
    public void method1011(int arg0) {
        this.field2919.method1011(arg0);
        for (class178 var2 = (class178) this.field2920.method3396(); var2 != null; var2 = (class178) this.field2920.method3398()) {
            if (!this.field2917.method3234(var2)) {
                int var3 = arg0;
                do {
                    if (var3 <= var2.field2942) {
                        this.method3311(var2, var3);
                        var2.field2942 -= var3;
                        break;
                    }
                    this.method3311(var2, var2.field2942);
                    var3 -= var2.field2942;
                } while (!this.field2917.method3245(var2, (int[]) null, 0, var3));
            }
        }
    }

    @ObfuscatedName("fj.y(Lfm;[IIIIB)V")
    public void method3310(class178 arg0, int[] arg1, int arg2, int arg3, int arg4) {
        if ((this.field2917.field2900[arg0.field2924] & 0x4) != 0 && arg0.field2937 < 0) {
            int var6 = this.field2917.field2897[arg0.field2924] / Statics.field1126;
            while (true) {
                int var7 = (var6 + 1048575 - arg0.field2940) / var6;
                if (var7 > arg3) {
                    arg0.field2940 += arg3 * var6;
                    break;
                }
                arg0.field2941.method1005(arg1, arg2, var7);
                arg2 += var7;
                arg3 -= var7;
                arg0.field2940 += var6 * var7 - 1048576;
                int var8 = Statics.field1126 / 100;
                int var9 = 262144 / var6;
                if (var9 < var8) {
                    var8 = var9;
                }
                class60 var10 = arg0.field2941;
                if (this.field2917.field2895[arg0.field2924] == 0) {
                    arg0.field2941 = class60.method1216(arg0.field2925, var10.method1174(), var10.method1165(), var10.method1166());
                } else {
                    arg0.field2941 = class60.method1216(arg0.field2925, var10.method1174(), 0, var10.method1166());
                    this.field2917.method3236(arg0, arg0.field2945.field2845[arg0.field2938] < 0);
                    arg0.field2941.method1272(var8, var10.method1165());
                }
                if (arg0.field2945.field2845[arg0.field2938] < 0) {
                    arg0.field2941.method1199(-1);
                }
                var10.method1172(var8);
                var10.method1005(arg1, arg2, arg4 - arg2);
                if (var10.method1228()) {
                    this.field2919.method1045(var10);
                }
            }
        }
        arg0.field2941.method1005(arg1, arg2, arg3);
    }

    @ObfuscatedName("fj.k(Lfm;II)V")
    public void method3311(class178 arg0, int arg1) {
        if ((this.field2917.field2900[arg0.field2924] & 0x4) != 0 && arg0.field2937 < 0) {
            int var3 = this.field2917.field2897[arg0.field2924] / Statics.field1126;
            int var4 = (var3 + 1048575 - arg0.field2940) / var3;
            arg0.field2940 = arg0.field2940 + arg1 * var3 & 0xFFFFF;
            if (var4 <= arg1) {
                if (this.field2917.field2895[arg0.field2924] == 0) {
                    arg0.field2941 = class60.method1216(arg0.field2925, arg0.field2941.method1174(), arg0.field2941.method1165(), arg0.field2941.method1166());
                } else {
                    arg0.field2941 = class60.method1216(arg0.field2925, arg0.field2941.method1174(), 0, arg0.field2941.method1166());
                    this.field2917.method3236(arg0, arg0.field2945.field2845[arg0.field2938] < 0);
                }
                if (arg0.field2945.field2845[arg0.field2938] < 0) {
                    arg0.field2941.method1199(-1);
                }
                arg1 = arg0.field2940 / var3;
            }
        }
        arg0.field2941.method1011(arg1);
    }
}
