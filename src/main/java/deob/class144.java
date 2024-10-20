package deob;

@ObfuscatedName("ew")
public class class144 extends class48 {

    @ObfuscatedName("ew.c")
    public class142 field2437;

    @ObfuscatedName("ew.q")
    public class177 field2435 = new class177();

    @ObfuscatedName("ew.y")
    public class46 field2434 = new class46();

    public class144(class142 arg0) {
        this.field2437 = arg0;
    }

    @ObfuscatedName("ew.w()Lab;")
    public class48 method933() {
        class146 var1 = (class146) this.field2435.method3163();
        if (var1 == null) {
            return null;
        } else if (var1.field2464 == null) {
            return this.method974();
        } else {
            return var1.field2464;
        }
    }

    @ObfuscatedName("ew.e()Lab;")
    public class48 method974() {
        class146 var1;
        do {
            var1 = (class146) this.field2435.method3165();
            if (var1 == null) {
                return null;
            }
        } while (var1.field2464 == null);
        return var1.field2464;
    }

    @ObfuscatedName("ew.p()I")
    public int method935() {
        return 0;
    }

    @ObfuscatedName("ew.i([III)V")
    public void method976(int[] arg0, int arg1, int arg2) {
        this.field2434.method976(arg0, arg1, arg2);
        for (class146 var4 = (class146) this.field2435.method3163(); var4 != null; var4 = (class146) this.field2435.method3165()) {
            if (!this.field2437.method2642(var4)) {
                int var5 = arg1;
                int var6 = arg2;
                do {
                    if (var6 <= var4.field2474) {
                        this.method2749(var4, arg0, var5, var6, var5 + var6);
                        var4.field2474 -= var6;
                        break;
                    }
                    this.method2749(var4, arg0, var5, var4.field2474, var5 + var6);
                    var5 += var4.field2474;
                    var6 -= var4.field2474;
                } while (!this.field2437.method2669(var4, arg0, var5, var6));
            }
        }
    }

    @ObfuscatedName("ew.ap(I)V")
    public void method937(int arg0) {
        this.field2434.method937(arg0);
        for (class146 var2 = (class146) this.field2435.method3163(); var2 != null; var2 = (class146) this.field2435.method3165()) {
            if (!this.field2437.method2642(var2)) {
                int var3 = arg0;
                do {
                    if (var3 <= var2.field2474) {
                        this.method2750(var2, var3);
                        var2.field2474 -= var3;
                        break;
                    }
                    this.method2750(var2, var2.field2474);
                    var3 -= var2.field2474;
                } while (!this.field2437.method2669(var2, (int[]) null, 0, var3));
            }
        }
    }

    @ObfuscatedName("ew.c(Leh;[IIIIB)V")
    public void method2749(class146 arg0, int[] arg1, int arg2, int arg3, int arg4) {
        if ((this.field2437.field2395[arg0.field2462] & 0x4) != 0 && arg0.field2457 < 0) {
            int var6 = this.field2437.field2412[arg0.field2462] / Statics.field1118;
            while (true) {
                int var7 = (var6 + 1048575 - arg0.field2476) / var6;
                if (var7 > arg3) {
                    arg0.field2476 += arg3 * var6;
                    break;
                }
                arg0.field2464.method976(arg1, arg2, var7);
                arg2 += var7;
                arg3 -= var7;
                arg0.field2476 += var6 * var7 - 1048576;
                int var8 = Statics.field1118 / 100;
                int var9 = 262144 / var6;
                if (var9 < var8) {
                    var8 = var9;
                }
                class45 var10 = arg0.field2464;
                if (this.field2437.field2410[arg0.field2462] == 0) {
                    arg0.field2464 = class45.method915(arg0.field2466, var10.method930(), var10.method921(), var10.method922());
                } else {
                    arg0.field2464 = class45.method915(arg0.field2466, var10.method930(), 0, var10.method922());
                    this.field2437.method2672(arg0, arg0.field2456.field2387[arg0.field2460] < 0);
                    arg0.field2464.method1046(var8, var10.method921());
                }
                if (arg0.field2456.field2387[arg0.field2460] < 0) {
                    arg0.field2464.method917(-1);
                }
                var10.method928(var8);
                var10.method976(arg1, arg2, arg4 - arg2);
                if (var10.method932()) {
                    this.field2434.method1057(var10);
                }
            }
        }
        arg0.field2464.method976(arg1, arg2, arg3);
    }

    @ObfuscatedName("ew.q(Leh;II)V")
    public void method2750(class146 arg0, int arg1) {
        if ((this.field2437.field2395[arg0.field2462] & 0x4) != 0 && arg0.field2457 < 0) {
            int var3 = this.field2437.field2412[arg0.field2462] / Statics.field1118;
            int var4 = (var3 + 1048575 - arg0.field2476) / var3;
            arg0.field2476 = arg0.field2476 + arg1 * var3 & 0xFFFFF;
            if (var4 <= arg1) {
                if (this.field2437.field2410[arg0.field2462] == 0) {
                    arg0.field2464 = class45.method915(arg0.field2466, arg0.field2464.method930(), arg0.field2464.method921(), arg0.field2464.method922());
                } else {
                    arg0.field2464 = class45.method915(arg0.field2466, arg0.field2464.method930(), 0, arg0.field2464.method922());
                    this.field2437.method2672(arg0, arg0.field2456.field2387[arg0.field2460] < 0);
                }
                if (arg0.field2456.field2387[arg0.field2460] < 0) {
                    arg0.field2464.method917(-1);
                }
                arg1 = arg0.field2476 / var3;
            }
        }
        arg0.field2464.method937(arg1);
    }
}
