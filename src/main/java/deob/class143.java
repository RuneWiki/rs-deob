package deob;

@ObfuscatedName("es")
public class class143 extends class48 {

    @ObfuscatedName("es.a")
    public class141 field2395;

    @ObfuscatedName("es.x")
    public class177 field2396 = new class177();

    @ObfuscatedName("es.e")
    public class46 field2392 = new class46();

    public class143(class141 arg0) {
        this.field2395 = arg0;
    }

    @ObfuscatedName("es.m()Law;")
    public class48 method972() {
        class145 var1 = (class145) this.field2396.method3252();
        if (var1 == null) {
            return null;
        } else if (var1.field2424 == null) {
            return this.method1041();
        } else {
            return var1.field2424;
        }
    }

    @ObfuscatedName("es.k()Law;")
    public class48 method1041() {
        class145 var1;
        do {
            var1 = (class145) this.field2396.method3268();
            if (var1 == null) {
                return null;
            }
        } while (var1.field2424 == null);
        return var1.field2424;
    }

    @ObfuscatedName("es.u()I")
    public int method974() {
        return 0;
    }

    @ObfuscatedName("es.i([III)V")
    public void method992(int[] arg0, int arg1, int arg2) {
        this.field2392.method992(arg0, arg1, arg2);
        for (class145 var4 = (class145) this.field2396.method3252(); var4 != null; var4 = (class145) this.field2396.method3268()) {
            if (!this.field2395.method2734(var4)) {
                int var5 = arg1;
                int var6 = arg2;
                do {
                    if (var6 <= var4.field2413) {
                        this.method2808(var4, arg0, var5, var6, var5 + var6);
                        var4.field2413 -= var6;
                        break;
                    }
                    this.method2808(var4, arg0, var5, var4.field2413, var5 + var6);
                    var5 += var4.field2413;
                    var6 -= var4.field2413;
                } while (!this.field2395.method2792(var4, arg0, var5, var6));
            }
        }
    }

    @ObfuscatedName("es.ah(I)V")
    public void method976(int arg0) {
        this.field2392.method976(arg0);
        for (class145 var2 = (class145) this.field2396.method3252(); var2 != null; var2 = (class145) this.field2396.method3268()) {
            if (!this.field2395.method2734(var2)) {
                int var3 = arg0;
                do {
                    if (var3 <= var2.field2413) {
                        this.method2809(var2, var3);
                        var2.field2413 -= var3;
                        break;
                    }
                    this.method2809(var2, var2.field2413);
                    var3 -= var2.field2413;
                } while (!this.field2395.method2792(var2, (int[]) null, 0, var3));
            }
        }
    }

    @ObfuscatedName("es.a(Lea;[IIIII)V")
    public void method2808(class145 arg0, int[] arg1, int arg2, int arg3, int arg4) {
        if ((this.field2395.field2359[arg0.field2423] & 0x4) != 0 && arg0.field2426 < 0) {
            int var6 = this.field2395.field2366[arg0.field2423] / Statics.field1989;
            while (true) {
                int var7 = (var6 + 1048575 - arg0.field2430) / var6;
                if (var7 > arg3) {
                    arg0.field2430 += arg3 * var6;
                    break;
                }
                arg0.field2424.method992(arg1, arg2, var7);
                arg2 += var7;
                arg3 -= var7;
                arg0.field2430 += var6 * var7 - 1048576;
                int var8 = Statics.field1989 / 100;
                int var9 = 262144 / var6;
                if (var9 < var8) {
                    var8 = var9;
                }
                class45 var10 = arg0.field2424;
                if (this.field2395.field2361[arg0.field2423] == 0) {
                    arg0.field2424 = class45.method1044(arg0.field2414, var10.method1086(), var10.method960(), var10.method961());
                } else {
                    arg0.field2424 = class45.method1044(arg0.field2414, var10.method1086(), 0, var10.method961());
                    this.field2395.method2717(arg0, arg0.field2421.field2338[arg0.field2417] < 0);
                    arg0.field2424.method1048(var8, var10.method960());
                }
                if (arg0.field2421.field2338[arg0.field2417] < 0) {
                    arg0.field2424.method956(-1);
                }
                var10.method967(var8);
                var10.method992(arg1, arg2, arg4 - arg2);
                if (var10.method971()) {
                    this.field2392.method1094(var10);
                }
            }
        }
        arg0.field2424.method992(arg1, arg2, arg3);
    }

    @ObfuscatedName("es.x(Lea;II)V")
    public void method2809(class145 arg0, int arg1) {
        if ((this.field2395.field2359[arg0.field2423] & 0x4) != 0 && arg0.field2426 < 0) {
            int var3 = this.field2395.field2366[arg0.field2423] / Statics.field1989;
            int var4 = (var3 + 1048575 - arg0.field2430) / var3;
            arg0.field2430 = arg0.field2430 + arg1 * var3 & 0xFFFFF;
            if (var4 <= arg1) {
                if (this.field2395.field2361[arg0.field2423] == 0) {
                    arg0.field2424 = class45.method1044(arg0.field2414, arg0.field2424.method1086(), arg0.field2424.method960(), arg0.field2424.method961());
                } else {
                    arg0.field2424 = class45.method1044(arg0.field2414, arg0.field2424.method1086(), 0, arg0.field2424.method961());
                    this.field2395.method2717(arg0, arg0.field2421.field2338[arg0.field2417] < 0);
                }
                if (arg0.field2421.field2338[arg0.field2417] < 0) {
                    arg0.field2424.method956(-1);
                }
                arg1 = arg0.field2430 / var3;
            }
        }
        arg0.field2424.method976(arg1);
    }
}
