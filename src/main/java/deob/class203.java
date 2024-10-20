package deob;

@ObfuscatedName("gh")
public class class203 extends class116 {

    @ObfuscatedName("gh.s")
    public class199 field2466;

    @ObfuscatedName("gh.j")
    public class262 field2465 = new class262();

    @ObfuscatedName("gh.i")
    public class99 field2469 = new class99();

    public class203(class199 arg0) {
        this.field2466 = arg0;
    }

    @ObfuscatedName("gh.n()Ldz;")
    public class116 method2093() {
        class200 var1 = (class200) this.field2465.method4480();
        if (var1 == null) {
            return null;
        } else if (var1.field2428 == null) {
            return this.method2094();
        } else {
            return var1.field2428;
        }
    }

    @ObfuscatedName("gh.t()Ldz;")
    public class116 method2094() {
        class200 var1;
        do {
            var1 = (class200) this.field2465.method4491();
            if (var1 == null) {
                return null;
            }
        } while (var1.field2428 == null);
        return var1.field2428;
    }

    @ObfuscatedName("gh.q()I")
    public int method2095() {
        return 0;
    }

    @ObfuscatedName("gh.x([III)V")
    public void method2096(int[] arg0, int arg1, int arg2) {
        this.field2469.method2096(arg0, arg1, arg2);
        for (class200 var4 = (class200) this.field2465.method4480(); var4 != null; var4 = (class200) this.field2465.method4491()) {
            if (!this.field2466.method3426(var4)) {
                int var5 = arg1;
                int var6 = arg2;
                do {
                    if (var6 <= var4.field2439) {
                        this.method3571(var4, arg0, var5, var6, var5 + var6);
                        var4.field2439 -= var6;
                        break;
                    }
                    this.method3571(var4, arg0, var5, var4.field2439, var5 + var6);
                    var5 += var4.field2439;
                    var6 -= var4.field2439;
                } while (!this.field2466.method3416(var4, arg0, var5, var6));
            }
        }
    }

    @ObfuscatedName("gh.f(I)V")
    public void method2106(int arg0) {
        this.field2469.method2106(arg0);
        for (class200 var2 = (class200) this.field2465.method4480(); var2 != null; var2 = (class200) this.field2465.method4491()) {
            if (!this.field2466.method3426(var2)) {
                int var3 = arg0;
                do {
                    if (var3 <= var2.field2439) {
                        this.method3569(var2, var3);
                        var2.field2439 -= var3;
                        break;
                    }
                    this.method3569(var2, var2.field2439);
                    var3 -= var2.field2439;
                } while (!this.field2466.method3416(var2, (int[]) null, 0, var3));
            }
        }
    }

    @ObfuscatedName("gh.s(Lgd;[IIIII)V")
    public void method3571(class200 arg0, int[] arg1, int arg2, int arg3, int arg4) {
        if ((this.field2466.field2415[arg0.field2438] & 0x4) != 0 && arg0.field2434 < 0) {
            int var6 = this.field2466.field2416[arg0.field2438] / Statics.field1384;
            while (true) {
                int var7 = (var6 + 1048575 - arg0.field2440) / var6;
                if (var7 > arg3) {
                    arg0.field2440 += arg3 * var6;
                    break;
                }
                arg0.field2428.method2096(arg1, arg2, var7);
                arg2 += var7;
                arg3 -= var7;
                arg0.field2440 += var6 * var7 - 1048576;
                int var8 = Statics.field1384 / 100;
                int var9 = 262144 / var6;
                if (var9 < var8) {
                    var8 = var9;
                }
                class114 var10 = arg0.field2428;
                if (this.field2466.field2390[arg0.field2438] == 0) {
                    arg0.field2428 = class114.method2310(arg0.field2422, var10.method2439(), var10.method2305(), var10.method2316());
                } else {
                    arg0.field2428 = class114.method2310(arg0.field2422, var10.method2439(), 0, var10.method2316());
                    this.field2466.method3469(arg0, arg0.field2421.field2458[arg0.field2425] < 0);
                    arg0.field2428.method2319(var8, var10.method2305());
                }
                if (arg0.field2421.field2458[arg0.field2425] < 0) {
                    arg0.field2428.method2312(-1);
                }
                var10.method2322(var8);
                var10.method2096(arg1, arg2, arg4 - arg2);
                if (var10.method2307()) {
                    this.field2469.method2103(var10);
                }
            }
        }
        arg0.field2428.method2096(arg1, arg2, arg3);
    }

    @ObfuscatedName("gh.j(Lgd;II)V")
    public void method3569(class200 arg0, int arg1) {
        if ((this.field2466.field2415[arg0.field2438] & 0x4) != 0 && arg0.field2434 < 0) {
            int var3 = this.field2466.field2416[arg0.field2438] / Statics.field1384;
            int var4 = (var3 + 1048575 - arg0.field2440) / var3;
            arg0.field2440 = arg0.field2440 + arg1 * var3 & 0xFFFFF;
            if (var4 <= arg1) {
                if (this.field2466.field2390[arg0.field2438] == 0) {
                    arg0.field2428 = class114.method2310(arg0.field2422, arg0.field2428.method2439(), arg0.field2428.method2305(), arg0.field2428.method2316());
                } else {
                    arg0.field2428 = class114.method2310(arg0.field2422, arg0.field2428.method2439(), 0, arg0.field2428.method2316());
                    this.field2466.method3469(arg0, arg0.field2421.field2458[arg0.field2425] < 0);
                }
                if (arg0.field2421.field2458[arg0.field2425] < 0) {
                    arg0.field2428.method2312(-1);
                }
                arg1 = arg0.field2440 / var3;
            }
        }
        arg0.field2428.method2106(arg1);
    }
}
