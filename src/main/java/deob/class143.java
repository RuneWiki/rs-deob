package deob;

@ObfuscatedName("eb")
public class class143 extends class48 {

    @ObfuscatedName("eb.y")
    public class141 field2394;

    @ObfuscatedName("eb.m")
    public class177 field2395 = new class177();

    @ObfuscatedName("eb.d")
    public class46 field2397 = new class46();

    public class143(class141 arg0) {
        this.field2394 = arg0;
    }

    @ObfuscatedName("eb.h()Lad;")
    public class48 method977() {
        class145 var1 = (class145) this.field2395.method3355();
        if (var1 == null) {
            return null;
        } else if (var1.field2430 == null) {
            return this.method978();
        } else {
            return var1.field2430;
        }
    }

    @ObfuscatedName("eb.q()Lad;")
    public class48 method978() {
        class145 var1;
        do {
            var1 = (class145) this.field2395.method3357();
            if (var1 == null) {
                return null;
            }
        } while (var1.field2430 == null);
        return var1.field2430;
    }

    @ObfuscatedName("eb.g()I")
    public int method984() {
        return 0;
    }

    @ObfuscatedName("eb.e([III)V")
    public void method1066(int[] arg0, int arg1, int arg2) {
        this.field2397.method1066(arg0, arg1, arg2);
        for (class145 var4 = (class145) this.field2395.method3355(); var4 != null; var4 = (class145) this.field2395.method3357()) {
            if (!this.field2394.method2771(var4)) {
                int var5 = arg1;
                int var6 = arg2;
                do {
                    if (var6 <= var4.field2431) {
                        this.method2852(var4, arg0, var5, var6, var5 + var6);
                        var4.field2431 -= var6;
                        break;
                    }
                    this.method2852(var4, arg0, var5, var4.field2431, var5 + var6);
                    var5 += var4.field2431;
                    var6 -= var4.field2431;
                } while (!this.field2394.method2818(var4, arg0, var5, var6));
            }
        }
    }

    @ObfuscatedName("eb.as(I)V")
    public void method981(int arg0) {
        this.field2397.method981(arg0);
        for (class145 var2 = (class145) this.field2395.method3355(); var2 != null; var2 = (class145) this.field2395.method3357()) {
            if (!this.field2394.method2771(var2)) {
                int var3 = arg0;
                do {
                    if (var3 <= var2.field2431) {
                        this.method2851(var2, var3);
                        var2.field2431 -= var3;
                        break;
                    }
                    this.method2851(var2, var2.field2431);
                    var3 -= var2.field2431;
                } while (!this.field2394.method2818(var2, (int[]) null, 0, var3));
            }
        }
    }

    @ObfuscatedName("eb.y(Ler;[IIIII)V")
    public void method2852(class145 arg0, int[] arg1, int arg2, int arg3, int arg4) {
        if ((this.field2394.field2365[arg0.field2419] & 0x4) != 0 && arg0.field2426 < 0) {
            int var6 = this.field2394.field2369[arg0.field2419] / Statics.field1094;
            while (true) {
                int var7 = (var6 + 1048575 - arg0.field2432) / var6;
                if (var7 > arg3) {
                    arg0.field2432 += arg3 * var6;
                    break;
                }
                arg0.field2430.method1066(arg1, arg2, var7);
                arg2 += var7;
                arg3 -= var7;
                arg0.field2432 += var6 * var7 - 1048576;
                int var8 = Statics.field1094 / 100;
                int var9 = 262144 / var6;
                if (var9 < var8) {
                    var8 = var9;
                }
                class45 var10 = arg0.field2430;
                if (this.field2394.field2351[arg0.field2419] == 0) {
                    arg0.field2430 = class45.method959(arg0.field2414, var10.method974(), var10.method1073(), var10.method966());
                } else {
                    arg0.field2430 = class45.method959(arg0.field2414, var10.method974(), 0, var10.method966());
                    this.field2394.method2848(arg0, arg0.field2412.field2342[arg0.field2417] < 0);
                    arg0.field2430.method970(var8, var10.method1073());
                }
                if (arg0.field2412.field2342[arg0.field2417] < 0) {
                    arg0.field2430.method961(-1);
                }
                var10.method972(var8);
                var10.method1066(arg1, arg2, arg4 - arg2);
                if (var10.method976()) {
                    this.field2397.method1109(var10);
                }
            }
        }
        arg0.field2430.method1066(arg1, arg2, arg3);
    }

    @ObfuscatedName("eb.m(Ler;II)V")
    public void method2851(class145 arg0, int arg1) {
        if ((this.field2394.field2365[arg0.field2419] & 0x4) != 0 && arg0.field2426 < 0) {
            int var3 = this.field2394.field2369[arg0.field2419] / Statics.field1094;
            int var4 = (var3 + 1048575 - arg0.field2432) / var3;
            arg0.field2432 = arg0.field2432 + arg1 * var3 & 0xFFFFF;
            if (var4 <= arg1) {
                if (this.field2394.field2351[arg0.field2419] == 0) {
                    arg0.field2430 = class45.method959(arg0.field2414, arg0.field2430.method974(), arg0.field2430.method1073(), arg0.field2430.method966());
                } else {
                    arg0.field2430 = class45.method959(arg0.field2414, arg0.field2430.method974(), 0, arg0.field2430.method966());
                    this.field2394.method2848(arg0, arg0.field2412.field2342[arg0.field2417] < 0);
                }
                if (arg0.field2412.field2342[arg0.field2417] < 0) {
                    arg0.field2430.method961(-1);
                }
                arg1 = arg0.field2432 / var3;
            }
        }
        arg0.field2430.method981(arg1);
    }
}
