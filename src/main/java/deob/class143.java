package deob;

@ObfuscatedName("ev")
public class class143 extends class48 {

    @ObfuscatedName("ev.i")
    public class141 field2405;

    @ObfuscatedName("ev.f")
    public class177 field2404 = new class177();

    @ObfuscatedName("ev.e")
    public class46 field2408 = new class46();

    public class143(class141 arg0) {
        this.field2405 = arg0;
    }

    @ObfuscatedName("ev.h()Lar;")
    public class48 method974() {
        class145 var1 = (class145) this.field2404.method3294();
        if (var1 == null) {
            return null;
        } else if (var1.field2423 == null) {
            return this.method975();
        } else {
            return var1.field2423;
        }
    }

    @ObfuscatedName("ev.b()Lar;")
    public class48 method975() {
        class145 var1;
        do {
            var1 = (class145) this.field2404.method3296();
            if (var1 == null) {
                return null;
            }
        } while (var1.field2423 == null);
        return var1.field2423;
    }

    @ObfuscatedName("ev.y()I")
    public int method976() {
        return 0;
    }

    @ObfuscatedName("ev.x([III)V")
    public void method1005(int[] arg0, int arg1, int arg2) {
        this.field2408.method1005(arg0, arg1, arg2);
        for (class145 var4 = (class145) this.field2404.method3294(); var4 != null; var4 = (class145) this.field2404.method3296()) {
            if (!this.field2405.method2745(var4)) {
                int var5 = arg1;
                int var6 = arg2;
                do {
                    if (var6 <= var4.field2442) {
                        this.method2826(var4, arg0, var5, var6, var5 + var6);
                        var4.field2442 -= var6;
                        break;
                    }
                    this.method2826(var4, arg0, var5, var4.field2442, var5 + var6);
                    var5 += var4.field2442;
                    var6 -= var4.field2442;
                } while (!this.field2405.method2746(var4, arg0, var5, var6));
            }
        }
    }

    @ObfuscatedName("ev.ao(I)V")
    public void method988(int arg0) {
        this.field2408.method988(arg0);
        for (class145 var2 = (class145) this.field2404.method3294(); var2 != null; var2 = (class145) this.field2404.method3296()) {
            if (!this.field2405.method2745(var2)) {
                int var3 = arg0;
                do {
                    if (var3 <= var2.field2442) {
                        this.method2827(var2, var3);
                        var2.field2442 -= var3;
                        break;
                    }
                    this.method2827(var2, var2.field2442);
                    var3 -= var2.field2442;
                } while (!this.field2405.method2746(var2, (int[]) null, 0, var3));
            }
        }
    }

    @ObfuscatedName("ev.i(Ler;[IIIIB)V")
    public void method2826(class145 arg0, int[] arg1, int arg2, int arg3, int arg4) {
        if ((this.field2405.field2385[arg0.field2427] & 0x4) != 0 && arg0.field2444 < 0) {
            int var6 = this.field2405.field2382[arg0.field2427] / Statics.field1100;
            while (true) {
                int var7 = (var6 + 1048575 - arg0.field2443) / var6;
                if (var7 > arg3) {
                    arg0.field2443 += arg3 * var6;
                    break;
                }
                arg0.field2423.method1005(arg1, arg2, var7);
                arg2 += var7;
                arg3 -= var7;
                arg0.field2443 += var6 * var7 - 1048576;
                int var8 = Statics.field1100 / 100;
                int var9 = 262144 / var6;
                if (var9 < var8) {
                    var8 = var9;
                }
                class45 var10 = arg0.field2423;
                if (this.field2405.field2380[arg0.field2427] == 0) {
                    arg0.field2423 = class45.method956(arg0.field2425, var10.method971(), var10.method1020(), var10.method963());
                } else {
                    arg0.field2423 = class45.method956(arg0.field2425, var10.method971(), 0, var10.method963());
                    this.field2405.method2727(arg0, arg0.field2434.field2353[arg0.field2428] < 0);
                    arg0.field2423.method967(var8, var10.method1020());
                }
                if (arg0.field2434.field2353[arg0.field2428] < 0) {
                    arg0.field2423.method1032(-1);
                }
                var10.method969(var8);
                var10.method1005(arg1, arg2, arg4 - arg2);
                if (var10.method973()) {
                    this.field2408.method1102(var10);
                }
            }
        }
        arg0.field2423.method1005(arg1, arg2, arg3);
    }

    @ObfuscatedName("ev.w(Ler;IS)V")
    public void method2827(class145 arg0, int arg1) {
        if ((this.field2405.field2385[arg0.field2427] & 0x4) != 0 && arg0.field2444 < 0) {
            int var3 = this.field2405.field2382[arg0.field2427] / Statics.field1100;
            int var4 = (var3 + 1048575 - arg0.field2443) / var3;
            arg0.field2443 = arg0.field2443 + arg1 * var3 & 0xFFFFF;
            if (var4 <= arg1) {
                if (this.field2405.field2380[arg0.field2427] == 0) {
                    arg0.field2423 = class45.method956(arg0.field2425, arg0.field2423.method971(), arg0.field2423.method1020(), arg0.field2423.method963());
                } else {
                    arg0.field2423 = class45.method956(arg0.field2425, arg0.field2423.method971(), 0, arg0.field2423.method963());
                    this.field2405.method2727(arg0, arg0.field2434.field2353[arg0.field2428] < 0);
                }
                if (arg0.field2434.field2353[arg0.field2428] < 0) {
                    arg0.field2423.method1032(-1);
                }
                arg1 = arg0.field2443 / var3;
            }
        }
        arg0.field2423.method988(arg1);
    }
}
