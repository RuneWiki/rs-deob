package deob;

@ObfuscatedName("gd")
public class class203 extends class116 {

    @ObfuscatedName("gd.c")
    public class199 field2495;

    @ObfuscatedName("gd.t")
    public class263 field2494 = new class263();

    @ObfuscatedName("gd.o")
    public class99 field2496 = new class99();

    public class203(class199 arg0) {
        this.field2495 = arg0;
    }

    @ObfuscatedName("gd.g()Ldn;")
    public class116 method2159() {
        class200 var1 = (class200) this.field2494.method4543();
        if (var1 == null) {
            return null;
        } else if (var1.field2464 == null) {
            return this.method2160();
        } else {
            return var1.field2464;
        }
    }

    @ObfuscatedName("gd.d()Ldn;")
    public class116 method2160() {
        class200 var1;
        do {
            var1 = (class200) this.field2494.method4564();
            if (var1 == null) {
                return null;
            }
        } while (var1.field2464 == null);
        return var1.field2464;
    }

    @ObfuscatedName("gd.l()I")
    public int method2161() {
        return 0;
    }

    @ObfuscatedName("gd.j([III)V")
    public void method2162(int[] arg0, int arg1, int arg2) {
        this.field2496.method2162(arg0, arg1, arg2);
        for (class200 var4 = (class200) this.field2494.method4543(); var4 != null; var4 = (class200) this.field2494.method4564()) {
            if (!this.field2495.method3478(var4)) {
                int var5 = arg1;
                int var6 = arg2;
                do {
                    if (var6 <= var4.field2465) {
                        this.method3614(var4, arg0, var5, var6, var5 + var6);
                        var4.field2465 -= var6;
                        break;
                    }
                    this.method3614(var4, arg0, var5, var4.field2465, var5 + var6);
                    var5 += var4.field2465;
                    var6 -= var4.field2465;
                } while (!this.field2495.method3503(var4, arg0, var5, var6));
            }
        }
    }

    @ObfuscatedName("gd.p(I)V")
    public void method2180(int arg0) {
        this.field2496.method2180(arg0);
        for (class200 var2 = (class200) this.field2494.method4543(); var2 != null; var2 = (class200) this.field2494.method4564()) {
            if (!this.field2495.method3478(var2)) {
                int var3 = arg0;
                do {
                    if (var3 <= var2.field2465) {
                        this.method3615(var2, var3);
                        var2.field2465 -= var3;
                        break;
                    }
                    this.method3615(var2, var2.field2465);
                    var3 -= var2.field2465;
                } while (!this.field2495.method3503(var2, (int[]) null, 0, var3));
            }
        }
    }

    @ObfuscatedName("gd.c(Lgu;[IIIII)V")
    public void method3614(class200 arg0, int[] arg1, int arg2, int arg3, int arg4) {
        if ((this.field2495.field2430[arg0.field2448] & 0x4) != 0 && arg0.field2460 < 0) {
            int var6 = this.field2495.field2423[arg0.field2448] / Statics.field1399;
            while (true) {
                int var7 = (var6 + 1048575 - arg0.field2466) / var6;
                if (var7 > arg3) {
                    arg0.field2466 += arg3 * var6;
                    break;
                }
                arg0.field2464.method2162(arg1, arg2, var7);
                arg2 += var7;
                arg3 -= var7;
                arg0.field2466 += var6 * var7 - 1048576;
                int var8 = Statics.field1399 / 100;
                int var9 = 262144 / var6;
                if (var9 < var8) {
                    var8 = var9;
                }
                class114 var10 = arg0.field2464;
                if (this.field2495.field2433[arg0.field2448] == 0) {
                    arg0.field2464 = class114.method2434(arg0.field2467, var10.method2398(), var10.method2390(), var10.method2391());
                } else {
                    arg0.field2464 = class114.method2434(arg0.field2467, var10.method2398(), 0, var10.method2391());
                    this.field2495.method3445(arg0, arg0.field2453.field2484[arg0.field2451] < 0);
                    arg0.field2464.method2392(var8, var10.method2390());
                }
                if (arg0.field2453.field2484[arg0.field2451] < 0) {
                    arg0.field2464.method2423(-1);
                }
                var10.method2397(var8);
                var10.method2162(arg1, arg2, arg4 - arg2);
                if (var10.method2472()) {
                    this.field2496.method2154(var10);
                }
            }
        }
        arg0.field2464.method2162(arg1, arg2, arg3);
    }

    @ObfuscatedName("gd.t(Lgu;II)V")
    public void method3615(class200 arg0, int arg1) {
        if ((this.field2495.field2430[arg0.field2448] & 0x4) != 0 && arg0.field2460 < 0) {
            int var3 = this.field2495.field2423[arg0.field2448] / Statics.field1399;
            int var4 = (var3 + 1048575 - arg0.field2466) / var3;
            arg0.field2466 = arg0.field2466 + arg1 * var3 & 0xFFFFF;
            if (var4 <= arg1) {
                if (this.field2495.field2433[arg0.field2448] == 0) {
                    arg0.field2464 = class114.method2434(arg0.field2467, arg0.field2464.method2398(), arg0.field2464.method2390(), arg0.field2464.method2391());
                } else {
                    arg0.field2464 = class114.method2434(arg0.field2467, arg0.field2464.method2398(), 0, arg0.field2464.method2391());
                    this.field2495.method3445(arg0, arg0.field2453.field2484[arg0.field2451] < 0);
                }
                if (arg0.field2453.field2484[arg0.field2451] < 0) {
                    arg0.field2464.method2423(-1);
                }
                arg1 = arg0.field2466 / var3;
            }
        }
        arg0.field2464.method2180(arg1);
    }
}
