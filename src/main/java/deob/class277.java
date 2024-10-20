package deob;

@ObfuscatedName("jy")
public class class277 extends class46 {

    @ObfuscatedName("jy.c")
    public class274 field3258;

    @ObfuscatedName("jy.v")
    public class334 field3262 = new class334();

    @ObfuscatedName("jy.q")
    public class36 field3257 = new class36();

    public class277(class274 arg0) {
        this.field3258 = arg0;
    }

    @ObfuscatedName("jy.e()Laz;")
    public class46 method581() {
        class279 var1 = (class279) this.field3262.method5535();
        if (var1 == null) {
            return null;
        } else if (var1.field3269 == null) {
            return this.method606();
        } else {
            return var1.field3269;
        }
    }

    @ObfuscatedName("jy.g()Laz;")
    public class46 method606() {
        class279 var1;
        do {
            var1 = (class279) this.field3262.method5537();
            if (var1 == null) {
                return null;
            }
        } while (var1.field3269 == null);
        return var1.field3269;
    }

    @ObfuscatedName("jy.w()I")
    public int method583() {
        return 0;
    }

    @ObfuscatedName("jy.y([III)V")
    public void method584(int[] arg0, int arg1, int arg2) {
        this.field3257.method584(arg0, arg1, arg2);
        for (class279 var4 = (class279) this.field3262.method5535(); var4 != null; var4 = (class279) this.field3262.method5537()) {
            if (!this.field3258.method4797(var4)) {
                int var5 = arg1;
                int var6 = arg2;
                do {
                    if (var6 <= var4.field3284) {
                        this.method4932(var4, arg0, var5, var6, var5 + var6);
                        var4.field3284 -= var6;
                        break;
                    }
                    this.method4932(var4, arg0, var5, var4.field3284, var5 + var6);
                    var5 += var4.field3284;
                    var6 -= var4.field3284;
                } while (!this.field3258.method4816(var4, arg0, var5, var6));
            }
        }
    }

    @ObfuscatedName("jy.s(I)V")
    public void method586(int arg0) {
        this.field3257.method586(arg0);
        for (class279 var2 = (class279) this.field3262.method5535(); var2 != null; var2 = (class279) this.field3262.method5537()) {
            if (!this.field3258.method4797(var2)) {
                int var3 = arg0;
                do {
                    if (var3 <= var2.field3284) {
                        this.method4933(var2, var3);
                        var2.field3284 -= var3;
                        break;
                    }
                    this.method4933(var2, var2.field3284);
                    var3 -= var2.field3284;
                } while (!this.field3258.method4816(var2, (int[]) null, 0, var3));
            }
        }
    }

    @ObfuscatedName("jy.c(Ljm;[IIIIB)V")
    public void method4932(class279 arg0, int[] arg1, int arg2, int arg3, int arg4) {
        if ((this.field3258.field3211[arg0.field3285] & 0x4) != 0 && arg0.field3279 < 0) {
            int var6 = this.field3258.field3208[arg0.field3285] / Statics.field288;
            while (true) {
                int var7 = (var6 + 1048575 - arg0.field3271) / var6;
                if (var7 > arg3) {
                    arg0.field3271 += arg3 * var6;
                    break;
                }
                arg0.field3269.method584(arg1, arg2, var7);
                arg2 += var7;
                arg3 -= var7;
                arg0.field3271 += var6 * var7 - 1048576;
                int var8 = Statics.field288 / 100;
                int var9 = 262144 / var6;
                if (var9 < var8) {
                    var8 = var9;
                }
                class45 var10 = arg0.field3269;
                if (this.field3258.field3230[arg0.field3285] == 0) {
                    arg0.field3269 = class45.method748(arg0.field3267, var10.method786(), var10.method874(), var10.method755());
                } else {
                    arg0.field3269 = class45.method748(arg0.field3267, var10.method786(), 0, var10.method755());
                    this.field3258.method4779(arg0, arg0.field3266.field3251[arg0.field3270] < 0);
                    arg0.field3269.method848(var8, var10.method874());
                }
                if (arg0.field3266.field3251[arg0.field3270] < 0) {
                    arg0.field3269.method785(-1);
                }
                var10.method770(var8);
                var10.method584(arg1, arg2, arg4 - arg2);
                if (var10.method765()) {
                    this.field3257.method592(var10);
                }
            }
        }
        arg0.field3269.method584(arg1, arg2, arg3);
    }

    @ObfuscatedName("jy.v(Ljm;IB)V")
    public void method4933(class279 arg0, int arg1) {
        if ((this.field3258.field3211[arg0.field3285] & 0x4) != 0 && arg0.field3279 < 0) {
            int var3 = this.field3258.field3208[arg0.field3285] / Statics.field288;
            int var4 = (var3 + 1048575 - arg0.field3271) / var3;
            arg0.field3271 = arg0.field3271 + arg1 * var3 & 0xFFFFF;
            if (var4 <= arg1) {
                if (this.field3258.field3230[arg0.field3285] == 0) {
                    arg0.field3269 = class45.method748(arg0.field3267, arg0.field3269.method786(), arg0.field3269.method874(), arg0.field3269.method755());
                } else {
                    arg0.field3269 = class45.method748(arg0.field3267, arg0.field3269.method786(), 0, arg0.field3269.method755());
                    this.field3258.method4779(arg0, arg0.field3266.field3251[arg0.field3270] < 0);
                }
                if (arg0.field3266.field3251[arg0.field3270] < 0) {
                    arg0.field3269.method785(-1);
                }
                arg1 = arg0.field3271 / var3;
            }
        }
        arg0.field3269.method586(arg1);
    }
}
