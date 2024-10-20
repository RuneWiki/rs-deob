package deob;

@ObfuscatedName("ez")
public class class143 extends class48 {

    @ObfuscatedName("ez.t")
    public class141 field2419;

    @ObfuscatedName("ez.l")
    public class177 field2418 = new class177();

    @ObfuscatedName("ez.c")
    public class46 field2417 = new class46();

    public class143(class141 arg0) {
        this.field2419 = arg0;
    }

    @ObfuscatedName("ez.a()Lai;")
    public class48 method1033() {
        class145 var1 = (class145) this.field2418.method3345();
        if (var1 == null) {
            return null;
        } else if (var1.field2450 == null) {
            return this.method1005();
        } else {
            return var1.field2450;
        }
    }

    @ObfuscatedName("ez.n()Lai;")
    public class48 method1005() {
        class145 var1;
        do {
            var1 = (class145) this.field2418.method3324();
            if (var1 == null) {
                return null;
            }
        } while (var1.field2450 == null);
        return var1.field2450;
    }

    @ObfuscatedName("ez.v()I")
    public int method999() {
        return 0;
    }

    @ObfuscatedName("ez.e([III)V")
    public void method1000(int[] arg0, int arg1, int arg2) {
        this.field2417.method1000(arg0, arg1, arg2);
        for (class145 var4 = (class145) this.field2418.method3345(); var4 != null; var4 = (class145) this.field2418.method3324()) {
            if (!this.field2419.method2743(var4)) {
                int var5 = arg1;
                int var6 = arg2;
                do {
                    if (var6 <= var4.field2455) {
                        this.method2836(var4, arg0, var5, var6, var5 + var6);
                        var4.field2455 -= var6;
                        break;
                    }
                    this.method2836(var4, arg0, var5, var4.field2455, var5 + var6);
                    var5 += var4.field2455;
                    var6 -= var4.field2455;
                } while (!this.field2419.method2821(var4, arg0, var5, var6));
            }
        }
    }

    @ObfuscatedName("ez.ar(I)V")
    public void method1031(int arg0) {
        this.field2417.method1031(arg0);
        for (class145 var2 = (class145) this.field2418.method3345(); var2 != null; var2 = (class145) this.field2418.method3324()) {
            if (!this.field2419.method2743(var2)) {
                int var3 = arg0;
                do {
                    if (var3 <= var2.field2455) {
                        this.method2837(var2, var3);
                        var2.field2455 -= var3;
                        break;
                    }
                    this.method2837(var2, var2.field2455);
                    var3 -= var2.field2455;
                } while (!this.field2419.method2821(var2, (int[]) null, 0, var3));
            }
        }
    }

    @ObfuscatedName("ez.t(Lep;[IIIIB)V")
    public void method2836(class145 arg0, int[] arg1, int arg2, int arg3, int arg4) {
        if ((this.field2419.field2385[arg0.field2440] & 0x4) != 0 && arg0.field2458 < 0) {
            int var6 = this.field2419.field2396[arg0.field2440] / Statics.field2051;
            while (true) {
                int var7 = (var6 + 1048575 - arg0.field2456) / var6;
                if (var7 > arg3) {
                    arg0.field2456 += arg3 * var6;
                    break;
                }
                arg0.field2450.method1000(arg1, arg2, var7);
                arg2 += var7;
                arg3 -= var7;
                arg0.field2456 += var6 * var7 - 1048576;
                int var8 = Statics.field2051 / 100;
                int var9 = 262144 / var6;
                if (var9 < var8) {
                    var8 = var9;
                }
                class45 var10 = arg0.field2450;
                if (this.field2419.field2394[arg0.field2440] == 0) {
                    arg0.field2450 = class45.method979(arg0.field2438, var10.method1002(), var10.method985(), var10.method1013());
                } else {
                    arg0.field2450 = class45.method979(arg0.field2438, var10.method1002(), 0, var10.method1013());
                    this.field2419.method2739(arg0, arg0.field2437.field2372[arg0.field2448] < 0);
                    arg0.field2450.method990(var8, var10.method985());
                }
                if (arg0.field2437.field2372[arg0.field2448] < 0) {
                    arg0.field2450.method981(-1);
                }
                var10.method992(var8);
                var10.method1000(arg1, arg2, arg4 - arg2);
                if (var10.method1044()) {
                    this.field2417.method1123(var10);
                }
            }
        }
        arg0.field2450.method1000(arg1, arg2, arg3);
    }

    @ObfuscatedName("ez.l(Lep;II)V")
    public void method2837(class145 arg0, int arg1) {
        if ((this.field2419.field2385[arg0.field2440] & 0x4) != 0 && arg0.field2458 < 0) {
            int var3 = this.field2419.field2396[arg0.field2440] / Statics.field2051;
            int var4 = (var3 + 1048575 - arg0.field2456) / var3;
            arg0.field2456 = arg0.field2456 + arg1 * var3 & 0xFFFFF;
            if (var4 <= arg1) {
                if (this.field2419.field2394[arg0.field2440] == 0) {
                    arg0.field2450 = class45.method979(arg0.field2438, arg0.field2450.method1002(), arg0.field2450.method985(), arg0.field2450.method1013());
                } else {
                    arg0.field2450 = class45.method979(arg0.field2438, arg0.field2450.method1002(), 0, arg0.field2450.method1013());
                    this.field2419.method2739(arg0, arg0.field2437.field2372[arg0.field2448] < 0);
                }
                if (arg0.field2437.field2372[arg0.field2448] < 0) {
                    arg0.field2450.method981(-1);
                }
                arg1 = arg0.field2456 / var3;
            }
        }
        arg0.field2450.method1031(arg1);
    }
}
