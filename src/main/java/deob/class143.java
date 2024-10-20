package deob;

@ObfuscatedName("eu")
public class class143 extends class48 {

    @ObfuscatedName("eu.d")
    public class141 field2411;

    @ObfuscatedName("eu.g")
    public class177 field2408 = new class177();

    @ObfuscatedName("eu.a")
    public class46 field2410 = new class46();

    public class143(class141 arg0) {
        this.field2411 = arg0;
    }

    @ObfuscatedName("eu.q()Lao;")
    public class48 method974() {
        class145 var1 = (class145) this.field2408.method3278();
        if (var1 == null) {
            return null;
        } else if (var1.field2445 == null) {
            return this.method951();
        } else {
            return var1.field2445;
        }
    }

    @ObfuscatedName("eu.w()Lao;")
    public class48 method951() {
        class145 var1;
        do {
            var1 = (class145) this.field2408.method3280();
            if (var1 == null) {
                return null;
            }
        } while (var1.field2445 == null);
        return var1.field2445;
    }

    @ObfuscatedName("eu.o()I")
    public int method952() {
        return 0;
    }

    @ObfuscatedName("eu.j([III)V")
    public void method1018(int[] arg0, int arg1, int arg2) {
        this.field2410.method1018(arg0, arg1, arg2);
        for (class145 var4 = (class145) this.field2408.method3278(); var4 != null; var4 = (class145) this.field2408.method3280()) {
            if (!this.field2411.method2725(var4)) {
                int var5 = arg1;
                int var6 = arg2;
                do {
                    if (var6 <= var4.field2446) {
                        this.method2788(var4, arg0, var5, var6, var5 + var6);
                        var4.field2446 -= var6;
                        break;
                    }
                    this.method2788(var4, arg0, var5, var4.field2446, var5 + var6);
                    var5 += var4.field2446;
                    var6 -= var4.field2446;
                } while (!this.field2411.method2717(var4, arg0, var5, var6));
            }
        }
    }

    @ObfuscatedName("eu.ae(I)V")
    public void method954(int arg0) {
        this.field2410.method954(arg0);
        for (class145 var2 = (class145) this.field2408.method3278(); var2 != null; var2 = (class145) this.field2408.method3280()) {
            if (!this.field2411.method2725(var2)) {
                int var3 = arg0;
                do {
                    if (var3 <= var2.field2446) {
                        this.method2789(var2, var3);
                        var2.field2446 -= var3;
                        break;
                    }
                    this.method2789(var2, var2.field2446);
                    var3 -= var2.field2446;
                } while (!this.field2411.method2717(var2, (int[]) null, 0, var3));
            }
        }
    }

    @ObfuscatedName("eu.d(Ler;[IIIII)V")
    public void method2788(class145 arg0, int[] arg1, int arg2, int arg3, int arg4) {
        if ((this.field2411.field2364[arg0.field2440] & 0x4) != 0 && arg0.field2433 < 0) {
            int var6 = this.field2411.field2385[arg0.field2440] / Statics.field2328;
            while (true) {
                int var7 = (var6 + 1048575 - arg0.field2448) / var6;
                if (var7 > arg3) {
                    arg0.field2448 += arg3 * var6;
                    break;
                }
                arg0.field2445.method1018(arg1, arg2, var7);
                arg2 += var7;
                arg3 -= var7;
                arg0.field2448 += var6 * var7 - 1048576;
                int var8 = Statics.field2328 / 100;
                int var9 = 262144 / var6;
                if (var9 < var8) {
                    var8 = var9;
                }
                class45 var10 = arg0.field2445;
                if (this.field2411.field2379[arg0.field2440] == 0) {
                    arg0.field2445 = class45.method932(arg0.field2429, var10.method947(), var10.method1019(), var10.method939());
                } else {
                    arg0.field2445 = class45.method932(arg0.field2429, var10.method947(), 0, var10.method939());
                    this.field2411.method2704(arg0, arg0.field2428.field2352[arg0.field2432] < 0);
                    arg0.field2445.method1030(var8, var10.method1019());
                }
                if (arg0.field2428.field2352[arg0.field2432] < 0) {
                    arg0.field2445.method943(-1);
                }
                var10.method990(var8);
                var10.method1018(arg1, arg2, arg4 - arg2);
                if (var10.method1017()) {
                    this.field2410.method1090(var10);
                }
            }
        }
        arg0.field2445.method1018(arg1, arg2, arg3);
    }

    @ObfuscatedName("eu.g(Ler;II)V")
    public void method2789(class145 arg0, int arg1) {
        if ((this.field2411.field2364[arg0.field2440] & 0x4) != 0 && arg0.field2433 < 0) {
            int var3 = this.field2411.field2385[arg0.field2440] / Statics.field2328;
            int var4 = (var3 + 1048575 - arg0.field2448) / var3;
            arg0.field2448 = arg0.field2448 + arg1 * var3 & 0xFFFFF;
            if (var4 <= arg1) {
                if (this.field2411.field2379[arg0.field2440] == 0) {
                    arg0.field2445 = class45.method932(arg0.field2429, arg0.field2445.method947(), arg0.field2445.method1019(), arg0.field2445.method939());
                } else {
                    arg0.field2445 = class45.method932(arg0.field2429, arg0.field2445.method947(), 0, arg0.field2445.method939());
                    this.field2411.method2704(arg0, arg0.field2428.field2352[arg0.field2432] < 0);
                }
                if (arg0.field2428.field2352[arg0.field2432] < 0) {
                    arg0.field2445.method943(-1);
                }
                arg1 = arg0.field2448 / var3;
            }
        }
        arg0.field2445.method954(arg1);
    }
}
