package deob;

@ObfuscatedName("gq")
public class class187 extends class67 {

    @ObfuscatedName("gq.j")
    public class185 field3008;

    @ObfuscatedName("gq.h")
    public class200 field3007 = new class200();

    @ObfuscatedName("gq.m")
    public class56 field3009 = new class56();

    public class187(class185 arg0) {
        this.field3008 = arg0;
    }

    @ObfuscatedName("gq.e()Lbi;")
    public class67 method1124() {
        class188 var1 = (class188) this.field3007.method3540();
        if (var1 == null) {
            return null;
        } else if (var1.field3036 == null) {
            return this.method1125();
        } else {
            return var1.field3036;
        }
    }

    @ObfuscatedName("gq.i()Lbi;")
    public class67 method1125() {
        class188 var1;
        do {
            var1 = (class188) this.field3007.method3533();
            if (var1 == null) {
                return null;
            }
        } while (var1.field3036 == null);
        return var1.field3036;
    }

    @ObfuscatedName("gq.c()I")
    public int method1122() {
        return 0;
    }

    @ObfuscatedName("gq.n([III)V")
    public void method1148(int[] arg0, int arg1, int arg2) {
        this.field3009.method1148(arg0, arg1, arg2);
        for (class188 var4 = (class188) this.field3007.method3540(); var4 != null; var4 = (class188) this.field3007.method3533()) {
            if (!this.field3008.method3375(var4)) {
                int var5 = arg1;
                int var6 = arg2;
                do {
                    if (var6 <= var4.field3035) {
                        this.method3444(var4, arg0, var5, var6, var5 + var6);
                        var4.field3035 -= var6;
                        break;
                    }
                    this.method3444(var4, arg0, var5, var4.field3035, var5 + var6);
                    var5 += var4.field3035;
                    var6 -= var4.field3035;
                } while (!this.field3008.method3379(var4, arg0, var5, var6));
            }
        }
    }

    @ObfuscatedName("gq.u(I)V")
    public void method1145(int arg0) {
        this.field3009.method1145(arg0);
        for (class188 var2 = (class188) this.field3007.method3540(); var2 != null; var2 = (class188) this.field3007.method3533()) {
            if (!this.field3008.method3375(var2)) {
                int var3 = arg0;
                do {
                    if (var3 <= var2.field3035) {
                        this.method3445(var2, var3);
                        var2.field3035 -= var3;
                        break;
                    }
                    this.method3445(var2, var2.field3035);
                    var3 -= var2.field3035;
                } while (!this.field3008.method3379(var2, (int[]) null, 0, var3));
            }
        }
    }

    @ObfuscatedName("gq.j(Lgo;[IIIIS)V")
    public void method3444(class188 arg0, int[] arg1, int arg2, int arg3, int arg4) {
        if ((this.field3008.field2982[arg0.field3031] & 0x4) != 0 && arg0.field3027 < 0) {
            int var6 = this.field3008.field2987[arg0.field3031] / Statics.field1182;
            while (true) {
                int var7 = (var6 + 1048575 - arg0.field3033) / var6;
                if (var7 > arg3) {
                    arg0.field3033 += arg3 * var6;
                    break;
                }
                arg0.field3036.method1148(arg1, arg2, var7);
                arg2 += var7;
                arg3 -= var7;
                arg0.field3033 += var6 * var7 - 1048576;
                int var8 = Statics.field1182 / 100;
                int var9 = 262144 / var6;
                if (var9 < var8) {
                    var8 = var9;
                }
                class65 var10 = arg0.field3036;
                if (this.field3008.field2985[arg0.field3031] == 0) {
                    arg0.field3036 = class65.method1396(arg0.field3014, var10.method1280(), var10.method1271(), var10.method1298());
                } else {
                    arg0.field3036 = class65.method1396(arg0.field3014, var10.method1280(), 0, var10.method1298());
                    this.field3008.method3383(arg0, arg0.field3037.field2932[arg0.field3018] < 0);
                    arg0.field3036.method1276(var8, var10.method1271());
                }
                if (arg0.field3037.field2932[arg0.field3018] < 0) {
                    arg0.field3036.method1267(-1);
                }
                var10.method1293(var8);
                var10.method1148(arg1, arg2, arg4 - arg2);
                if (var10.method1282()) {
                    this.field3009.method1133(var10);
                }
            }
        }
        arg0.field3036.method1148(arg1, arg2, arg3);
    }

    @ObfuscatedName("gq.h(Lgo;II)V")
    public void method3445(class188 arg0, int arg1) {
        if ((this.field3008.field2982[arg0.field3031] & 0x4) != 0 && arg0.field3027 < 0) {
            int var3 = this.field3008.field2987[arg0.field3031] / Statics.field1182;
            int var4 = (var3 + 1048575 - arg0.field3033) / var3;
            arg0.field3033 = arg0.field3033 + arg1 * var3 & 0xFFFFF;
            if (var4 <= arg1) {
                if (this.field3008.field2985[arg0.field3031] == 0) {
                    arg0.field3036 = class65.method1396(arg0.field3014, arg0.field3036.method1280(), arg0.field3036.method1271(), arg0.field3036.method1298());
                } else {
                    arg0.field3036 = class65.method1396(arg0.field3014, arg0.field3036.method1280(), 0, arg0.field3036.method1298());
                    this.field3008.method3383(arg0, arg0.field3037.field2932[arg0.field3018] < 0);
                }
                if (arg0.field3037.field2932[arg0.field3018] < 0) {
                    arg0.field3036.method1267(-1);
                }
                arg1 = arg0.field3033 / var3;
            }
        }
        arg0.field3036.method1145(arg1);
    }
}
