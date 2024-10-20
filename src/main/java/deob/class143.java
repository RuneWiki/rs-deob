package deob;

@ObfuscatedName("ey")
public class class143 extends class48 {

    @ObfuscatedName("ey.i")
    public class141 field2405;

    @ObfuscatedName("ey.p")
    public class177 field2406 = new class177();

    @ObfuscatedName("ey.a")
    public class46 field2409 = new class46();

    public class143(class141 arg0) {
        this.field2405 = arg0;
    }

    @ObfuscatedName("ey.w()Lay;")
    public class48 method940() {
        class145 var1 = (class145) this.field2406.method3313();
        if (var1 == null) {
            return null;
        } else if (var1.field2428 == null) {
            return this.method941();
        } else {
            return var1.field2428;
        }
    }

    @ObfuscatedName("ey.x()Lay;")
    public class48 method941() {
        class145 var1;
        do {
            var1 = (class145) this.field2406.method3292();
            if (var1 == null) {
                return null;
            }
        } while (var1.field2428 == null);
        return var1.field2428;
    }

    @ObfuscatedName("ey.n()I")
    public int method1019() {
        return 0;
    }

    @ObfuscatedName("ey.c([III)V")
    public void method943(int[] arg0, int arg1, int arg2) {
        this.field2409.method943(arg0, arg1, arg2);
        for (class145 var4 = (class145) this.field2406.method3313(); var4 != null; var4 = (class145) this.field2406.method3292()) {
            if (!this.field2405.method2758(var4)) {
                int var5 = arg1;
                int var6 = arg2;
                do {
                    if (var6 <= var4.field2444) {
                        this.method2814(var4, arg0, var5, var6, var5 + var6);
                        var4.field2444 -= var6;
                        break;
                    }
                    this.method2814(var4, arg0, var5, var4.field2444, var5 + var6);
                    var5 += var4.field2444;
                    var6 -= var4.field2444;
                } while (!this.field2405.method2734(var4, arg0, var5, var6));
            }
        }
    }

    @ObfuscatedName("ey.az(I)V")
    public void method1018(int arg0) {
        this.field2409.method1018(arg0);
        for (class145 var2 = (class145) this.field2406.method3313(); var2 != null; var2 = (class145) this.field2406.method3292()) {
            if (!this.field2405.method2758(var2)) {
                int var3 = arg0;
                do {
                    if (var3 <= var2.field2444) {
                        this.method2815(var2, var3);
                        var2.field2444 -= var3;
                        break;
                    }
                    this.method2815(var2, var2.field2444);
                    var3 -= var2.field2444;
                } while (!this.field2405.method2734(var2, (int[]) null, 0, var3));
            }
        }
    }

    @ObfuscatedName("ey.i(Leo;[IIIII)V")
    public void method2814(class145 arg0, int[] arg1, int arg2, int arg3, int arg4) {
        if ((this.field2405.field2381[arg0.field2442] & 0x4) != 0 && arg0.field2439 < 0) {
            int var6 = this.field2405.field2382[arg0.field2442] / Statics.field763;
            while (true) {
                int var7 = (var6 + 1048575 - arg0.field2445) / var6;
                if (var7 > arg3) {
                    arg0.field2445 += arg3 * var6;
                    break;
                }
                arg0.field2428.method943(arg1, arg2, var7);
                arg2 += var7;
                arg3 -= var7;
                arg0.field2445 += var6 * var7 - 1048576;
                int var8 = Statics.field763 / 100;
                int var9 = 262144 / var6;
                if (var9 < var8) {
                    var8 = var9;
                }
                class45 var10 = arg0.field2428;
                if (this.field2405.field2365[arg0.field2442] == 0) {
                    arg0.field2428 = class45.method922(arg0.field2427, var10.method937(), var10.method928(), var10.method929());
                } else {
                    arg0.field2428 = class45.method922(arg0.field2427, var10.method937(), 0, var10.method929());
                    this.field2405.method2716(arg0, arg0.field2440.field2356[arg0.field2430] < 0);
                    arg0.field2428.method984(var8, var10.method928());
                }
                if (arg0.field2440.field2356[arg0.field2430] < 0) {
                    arg0.field2428.method1040(-1);
                }
                var10.method936(var8);
                var10.method943(arg1, arg2, arg4 - arg2);
                if (var10.method939()) {
                    this.field2409.method1057(var10);
                }
            }
        }
        arg0.field2428.method943(arg1, arg2, arg3);
    }

    @ObfuscatedName("ey.p(Leo;II)V")
    public void method2815(class145 arg0, int arg1) {
        if ((this.field2405.field2381[arg0.field2442] & 0x4) != 0 && arg0.field2439 < 0) {
            int var3 = this.field2405.field2382[arg0.field2442] / Statics.field763;
            int var4 = (var3 + 1048575 - arg0.field2445) / var3;
            arg0.field2445 = arg0.field2445 + arg1 * var3 & 0xFFFFF;
            if (var4 <= arg1) {
                if (this.field2405.field2365[arg0.field2442] == 0) {
                    arg0.field2428 = class45.method922(arg0.field2427, arg0.field2428.method937(), arg0.field2428.method928(), arg0.field2428.method929());
                } else {
                    arg0.field2428 = class45.method922(arg0.field2427, arg0.field2428.method937(), 0, arg0.field2428.method929());
                    this.field2405.method2716(arg0, arg0.field2440.field2356[arg0.field2430] < 0);
                }
                if (arg0.field2440.field2356[arg0.field2430] < 0) {
                    arg0.field2428.method1040(-1);
                }
                arg1 = arg0.field2445 / var3;
            }
        }
        arg0.field2428.method1018(arg1);
    }
}
