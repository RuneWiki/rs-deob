package deob;

@ObfuscatedName("hl")
public class class220 extends class119 {

    @ObfuscatedName("hl.s")
    public class216 field2695;

    @ObfuscatedName("hl.g")
    public class205 field2697 = new class205();

    @ObfuscatedName("hl.m")
    public class102 field2696 = new class102();

    public class220(class216 arg0) {
        this.field2695 = arg0;
    }

    @ObfuscatedName("hl.w()Ldb;")
    public class119 method1984() {
        class217 var1 = (class217) this.field2697.method3752();
        if (var1 == null) {
            return null;
        } else if (var1.field2668 == null) {
            return this.method1985();
        } else {
            return var1.field2668;
        }
    }

    @ObfuscatedName("hl.t()Ldb;")
    public class119 method1985() {
        class217 var1;
        do {
            var1 = (class217) this.field2697.method3762();
            if (var1 == null) {
                return null;
            }
        } while (var1.field2668 == null);
        return var1.field2668;
    }

    @ObfuscatedName("hl.d()I")
    public int method1986() {
        return 0;
    }

    @ObfuscatedName("hl.z([III)V")
    public void method1999(int[] arg0, int arg1, int arg2) {
        this.field2696.method1999(arg0, arg1, arg2);
        for (class217 var4 = (class217) this.field2697.method3752(); var4 != null; var4 = (class217) this.field2697.method3762()) {
            if (!this.field2695.method3882(var4)) {
                int var5 = arg1;
                int var6 = arg2;
                do {
                    if (var6 <= var4.field2670) {
                        this.method4021(var4, arg0, var5, var6, var5 + var6);
                        var4.field2670 -= var6;
                        break;
                    }
                    this.method4021(var4, arg0, var5, var4.field2670, var5 + var6);
                    var5 += var4.field2670;
                    var6 -= var4.field2670;
                } while (!this.field2695.method3883(var4, arg0, var5, var6));
            }
        }
    }

    @ObfuscatedName("hl.c(I)V")
    public void method1989(int arg0) {
        this.field2696.method1989(arg0);
        for (class217 var2 = (class217) this.field2697.method3752(); var2 != null; var2 = (class217) this.field2697.method3762()) {
            if (!this.field2695.method3882(var2)) {
                int var3 = arg0;
                do {
                    if (var3 <= var2.field2670) {
                        this.method4017(var2, var3);
                        var2.field2670 -= var3;
                        break;
                    }
                    this.method4017(var2, var2.field2670);
                    var3 -= var2.field2670;
                } while (!this.field2695.method3883(var2, (int[]) null, 0, var3));
            }
        }
    }

    @ObfuscatedName("hl.s(Lhh;[IIIII)V")
    public void method4021(class217 arg0, int[] arg1, int arg2, int arg3, int arg4) {
        if ((this.field2695.field2628[arg0.field2650] & 0x4) != 0 && arg0.field2663 < 0) {
            int var6 = this.field2695.field2639[arg0.field2650] / Statics.field1562;
            while (true) {
                int var7 = (var6 + 1048575 - arg0.field2669) / var6;
                if (var7 > arg3) {
                    arg0.field2669 += arg3 * var6;
                    break;
                }
                arg0.field2668.method1999(arg1, arg2, var7);
                arg2 += var7;
                arg3 -= var7;
                arg0.field2669 += var6 * var7 - 1048576;
                int var8 = Statics.field1562 / 100;
                int var9 = 262144 / var6;
                if (var9 < var8) {
                    var8 = var9;
                }
                class117 var10 = arg0.field2668;
                if (this.field2695.field2637[arg0.field2650] == 0) {
                    arg0.field2668 = class117.method2225(arg0.field2660, var10.method2239(), var10.method2231(), var10.method2238());
                } else {
                    arg0.field2668 = class117.method2225(arg0.field2660, var10.method2239(), 0, var10.method2238());
                    this.field2695.method3864(arg0, arg0.field2656.field2687[arg0.field2654] < 0);
                    arg0.field2668.method2236(var8, var10.method2231());
                }
                if (arg0.field2656.field2687[arg0.field2654] < 0) {
                    arg0.field2668.method2227(-1);
                }
                var10.method2319(var8);
                var10.method1999(arg1, arg2, arg4 - arg2);
                if (var10.method2364()) {
                    this.field2696.method1992(var10);
                }
            }
        }
        arg0.field2668.method1999(arg1, arg2, arg3);
    }

    @ObfuscatedName("hl.g(Lhh;IB)V")
    public void method4017(class217 arg0, int arg1) {
        if ((this.field2695.field2628[arg0.field2650] & 0x4) != 0 && arg0.field2663 < 0) {
            int var3 = this.field2695.field2639[arg0.field2650] / Statics.field1562;
            int var4 = (var3 + 1048575 - arg0.field2669) / var3;
            arg0.field2669 = arg0.field2669 + arg1 * var3 & 0xFFFFF;
            if (var4 <= arg1) {
                if (this.field2695.field2637[arg0.field2650] == 0) {
                    arg0.field2668 = class117.method2225(arg0.field2660, arg0.field2668.method2239(), arg0.field2668.method2231(), arg0.field2668.method2238());
                } else {
                    arg0.field2668 = class117.method2225(arg0.field2660, arg0.field2668.method2239(), 0, arg0.field2668.method2238());
                    this.field2695.method3864(arg0, arg0.field2656.field2687[arg0.field2654] < 0);
                }
                if (arg0.field2656.field2687[arg0.field2654] < 0) {
                    arg0.field2668.method2227(-1);
                }
                arg1 = arg0.field2669 / var3;
            }
        }
        arg0.field2668.method1989(arg1);
    }
}
