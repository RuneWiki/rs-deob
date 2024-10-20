package deob;

@ObfuscatedName("hq")
public class class220 extends class114 {

    @ObfuscatedName("hq.m")
    public class216 field2590;

    @ObfuscatedName("hq.f")
    public class273 field2586 = new class273();

    @ObfuscatedName("hq.q")
    public class97 field2585 = new class97();

    public class220(class216 arg0) {
        this.field2590 = arg0;
    }

    @ObfuscatedName("hq.u()Ldc;")
    public class114 method2078() {
        class217 var1 = (class217) this.field2586.method4856();
        if (var1 == null) {
            return null;
        } else if (var1.field2558 == null) {
            return this.method2104();
        } else {
            return var1.field2558;
        }
    }

    @ObfuscatedName("hq.g()Ldc;")
    public class114 method2104() {
        class217 var1;
        do {
            var1 = (class217) this.field2586.method4858();
            if (var1 == null) {
                return null;
            }
        } while (var1.field2558 == null);
        return var1.field2558;
    }

    @ObfuscatedName("hq.l()I")
    public int method2080() {
        return 0;
    }

    @ObfuscatedName("hq.e([III)V")
    public void method2081(int[] arg0, int arg1, int arg2) {
        this.field2585.method2081(arg0, arg1, arg2);
        for (class217 var4 = (class217) this.field2586.method4856(); var4 != null; var4 = (class217) this.field2586.method4858()) {
            if (!this.field2590.method3819(var4)) {
                int var5 = arg1;
                int var6 = arg2;
                do {
                    if (var6 <= var4.field2556) {
                        this.method3977(var4, arg0, var5, var6, var5 + var6);
                        var4.field2556 -= var6;
                        break;
                    }
                    this.method3977(var4, arg0, var5, var4.field2556, var5 + var6);
                    var5 += var4.field2556;
                    var6 -= var4.field2556;
                } while (!this.field2590.method3852(var4, arg0, var5, var6));
            }
        }
    }

    @ObfuscatedName("hq.d(I)V")
    public void method2083(int arg0) {
        this.field2585.method2083(arg0);
        for (class217 var2 = (class217) this.field2586.method4856(); var2 != null; var2 = (class217) this.field2586.method4858()) {
            if (!this.field2590.method3819(var2)) {
                int var3 = arg0;
                do {
                    if (var3 <= var2.field2556) {
                        this.method3978(var2, var3);
                        var2.field2556 -= var3;
                        break;
                    }
                    this.method3978(var2, var2.field2556);
                    var3 -= var2.field2556;
                } while (!this.field2590.method3852(var2, (int[]) null, 0, var3));
            }
        }
    }

    @ObfuscatedName("hq.m(Lha;[IIIII)V")
    public void method3977(class217 arg0, int[] arg1, int arg2, int arg3, int arg4) {
        if ((this.field2590.field2523[arg0.field2545] & 0x4) != 0 && arg0.field2554 < 0) {
            int var6 = this.field2590.field2528[arg0.field2545] / Statics.field3803;
            while (true) {
                int var7 = (var6 + 1048575 - arg0.field2540) / var6;
                if (var7 > arg3) {
                    arg0.field2540 += arg3 * var6;
                    break;
                }
                arg0.field2558.method2081(arg1, arg2, var7);
                arg2 += var7;
                arg3 -= var7;
                arg0.field2540 += var6 * var7 - 1048576;
                int var8 = Statics.field3803 / 100;
                int var9 = 262144 / var6;
                if (var9 < var8) {
                    var8 = var9;
                }
                class112 var10 = arg0.field2558;
                if (this.field2590.field2526[arg0.field2545] == 0) {
                    arg0.field2558 = class112.method2305(arg0.field2542, var10.method2372(), var10.method2327(), var10.method2290());
                } else {
                    arg0.field2558 = class112.method2305(arg0.field2542, var10.method2372(), 0, var10.method2290());
                    this.field2590.method3812(arg0, arg0.field2541.field2581[arg0.field2559] < 0);
                    arg0.field2558.method2386(var8, var10.method2327());
                }
                if (arg0.field2541.field2581[arg0.field2559] < 0) {
                    arg0.field2558.method2308(-1);
                }
                var10.method2296(var8);
                var10.method2081(arg1, arg2, arg4 - arg2);
                if (var10.method2300()) {
                    this.field2585.method2095(var10);
                }
            }
        }
        arg0.field2558.method2081(arg1, arg2, arg3);
    }

    @ObfuscatedName("hq.f(Lha;II)V")
    public void method3978(class217 arg0, int arg1) {
        if ((this.field2590.field2523[arg0.field2545] & 0x4) != 0 && arg0.field2554 < 0) {
            int var3 = this.field2590.field2528[arg0.field2545] / Statics.field3803;
            int var4 = (var3 + 1048575 - arg0.field2540) / var3;
            arg0.field2540 = arg0.field2540 + arg1 * var3 & 0xFFFFF;
            if (var4 <= arg1) {
                if (this.field2590.field2526[arg0.field2545] == 0) {
                    arg0.field2558 = class112.method2305(arg0.field2542, arg0.field2558.method2372(), arg0.field2558.method2327(), arg0.field2558.method2290());
                } else {
                    arg0.field2558 = class112.method2305(arg0.field2542, arg0.field2558.method2372(), 0, arg0.field2558.method2290());
                    this.field2590.method3812(arg0, arg0.field2541.field2581[arg0.field2559] < 0);
                }
                if (arg0.field2541.field2581[arg0.field2559] < 0) {
                    arg0.field2558.method2308(-1);
                }
                arg1 = arg0.field2540 / var3;
            }
        }
        arg0.field2558.method2083(arg1);
    }
}
