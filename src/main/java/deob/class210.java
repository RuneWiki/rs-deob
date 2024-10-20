package deob;

@ObfuscatedName("he")
public class class210 extends class119 {

    @ObfuscatedName("he.i")
    public class206 field2596;

    @ObfuscatedName("he.j")
    public class195 field2594 = new class195();

    @ObfuscatedName("he.a")
    public class102 field2595 = new class102();

    public class210(class206 arg0) {
        this.field2596 = arg0;
    }

    @ObfuscatedName("he.n()Lds;")
    public class119 method1753() {
        class207 var1 = (class207) this.field2594.method3410();
        if (var1 == null) {
            return null;
        } else if (var1.field2562 == null) {
            return this.method1731();
        } else {
            return var1.field2562;
        }
    }

    @ObfuscatedName("he.q()Lds;")
    public class119 method1731() {
        class207 var1;
        do {
            var1 = (class207) this.field2594.method3412();
            if (var1 == null) {
                return null;
            }
        } while (var1.field2562 == null);
        return var1.field2562;
    }

    @ObfuscatedName("he.b()I")
    public int method1732() {
        return 0;
    }

    @ObfuscatedName("he.k([III)V")
    public void method1733(int[] arg0, int arg1, int arg2) {
        this.field2595.method1733(arg0, arg1, arg2);
        for (class207 var4 = (class207) this.field2594.method3410(); var4 != null; var4 = (class207) this.field2594.method3412()) {
            if (!this.field2596.method3533(var4)) {
                int var5 = arg1;
                int var6 = arg2;
                do {
                    if (var6 <= var4.field2543) {
                        this.method3657(var4, arg0, var5, var6, var5 + var6);
                        var4.field2543 -= var6;
                        break;
                    }
                    this.method3657(var4, arg0, var5, var4.field2543, var5 + var6);
                    var5 += var4.field2543;
                    var6 -= var4.field2543;
                } while (!this.field2596.method3534(var4, arg0, var5, var6));
            }
        }
    }

    @ObfuscatedName("he.d(I)V")
    public void method1742(int arg0) {
        this.field2595.method1742(arg0);
        for (class207 var2 = (class207) this.field2594.method3410(); var2 != null; var2 = (class207) this.field2594.method3412()) {
            if (!this.field2596.method3533(var2)) {
                int var3 = arg0;
                do {
                    if (var3 <= var2.field2543) {
                        this.method3658(var2, var3);
                        var2.field2543 -= var3;
                        break;
                    }
                    this.method3658(var2, var2.field2543);
                    var3 -= var2.field2543;
                } while (!this.field2596.method3534(var2, (int[]) null, 0, var3));
            }
        }
    }

    @ObfuscatedName("he.i(Lgr;[IIIII)V")
    public void method3657(class207 arg0, int[] arg1, int arg2, int arg3, int arg4) {
        if ((this.field2596.field2527[arg0.field2564] & 0x4) != 0 && arg0.field2561 < 0) {
            int var6 = this.field2596.field2540[arg0.field2564] / Statics.field899;
            while (true) {
                int var7 = (var6 + 1048575 - arg0.field2545) / var6;
                if (var7 > arg3) {
                    arg0.field2545 += arg3 * var6;
                    break;
                }
                arg0.field2562.method1733(arg1, arg2, var7);
                arg2 += var7;
                arg3 -= var7;
                arg0.field2545 += var6 * var7 - 1048576;
                int var8 = Statics.field899 / 100;
                int var9 = 262144 / var6;
                if (var9 < var8) {
                    var8 = var9;
                }
                class117 var10 = arg0.field2562;
                if (this.field2596.field2530[arg0.field2564] == 0) {
                    arg0.field2562 = class117.method1977(arg0.field2551, var10.method1971(), var10.method2044(), var10.method2032());
                } else {
                    arg0.field2562 = class117.method1977(arg0.field2551, var10.method1971(), 0, var10.method2032());
                    this.field2596.method3540(arg0, arg0.field2544.field2591[arg0.field2548] < 0);
                    arg0.field2562.method1967(var8, var10.method2044());
                }
                if (arg0.field2544.field2591[arg0.field2548] < 0) {
                    arg0.field2562.method1958(-1);
                }
                var10.method1978(var8);
                var10.method1733(arg1, arg2, arg4 - arg2);
                if (var10.method1973()) {
                    this.field2595.method1761(var10);
                }
            }
        }
        arg0.field2562.method1733(arg1, arg2, arg3);
    }

    @ObfuscatedName("he.j(Lgr;II)V")
    public void method3658(class207 arg0, int arg1) {
        if ((this.field2596.field2527[arg0.field2564] & 0x4) != 0 && arg0.field2561 < 0) {
            int var3 = this.field2596.field2540[arg0.field2564] / Statics.field899;
            int var4 = (var3 + 1048575 - arg0.field2545) / var3;
            arg0.field2545 = arg0.field2545 + arg1 * var3 & 0xFFFFF;
            if (var4 <= arg1) {
                if (this.field2596.field2530[arg0.field2564] == 0) {
                    arg0.field2562 = class117.method1977(arg0.field2551, arg0.field2562.method1971(), arg0.field2562.method2044(), arg0.field2562.method2032());
                } else {
                    arg0.field2562 = class117.method1977(arg0.field2551, arg0.field2562.method1971(), 0, arg0.field2562.method2032());
                    this.field2596.method3540(arg0, arg0.field2544.field2591[arg0.field2548] < 0);
                }
                if (arg0.field2544.field2591[arg0.field2548] < 0) {
                    arg0.field2562.method1958(-1);
                }
                arg1 = arg0.field2545 / var3;
            }
        }
        arg0.field2562.method1742(arg1);
    }
}
