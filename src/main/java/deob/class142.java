package deob;

@ObfuscatedName("eo")
public class class142 extends class47 {

    @ObfuscatedName("eo.v")
    public class140 field2389;

    @ObfuscatedName("eo.f")
    public class176 field2386 = new class176();

    @ObfuscatedName("eo.n")
    public class45 field2385 = new class45();

    public class142(class140 arg0) {
        this.field2389 = arg0;
    }

    @ObfuscatedName("eo.x()Lag;")
    public class47 method962() {
        class144 var1 = (class144) this.field2386.method3294();
        if (var1 == null) {
            return null;
        } else if (var1.field2410 == null) {
            return this.method983();
        } else {
            return var1.field2410;
        }
    }

    @ObfuscatedName("eo.b()Lag;")
    public class47 method983() {
        class144 var1;
        do {
            var1 = (class144) this.field2386.method3296();
            if (var1 == null) {
                return null;
            }
        } while (var1.field2410 == null);
        return var1.field2410;
    }

    @ObfuscatedName("eo.w()I")
    public int method984() {
        return 0;
    }

    @ObfuscatedName("eo.y([III)V")
    public void method969(int[] arg0, int arg1, int arg2) {
        this.field2385.method969(arg0, arg1, arg2);
        for (class144 var4 = (class144) this.field2386.method3294(); var4 != null; var4 = (class144) this.field2386.method3296()) {
            if (!this.field2389.method2739(var4)) {
                int var5 = arg1;
                int var6 = arg2;
                do {
                    if (var6 <= var4.field2424) {
                        this.method2820(var4, arg0, var5, var6, var5 + var6);
                        var4.field2424 -= var6;
                        break;
                    }
                    this.method2820(var4, arg0, var5, var4.field2424, var5 + var6);
                    var5 += var4.field2424;
                    var6 -= var4.field2424;
                } while (!this.field2389.method2750(var4, arg0, var5, var6));
            }
        }
    }

    @ObfuscatedName("eo.au(I)V")
    public void method986(int arg0) {
        this.field2385.method986(arg0);
        for (class144 var2 = (class144) this.field2386.method3294(); var2 != null; var2 = (class144) this.field2386.method3296()) {
            if (!this.field2389.method2739(var2)) {
                int var3 = arg0;
                do {
                    if (var3 <= var2.field2424) {
                        this.method2819(var2, var3);
                        var2.field2424 -= var3;
                        break;
                    }
                    this.method2819(var2, var2.field2424);
                    var3 -= var2.field2424;
                } while (!this.field2389.method2750(var2, (int[]) null, 0, var3));
            }
        }
    }

    @ObfuscatedName("eo.v(Lex;[IIIIB)V")
    public void method2820(class144 arg0, int[] arg1, int arg2, int arg3, int arg4) {
        if ((this.field2389.field2356[arg0.field2422] & 0x4) != 0 && arg0.field2419 < 0) {
            int var6 = this.field2389.field2363[arg0.field2422] / Statics.field1076;
            while (true) {
                int var7 = (var6 + 1048575 - arg0.field2426) / var6;
                if (var7 > arg3) {
                    arg0.field2426 += arg3 * var6;
                    break;
                }
                arg0.field2410.method969(arg1, arg2, var7);
                arg2 += var7;
                arg3 -= var7;
                arg0.field2426 += var6 * var7 - 1048576;
                int var8 = Statics.field1076 / 100;
                int var9 = 262144 / var6;
                if (var9 < var8) {
                    var8 = var9;
                }
                class44 var10 = arg0.field2410;
                if (this.field2389.field2361[arg0.field2422] == 0) {
                    arg0.field2410 = class44.method1032(arg0.field2407, var10.method979(), var10.method970(), var10.method971());
                } else {
                    arg0.field2410 = class44.method1032(arg0.field2407, var10.method979(), 0, var10.method971());
                    this.field2389.method2732(arg0, arg0.field2406.field2345[arg0.field2420] < 0);
                    arg0.field2410.method975(var8, var10.method970());
                }
                if (arg0.field2406.field2345[arg0.field2420] < 0) {
                    arg0.field2410.method1101(-1);
                }
                var10.method977(var8);
                var10.method969(arg1, arg2, arg4 - arg2);
                if (var10.method981()) {
                    this.field2385.method1120(var10);
                }
            }
        }
        arg0.field2410.method969(arg1, arg2, arg3);
    }

    @ObfuscatedName("eo.f(Lex;II)V")
    public void method2819(class144 arg0, int arg1) {
        if ((this.field2389.field2356[arg0.field2422] & 0x4) != 0 && arg0.field2419 < 0) {
            int var3 = this.field2389.field2363[arg0.field2422] / Statics.field1076;
            int var4 = (var3 + 1048575 - arg0.field2426) / var3;
            arg0.field2426 = arg0.field2426 + arg1 * var3 & 0xFFFFF;
            if (var4 <= arg1) {
                if (this.field2389.field2361[arg0.field2422] == 0) {
                    arg0.field2410 = class44.method1032(arg0.field2407, arg0.field2410.method979(), arg0.field2410.method970(), arg0.field2410.method971());
                } else {
                    arg0.field2410 = class44.method1032(arg0.field2407, arg0.field2410.method979(), 0, arg0.field2410.method971());
                    this.field2389.method2732(arg0, arg0.field2406.field2345[arg0.field2420] < 0);
                }
                if (arg0.field2406.field2345[arg0.field2420] < 0) {
                    arg0.field2410.method1101(-1);
                }
                arg1 = arg0.field2426 / var3;
            }
        }
        arg0.field2410.method986(arg1);
    }
}
