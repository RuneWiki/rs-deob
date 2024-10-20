package deob;

@ObfuscatedName("hn")
public class class230 extends class113 {

    @ObfuscatedName("hn.n")
    public class226 field2621;

    @ObfuscatedName("hn.h")
    public class213 field2616 = new class213();

    @ObfuscatedName("hn.l")
    public class96 field2617 = new class96();

    public class230(class226 arg0) {
        this.field2621 = arg0;
    }

    @ObfuscatedName("hn.a()Ldv;")
    public class113 method2128() {
        class227 var1 = (class227) this.field2616.method3986();
        if (var1 == null) {
            return null;
        } else if (var1.field2576 == null) {
            return this.method2093();
        } else {
            return var1.field2576;
        }
    }

    @ObfuscatedName("hn.c()Ldv;")
    public class113 method2093() {
        class227 var1;
        do {
            var1 = (class227) this.field2616.method3988();
            if (var1 == null) {
                return null;
            }
        } while (var1.field2576 == null);
        return var1.field2576;
    }

    @ObfuscatedName("hn.z()I")
    public int method2122() {
        return 0;
    }

    @ObfuscatedName("hn.j([III)V")
    public void method2098(int[] arg0, int arg1, int arg2) {
        this.field2617.method2098(arg0, arg1, arg2);
        for (class227 var4 = (class227) this.field2616.method3986(); var4 != null; var4 = (class227) this.field2616.method3988()) {
            if (!this.field2621.method4127(var4)) {
                int var5 = arg1;
                int var6 = arg2;
                do {
                    if (var6 <= var4.field2574) {
                        this.method4284(var4, arg0, var5, var6, var5 + var6);
                        var4.field2574 -= var6;
                        break;
                    }
                    this.method4284(var4, arg0, var5, var4.field2574, var5 + var6);
                    var5 += var4.field2574;
                    var6 -= var4.field2574;
                } while (!this.field2621.method4138(var4, arg0, var5, var6));
            }
        }
    }

    @ObfuscatedName("hn.i(I)V")
    public void method2100(int arg0) {
        this.field2617.method2100(arg0);
        for (class227 var2 = (class227) this.field2616.method3986(); var2 != null; var2 = (class227) this.field2616.method3988()) {
            if (!this.field2621.method4127(var2)) {
                int var3 = arg0;
                do {
                    if (var3 <= var2.field2574) {
                        this.method4289(var2, var3);
                        var2.field2574 -= var3;
                        break;
                    }
                    this.method4289(var2, var2.field2574);
                    var3 -= var2.field2574;
                } while (!this.field2621.method4138(var2, (int[]) null, 0, var3));
            }
        }
    }

    @ObfuscatedName("hn.n(Lhq;[IIIIB)V")
    public void method4284(class227 arg0, int[] arg1, int arg2, int arg3, int arg4) {
        if ((this.field2621.field2554[arg0.field2587] & 0x4) != 0 && arg0.field2584 < 0) {
            int var6 = this.field2621.field2546[arg0.field2587] / Statics.field1374;
            while (true) {
                int var7 = (var6 + 1048575 - arg0.field2590) / var6;
                if (var7 > arg3) {
                    arg0.field2590 += arg3 * var6;
                    break;
                }
                arg0.field2576.method2098(arg1, arg2, var7);
                arg2 += var7;
                arg3 -= var7;
                arg0.field2590 += var6 * var7 - 1048576;
                int var8 = Statics.field1374 / 100;
                int var9 = 262144 / var6;
                if (var9 < var8) {
                    var8 = var9;
                }
                class111 var10 = arg0.field2576;
                if (this.field2621.field2563[arg0.field2587] == 0) {
                    arg0.field2576 = class111.method2327(arg0.field2572, var10.method2341(), var10.method2333(), var10.method2368());
                } else {
                    arg0.field2576 = class111.method2327(arg0.field2572, var10.method2341(), 0, var10.method2368());
                    this.field2621.method4111(arg0, arg0.field2586.field2608[arg0.field2575] < 0);
                    arg0.field2576.method2338(var8, var10.method2333());
                }
                if (arg0.field2586.field2608[arg0.field2575] < 0) {
                    arg0.field2576.method2378(-1);
                }
                var10.method2339(var8);
                var10.method2098(arg1, arg2, arg4 - arg2);
                if (var10.method2337()) {
                    this.field2617.method2090(var10);
                }
            }
        }
        arg0.field2576.method2098(arg1, arg2, arg3);
    }

    @ObfuscatedName("hn.h(Lhq;II)V")
    public void method4289(class227 arg0, int arg1) {
        if ((this.field2621.field2554[arg0.field2587] & 0x4) != 0 && arg0.field2584 < 0) {
            int var3 = this.field2621.field2546[arg0.field2587] / Statics.field1374;
            int var4 = (var3 + 1048575 - arg0.field2590) / var3;
            arg0.field2590 = arg0.field2590 + arg1 * var3 & 0xFFFFF;
            if (var4 <= arg1) {
                if (this.field2621.field2563[arg0.field2587] == 0) {
                    arg0.field2576 = class111.method2327(arg0.field2572, arg0.field2576.method2341(), arg0.field2576.method2333(), arg0.field2576.method2368());
                } else {
                    arg0.field2576 = class111.method2327(arg0.field2572, arg0.field2576.method2341(), 0, arg0.field2576.method2368());
                    this.field2621.method4111(arg0, arg0.field2586.field2608[arg0.field2575] < 0);
                }
                if (arg0.field2586.field2608[arg0.field2575] < 0) {
                    arg0.field2576.method2378(-1);
                }
                arg1 = arg0.field2590 / var3;
            }
        }
        arg0.field2576.method2100(arg1);
    }
}
