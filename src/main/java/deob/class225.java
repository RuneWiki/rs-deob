package deob;

@ObfuscatedName("hs")
public class class225 extends class108 {

    @ObfuscatedName("hs.f")
    public class221 field2601;

    @ObfuscatedName("hs.h")
    public class208 field2600 = new class208();

    @ObfuscatedName("hs.e")
    public class91 field2603 = new class91();

    public class225(class221 arg0) {
        this.field2601 = arg0;
    }

    @ObfuscatedName("hs.w()Lde;")
    public class108 method1914() {
        class222 var1 = (class222) this.field2600.method3823();
        if (var1 == null) {
            return null;
        } else if (var1.field2555 == null) {
            return this.method1915();
        } else {
            return var1.field2555;
        }
    }

    @ObfuscatedName("hs.d()Lde;")
    public class108 method1915() {
        class222 var1;
        do {
            var1 = (class222) this.field2600.method3822();
            if (var1 == null) {
                return null;
            }
        } while (var1.field2555 == null);
        return var1.field2555;
    }

    @ObfuscatedName("hs.n()I")
    public int method1908() {
        return 0;
    }

    @ObfuscatedName("hs.s([III)V")
    public void method1917(int[] arg0, int arg1, int arg2) {
        this.field2603.method1917(arg0, arg1, arg2);
        for (class222 var4 = (class222) this.field2600.method3823(); var4 != null; var4 = (class222) this.field2600.method3822()) {
            if (!this.field2601.method4009(var4)) {
                int var5 = arg1;
                int var6 = arg2;
                do {
                    if (var6 <= var4.field2573) {
                        this.method4077(var4, arg0, var5, var6, var5 + var6);
                        var4.field2573 -= var6;
                        break;
                    }
                    this.method4077(var4, arg0, var5, var4.field2573, var5 + var6);
                    var5 += var4.field2573;
                    var6 -= var4.field2573;
                } while (!this.field2601.method3989(var4, arg0, var5, var6));
            }
        }
    }

    @ObfuscatedName("hs.k(I)V")
    public void method1919(int arg0) {
        this.field2603.method1919(arg0);
        for (class222 var2 = (class222) this.field2600.method3823(); var2 != null; var2 = (class222) this.field2600.method3822()) {
            if (!this.field2601.method4009(var2)) {
                int var3 = arg0;
                do {
                    if (var3 <= var2.field2573) {
                        this.method4076(var2, var3);
                        var2.field2573 -= var3;
                        break;
                    }
                    this.method4076(var2, var2.field2573);
                    var3 -= var2.field2573;
                } while (!this.field2601.method3989(var2, (int[]) null, 0, var3));
            }
        }
    }

    @ObfuscatedName("hs.f(Lhe;[IIIIB)V")
    public void method4077(class222 arg0, int[] arg1, int arg2, int arg3, int arg4) {
        if ((this.field2601.field2539[arg0.field2554] & 0x4) != 0 && arg0.field2568 < 0) {
            int var6 = this.field2601.field2544[arg0.field2554] / Statics.field3801;
            while (true) {
                int var7 = (var6 + 1048575 - arg0.field2575) / var6;
                if (var7 > arg3) {
                    arg0.field2575 += arg3 * var6;
                    break;
                }
                arg0.field2555.method1917(arg1, arg2, var7);
                arg2 += var7;
                arg3 -= var7;
                arg0.field2575 += var6 * var7 - 1048576;
                int var8 = Statics.field3801 / 100;
                int var9 = 262144 / var6;
                if (var9 < var8) {
                    var8 = var9;
                }
                class106 var10 = arg0.field2555;
                if (this.field2601.field2542[arg0.field2554] == 0) {
                    arg0.field2555 = class106.method2135(arg0.field2565, var10.method2149(), var10.method2140(), var10.method2141());
                } else {
                    arg0.field2555 = class106.method2135(arg0.field2565, var10.method2149(), 0, var10.method2141());
                    this.field2601.method3921(arg0, arg0.field2572.field2591[arg0.field2571] < 0);
                    arg0.field2555.method2145(var8, var10.method2140());
                }
                if (arg0.field2572.field2591[arg0.field2571] < 0) {
                    arg0.field2555.method2252(-1);
                }
                var10.method2216(var8);
                var10.method1917(arg1, arg2, arg4 - arg2);
                if (var10.method2151()) {
                    this.field2603.method1916(var10);
                }
            }
        }
        arg0.field2555.method1917(arg1, arg2, arg3);
    }

    @ObfuscatedName("hs.h(Lhe;II)V")
    public void method4076(class222 arg0, int arg1) {
        if ((this.field2601.field2539[arg0.field2554] & 0x4) != 0 && arg0.field2568 < 0) {
            int var3 = this.field2601.field2544[arg0.field2554] / Statics.field3801;
            int var4 = (var3 + 1048575 - arg0.field2575) / var3;
            arg0.field2575 = arg0.field2575 + arg1 * var3 & 0xFFFFF;
            if (var4 <= arg1) {
                if (this.field2601.field2542[arg0.field2554] == 0) {
                    arg0.field2555 = class106.method2135(arg0.field2565, arg0.field2555.method2149(), arg0.field2555.method2140(), arg0.field2555.method2141());
                } else {
                    arg0.field2555 = class106.method2135(arg0.field2565, arg0.field2555.method2149(), 0, arg0.field2555.method2141());
                    this.field2601.method3921(arg0, arg0.field2572.field2591[arg0.field2571] < 0);
                }
                if (arg0.field2572.field2591[arg0.field2571] < 0) {
                    arg0.field2555.method2252(-1);
                }
                arg1 = arg0.field2575 / var3;
            }
        }
        arg0.field2555.method1919(arg1);
    }
}
