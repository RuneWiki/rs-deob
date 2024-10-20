package deob;

@ObfuscatedName("gd")
public class class203 extends class116 {

    @ObfuscatedName("gd.c")
    public class199 field2461;

    @ObfuscatedName("gd.x")
    public class262 field2460 = new class262();

    @ObfuscatedName("gd.t")
    public class99 field2459 = new class99();

    public class203(class199 arg0) {
        this.field2461 = arg0;
    }

    @ObfuscatedName("gd.u()Ldg;")
    public class116 method2118() {
        class200 var1 = (class200) this.field2460.method4550();
        if (var1 == null) {
            return null;
        } else if (var1.field2430 == null) {
            return this.method2119();
        } else {
            return var1.field2430;
        }
    }

    @ObfuscatedName("gd.j()Ldg;")
    public class116 method2119() {
        class200 var1;
        do {
            var1 = (class200) this.field2460.method4573();
            if (var1 == null) {
                return null;
            }
        } while (var1.field2430 == null);
        return var1.field2430;
    }

    @ObfuscatedName("gd.v()I")
    public int method2120() {
        return 0;
    }

    @ObfuscatedName("gd.d([III)V")
    public void method2121(int[] arg0, int arg1, int arg2) {
        this.field2459.method2121(arg0, arg1, arg2);
        for (class200 var4 = (class200) this.field2460.method4550(); var4 != null; var4 = (class200) this.field2460.method4573()) {
            if (!this.field2461.method3444(var4)) {
                int var5 = arg1;
                int var6 = arg2;
                do {
                    if (var6 <= var4.field2431) {
                        this.method3597(var4, arg0, var5, var6, var5 + var6);
                        var4.field2431 -= var6;
                        break;
                    }
                    this.method3597(var4, arg0, var5, var4.field2431, var5 + var6);
                    var5 += var4.field2431;
                    var6 -= var4.field2431;
                } while (!this.field2461.method3445(var4, arg0, var5, var6));
            }
        }
    }

    @ObfuscatedName("gd.s(I)V")
    public void method2139(int arg0) {
        this.field2459.method2139(arg0);
        for (class200 var2 = (class200) this.field2460.method4550(); var2 != null; var2 = (class200) this.field2460.method4573()) {
            if (!this.field2461.method3444(var2)) {
                int var3 = arg0;
                do {
                    if (var3 <= var2.field2431) {
                        this.method3598(var2, var3);
                        var2.field2431 -= var3;
                        break;
                    }
                    this.method3598(var2, var2.field2431);
                    var3 -= var2.field2431;
                } while (!this.field2461.method3445(var2, (int[]) null, 0, var3));
            }
        }
    }

    @ObfuscatedName("gd.c(Lgs;[IIIII)V")
    public void method3597(class200 arg0, int[] arg1, int arg2, int arg3, int arg4) {
        if ((this.field2461.field2396[arg0.field2432] & 0x4) != 0 && arg0.field2426 < 0) {
            int var6 = this.field2461.field2401[arg0.field2432] / Statics.field29;
            while (true) {
                int var7 = (var6 + 1048575 - arg0.field2423) / var6;
                if (var7 > arg3) {
                    arg0.field2423 += arg3 * var6;
                    break;
                }
                arg0.field2430.method2121(arg1, arg2, var7);
                arg2 += var7;
                arg3 -= var7;
                arg0.field2423 += var6 * var7 - 1048576;
                int var8 = Statics.field29 / 100;
                int var9 = 262144 / var6;
                if (var9 < var8) {
                    var8 = var9;
                }
                class114 var10 = arg0.field2430;
                if (this.field2461.field2399[arg0.field2432] == 0) {
                    arg0.field2430 = class114.method2334(arg0.field2412, var10.method2415(), var10.method2340(), var10.method2341());
                } else {
                    arg0.field2430 = class114.method2334(arg0.field2412, var10.method2415(), 0, var10.method2341());
                    this.field2461.method3428(arg0, arg0.field2413.field2451[arg0.field2414] < 0);
                    arg0.field2430.method2344(var8, var10.method2340());
                }
                if (arg0.field2413.field2451[arg0.field2414] < 0) {
                    arg0.field2430.method2336(-1);
                }
                var10.method2359(var8);
                var10.method2121(arg1, arg2, arg4 - arg2);
                if (var10.method2417()) {
                    this.field2459.method2144(var10);
                }
            }
        }
        arg0.field2430.method2121(arg1, arg2, arg3);
    }

    @ObfuscatedName("gd.x(Lgs;IS)V")
    public void method3598(class200 arg0, int arg1) {
        if ((this.field2461.field2396[arg0.field2432] & 0x4) != 0 && arg0.field2426 < 0) {
            int var3 = this.field2461.field2401[arg0.field2432] / Statics.field29;
            int var4 = (var3 + 1048575 - arg0.field2423) / var3;
            arg0.field2423 = arg0.field2423 + arg1 * var3 & 0xFFFFF;
            if (var4 <= arg1) {
                if (this.field2461.field2399[arg0.field2432] == 0) {
                    arg0.field2430 = class114.method2334(arg0.field2412, arg0.field2430.method2415(), arg0.field2430.method2340(), arg0.field2430.method2341());
                } else {
                    arg0.field2430 = class114.method2334(arg0.field2412, arg0.field2430.method2415(), 0, arg0.field2430.method2341());
                    this.field2461.method3428(arg0, arg0.field2413.field2451[arg0.field2414] < 0);
                }
                if (arg0.field2413.field2451[arg0.field2414] < 0) {
                    arg0.field2430.method2336(-1);
                }
                arg1 = arg0.field2423 / var3;
            }
        }
        arg0.field2430.method2139(arg1);
    }
}
