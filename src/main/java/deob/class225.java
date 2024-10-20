package deob;

@ObfuscatedName("hj")
public class class225 extends class108 {

    @ObfuscatedName("hj.v")
    public class221 field2580;

    @ObfuscatedName("hj.s")
    public class208 field2582 = new class208();

    @ObfuscatedName("hj.o")
    public class91 field2579 = new class91();

    public class225(class221 arg0) {
        this.field2580 = arg0;
    }

    @ObfuscatedName("hj.i()Ldm;")
    public class108 method1899() {
        class222 var1 = (class222) this.field2582.method3792();
        if (var1 == null) {
            return null;
        } else if (var1.field2551 == null) {
            return this.method1900();
        } else {
            return var1.field2551;
        }
    }

    @ObfuscatedName("hj.t()Ldm;")
    public class108 method1900() {
        class222 var1;
        do {
            var1 = (class222) this.field2582.method3800();
            if (var1 == null) {
                return null;
            }
        } while (var1.field2551 == null);
        return var1.field2551;
    }

    @ObfuscatedName("hj.c()I")
    public int method1901() {
        return 0;
    }

    @ObfuscatedName("hj.w([III)V")
    public void method1933(int[] arg0, int arg1, int arg2) {
        this.field2579.method1933(arg0, arg1, arg2);
        for (class222 var4 = (class222) this.field2582.method3792(); var4 != null; var4 = (class222) this.field2582.method3800()) {
            if (!this.field2580.method3931(var4)) {
                int var5 = arg1;
                int var6 = arg2;
                do {
                    if (var6 <= var4.field2552) {
                        this.method4079(var4, arg0, var5, var6, var5 + var6);
                        var4.field2552 -= var6;
                        break;
                    }
                    this.method4079(var4, arg0, var5, var4.field2552, var5 + var6);
                    var5 += var4.field2552;
                    var6 -= var4.field2552;
                } while (!this.field2580.method3904(var4, arg0, var5, var6));
            }
        }
    }

    @ObfuscatedName("hj.z(I)V")
    public void method1904(int arg0) {
        this.field2579.method1904(arg0);
        for (class222 var2 = (class222) this.field2582.method3792(); var2 != null; var2 = (class222) this.field2582.method3800()) {
            if (!this.field2580.method3931(var2)) {
                int var3 = arg0;
                do {
                    if (var3 <= var2.field2552) {
                        this.method4080(var2, var3);
                        var2.field2552 -= var3;
                        break;
                    }
                    this.method4080(var2, var2.field2552);
                    var3 -= var2.field2552;
                } while (!this.field2580.method3904(var2, (int[]) null, 0, var3));
            }
        }
    }

    @ObfuscatedName("hj.v(Lhe;[IIIII)V")
    public void method4079(class222 arg0, int[] arg1, int arg2, int arg3, int arg4) {
        if ((this.field2580.field2517[arg0.field2534] & 0x4) != 0 && arg0.field2547 < 0) {
            int var6 = this.field2580.field2526[arg0.field2534] / Statics.field66;
            while (true) {
                int var7 = (var6 + 1048575 - arg0.field2553) / var6;
                if (var7 > arg3) {
                    arg0.field2553 += arg3 * var6;
                    break;
                }
                arg0.field2551.method1933(arg1, arg2, var7);
                arg2 += var7;
                arg3 -= var7;
                arg0.field2553 += var6 * var7 - 1048576;
                int var8 = Statics.field66 / 100;
                int var9 = 262144 / var6;
                if (var9 < var8) {
                    var8 = var9;
                }
                class106 var10 = arg0.field2551;
                if (this.field2580.field2520[arg0.field2534] == 0) {
                    arg0.field2551 = class106.method2139(arg0.field2535, var10.method2238(), var10.method2145(), var10.method2146());
                } else {
                    arg0.field2551 = class106.method2139(arg0.field2535, var10.method2238(), 0, var10.method2146());
                    this.field2580.method3914(arg0, arg0.field2543.field2570[arg0.field2533] < 0);
                    arg0.field2551.method2150(var8, var10.method2145());
                }
                if (arg0.field2543.field2570[arg0.field2533] < 0) {
                    arg0.field2551.method2268(-1);
                }
                var10.method2253(var8);
                var10.method1933(arg1, arg2, arg4 - arg2);
                if (var10.method2155()) {
                    this.field2579.method1894(var10);
                }
            }
        }
        arg0.field2551.method1933(arg1, arg2, arg3);
    }

    @ObfuscatedName("hj.s(Lhe;II)V")
    public void method4080(class222 arg0, int arg1) {
        if ((this.field2580.field2517[arg0.field2534] & 0x4) != 0 && arg0.field2547 < 0) {
            int var3 = this.field2580.field2526[arg0.field2534] / Statics.field66;
            int var4 = (var3 + 1048575 - arg0.field2553) / var3;
            arg0.field2553 = arg0.field2553 + arg1 * var3 & 0xFFFFF;
            if (var4 <= arg1) {
                if (this.field2580.field2520[arg0.field2534] == 0) {
                    arg0.field2551 = class106.method2139(arg0.field2535, arg0.field2551.method2238(), arg0.field2551.method2145(), arg0.field2551.method2146());
                } else {
                    arg0.field2551 = class106.method2139(arg0.field2535, arg0.field2551.method2238(), 0, arg0.field2551.method2146());
                    this.field2580.method3914(arg0, arg0.field2543.field2570[arg0.field2533] < 0);
                }
                if (arg0.field2543.field2570[arg0.field2533] < 0) {
                    arg0.field2551.method2268(-1);
                }
                arg1 = arg0.field2553 / var3;
            }
        }
        arg0.field2551.method1904(arg1);
    }
}
