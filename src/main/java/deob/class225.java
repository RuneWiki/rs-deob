package deob;

@ObfuscatedName("hs")
public class class225 extends class108 {

    @ObfuscatedName("hs.y")
    public class221 field2587;

    @ObfuscatedName("hs.c")
    public class208 field2588 = new class208();

    @ObfuscatedName("hs.n")
    public class91 field2590 = new class91();

    public class225(class221 arg0) {
        this.field2587 = arg0;
    }

    @ObfuscatedName("hs.p()Ldt;")
    public class108 method1928() {
        class222 var1 = (class222) this.field2588.method3799();
        if (var1 == null) {
            return null;
        } else if (var1.field2560 == null) {
            return this.method1929();
        } else {
            return var1.field2560;
        }
    }

    @ObfuscatedName("hs.e()Ldt;")
    public class108 method1929() {
        class222 var1;
        do {
            var1 = (class222) this.field2588.method3780();
            if (var1 == null) {
                return null;
            }
        } while (var1.field2560 == null);
        return var1.field2560;
    }

    @ObfuscatedName("hs.s()I")
    public int method1936() {
        return 0;
    }

    @ObfuscatedName("hs.v([III)V")
    public void method1931(int[] arg0, int arg1, int arg2) {
        this.field2590.method1931(arg0, arg1, arg2);
        for (class222 var4 = (class222) this.field2588.method3799(); var4 != null; var4 = (class222) this.field2588.method3780()) {
            if (!this.field2587.method3912(var4)) {
                int var5 = arg1;
                int var6 = arg2;
                do {
                    if (var6 <= var4.field2561) {
                        this.method4048(var4, arg0, var5, var6, var5 + var6);
                        var4.field2561 -= var6;
                        break;
                    }
                    this.method4048(var4, arg0, var5, var4.field2561, var5 + var6);
                    var5 += var4.field2561;
                    var6 -= var4.field2561;
                } while (!this.field2587.method3913(var4, arg0, var5, var6));
            }
        }
    }

    @ObfuscatedName("hs.o(I)V")
    public void method1958(int arg0) {
        this.field2590.method1958(arg0);
        for (class222 var2 = (class222) this.field2588.method3799(); var2 != null; var2 = (class222) this.field2588.method3780()) {
            if (!this.field2587.method3912(var2)) {
                int var3 = arg0;
                do {
                    if (var3 <= var2.field2561) {
                        this.method4041(var2, var3);
                        var2.field2561 -= var3;
                        break;
                    }
                    this.method4041(var2, var2.field2561);
                    var3 -= var2.field2561;
                } while (!this.field2587.method3913(var2, (int[]) null, 0, var3));
            }
        }
    }

    @ObfuscatedName("hs.y(Lhu;[IIIII)V")
    public void method4048(class222 arg0, int[] arg1, int arg2, int arg3, int arg4) {
        if ((this.field2587.field2527[arg0.field2545] & 0x4) != 0 && arg0.field2549 < 0) {
            int var6 = this.field2587.field2532[arg0.field2545] / Statics.field56;
            while (true) {
                int var7 = (var6 + 1048575 - arg0.field2550) / var6;
                if (var7 > arg3) {
                    arg0.field2550 += arg3 * var6;
                    break;
                }
                arg0.field2560.method1931(arg1, arg2, var7);
                arg2 += var7;
                arg3 -= var7;
                arg0.field2550 += var6 * var7 - 1048576;
                int var8 = Statics.field56 / 100;
                int var9 = 262144 / var6;
                if (var9 < var8) {
                    var8 = var9;
                }
                class106 var10 = arg0.field2560;
                if (this.field2587.field2530[arg0.field2545] == 0) {
                    arg0.field2560 = class106.method2127(arg0.field2544, var10.method2142(), var10.method2133(), var10.method2161());
                } else {
                    arg0.field2560 = class106.method2127(arg0.field2544, var10.method2142(), 0, var10.method2161());
                    this.field2587.method3887(arg0, arg0.field2543.field2580[arg0.field2547] < 0);
                    arg0.field2560.method2138(var8, var10.method2133());
                }
                if (arg0.field2543.field2580[arg0.field2547] < 0) {
                    arg0.field2560.method2129(-1);
                }
                var10.method2140(var8);
                var10.method1931(arg1, arg2, arg4 - arg2);
                if (var10.method2172()) {
                    this.field2590.method1923(var10);
                }
            }
        }
        arg0.field2560.method1931(arg1, arg2, arg3);
    }

    @ObfuscatedName("hs.c(Lhu;II)V")
    public void method4041(class222 arg0, int arg1) {
        if ((this.field2587.field2527[arg0.field2545] & 0x4) != 0 && arg0.field2549 < 0) {
            int var3 = this.field2587.field2532[arg0.field2545] / Statics.field56;
            int var4 = (var3 + 1048575 - arg0.field2550) / var3;
            arg0.field2550 = arg0.field2550 + arg1 * var3 & 0xFFFFF;
            if (var4 <= arg1) {
                if (this.field2587.field2530[arg0.field2545] == 0) {
                    arg0.field2560 = class106.method2127(arg0.field2544, arg0.field2560.method2142(), arg0.field2560.method2133(), arg0.field2560.method2161());
                } else {
                    arg0.field2560 = class106.method2127(arg0.field2544, arg0.field2560.method2142(), 0, arg0.field2560.method2161());
                    this.field2587.method3887(arg0, arg0.field2543.field2580[arg0.field2547] < 0);
                }
                if (arg0.field2543.field2580[arg0.field2547] < 0) {
                    arg0.field2560.method2129(-1);
                }
                arg1 = arg0.field2550 / var3;
            }
        }
        arg0.field2560.method1958(arg1);
    }
}
