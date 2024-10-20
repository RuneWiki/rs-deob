package deob;

@ObfuscatedName("gd")
public class class203 extends class116 {

    @ObfuscatedName("gd.a")
    public class199 field2467;

    @ObfuscatedName("gd.t")
    public class262 field2465 = new class262();

    @ObfuscatedName("gd.n")
    public class99 field2463 = new class99();

    public class203(class199 arg0) {
        this.field2467 = arg0;
    }

    @ObfuscatedName("gd.l()Ldj;")
    public class116 method2215() {
        class200 var1 = (class200) this.field2465.method4581();
        if (var1 == null) {
            return null;
        } else if (var1.field2433 == null) {
            return this.method2223();
        } else {
            return var1.field2433;
        }
    }

    @ObfuscatedName("gd.c()Ldj;")
    public class116 method2223() {
        class200 var1;
        do {
            var1 = (class200) this.field2465.method4589();
            if (var1 == null) {
                return null;
            }
        } while (var1.field2433 == null);
        return var1.field2433;
    }

    @ObfuscatedName("gd.o()I")
    public int method2217() {
        return 0;
    }

    @ObfuscatedName("gd.i([III)V")
    public void method2218(int[] arg0, int arg1, int arg2) {
        this.field2463.method2218(arg0, arg1, arg2);
        for (class200 var4 = (class200) this.field2465.method4581(); var4 != null; var4 = (class200) this.field2465.method4589()) {
            if (!this.field2467.method3499(var4)) {
                int var5 = arg1;
                int var6 = arg2;
                do {
                    if (var6 <= var4.field2434) {
                        this.method3648(var4, arg0, var5, var6, var5 + var6);
                        var4.field2434 -= var6;
                        break;
                    }
                    this.method3648(var4, arg0, var5, var4.field2434, var5 + var6);
                    var5 += var4.field2434;
                    var6 -= var4.field2434;
                } while (!this.field2467.method3500(var4, arg0, var5, var6));
            }
        }
    }

    @ObfuscatedName("gd.m(I)V")
    public void method2224(int arg0) {
        this.field2463.method2224(arg0);
        for (class200 var2 = (class200) this.field2465.method4581(); var2 != null; var2 = (class200) this.field2465.method4589()) {
            if (!this.field2467.method3499(var2)) {
                int var3 = arg0;
                do {
                    if (var3 <= var2.field2434) {
                        this.method3649(var2, var3);
                        var2.field2434 -= var3;
                        break;
                    }
                    this.method3649(var2, var2.field2434);
                    var3 -= var2.field2434;
                } while (!this.field2467.method3500(var2, (int[]) null, 0, var3));
            }
        }
    }

    @ObfuscatedName("gd.a(Lgq;[IIIII)V")
    public void method3648(class200 arg0, int[] arg1, int arg2, int arg3, int arg4) {
        if ((this.field2467.field2387[arg0.field2426] & 0x4) != 0 && arg0.field2429 < 0) {
            int var6 = this.field2467.field2404[arg0.field2426] / Statics.field1392;
            while (true) {
                int var7 = (var6 + 1048575 - arg0.field2435) / var6;
                if (var7 > arg3) {
                    arg0.field2435 += arg3 * var6;
                    break;
                }
                arg0.field2433.method2218(arg1, arg2, var7);
                arg2 += var7;
                arg3 -= var7;
                arg0.field2435 += var6 * var7 - 1048576;
                int var8 = Statics.field1392 / 100;
                int var9 = 262144 / var6;
                if (var9 < var8) {
                    var8 = var9;
                }
                class114 var10 = arg0.field2433;
                if (this.field2467.field2402[arg0.field2426] == 0) {
                    arg0.field2433 = class114.method2498(arg0.field2419, var10.method2458(), var10.method2449(), var10.method2570());
                } else {
                    arg0.field2433 = class114.method2498(arg0.field2419, var10.method2458(), 0, var10.method2570());
                    this.field2467.method3502(arg0, arg0.field2416.field2461[arg0.field2420] < 0);
                    arg0.field2433.method2450(var8, var10.method2449());
                }
                if (arg0.field2416.field2461[arg0.field2420] < 0) {
                    arg0.field2433.method2440(-1);
                }
                var10.method2463(var8);
                var10.method2218(arg1, arg2, arg4 - arg2);
                if (var10.method2460()) {
                    this.field2463.method2214(var10);
                }
            }
        }
        arg0.field2433.method2218(arg1, arg2, arg3);
    }

    @ObfuscatedName("gd.t(Lgq;IB)V")
    public void method3649(class200 arg0, int arg1) {
        if ((this.field2467.field2387[arg0.field2426] & 0x4) != 0 && arg0.field2429 < 0) {
            int var3 = this.field2467.field2404[arg0.field2426] / Statics.field1392;
            int var4 = (var3 + 1048575 - arg0.field2435) / var3;
            arg0.field2435 = arg0.field2435 + arg1 * var3 & 0xFFFFF;
            if (var4 <= arg1) {
                if (this.field2467.field2402[arg0.field2426] == 0) {
                    arg0.field2433 = class114.method2498(arg0.field2419, arg0.field2433.method2458(), arg0.field2433.method2449(), arg0.field2433.method2570());
                } else {
                    arg0.field2433 = class114.method2498(arg0.field2419, arg0.field2433.method2458(), 0, arg0.field2433.method2570());
                    this.field2467.method3502(arg0, arg0.field2416.field2461[arg0.field2420] < 0);
                }
                if (arg0.field2416.field2461[arg0.field2420] < 0) {
                    arg0.field2433.method2440(-1);
                }
                arg1 = arg0.field2435 / var3;
            }
        }
        arg0.field2433.method2224(arg1);
    }
}
