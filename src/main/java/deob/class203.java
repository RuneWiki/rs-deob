package deob;

@ObfuscatedName("gy")
public class class203 extends class114 {

    @ObfuscatedName("gy.f")
    public class199 field2478;

    @ObfuscatedName("gy.i")
    public class262 field2475 = new class262();

    @ObfuscatedName("gy.y")
    public class97 field2476 = new class97();

    public class203(class199 arg0) {
        this.field2478 = arg0;
    }

    @ObfuscatedName("gy.b()Ldl;")
    public class114 method2113() {
        class200 var1 = (class200) this.field2475.method4540();
        if (var1 == null) {
            return null;
        } else if (var1.field2446 == null) {
            return this.method2114();
        } else {
            return var1.field2446;
        }
    }

    @ObfuscatedName("gy.e()Ldl;")
    public class114 method2114() {
        class200 var1;
        do {
            var1 = (class200) this.field2475.method4533();
            if (var1 == null) {
                return null;
            }
        } while (var1.field2446 == null);
        return var1.field2446;
    }

    @ObfuscatedName("gy.x()I")
    public int method2122() {
        return 0;
    }

    @ObfuscatedName("gy.a([III)V")
    public void method2134(int[] arg0, int arg1, int arg2) {
        this.field2476.method2134(arg0, arg1, arg2);
        for (class200 var4 = (class200) this.field2475.method4540(); var4 != null; var4 = (class200) this.field2475.method4533()) {
            if (!this.field2478.method3435(var4)) {
                int var5 = arg1;
                int var6 = arg2;
                do {
                    if (var6 <= var4.field2432) {
                        this.method3540(var4, arg0, var5, var6, var5 + var6);
                        var4.field2432 -= var6;
                        break;
                    }
                    this.method3540(var4, arg0, var5, var4.field2432, var5 + var6);
                    var5 += var4.field2432;
                    var6 -= var4.field2432;
                } while (!this.field2478.method3402(var4, arg0, var5, var6));
            }
        }
    }

    @ObfuscatedName("gy.c(I)V")
    public void method2111(int arg0) {
        this.field2476.method2111(arg0);
        for (class200 var2 = (class200) this.field2475.method4540(); var2 != null; var2 = (class200) this.field2475.method4533()) {
            if (!this.field2478.method3435(var2)) {
                int var3 = arg0;
                do {
                    if (var3 <= var2.field2432) {
                        this.method3541(var2, var3);
                        var2.field2432 -= var3;
                        break;
                    }
                    this.method3541(var2, var2.field2432);
                    var3 -= var2.field2432;
                } while (!this.field2478.method3402(var2, (int[]) null, 0, var3));
            }
        }
    }

    @ObfuscatedName("gy.f(Lgl;[IIIII)V")
    public void method3540(class200 arg0, int[] arg1, int arg2, int arg3, int arg4) {
        if ((this.field2478.field2413[arg0.field2445] & 0x4) != 0 && arg0.field2442 < 0) {
            int var6 = this.field2478.field2426[arg0.field2445] / Statics.field2491;
            while (true) {
                int var7 = (var6 + 1048575 - arg0.field2448) / var6;
                if (var7 > arg3) {
                    arg0.field2448 += arg3 * var6;
                    break;
                }
                arg0.field2446.method2134(arg1, arg2, var7);
                arg2 += var7;
                arg3 -= var7;
                arg0.field2448 += var6 * var7 - 1048576;
                int var8 = Statics.field2491 / 100;
                int var9 = 262144 / var6;
                if (var9 < var8) {
                    var8 = var9;
                }
                class112 var10 = arg0.field2446;
                if (this.field2478.field2416[arg0.field2445] == 0) {
                    arg0.field2446 = class112.method2357(arg0.field2430, var10.method2341(), var10.method2378(), var10.method2334());
                } else {
                    arg0.field2446 = class112.method2357(arg0.field2430, var10.method2341(), 0, var10.method2334());
                    this.field2478.method3432(arg0, arg0.field2429.field2465[arg0.field2433] < 0);
                    arg0.field2446.method2338(var8, var10.method2378());
                }
                if (arg0.field2429.field2465[arg0.field2433] < 0) {
                    arg0.field2446.method2329(-1);
                }
                var10.method2339(var8);
                var10.method2134(arg1, arg2, arg4 - arg2);
                if (var10.method2342()) {
                    this.field2476.method2107(var10);
                }
            }
        }
        arg0.field2446.method2134(arg1, arg2, arg3);
    }

    @ObfuscatedName("gy.i(Lgl;II)V")
    public void method3541(class200 arg0, int arg1) {
        if ((this.field2478.field2413[arg0.field2445] & 0x4) != 0 && arg0.field2442 < 0) {
            int var3 = this.field2478.field2426[arg0.field2445] / Statics.field2491;
            int var4 = (var3 + 1048575 - arg0.field2448) / var3;
            arg0.field2448 = arg0.field2448 + arg1 * var3 & 0xFFFFF;
            if (var4 <= arg1) {
                if (this.field2478.field2416[arg0.field2445] == 0) {
                    arg0.field2446 = class112.method2357(arg0.field2430, arg0.field2446.method2341(), arg0.field2446.method2378(), arg0.field2446.method2334());
                } else {
                    arg0.field2446 = class112.method2357(arg0.field2430, arg0.field2446.method2341(), 0, arg0.field2446.method2334());
                    this.field2478.method3432(arg0, arg0.field2429.field2465[arg0.field2433] < 0);
                }
                if (arg0.field2429.field2465[arg0.field2433] < 0) {
                    arg0.field2446.method2329(-1);
                }
                arg1 = arg0.field2448 / var3;
            }
        }
        arg0.field2446.method2111(arg1);
    }
}
