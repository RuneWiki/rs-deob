package deob;

@ObfuscatedName("fx")
public class class165 extends class60 {

    @ObfuscatedName("fx.g")
    public class163 field2779;

    @ObfuscatedName("fx.s")
    public class178 field2780 = new class178();

    @ObfuscatedName("fx.v")
    public class49 field2781 = new class49();

    public class165(class163 arg0) {
        this.field2779 = arg0;
    }

    @ObfuscatedName("fx.m()Lbm;")
    public class60 method932() {
        class166 var1 = (class166) this.field2780.method3189();
        if (var1 == null) {
            return null;
        } else if (var1.field2785 == null) {
            return this.method937();
        } else {
            return var1.field2785;
        }
    }

    @ObfuscatedName("fx.i()Lbm;")
    public class60 method937() {
        class166 var1;
        do {
            var1 = (class166) this.field2780.method3182();
            if (var1 == null) {
                return null;
            }
        } while (var1.field2785 == null);
        return var1.field2785;
    }

    @ObfuscatedName("fx.t()I")
    public int method938() {
        return 0;
    }

    @ObfuscatedName("fx.l([III)V")
    public void method939(int[] arg0, int arg1, int arg2) {
        this.field2781.method939(arg0, arg1, arg2);
        for (class166 var4 = (class166) this.field2780.method3189(); var4 != null; var4 = (class166) this.field2780.method3182()) {
            if (!this.field2779.method2999(var4)) {
                int var5 = arg1;
                int var6 = arg2;
                do {
                    if (var6 <= var4.field2804) {
                        this.method3090(var4, arg0, var5, var6, var5 + var6);
                        var4.field2804 -= var6;
                        break;
                    }
                    this.method3090(var4, arg0, var5, var4.field2804, var5 + var6);
                    var5 += var4.field2804;
                    var6 -= var4.field2804;
                } while (!this.field2779.method3004(var4, arg0, var5, var6));
            }
        }
    }

    @ObfuscatedName("fx.r(I)V")
    public void method941(int arg0) {
        this.field2781.method941(arg0);
        for (class166 var2 = (class166) this.field2780.method3189(); var2 != null; var2 = (class166) this.field2780.method3182()) {
            if (!this.field2779.method2999(var2)) {
                int var3 = arg0;
                do {
                    if (var3 <= var2.field2804) {
                        this.method3092(var2, var3);
                        var2.field2804 -= var3;
                        break;
                    }
                    this.method3092(var2, var2.field2804);
                    var3 -= var2.field2804;
                } while (!this.field2779.method3004(var2, (int[]) null, 0, var3));
            }
        }
    }

    @ObfuscatedName("fx.g(Lfv;[IIIII)V")
    public void method3090(class166 arg0, int[] arg1, int arg2, int arg3, int arg4) {
        if ((this.field2779.field2751[arg0.field2795] & 0x4) != 0 && arg0.field2799 < 0) {
            int var6 = this.field2779.field2741[arg0.field2795] / Statics.field1078;
            while (true) {
                int var7 = (var6 + 1048575 - arg0.field2805) / var6;
                if (var7 > arg3) {
                    arg0.field2805 += arg3 * var6;
                    break;
                }
                arg0.field2785.method939(arg1, arg2, var7);
                arg2 += var7;
                arg3 -= var7;
                arg0.field2805 += var6 * var7 - 1048576;
                int var8 = Statics.field1078 / 100;
                int var9 = 262144 / var6;
                if (var9 < var8) {
                    var8 = var9;
                }
                class58 var10 = arg0.field2785;
                if (this.field2779.field2754[arg0.field2795] == 0) {
                    arg0.field2785 = class58.method1182(arg0.field2798, var10.method1197(), var10.method1093(), var10.method1094());
                } else {
                    arg0.field2785 = class58.method1182(arg0.field2798, var10.method1197(), 0, var10.method1094());
                    this.field2779.method2998(arg0, arg0.field2786.field2701[arg0.field2790] < 0);
                    arg0.field2785.method1098(var8, var10.method1093());
                }
                if (arg0.field2786.field2701[arg0.field2790] < 0) {
                    arg0.field2785.method1089(-1);
                }
                var10.method1139(var8);
                var10.method939(arg1, arg2, arg4 - arg2);
                if (var10.method1103()) {
                    this.field2781.method960(var10);
                }
            }
        }
        arg0.field2785.method939(arg1, arg2, arg3);
    }

    @ObfuscatedName("fx.s(Lfv;II)V")
    public void method3092(class166 arg0, int arg1) {
        if ((this.field2779.field2751[arg0.field2795] & 0x4) != 0 && arg0.field2799 < 0) {
            int var3 = this.field2779.field2741[arg0.field2795] / Statics.field1078;
            int var4 = (var3 + 1048575 - arg0.field2805) / var3;
            arg0.field2805 = arg0.field2805 + arg1 * var3 & 0xFFFFF;
            if (var4 <= arg1) {
                if (this.field2779.field2754[arg0.field2795] == 0) {
                    arg0.field2785 = class58.method1182(arg0.field2798, arg0.field2785.method1197(), arg0.field2785.method1093(), arg0.field2785.method1094());
                } else {
                    arg0.field2785 = class58.method1182(arg0.field2798, arg0.field2785.method1197(), 0, arg0.field2785.method1094());
                    this.field2779.method2998(arg0, arg0.field2786.field2701[arg0.field2790] < 0);
                }
                if (arg0.field2786.field2701[arg0.field2790] < 0) {
                    arg0.field2785.method1089(-1);
                }
                arg1 = arg0.field2805 / var3;
            }
        }
        arg0.field2785.method941(arg1);
    }
}
