package deob;

@ObfuscatedName("el")
public class class143 extends class48 {

    @ObfuscatedName("el.a")
    public class141 field2392;

    @ObfuscatedName("el.r")
    public class177 field2389 = new class177();

    @ObfuscatedName("el.u")
    public class46 field2390 = new class46();

    public class143(class141 arg0) {
        this.field2392 = arg0;
    }

    @ObfuscatedName("el.w()Lam;")
    public class48 method908() {
        class145 var1 = (class145) this.field2389.method3276();
        if (var1 == null) {
            return null;
        } else if (var1.field2425 == null) {
            return this.method1015();
        } else {
            return var1.field2425;
        }
    }

    @ObfuscatedName("el.l()Lam;")
    public class48 method1015() {
        class145 var1;
        do {
            var1 = (class145) this.field2389.method3278();
            if (var1 == null) {
                return null;
            }
        } while (var1.field2425 == null);
        return var1.field2425;
    }

    @ObfuscatedName("el.d()I")
    public int method945() {
        return 0;
    }

    @ObfuscatedName("el.y([III)V")
    public void method955(int[] arg0, int arg1, int arg2) {
        this.field2390.method955(arg0, arg1, arg2);
        for (class145 var4 = (class145) this.field2389.method3276(); var4 != null; var4 = (class145) this.field2389.method3278()) {
            if (!this.field2392.method2704(var4)) {
                int var5 = arg1;
                int var6 = arg2;
                do {
                    if (var6 <= var4.field2426) {
                        this.method2788(var4, arg0, var5, var6, var5 + var6);
                        var4.field2426 -= var6;
                        break;
                    }
                    this.method2788(var4, arg0, var5, var4.field2426, var5 + var6);
                    var5 += var4.field2426;
                    var6 -= var4.field2426;
                } while (!this.field2392.method2705(var4, arg0, var5, var6));
            }
        }
    }

    @ObfuscatedName("el.ah(I)V")
    public void method912(int arg0) {
        this.field2390.method912(arg0);
        for (class145 var2 = (class145) this.field2389.method3276(); var2 != null; var2 = (class145) this.field2389.method3278()) {
            if (!this.field2392.method2704(var2)) {
                int var3 = arg0;
                do {
                    if (var3 <= var2.field2426) {
                        this.method2789(var2, var3);
                        var2.field2426 -= var3;
                        break;
                    }
                    this.method2789(var2, var2.field2426);
                    var3 -= var2.field2426;
                } while (!this.field2392.method2705(var2, (int[]) null, 0, var3));
            }
        }
    }

    @ObfuscatedName("el.a(Let;[IIIIB)V")
    public void method2788(class145 arg0, int[] arg1, int arg2, int arg3, int arg4) {
        if ((this.field2392.field2359[arg0.field2415] & 0x4) != 0 && arg0.field2432 < 0) {
            int var6 = this.field2392.field2364[arg0.field2415] / Statics.field1080;
            while (true) {
                int var7 = (var6 + 1048575 - arg0.field2428) / var6;
                if (var7 > arg3) {
                    arg0.field2428 += arg3 * var6;
                    break;
                }
                arg0.field2425.method955(arg1, arg2, var7);
                arg2 += var7;
                arg3 -= var7;
                arg0.field2428 += var6 * var7 - 1048576;
                int var8 = Statics.field1080 / 100;
                int var9 = 262144 / var6;
                if (var9 < var8) {
                    var8 = var9;
                }
                class45 var10 = arg0.field2425;
                if (this.field2392.field2362[arg0.field2415] == 0) {
                    arg0.field2425 = class45.method890(arg0.field2408, var10.method1021(), var10.method902(), var10.method948());
                } else {
                    arg0.field2425 = class45.method890(arg0.field2408, var10.method1021(), 0, var10.method948());
                    this.field2392.method2784(arg0, arg0.field2416.field2335[arg0.field2407] < 0);
                    arg0.field2425.method996(var8, var10.method902());
                }
                if (arg0.field2416.field2335[arg0.field2407] < 0) {
                    arg0.field2425.method892(-1);
                }
                var10.method903(var8);
                var10.method955(arg1, arg2, arg4 - arg2);
                if (var10.method907()) {
                    this.field2390.method1030(var10);
                }
            }
        }
        arg0.field2425.method955(arg1, arg2, arg3);
    }

    @ObfuscatedName("el.r(Let;II)V")
    public void method2789(class145 arg0, int arg1) {
        if ((this.field2392.field2359[arg0.field2415] & 0x4) != 0 && arg0.field2432 < 0) {
            int var3 = this.field2392.field2364[arg0.field2415] / Statics.field1080;
            int var4 = (var3 + 1048575 - arg0.field2428) / var3;
            arg0.field2428 = arg0.field2428 + arg1 * var3 & 0xFFFFF;
            if (var4 <= arg1) {
                if (this.field2392.field2362[arg0.field2415] == 0) {
                    arg0.field2425 = class45.method890(arg0.field2408, arg0.field2425.method1021(), arg0.field2425.method902(), arg0.field2425.method948());
                } else {
                    arg0.field2425 = class45.method890(arg0.field2408, arg0.field2425.method1021(), 0, arg0.field2425.method948());
                    this.field2392.method2784(arg0, arg0.field2416.field2335[arg0.field2407] < 0);
                }
                if (arg0.field2416.field2335[arg0.field2407] < 0) {
                    arg0.field2425.method892(-1);
                }
                arg1 = arg0.field2428 / var3;
            }
        }
        arg0.field2425.method912(arg1);
    }
}
